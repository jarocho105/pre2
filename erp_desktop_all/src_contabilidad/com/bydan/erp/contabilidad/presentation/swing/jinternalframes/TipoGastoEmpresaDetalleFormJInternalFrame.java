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
import com.bydan.erp.contabilidad.util.TipoGastoEmpresaConstantesFunciones;

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
public class TipoGastoEmpresaDetalleFormJInternalFrame extends TipoGastoEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoGastoEmpresa;
	
	protected JMenuBar jmenuBarDetalleTipoGastoEmpresa;
	
	protected JMenu jmenuDetalleTipoGastoEmpresa;
	protected JMenu jmenuDetalleArchivoTipoGastoEmpresa;
	protected JMenu jmenuDetalleAccionesTipoGastoEmpresa;
	protected JMenu jmenuDetalleDatosTipoGastoEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGastoEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoGastoEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoGastoEmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoGastoEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablegastoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablegasto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefiscalbienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefiscalbien="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefiscalservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefiscalservicio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableretencionbienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableretencionbien="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableretencionservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableretencionservicio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableivabienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableivabien="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableivaservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableivaservicio="";
	
	public TipoGastoEmpresaSessionBean tipogastoempresaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public CuentaContableSessionBean cuentacontablegastoSessionBean;
	public CuentaContableSessionBean cuentacontablefiscalbienSessionBean;
	public CuentaContableSessionBean cuentacontablefiscalservicioSessionBean;
	public CuentaContableSessionBean cuentacontableretencionbienSessionBean;
	public CuentaContableSessionBean cuentacontableretencionservicioSessionBean;
	public CuentaContableSessionBean cuentacontableivabienSessionBean;
	public CuentaContableSessionBean cuentacontableivaservicioSessionBean;	
	
	public TipoGastoEmpresaLogic tipogastoempresaLogic;
	
	public JScrollPane jScrollPanelDatosTipoGastoEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoGastoEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoGastoEmpresa;
	
	protected JPanel jPanelCamposTipoGastoEmpresa;    
	protected JPanel jPanelCamposOcultosTipoGastoEmpresa;    	
	protected JPanel jPanelAccionesTipoGastoEmpresa;
	protected JPanel jPanelAccionesFormularioTipoGastoEmpresa;
    
	
	
	protected JTabbedPane jTabbedPaneCamposTipoGastoEmpresa;	
	protected Integer iXPanelCamposTipoGastoEmpresa=0;
	protected Integer iYPanelCamposTipoGastoEmpresa=0;
	
	protected Integer iXPanelCamposOcultosTipoGastoEmpresa=0;
	protected Integer iYPanelCamposOcultosTipoGastoEmpresa=0;
	
	

	protected JPanel jPanelCamposIniciogeneralTipoGastoEmpresa;
	protected Integer iXPanelCamposIniciogeneralTipoGastoEmpresa=0;
	protected Integer iYPanelCamposIniciogeneralTipoGastoEmpresa=0;

	protected JPanel jPanelCamposIniciocuenta_contableTipoGastoEmpresa;
	protected Integer iXPanelCamposIniciocuenta_contableTipoGastoEmpresa=0;
	protected Integer iYPanelCamposIniciocuenta_contableTipoGastoEmpresa=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoGastoEmpresa;
	public JButton jButtonModificarTipoGastoEmpresa;
	public JButton jButtonActualizarTipoGastoEmpresa;
    public JButton jButtonEliminarTipoGastoEmpresa;
	public JButton jButtonCancelarTipoGastoEmpresa;
    public JButton jButtonGuardarCambiosTipoGastoEmpresa;
	public JButton jButtonGuardarCambiosTablaTipoGastoEmpresa;
	protected JButton jButtonCerrarTipoGastoEmpresa;
	
	
	protected JButton jButtonProcesarInformacionTipoGastoEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoGastoEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoGastoEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoGastoEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGastoEmpresa;
	protected JButton jButtonModificarToolBarTipoGastoEmpresa;
	protected JButton jButtonActualizarToolBarTipoGastoEmpresa;
    protected JButton jButtonEliminarToolBarTipoGastoEmpresa;
	protected JButton jButtonCancelarToolBarTipoGastoEmpresa;
    protected JButton jButtonGuardarCambiosToolBarTipoGastoEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoGastoEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGastoEmpresa;
	protected JButton jButtonCerrarToolBarTipoGastoEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarTipoGastoEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGastoEmpresa;
	protected JMenuItem jMenuItemModificarTipoGastoEmpresa;
	protected JMenuItem jMenuItemActualizarTipoGastoEmpresa;
    protected JMenuItem jMenuItemEliminarTipoGastoEmpresa;
	protected JMenuItem jMenuItemCancelarTipoGastoEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosTipoGastoEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGastoEmpresa;
	protected JMenuItem jMenuItemCerrarTipoGastoEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoGastoEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGastoEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoGastoEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGastoEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoGastoEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGastoEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGastoEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoGastoEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoGastoEmpresa;
	public JLabel jLabelIdTipoGastoEmpresa;
	public JLabel jLabelidTipoGastoEmpresa;
	public JButton jButtonidTipoGastoEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoGastoEmpresa;
	public JLabel jLabelnombreTipoGastoEmpresa;
	public JTextArea jTextAreanombreTipoGastoEmpresa;
	public JScrollPane jscrollPanenombreTipoGastoEmpresa;
	public JButton jButtonnombreTipoGastoEmpresaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoGastoEmpresa;
	public JLabel jLabeldescripcionTipoGastoEmpresa;
	public JTextArea jTextAreadescripcionTipoGastoEmpresa;
	public JScrollPane jscrollPanedescripcionTipoGastoEmpresa;
	public JButton jButtondescripcionTipoGastoEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoGastoEmpresa;
	public JLabel jLabelid_empresaTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoGastoEmpresa;
	public JButton jButtonid_empresaTipoGastoEmpresa= new JButtonMe();
	public JButton jButtonid_empresaTipoGastoEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoGastoEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTipoGastoEmpresa;
	public JLabel jLabelid_sucursalTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTipoGastoEmpresa;
	public JButton jButtonid_sucursalTipoGastoEmpresa= new JButtonMe();
	public JButton jButtonid_sucursalTipoGastoEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTipoGastoEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoTipoGastoEmpresa;
	public JLabel jLabelid_formatoTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoTipoGastoEmpresa;
	public JButton jButtonid_formatoTipoGastoEmpresa= new JButtonMe();
	public JButton jButtonid_formatoTipoGastoEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_formatoTipoGastoEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_gastoTipoGastoEmpresa;
	public JLabel jLabelid_cuenta_contable_gastoTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa;
	public JButton jButtonid_cuenta_contable_gastoTipoGastoEmpresa= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gastoTipoGastoEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gastoTipoGastoEmpresaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gastoTipoGastoEmpresaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_fiscal_bienTipoGastoEmpresa;
	public JLabel jLabelid_cuenta_contable_fiscal_bienTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa;
	public JButton jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresa= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa;
	public JLabel jLabelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa;
	public JButton jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresa= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_retencion_bienTipoGastoEmpresa;
	public JLabel jLabelid_cuenta_contable_retencion_bienTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa;
	public JButton jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresa= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_retencion_servicioTipoGastoEmpresa;
	public JLabel jLabelid_cuenta_contable_retencion_servicioTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa;
	public JButton jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresa= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_iva_bienTipoGastoEmpresa;
	public JLabel jLabelid_cuenta_contable_iva_bienTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa;
	public JButton jButtonid_cuenta_contable_iva_bienTipoGastoEmpresa= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_iva_servicioTipoGastoEmpresa;
	public JLabel jLabelid_cuenta_contable_iva_servicioTipoGastoEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa;
	public JButton jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresa= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoGastoEmpresa;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoGastoEmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoGastoEmpresa=new JPanel();
				this.jPanelAccionesFormularioTipoGastoEmpresa=new JPanel();
				this.jmenuBarDetalleTipoGastoEmpresa=new JMenuBar();
				this.jTtoolBarDetalleTipoGastoEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoEmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGastoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGastoEmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGastoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoEmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGastoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoEmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGastoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoEmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGastoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoGastoEmpresa() {
		return this.jButtonActualizarToolBarTipoGastoEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarTipoGastoEmpresa() {
		return this.jButtonEliminarToolBarTipoGastoEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarTipoGastoEmpresa() {
		return this.jButtonCancelarToolBarTipoGastoEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionTipoGastoEmpresa() {
		return this.jButtonProcesarInformacionTipoGastoEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGastoEmpresa)	{
		this.jButtonProcesarInformacionTipoGastoEmpresa = jButtonProcesarInformacionTipoGastoEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGastoEmpresa() {
		return this.jComboBoxTiposAccionesTipoGastoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGastoEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoGastoEmpresa) {
		this.jComboBoxTiposRelacionesTipoGastoEmpresa = jComboBoxTiposRelacionesTipoGastoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGastoEmpresa(
			JComboBox jComboBoxTiposAccionesTipoGastoEmpresa) {
		this.jComboBoxTiposAccionesTipoGastoEmpresa = jComboBoxTiposAccionesTipoGastoEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoGastoEmpresa() {
		return this.jComboBoxTiposAccionesFormularioTipoGastoEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoGastoEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioTipoGastoEmpresa) {
		this.jComboBoxTiposAccionesFormularioTipoGastoEmpresa = jComboBoxTiposAccionesFormularioTipoGastoEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipogastoempresaSessionBean=new TipoGastoEmpresaSessionBean();
		
		this.tipogastoempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogastoempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogastoempresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGastoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGastoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGastoEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Gasto Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipogastoempresaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoGastoEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoGastoEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoGastoEmpresa=new JButtonMe();
				this.jButtonModificarToolBarTipoGastoEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoGastoEmpresa,this.jTtoolBarDetalleTipoGastoEmpresa,
							"actualizar","actualizar","Actualizar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoGastoEmpresa,this.jTtoolBarDetalleTipoGastoEmpresa,
							"eliminar","eliminar","Eliminar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoGastoEmpresa,this.jTtoolBarDetalleTipoGastoEmpresa,
							"cancelar","cancelar","Cancelar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoGastoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoGastoEmpresa,this.jTtoolBarDetalleTipoGastoEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoGastoEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoGastoEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoGastoEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoGastoEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoGastoEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGastoEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGastoEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGastoEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoGastoEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoGastoEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoGastoEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoGastoEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoGastoEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoGastoEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoGastoEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoGastoEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoGastoEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoGastoEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoGastoEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoGastoEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoGastoEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGastoEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGastoEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGastoEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGastoEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGastoEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoGastoEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoGastoEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoGastoEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGastoEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGastoEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGastoEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGastoEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGastoEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGastoEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoGastoEmpresa.add(this.jMenuItemDetalleCerrarTipoGastoEmpresa);
		
		this.jmenuDetalleAccionesTipoGastoEmpresa.add(this.jMenuItemActualizarTipoGastoEmpresa);
		this.jmenuDetalleAccionesTipoGastoEmpresa.add(this.jMenuItemEliminarTipoGastoEmpresa);
		this.jmenuDetalleAccionesTipoGastoEmpresa.add(this.jMenuItemCancelarTipoGastoEmpresa);		
		
		//this.jmenuDetalleDatosTipoGastoEmpresa.add(this.jMenuItemDetalleAbrirOrderByTipoGastoEmpresa);				
		this.jmenuDetalleDatosTipoGastoEmpresa.add(this.jMenuItemDetalleMostarOcultarTipoGastoEmpresa);				
				
		//this.jmenuDetalleAccionesTipoGastoEmpresa.add(this.jMenuItemGuardarCambiosTipoGastoEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoGastoEmpresa.add(this.jmenuDetalleArchivoTipoGastoEmpresa);		
		this.jmenuBarDetalleTipoGastoEmpresa.add(this.jmenuDetalleAccionesTipoGastoEmpresa);		
		this.jmenuBarDetalleTipoGastoEmpresa.add(this.jmenuDetalleDatosTipoGastoEmpresa);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoGastoEmpresa);				
	}
	
	
	public void inicializarElementosCamposTipoGastoEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoGastoEmpresa = new JLabelMe();
		jLabelIdTipoGastoEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoGastoEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoGastoEmpresa= new GridBagLayout();

		this.jPanelidTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);

		jLabelidTipoGastoEmpresa = new JLabel();
		jLabelidTipoGastoEmpresa.setText("Id");

		jLabelidTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoGastoEmpresa = new JLabelMe();
		this.jLabelnombreTipoGastoEmpresa.setText(""+TipoGastoEmpresaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoGastoEmpresa.setToolTipText("Nombre");
		this.jLabelnombreTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		this.jPanelnombreTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);


		jTextAreanombreTipoGastoEmpresa= new JTextAreaMe();
		jTextAreanombreTipoGastoEmpresa.setEnabled(false);
		jTextAreanombreTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGastoEmpresa.setLineWrap(true);
		jTextAreanombreTipoGastoEmpresa.setWrapStyleWord(true);
		jTextAreanombreTipoGastoEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoGastoEmpresa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoGastoEmpresa = new JScrollPane(jTextAreanombreTipoGastoEmpresa);
		jscrollPanenombreTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoGastoEmpresaBusqueda= new JButtonMe();
		this.jButtonnombreTipoGastoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGastoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGastoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoGastoEmpresaBusqueda.setText("U");
		this.jButtonnombreTipoGastoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoGastoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoGastoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoGastoEmpresaBusqueda"));

		if(this.tipogastoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoGastoEmpresaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoGastoEmpresa = new JLabelMe();
		this.jLabeldescripcionTipoGastoEmpresa.setText(""+TipoGastoEmpresaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTipoGastoEmpresa.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		this.jPaneldescripcionTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);


		jTextAreadescripcionTipoGastoEmpresa= new JTextAreaMe();
		jTextAreadescripcionTipoGastoEmpresa.setEnabled(false);
		jTextAreadescripcionTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoGastoEmpresa.setLineWrap(true);
		jTextAreadescripcionTipoGastoEmpresa.setWrapStyleWord(true);
		jTextAreadescripcionTipoGastoEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoGastoEmpresa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoGastoEmpresa = new JScrollPane(jTextAreadescripcionTipoGastoEmpresa);
		jscrollPanedescripcionTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoGastoEmpresaBusqueda= new JButtonMe();
		this.jButtondescripcionTipoGastoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoGastoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoGastoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoGastoEmpresaBusqueda.setText("U");
		this.jButtondescripcionTipoGastoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoGastoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoGastoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoGastoEmpresaBusqueda"));

		if(this.tipogastoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoGastoEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoGastoEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoGastoEmpresa = new JLabelMe();
		this.jLabelid_empresaTipoGastoEmpresa.setText(""+TipoGastoEmpresaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoGastoEmpresa.setToolTipText("Empresa");
		this.jLabelid_empresaTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		this.jPanelid_empresaTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);


		jComboBoxid_empresaTipoGastoEmpresa= new JComboBoxMe();
		jComboBoxid_empresaTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoGastoEmpresa.setEnabled(false);

		this.jButtonid_empresaTipoGastoEmpresa= new JButtonMe();
		this.jButtonid_empresaTipoGastoEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoGastoEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoGastoEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoGastoEmpresa.setText("Buscar");
		this.jButtonid_empresaTipoGastoEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoGastoEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoGastoEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoGastoEmpresa"));

		this.jButtonid_empresaTipoGastoEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoGastoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoGastoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoGastoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoGastoEmpresaBusqueda.setText("U");
		this.jButtonid_empresaTipoGastoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoGastoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoGastoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoGastoEmpresaBusqueda"));

		if(this.tipogastoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoGastoEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoGastoEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoGastoEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoGastoEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoGastoEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoGastoEmpresaUpdate.setText("U");
		this.jButtonid_empresaTipoGastoEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoGastoEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoGastoEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoGastoEmpresaUpdate"));



					
		this.jLabelid_sucursalTipoGastoEmpresa = new JLabelMe();
		this.jLabelid_sucursalTipoGastoEmpresa.setText(""+TipoGastoEmpresaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTipoGastoEmpresa.setToolTipText("Sucursal");
		this.jLabelid_sucursalTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		this.jPanelid_sucursalTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);


		jComboBoxid_sucursalTipoGastoEmpresa= new JComboBoxMe();
		jComboBoxid_sucursalTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTipoGastoEmpresa.setEnabled(false);

		this.jButtonid_sucursalTipoGastoEmpresa= new JButtonMe();
		this.jButtonid_sucursalTipoGastoEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTipoGastoEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTipoGastoEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTipoGastoEmpresa.setText("Buscar");
		this.jButtonid_sucursalTipoGastoEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTipoGastoEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTipoGastoEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTipoGastoEmpresa"));

		this.jButtonid_sucursalTipoGastoEmpresaBusqueda= new JButtonMe();
		this.jButtonid_sucursalTipoGastoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTipoGastoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTipoGastoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTipoGastoEmpresaBusqueda.setText("U");
		this.jButtonid_sucursalTipoGastoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTipoGastoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTipoGastoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTipoGastoEmpresaBusqueda"));

		if(this.tipogastoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTipoGastoEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTipoGastoEmpresaUpdate= new JButtonMe();
		this.jButtonid_sucursalTipoGastoEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTipoGastoEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTipoGastoEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTipoGastoEmpresaUpdate.setText("U");
		this.jButtonid_sucursalTipoGastoEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTipoGastoEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTipoGastoEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTipoGastoEmpresaUpdate"));



					
		this.jLabelid_formatoTipoGastoEmpresa = new JLabelMe();
		this.jLabelid_formatoTipoGastoEmpresa.setText(""+TipoGastoEmpresaConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoTipoGastoEmpresa.setToolTipText("Formato");
		this.jLabelid_formatoTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		this.jPanelid_formatoTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);


		jComboBoxid_formatoTipoGastoEmpresa= new JComboBoxMe();
		jComboBoxid_formatoTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoTipoGastoEmpresa= new JButtonMe();
		this.jButtonid_formatoTipoGastoEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoTipoGastoEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoTipoGastoEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoTipoGastoEmpresa.setText("Buscar");
		this.jButtonid_formatoTipoGastoEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoTipoGastoEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoTipoGastoEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoTipoGastoEmpresa"));

		this.jButtonid_formatoTipoGastoEmpresaBusqueda= new JButtonMe();
		this.jButtonid_formatoTipoGastoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoTipoGastoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoTipoGastoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoTipoGastoEmpresaBusqueda.setText("U");
		this.jButtonid_formatoTipoGastoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoTipoGastoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoTipoGastoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoTipoGastoEmpresaBusqueda"));

		if(this.tipogastoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoTipoGastoEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_formatoTipoGastoEmpresaUpdate= new JButtonMe();
		this.jButtonid_formatoTipoGastoEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoTipoGastoEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoTipoGastoEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoTipoGastoEmpresaUpdate.setText("U");
		this.jButtonid_formatoTipoGastoEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoTipoGastoEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoTipoGastoEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoTipoGastoEmpresaUpdate"));



					
		this.jLabelid_cuenta_contable_gastoTipoGastoEmpresa = new JLabelMe();
		this.jLabelid_cuenta_contable_gastoTipoGastoEmpresa.setText(""+TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO+" : *");
		this.jLabelid_cuenta_contable_gastoTipoGastoEmpresa.setToolTipText("Cuenta C. Gasto");
		this.jLabelid_cuenta_contable_gastoTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_gastoTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_gastoTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_gastoTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_gastoTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_gastoTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO);
		this.gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		this.jPanelid_cuenta_contable_gastoTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);


		jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa= new JComboBoxMe();
		jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresa= new JButtonMe();
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresa.setText("Buscar");
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoTipoGastoEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoTipoGastoEmpresa"));

		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoTipoGastoEmpresaBusqueda"));

		if(this.tipogastoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaUpdate.setText("U");
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoTipoGastoEmpresaUpdate"));


		jButtonid_cuenta_contable_gastoTipoGastoEmpresaArbol= new JButtonMe();
		jButtonid_cuenta_contable_gastoTipoGastoEmpresaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gastoTipoGastoEmpresaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gastoTipoGastoEmpresaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gastoTipoGastoEmpresaArbol.setText("Arbol");
		jButtonid_cuenta_contable_gastoTipoGastoEmpresaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_gastoTipoGastoEmpresaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoTipoGastoEmpresaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoTipoGastoEmpresaArbol"));



					
		this.jLabelid_cuenta_contable_fiscal_bienTipoGastoEmpresa = new JLabelMe();
		this.jLabelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setText(""+TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEFISCALBIEN+" : *");
		this.jLabelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setToolTipText("Cuenta C. Fiscal Bien");
		this.jLabelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_fiscal_bienTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_fiscal_bienTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEFISCALBIEN);
		this.gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		this.jPanelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);


		jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa= new JComboBoxMe();
		jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresa= new JButtonMe();
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setText("Buscar");
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscal_bienTipoGastoEmpresa"));

		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscal_bienTipoGastoEmpresaBusqueda"));

		if(this.tipogastoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaUpdate.setText("U");
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscal_bienTipoGastoEmpresaUpdate"));


		jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaArbol= new JButtonMe();
		jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaArbol.setText("Arbol");
		jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscal_bienTipoGastoEmpresaArbol"));



					
		this.jLabelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa = new JLabelMe();
		this.jLabelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setText(""+TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEFISCALSERVICIO+" : *");
		this.jLabelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setToolTipText("Cuenta C. Fiscal Servicio");
		this.jLabelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEFISCALSERVICIO);
		this.gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		this.jPanelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);


		jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa= new JComboBoxMe();
		jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresa= new JButtonMe();
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setText("Buscar");
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscal_servicioTipoGastoEmpresa"));

		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscal_servicioTipoGastoEmpresaBusqueda"));

		if(this.tipogastoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaUpdate.setText("U");
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscal_servicioTipoGastoEmpresaUpdate"));


		jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaArbol= new JButtonMe();
		jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaArbol.setText("Arbol");
		jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_fiscal_servicioTipoGastoEmpresaArbol"));



					
		this.jLabelid_cuenta_contable_retencion_bienTipoGastoEmpresa = new JLabelMe();
		this.jLabelid_cuenta_contable_retencion_bienTipoGastoEmpresa.setText(""+TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLERETENCIONBIEN+" : *");
		this.jLabelid_cuenta_contable_retencion_bienTipoGastoEmpresa.setToolTipText("Cuenta C. Retencion Bien");
		this.jLabelid_cuenta_contable_retencion_bienTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_retencion_bienTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_retencion_bienTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_retencion_bienTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_retencion_bienTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_retencion_bienTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLERETENCIONBIEN);
		this.gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		this.jPanelid_cuenta_contable_retencion_bienTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);


		jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa= new JComboBoxMe();
		jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresa= new JButtonMe();
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresa.setText("Buscar");
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencion_bienTipoGastoEmpresa"));

		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencion_bienTipoGastoEmpresaBusqueda"));

		if(this.tipogastoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaUpdate.setText("U");
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencion_bienTipoGastoEmpresaUpdate"));


		jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaArbol= new JButtonMe();
		jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaArbol.setText("Arbol");
		jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencion_bienTipoGastoEmpresaArbol"));



					
		this.jLabelid_cuenta_contable_retencion_servicioTipoGastoEmpresa = new JLabelMe();
		this.jLabelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setText(""+TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLERETENCIONSERVICIO+" : *");
		this.jLabelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setToolTipText("Cuenta C. Retencion Servicio");
		this.jLabelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_retencion_servicioTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_retencion_servicioTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLERETENCIONSERVICIO);
		this.gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		this.jPanelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);


		jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa= new JComboBoxMe();
		jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresa= new JButtonMe();
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setText("Buscar");
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencion_servicioTipoGastoEmpresa"));

		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencion_servicioTipoGastoEmpresaBusqueda"));

		if(this.tipogastoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaUpdate.setText("U");
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencion_servicioTipoGastoEmpresaUpdate"));


		jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaArbol= new JButtonMe();
		jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaArbol.setText("Arbol");
		jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_retencion_servicioTipoGastoEmpresaArbol"));



					
		this.jLabelid_cuenta_contable_iva_bienTipoGastoEmpresa = new JLabelMe();
		this.jLabelid_cuenta_contable_iva_bienTipoGastoEmpresa.setText(""+TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEIVABIEN+" : *");
		this.jLabelid_cuenta_contable_iva_bienTipoGastoEmpresa.setToolTipText("Cuenta C. Iva Bien");
		this.jLabelid_cuenta_contable_iva_bienTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_iva_bienTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_iva_bienTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_iva_bienTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_iva_bienTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_iva_bienTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEIVABIEN);
		this.gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		this.jPanelid_cuenta_contable_iva_bienTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);


		jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa= new JComboBoxMe();
		jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresa= new JButtonMe();
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresa.setText("Buscar");
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_bienTipoGastoEmpresa"));

		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_bienTipoGastoEmpresaBusqueda"));

		if(this.tipogastoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaUpdate.setText("U");
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_bienTipoGastoEmpresaUpdate"));


		jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaArbol= new JButtonMe();
		jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaArbol.setText("Arbol");
		jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_bienTipoGastoEmpresaArbol"));



					
		this.jLabelid_cuenta_contable_iva_servicioTipoGastoEmpresa = new JLabelMe();
		this.jLabelid_cuenta_contable_iva_servicioTipoGastoEmpresa.setText(""+TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEIVASERVICIO+" : *");
		this.jLabelid_cuenta_contable_iva_servicioTipoGastoEmpresa.setToolTipText("Cuenta C. Iva Servicio");
		this.jLabelid_cuenta_contable_iva_servicioTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_iva_servicioTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_iva_servicioTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_iva_servicioTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_iva_servicioTipoGastoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_iva_servicioTipoGastoEmpresa.setToolTipText(TipoGastoEmpresaConstantesFunciones.LABEL_IDCUENTACONTABLEIVASERVICIO);
		this.gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		this.jPanelid_cuenta_contable_iva_servicioTipoGastoEmpresa.setLayout(this.gridaBagLayoutTipoGastoEmpresa);


		jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa= new JComboBoxMe();
		jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresa= new JButtonMe();
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresa.setText("Buscar");
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_servicioTipoGastoEmpresa"));

		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaBusqueda.setText("U");
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_servicioTipoGastoEmpresaBusqueda"));

		if(this.tipogastoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaUpdate.setText("U");
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_servicioTipoGastoEmpresaUpdate"));


		jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaArbol= new JButtonMe();
		jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaArbol.setText("Arbol");
		jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iva_servicioTipoGastoEmpresaArbol"));



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
		//this.jInternalFrameDetalleTipoGastoEmpresa = new TipoGastoEmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Gasto Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGastoEmpresa= new GridBagLayout();
		

		
		String sToolTipTipoGastoEmpresa="";
		sToolTipTipoGastoEmpresa=TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGastoEmpresa+="(Contabilidad.TipoGastoEmpresa)";
		}
		
		if(!this.tipogastoempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGastoEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoGastoEmpresa = new JButtonMe();
		this.jButtonModificarTipoGastoEmpresa = new JButtonMe();
        this.jButtonActualizarTipoGastoEmpresa = new JButtonMe();
        this.jButtonEliminarTipoGastoEmpresa = new JButtonMe();
        this.jButtonCancelarTipoGastoEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosTipoGastoEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoGastoEmpresa = new JButtonMe();
		this.jButtonCerrarTipoGastoEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoGastoEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoGastoEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoGastoEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposTipoGastoEmpresa=new JTabbedPane();
		
		
		this.jTabbedPaneCamposTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Gasto Empresa";
		
		if(!this.tipogastoempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGastoEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoGastoEmpresa.setName("jPanelCamposTipoGastoEmpresa"); 

		this.jPanelCamposOcultosTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoGastoEmpresa.setName("jPanelCamposOcultosTipoGastoEmpresa"); 

        this.jPanelAccionesTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGastoEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoGastoEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoGastoEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoGastoEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralTipoGastoEmpresa.setName("jPanelCamposFingeneralTipoGastoEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.setName("jPanelCamposFincuenta_contableTipoGastoEmpresa");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoGastoEmpresa.setText("Nuevo");
		this.jButtonModificarTipoGastoEmpresa.setText("Editar");
        this.jButtonActualizarTipoGastoEmpresa.setText("Actualizar");
        this.jButtonEliminarTipoGastoEmpresa.setText("Eliminar");
        this.jButtonCancelarTipoGastoEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosTipoGastoEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoGastoEmpresa.setText("Guardar");
		this.jButtonCerrarTipoGastoEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGastoEmpresa,"nuevo_button","Nuevo",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoGastoEmpresa,"modificar_button","Editar",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoGastoEmpresa,"actualizar_button","Actualizar",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoGastoEmpresa,"eliminar_button","Eliminar",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoGastoEmpresa,"cancelar_button","Cancelar",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoGastoEmpresa,"guardarcambios_button","Guardar",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGastoEmpresa,"guardarcambiostabla_button","Guardar",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGastoEmpresa,"cerrar_button","Salir",this.tipogastoempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoGastoEmpresa.setToolTipText("Nuevo"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoGastoEmpresa.setToolTipText("Editar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoGastoEmpresa.setToolTipText("Actualizar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoGastoEmpresa.setToolTipText("Eliminar)"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoGastoEmpresa.setToolTipText("Cancelar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoGastoEmpresa.setToolTipText("Guardar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoGastoEmpresa.setToolTipText("Guardar"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGastoEmpresa.setToolTipText("Salir"+" "+TipoGastoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGastoEmpresa";
		inputMap = this.jButtonNuevoTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGastoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGastoEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoGastoEmpresa";
		inputMap = this.jButtonActualizarTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoGastoEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoGastoEmpresa";
		inputMap = this.jButtonEliminarTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoGastoEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoGastoEmpresa";
		inputMap = this.jButtonCancelarTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoGastoEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarTipoGastoEmpresa";
		inputMap = this.jButtonCerrarTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGastoEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGastoEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoGastoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGastoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGastoEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoGastoEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoGastoEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoGastoEmpresa.setToolTipText("Nuevo TipoGastoEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoGastoEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoGastoEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoGastoEmpresa.setToolTipText("Sin Cerrar Ventana TipoGastoEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoGastoEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoGastoEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoGastoEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoGastoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGastoEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoGastoEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoGastoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoGastoEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoGastoEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoGastoEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoGastoEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoGastoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGastoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGastoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoGastoEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoGastoEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoGastoEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoGastoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoGastoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoGastoEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGastoEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGastoEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoGastoEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGastoEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGastoEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoGastoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoGastoEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoGastoEmpresa = new GridBagLayout();
		
		this.jPanelCamposTipoGastoEmpresa.setLayout(gridaBagLayoutCamposTipoGastoEmpresa);
		this.jPanelCamposOcultosTipoGastoEmpresa.setLayout(gridaBagLayoutCamposOcultosTipoGastoEmpresa);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralTipoGastoEmpresa= new GridBagLayout();
		this.jPanelCamposIniciogeneralTipoGastoEmpresa.setLayout(gridaBagLayoutCamposIniciogeneralTipoGastoEmpresa);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableTipoGastoEmpresa= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.setLayout(gridaBagLayoutCamposIniciocuenta_contableTipoGastoEmpresa);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoGastoEmpresa.add(jLabelIdTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoGastoEmpresa.add(jLabelidTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoGastoEmpresa.add(jLabelid_empresaTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 2;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoGastoEmpresa.add(jButtonid_empresaTipoGastoEmpresaBusqueda, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 3;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoGastoEmpresa.add(jButtonid_empresaTipoGastoEmpresaUpdate, this.gridBagConstraintsTipoGastoEmpresa);
	}

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoGastoEmpresa.add(jComboBoxid_empresaTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTipoGastoEmpresa.add(jLabelid_sucursalTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 2;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTipoGastoEmpresa.add(jButtonid_sucursalTipoGastoEmpresaBusqueda, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 3;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTipoGastoEmpresa.add(jButtonid_sucursalTipoGastoEmpresaUpdate, this.gridBagConstraintsTipoGastoEmpresa);
	}

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTipoGastoEmpresa.add(jComboBoxid_sucursalTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoGastoEmpresa.add(jLabelnombreTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 2;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoGastoEmpresa.add(jButtonnombreTipoGastoEmpresaBusqueda, this.gridBagConstraintsTipoGastoEmpresa);
	}

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoGastoEmpresa.add(jscrollPanenombreTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoTipoGastoEmpresa.add(jLabelid_formatoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 2;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoTipoGastoEmpresa.add(jButtonid_formatoTipoGastoEmpresaBusqueda, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 3;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoTipoGastoEmpresa.add(jButtonid_formatoTipoGastoEmpresaUpdate, this.gridBagConstraintsTipoGastoEmpresa);
	}

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoTipoGastoEmpresa.add(jComboBoxid_formatoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoGastoEmpresa.add(jLabeldescripcionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 2;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoGastoEmpresa.add(jButtondescripcionTipoGastoEmpresaBusqueda, this.gridBagConstraintsTipoGastoEmpresa);
	}

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoGastoEmpresa.add(jscrollPanedescripcionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_gastoTipoGastoEmpresa.add(jLabelid_cuenta_contable_gastoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 2;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_gastoTipoGastoEmpresa.add(jButtonid_cuenta_contable_gastoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 3;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_gastoTipoGastoEmpresa.add(jButtonid_cuenta_contable_gastoTipoGastoEmpresaArbol, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 4;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_gastoTipoGastoEmpresa.add(jButtonid_cuenta_contable_gastoTipoGastoEmpresaBusqueda, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 5;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_gastoTipoGastoEmpresa.add(jButtonid_cuenta_contable_gastoTipoGastoEmpresaUpdate, this.gridBagConstraintsTipoGastoEmpresa);
	}

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_gastoTipoGastoEmpresa.add(jComboBoxid_cuenta_contable_gastoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.add(jLabelid_cuenta_contable_fiscal_bienTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 2;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.add(jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 3;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.add(jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaArbol, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 4;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.add(jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaBusqueda, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 5;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.add(jButtonid_cuenta_contable_fiscal_bienTipoGastoEmpresaUpdate, this.gridBagConstraintsTipoGastoEmpresa);
	}

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_fiscal_bienTipoGastoEmpresa.add(jComboBoxid_cuenta_contable_fiscal_bienTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.add(jLabelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 2;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.add(jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 3;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.add(jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaArbol, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 4;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.add(jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaBusqueda, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 5;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.add(jButtonid_cuenta_contable_fiscal_servicioTipoGastoEmpresaUpdate, this.gridBagConstraintsTipoGastoEmpresa);
	}

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa.add(jComboBoxid_cuenta_contable_fiscal_servicioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_retencion_bienTipoGastoEmpresa.add(jLabelid_cuenta_contable_retencion_bienTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 2;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_retencion_bienTipoGastoEmpresa.add(jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 3;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_retencion_bienTipoGastoEmpresa.add(jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaArbol, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 4;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_retencion_bienTipoGastoEmpresa.add(jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaBusqueda, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 5;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_retencion_bienTipoGastoEmpresa.add(jButtonid_cuenta_contable_retencion_bienTipoGastoEmpresaUpdate, this.gridBagConstraintsTipoGastoEmpresa);
	}

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_retencion_bienTipoGastoEmpresa.add(jComboBoxid_cuenta_contable_retencion_bienTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.add(jLabelid_cuenta_contable_retencion_servicioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 2;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.add(jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 3;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.add(jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaArbol, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 4;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.add(jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaBusqueda, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 5;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.add(jButtonid_cuenta_contable_retencion_servicioTipoGastoEmpresaUpdate, this.gridBagConstraintsTipoGastoEmpresa);
	}

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_retencion_servicioTipoGastoEmpresa.add(jComboBoxid_cuenta_contable_retencion_servicioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_iva_bienTipoGastoEmpresa.add(jLabelid_cuenta_contable_iva_bienTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 2;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_iva_bienTipoGastoEmpresa.add(jButtonid_cuenta_contable_iva_bienTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 3;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_iva_bienTipoGastoEmpresa.add(jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaArbol, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 4;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iva_bienTipoGastoEmpresa.add(jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaBusqueda, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 5;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iva_bienTipoGastoEmpresa.add(jButtonid_cuenta_contable_iva_bienTipoGastoEmpresaUpdate, this.gridBagConstraintsTipoGastoEmpresa);
	}

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_iva_bienTipoGastoEmpresa.add(jComboBoxid_cuenta_contable_iva_bienTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_iva_servicioTipoGastoEmpresa.add(jLabelid_cuenta_contable_iva_servicioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 2;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_iva_servicioTipoGastoEmpresa.add(jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 3;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_iva_servicioTipoGastoEmpresa.add(jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaArbol, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 4;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iva_servicioTipoGastoEmpresa.add(jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaBusqueda, this.gridBagConstraintsTipoGastoEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 5;
		this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iva_servicioTipoGastoEmpresa.add(jButtonid_cuenta_contable_iva_servicioTipoGastoEmpresaUpdate, this.gridBagConstraintsTipoGastoEmpresa);
	}

	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_iva_servicioTipoGastoEmpresa.add(jComboBoxid_cuenta_contable_iva_servicioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposOcultosTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposOcultosTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoGastoEmpresa.add(this.jPanelid_empresaTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposOcultosTipoGastoEmpresa % 1==0) {
		iXPanelCamposOcultosTipoGastoEmpresa=0;
		iYPanelCamposOcultosTipoGastoEmpresa++;
	}
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposOcultosTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposOcultosTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoGastoEmpresa.add(this.jPanelid_sucursalTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposOcultosTipoGastoEmpresa % 1==0) {
		iXPanelCamposOcultosTipoGastoEmpresa=0;
		iYPanelCamposOcultosTipoGastoEmpresa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposIniciogeneralTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposIniciogeneralTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTipoGastoEmpresa.add(this.jPanelidTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposIniciogeneralTipoGastoEmpresa % 1==0) {
		iXPanelCamposIniciogeneralTipoGastoEmpresa=0;
		iYPanelCamposIniciogeneralTipoGastoEmpresa++;
	}
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposIniciogeneralTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposIniciogeneralTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTipoGastoEmpresa.add(this.jPanelnombreTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposIniciogeneralTipoGastoEmpresa % 1==0) {
		iXPanelCamposIniciogeneralTipoGastoEmpresa=0;
		iYPanelCamposIniciogeneralTipoGastoEmpresa++;
	}
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposIniciogeneralTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposIniciogeneralTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTipoGastoEmpresa.add(this.jPanelid_formatoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposIniciogeneralTipoGastoEmpresa % 1==0) {
		iXPanelCamposIniciogeneralTipoGastoEmpresa=0;
		iYPanelCamposIniciogeneralTipoGastoEmpresa++;
	}
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposIniciogeneralTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposIniciogeneralTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTipoGastoEmpresa.add(this.jPaneldescripcionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposIniciogeneralTipoGastoEmpresa % 1==0) {
		iXPanelCamposIniciogeneralTipoGastoEmpresa=0;
		iYPanelCamposIniciogeneralTipoGastoEmpresa++;
	}
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposIniciocuenta_contableTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.add(this.jPanelid_cuenta_contable_gastoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposIniciocuenta_contableTipoGastoEmpresa % 1==0) {
		iXPanelCamposIniciocuenta_contableTipoGastoEmpresa=0;
		iYPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	}
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposIniciocuenta_contableTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.add(this.jPanelid_cuenta_contable_fiscal_bienTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposIniciocuenta_contableTipoGastoEmpresa % 1==0) {
		iXPanelCamposIniciocuenta_contableTipoGastoEmpresa=0;
		iYPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	}
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposIniciocuenta_contableTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.add(this.jPanelid_cuenta_contable_fiscal_servicioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposIniciocuenta_contableTipoGastoEmpresa % 1==0) {
		iXPanelCamposIniciocuenta_contableTipoGastoEmpresa=0;
		iYPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	}
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposIniciocuenta_contableTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.add(this.jPanelid_cuenta_contable_retencion_bienTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposIniciocuenta_contableTipoGastoEmpresa % 1==0) {
		iXPanelCamposIniciocuenta_contableTipoGastoEmpresa=0;
		iYPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	}
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposIniciocuenta_contableTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.add(this.jPanelid_cuenta_contable_retencion_servicioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposIniciocuenta_contableTipoGastoEmpresa % 1==0) {
		iXPanelCamposIniciocuenta_contableTipoGastoEmpresa=0;
		iYPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	}
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposIniciocuenta_contableTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.add(this.jPanelid_cuenta_contable_iva_bienTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposIniciocuenta_contableTipoGastoEmpresa % 1==0) {
		iXPanelCamposIniciocuenta_contableTipoGastoEmpresa=0;
		iYPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	}
	this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoEmpresa.gridy = iYPanelCamposIniciocuenta_contableTipoGastoEmpresa;
	this.gridBagConstraintsTipoGastoEmpresa.gridx = iXPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
	this.gridBagConstraintsTipoGastoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa.add(this.jPanelid_cuenta_contable_iva_servicioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);



	if(iXPanelCamposIniciocuenta_contableTipoGastoEmpresa % 1==0) {
		iXPanelCamposIniciocuenta_contableTipoGastoEmpresa=0;
		iYPanelCamposIniciocuenta_contableTipoGastoEmpresa++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoGastoEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoGastoEmpresa.setLayout(gridaBagLayoutAccionesTipoGastoEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoGastoEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioTipoGastoEmpresa.setLayout(gridaBagLayoutAccionesFormularioTipoGastoEmpresa);
		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGastoEmpresa.add(this.jComboBoxTiposAccionesFormularioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGastoEmpresa.add(this.jCheckBoxPostAccionNuevoTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipogastoempresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGastoEmpresa.add(this.jCheckBoxPostAccionSinCerrarTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipogastoempresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipogastoempresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGastoEmpresa.add(this.jCheckBoxPostAccionSinMensajeTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoGastoEmpresa.add(this.jButtonModificarTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);							

		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoGastoEmpresa.add(this.jButtonEliminarTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		
			
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGastoEmpresa.add(this.jButtonActualizarTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);


		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGastoEmpresa.add(this.jButtonGuardarCambiosTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);	
		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoGastoEmpresa.add(this.jButtonCancelarTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGastoEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGastoEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogastoempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoGastoEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGastoEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGastoEmpresa.gridx =0;
		this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGastoEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoGastoEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoGastoEmpresa = new TipoGastoEmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Gasto Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Gasto Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Gasto Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGastoEmpresaModel tipogastoempresaModel=new TipoGastoEmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoGastoEmpresaModel.TipoGastoEmpresaFocusTraversalPolicy tipogastoempresaFocusTraversalPolicy = tipogastoempresaModel.new TipoGastoEmpresaFocusTraversalPolicy(this);
			
			//tipogastoempresaFocusTraversalPolicy.settipogastoempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipogastoempresaModel);
			
			
			this.jContentPaneDetalleTipoGastoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoGastoEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleTipoGastoEmpresa.setLayout(gridaBagLayoutDetalleTipoGastoEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGastoEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleTipoGastoEmpresa.add(jTtoolBarDetalleTipoGastoEmpresa, gridBagConstraintsTipoGastoEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionTipoGastoEmpresa=   new JScrollPane(jContentPaneDetalleTipoGastoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoGastoEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposTipoGastoEmpresa.add("General",this.jPanelCamposIniciogeneralTipoGastoEmpresa);
		this.jTabbedPaneCamposTipoGastoEmpresa.add("Cuenta Contable",this.jPanelCamposIniciocuenta_contableTipoGastoEmpresa);
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
						
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	        
			this.jContentPaneDetalleTipoGastoEmpresa.add(jTabbedPaneCamposTipoGastoEmpresa, gridBagConstraintsTipoGastoEmpresa);
			
			
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
						&& tipogastoempresaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipogastoempresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoGastoEmpresa= new GridBagConstraints();
						this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
						this.jContentPaneDetalleTipoGastoEmpresa.add(this.jTabbedPaneRelacionesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGastoEmpresa.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoGastoEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
					this.gridBagConstraintsTipoGastoEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleTipoGastoEmpresa.add(jPanelCamposOcultosTipoGastoEmpresa, gridBagConstraintsTipoGastoEmpresa);
				
					this.jPanelCamposOcultosTipoGastoEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	        this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoGastoEmpresa.add(this.jPanelAccionesFormularioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);							
			
			
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoGastoEmpresa.add(this.jPanelAccionesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoGastoEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoGastoEmpresa=   new JScrollPane(this.jPanelCamposTipoGastoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGastoEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGastoEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGastoEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
			this.gridBagConstraintsTipoGastoEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoGastoEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoGastoEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);			
			
			this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
			
			
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		
			
		this.gridBagConstraintsTipoGastoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGastoEmpresa, this.gridBagConstraintsTipoGastoEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoGastoEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoGastoEmpresa;
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
