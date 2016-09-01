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
import com.bydan.erp.contabilidad.util.DetalleAsientoContableConstantesFunciones;

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
public class DetalleAsientoContableDetalleFormJInternalFrame extends DetalleAsientoContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	/*
	public JToolBar jTtoolBarDetalleDetalleAsientoContable;
	
	protected JMenuBar jmenuBarDetalleDetalleAsientoContable;
	
	protected JMenu jmenuDetalleDetalleAsientoContable;
	protected JMenu jmenuDetalleArchivoDetalleAsientoContable;
	protected JMenu jmenuDetalleAccionesDetalleAsientoContable;
	protected JMenu jmenuDetalleDatosDetalleAsientoContable;
	
	*/
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleAsientoContable;	
	protected GridBagConstraints gridBagConstraintsDetalleAsientoContable;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleAsientoContableBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleAsientoContable;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centroactividad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";
	
	public DetalleAsientoContableSessionBean detalleasientocontableSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CentroActividadSessionBean centroactividadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;	
	
	public DetalleAsientoContableLogic detalleasientocontableLogic;
	
	public JScrollPane jScrollPanelDatosDetalleAsientoContable;
	public JScrollPane jScrollPanelDatosEdicionDetalleAsientoContable;
	public JScrollPane jScrollPanelDatosGeneralDetalleAsientoContable;
	
	protected JPanel jPanelCamposDetalleAsientoContable;    
	protected JPanel jPanelCamposOcultosDetalleAsientoContable;    	
	protected JPanel jPanelAccionesDetalleAsientoContable;
	protected JPanel jPanelAccionesFormularioDetalleAsientoContable;
    
	
	
	protected Integer iXPanelCamposDetalleAsientoContable=0;
	protected Integer iYPanelCamposDetalleAsientoContable=0;
	
	protected Integer iXPanelCamposOcultosDetalleAsientoContable=0;
	protected Integer iYPanelCamposOcultosDetalleAsientoContable=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleAsientoContable;
	public JButton jButtonModificarDetalleAsientoContable;
	public JButton jButtonActualizarDetalleAsientoContable;
    public JButton jButtonEliminarDetalleAsientoContable;
	public JButton jButtonCancelarDetalleAsientoContable;
    public JButton jButtonGuardarCambiosDetalleAsientoContable;
	public JButton jButtonGuardarCambiosTablaDetalleAsientoContable;
	protected JButton jButtonCerrarDetalleAsientoContable;
	
	/*
	protected JButton jButtonProcesarInformacionDetalleAsientoContable;
	*/
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleAsientoContable;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleAsientoContable;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleAsientoContable;
	
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarDetalleAsientoContable;
	protected JButton jButtonModificarToolBarDetalleAsientoContable;
	protected JButton jButtonActualizarToolBarDetalleAsientoContable;
    protected JButton jButtonEliminarToolBarDetalleAsientoContable;
	protected JButton jButtonCancelarToolBarDetalleAsientoContable;
    protected JButton jButtonGuardarCambiosToolBarDetalleAsientoContable;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleAsientoContable;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleAsientoContable;
	protected JButton jButtonCerrarToolBarDetalleAsientoContable;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleAsientoContable;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoDetalleAsientoContable;
	protected JMenuItem jMenuItemModificarDetalleAsientoContable;
	protected JMenuItem jMenuItemActualizarDetalleAsientoContable;
    protected JMenuItem jMenuItemEliminarDetalleAsientoContable;
	protected JMenuItem jMenuItemCancelarDetalleAsientoContable;
    protected JMenuItem jMenuItemGuardarCambiosDetalleAsientoContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleAsientoContable;
	protected JMenuItem jMenuItemCerrarDetalleAsientoContable;
	protected JMenuItem jMenuItemDetalleCerrarDetalleAsientoContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleAsientoContable;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleAsientoContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleAsientoContable;
	protected JMenuItem jMenuItemMostrarOcultarDetalleAsientoContable;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleAsientoContable;	
		
	/*
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleAsientoContable;
	*/
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleAsientoContable;
	
	/*	
	
	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleAsientoContable;
	public JLabel jLabelIdDetalleAsientoContable;
	public JLabel jLabelidDetalleAsientoContable;
	public JButton jButtonidDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoDetalleAsientoContable;
	public JLabel jLabelnumero_documentoDetalleAsientoContable;
	public JTextField jTextFieldnumero_documentoDetalleAsientoContable;
	public JButton jButtonnumero_documentoDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPaneldebito_localDetalleAsientoContable;
	public JLabel jLabeldebito_localDetalleAsientoContable;
	public JTextField jTextFielddebito_localDetalleAsientoContable;
	public JButton jButtondebito_localDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelcredito_localDetalleAsientoContable;
	public JLabel jLabelcredito_localDetalleAsientoContable;
	public JTextField jTextFieldcredito_localDetalleAsientoContable;
	public JButton jButtoncredito_localDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPaneldebito_extranDetalleAsientoContable;
	public JLabel jLabeldebito_extranDetalleAsientoContable;
	public JTextField jTextFielddebito_extranDetalleAsientoContable;
	public JButton jButtondebito_extranDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelcredito_extranDetalleAsientoContable;
	public JLabel jLabelcredito_extranDetalleAsientoContable;
	public JTextField jTextFieldcredito_extranDetalleAsientoContable;
	public JButton jButtoncredito_extranDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelcotizacionDetalleAsientoContable;
	public JLabel jLabelcotizacionDetalleAsientoContable;
	public JTextField jTextFieldcotizacionDetalleAsientoContable;
	public JButton jButtoncotizacionDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPaneldetalleDetalleAsientoContable;
	public JLabel jLabeldetalleDetalleAsientoContable;
	public JTextArea jTextAreadetalleDetalleAsientoContable;
	public JScrollPane jscrollPanedetalleDetalleAsientoContable;
	public JButton jButtondetalleDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelcon_centro_costoDetalleAsientoContable;
	public JLabel jLabelcon_centro_costoDetalleAsientoContable;
	public JCheckBox jCheckBoxcon_centro_costoDetalleAsientoContable;
	public JButton jButtoncon_centro_costoDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelfechaDetalleAsientoContable;
	public JLabel jLabelfechaDetalleAsientoContable;
	//public JFormattedTextField jDateChooserfechaDetalleAsientoContable;

	public JDateChooser jDateChooserfechaDetalleAsientoContable;
	public JButton jButtonfechaDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelnumero_depositoDetalleAsientoContable;
	public JLabel jLabelnumero_depositoDetalleAsientoContable;
	public JTextField jTextFieldnumero_depositoDetalleAsientoContable;
	public JButton jButtonnumero_depositoDetalleAsientoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleAsientoContable;
	public JLabel jLabelid_empresaDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleAsientoContable;
	public JButton jButtonid_empresaDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_empresaDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleAsientoContable;
	public JLabel jLabelid_sucursalDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleAsientoContable;
	public JButton jButtonid_sucursalDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_sucursalDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableDetalleAsientoContable;
	public JLabel jLabelid_asiento_contableDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableDetalleAsientoContable;
	public JButton jButtonid_asiento_contableDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_asiento_contableDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleAsientoContable;
	public JLabel jLabelid_ejercicioDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleAsientoContable;
	public JButton jButtonid_ejercicioDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleAsientoContable;
	public JLabel jLabelid_periodoDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleAsientoContable;
	public JButton jButtonid_periodoDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_periodoDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleAsientoContable;
	public JLabel jLabelid_anioDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleAsientoContable;
	public JButton jButtonid_anioDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_anioDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleAsientoContable;
	public JLabel jLabelid_mesDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleAsientoContable;
	public JButton jButtonid_mesDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_mesDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableDetalleAsientoContable;
	public JLabel jLabelid_cuenta_contableDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableDetalleAsientoContable;
	public JButton jButtonid_cuenta_contableDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_cuenta_contableDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableDetalleAsientoContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableDetalleAsientoContableArbol= new JButtonMe();

	public JPanel jPanelid_centro_actividadDetalleAsientoContable;
	public JLabel jLabelid_centro_actividadDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_actividadDetalleAsientoContable;
	public JButton jButtonid_centro_actividadDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_centro_actividadDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_centro_actividadDetalleAsientoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetalleAsientoContable;
	public JLabel jLabelid_centro_costoDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetalleAsientoContable;
	public JButton jButtonid_centro_costoDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleAsientoContableBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleAsientoContableArbol= new JButtonMe();

	public JPanel jPanelid_tipo_cambioDetalleAsientoContable;
	public JLabel jLabelid_tipo_cambioDetalleAsientoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioDetalleAsientoContable;
	public JButton jButtonid_tipo_cambioDetalleAsientoContable= new JButtonMe();
	public JButton jButtonid_tipo_cambioDetalleAsientoContableUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioDetalleAsientoContableBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleAsientoContable;
	
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
		
	public int iWidthFormulario=880;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleAsientoContableDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleAsientoContable=new JPanel();
				this.jPanelAccionesFormularioDetalleAsientoContable=new JPanel();
				this.jmenuBarDetalleDetalleAsientoContable=new JMenuBar();
				this.jTtoolBarDetalleDetalleAsientoContable=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleAsientoContableDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleAsientoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	public JButton getjButtonActualizarToolBarDetalleAsientoContable() {
		return this.jButtonActualizarToolBarDetalleAsientoContable;
	}
	
	public JButton getjButtonEliminarToolBarDetalleAsientoContable() {
		return this.jButtonEliminarToolBarDetalleAsientoContable;
	}
	
	public JButton getjButtonCancelarToolBarDetalleAsientoContable() {
		return this.jButtonCancelarToolBarDetalleAsientoContable;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleAsientoContable() {
		return this.jButtonProcesarInformacionDetalleAsientoContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleAsientoContable)	{
		this.jButtonProcesarInformacionDetalleAsientoContable = jButtonProcesarInformacionDetalleAsientoContable;
	}
	*/
	
	

	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleAsientoContable() {
		return this.jComboBoxTiposAccionesDetalleAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleAsientoContable(
			JComboBox jComboBoxTiposRelacionesDetalleAsientoContable) {
		this.jComboBoxTiposRelacionesDetalleAsientoContable = jComboBoxTiposRelacionesDetalleAsientoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleAsientoContable(
			JComboBox jComboBoxTiposAccionesDetalleAsientoContable) {
		this.jComboBoxTiposAccionesDetalleAsientoContable = jComboBoxTiposAccionesDetalleAsientoContable;
	}		
	
	*/		
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleAsientoContable() {
		return this.jComboBoxTiposAccionesFormularioDetalleAsientoContable;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleAsientoContable(
			JComboBox jComboBoxTiposAccionesFormularioDetalleAsientoContable) {
		this.jComboBoxTiposAccionesFormularioDetalleAsientoContable = jComboBoxTiposAccionesFormularioDetalleAsientoContable;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleasientocontableSessionBean=new DetalleAsientoContableSessionBean();
		
		this.detalleasientocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleasientocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleasientocontableSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleAsientoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleAsientoContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Asiento Contable MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleasientocontableSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleAsientoContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleAsientoContable= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleAsientoContable=new JButtonMe();
				this.jButtonModificarToolBarDetalleAsientoContable=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleAsientoContable,this.jTtoolBarDetalleDetalleAsientoContable,
							"actualizar","actualizar","Actualizar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleAsientoContable,this.jTtoolBarDetalleDetalleAsientoContable,
							"eliminar","eliminar","Eliminar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleAsientoContable,this.jTtoolBarDetalleDetalleAsientoContable,
							"cancelar","cancelar","Cancelar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleAsientoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleAsientoContable,this.jTtoolBarDetalleDetalleAsientoContable,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	*/
	
	/*
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleAsientoContable=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleAsientoContable=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleAsientoContable=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleAsientoContable=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleAsientoContable=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleAsientoContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleAsientoContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleAsientoContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleAsientoContable= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleAsientoContable.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleAsientoContable,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleAsientoContable= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleAsientoContable.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleAsientoContable,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleAsientoContable= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleAsientoContable.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleAsientoContable,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleAsientoContable= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleAsientoContable.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleAsientoContable,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleAsientoContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleAsientoContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleAsientoContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleAsientoContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleAsientoContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleAsientoContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleAsientoContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleAsientoContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleAsientoContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleAsientoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleAsientoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleAsientoContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleAsientoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleAsientoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleAsientoContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleAsientoContable.add(this.jMenuItemDetalleCerrarDetalleAsientoContable);
		
		this.jmenuDetalleAccionesDetalleAsientoContable.add(this.jMenuItemActualizarDetalleAsientoContable);
		this.jmenuDetalleAccionesDetalleAsientoContable.add(this.jMenuItemEliminarDetalleAsientoContable);
		this.jmenuDetalleAccionesDetalleAsientoContable.add(this.jMenuItemCancelarDetalleAsientoContable);		
		
		//this.jmenuDetalleDatosDetalleAsientoContable.add(this.jMenuItemDetalleAbrirOrderByDetalleAsientoContable);				
		this.jmenuDetalleDatosDetalleAsientoContable.add(this.jMenuItemDetalleMostarOcultarDetalleAsientoContable);				
				
		//this.jmenuDetalleAccionesDetalleAsientoContable.add(this.jMenuItemGuardarCambiosDetalleAsientoContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleAsientoContable.add(this.jmenuDetalleArchivoDetalleAsientoContable);		
		this.jmenuBarDetalleDetalleAsientoContable.add(this.jmenuDetalleAccionesDetalleAsientoContable);		
		this.jmenuBarDetalleDetalleAsientoContable.add(this.jmenuDetalleDatosDetalleAsientoContable);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleAsientoContable);				
	}
	*/
	
	public void inicializarElementosCamposDetalleAsientoContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleAsientoContable = new JLabelMe();
		jLabelIdDetalleAsientoContable.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleAsientoContable = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleAsientoContable= new GridBagLayout();

		this.jPanelidDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);

		jLabelidDetalleAsientoContable = new JLabel();
		jLabelidDetalleAsientoContable.setText("Id");

		jLabelidDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_documentoDetalleAsientoContable = new JLabelMe();
		this.jLabelnumero_documentoDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_NUMERODOCUMENTO+" : *");
		this.jLabelnumero_documentoDetalleAsientoContable.setToolTipText("No Documento");
		this.jLabelnumero_documentoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_documentoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_documentoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelnumero_documentoDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jTextFieldnumero_documentoDetalleAsientoContable= new JTextFieldMe();

		jTextFieldnumero_documentoDetalleAsientoContable.setEnabled(false);
		jTextFieldnumero_documentoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonnumero_documentoDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoDetalleAsientoContableBusqueda.setText("U");
		this.jButtonnumero_documentoDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoDetalleAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabeldebito_localDetalleAsientoContable = new JLabelMe();
		this.jLabeldebito_localDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_DEBITOLOCAL+" : *");
		this.jLabeldebito_localDetalleAsientoContable.setToolTipText("Debito Local");
		this.jLabeldebito_localDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_localDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_localDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_localDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_localDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_DEBITOLOCAL);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPaneldebito_localDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jTextFielddebito_localDetalleAsientoContable= new JTextFieldMe();
		jTextFielddebito_localDetalleAsientoContable.setEnabled(false);
		jTextFielddebito_localDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_localDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_localDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_localDetalleAsientoContable.setText("0.0");

		this.jButtondebito_localDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtondebito_localDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_localDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_localDetalleAsientoContableBusqueda.setText("U");
		this.jButtondebito_localDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_localDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_localDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_localDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_localDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_localDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_localDetalleAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelcredito_localDetalleAsientoContable = new JLabelMe();
		this.jLabelcredito_localDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_CREDITOLOCAL+" : *");
		this.jLabelcredito_localDetalleAsientoContable.setToolTipText("Credito Local");
		this.jLabelcredito_localDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_localDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_localDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_localDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_localDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_CREDITOLOCAL);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelcredito_localDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jTextFieldcredito_localDetalleAsientoContable= new JTextFieldMe();
		jTextFieldcredito_localDetalleAsientoContable.setEnabled(false);
		jTextFieldcredito_localDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_localDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_localDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_localDetalleAsientoContable.setText("0.0");

		this.jButtoncredito_localDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtoncredito_localDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_localDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_localDetalleAsientoContableBusqueda.setText("U");
		this.jButtoncredito_localDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_localDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_localDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_localDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_localDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_localDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_localDetalleAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabeldebito_extranDetalleAsientoContable = new JLabelMe();
		this.jLabeldebito_extranDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_DEBITOEXTRAN+" : *");
		this.jLabeldebito_extranDetalleAsientoContable.setToolTipText("Debito Extran");
		this.jLabeldebito_extranDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_extranDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_extranDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_extranDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_extranDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_extranDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_DEBITOEXTRAN);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPaneldebito_extranDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jTextFielddebito_extranDetalleAsientoContable= new JTextFieldMe();
		jTextFielddebito_extranDetalleAsientoContable.setEnabled(false);
		jTextFielddebito_extranDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_extranDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_extranDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_extranDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_extranDetalleAsientoContable.setText("0.0");

		this.jButtondebito_extranDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtondebito_extranDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_extranDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_extranDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_extranDetalleAsientoContableBusqueda.setText("U");
		this.jButtondebito_extranDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_extranDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_extranDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_extranDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_extranDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_extranDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_extranDetalleAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelcredito_extranDetalleAsientoContable = new JLabelMe();
		this.jLabelcredito_extranDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_CREDITOEXTRAN+" : *");
		this.jLabelcredito_extranDetalleAsientoContable.setToolTipText("Credito Extran");
		this.jLabelcredito_extranDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_extranDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_extranDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_extranDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_extranDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_extranDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_CREDITOEXTRAN);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelcredito_extranDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jTextFieldcredito_extranDetalleAsientoContable= new JTextFieldMe();
		jTextFieldcredito_extranDetalleAsientoContable.setEnabled(false);
		jTextFieldcredito_extranDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_extranDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_extranDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_extranDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_extranDetalleAsientoContable.setText("0.0");

		this.jButtoncredito_extranDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtoncredito_extranDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_extranDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_extranDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_extranDetalleAsientoContableBusqueda.setText("U");
		this.jButtoncredito_extranDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_extranDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_extranDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_extranDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_extranDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_extranDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_extranDetalleAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelcotizacionDetalleAsientoContable = new JLabelMe();
		this.jLabelcotizacionDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_COTIZACION+" : *");
		this.jLabelcotizacionDetalleAsientoContable.setToolTipText("Cotizacion");
		this.jLabelcotizacionDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcotizacionDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcotizacionDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcotizacionDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_COTIZACION);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelcotizacionDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jTextFieldcotizacionDetalleAsientoContable= new JTextFieldMe();
		jTextFieldcotizacionDetalleAsientoContable.setEnabled(false);
		jTextFieldcotizacionDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcotizacionDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcotizacionDetalleAsientoContable.setText("0.0");

		this.jButtoncotizacionDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtoncotizacionDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncotizacionDetalleAsientoContableBusqueda.setText("U");
		this.jButtoncotizacionDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncotizacionDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncotizacionDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcotizacionDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcotizacionDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cotizacionDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncotizacionDetalleAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabeldetalleDetalleAsientoContable = new JLabelMe();
		this.jLabeldetalleDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetalleDetalleAsientoContable.setToolTipText("Detalle");
		this.jLabeldetalleDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPaneldetalleDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jTextAreadetalleDetalleAsientoContable= new JTextAreaMe();
		jTextAreadetalleDetalleAsientoContable.setEnabled(false);
		jTextAreadetalleDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDetalleAsientoContable.setLineWrap(true);
		jTextAreadetalleDetalleAsientoContable.setWrapStyleWord(true);
		jTextAreadetalleDetalleAsientoContable.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleDetalleAsientoContable.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleDetalleAsientoContable = new JScrollPane(jTextAreadetalleDetalleAsientoContable);
		jscrollPanedetalleDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetalleDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtondetalleDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleDetalleAsientoContableBusqueda.setText("U");
		this.jButtondetalleDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleDetalleAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelcon_centro_costoDetalleAsientoContable = new JLabelMe();
		this.jLabelcon_centro_costoDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_CONCENTROCOSTO+" : *");
		this.jLabelcon_centro_costoDetalleAsientoContable.setToolTipText("Con Centro Costo");
		this.jLabelcon_centro_costoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_centro_costoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_centro_costoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_centro_costoDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_centro_costoDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_centro_costoDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_CONCENTROCOSTO);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelcon_centro_costoDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jCheckBoxcon_centro_costoDetalleAsientoContable= new JCheckBoxMe();
		jCheckBoxcon_centro_costoDetalleAsientoContable.setEnabled(false);

		jCheckBoxcon_centro_costoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_centro_costoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_centro_costoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_centro_costoDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_centro_costoDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtoncon_centro_costoDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_centro_costoDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_centro_costoDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_centro_costoDetalleAsientoContableBusqueda.setText("U");
		this.jButtoncon_centro_costoDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_centro_costoDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_centro_costoDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_centro_costoDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_centro_costoDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_centro_costoDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_centro_costoDetalleAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelfechaDetalleAsientoContable = new JLabelMe();
		this.jLabelfechaDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaDetalleAsientoContable.setToolTipText("Fecha");
		this.jLabelfechaDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelfechaDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		//jFormattedTextFieldfechaDetalleAsientoContable= new JFormattedTextFieldMe();

		jDateChooserfechaDetalleAsientoContable= new JDateChooser();
		jDateChooserfechaDetalleAsientoContable.setEnabled(false);
		jDateChooserfechaDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaDetalleAsientoContable.setDate(new Date());
		jDateChooserfechaDetalleAsientoContable.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaDetalleAsientoContable.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonfechaDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaDetalleAsientoContableBusqueda.setText("U");
		this.jButtonfechaDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaDetalleAsientoContableBusqueda.setVisible(false);		}


					
		this.jLabelnumero_depositoDetalleAsientoContable = new JLabelMe();
		this.jLabelnumero_depositoDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_NUMERODEPOSITO+" :");
		this.jLabelnumero_depositoDetalleAsientoContable.setToolTipText("Numero Deposito");
		this.jLabelnumero_depositoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_depositoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_depositoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_depositoDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_depositoDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_depositoDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_NUMERODEPOSITO);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelnumero_depositoDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jTextFieldnumero_depositoDetalleAsientoContable= new JTextFieldMe();

		jTextFieldnumero_depositoDetalleAsientoContable.setEnabled(false);
		jTextFieldnumero_depositoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_depositoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_depositoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_depositoDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_depositoDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonnumero_depositoDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_depositoDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_depositoDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_depositoDetalleAsientoContableBusqueda.setText("U");
		this.jButtonnumero_depositoDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_depositoDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_depositoDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_depositoDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_depositoDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_depositoDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_depositoDetalleAsientoContableBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleAsientoContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleAsientoContable = new JLabelMe();
		this.jLabelid_empresaDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleAsientoContable.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelid_empresaDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jComboBoxid_empresaDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_empresaDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleAsientoContable.setEnabled(false);

		this.jButtonid_empresaDetalleAsientoContable= new JButtonMe();
		this.jButtonid_empresaDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleAsientoContable.setText("Buscar");
		this.jButtonid_empresaDetalleAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleAsientoContable"));

		this.jButtonid_empresaDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleAsientoContableBusqueda.setText("U");
		this.jButtonid_empresaDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleAsientoContableUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleAsientoContableUpdate.setText("U");
		this.jButtonid_empresaDetalleAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleAsientoContableUpdate"));



					
		this.jLabelid_sucursalDetalleAsientoContable = new JLabelMe();
		this.jLabelid_sucursalDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleAsientoContable.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelid_sucursalDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jComboBoxid_sucursalDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_sucursalDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleAsientoContable.setEnabled(false);

		this.jButtonid_sucursalDetalleAsientoContable= new JButtonMe();
		this.jButtonid_sucursalDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleAsientoContable.setText("Buscar");
		this.jButtonid_sucursalDetalleAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleAsientoContable"));

		this.jButtonid_sucursalDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleAsientoContableBusqueda.setText("U");
		this.jButtonid_sucursalDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleAsientoContableUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleAsientoContableUpdate.setText("U");
		this.jButtonid_sucursalDetalleAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleAsientoContableUpdate"));



					
		this.jLabelid_asiento_contableDetalleAsientoContable = new JLabelMe();
		this.jLabelid_asiento_contableDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableDetalleAsientoContable.setToolTipText("Asiento C.");
		this.jLabelid_asiento_contableDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelid_asiento_contableDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jComboBoxid_asiento_contableDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_asiento_contableDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableDetalleAsientoContable= new JButtonMe();
		this.jButtonid_asiento_contableDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleAsientoContable.setText("Buscar");
		this.jButtonid_asiento_contableDetalleAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableDetalleAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleAsientoContable"));

		this.jButtonid_asiento_contableDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetalleAsientoContableBusqueda.setText("U");
		this.jButtonid_asiento_contableDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableDetalleAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableDetalleAsientoContableUpdate= new JButtonMe();
		this.jButtonid_asiento_contableDetalleAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetalleAsientoContableUpdate.setText("U");
		this.jButtonid_asiento_contableDetalleAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableDetalleAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleAsientoContableUpdate"));



					
		this.jLabelid_ejercicioDetalleAsientoContable = new JLabelMe();
		this.jLabelid_ejercicioDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleAsientoContable.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelid_ejercicioDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jComboBoxid_ejercicioDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleAsientoContable.setEnabled(false);

		this.jButtonid_ejercicioDetalleAsientoContable= new JButtonMe();
		this.jButtonid_ejercicioDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleAsientoContable.setText("Buscar");
		this.jButtonid_ejercicioDetalleAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleAsientoContable"));

		this.jButtonid_ejercicioDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleAsientoContableBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleAsientoContableUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleAsientoContableUpdate.setText("U");
		this.jButtonid_ejercicioDetalleAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleAsientoContableUpdate"));



					
		this.jLabelid_periodoDetalleAsientoContable = new JLabelMe();
		this.jLabelid_periodoDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleAsientoContable.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelid_periodoDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jComboBoxid_periodoDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_periodoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleAsientoContable.setEnabled(false);

		this.jButtonid_periodoDetalleAsientoContable= new JButtonMe();
		this.jButtonid_periodoDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleAsientoContable.setText("Buscar");
		this.jButtonid_periodoDetalleAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleAsientoContable"));

		this.jButtonid_periodoDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleAsientoContableBusqueda.setText("U");
		this.jButtonid_periodoDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleAsientoContableUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleAsientoContableUpdate.setText("U");
		this.jButtonid_periodoDetalleAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleAsientoContableUpdate"));



					
		this.jLabelid_anioDetalleAsientoContable = new JLabelMe();
		this.jLabelid_anioDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleAsientoContable.setToolTipText("Anio");
		this.jLabelid_anioDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelid_anioDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jComboBoxid_anioDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_anioDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleAsientoContable.setEnabled(false);

		this.jButtonid_anioDetalleAsientoContable= new JButtonMe();
		this.jButtonid_anioDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleAsientoContable.setText("Buscar");
		this.jButtonid_anioDetalleAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleAsientoContable"));

		this.jButtonid_anioDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleAsientoContableBusqueda.setText("U");
		this.jButtonid_anioDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleAsientoContableUpdate= new JButtonMe();
		this.jButtonid_anioDetalleAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleAsientoContableUpdate.setText("U");
		this.jButtonid_anioDetalleAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleAsientoContableUpdate"));



					
		this.jLabelid_mesDetalleAsientoContable = new JLabelMe();
		this.jLabelid_mesDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleAsientoContable.setToolTipText("Mes");
		this.jLabelid_mesDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelid_mesDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jComboBoxid_mesDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_mesDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleAsientoContable.setEnabled(false);

		this.jButtonid_mesDetalleAsientoContable= new JButtonMe();
		this.jButtonid_mesDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleAsientoContable.setText("Buscar");
		this.jButtonid_mesDetalleAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleAsientoContable"));

		this.jButtonid_mesDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleAsientoContableBusqueda.setText("U");
		this.jButtonid_mesDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleAsientoContableUpdate= new JButtonMe();
		this.jButtonid_mesDetalleAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleAsientoContableUpdate.setText("U");
		this.jButtonid_mesDetalleAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleAsientoContableUpdate"));



					
		this.jLabelid_cuenta_contableDetalleAsientoContable = new JLabelMe();
		this.jLabelid_cuenta_contableDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableDetalleAsientoContable.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelid_cuenta_contableDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jComboBoxid_cuenta_contableDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_cuenta_contableDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableDetalleAsientoContable= new JButtonMe();
		this.jButtonid_cuenta_contableDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDetalleAsientoContable.setText("Buscar");
		this.jButtonid_cuenta_contableDetalleAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableDetalleAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetalleAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetalleAsientoContable"));

		this.jButtonid_cuenta_contableDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableDetalleAsientoContableBusqueda.setText("U");
		this.jButtonid_cuenta_contableDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableDetalleAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableDetalleAsientoContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableDetalleAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetalleAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetalleAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableDetalleAsientoContableUpdate.setText("U");
		this.jButtonid_cuenta_contableDetalleAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableDetalleAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetalleAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetalleAsientoContableUpdate"));


		jButtonid_cuenta_contableDetalleAsientoContableArbol= new JButtonMe();
		jButtonid_cuenta_contableDetalleAsientoContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDetalleAsientoContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDetalleAsientoContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDetalleAsientoContableArbol.setText("Arbol");
		jButtonid_cuenta_contableDetalleAsientoContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableDetalleAsientoContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetalleAsientoContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetalleAsientoContableArbol"));



					
		this.jLabelid_centro_actividadDetalleAsientoContable = new JLabelMe();
		this.jLabelid_centro_actividadDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_IDCENTROACTIVIDAD+" :");
		this.jLabelid_centro_actividadDetalleAsientoContable.setToolTipText("Centro Actividad");
		this.jLabelid_centro_actividadDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_centro_actividadDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_centro_actividadDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_actividadDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_actividadDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_actividadDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_IDCENTROACTIVIDAD);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelid_centro_actividadDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jComboBoxid_centro_actividadDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_centro_actividadDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_actividadDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_actividadDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_actividadDetalleAsientoContable= new JButtonMe();
		this.jButtonid_centro_actividadDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_actividadDetalleAsientoContable.setText("Buscar");
		this.jButtonid_centro_actividadDetalleAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_actividadDetalleAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadDetalleAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_actividadDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadDetalleAsientoContable"));

		this.jButtonid_centro_actividadDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_centro_actividadDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_actividadDetalleAsientoContableBusqueda.setText("U");
		this.jButtonid_centro_actividadDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_actividadDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_actividadDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_actividadDetalleAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_centro_actividadDetalleAsientoContableUpdate= new JButtonMe();
		this.jButtonid_centro_actividadDetalleAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadDetalleAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_actividadDetalleAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_actividadDetalleAsientoContableUpdate.setText("U");
		this.jButtonid_centro_actividadDetalleAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_actividadDetalleAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_actividadDetalleAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_actividadDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_actividadDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_actividadDetalleAsientoContableUpdate"));



					
		this.jLabelid_centro_costoDetalleAsientoContable = new JLabelMe();
		this.jLabelid_centro_costoDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoDetalleAsientoContable.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelid_centro_costoDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jComboBoxid_centro_costoDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_centro_costoDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoDetalleAsientoContable= new JButtonMe();
		this.jButtonid_centro_costoDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleAsientoContable.setText("Buscar");
		this.jButtonid_centro_costoDetalleAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetalleAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleAsientoContable"));

		this.jButtonid_centro_costoDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleAsientoContableBusqueda.setText("U");
		this.jButtonid_centro_costoDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetalleAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetalleAsientoContableUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetalleAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleAsientoContableUpdate.setText("U");
		this.jButtonid_centro_costoDetalleAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetalleAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleAsientoContableUpdate"));


		jButtonid_centro_costoDetalleAsientoContableArbol= new JButtonMe();
		jButtonid_centro_costoDetalleAsientoContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleAsientoContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleAsientoContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleAsientoContableArbol.setText("Arbol");
		jButtonid_centro_costoDetalleAsientoContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetalleAsientoContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleAsientoContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleAsientoContableArbol"));



					
		this.jLabelid_tipo_cambioDetalleAsientoContable = new JLabelMe();
		this.jLabelid_tipo_cambioDetalleAsientoContable.setText(""+DetalleAsientoContableConstantesFunciones.LABEL_IDTIPOCAMBIO+" :");
		this.jLabelid_tipo_cambioDetalleAsientoContable.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioDetalleAsientoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioDetalleAsientoContable.setToolTipText(DetalleAsientoContableConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		this.jPanelid_tipo_cambioDetalleAsientoContable.setLayout(this.gridaBagLayoutDetalleAsientoContable);


		jComboBoxid_tipo_cambioDetalleAsientoContable= new JComboBoxMe();
		jComboBoxid_tipo_cambioDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_cambioDetalleAsientoContable.setEnabled(false);

		this.jButtonid_tipo_cambioDetalleAsientoContable= new JButtonMe();
		this.jButtonid_tipo_cambioDetalleAsientoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioDetalleAsientoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioDetalleAsientoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioDetalleAsientoContable.setText("Buscar");
		this.jButtonid_tipo_cambioDetalleAsientoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioDetalleAsientoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioDetalleAsientoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioDetalleAsientoContable"));

		this.jButtonid_tipo_cambioDetalleAsientoContableBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioDetalleAsientoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioDetalleAsientoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioDetalleAsientoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioDetalleAsientoContableBusqueda.setText("U");
		this.jButtonid_tipo_cambioDetalleAsientoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioDetalleAsientoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioDetalleAsientoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioDetalleAsientoContableBusqueda"));

		if(this.detalleasientocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioDetalleAsientoContableBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioDetalleAsientoContableUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioDetalleAsientoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioDetalleAsientoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioDetalleAsientoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioDetalleAsientoContableUpdate.setText("U");
		this.jButtonid_tipo_cambioDetalleAsientoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioDetalleAsientoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioDetalleAsientoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioDetalleAsientoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioDetalleAsientoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioDetalleAsientoContableUpdate"));



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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleDetalleAsientoContable = new DetalleAsientoContableBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Asiento Contable DATOS");
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutDetalleAsientoContable= new GridBagLayout();
		

		
		String sToolTipDetalleAsientoContable="";
		sToolTipDetalleAsientoContable=DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleAsientoContable+="(Contabilidad.DetalleAsientoContable)";
		}
		
		if(!this.detalleasientocontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleAsientoContable+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleAsientoContable = new JButtonMe();
		this.jButtonModificarDetalleAsientoContable = new JButtonMe();
        this.jButtonActualizarDetalleAsientoContable = new JButtonMe();
        this.jButtonEliminarDetalleAsientoContable = new JButtonMe();
        this.jButtonCancelarDetalleAsientoContable = new JButtonMe();
        this.jButtonGuardarCambiosDetalleAsientoContable = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleAsientoContable = new JButtonMe();
		this.jButtonCerrarDetalleAsientoContable = new JButtonMe();
		
		this.jScrollPanelDatosDetalleAsientoContable = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleAsientoContable = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleAsientoContable = new JScrollPane();
		//this.jScrollPanelDatosDetalleAsientoContableTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Asiento Contable";
		
		if(!this.detalleasientocontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleAsientoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleAsientoContableTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleAsientoContable.setName("jPanelCamposDetalleAsientoContable"); 

		this.jPanelCamposOcultosDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleAsientoContable.setName("jPanelCamposOcultosDetalleAsientoContable"); 

        this.jPanelAccionesDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleAsientoContable.setToolTipText("Acciones");
        this.jPanelAccionesDetalleAsientoContable.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleAsientoContable.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleAsientoContable.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleAsientoContable.setText("Nuevo");
		this.jButtonModificarDetalleAsientoContable.setText("Editar");
        this.jButtonActualizarDetalleAsientoContable.setText("Actualizar");
        this.jButtonEliminarDetalleAsientoContable.setText("Eliminar");
        this.jButtonCancelarDetalleAsientoContable.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleAsientoContable.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleAsientoContable.setText("Guardar");
		this.jButtonCerrarDetalleAsientoContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleAsientoContable,"nuevo_button","Nuevo",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleAsientoContable,"modificar_button","Editar",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleAsientoContable,"actualizar_button","Actualizar",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleAsientoContable,"eliminar_button","Eliminar",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleAsientoContable,"cancelar_button","Cancelar",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleAsientoContable,"guardarcambios_button","Guardar",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleAsientoContable,"guardarcambiostabla_button","Guardar",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleAsientoContable,"cerrar_button","Salir",this.detalleasientocontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleAsientoContable.setToolTipText("Nuevo"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleAsientoContable.setToolTipText("Editar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleAsientoContable.setToolTipText("Actualizar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleAsientoContable.setToolTipText("Eliminar)"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleAsientoContable.setToolTipText("Cancelar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleAsientoContable.setToolTipText("Guardar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleAsientoContable.setToolTipText("Guardar"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleAsientoContable.setToolTipText("Salir"+" "+DetalleAsientoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleAsientoContable";
		inputMap = this.jButtonNuevoDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleAsientoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleAsientoContable"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleAsientoContable";
		inputMap = this.jButtonActualizarDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleAsientoContable"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleAsientoContable";
		inputMap = this.jButtonEliminarDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleAsientoContable"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleAsientoContable";
		inputMap = this.jButtonCancelarDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleAsientoContable"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleAsientoContable";
		inputMap = this.jButtonCerrarDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleAsientoContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleAsientoContable";
		inputMap = this.jButtonGuardarCambiosTablaDetalleAsientoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleAsientoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleAsientoContable"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleAsientoContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleAsientoContable.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleAsientoContable.setToolTipText("Nuevo DetalleAsientoContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleAsientoContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleAsientoContable.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleAsientoContable.setToolTipText("Sin Cerrar Ventana DetalleAsientoContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleAsientoContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleAsientoContable.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleAsientoContable.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
		/*	
			
		this.jComboBoxTiposAccionesDetalleAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleAsientoContable.setText("Accion");
		this.jComboBoxTiposAccionesDetalleAsientoContable.setToolTipText("Tipos de Acciones");
							
		*/

		this.jComboBoxTiposAccionesFormularioDetalleAsientoContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleAsientoContable.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleAsientoContable.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleAsientoContable = new JLabelMe();
		
		this.jLabelAccionesDetalleAsientoContable.setText("Acciones");		
		this.jLabelAccionesDetalleAsientoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleAsientoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleAsientoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleAsientoContable();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleAsientoContable();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleAsientoContable=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleAsientoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleAsientoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		/*
		this.jComboBoxTiposAccionesDetalleAsientoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleAsientoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleAsientoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		*/
		
		this.jComboBoxTiposAccionesFormularioDetalleAsientoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleAsientoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleAsientoContable.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleAsientoContable, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleAsientoContable = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleAsientoContable = new GridBagLayout();
		
		this.jPanelCamposDetalleAsientoContable.setLayout(gridaBagLayoutCamposDetalleAsientoContable);
		this.jPanelCamposOcultosDetalleAsientoContable.setLayout(gridaBagLayoutCamposOcultosDetalleAsientoContable);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidDetalleAsientoContable.add(jLabelIdDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidDetalleAsientoContable.add(jLabelidDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaDetalleAsientoContable.add(jLabelid_empresaDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleAsientoContable.add(jButtonid_empresaDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleAsientoContable.add(jButtonid_empresaDetalleAsientoContableUpdate, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaDetalleAsientoContable.add(jComboBoxid_empresaDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalDetalleAsientoContable.add(jLabelid_sucursalDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleAsientoContable.add(jButtonid_sucursalDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleAsientoContable.add(jButtonid_sucursalDetalleAsientoContableUpdate, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalDetalleAsientoContable.add(jComboBoxid_sucursalDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableDetalleAsientoContable.add(jLabelid_asiento_contableDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableDetalleAsientoContable.add(jButtonid_asiento_contableDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetalleAsientoContable.add(jButtonid_asiento_contableDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 4;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetalleAsientoContable.add(jButtonid_asiento_contableDetalleAsientoContableUpdate, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableDetalleAsientoContable.add(jComboBoxid_asiento_contableDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_documentoDetalleAsientoContable.add(jLabelnumero_documentoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoDetalleAsientoContable.add(jButtonnumero_documentoDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_documentoDetalleAsientoContable.add(jTextFieldnumero_documentoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioDetalleAsientoContable.add(jLabelid_ejercicioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleAsientoContable.add(jButtonid_ejercicioDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleAsientoContable.add(jButtonid_ejercicioDetalleAsientoContableUpdate, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioDetalleAsientoContable.add(jComboBoxid_ejercicioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoDetalleAsientoContable.add(jLabelid_periodoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleAsientoContable.add(jButtonid_periodoDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleAsientoContable.add(jButtonid_periodoDetalleAsientoContableUpdate, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoDetalleAsientoContable.add(jComboBoxid_periodoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioDetalleAsientoContable.add(jLabelid_anioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleAsientoContable.add(jButtonid_anioDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleAsientoContable.add(jButtonid_anioDetalleAsientoContableUpdate, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioDetalleAsientoContable.add(jComboBoxid_anioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesDetalleAsientoContable.add(jLabelid_mesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleAsientoContable.add(jButtonid_mesDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleAsientoContable.add(jButtonid_mesDetalleAsientoContableUpdate, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesDetalleAsientoContable.add(jComboBoxid_mesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cuenta_contableDetalleAsientoContable.add(jLabelid_cuenta_contableDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableDetalleAsientoContable.add(jButtonid_cuenta_contableDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 3;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableDetalleAsientoContable.add(jButtonid_cuenta_contableDetalleAsientoContableArbol, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 4;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableDetalleAsientoContable.add(jButtonid_cuenta_contableDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 5;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableDetalleAsientoContable.add(jButtonid_cuenta_contableDetalleAsientoContableUpdate, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cuenta_contableDetalleAsientoContable.add(jComboBoxid_cuenta_contableDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldebito_localDetalleAsientoContable.add(jLabeldebito_localDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_localDetalleAsientoContable.add(jButtondebito_localDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldebito_localDetalleAsientoContable.add(jTextFielddebito_localDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcredito_localDetalleAsientoContable.add(jLabelcredito_localDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_localDetalleAsientoContable.add(jButtoncredito_localDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcredito_localDetalleAsientoContable.add(jTextFieldcredito_localDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldebito_extranDetalleAsientoContable.add(jLabeldebito_extranDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_extranDetalleAsientoContable.add(jButtondebito_extranDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldebito_extranDetalleAsientoContable.add(jTextFielddebito_extranDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcredito_extranDetalleAsientoContable.add(jLabelcredito_extranDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_extranDetalleAsientoContable.add(jButtoncredito_extranDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcredito_extranDetalleAsientoContable.add(jTextFieldcredito_extranDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_centro_actividadDetalleAsientoContable.add(jLabelid_centro_actividadDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_actividadDetalleAsientoContable.add(jButtonid_centro_actividadDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_actividadDetalleAsientoContable.add(jButtonid_centro_actividadDetalleAsientoContableUpdate, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_centro_actividadDetalleAsientoContable.add(jComboBoxid_centro_actividadDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_centro_costoDetalleAsientoContable.add(jLabelid_centro_costoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetalleAsientoContable.add(jButtonid_centro_costoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 3;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetalleAsientoContable.add(jButtonid_centro_costoDetalleAsientoContableArbol, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 4;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleAsientoContable.add(jButtonid_centro_costoDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 5;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleAsientoContable.add(jButtonid_centro_costoDetalleAsientoContableUpdate, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_centro_costoDetalleAsientoContable.add(jComboBoxid_centro_costoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcotizacionDetalleAsientoContable.add(jLabelcotizacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelcotizacionDetalleAsientoContable.add(jButtoncotizacionDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcotizacionDetalleAsientoContable.add(jTextFieldcotizacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldetalleDetalleAsientoContable.add(jLabeldetalleDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleDetalleAsientoContable.add(jButtondetalleDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldetalleDetalleAsientoContable.add(jscrollPanedetalleDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_cambioDetalleAsientoContable.add(jLabelid_tipo_cambioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioDetalleAsientoContable.add(jButtonid_tipo_cambioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioDetalleAsientoContable.add(jButtonid_tipo_cambioDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 4;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioDetalleAsientoContable.add(jButtonid_tipo_cambioDetalleAsientoContableUpdate, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_cambioDetalleAsientoContable.add(jComboBoxid_tipo_cambioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_centro_costoDetalleAsientoContable.add(jLabelcon_centro_costoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_centro_costoDetalleAsientoContable.add(jButtoncon_centro_costoDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_centro_costoDetalleAsientoContable.add(jCheckBoxcon_centro_costoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaDetalleAsientoContable.add(jLabelfechaDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaDetalleAsientoContable.add(jButtonfechaDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaDetalleAsientoContable.add(jDateChooserfechaDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_depositoDetalleAsientoContable.add(jLabelnumero_depositoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_depositoDetalleAsientoContable.add(jButtonnumero_depositoDetalleAsientoContableBusqueda, this.gridBagConstraintsDetalleAsientoContable);
	}

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContable.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_depositoDetalleAsientoContable.add(jTextFieldnumero_depositoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleAsientoContable.add(this.jPanelid_asiento_contableDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposDetalleAsientoContable % 2==0) {
		iXPanelCamposDetalleAsientoContable=0;
		iYPanelCamposDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleAsientoContable.add(this.jPanelnumero_documentoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposDetalleAsientoContable % 2==0) {
		iXPanelCamposDetalleAsientoContable=0;
		iYPanelCamposDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.gridBagConstraintsDetalleAsientoContable.gridwidth = 3;

	this.jPanelCamposDetalleAsientoContable.add(this.jPanelid_cuenta_contableDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposDetalleAsientoContable % 2==0) {
		iXPanelCamposDetalleAsientoContable=0;
		iYPanelCamposDetalleAsientoContable++;
	}

	iXPanelCamposDetalleAsientoContable=0;
	iYPanelCamposDetalleAsientoContable++;

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleAsientoContable.add(this.jPaneldebito_localDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposDetalleAsientoContable % 2==0) {
		iXPanelCamposDetalleAsientoContable=0;
		iYPanelCamposDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleAsientoContable.add(this.jPanelcredito_localDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposDetalleAsientoContable % 2==0) {
		iXPanelCamposDetalleAsientoContable=0;
		iYPanelCamposDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleAsientoContable.add(this.jPaneldebito_extranDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposDetalleAsientoContable % 2==0) {
		iXPanelCamposDetalleAsientoContable=0;
		iYPanelCamposDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleAsientoContable.add(this.jPanelcredito_extranDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposDetalleAsientoContable % 2==0) {
		iXPanelCamposDetalleAsientoContable=0;
		iYPanelCamposDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleAsientoContable.add(this.jPanelid_centro_actividadDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposDetalleAsientoContable % 2==0) {
		iXPanelCamposDetalleAsientoContable=0;
		iYPanelCamposDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleAsientoContable.add(this.jPanelid_centro_costoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposDetalleAsientoContable % 2==0) {
		iXPanelCamposDetalleAsientoContable=0;
		iYPanelCamposDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleAsientoContable.add(this.jPanelcotizacionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposDetalleAsientoContable % 2==0) {
		iXPanelCamposDetalleAsientoContable=0;
		iYPanelCamposDetalleAsientoContable++;
	}

	iXPanelCamposDetalleAsientoContable=0;
	iYPanelCamposDetalleAsientoContable++;

	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.gridBagConstraintsDetalleAsientoContable.gridwidth = 3;

	this.jPanelCamposDetalleAsientoContable.add(this.jPaneldetalleDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposDetalleAsientoContable % 2==0) {
		iXPanelCamposDetalleAsientoContable=0;
		iYPanelCamposDetalleAsientoContable++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposOcultosDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposOcultosDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleAsientoContable.add(this.jPanelidDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposOcultosDetalleAsientoContable % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContable=0;
		iYPanelCamposOcultosDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposOcultosDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposOcultosDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleAsientoContable.add(this.jPanelid_empresaDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposOcultosDetalleAsientoContable % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContable=0;
		iYPanelCamposOcultosDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposOcultosDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposOcultosDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleAsientoContable.add(this.jPanelid_sucursalDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposOcultosDetalleAsientoContable % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContable=0;
		iYPanelCamposOcultosDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposOcultosDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposOcultosDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleAsientoContable.add(this.jPanelid_ejercicioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposOcultosDetalleAsientoContable % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContable=0;
		iYPanelCamposOcultosDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposOcultosDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposOcultosDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleAsientoContable.add(this.jPanelid_periodoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposOcultosDetalleAsientoContable % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContable=0;
		iYPanelCamposOcultosDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposOcultosDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposOcultosDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleAsientoContable.add(this.jPanelid_anioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposOcultosDetalleAsientoContable % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContable=0;
		iYPanelCamposOcultosDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposOcultosDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposOcultosDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleAsientoContable.add(this.jPanelid_mesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposOcultosDetalleAsientoContable % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContable=0;
		iYPanelCamposOcultosDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposOcultosDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposOcultosDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleAsientoContable.add(this.jPanelid_tipo_cambioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposOcultosDetalleAsientoContable % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContable=0;
		iYPanelCamposOcultosDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposOcultosDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposOcultosDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleAsientoContable.add(this.jPanelcon_centro_costoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposOcultosDetalleAsientoContable % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContable=0;
		iYPanelCamposOcultosDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposOcultosDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposOcultosDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleAsientoContable.add(this.jPanelfechaDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposOcultosDetalleAsientoContable % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContable=0;
		iYPanelCamposOcultosDetalleAsientoContable++;
	}
	this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContable.gridy = iYPanelCamposOcultosDetalleAsientoContable;
	this.gridBagConstraintsDetalleAsientoContable.gridx = iXPanelCamposOcultosDetalleAsientoContable++;
	this.gridBagConstraintsDetalleAsientoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContable.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleAsientoContable.add(this.jPanelnumero_depositoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);



	if(iXPanelCamposOcultosDetalleAsientoContable % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContable=0;
		iYPanelCamposOcultosDetalleAsientoContable++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleAsientoContable= new GridBagLayout();
		this.jPanelAccionesDetalleAsientoContable.setLayout(gridaBagLayoutAccionesDetalleAsientoContable);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleAsientoContable= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleAsientoContable.setLayout(gridaBagLayoutAccionesFormularioDetalleAsientoContable);
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleAsientoContable.add(this.jComboBoxTiposAccionesFormularioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleAsientoContable.add(this.jCheckBoxPostAccionNuevoDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleasientocontableSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleAsientoContable.add(this.jCheckBoxPostAccionSinCerrarDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleasientocontableSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleasientocontableSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleAsientoContable.add(this.jCheckBoxPostAccionSinMensajeDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleAsientoContable.add(this.jButtonModificarDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);							

		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContable.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleAsientoContable.add(this.jButtonEliminarDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
			
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleAsientoContable.add(this.jButtonActualizarDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);


		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleAsientoContable.add(this.jButtonGuardarCambiosDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);	
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = 0;		
		this.gridBagConstraintsDetalleAsientoContable.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleAsientoContable.add(this.jButtonCancelarDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleAsientoContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleAsientoContable);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleasientocontableSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();						
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleAsientoContable.gridx = 0;		
			//this.gridBagConstraintsDetalleAsientoContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleAsientoContable.ipadx = 100;
				
			*/
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleAsientoContable.gridx =0;
		this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleAsientoContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleAsientoContableJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleAsientoContable = new DetalleAsientoContableBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Asiento Contable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Asiento Contable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Asiento Contable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleAsientoContableModel detalleasientocontableModel=new DetalleAsientoContableModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleAsientoContableModel.DetalleAsientoContableFocusTraversalPolicy detalleasientocontableFocusTraversalPolicy = detalleasientocontableModel.new DetalleAsientoContableFocusTraversalPolicy(this);
			
			//detalleasientocontableFocusTraversalPolicy.setdetalleasientocontableJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleasientocontableModel);
			
			
			this.jContentPaneDetalleDetalleAsientoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleAsientoContable = new GridBagLayout();	
			this.jContentPaneDetalleDetalleAsientoContable.setLayout(gridaBagLayoutDetalleDetalleAsientoContable);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleAsientoContable = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				/*
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
				this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleAsientoContable.add(jTtoolBarDetalleDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);								
				*/
}
			
			this.jScrollPanelDatosEdicionDetalleAsientoContable=   new JScrollPane(jContentPaneDetalleDetalleAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleAsientoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleAsientoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleAsientoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleAsientoContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleAsientoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleAsientoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleAsientoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	        
			this.jContentPaneDetalleDetalleAsientoContable.add(jPanelCamposDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);
			
			
			
			
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
						&& detalleasientocontableSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleasientocontableSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleAsientoContable= new GridBagConstraints();
						this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
						this.jContentPaneDetalleDetalleAsientoContable.add(this.jTabbedPaneRelacionesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleAsientoContable.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleAsientoContable.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
					this.gridBagConstraintsDetalleAsientoContable.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleAsientoContable.add(jPanelCamposOcultosDetalleAsientoContable, gridBagConstraintsDetalleAsientoContable);
				
					this.jPanelCamposOcultosDetalleAsientoContable.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	        this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleAsientoContable.add(this.jPanelAccionesFormularioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);							
			
			
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
	        this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleAsientoContable.add(this.jPanelAccionesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleAsientoContable);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleAsientoContable=   new JScrollPane(this.jPanelCamposDetalleAsientoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleAsientoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleAsientoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleAsientoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
			this.gridBagConstraintsDetalleAsientoContable.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleAsientoContable.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleAsientoContable.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);			
			
			this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
			
			
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		
			
		this.gridBagConstraintsDetalleAsientoContable = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleAsientoContable, this.gridBagConstraintsDetalleAsientoContable);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleAsientoContable;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleAsientoContable;
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
