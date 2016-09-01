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

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.CuentaContableConstantesFunciones;

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
public class CuentaContableDetalleFormJInternalFrame extends CuentaContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCuentaContable;
	
	protected JMenuBar jmenuBarDetalleCuentaContable;
	
	protected JMenu jmenuDetalleCuentaContable;
	protected JMenu jmenuDetalleArchivoCuentaContable;
	protected JMenu jmenuDetalleAccionesCuentaContable;
	protected JMenu jmenuDetalleDatosCuentaContable;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaContable;	
	protected GridBagConstraints gridBagConstraintsCuentaContable;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CuentaContableBeanSwingJInternalFrameAdditional jInternalFrameDetalleCuentaContable;		
	
	public CuentaContableBeanSwingJInternalFrameTree jInternalFrameTreeCuentaContable;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected NivelCuentaBeanSwingJInternalFrame nivelcuentaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_nivelcuenta="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoIntervaloBeanSwingJInternalFrame tipointervaloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipointervalo="";

	protected TipoFlujoEfectivoBeanSwingJInternalFrame tipoflujoefectivoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoflujoefectivo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontabledebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontabledebito="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public CuentaContableSessionBean cuentacontableSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public NivelCuentaSessionBean nivelcuentaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoIntervaloSessionBean tipointervaloSessionBean;
	public TipoFlujoEfectivoSessionBean tipoflujoefectivoSessionBean;
	public CuentaContableSessionBean cuentacontabledebitoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;	
	
	public CuentaContableLogic cuentacontableLogic;
	
	public JScrollPane jScrollPanelDatosCuentaContable;
	public JScrollPane jScrollPanelDatosEdicionCuentaContable;
	public JScrollPane jScrollPanelDatosGeneralCuentaContable;
	
	protected JPanel jPanelCamposCuentaContable;    
	protected JPanel jPanelCamposOcultosCuentaContable;    	
	protected JPanel jPanelAccionesCuentaContable;
	protected JPanel jPanelAccionesFormularioCuentaContable;
    
	
	
	protected JTabbedPane jTabbedPaneCamposCuentaContable;	
	protected Integer iXPanelCamposCuentaContable=0;
	protected Integer iYPanelCamposCuentaContable=0;
	
	protected Integer iXPanelCamposOcultosCuentaContable=0;
	protected Integer iYPanelCamposOcultosCuentaContable=0;
	
	

	protected JPanel jPanelCamposIniciogeneralCuentaContable;
	protected Integer iXPanelCamposIniciogeneralCuentaContable=0;
	protected Integer iYPanelCamposIniciogeneralCuentaContable=0;

	protected JPanel jPanelCamposIniciotipoCuentaContable;
	protected Integer iXPanelCamposIniciotipoCuentaContable=0;
	protected Integer iYPanelCamposIniciotipoCuentaContable=0;

	protected JPanel jPanelCamposIniciocontableCuentaContable;
	protected Integer iXPanelCamposIniciocontableCuentaContable=0;
	protected Integer iYPanelCamposIniciocontableCuentaContable=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCuentaContable;
	public JButton jButtonModificarCuentaContable;
	public JButton jButtonActualizarCuentaContable;
    public JButton jButtonEliminarCuentaContable;
	public JButton jButtonCancelarCuentaContable;
    public JButton jButtonGuardarCambiosCuentaContable;
	public JButton jButtonGuardarCambiosTablaCuentaContable;
	protected JButton jButtonCerrarCuentaContable;
	
	
	protected JButton jButtonProcesarInformacionCuentaContable;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCuentaContable;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCuentaContable;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCuentaContable;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaContable;
	protected JButton jButtonModificarToolBarCuentaContable;
	protected JButton jButtonActualizarToolBarCuentaContable;
    protected JButton jButtonEliminarToolBarCuentaContable;
	protected JButton jButtonCancelarToolBarCuentaContable;
    protected JButton jButtonGuardarCambiosToolBarCuentaContable;
	protected JButton jButtonGuardarCambiosTablaToolBarCuentaContable;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaContable;
	protected JButton jButtonCerrarToolBarCuentaContable;
	
	protected JButton jButtonProcesarInformacionToolBarCuentaContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaContable;
	protected JMenuItem jMenuItemModificarCuentaContable;
	protected JMenuItem jMenuItemActualizarCuentaContable;
    protected JMenuItem jMenuItemEliminarCuentaContable;
	protected JMenuItem jMenuItemCancelarCuentaContable;
    protected JMenuItem jMenuItemGuardarCambiosCuentaContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaContable;
	protected JMenuItem jMenuItemCerrarCuentaContable;
	protected JMenuItem jMenuItemDetalleCerrarCuentaContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaContable;
	
	protected JMenuItem jMenuItemProcesarInformacionCuentaContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaContable;
	protected JMenuItem jMenuItemMostrarOcultarCuentaContable;
	
	
	//MENU
	
	protected JButton jButtonArbolCuentaContable;	
	
	protected JLabel jLabelAccionesCuentaContable;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaContable;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCuentaContable;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCuentaContable;
	public JLabel jLabelIdCuentaContable;
	public JLabel jLabelidCuentaContable;
	public JButton jButtonidCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCuentaContable;
	public JLabel jLabelcodigoCuentaContable;
	public JTextField jTextFieldcodigoCuentaContable;
	public JButton jButtoncodigoCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelnombreCuentaContable;
	public JLabel jLabelnombreCuentaContable;
	public JTextArea jTextAreanombreCuentaContable;
	public JScrollPane jscrollPanenombreCuentaContable;
	public JButton jButtonnombreCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_extranjeroCuentaContable;
	public JLabel jLabelcodigo_extranjeroCuentaContable;
	public JTextField jTextFieldcodigo_extranjeroCuentaContable;
	public JButton jButtoncodigo_extranjeroCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelnombre_extranjeroCuentaContable;
	public JLabel jLabelnombre_extranjeroCuentaContable;
	public JTextArea jTextAreanombre_extranjeroCuentaContable;
	public JScrollPane jscrollPanenombre_extranjeroCuentaContable;
	public JButton jButtonnombre_extranjeroCuentaContableBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCuentaContable;
	public JLabel jLabeldescripcionCuentaContable;
	public JTextArea jTextAreadescripcionCuentaContable;
	public JScrollPane jscrollPanedescripcionCuentaContable;
	public JButton jButtondescripcionCuentaContableBusqueda= new JButtonMe();

	public JPanel jPaneles_movimientoCuentaContable;
	public JLabel jLabeles_movimientoCuentaContable;
	public JCheckBox jCheckBoxes_movimientoCuentaContable;
	public JButton jButtones_movimientoCuentaContableBusqueda= new JButtonMe();

	public JPanel jPaneles_centro_costoCuentaContable;
	public JLabel jLabeles_centro_costoCuentaContable;
	public JCheckBox jCheckBoxes_centro_costoCuentaContable;
	public JButton jButtones_centro_costoCuentaContableBusqueda= new JButtonMe();

	public JPanel jPaneles_centro_actividadCuentaContable;
	public JLabel jLabeles_centro_actividadCuentaContable;
	public JCheckBox jCheckBoxes_centro_actividadCuentaContable;
	public JButton jButtones_centro_actividadCuentaContableBusqueda= new JButtonMe();

	public JPanel jPaneles_activoCuentaContable;
	public JLabel jLabeles_activoCuentaContable;
	public JCheckBox jCheckBoxes_activoCuentaContable;
	public JButton jButtones_activoCuentaContableBusqueda= new JButtonMe();

	public JPanel jPaneles_relacionCuentaContable;
	public JLabel jLabeles_relacionCuentaContable;
	public JCheckBox jCheckBoxes_relacionCuentaContable;
	public JButton jButtones_relacionCuentaContableBusqueda= new JButtonMe();

	public JPanel jPaneles_para_f52CuentaContable;
	public JLabel jLabeles_para_f52CuentaContable;
	public JCheckBox jCheckBoxes_para_f52CuentaContable;
	public JButton jButtones_para_f52CuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelordenCuentaContable;
	public JLabel jLabelordenCuentaContable;
	public JTextField jTextFieldordenCuentaContable;
	public JButton jButtonordenCuentaContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCuentaContable;
	public JLabel jLabelid_empresaCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCuentaContable;
	public JButton jButtonid_empresaCuentaContable= new JButtonMe();
	public JButton jButtonid_empresaCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_empresaCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_nivel_cuentaCuentaContable;
	public JLabel jLabelid_nivel_cuentaCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_nivel_cuentaCuentaContable;
	public JButton jButtonid_nivel_cuentaCuentaContable= new JButtonMe();
	public JButton jButtonid_nivel_cuentaCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_nivel_cuentaCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableCuentaContable;
	public JLabel jLabelid_cuenta_contableCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableCuentaContable;
	public JButton jButtonid_cuenta_contableCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaContableArbol= new JButtonMe();

	public JPanel jPanelid_centro_costoCuentaContable;
	public JLabel jLabelid_centro_costoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoCuentaContable;
	public JButton jButtonid_centro_costoCuentaContable= new JButtonMe();
	public JButton jButtonid_centro_costoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoCuentaContableArbol= new JButtonMe();

	public JPanel jPanelid_moduloCuentaContable;
	public JLabel jLabelid_moduloCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloCuentaContable;
	public JButton jButtonid_moduloCuentaContable= new JButtonMe();
	public JButton jButtonid_moduloCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_moduloCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaCuentaContable;
	public JLabel jLabelid_monedaCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaCuentaContable;
	public JButton jButtonid_monedaCuentaContable= new JButtonMe();
	public JButton jButtonid_monedaCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_monedaCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_intervaloCuentaContable;
	public JLabel jLabelid_tipo_intervaloCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_intervaloCuentaContable;
	public JButton jButtonid_tipo_intervaloCuentaContable= new JButtonMe();
	public JButton jButtonid_tipo_intervaloCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_intervaloCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_flujo_efectivoCuentaContable;
	public JLabel jLabelid_tipo_flujo_efectivoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_flujo_efectivoCuentaContable;
	public JButton jButtonid_tipo_flujo_efectivoCuentaContable= new JButtonMe();
	public JButton jButtonid_tipo_flujo_efectivoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_flujo_efectivoCuentaContableBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_debitoCuentaContable;
	public JLabel jLabelid_cuenta_contable_debitoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_debitoCuentaContable;
	public JButton jButtonid_cuenta_contable_debitoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_debitoCuentaContableArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoCuentaContable;
	public JLabel jLabelid_cuenta_contable_creditoCuentaContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoCuentaContable;
	public JButton jButtonid_cuenta_contable_creditoCuentaContable= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoCuentaContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoCuentaContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoCuentaContableArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCuentaContable;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=945;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CuentaContableDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCuentaContable=new JPanel();
				this.jPanelAccionesFormularioCuentaContable=new JPanel();
				this.jmenuBarDetalleCuentaContable=new JMenuBar();
				this.jTtoolBarDetalleCuentaContable=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CuentaContableDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContableDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCuentaContable() {
		return this.jButtonActualizarToolBarCuentaContable;
	}
	
	public JButton getjButtonEliminarToolBarCuentaContable() {
		return this.jButtonEliminarToolBarCuentaContable;
	}
	
	public JButton getjButtonCancelarToolBarCuentaContable() {
		return this.jButtonCancelarToolBarCuentaContable;
	}		
	
	public JButton getjButtonProcesarInformacionCuentaContable() {
		return this.jButtonProcesarInformacionCuentaContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaContable)	{
		this.jButtonProcesarInformacionCuentaContable = jButtonProcesarInformacionCuentaContable;
	}
	
	
	public JButton getjButtonArbolCuentaContable() {
		return this.jButtonArbolCuentaContable;
	}
	
	public void setjButtonArbol(JButton jButtonArbolCuentaContable)	{
		this.jButtonArbolCuentaContable = jButtonArbolCuentaContable;
	}
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaContable() {
		return this.jComboBoxTiposAccionesCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaContable(
			JComboBox jComboBoxTiposRelacionesCuentaContable) {
		this.jComboBoxTiposRelacionesCuentaContable = jComboBoxTiposRelacionesCuentaContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaContable(
			JComboBox jComboBoxTiposAccionesCuentaContable) {
		this.jComboBoxTiposAccionesCuentaContable = jComboBoxTiposAccionesCuentaContable;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCuentaContable() {
		return this.jComboBoxTiposAccionesFormularioCuentaContable;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCuentaContable(
			JComboBox jComboBoxTiposAccionesFormularioCuentaContable) {
		this.jComboBoxTiposAccionesFormularioCuentaContable = jComboBoxTiposAccionesFormularioCuentaContable;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cuentacontableSessionBean=new CuentaContableSessionBean();
		
		this.cuentacontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentacontableSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Contable MANTENIMIENTO"));
		
		
		if(iWidth > 2350) {
			iWidth=2350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cuentacontableSessionBean.getEsGuardarRelacionado()) {
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
	
		CuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCuentaContable= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCuentaContable=new JButtonMe();
				this.jButtonModificarToolBarCuentaContable=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCuentaContable,this.jTtoolBarDetalleCuentaContable,
							"actualizar","actualizar","Actualizar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCuentaContable,this.jTtoolBarDetalleCuentaContable,
							"eliminar","eliminar","Eliminar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCuentaContable,this.jTtoolBarDetalleCuentaContable,
							"cancelar","cancelar","Cancelar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCuentaContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCuentaContable,this.jTtoolBarDetalleCuentaContable,
							"guardarcambios","guardarcambios","Guardar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCuentaContable=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCuentaContable=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCuentaContable=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCuentaContable=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCuentaContable=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCuentaContable= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCuentaContable.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCuentaContable,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCuentaContable= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCuentaContable.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCuentaContable,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCuentaContable= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCuentaContable.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCuentaContable,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCuentaContable= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCuentaContable.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCuentaContable,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCuentaContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCuentaContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCuentaContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCuentaContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCuentaContable.add(this.jMenuItemDetalleCerrarCuentaContable);
		
		this.jmenuDetalleAccionesCuentaContable.add(this.jMenuItemActualizarCuentaContable);
		this.jmenuDetalleAccionesCuentaContable.add(this.jMenuItemEliminarCuentaContable);
		this.jmenuDetalleAccionesCuentaContable.add(this.jMenuItemCancelarCuentaContable);		
		
		//this.jmenuDetalleDatosCuentaContable.add(this.jMenuItemDetalleAbrirOrderByCuentaContable);				
		this.jmenuDetalleDatosCuentaContable.add(this.jMenuItemDetalleMostarOcultarCuentaContable);				
				
		//this.jmenuDetalleAccionesCuentaContable.add(this.jMenuItemGuardarCambiosCuentaContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCuentaContable.add(this.jmenuDetalleArchivoCuentaContable);		
		this.jmenuBarDetalleCuentaContable.add(this.jmenuDetalleAccionesCuentaContable);		
		this.jmenuBarDetalleCuentaContable.add(this.jmenuDetalleDatosCuentaContable);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCuentaContable);				
	}
	
	
	public void inicializarElementosCamposCuentaContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCuentaContable = new JLabelMe();
		jLabelIdCuentaContable.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCuentaContable = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCuentaContable= new GridBagLayout();

		this.jPanelidCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);

		jLabelidCuentaContable = new JLabel();
		jLabelidCuentaContable.setText("Id");

		jLabelidCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCuentaContable = new JLabelMe();
		this.jLabelcodigoCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCuentaContable.setToolTipText("Codigo");
		this.jLabelcodigoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelcodigoCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jTextFieldcodigoCuentaContable= new JTextFieldMe();

		jTextFieldcodigoCuentaContable.setEnabled(false);
		jTextFieldcodigoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCuentaContableBusqueda= new JButtonMe();
		this.jButtoncodigoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCuentaContableBusqueda.setText("U");
		this.jButtoncodigoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCuentaContableBusqueda.setVisible(false);		}


					
		this.jLabelnombreCuentaContable = new JLabelMe();
		this.jLabelnombreCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCuentaContable.setToolTipText("Nombre");
		this.jLabelnombreCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelnombreCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jTextAreanombreCuentaContable= new JTextAreaMe();
		jTextAreanombreCuentaContable.setEnabled(false);
		jTextAreanombreCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCuentaContable.setLineWrap(true);
		jTextAreanombreCuentaContable.setWrapStyleWord(true);
		jTextAreanombreCuentaContable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCuentaContable.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCuentaContable = new JScrollPane(jTextAreanombreCuentaContable);
		jscrollPanenombreCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCuentaContableBusqueda= new JButtonMe();
		this.jButtonnombreCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCuentaContableBusqueda.setText("U");
		this.jButtonnombreCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCuentaContableBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_extranjeroCuentaContable = new JLabelMe();
		this.jLabelcodigo_extranjeroCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_CODIGOEXTRANJERO+" :");
		this.jLabelcodigo_extranjeroCuentaContable.setToolTipText("Codigo Extranjero");
		this.jLabelcodigo_extranjeroCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_extranjeroCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_extranjeroCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_extranjeroCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_extranjeroCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_extranjeroCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_CODIGOEXTRANJERO);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelcodigo_extranjeroCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jTextFieldcodigo_extranjeroCuentaContable= new JTextFieldMe();

		jTextFieldcodigo_extranjeroCuentaContable.setEnabled(false);
		jTextFieldcodigo_extranjeroCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_extranjeroCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_extranjeroCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_extranjeroCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_extranjeroCuentaContableBusqueda= new JButtonMe();
		this.jButtoncodigo_extranjeroCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_extranjeroCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_extranjeroCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_extranjeroCuentaContableBusqueda.setText("U");
		this.jButtoncodigo_extranjeroCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_extranjeroCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_extranjeroCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_extranjeroCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_extranjeroCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_extranjeroCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_extranjeroCuentaContableBusqueda.setVisible(false);		}


					
		this.jLabelnombre_extranjeroCuentaContable = new JLabelMe();
		this.jLabelnombre_extranjeroCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_NOMBREEXTRANJERO+" :");
		this.jLabelnombre_extranjeroCuentaContable.setToolTipText("Nombre Extranjero");
		this.jLabelnombre_extranjeroCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_extranjeroCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_extranjeroCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_extranjeroCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_extranjeroCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_extranjeroCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_NOMBREEXTRANJERO);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelnombre_extranjeroCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jTextAreanombre_extranjeroCuentaContable= new JTextAreaMe();
		jTextAreanombre_extranjeroCuentaContable.setEnabled(false);
		jTextAreanombre_extranjeroCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_extranjeroCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_extranjeroCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_extranjeroCuentaContable.setLineWrap(true);
		jTextAreanombre_extranjeroCuentaContable.setWrapStyleWord(true);
		jTextAreanombre_extranjeroCuentaContable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_extranjeroCuentaContable.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_extranjeroCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_extranjeroCuentaContable = new JScrollPane(jTextAreanombre_extranjeroCuentaContable);
		jscrollPanenombre_extranjeroCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_extranjeroCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_extranjeroCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_extranjeroCuentaContableBusqueda= new JButtonMe();
		this.jButtonnombre_extranjeroCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_extranjeroCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_extranjeroCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_extranjeroCuentaContableBusqueda.setText("U");
		this.jButtonnombre_extranjeroCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_extranjeroCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_extranjeroCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_extranjeroCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_extranjeroCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_extranjeroCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_extranjeroCuentaContableBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionCuentaContable = new JLabelMe();
		this.jLabeldescripcionCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionCuentaContable.setToolTipText("Descripcion");
		this.jLabeldescripcionCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPaneldescripcionCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jTextAreadescripcionCuentaContable= new JTextAreaMe();
		jTextAreadescripcionCuentaContable.setEnabled(false);
		jTextAreadescripcionCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCuentaContable.setLineWrap(true);
		jTextAreadescripcionCuentaContable.setWrapStyleWord(true);
		jTextAreadescripcionCuentaContable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionCuentaContable.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionCuentaContable = new JScrollPane(jTextAreadescripcionCuentaContable);
		jscrollPanedescripcionCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionCuentaContableBusqueda= new JButtonMe();
		this.jButtondescripcionCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCuentaContableBusqueda.setText("U");
		this.jButtondescripcionCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCuentaContableBusqueda.setVisible(false);		}


					
		this.jLabeles_movimientoCuentaContable = new JLabelMe();
		this.jLabeles_movimientoCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_ESMOVIMIENTO+" : *");
		this.jLabeles_movimientoCuentaContable.setToolTipText("Es Movimiento");
		this.jLabeles_movimientoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_movimientoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_movimientoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_movimientoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_movimientoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_movimientoCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_ESMOVIMIENTO);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPaneles_movimientoCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jCheckBoxes_movimientoCuentaContable= new JCheckBoxMe();
		jCheckBoxes_movimientoCuentaContable.setEnabled(false);

		jCheckBoxes_movimientoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_movimientoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_movimientoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_movimientoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_movimientoCuentaContableBusqueda= new JButtonMe();
		this.jButtones_movimientoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_movimientoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_movimientoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_movimientoCuentaContableBusqueda.setText("U");
		this.jButtones_movimientoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_movimientoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_movimientoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_movimientoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_movimientoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_movimientoCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_movimientoCuentaContableBusqueda.setVisible(false);		}


					
		this.jLabeles_centro_costoCuentaContable = new JLabelMe();
		this.jLabeles_centro_costoCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_ESCENTROCOSTO+" : *");
		this.jLabeles_centro_costoCuentaContable.setToolTipText("Es Centro Costo");
		this.jLabeles_centro_costoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_centro_costoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_centro_costoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_centro_costoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_centro_costoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_centro_costoCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_ESCENTROCOSTO);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPaneles_centro_costoCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jCheckBoxes_centro_costoCuentaContable= new JCheckBoxMe();
		jCheckBoxes_centro_costoCuentaContable.setEnabled(false);

		jCheckBoxes_centro_costoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_centro_costoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_centro_costoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_centro_costoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_centro_costoCuentaContableBusqueda= new JButtonMe();
		this.jButtones_centro_costoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_centro_costoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_centro_costoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_centro_costoCuentaContableBusqueda.setText("U");
		this.jButtones_centro_costoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_centro_costoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_centro_costoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_centro_costoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_centro_costoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_centro_costoCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_centro_costoCuentaContableBusqueda.setVisible(false);		}


					
		this.jLabeles_centro_actividadCuentaContable = new JLabelMe();
		this.jLabeles_centro_actividadCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_ESCENTROACTIVIDAD+" : *");
		this.jLabeles_centro_actividadCuentaContable.setToolTipText("Es Centro Actividad");
		this.jLabeles_centro_actividadCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_centro_actividadCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_centro_actividadCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_centro_actividadCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_centro_actividadCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_centro_actividadCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_ESCENTROACTIVIDAD);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPaneles_centro_actividadCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jCheckBoxes_centro_actividadCuentaContable= new JCheckBoxMe();
		jCheckBoxes_centro_actividadCuentaContable.setEnabled(false);

		jCheckBoxes_centro_actividadCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_centro_actividadCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_centro_actividadCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_centro_actividadCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_centro_actividadCuentaContableBusqueda= new JButtonMe();
		this.jButtones_centro_actividadCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_centro_actividadCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_centro_actividadCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_centro_actividadCuentaContableBusqueda.setText("U");
		this.jButtones_centro_actividadCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_centro_actividadCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_centro_actividadCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_centro_actividadCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_centro_actividadCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_centro_actividadCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_centro_actividadCuentaContableBusqueda.setVisible(false);		}


					
		this.jLabeles_activoCuentaContable = new JLabelMe();
		this.jLabeles_activoCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabeles_activoCuentaContable.setToolTipText("Es Activo");
		this.jLabeles_activoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_activoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_activoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_activoCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPaneles_activoCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jCheckBoxes_activoCuentaContable= new JCheckBoxMe();
		jCheckBoxes_activoCuentaContable.setEnabled(false);

		jCheckBoxes_activoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_activoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_activoCuentaContableBusqueda= new JButtonMe();
		this.jButtones_activoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_activoCuentaContableBusqueda.setText("U");
		this.jButtones_activoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_activoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_activoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_activoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_activoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_activoCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_activoCuentaContableBusqueda.setVisible(false);		}


					
		this.jLabeles_relacionCuentaContable = new JLabelMe();
		this.jLabeles_relacionCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_ESRELACION+" : *");
		this.jLabeles_relacionCuentaContable.setToolTipText("Es Relacion");
		this.jLabeles_relacionCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_relacionCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_relacionCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_relacionCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_relacionCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_relacionCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_ESRELACION);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPaneles_relacionCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jCheckBoxes_relacionCuentaContable= new JCheckBoxMe();
		jCheckBoxes_relacionCuentaContable.setEnabled(false);

		jCheckBoxes_relacionCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_relacionCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_relacionCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_relacionCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_relacionCuentaContableBusqueda= new JButtonMe();
		this.jButtones_relacionCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_relacionCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_relacionCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_relacionCuentaContableBusqueda.setText("U");
		this.jButtones_relacionCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_relacionCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_relacionCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_relacionCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_relacionCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_relacionCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_relacionCuentaContableBusqueda.setVisible(false);		}


					
		this.jLabeles_para_f52CuentaContable = new JLabelMe();
		this.jLabeles_para_f52CuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_ESPARAF52+" : *");
		this.jLabeles_para_f52CuentaContable.setToolTipText("Es Para F52");
		this.jLabeles_para_f52CuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_para_f52CuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_para_f52CuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_para_f52CuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_para_f52CuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_para_f52CuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_ESPARAF52);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPaneles_para_f52CuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jCheckBoxes_para_f52CuentaContable= new JCheckBoxMe();
		jCheckBoxes_para_f52CuentaContable.setEnabled(false);

		jCheckBoxes_para_f52CuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_f52CuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_f52CuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_para_f52CuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_para_f52CuentaContableBusqueda= new JButtonMe();
		this.jButtones_para_f52CuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_para_f52CuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_para_f52CuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_para_f52CuentaContableBusqueda.setText("U");
		this.jButtones_para_f52CuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_para_f52CuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_para_f52CuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_para_f52CuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_para_f52CuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_para_f52CuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_para_f52CuentaContableBusqueda.setVisible(false);		}


					
		this.jLabelordenCuentaContable = new JLabelMe();
		this.jLabelordenCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenCuentaContable.setToolTipText("Orden");
		this.jLabelordenCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelordenCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jTextFieldordenCuentaContable= new JTextFieldMe();
		jTextFieldordenCuentaContable.setEnabled(false);
		jTextFieldordenCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenCuentaContable.setText("0");

		this.jButtonordenCuentaContableBusqueda= new JButtonMe();
		this.jButtonordenCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenCuentaContableBusqueda.setText("U");
		this.jButtonordenCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenCuentaContableBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCuentaContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCuentaContable = new JLabelMe();
		this.jLabelid_empresaCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCuentaContable.setToolTipText("Empresa");
		this.jLabelid_empresaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelid_empresaCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jComboBoxid_empresaCuentaContable= new JComboBoxMe();
		jComboBoxid_empresaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCuentaContable.setEnabled(false);

		this.jButtonid_empresaCuentaContable= new JButtonMe();
		this.jButtonid_empresaCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaContable.setText("Buscar");
		this.jButtonid_empresaCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaContable"));

		this.jButtonid_empresaCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_empresaCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaContableBusqueda.setText("U");
		this.jButtonid_empresaCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_empresaCuentaContableUpdate= new JButtonMe();
		this.jButtonid_empresaCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaContableUpdate.setText("U");
		this.jButtonid_empresaCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaContableUpdate"));



					
		this.jLabelid_nivel_cuentaCuentaContable = new JLabelMe();
		this.jLabelid_nivel_cuentaCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_IDNIVELCUENTA+" : *");
		this.jLabelid_nivel_cuentaCuentaContable.setToolTipText("Nivel Cuenta");
		this.jLabelid_nivel_cuentaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_nivel_cuentaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_nivel_cuentaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_nivel_cuentaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_nivel_cuentaCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_nivel_cuentaCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_IDNIVELCUENTA);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelid_nivel_cuentaCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jComboBoxid_nivel_cuentaCuentaContable= new JComboBoxMe();
		jComboBoxid_nivel_cuentaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_cuentaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nivel_cuentaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_nivel_cuentaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_nivel_cuentaCuentaContable= new JButtonMe();
		this.jButtonid_nivel_cuentaCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nivel_cuentaCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nivel_cuentaCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nivel_cuentaCuentaContable.setText("Buscar");
		this.jButtonid_nivel_cuentaCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_nivel_cuentaCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nivel_cuentaCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_nivel_cuentaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nivel_cuentaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_cuentaCuentaContable"));

		this.jButtonid_nivel_cuentaCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_nivel_cuentaCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_cuentaCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_cuentaCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_nivel_cuentaCuentaContableBusqueda.setText("U");
		this.jButtonid_nivel_cuentaCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_nivel_cuentaCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nivel_cuentaCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_nivel_cuentaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nivel_cuentaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_cuentaCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_nivel_cuentaCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_nivel_cuentaCuentaContableUpdate= new JButtonMe();
		this.jButtonid_nivel_cuentaCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_cuentaCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nivel_cuentaCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_nivel_cuentaCuentaContableUpdate.setText("U");
		this.jButtonid_nivel_cuentaCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_nivel_cuentaCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nivel_cuentaCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_nivel_cuentaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nivel_cuentaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nivel_cuentaCuentaContableUpdate"));



					
		this.jLabelid_cuenta_contableCuentaContable = new JLabelMe();
		this.jLabelid_cuenta_contableCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE+" :");
		this.jLabelid_cuenta_contableCuentaContable.setToolTipText("Cuenta Contable Padre");
		this.jLabelid_cuenta_contableCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contableCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contableCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelid_cuenta_contableCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jComboBoxid_cuenta_contableCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contableCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableCuentaContable= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaContable.setText("Buscar");
		this.jButtonid_cuenta_contableCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaContable"));

		this.jButtonid_cuenta_contableCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaContableBusqueda.setText("U");
		this.jButtonid_cuenta_contableCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableCuentaContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaContableUpdate.setText("U");
		this.jButtonid_cuenta_contableCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaContableUpdate"));


		jButtonid_cuenta_contableCuentaContableArbol= new JButtonMe();
		jButtonid_cuenta_contableCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaContableArbol.setText("Arbol");
		jButtonid_cuenta_contableCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaContableArbol"));



					
		this.jLabelid_centro_costoCuentaContable = new JLabelMe();
		this.jLabelid_centro_costoCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoCuentaContable.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelid_centro_costoCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jComboBoxid_centro_costoCuentaContable= new JComboBoxMe();
		jComboBoxid_centro_costoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoCuentaContable= new JButtonMe();
		this.jButtonid_centro_costoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoCuentaContable.setText("Buscar");
		this.jButtonid_centro_costoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCuentaContable"));

		this.jButtonid_centro_costoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_centro_costoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoCuentaContableBusqueda.setText("U");
		this.jButtonid_centro_costoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_centro_costoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoCuentaContableUpdate.setText("U");
		this.jButtonid_centro_costoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCuentaContableUpdate"));


		jButtonid_centro_costoCuentaContableArbol= new JButtonMe();
		jButtonid_centro_costoCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoCuentaContableArbol.setText("Arbol");
		jButtonid_centro_costoCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoCuentaContableArbol"));



					
		this.jLabelid_moduloCuentaContable = new JLabelMe();
		this.jLabelid_moduloCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloCuentaContable.setToolTipText("Modulo");
		this.jLabelid_moduloCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelid_moduloCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jComboBoxid_moduloCuentaContable= new JComboBoxMe();
		jComboBoxid_moduloCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloCuentaContable= new JButtonMe();
		this.jButtonid_moduloCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloCuentaContable.setText("Buscar");
		this.jButtonid_moduloCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloCuentaContable"));

		this.jButtonid_moduloCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_moduloCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloCuentaContableBusqueda.setText("U");
		this.jButtonid_moduloCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_moduloCuentaContableUpdate= new JButtonMe();
		this.jButtonid_moduloCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloCuentaContableUpdate.setText("U");
		this.jButtonid_moduloCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloCuentaContableUpdate"));



					
		this.jLabelid_monedaCuentaContable = new JLabelMe();
		this.jLabelid_monedaCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaCuentaContable.setToolTipText("Moneda");
		this.jLabelid_monedaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelid_monedaCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jComboBoxid_monedaCuentaContable= new JComboBoxMe();
		jComboBoxid_monedaCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaCuentaContable= new JButtonMe();
		this.jButtonid_monedaCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaCuentaContable.setText("Buscar");
		this.jButtonid_monedaCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaCuentaContable"));

		this.jButtonid_monedaCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_monedaCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaCuentaContableBusqueda.setText("U");
		this.jButtonid_monedaCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_monedaCuentaContableUpdate= new JButtonMe();
		this.jButtonid_monedaCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaCuentaContableUpdate.setText("U");
		this.jButtonid_monedaCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaCuentaContableUpdate"));



					
		this.jLabelid_tipo_intervaloCuentaContable = new JLabelMe();
		this.jLabelid_tipo_intervaloCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_IDTIPOINTERVALO+" : *");
		this.jLabelid_tipo_intervaloCuentaContable.setToolTipText("Tipo Intervalo");
		this.jLabelid_tipo_intervaloCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_intervaloCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_intervaloCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_intervaloCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_intervaloCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_intervaloCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_IDTIPOINTERVALO);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelid_tipo_intervaloCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jComboBoxid_tipo_intervaloCuentaContable= new JComboBoxMe();
		jComboBoxid_tipo_intervaloCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_intervaloCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_intervaloCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_intervaloCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_intervaloCuentaContable= new JButtonMe();
		this.jButtonid_tipo_intervaloCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_intervaloCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_intervaloCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_intervaloCuentaContable.setText("Buscar");
		this.jButtonid_tipo_intervaloCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_intervaloCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_intervaloCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_intervaloCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_intervaloCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_intervaloCuentaContable"));

		this.jButtonid_tipo_intervaloCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_tipo_intervaloCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_intervaloCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_intervaloCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_intervaloCuentaContableBusqueda.setText("U");
		this.jButtonid_tipo_intervaloCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_intervaloCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_intervaloCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_intervaloCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_intervaloCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_intervaloCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_intervaloCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_tipo_intervaloCuentaContableUpdate= new JButtonMe();
		this.jButtonid_tipo_intervaloCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_intervaloCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_intervaloCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_intervaloCuentaContableUpdate.setText("U");
		this.jButtonid_tipo_intervaloCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_intervaloCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_intervaloCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_intervaloCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_intervaloCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_intervaloCuentaContableUpdate"));



					
		this.jLabelid_tipo_flujo_efectivoCuentaContable = new JLabelMe();
		this.jLabelid_tipo_flujo_efectivoCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_IDTIPOFLUJOEFECTIVO+" : *");
		this.jLabelid_tipo_flujo_efectivoCuentaContable.setToolTipText("T Flujo Efectivo");
		this.jLabelid_tipo_flujo_efectivoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_flujo_efectivoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_flujo_efectivoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_flujo_efectivoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_flujo_efectivoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_flujo_efectivoCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_IDTIPOFLUJOEFECTIVO);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelid_tipo_flujo_efectivoCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jComboBoxid_tipo_flujo_efectivoCuentaContable= new JComboBoxMe();
		jComboBoxid_tipo_flujo_efectivoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_flujo_efectivoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_flujo_efectivoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_flujo_efectivoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_flujo_efectivoCuentaContable= new JButtonMe();
		this.jButtonid_tipo_flujo_efectivoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_flujo_efectivoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_flujo_efectivoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_flujo_efectivoCuentaContable.setText("Buscar");
		this.jButtonid_tipo_flujo_efectivoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_flujo_efectivoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_flujo_efectivoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_flujo_efectivoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_flujo_efectivoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_flujo_efectivoCuentaContable"));

		this.jButtonid_tipo_flujo_efectivoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_tipo_flujo_efectivoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_flujo_efectivoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_flujo_efectivoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_flujo_efectivoCuentaContableBusqueda.setText("U");
		this.jButtonid_tipo_flujo_efectivoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_flujo_efectivoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_flujo_efectivoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_flujo_efectivoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_flujo_efectivoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_flujo_efectivoCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_flujo_efectivoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_tipo_flujo_efectivoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_tipo_flujo_efectivoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_flujo_efectivoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_flujo_efectivoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_flujo_efectivoCuentaContableUpdate.setText("U");
		this.jButtonid_tipo_flujo_efectivoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_flujo_efectivoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_flujo_efectivoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_flujo_efectivoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_flujo_efectivoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_flujo_efectivoCuentaContableUpdate"));



					
		this.jLabelid_cuenta_contable_debitoCuentaContable = new JLabelMe();
		this.jLabelid_cuenta_contable_debitoCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO+" : *");
		this.jLabelid_cuenta_contable_debitoCuentaContable.setToolTipText("Cuenta C. Debito");
		this.jLabelid_cuenta_contable_debitoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_debitoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_debitoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_debitoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_debitoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_debitoCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLEDEBITO);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelid_cuenta_contable_debitoCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jComboBoxid_cuenta_contable_debitoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_debitoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_debitoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_debitoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_debitoCuentaContable= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_debitoCuentaContable.setText("Buscar");
		this.jButtonid_cuenta_contable_debitoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_debitoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_debitoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoCuentaContable"));

		this.jButtonid_cuenta_contable_debitoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoCuentaContableBusqueda.setText("U");
		this.jButtonid_cuenta_contable_debitoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_debitoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_debitoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_debitoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_debitoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_debitoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_debitoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_debitoCuentaContableUpdate.setText("U");
		this.jButtonid_cuenta_contable_debitoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_debitoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_debitoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoCuentaContableUpdate"));


		jButtonid_cuenta_contable_debitoCuentaContableArbol= new JButtonMe();
		jButtonid_cuenta_contable_debitoCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_debitoCuentaContableArbol.setText("Arbol");
		jButtonid_cuenta_contable_debitoCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_debitoCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_debitoCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_debitoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_debitoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_debitoCuentaContableArbol"));



					
		this.jLabelid_cuenta_contable_creditoCuentaContable = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoCuentaContable.setText(""+CuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoCuentaContable.setToolTipText("Cuenta C. Credito");
		this.jLabelid_cuenta_contable_creditoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_creditoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_creditoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoCuentaContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoCuentaContable.setToolTipText(CuentaContableConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutCuentaContable = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoCuentaContable.setLayout(this.gridaBagLayoutCuentaContable);


		jComboBoxid_cuenta_contable_creditoCuentaContable= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoCuentaContable= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoCuentaContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoCuentaContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoCuentaContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoCuentaContable.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoCuentaContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoCuentaContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoCuentaContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoCuentaContable"));

		this.jButtonid_cuenta_contable_creditoCuentaContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoCuentaContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoCuentaContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoCuentaContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoCuentaContableBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoCuentaContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoCuentaContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoCuentaContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoCuentaContableBusqueda"));

		if(this.cuentacontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoCuentaContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoCuentaContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoCuentaContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoCuentaContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoCuentaContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoCuentaContableUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoCuentaContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoCuentaContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoCuentaContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoCuentaContableUpdate"));


		jButtonid_cuenta_contable_creditoCuentaContableArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoCuentaContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoCuentaContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoCuentaContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoCuentaContableArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoCuentaContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoCuentaContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoCuentaContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoCuentaContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoCuentaContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoCuentaContableArbol"));



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
		//this.jInternalFrameDetalleCuentaContable = new CuentaContableBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cuenta Contable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaContable= new GridBagLayout();
		

		
		String sToolTipCuentaContable="";
		sToolTipCuentaContable=CuentaContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaContable+="(Contabilidad.CuentaContable)";
		}
		
		if(!this.cuentacontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaContable+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCuentaContable = new JButtonMe();
		this.jButtonModificarCuentaContable = new JButtonMe();
        this.jButtonActualizarCuentaContable = new JButtonMe();
        this.jButtonEliminarCuentaContable = new JButtonMe();
        this.jButtonCancelarCuentaContable = new JButtonMe();
        this.jButtonGuardarCambiosCuentaContable = new JButtonMe();
		this.jButtonGuardarCambiosTablaCuentaContable = new JButtonMe();
		this.jButtonCerrarCuentaContable = new JButtonMe();
		
		this.jScrollPanelDatosCuentaContable = new JScrollPane();   
        this.jScrollPanelDatosEdicionCuentaContable = new JScrollPane();
		this.jScrollPanelDatosGeneralCuentaContable = new JScrollPane();
				
		
		
		this.jPanelCamposCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposCuentaContable=new JTabbedPane();
		
		
		this.jTabbedPaneCamposCuentaContable.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotipoCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontableCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Contable";
		
		if(!this.cuentacontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCuentaContable.setName("jPanelCamposCuentaContable"); 

		this.jPanelCamposOcultosCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCuentaContable.setName("jPanelCamposOcultosCuentaContable"); 

        this.jPanelAccionesCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaContable.setToolTipText("Acciones");
        this.jPanelAccionesCuentaContable.setName("Acciones"); 

		this.jPanelAccionesFormularioCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCuentaContable.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCuentaContable.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralCuentaContable.setName("jPanelCamposFingeneralCuentaContable");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotipoCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));
		this.jPanelCamposIniciotipoCuentaContable.setName("jPanelCamposFintipoCuentaContable");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotipoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontableCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableCuentaContable.setName("jPanelCamposFincontableCuentaContable");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCuentaContable.setText("Nuevo");
		this.jButtonModificarCuentaContable.setText("Editar");
        this.jButtonActualizarCuentaContable.setText("Actualizar");
        this.jButtonEliminarCuentaContable.setText("Eliminar");
        this.jButtonCancelarCuentaContable.setText("Cancelar");
        this.jButtonGuardarCambiosCuentaContable.setText("Guardar");
		this.jButtonGuardarCambiosTablaCuentaContable.setText("Guardar");
		this.jButtonCerrarCuentaContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaContable,"nuevo_button","Nuevo",this.cuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCuentaContable,"modificar_button","Editar",this.cuentacontableSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCuentaContable,"actualizar_button","Actualizar",this.cuentacontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCuentaContable,"eliminar_button","Eliminar",this.cuentacontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCuentaContable,"cancelar_button","Cancelar",this.cuentacontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCuentaContable,"guardarcambios_button","Guardar",this.cuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaContable,"guardarcambiostabla_button","Guardar",this.cuentacontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaContable,"cerrar_button","Salir",this.cuentacontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCuentaContable.setToolTipText("Nuevo"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCuentaContable.setToolTipText("Editar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCuentaContable.setToolTipText("Actualizar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCuentaContable.setToolTipText("Eliminar)"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCuentaContable.setToolTipText("Cancelar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCuentaContable.setToolTipText("Guardar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCuentaContable.setToolTipText("Guardar"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaContable.setToolTipText("Salir"+" "+CuentaContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaContable";
		inputMap = this.jButtonNuevoCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaContable"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCuentaContable";
		inputMap = this.jButtonActualizarCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCuentaContable"));
		
		//ELIMINAR
		sMapKey = "EliminarCuentaContable";
		inputMap = this.jButtonEliminarCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCuentaContable"));
		
		//CANCELAR	
		sMapKey = "CancelarCuentaContable";
		inputMap = this.jButtonCancelarCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCuentaContable"));
		
		//CERRAR		
		sMapKey = "CerrarCuentaContable";
		inputMap = this.jButtonCerrarCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaContable";
		inputMap = this.jButtonGuardarCambiosTablaCuentaContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaContable"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCuentaContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCuentaContable.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCuentaContable.setToolTipText("Nuevo CuentaContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCuentaContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCuentaContable.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCuentaContable.setToolTipText("Sin Cerrar Ventana CuentaContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCuentaContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCuentaContable.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCuentaContable.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
		this.jButtonArbolCuentaContable = new JButtonMe();
		this.jButtonArbolCuentaContable.setText("Arbol");		
		this.jButtonArbolCuentaContable.setToolTipText("Buscar Por Arbol");
				
		
			
			
		this.jComboBoxTiposAccionesCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaContable.setText("Accion");
		this.jComboBoxTiposAccionesCuentaContable.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCuentaContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCuentaContable.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCuentaContable.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCuentaContable = new JLabelMe();
		
		this.jLabelAccionesCuentaContable.setText("Acciones");		
		this.jLabelAccionesCuentaContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCuentaContable();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCuentaContable();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCuentaContable=new JTabbedPane();
		this.jTabbedPaneRelacionesCuentaContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCuentaContable,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		this.jButtonArbolCuentaContable.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolCuentaContable.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolCuentaContable.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposAccionesCuentaContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCuentaContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaContable.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCuentaContable, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCuentaContable = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCuentaContable = new GridBagLayout();
		
		this.jPanelCamposCuentaContable.setLayout(gridaBagLayoutCamposCuentaContable);
		this.jPanelCamposOcultosCuentaContable.setLayout(gridaBagLayoutCamposOcultosCuentaContable);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralCuentaContable= new GridBagLayout();
		this.jPanelCamposIniciogeneralCuentaContable.setLayout(gridaBagLayoutCamposIniciogeneralCuentaContable);

		GridBagLayout gridaBagLayoutCamposIniciotipoCuentaContable= new GridBagLayout();
		this.jPanelCamposIniciotipoCuentaContable.setLayout(gridaBagLayoutCamposIniciotipoCuentaContable);

		GridBagLayout gridaBagLayoutCamposIniciocontableCuentaContable= new GridBagLayout();
		this.jPanelCamposIniciocontableCuentaContable.setLayout(gridaBagLayoutCamposIniciocontableCuentaContable);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCuentaContable.add(jLabelIdCuentaContable, this.gridBagConstraintsCuentaContable);



	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCuentaContable.add(jLabelidCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCuentaContable.add(jLabelid_empresaCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaContable.add(jButtonid_empresaCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 3;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaContable.add(jButtonid_empresaCuentaContableUpdate, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCuentaContable.add(jComboBoxid_empresaCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCuentaContable.add(jLabelcodigoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCuentaContable.add(jButtoncodigoCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCuentaContable.add(jTextFieldcodigoCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCuentaContable.add(jLabelnombreCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCuentaContable.add(jButtonnombreCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCuentaContable.add(jscrollPanenombreCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_extranjeroCuentaContable.add(jLabelcodigo_extranjeroCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_extranjeroCuentaContable.add(jButtoncodigo_extranjeroCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_extranjeroCuentaContable.add(jTextFieldcodigo_extranjeroCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_extranjeroCuentaContable.add(jLabelnombre_extranjeroCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_extranjeroCuentaContable.add(jButtonnombre_extranjeroCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_extranjeroCuentaContable.add(jscrollPanenombre_extranjeroCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_nivel_cuentaCuentaContable.add(jLabelid_nivel_cuentaCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_nivel_cuentaCuentaContable.add(jButtonid_nivel_cuentaCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 3;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_nivel_cuentaCuentaContable.add(jButtonid_nivel_cuentaCuentaContableUpdate, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_nivel_cuentaCuentaContable.add(jComboBoxid_nivel_cuentaCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableCuentaContable.add(jLabelid_cuenta_contableCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 2;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCuentaContable.add(jButtonid_cuenta_contableCuentaContable, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 3;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCuentaContable.add(jButtonid_cuenta_contableCuentaContableArbol, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 4;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaContable.add(jButtonid_cuenta_contableCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 5;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaContable.add(jButtonid_cuenta_contableCuentaContableUpdate, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableCuentaContable.add(jComboBoxid_cuenta_contableCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoCuentaContable.add(jLabelid_centro_costoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 2;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoCuentaContable.add(jButtonid_centro_costoCuentaContable, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 3;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoCuentaContable.add(jButtonid_centro_costoCuentaContableArbol, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 4;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoCuentaContable.add(jButtonid_centro_costoCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 5;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoCuentaContable.add(jButtonid_centro_costoCuentaContableUpdate, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoCuentaContable.add(jComboBoxid_centro_costoCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloCuentaContable.add(jLabelid_moduloCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloCuentaContable.add(jButtonid_moduloCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 3;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloCuentaContable.add(jButtonid_moduloCuentaContableUpdate, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloCuentaContable.add(jComboBoxid_moduloCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionCuentaContable.add(jLabeldescripcionCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCuentaContable.add(jButtondescripcionCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionCuentaContable.add(jscrollPanedescripcionCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_movimientoCuentaContable.add(jLabeles_movimientoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_movimientoCuentaContable.add(jButtones_movimientoCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_movimientoCuentaContable.add(jCheckBoxes_movimientoCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_centro_costoCuentaContable.add(jLabeles_centro_costoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_centro_costoCuentaContable.add(jButtones_centro_costoCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_centro_costoCuentaContable.add(jCheckBoxes_centro_costoCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_centro_actividadCuentaContable.add(jLabeles_centro_actividadCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_centro_actividadCuentaContable.add(jButtones_centro_actividadCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_centro_actividadCuentaContable.add(jCheckBoxes_centro_actividadCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_activoCuentaContable.add(jLabeles_activoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_activoCuentaContable.add(jButtones_activoCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_activoCuentaContable.add(jCheckBoxes_activoCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_relacionCuentaContable.add(jLabeles_relacionCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_relacionCuentaContable.add(jButtones_relacionCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_relacionCuentaContable.add(jCheckBoxes_relacionCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_para_f52CuentaContable.add(jLabeles_para_f52CuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_para_f52CuentaContable.add(jButtones_para_f52CuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_para_f52CuentaContable.add(jCheckBoxes_para_f52CuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaCuentaContable.add(jLabelid_monedaCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaCuentaContable.add(jButtonid_monedaCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 3;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaCuentaContable.add(jButtonid_monedaCuentaContableUpdate, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaCuentaContable.add(jComboBoxid_monedaCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_intervaloCuentaContable.add(jLabelid_tipo_intervaloCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_intervaloCuentaContable.add(jButtonid_tipo_intervaloCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 3;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_intervaloCuentaContable.add(jButtonid_tipo_intervaloCuentaContableUpdate, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_intervaloCuentaContable.add(jComboBoxid_tipo_intervaloCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_flujo_efectivoCuentaContable.add(jLabelid_tipo_flujo_efectivoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_flujo_efectivoCuentaContable.add(jButtonid_tipo_flujo_efectivoCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 3;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_flujo_efectivoCuentaContable.add(jButtonid_tipo_flujo_efectivoCuentaContableUpdate, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_flujo_efectivoCuentaContable.add(jComboBoxid_tipo_flujo_efectivoCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_debitoCuentaContable.add(jLabelid_cuenta_contable_debitoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 2;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_debitoCuentaContable.add(jButtonid_cuenta_contable_debitoCuentaContable, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 3;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_debitoCuentaContable.add(jButtonid_cuenta_contable_debitoCuentaContableArbol, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 4;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoCuentaContable.add(jButtonid_cuenta_contable_debitoCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 5;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_debitoCuentaContable.add(jButtonid_cuenta_contable_debitoCuentaContableUpdate, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_debitoCuentaContable.add(jComboBoxid_cuenta_contable_debitoCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoCuentaContable.add(jLabelid_cuenta_contable_creditoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 2;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoCuentaContable.add(jButtonid_cuenta_contable_creditoCuentaContable, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 3;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoCuentaContable.add(jButtonid_cuenta_contable_creditoCuentaContableArbol, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 4;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoCuentaContable.add(jButtonid_cuenta_contable_creditoCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 5;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoCuentaContable.add(jButtonid_cuenta_contable_creditoCuentaContableUpdate, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoCuentaContable.add(jComboBoxid_cuenta_contable_creditoCuentaContable, this.gridBagConstraintsCuentaContable);


	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 0;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenCuentaContable.add(jLabelordenCuentaContable, this.gridBagConstraintsCuentaContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = 2;
		this.gridBagConstraintsCuentaContable.ipadx = 0;
		this.gridBagConstraintsCuentaContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenCuentaContable.add(jButtonordenCuentaContableBusqueda, this.gridBagConstraintsCuentaContable);
	}

	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContable.gridy = 0;
	this.gridBagConstraintsCuentaContable.gridx = 1;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenCuentaContable.add(jTextFieldordenCuentaContable, this.gridBagConstraintsCuentaContable);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposOcultosCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposOcultosCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaContable.add(this.jPanelid_empresaCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposOcultosCuentaContable % 2==0) {
		iXPanelCamposOcultosCuentaContable=0;
		iYPanelCamposOcultosCuentaContable++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciogeneralCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciogeneralCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaContable.add(this.jPanelidCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciogeneralCuentaContable % 2==0) {
		iXPanelCamposIniciogeneralCuentaContable=0;
		iYPanelCamposIniciogeneralCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciogeneralCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciogeneralCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaContable.add(this.jPanelcodigoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciogeneralCuentaContable % 2==0) {
		iXPanelCamposIniciogeneralCuentaContable=0;
		iYPanelCamposIniciogeneralCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciogeneralCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciogeneralCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaContable.add(this.jPanelnombreCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciogeneralCuentaContable % 2==0) {
		iXPanelCamposIniciogeneralCuentaContable=0;
		iYPanelCamposIniciogeneralCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciogeneralCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciogeneralCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaContable.add(this.jPanelcodigo_extranjeroCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciogeneralCuentaContable % 2==0) {
		iXPanelCamposIniciogeneralCuentaContable=0;
		iYPanelCamposIniciogeneralCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciogeneralCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciogeneralCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaContable.add(this.jPanelnombre_extranjeroCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciogeneralCuentaContable % 2==0) {
		iXPanelCamposIniciogeneralCuentaContable=0;
		iYPanelCamposIniciogeneralCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciogeneralCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciogeneralCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaContable.add(this.jPanelid_nivel_cuentaCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciogeneralCuentaContable % 2==0) {
		iXPanelCamposIniciogeneralCuentaContable=0;
		iYPanelCamposIniciogeneralCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciogeneralCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciogeneralCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaContable.add(this.jPanelid_cuenta_contableCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciogeneralCuentaContable % 2==0) {
		iXPanelCamposIniciogeneralCuentaContable=0;
		iYPanelCamposIniciogeneralCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciogeneralCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciogeneralCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaContable.add(this.jPanelid_centro_costoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciogeneralCuentaContable % 2==0) {
		iXPanelCamposIniciogeneralCuentaContable=0;
		iYPanelCamposIniciogeneralCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciogeneralCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciogeneralCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaContable.add(this.jPanelid_moduloCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciogeneralCuentaContable % 2==0) {
		iXPanelCamposIniciogeneralCuentaContable=0;
		iYPanelCamposIniciogeneralCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciogeneralCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciogeneralCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaContable.add(this.jPaneldescripcionCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciogeneralCuentaContable % 2==0) {
		iXPanelCamposIniciogeneralCuentaContable=0;
		iYPanelCamposIniciogeneralCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciotipoCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciotipoCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipoCuentaContable.add(this.jPaneles_movimientoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciotipoCuentaContable % 1==0) {
		iXPanelCamposIniciotipoCuentaContable=0;
		iYPanelCamposIniciotipoCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciotipoCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciotipoCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipoCuentaContable.add(this.jPaneles_centro_costoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciotipoCuentaContable % 1==0) {
		iXPanelCamposIniciotipoCuentaContable=0;
		iYPanelCamposIniciotipoCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciotipoCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciotipoCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipoCuentaContable.add(this.jPaneles_centro_actividadCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciotipoCuentaContable % 1==0) {
		iXPanelCamposIniciotipoCuentaContable=0;
		iYPanelCamposIniciotipoCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciotipoCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciotipoCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipoCuentaContable.add(this.jPaneles_activoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciotipoCuentaContable % 1==0) {
		iXPanelCamposIniciotipoCuentaContable=0;
		iYPanelCamposIniciotipoCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciotipoCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciotipoCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipoCuentaContable.add(this.jPaneles_relacionCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciotipoCuentaContable % 1==0) {
		iXPanelCamposIniciotipoCuentaContable=0;
		iYPanelCamposIniciotipoCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciotipoCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciotipoCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipoCuentaContable.add(this.jPaneles_para_f52CuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciotipoCuentaContable % 1==0) {
		iXPanelCamposIniciotipoCuentaContable=0;
		iYPanelCamposIniciotipoCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciocontableCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciocontableCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCuentaContable.add(this.jPanelid_monedaCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciocontableCuentaContable % 1==0) {
		iXPanelCamposIniciocontableCuentaContable=0;
		iYPanelCamposIniciocontableCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciocontableCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciocontableCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCuentaContable.add(this.jPanelid_tipo_intervaloCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciocontableCuentaContable % 1==0) {
		iXPanelCamposIniciocontableCuentaContable=0;
		iYPanelCamposIniciocontableCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciocontableCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciocontableCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCuentaContable.add(this.jPanelid_tipo_flujo_efectivoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciocontableCuentaContable % 1==0) {
		iXPanelCamposIniciocontableCuentaContable=0;
		iYPanelCamposIniciocontableCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciocontableCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciocontableCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCuentaContable.add(this.jPanelid_cuenta_contable_debitoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciocontableCuentaContable % 1==0) {
		iXPanelCamposIniciocontableCuentaContable=0;
		iYPanelCamposIniciocontableCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciocontableCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciocontableCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCuentaContable.add(this.jPanelid_cuenta_contable_creditoCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciocontableCuentaContable % 1==0) {
		iXPanelCamposIniciocontableCuentaContable=0;
		iYPanelCamposIniciocontableCuentaContable++;
	}
	this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContable.gridy = iYPanelCamposIniciocontableCuentaContable;
	this.gridBagConstraintsCuentaContable.gridx = iXPanelCamposIniciocontableCuentaContable++;
	this.gridBagConstraintsCuentaContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableCuentaContable.add(this.jPanelordenCuentaContable, this.gridBagConstraintsCuentaContable);



	if(iXPanelCamposIniciocontableCuentaContable % 1==0) {
		iXPanelCamposIniciocontableCuentaContable=0;
		iYPanelCamposIniciocontableCuentaContable++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesCuentaContable= new GridBagLayout();
		this.jPanelAccionesCuentaContable.setLayout(gridaBagLayoutAccionesCuentaContable);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCuentaContable= new GridBagLayout();
		this.jPanelAccionesFormularioCuentaContable.setLayout(gridaBagLayoutAccionesFormularioCuentaContable);
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaContable.add(this.jComboBoxTiposAccionesFormularioCuentaContable, this.gridBagConstraintsCuentaContable);

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaContable.add(this.jCheckBoxPostAccionNuevoCuentaContable, this.gridBagConstraintsCuentaContable);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cuentacontableSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaContable.add(this.jCheckBoxPostAccionSinCerrarCuentaContable, this.gridBagConstraintsCuentaContable);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cuentacontableSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cuentacontableSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaContable.add(this.jCheckBoxPostAccionSinMensajeCuentaContable, this.gridBagConstraintsCuentaContable);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx = iPosXAccion++;
			
		this.jPanelAccionesCuentaContable.add(this.jButtonModificarCuentaContable, this.gridBagConstraintsCuentaContable);							

		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContable.gridy = 0;
		this.gridBagConstraintsCuentaContable.gridx =iPosXAccion++;
			
		this.jPanelAccionesCuentaContable.add(this.jButtonEliminarCuentaContable, this.gridBagConstraintsCuentaContable);
		
			
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = 0;		
		this.gridBagConstraintsCuentaContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaContable.add(this.jButtonActualizarCuentaContable, this.gridBagConstraintsCuentaContable);


		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = 0;		
		this.gridBagConstraintsCuentaContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaContable.add(this.jButtonGuardarCambiosCuentaContable, this.gridBagConstraintsCuentaContable);	
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = 0;		
		this.gridBagConstraintsCuentaContable.gridx =iPosXAccion++;
		
		this.jPanelAccionesCuentaContable.add(this.jButtonCancelarCuentaContable, this.gridBagConstraintsCuentaContable);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaContable);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentacontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();						
			this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaContable.gridx = 0;		
			//this.gridBagConstraintsCuentaContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaContable.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaContable.gridx =0;
		this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaContable, this.gridBagConstraintsCuentaContable);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeCuentaContable = new CuentaContableBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeCuentaContable.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeCuentaContable.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeCuentaContable.setTitle("Cuenta Contable ARBOL");
		this.jInternalFrameTreeCuentaContable.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Contable Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeCuentaContable.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeCuentaContable.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeCuentaContable.setResizable(true);
	    this.jInternalFrameTreeCuentaContable.setClosable(true);
	    this.jInternalFrameTreeCuentaContable.setMaximizable(true);
			
			
		//if(CuentaContableJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCuentaContable = new CuentaContableBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cuenta Contable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cuenta Contable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Contable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CuentaContableModel cuentacontableModel=new CuentaContableModel(this);
			
			//SI USARA CLASE INTERNA
			//CuentaContableModel.CuentaContableFocusTraversalPolicy cuentacontableFocusTraversalPolicy = cuentacontableModel.new CuentaContableFocusTraversalPolicy(this);
			
			//cuentacontableFocusTraversalPolicy.setcuentacontableJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cuentacontableModel);
			
			
			this.jContentPaneDetalleCuentaContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCuentaContable = new GridBagLayout();	
			this.jContentPaneDetalleCuentaContable.setLayout(gridaBagLayoutDetalleCuentaContable);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaContable = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCuentaContable = new GridBagConstraints();
				this.gridBagConstraintsCuentaContable.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCuentaContable.gridx = 0;
					
				
				this.jContentPaneDetalleCuentaContable.add(jTtoolBarDetalleCuentaContable, gridBagConstraintsCuentaContable);								
				
}
			
			this.jScrollPanelDatosEdicionCuentaContable=   new JScrollPane(jContentPaneDetalleCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCuentaContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposCuentaContable.add("General",this.jPanelCamposIniciogeneralCuentaContable);
		this.jTabbedPaneCamposCuentaContable.add("Tipo",this.jPanelCamposIniciotipoCuentaContable);
		this.jTabbedPaneCamposCuentaContable.add("Contable",this.jPanelCamposIniciocontableCuentaContable);
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
						
			this.gridBagConstraintsCuentaContable.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCuentaContable.gridx = 0;
	        
			this.jContentPaneDetalleCuentaContable.add(jTabbedPaneCamposCuentaContable, gridBagConstraintsCuentaContable);
			
			
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
						&& cuentacontableSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cuentacontableSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCuentaContable= new GridBagConstraints();
						this.gridBagConstraintsCuentaContable.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCuentaContable.gridx = 0;
						this.jContentPaneDetalleCuentaContable.add(this.jTabbedPaneRelacionesCuentaContable, this.gridBagConstraintsCuentaContable);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCuentaContable.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCuentaContable.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCuentaContable = new GridBagConstraints();
					this.gridBagConstraintsCuentaContable.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCuentaContable.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCuentaContable.gridx = 0;
					
				
					this.jContentPaneDetalleCuentaContable.add(jPanelCamposOcultosCuentaContable, gridBagConstraintsCuentaContable);
				
					this.jPanelCamposOcultosCuentaContable.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCuentaContable.gridx = 0;
	        this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCuentaContable.add(this.jPanelAccionesFormularioCuentaContable, this.gridBagConstraintsCuentaContable);							
			
			
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
	        this.gridBagConstraintsCuentaContable.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCuentaContable.gridx = 0;
	        
			
			this.jContentPaneDetalleCuentaContable.add(this.jPanelAccionesCuentaContable, this.gridBagConstraintsCuentaContable);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCuentaContable);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCuentaContable=   new JScrollPane(this.jPanelCamposCuentaContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCuentaContable.gridx = 0;
			this.gridBagConstraintsCuentaContable.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCuentaContable.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCuentaContable.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCuentaContable, this.gridBagConstraintsCuentaContable);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCuentaContable, this.gridBagConstraintsCuentaContable);			
			
			this.gridBagConstraintsCuentaContable = new GridBagConstraints();
			this.gridBagConstraintsCuentaContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCuentaContable, this.gridBagConstraintsCuentaContable);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaContable, this.gridBagConstraintsCuentaContable);
			
			
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaContable, this.gridBagConstraintsCuentaContable);
		
			
		this.gridBagConstraintsCuentaContable = new GridBagConstraints();
		this.gridBagConstraintsCuentaContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaContable, this.gridBagConstraintsCuentaContable);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCuentaContable;//jContentPane;
		
		return jScrollPanelDatosEdicionCuentaContable;
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
