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
import com.bydan.erp.tesoreria.util.CuentaBancoConstantesFunciones;

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
public class CuentaBancoDetalleFormJInternalFrame extends CuentaBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCuentaBanco;
	
	protected JMenuBar jmenuBarDetalleCuentaBanco;
	
	protected JMenu jmenuDetalleCuentaBanco;
	protected JMenu jmenuDetalleArchivoCuentaBanco;
	protected JMenu jmenuDetalleAccionesCuentaBanco;
	protected JMenu jmenuDetalleDatosCuentaBanco;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaBanco;	
	protected GridBagConstraints gridBagConstraintsCuentaBanco;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CuentaBancoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCuentaBanco;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabancoglobal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected EstadoCuentaBancoBeanSwingJInternalFrame estadocuentabancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocuentabanco="";

	protected FormatoBeanSwingJInternalFrame formatoingresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoingreso="";

	protected FormatoBeanSwingJInternalFrame formatoegresoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoegreso="";

	protected FormatoBeanSwingJInternalFrame formatodiarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatodiario="";

	protected FormatoBeanSwingJInternalFrame formatochequeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatocheque="";

	protected FormatoBeanSwingJInternalFrame formatoretencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoretencion="";

	protected FormatoBeanSwingJInternalFrame formatoretencionivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoretencioniva="";
	
	public CuentaBancoSessionBean cuentabancoSessionBean;
	
	

	public PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFrame=null;
	public PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePagoAuto=false;
	public PagoAutoSessionBean pagoautoSessionBean;

	public AutoriPagoOrdenCompraBeanSwingJInternalFrame autoripagoordencompraBeanSwingJInternalFrame=null;
	public AutoriPagoOrdenCompraBeanSwingJInternalFrame autoripagoordencompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAutoriPagoOrdenCompra=false;
	public AutoriPagoOrdenCompraSessionBean autoripagoordencompraSessionBean;

	public DetalleChequeGiradoBeanSwingJInternalFrame detallechequegiradoBeanSwingJInternalFrame=null;
	public DetalleChequeGiradoBeanSwingJInternalFrame detallechequegiradoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleChequeGirado=false;
	public DetalleChequeGiradoSessionBean detallechequegiradoSessionBean;

	public AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame=null;
	public AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAutoriPago=false;
	public AutoriPagoSessionBean autoripagoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public EstadoCuentaBancoSessionBean estadocuentabancoSessionBean;
	public FormatoSessionBean formatoingresoSessionBean;
	public FormatoSessionBean formatoegresoSessionBean;
	public FormatoSessionBean formatodiarioSessionBean;
	public FormatoSessionBean formatochequeSessionBean;
	public FormatoSessionBean formatoretencionSessionBean;
	public FormatoSessionBean formatoretencionivaSessionBean;	
	
	public CuentaBancoLogic cuentabancoLogic;
	
	public JScrollPane jScrollPanelDatosCuentaBanco;
	public JScrollPane jScrollPanelDatosEdicionCuentaBanco;
	public JScrollPane jScrollPanelDatosGeneralCuentaBanco;
	
	protected JPanel jPanelCamposCuentaBanco;    
	protected JPanel jPanelCamposOcultosCuentaBanco;    	
	protected JPanel jPanelAccionesCuentaBanco;
	protected JPanel jPanelAccionesFormularioCuentaBanco;
    
	
	
	protected Integer iXPanelCamposCuentaBanco=0;
	protected Integer iYPanelCamposCuentaBanco=0;
	
	protected Integer iXPanelCamposOcultosCuentaBanco=0;
	protected Integer iYPanelCamposOcultosCuentaBanco=0;
	
	

	protected JPanel jPanelCamposIniciogeneralCuentaBanco;
	protected Integer iXPanelCamposIniciogeneralCuentaBanco=0;
	protected Integer iYPanelCamposIniciogeneralCuentaBanco=0;

	protected JPanel jPanelCamposInicioformatoCuentaBanco;
	protected Integer iXPanelCamposInicioformatoCuentaBanco=0;
	protected Integer iYPanelCamposInicioformatoCuentaBanco=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCuentaBanco;
	public JButton jButtonModificarCuentaBanco;
	public JButton jButtonActualizarCuentaBanco;
    public JButton jButtonEliminarCuentaBanco;
	public JButton jButtonCancelarCuentaBanco;
    public JButton jButtonGuardarCambiosCuentaBanco;
	public JButton jButtonGuardarCambiosTablaCuentaBanco;
	protected JButton jButtonCerrarCuentaBanco;
	
	
	protected JButton jButtonProcesarInformacionCuentaBanco;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCuentaBanco;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCuentaBanco;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCuentaBanco;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaBanco;
	protected JButton jButtonModificarToolBarCuentaBanco;
	protected JButton jButtonActualizarToolBarCuentaBanco;
    protected JButton jButtonEliminarToolBarCuentaBanco;
	protected JButton jButtonCancelarToolBarCuentaBanco;
    protected JButton jButtonGuardarCambiosToolBarCuentaBanco;
	protected JButton jButtonGuardarCambiosTablaToolBarCuentaBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaBanco;
	protected JButton jButtonCerrarToolBarCuentaBanco;
	
	protected JButton jButtonProcesarInformacionToolBarCuentaBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaBanco;
	protected JMenuItem jMenuItemModificarCuentaBanco;
	protected JMenuItem jMenuItemActualizarCuentaBanco;
    protected JMenuItem jMenuItemEliminarCuentaBanco;
	protected JMenuItem jMenuItemCancelarCuentaBanco;
    protected JMenuItem jMenuItemGuardarCambiosCuentaBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaBanco;
	protected JMenuItem jMenuItemCerrarCuentaBanco;
	protected JMenuItem jMenuItemDetalleCerrarCuentaBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaBanco;
	
	protected JMenuItem jMenuItemProcesarInformacionCuentaBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaBanco;
	protected JMenuItem jMenuItemMostrarOcultarCuentaBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaBanco;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaBanco;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCuentaBanco;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCuentaBanco;
	public JLabel jLabelIdCuentaBanco;
	public JLabel jLabelidCuentaBanco;
	public JButton jButtonidCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCuentaBanco;
	public JLabel jLabelcodigoCuentaBanco;
	public JTextArea jTextAreacodigoCuentaBanco;
	public JScrollPane jscrollPanecodigoCuentaBanco;
	public JButton jButtoncodigoCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaCuentaBanco;
	public JLabel jLabelnumero_cuentaCuentaBanco;
	public JTextField jTextFieldnumero_cuentaCuentaBanco;
	public JButton jButtonnumero_cuentaCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeCuentaBanco;
	public JLabel jLabelnumero_chequeCuentaBanco;
	public JTextField jTextFieldnumero_chequeCuentaBanco;
	public JButton jButtonnumero_chequeCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cheque_auxiliarCuentaBanco;
	public JLabel jLabelnumero_cheque_auxiliarCuentaBanco;
	public JTextField jTextFieldnumero_cheque_auxiliarCuentaBanco;
	public JButton jButtonnumero_cheque_auxiliarCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelsaldoCuentaBanco;
	public JLabel jLabelsaldoCuentaBanco;
	public JTextField jTextFieldsaldoCuentaBanco;
	public JButton jButtonsaldoCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelprocedenciaCuentaBanco;
	public JLabel jLabelprocedenciaCuentaBanco;
	public JTextArea jTextAreaprocedenciaCuentaBanco;
	public JScrollPane jscrollPaneprocedenciaCuentaBanco;
	public JButton jButtonprocedenciaCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPaneldestinoCuentaBanco;
	public JLabel jLabeldestinoCuentaBanco;
	public JTextArea jTextAreadestinoCuentaBanco;
	public JScrollPane jscrollPanedestinoCuentaBanco;
	public JButton jButtondestinoCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPaneles_bancoCuentaBanco;
	public JLabel jLabeles_bancoCuentaBanco;
	public JCheckBox jCheckBoxes_bancoCuentaBanco;
	public JButton jButtones_bancoCuentaBancoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCuentaBanco;
	public JLabel jLabelid_empresaCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCuentaBanco;
	public JButton jButtonid_empresaCuentaBanco= new JButtonMe();
	public JButton jButtonid_empresaCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCuentaBanco;
	public JLabel jLabelid_sucursalCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCuentaBanco;
	public JButton jButtonid_sucursalCuentaBanco= new JButtonMe();
	public JButton jButtonid_sucursalCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoCuentaBanco;
	public JLabel jLabelid_bancoCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoCuentaBanco;
	public JButton jButtonid_bancoCuentaBanco= new JButtonMe();
	public JButton jButtonid_bancoCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_bancoCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cuenta_banco_globalCuentaBanco;
	public JLabel jLabelid_tipo_cuenta_banco_globalCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_banco_globalCuentaBanco;
	public JButton jButtonid_tipo_cuenta_banco_globalCuentaBanco= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableCuentaBanco;
	public JLabel jLabelid_cuenta_contableCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableCuentaBanco;
	public JButton jButtonid_cuenta_contableCuentaBanco= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaBancoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaBancoArbol= new JButtonMe();

	public JPanel jPanelid_estado_cuenta_bancoCuentaBanco;
	public JLabel jLabelid_estado_cuenta_bancoCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_cuenta_bancoCuentaBanco;
	public JButton jButtonid_estado_cuenta_bancoCuentaBanco= new JButtonMe();
	public JButton jButtonid_estado_cuenta_bancoCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_estado_cuenta_bancoCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_ingresoCuentaBanco;
	public JLabel jLabelid_formato_ingresoCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_ingresoCuentaBanco;
	public JButton jButtonid_formato_ingresoCuentaBanco= new JButtonMe();
	public JButton jButtonid_formato_ingresoCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_formato_ingresoCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_egresoCuentaBanco;
	public JLabel jLabelid_formato_egresoCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_egresoCuentaBanco;
	public JButton jButtonid_formato_egresoCuentaBanco= new JButtonMe();
	public JButton jButtonid_formato_egresoCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_formato_egresoCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_diarioCuentaBanco;
	public JLabel jLabelid_formato_diarioCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_diarioCuentaBanco;
	public JButton jButtonid_formato_diarioCuentaBanco= new JButtonMe();
	public JButton jButtonid_formato_diarioCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_formato_diarioCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_chequeCuentaBanco;
	public JLabel jLabelid_formato_chequeCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_chequeCuentaBanco;
	public JButton jButtonid_formato_chequeCuentaBanco= new JButtonMe();
	public JButton jButtonid_formato_chequeCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_formato_chequeCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_retencionCuentaBanco;
	public JLabel jLabelid_formato_retencionCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_retencionCuentaBanco;
	public JButton jButtonid_formato_retencionCuentaBanco= new JButtonMe();
	public JButton jButtonid_formato_retencionCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_formato_retencionCuentaBancoBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_retencion_ivaCuentaBanco;
	public JLabel jLabelid_formato_retencion_ivaCuentaBanco;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_retencion_ivaCuentaBanco;
	public JButton jButtonid_formato_retencion_ivaCuentaBanco= new JButtonMe();
	public JButton jButtonid_formato_retencion_ivaCuentaBancoUpdate= new JButtonMe();
	public JButton jButtonid_formato_retencion_ivaCuentaBancoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCuentaBanco;
	
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
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=792;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CuentaBancoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCuentaBanco=new JPanel();
				this.jPanelAccionesFormularioCuentaBanco=new JPanel();
				this.jmenuBarDetalleCuentaBanco=new JMenuBar();
				this.jTtoolBarDetalleCuentaBanco=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CuentaBancoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaBancoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCuentaBanco() {
		return this.jButtonActualizarToolBarCuentaBanco;
	}
	
	public JButton getjButtonEliminarToolBarCuentaBanco() {
		return this.jButtonEliminarToolBarCuentaBanco;
	}
	
	public JButton getjButtonCancelarToolBarCuentaBanco() {
		return this.jButtonCancelarToolBarCuentaBanco;
	}		
	
	public JButton getjButtonProcesarInformacionCuentaBanco() {
		return this.jButtonProcesarInformacionCuentaBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaBanco)	{
		this.jButtonProcesarInformacionCuentaBanco = jButtonProcesarInformacionCuentaBanco;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaBanco() {
		return this.jComboBoxTiposAccionesCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaBanco(
			JComboBox jComboBoxTiposRelacionesCuentaBanco) {
		this.jComboBoxTiposRelacionesCuentaBanco = jComboBoxTiposRelacionesCuentaBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaBanco(
			JComboBox jComboBoxTiposAccionesCuentaBanco) {
		this.jComboBoxTiposAccionesCuentaBanco = jComboBoxTiposAccionesCuentaBanco;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCuentaBanco() {
		return this.jComboBoxTiposAccionesFormularioCuentaBanco;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCuentaBanco(
			JComboBox jComboBoxTiposAccionesFormularioCuentaBanco) {
		this.jComboBoxTiposAccionesFormularioCuentaBanco = jComboBoxTiposAccionesFormularioCuentaBanco;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cuentabancoSessionBean=new CuentaBancoSessionBean();
		
		this.cuentabancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentabancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentabancoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.pagoautoSessionBean=new PagoAutoSessionBean();
		//this.autoripagoordencompraSessionBean=new AutoriPagoOrdenCompraSessionBean();
		//this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
		//this.autoripagoSessionBean=new AutoriPagoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Banco MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cuentabancoSessionBean.getEsGuardarRelacionado()) {
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
	
		CuentaBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCuentaBanco= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCuentaBanco=new JButtonMe();
				this.jButtonModificarToolBarCuentaBanco=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCuentaBanco,this.jTtoolBarDetalleCuentaBanco,
							"actualizar","actualizar","Actualizar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCuentaBanco,this.jTtoolBarDetalleCuentaBanco,
							"eliminar","eliminar","Eliminar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCuentaBanco,this.jTtoolBarDetalleCuentaBanco,
							"cancelar","cancelar","Cancelar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCuentaBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCuentaBanco,this.jTtoolBarDetalleCuentaBanco,
							"guardarcambios","guardarcambios","Guardar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCuentaBanco=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCuentaBanco=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCuentaBanco=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCuentaBanco=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCuentaBanco=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCuentaBanco= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCuentaBanco.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCuentaBanco,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCuentaBanco= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCuentaBanco.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCuentaBanco,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCuentaBanco= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCuentaBanco.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCuentaBanco,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCuentaBanco= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCuentaBanco.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCuentaBanco,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCuentaBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCuentaBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCuentaBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCuentaBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCuentaBanco.add(this.jMenuItemDetalleCerrarCuentaBanco);
		
		this.jmenuDetalleAccionesCuentaBanco.add(this.jMenuItemActualizarCuentaBanco);
		this.jmenuDetalleAccionesCuentaBanco.add(this.jMenuItemEliminarCuentaBanco);
		this.jmenuDetalleAccionesCuentaBanco.add(this.jMenuItemCancelarCuentaBanco);		
		
		//this.jmenuDetalleDatosCuentaBanco.add(this.jMenuItemDetalleAbrirOrderByCuentaBanco);				
		this.jmenuDetalleDatosCuentaBanco.add(this.jMenuItemDetalleMostarOcultarCuentaBanco);				
				
		//this.jmenuDetalleAccionesCuentaBanco.add(this.jMenuItemGuardarCambiosCuentaBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCuentaBanco.add(this.jmenuDetalleArchivoCuentaBanco);		
		this.jmenuBarDetalleCuentaBanco.add(this.jmenuDetalleAccionesCuentaBanco);		
		this.jmenuBarDetalleCuentaBanco.add(this.jmenuDetalleDatosCuentaBanco);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCuentaBanco.add(this.jmenuDetalleCuentaBanco);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCuentaBanco);				
	}
	
	
	public void inicializarElementosCamposCuentaBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCuentaBanco = new JLabelMe();
		jLabelIdCuentaBanco.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCuentaBanco = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCuentaBanco= new GridBagLayout();

		this.jPanelidCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);

		jLabelidCuentaBanco = new JLabel();
		jLabelidCuentaBanco.setText("Id");

		jLabelidCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCuentaBanco = new JLabelMe();
		this.jLabelcodigoCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCuentaBanco.setToolTipText("Codigo");
		this.jLabelcodigoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelcodigoCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jTextAreacodigoCuentaBanco= new JTextAreaMe();
		jTextAreacodigoCuentaBanco.setEnabled(false);
		jTextAreacodigoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoCuentaBanco.setLineWrap(true);
		jTextAreacodigoCuentaBanco.setWrapStyleWord(true);
		jTextAreacodigoCuentaBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoCuentaBanco.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoCuentaBanco = new JScrollPane(jTextAreacodigoCuentaBanco);
		jscrollPanecodigoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanecodigoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtoncodigoCuentaBancoBusqueda= new JButtonMe();
		this.jButtoncodigoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCuentaBancoBusqueda.setText("U");
		this.jButtoncodigoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCuentaBancoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaCuentaBanco = new JLabelMe();
		this.jLabelnumero_cuentaCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaCuentaBanco.setToolTipText("No Cuenta");
		this.jLabelnumero_cuentaCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelnumero_cuentaCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jTextFieldnumero_cuentaCuentaBanco= new JTextFieldMe();

		jTextFieldnumero_cuentaCuentaBanco.setEnabled(false);
		jTextFieldnumero_cuentaCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaCuentaBancoBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaCuentaBancoBusqueda.setText("U");
		this.jButtonnumero_cuentaCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaCuentaBancoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeCuentaBanco = new JLabelMe();
		this.jLabelnumero_chequeCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_NUMEROCHEQUE+" :");
		this.jLabelnumero_chequeCuentaBanco.setToolTipText("No Cheque");
		this.jLabelnumero_chequeCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelnumero_chequeCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jTextFieldnumero_chequeCuentaBanco= new JTextFieldMe();

		jTextFieldnumero_chequeCuentaBanco.setEnabled(false);
		jTextFieldnumero_chequeCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeCuentaBancoBusqueda= new JButtonMe();
		this.jButtonnumero_chequeCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeCuentaBancoBusqueda.setText("U");
		this.jButtonnumero_chequeCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeCuentaBancoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cheque_auxiliarCuentaBanco = new JLabelMe();
		this.jLabelnumero_cheque_auxiliarCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_NUMEROCHEQUEAUXILIAR+" :");
		this.jLabelnumero_cheque_auxiliarCuentaBanco.setToolTipText("No Cheque 2");
		this.jLabelnumero_cheque_auxiliarCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cheque_auxiliarCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cheque_auxiliarCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cheque_auxiliarCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cheque_auxiliarCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cheque_auxiliarCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_NUMEROCHEQUEAUXILIAR);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelnumero_cheque_auxiliarCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jTextFieldnumero_cheque_auxiliarCuentaBanco= new JTextFieldMe();

		jTextFieldnumero_cheque_auxiliarCuentaBanco.setEnabled(false);
		jTextFieldnumero_cheque_auxiliarCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cheque_auxiliarCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cheque_auxiliarCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cheque_auxiliarCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cheque_auxiliarCuentaBancoBusqueda= new JButtonMe();
		this.jButtonnumero_cheque_auxiliarCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cheque_auxiliarCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cheque_auxiliarCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cheque_auxiliarCuentaBancoBusqueda.setText("U");
		this.jButtonnumero_cheque_auxiliarCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cheque_auxiliarCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cheque_auxiliarCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cheque_auxiliarCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cheque_auxiliarCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cheque_auxiliarCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cheque_auxiliarCuentaBancoBusqueda.setVisible(false);		}


					
		this.jLabelsaldoCuentaBanco = new JLabelMe();
		this.jLabelsaldoCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoCuentaBanco.setToolTipText("Saldo");
		this.jLabelsaldoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelsaldoCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jTextFieldsaldoCuentaBanco= new JTextFieldMe();
		jTextFieldsaldoCuentaBanco.setEnabled(false);
		jTextFieldsaldoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoCuentaBanco.setText("0.0");

		this.jButtonsaldoCuentaBancoBusqueda= new JButtonMe();
		this.jButtonsaldoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoCuentaBancoBusqueda.setText("U");
		this.jButtonsaldoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoCuentaBancoBusqueda.setVisible(false);		}


					
		this.jLabelprocedenciaCuentaBanco = new JLabelMe();
		this.jLabelprocedenciaCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_PROCEDENCIA+" :");
		this.jLabelprocedenciaCuentaBanco.setToolTipText("Procedencia");
		this.jLabelprocedenciaCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprocedenciaCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprocedenciaCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprocedenciaCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprocedenciaCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprocedenciaCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_PROCEDENCIA);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelprocedenciaCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jTextAreaprocedenciaCuentaBanco= new JTextAreaMe();
		jTextAreaprocedenciaCuentaBanco.setEnabled(false);
		jTextAreaprocedenciaCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocedenciaCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocedenciaCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocedenciaCuentaBanco.setLineWrap(true);
		jTextAreaprocedenciaCuentaBanco.setWrapStyleWord(true);
		jTextAreaprocedenciaCuentaBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaprocedenciaCuentaBanco.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaprocedenciaCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneprocedenciaCuentaBanco = new JScrollPane(jTextAreaprocedenciaCuentaBanco);
		jscrollPaneprocedenciaCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprocedenciaCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprocedenciaCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonprocedenciaCuentaBancoBusqueda= new JButtonMe();
		this.jButtonprocedenciaCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprocedenciaCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprocedenciaCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprocedenciaCuentaBancoBusqueda.setText("U");
		this.jButtonprocedenciaCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprocedenciaCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprocedenciaCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaprocedenciaCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaprocedenciaCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"procedenciaCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprocedenciaCuentaBancoBusqueda.setVisible(false);		}


					
		this.jLabeldestinoCuentaBanco = new JLabelMe();
		this.jLabeldestinoCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_DESTINO+" :");
		this.jLabeldestinoCuentaBanco.setToolTipText("Destino");
		this.jLabeldestinoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldestinoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldestinoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldestinoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldestinoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldestinoCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_DESTINO);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPaneldestinoCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jTextAreadestinoCuentaBanco= new JTextAreaMe();
		jTextAreadestinoCuentaBanco.setEnabled(false);
		jTextAreadestinoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadestinoCuentaBanco.setLineWrap(true);
		jTextAreadestinoCuentaBanco.setWrapStyleWord(true);
		jTextAreadestinoCuentaBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadestinoCuentaBanco.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadestinoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedestinoCuentaBanco = new JScrollPane(jTextAreadestinoCuentaBanco);
		jscrollPanedestinoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedestinoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedestinoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondestinoCuentaBancoBusqueda= new JButtonMe();
		this.jButtondestinoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondestinoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondestinoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondestinoCuentaBancoBusqueda.setText("U");
		this.jButtondestinoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondestinoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondestinoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadestinoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadestinoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"destinoCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondestinoCuentaBancoBusqueda.setVisible(false);		}


					
		this.jLabeles_bancoCuentaBanco = new JLabelMe();
		this.jLabeles_bancoCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_ESBANCO+" : *");
		this.jLabeles_bancoCuentaBanco.setToolTipText("Es Banco");
		this.jLabeles_bancoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_bancoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_bancoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_bancoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_bancoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_bancoCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_ESBANCO);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPaneles_bancoCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jCheckBoxes_bancoCuentaBanco= new JCheckBoxMe();
		jCheckBoxes_bancoCuentaBanco.setEnabled(false);

		jCheckBoxes_bancoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_bancoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_bancoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_bancoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_bancoCuentaBancoBusqueda= new JButtonMe();
		this.jButtones_bancoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_bancoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_bancoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_bancoCuentaBancoBusqueda.setText("U");
		this.jButtones_bancoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_bancoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_bancoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_bancoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_bancoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_bancoCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_bancoCuentaBancoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCuentaBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCuentaBanco = new JLabelMe();
		this.jLabelid_empresaCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCuentaBanco.setToolTipText("Empresa");
		this.jLabelid_empresaCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelid_empresaCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jComboBoxid_empresaCuentaBanco= new JComboBoxMe();
		jComboBoxid_empresaCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCuentaBanco.setEnabled(false);

		this.jButtonid_empresaCuentaBanco= new JButtonMe();
		this.jButtonid_empresaCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaBanco.setText("Buscar");
		this.jButtonid_empresaCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaBanco"));

		this.jButtonid_empresaCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_empresaCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaBancoBusqueda.setText("U");
		this.jButtonid_empresaCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_empresaCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaBancoUpdate.setText("U");
		this.jButtonid_empresaCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaBancoUpdate"));



					
		this.jLabelid_sucursalCuentaBanco = new JLabelMe();
		this.jLabelid_sucursalCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCuentaBanco.setToolTipText("Sucursal");
		this.jLabelid_sucursalCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelid_sucursalCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jComboBoxid_sucursalCuentaBanco= new JComboBoxMe();
		jComboBoxid_sucursalCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCuentaBanco.setEnabled(false);

		this.jButtonid_sucursalCuentaBanco= new JButtonMe();
		this.jButtonid_sucursalCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCuentaBanco.setText("Buscar");
		this.jButtonid_sucursalCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCuentaBanco"));

		this.jButtonid_sucursalCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_sucursalCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCuentaBancoBusqueda.setText("U");
		this.jButtonid_sucursalCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_sucursalCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCuentaBancoUpdate.setText("U");
		this.jButtonid_sucursalCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCuentaBancoUpdate"));



					
		this.jLabelid_bancoCuentaBanco = new JLabelMe();
		this.jLabelid_bancoCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoCuentaBanco.setToolTipText("Banco");
		this.jLabelid_bancoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelid_bancoCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jComboBoxid_bancoCuentaBanco= new JComboBoxMe();
		jComboBoxid_bancoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoCuentaBanco= new JButtonMe();
		this.jButtonid_bancoCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoCuentaBanco.setText("Buscar");
		this.jButtonid_bancoCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoCuentaBanco"));

		this.jButtonid_bancoCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_bancoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoCuentaBancoBusqueda.setText("U");
		this.jButtonid_bancoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_bancoCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_bancoCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoCuentaBancoUpdate.setText("U");
		this.jButtonid_bancoCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoCuentaBancoUpdate"));



					
		this.jLabelid_tipo_cuenta_banco_globalCuentaBanco = new JLabelMe();
		this.jLabelid_tipo_cuenta_banco_globalCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL+" : *");
		this.jLabelid_tipo_cuenta_banco_globalCuentaBanco.setToolTipText("Tipo Cuenta");
		this.jLabelid_tipo_cuenta_banco_globalCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cuenta_banco_globalCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cuenta_banco_globalCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_banco_globalCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cuenta_banco_globalCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cuenta_banco_globalCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelid_tipo_cuenta_banco_globalCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jComboBoxid_tipo_cuenta_banco_globalCuentaBanco= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_banco_globalCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_banco_globalCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cuenta_banco_globalCuentaBanco= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalCuentaBanco.setText("Buscar");
		this.jButtonid_tipo_cuenta_banco_globalCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cuenta_banco_globalCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cuenta_banco_globalCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalCuentaBanco"));

		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_banco_globalCuentaBancoBusqueda.setText("U");
		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cuenta_banco_globalCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_banco_globalCuentaBancoUpdate.setText("U");
		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cuenta_banco_globalCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cuenta_banco_globalCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalCuentaBancoUpdate"));



					
		this.jLabelid_cuenta_contableCuentaBanco = new JLabelMe();
		this.jLabelid_cuenta_contableCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableCuentaBanco.setToolTipText("C. Contable");
		this.jLabelid_cuenta_contableCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contableCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contableCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelid_cuenta_contableCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jComboBoxid_cuenta_contableCuentaBanco= new JComboBoxMe();
		jComboBoxid_cuenta_contableCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableCuentaBanco= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaBanco.setText("Buscar");
		this.jButtonid_cuenta_contableCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaBanco"));

		this.jButtonid_cuenta_contableCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaBancoBusqueda.setText("U");
		this.jButtonid_cuenta_contableCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaBancoUpdate.setText("U");
		this.jButtonid_cuenta_contableCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaBancoUpdate"));


		jButtonid_cuenta_contableCuentaBancoArbol= new JButtonMe();
		jButtonid_cuenta_contableCuentaBancoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaBancoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaBancoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaBancoArbol.setText("Arbol");
		jButtonid_cuenta_contableCuentaBancoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableCuentaBancoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaBancoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaBancoArbol"));



					
		this.jLabelid_estado_cuenta_bancoCuentaBanco = new JLabelMe();
		this.jLabelid_estado_cuenta_bancoCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_IDESTADOCUENTABANCO+" : *");
		this.jLabelid_estado_cuenta_bancoCuentaBanco.setToolTipText("Estado");
		this.jLabelid_estado_cuenta_bancoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_cuenta_bancoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_cuenta_bancoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_cuenta_bancoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_cuenta_bancoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_cuenta_bancoCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_IDESTADOCUENTABANCO);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelid_estado_cuenta_bancoCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jComboBoxid_estado_cuenta_bancoCuentaBanco= new JComboBoxMe();
		jComboBoxid_estado_cuenta_bancoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_cuenta_bancoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_cuenta_bancoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_cuenta_bancoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_cuenta_bancoCuentaBanco= new JButtonMe();
		this.jButtonid_estado_cuenta_bancoCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_cuenta_bancoCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_cuenta_bancoCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_cuenta_bancoCuentaBanco.setText("Buscar");
		this.jButtonid_estado_cuenta_bancoCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_cuenta_bancoCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_cuenta_bancoCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_cuenta_bancoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_cuenta_bancoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_cuenta_bancoCuentaBanco"));

		this.jButtonid_estado_cuenta_bancoCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_estado_cuenta_bancoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_cuenta_bancoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_cuenta_bancoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_cuenta_bancoCuentaBancoBusqueda.setText("U");
		this.jButtonid_estado_cuenta_bancoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_cuenta_bancoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_cuenta_bancoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_cuenta_bancoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_cuenta_bancoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_cuenta_bancoCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_cuenta_bancoCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_estado_cuenta_bancoCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_estado_cuenta_bancoCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_cuenta_bancoCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_cuenta_bancoCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_cuenta_bancoCuentaBancoUpdate.setText("U");
		this.jButtonid_estado_cuenta_bancoCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_cuenta_bancoCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_cuenta_bancoCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_cuenta_bancoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_cuenta_bancoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_cuenta_bancoCuentaBancoUpdate"));



					
		this.jLabelid_formato_ingresoCuentaBanco = new JLabelMe();
		this.jLabelid_formato_ingresoCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_IDFORMATOINGRESO+" : *");
		this.jLabelid_formato_ingresoCuentaBanco.setToolTipText("Ingreso");
		this.jLabelid_formato_ingresoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_ingresoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_ingresoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_ingresoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_ingresoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_ingresoCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_IDFORMATOINGRESO);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelid_formato_ingresoCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jComboBoxid_formato_ingresoCuentaBanco= new JComboBoxMe();
		jComboBoxid_formato_ingresoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_ingresoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_ingresoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_ingresoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_ingresoCuentaBanco= new JButtonMe();
		this.jButtonid_formato_ingresoCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_ingresoCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_ingresoCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_ingresoCuentaBanco.setText("Buscar");
		this.jButtonid_formato_ingresoCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_ingresoCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_ingresoCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_ingresoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_ingresoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_ingresoCuentaBanco"));

		this.jButtonid_formato_ingresoCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_formato_ingresoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_ingresoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_ingresoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_ingresoCuentaBancoBusqueda.setText("U");
		this.jButtonid_formato_ingresoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_ingresoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_ingresoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_ingresoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_ingresoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_ingresoCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_ingresoCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_formato_ingresoCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_formato_ingresoCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_ingresoCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_ingresoCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_ingresoCuentaBancoUpdate.setText("U");
		this.jButtonid_formato_ingresoCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_ingresoCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_ingresoCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_ingresoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_ingresoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_ingresoCuentaBancoUpdate"));



					
		this.jLabelid_formato_egresoCuentaBanco = new JLabelMe();
		this.jLabelid_formato_egresoCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_IDFORMATOEGRESO+" : *");
		this.jLabelid_formato_egresoCuentaBanco.setToolTipText("Egreso");
		this.jLabelid_formato_egresoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_egresoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_egresoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_egresoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_egresoCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_egresoCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_IDFORMATOEGRESO);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelid_formato_egresoCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jComboBoxid_formato_egresoCuentaBanco= new JComboBoxMe();
		jComboBoxid_formato_egresoCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_egresoCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_egresoCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_egresoCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_egresoCuentaBanco= new JButtonMe();
		this.jButtonid_formato_egresoCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_egresoCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_egresoCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_egresoCuentaBanco.setText("Buscar");
		this.jButtonid_formato_egresoCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_egresoCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_egresoCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_egresoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_egresoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_egresoCuentaBanco"));

		this.jButtonid_formato_egresoCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_formato_egresoCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_egresoCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_egresoCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_egresoCuentaBancoBusqueda.setText("U");
		this.jButtonid_formato_egresoCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_egresoCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_egresoCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_egresoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_egresoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_egresoCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_egresoCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_formato_egresoCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_formato_egresoCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_egresoCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_egresoCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_egresoCuentaBancoUpdate.setText("U");
		this.jButtonid_formato_egresoCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_egresoCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_egresoCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_egresoCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_egresoCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_egresoCuentaBancoUpdate"));



					
		this.jLabelid_formato_diarioCuentaBanco = new JLabelMe();
		this.jLabelid_formato_diarioCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_IDFORMATODIARIO+" : *");
		this.jLabelid_formato_diarioCuentaBanco.setToolTipText("Diario");
		this.jLabelid_formato_diarioCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_diarioCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_diarioCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_diarioCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_diarioCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_diarioCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_IDFORMATODIARIO);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelid_formato_diarioCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jComboBoxid_formato_diarioCuentaBanco= new JComboBoxMe();
		jComboBoxid_formato_diarioCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_diarioCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_diarioCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_diarioCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_diarioCuentaBanco= new JButtonMe();
		this.jButtonid_formato_diarioCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_diarioCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_diarioCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_diarioCuentaBanco.setText("Buscar");
		this.jButtonid_formato_diarioCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_diarioCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_diarioCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_diarioCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_diarioCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_diarioCuentaBanco"));

		this.jButtonid_formato_diarioCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_formato_diarioCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_diarioCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_diarioCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_diarioCuentaBancoBusqueda.setText("U");
		this.jButtonid_formato_diarioCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_diarioCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_diarioCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_diarioCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_diarioCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_diarioCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_diarioCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_formato_diarioCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_formato_diarioCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_diarioCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_diarioCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_diarioCuentaBancoUpdate.setText("U");
		this.jButtonid_formato_diarioCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_diarioCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_diarioCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_diarioCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_diarioCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_diarioCuentaBancoUpdate"));



					
		this.jLabelid_formato_chequeCuentaBanco = new JLabelMe();
		this.jLabelid_formato_chequeCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_IDFORMATOCHEQUE+" : *");
		this.jLabelid_formato_chequeCuentaBanco.setToolTipText(" Cheque");
		this.jLabelid_formato_chequeCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_chequeCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_chequeCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_chequeCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_chequeCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_chequeCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_IDFORMATOCHEQUE);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelid_formato_chequeCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jComboBoxid_formato_chequeCuentaBanco= new JComboBoxMe();
		jComboBoxid_formato_chequeCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_chequeCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_chequeCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_chequeCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_chequeCuentaBanco= new JButtonMe();
		this.jButtonid_formato_chequeCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_chequeCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_chequeCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_chequeCuentaBanco.setText("Buscar");
		this.jButtonid_formato_chequeCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_chequeCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_chequeCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_chequeCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_chequeCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_chequeCuentaBanco"));

		this.jButtonid_formato_chequeCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_formato_chequeCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_chequeCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_chequeCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_chequeCuentaBancoBusqueda.setText("U");
		this.jButtonid_formato_chequeCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_chequeCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_chequeCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_chequeCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_chequeCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_chequeCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_chequeCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_formato_chequeCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_formato_chequeCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_chequeCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_chequeCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_chequeCuentaBancoUpdate.setText("U");
		this.jButtonid_formato_chequeCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_chequeCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_chequeCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_chequeCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_chequeCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_chequeCuentaBancoUpdate"));



					
		this.jLabelid_formato_retencionCuentaBanco = new JLabelMe();
		this.jLabelid_formato_retencionCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_IDFORMATORETENCION+" :");
		this.jLabelid_formato_retencionCuentaBanco.setToolTipText("Retencion");
		this.jLabelid_formato_retencionCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_retencionCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_retencionCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_retencionCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_retencionCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_retencionCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_IDFORMATORETENCION);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelid_formato_retencionCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jComboBoxid_formato_retencionCuentaBanco= new JComboBoxMe();
		jComboBoxid_formato_retencionCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_retencionCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_retencionCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_retencionCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_retencionCuentaBanco= new JButtonMe();
		this.jButtonid_formato_retencionCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_retencionCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_retencionCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_retencionCuentaBanco.setText("Buscar");
		this.jButtonid_formato_retencionCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_retencionCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_retencionCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_retencionCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_retencionCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_retencionCuentaBanco"));

		this.jButtonid_formato_retencionCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_formato_retencionCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_retencionCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_retencionCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_retencionCuentaBancoBusqueda.setText("U");
		this.jButtonid_formato_retencionCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_retencionCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_retencionCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_retencionCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_retencionCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_retencionCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_retencionCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_formato_retencionCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_formato_retencionCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_retencionCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_retencionCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_retencionCuentaBancoUpdate.setText("U");
		this.jButtonid_formato_retencionCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_retencionCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_retencionCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_retencionCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_retencionCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_retencionCuentaBancoUpdate"));



					
		this.jLabelid_formato_retencion_ivaCuentaBanco = new JLabelMe();
		this.jLabelid_formato_retencion_ivaCuentaBanco.setText(""+CuentaBancoConstantesFunciones.LABEL_IDFORMATORETENCIONIVA+" :");
		this.jLabelid_formato_retencion_ivaCuentaBanco.setToolTipText("Retenc. Iva");
		this.jLabelid_formato_retencion_ivaCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_retencion_ivaCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_retencion_ivaCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_retencion_ivaCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_retencion_ivaCuentaBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_retencion_ivaCuentaBanco.setToolTipText(CuentaBancoConstantesFunciones.LABEL_IDFORMATORETENCIONIVA);
		this.gridaBagLayoutCuentaBanco = new GridBagLayout();
		this.jPanelid_formato_retencion_ivaCuentaBanco.setLayout(this.gridaBagLayoutCuentaBanco);


		jComboBoxid_formato_retencion_ivaCuentaBanco= new JComboBoxMe();
		jComboBoxid_formato_retencion_ivaCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_retencion_ivaCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_retencion_ivaCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_retencion_ivaCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_retencion_ivaCuentaBanco= new JButtonMe();
		this.jButtonid_formato_retencion_ivaCuentaBanco.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_retencion_ivaCuentaBanco.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_retencion_ivaCuentaBanco.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_retencion_ivaCuentaBanco.setText("Buscar");
		this.jButtonid_formato_retencion_ivaCuentaBanco.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_retencion_ivaCuentaBanco.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_retencion_ivaCuentaBanco,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_retencion_ivaCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_retencion_ivaCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_retencion_ivaCuentaBanco"));

		this.jButtonid_formato_retencion_ivaCuentaBancoBusqueda= new JButtonMe();
		this.jButtonid_formato_retencion_ivaCuentaBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_retencion_ivaCuentaBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_retencion_ivaCuentaBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_retencion_ivaCuentaBancoBusqueda.setText("U");
		this.jButtonid_formato_retencion_ivaCuentaBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_retencion_ivaCuentaBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_retencion_ivaCuentaBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_retencion_ivaCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_retencion_ivaCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_retencion_ivaCuentaBancoBusqueda"));

		if(this.cuentabancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_retencion_ivaCuentaBancoBusqueda.setVisible(false);		}

		this.jButtonid_formato_retencion_ivaCuentaBancoUpdate= new JButtonMe();
		this.jButtonid_formato_retencion_ivaCuentaBancoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_retencion_ivaCuentaBancoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_retencion_ivaCuentaBancoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_retencion_ivaCuentaBancoUpdate.setText("U");
		this.jButtonid_formato_retencion_ivaCuentaBancoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_retencion_ivaCuentaBancoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_retencion_ivaCuentaBancoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_retencion_ivaCuentaBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_retencion_ivaCuentaBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_retencion_ivaCuentaBancoUpdate"));



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
		//this.jInternalFrameDetalleCuentaBanco = new CuentaBancoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cuenta Banco DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaBanco= new GridBagLayout();
		

		
		String sToolTipCuentaBanco="";
		sToolTipCuentaBanco=CuentaBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaBanco+="(Tesoreria.CuentaBanco)";
		}
		
		if(!this.cuentabancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaBanco+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCuentaBanco = new JButtonMe();
		this.jButtonModificarCuentaBanco = new JButtonMe();
        this.jButtonActualizarCuentaBanco = new JButtonMe();
        this.jButtonEliminarCuentaBanco = new JButtonMe();
        this.jButtonCancelarCuentaBanco = new JButtonMe();
        this.jButtonGuardarCambiosCuentaBanco = new JButtonMe();
		this.jButtonGuardarCambiosTablaCuentaBanco = new JButtonMe();
		this.jButtonCerrarCuentaBanco = new JButtonMe();
		
		this.jScrollPanelDatosCuentaBanco = new JScrollPane();   
        this.jScrollPanelDatosEdicionCuentaBanco = new JScrollPane();
		this.jScrollPanelDatosGeneralCuentaBanco = new JScrollPane();
				
		
		
		this.jPanelCamposCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioformatoCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Banco";
		
		if(!this.cuentabancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Bancos" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCuentaBanco.setName("jPanelCamposCuentaBanco"); 

		this.jPanelCamposOcultosCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCuentaBanco.setName("jPanelCamposOcultosCuentaBanco"); 

        this.jPanelAccionesCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaBanco.setToolTipText("Acciones");
        this.jPanelAccionesCuentaBanco.setName("Acciones"); 

		this.jPanelAccionesFormularioCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCuentaBanco.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCuentaBanco.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralCuentaBanco.setName("jPanelCamposFingeneralCuentaBanco");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioformatoCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Formato"));
		this.jPanelCamposInicioformatoCuentaBanco.setName("jPanelCamposFinformatoCuentaBanco");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioformatoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCuentaBanco.setText("Nuevo");
		this.jButtonModificarCuentaBanco.setText("Editar");
        this.jButtonActualizarCuentaBanco.setText("Actualizar");
        this.jButtonEliminarCuentaBanco.setText("Eliminar");
        this.jButtonCancelarCuentaBanco.setText("Cancelar");
        this.jButtonGuardarCambiosCuentaBanco.setText("Guardar");
		this.jButtonGuardarCambiosTablaCuentaBanco.setText("Guardar");
		this.jButtonCerrarCuentaBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaBanco,"nuevo_button","Nuevo",this.cuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCuentaBanco,"modificar_button","Editar",this.cuentabancoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCuentaBanco,"actualizar_button","Actualizar",this.cuentabancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCuentaBanco,"eliminar_button","Eliminar",this.cuentabancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCuentaBanco,"cancelar_button","Cancelar",this.cuentabancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCuentaBanco,"guardarcambios_button","Guardar",this.cuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaBanco,"guardarcambiostabla_button","Guardar",this.cuentabancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaBanco,"cerrar_button","Salir",this.cuentabancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCuentaBanco.setToolTipText("Nuevo"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCuentaBanco.setToolTipText("Editar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCuentaBanco.setToolTipText("Actualizar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCuentaBanco.setToolTipText("Eliminar)"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCuentaBanco.setToolTipText("Cancelar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCuentaBanco.setToolTipText("Guardar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCuentaBanco.setToolTipText("Guardar"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaBanco.setToolTipText("Salir"+" "+CuentaBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaBanco";
		inputMap = this.jButtonNuevoCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaBanco"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCuentaBanco";
		inputMap = this.jButtonActualizarCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCuentaBanco"));
		
		//ELIMINAR
		sMapKey = "EliminarCuentaBanco";
		inputMap = this.jButtonEliminarCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCuentaBanco"));
		
		//CANCELAR	
		sMapKey = "CancelarCuentaBanco";
		inputMap = this.jButtonCancelarCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCuentaBanco"));
		
		//CERRAR		
		sMapKey = "CerrarCuentaBanco";
		inputMap = this.jButtonCerrarCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaBanco";
		inputMap = this.jButtonGuardarCambiosTablaCuentaBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaBanco"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCuentaBanco.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCuentaBanco.setToolTipText("Nuevo CuentaBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCuentaBanco.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCuentaBanco.setToolTipText("Sin Cerrar Ventana CuentaBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCuentaBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCuentaBanco.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCuentaBanco.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaBanco.setText("Accion");
		this.jComboBoxTiposAccionesCuentaBanco.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCuentaBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCuentaBanco.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCuentaBanco.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCuentaBanco = new JLabelMe();
		
		this.jLabelAccionesCuentaBanco.setText("Acciones");		
		this.jLabelAccionesCuentaBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCuentaBanco();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCuentaBanco();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCuentaBanco=new JTabbedPane();
		this.jTabbedPaneRelacionesCuentaBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCuentaBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCuentaBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCuentaBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaBanco.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCuentaBanco, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCuentaBanco = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCuentaBanco = new GridBagLayout();
		
		this.jPanelCamposCuentaBanco.setLayout(gridaBagLayoutCamposCuentaBanco);
		this.jPanelCamposOcultosCuentaBanco.setLayout(gridaBagLayoutCamposOcultosCuentaBanco);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralCuentaBanco= new GridBagLayout();
		this.jPanelCamposIniciogeneralCuentaBanco.setLayout(gridaBagLayoutCamposIniciogeneralCuentaBanco);

		GridBagLayout gridaBagLayoutCamposInicioformatoCuentaBanco= new GridBagLayout();
		this.jPanelCamposInicioformatoCuentaBanco.setLayout(gridaBagLayoutCamposInicioformatoCuentaBanco);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCuentaBanco.add(jLabelIdCuentaBanco, this.gridBagConstraintsCuentaBanco);



	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCuentaBanco.add(jLabelidCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCuentaBanco.add(jLabelid_empresaCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaBanco.add(jButtonid_empresaCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 3;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaBanco.add(jButtonid_empresaCuentaBancoUpdate, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCuentaBanco.add(jComboBoxid_empresaCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCuentaBanco.add(jLabelid_sucursalCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCuentaBanco.add(jButtonid_sucursalCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 3;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCuentaBanco.add(jButtonid_sucursalCuentaBancoUpdate, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCuentaBanco.add(jComboBoxid_sucursalCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoCuentaBanco.add(jLabelid_bancoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoCuentaBanco.add(jButtonid_bancoCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 3;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoCuentaBanco.add(jButtonid_bancoCuentaBancoUpdate, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoCuentaBanco.add(jComboBoxid_bancoCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cuenta_banco_globalCuentaBanco.add(jLabelid_tipo_cuenta_banco_globalCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_banco_globalCuentaBanco.add(jButtonid_tipo_cuenta_banco_globalCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 3;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_banco_globalCuentaBanco.add(jButtonid_tipo_cuenta_banco_globalCuentaBancoUpdate, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cuenta_banco_globalCuentaBanco.add(jComboBoxid_tipo_cuenta_banco_globalCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCuentaBanco.add(jLabelcodigoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCuentaBanco.add(jButtoncodigoCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCuentaBanco.add(jscrollPanecodigoCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaCuentaBanco.add(jLabelnumero_cuentaCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaCuentaBanco.add(jButtonnumero_cuentaCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaCuentaBanco.add(jTextFieldnumero_cuentaCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeCuentaBanco.add(jLabelnumero_chequeCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeCuentaBanco.add(jButtonnumero_chequeCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeCuentaBanco.add(jTextFieldnumero_chequeCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cheque_auxiliarCuentaBanco.add(jLabelnumero_cheque_auxiliarCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cheque_auxiliarCuentaBanco.add(jButtonnumero_cheque_auxiliarCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cheque_auxiliarCuentaBanco.add(jTextFieldnumero_cheque_auxiliarCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoCuentaBanco.add(jLabelsaldoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoCuentaBanco.add(jButtonsaldoCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoCuentaBanco.add(jTextFieldsaldoCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprocedenciaCuentaBanco.add(jLabelprocedenciaCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelprocedenciaCuentaBanco.add(jButtonprocedenciaCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprocedenciaCuentaBanco.add(jscrollPaneprocedenciaCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldestinoCuentaBanco.add(jLabeldestinoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPaneldestinoCuentaBanco.add(jButtondestinoCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldestinoCuentaBanco.add(jscrollPanedestinoCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableCuentaBanco.add(jLabelid_cuenta_contableCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 2;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCuentaBanco.add(jButtonid_cuenta_contableCuentaBanco, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 3;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCuentaBanco.add(jButtonid_cuenta_contableCuentaBancoArbol, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 4;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaBanco.add(jButtonid_cuenta_contableCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 5;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaBanco.add(jButtonid_cuenta_contableCuentaBancoUpdate, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableCuentaBanco.add(jComboBoxid_cuenta_contableCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_bancoCuentaBanco.add(jLabeles_bancoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_bancoCuentaBanco.add(jButtones_bancoCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_bancoCuentaBanco.add(jCheckBoxes_bancoCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_cuenta_bancoCuentaBanco.add(jLabelid_estado_cuenta_bancoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_cuenta_bancoCuentaBanco.add(jButtonid_estado_cuenta_bancoCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 3;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_cuenta_bancoCuentaBanco.add(jButtonid_estado_cuenta_bancoCuentaBancoUpdate, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_cuenta_bancoCuentaBanco.add(jComboBoxid_estado_cuenta_bancoCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_ingresoCuentaBanco.add(jLabelid_formato_ingresoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_ingresoCuentaBanco.add(jButtonid_formato_ingresoCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 3;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_ingresoCuentaBanco.add(jButtonid_formato_ingresoCuentaBancoUpdate, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_ingresoCuentaBanco.add(jComboBoxid_formato_ingresoCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_egresoCuentaBanco.add(jLabelid_formato_egresoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_egresoCuentaBanco.add(jButtonid_formato_egresoCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 3;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_egresoCuentaBanco.add(jButtonid_formato_egresoCuentaBancoUpdate, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_egresoCuentaBanco.add(jComboBoxid_formato_egresoCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_diarioCuentaBanco.add(jLabelid_formato_diarioCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_diarioCuentaBanco.add(jButtonid_formato_diarioCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 3;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_diarioCuentaBanco.add(jButtonid_formato_diarioCuentaBancoUpdate, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_diarioCuentaBanco.add(jComboBoxid_formato_diarioCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_chequeCuentaBanco.add(jLabelid_formato_chequeCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_chequeCuentaBanco.add(jButtonid_formato_chequeCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 3;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_chequeCuentaBanco.add(jButtonid_formato_chequeCuentaBancoUpdate, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_chequeCuentaBanco.add(jComboBoxid_formato_chequeCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_retencionCuentaBanco.add(jLabelid_formato_retencionCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_retencionCuentaBanco.add(jButtonid_formato_retencionCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 3;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_retencionCuentaBanco.add(jButtonid_formato_retencionCuentaBancoUpdate, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_retencionCuentaBanco.add(jComboBoxid_formato_retencionCuentaBanco, this.gridBagConstraintsCuentaBanco);


	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 0;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_retencion_ivaCuentaBanco.add(jLabelid_formato_retencion_ivaCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 2;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_retencion_ivaCuentaBanco.add(jButtonid_formato_retencion_ivaCuentaBancoBusqueda, this.gridBagConstraintsCuentaBanco);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		//this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = 3;
		this.gridBagConstraintsCuentaBanco.ipadx = 0;
		this.gridBagConstraintsCuentaBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_retencion_ivaCuentaBanco.add(jButtonid_formato_retencion_ivaCuentaBancoUpdate, this.gridBagConstraintsCuentaBanco);
	}

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaBanco.gridy = 0;
	this.gridBagConstraintsCuentaBanco.gridx = 1;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_retencion_ivaCuentaBanco.add(jComboBoxid_formato_retencion_ivaCuentaBanco, this.gridBagConstraintsCuentaBanco);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposOcultosCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposOcultosCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaBanco.add(this.jPanelid_empresaCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposOcultosCuentaBanco % 2==0) {
		iXPanelCamposOcultosCuentaBanco=0;
		iYPanelCamposOcultosCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposOcultosCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposOcultosCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaBanco.add(this.jPanelid_sucursalCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposOcultosCuentaBanco % 2==0) {
		iXPanelCamposOcultosCuentaBanco=0;
		iYPanelCamposOcultosCuentaBanco++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPanelidCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPanelid_bancoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPanelid_tipo_cuenta_banco_globalCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPanelcodigoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPanelnumero_cuentaCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPanelnumero_chequeCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPanelnumero_cheque_auxiliarCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPanelsaldoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPanelprocedenciaCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPaneldestinoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.gridBagConstraintsCuentaBanco.gridwidth = 3;

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPanelid_cuenta_contableCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}

	iXPanelCamposIniciogeneralCuentaBanco=0;
	iYPanelCamposIniciogeneralCuentaBanco++;

	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPaneles_bancoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposIniciogeneralCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposIniciogeneralCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralCuentaBanco.add(this.jPanelid_estado_cuenta_bancoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposIniciogeneralCuentaBanco % 2==0) {
		iXPanelCamposIniciogeneralCuentaBanco=0;
		iYPanelCamposIniciogeneralCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposInicioformatoCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposInicioformatoCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoCuentaBanco.add(this.jPanelid_formato_ingresoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposInicioformatoCuentaBanco % 2==0) {
		iXPanelCamposInicioformatoCuentaBanco=0;
		iYPanelCamposInicioformatoCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposInicioformatoCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposInicioformatoCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoCuentaBanco.add(this.jPanelid_formato_egresoCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposInicioformatoCuentaBanco % 2==0) {
		iXPanelCamposInicioformatoCuentaBanco=0;
		iYPanelCamposInicioformatoCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposInicioformatoCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposInicioformatoCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoCuentaBanco.add(this.jPanelid_formato_diarioCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposInicioformatoCuentaBanco % 2==0) {
		iXPanelCamposInicioformatoCuentaBanco=0;
		iYPanelCamposInicioformatoCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposInicioformatoCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposInicioformatoCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoCuentaBanco.add(this.jPanelid_formato_chequeCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposInicioformatoCuentaBanco % 2==0) {
		iXPanelCamposInicioformatoCuentaBanco=0;
		iYPanelCamposInicioformatoCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposInicioformatoCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposInicioformatoCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoCuentaBanco.add(this.jPanelid_formato_retencionCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposInicioformatoCuentaBanco % 2==0) {
		iXPanelCamposInicioformatoCuentaBanco=0;
		iYPanelCamposInicioformatoCuentaBanco++;
	}
	this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaBanco.gridy = iYPanelCamposInicioformatoCuentaBanco;
	this.gridBagConstraintsCuentaBanco.gridx = iXPanelCamposInicioformatoCuentaBanco++;
	this.gridBagConstraintsCuentaBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoCuentaBanco.add(this.jPanelid_formato_retencion_ivaCuentaBanco, this.gridBagConstraintsCuentaBanco);



	if(iXPanelCamposInicioformatoCuentaBanco % 2==0) {
		iXPanelCamposInicioformatoCuentaBanco=0;
		iYPanelCamposInicioformatoCuentaBanco++;
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
			
		GridBagLayout gridaBagLayoutAccionesCuentaBanco= new GridBagLayout();
		this.jPanelAccionesCuentaBanco.setLayout(gridaBagLayoutAccionesCuentaBanco);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCuentaBanco= new GridBagLayout();
		this.jPanelAccionesFormularioCuentaBanco.setLayout(gridaBagLayoutAccionesFormularioCuentaBanco);
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaBanco.add(this.jComboBoxTiposAccionesFormularioCuentaBanco, this.gridBagConstraintsCuentaBanco);

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaBanco.add(this.jCheckBoxPostAccionNuevoCuentaBanco, this.gridBagConstraintsCuentaBanco);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cuentabancoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaBanco.add(this.jCheckBoxPostAccionSinCerrarCuentaBanco, this.gridBagConstraintsCuentaBanco);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cuentabancoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cuentabancoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaBanco.add(this.jCheckBoxPostAccionSinMensajeCuentaBanco, this.gridBagConstraintsCuentaBanco);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx = iPosXAccion++;
			
		this.jPanelAccionesCuentaBanco.add(this.jButtonModificarCuentaBanco, this.gridBagConstraintsCuentaBanco);							

		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaBanco.gridy = 0;
		this.gridBagConstraintsCuentaBanco.gridx =iPosXAccion++;
			
		this.jPanelAccionesCuentaBanco.add(this.jButtonEliminarCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
			
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = 0;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaBanco.add(this.jButtonActualizarCuentaBanco, this.gridBagConstraintsCuentaBanco);


		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = 0;		
		this.gridBagConstraintsCuentaBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaBanco.add(this.jButtonGuardarCambiosCuentaBanco, this.gridBagConstraintsCuentaBanco);	
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = 0;		
		this.gridBagConstraintsCuentaBanco.gridx =iPosXAccion++;
		
		this.jPanelAccionesCuentaBanco.add(this.jButtonCancelarCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaBanco);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentabancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();						
			this.gridBagConstraintsCuentaBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaBanco.gridx = 0;		
			//this.gridBagConstraintsCuentaBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaBanco.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaBanco.gridx =0;
		this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaBanco, this.gridBagConstraintsCuentaBanco);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CuentaBancoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCuentaBanco = new CuentaBancoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cuenta Banco DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cuenta Banco DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Banco Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CuentaBancoModel cuentabancoModel=new CuentaBancoModel(this);
			
			//SI USARA CLASE INTERNA
			//CuentaBancoModel.CuentaBancoFocusTraversalPolicy cuentabancoFocusTraversalPolicy = cuentabancoModel.new CuentaBancoFocusTraversalPolicy(this);
			
			//cuentabancoFocusTraversalPolicy.setcuentabancoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cuentabancoModel);
			
			
			this.jContentPaneDetalleCuentaBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCuentaBanco = new GridBagLayout();	
			this.jContentPaneDetalleCuentaBanco.setLayout(gridaBagLayoutDetalleCuentaBanco);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaBanco = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
				this.gridBagConstraintsCuentaBanco.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCuentaBanco.gridx = 0;
					
				
				this.jContentPaneDetalleCuentaBanco.add(jTtoolBarDetalleCuentaBanco, gridBagConstraintsCuentaBanco);								
				
}
			
			this.jScrollPanelDatosEdicionCuentaBanco=   new JScrollPane(jContentPaneDetalleCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCuentaBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsCuentaBanco.gridy = iGridyRelaciones++;
		this.gridBagConstraintsCuentaBanco.gridx = 0;

		this.jContentPaneDetalleCuentaBanco.add(jPanelCamposIniciogeneralCuentaBanco, gridBagConstraintsCuentaBanco);


		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsCuentaBanco.gridy = iGridyRelaciones++;
		this.gridBagConstraintsCuentaBanco.gridx = 0;

		this.jContentPaneDetalleCuentaBanco.add(jPanelCamposInicioformatoCuentaBanco, gridBagConstraintsCuentaBanco);
			
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
						&& cuentabancoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAutoriPago(this.puedeCargarPorParteAutoriPago,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameAutoriPagoOrdenCompra(this.puedeCargarPorParteAutoriPagoOrdenCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleChequeGirado(this.puedeCargarPorParteDetalleChequeGirado,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePagoAuto(this.puedeCargarPorPartePagoAuto,false,-1);
					
					if(this.cuentabancoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCuentaBanco= new GridBagConstraints();
						this.gridBagConstraintsCuentaBanco.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCuentaBanco.gridx = 0;
						this.jContentPaneDetalleCuentaBanco.add(this.jTabbedPaneRelacionesCuentaBanco, this.gridBagConstraintsCuentaBanco);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCuentaBanco.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAutoriPago(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameAutoriPagoOrdenCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleChequeGirado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePagoAuto(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCuentaBanco.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
					this.gridBagConstraintsCuentaBanco.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCuentaBanco.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCuentaBanco.gridx = 0;
					
				
					this.jContentPaneDetalleCuentaBanco.add(jPanelCamposOcultosCuentaBanco, gridBagConstraintsCuentaBanco);
				
					this.jPanelCamposOcultosCuentaBanco.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.gridy = iGridyRelaciones++;//13;		
	        this.gridBagConstraintsCuentaBanco.gridx = 0;
	        this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCuentaBanco.add(this.jPanelAccionesFormularioCuentaBanco, this.gridBagConstraintsCuentaBanco);							
			
			
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
	        this.gridBagConstraintsCuentaBanco.gridy = iGridyRelaciones;//13;		
	        this.gridBagConstraintsCuentaBanco.gridx = 0;
	        
			
			this.jContentPaneDetalleCuentaBanco.add(this.jPanelAccionesCuentaBanco, this.gridBagConstraintsCuentaBanco);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCuentaBanco);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCuentaBanco=   new JScrollPane(this.jPanelCamposCuentaBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCuentaBanco.gridx = 0;
			this.gridBagConstraintsCuentaBanco.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCuentaBanco.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCuentaBanco.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCuentaBanco, this.gridBagConstraintsCuentaBanco);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCuentaBanco, this.gridBagConstraintsCuentaBanco);			
			
			this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
			this.gridBagConstraintsCuentaBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCuentaBanco, this.gridBagConstraintsCuentaBanco);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaBanco, this.gridBagConstraintsCuentaBanco);
			
			
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaBanco, this.gridBagConstraintsCuentaBanco);
		
			
		this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
		this.gridBagConstraintsCuentaBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaBanco, this.gridBagConstraintsCuentaBanco);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCuentaBanco;//jContentPane;
		
		return jScrollPanelDatosEdicionCuentaBanco;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAutoriPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.autoripagoSessionBean=new AutoriPagoSessionBean();
		this.autoripagoSessionBean.setConGuardarRelaciones(false);
		this.autoripagoSessionBean.setEsGuardarRelacionado(true);

		this.autoripagoBeanSwingJInternalFrame=null;//new AutoriPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.autoripagoBeanSwingJInternalFramePopup=new AutoriPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.autoripagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.autoripagoSessionBean.getEsGuardarRelacionado()) {

				AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL=CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				AutoriPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.autoripagoSessionBean.setEsGuardarRelacionado(true);

				this.autoripagoBeanSwingJInternalFrame=new AutoriPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.autoripagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.autoripagoBeanSwingJInternalFrame.setautoripagoSessionBean(this.autoripagoSessionBean);

				//this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
				//this.gridBagConstraintsCuentaBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCuentaBanco.gridx = 0;
				//this.jContentPaneDetalleCuentaBanco.add(this.autoripagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCuentaBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCuentaBanco.add("Autori Pagos",this.autoripagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCuentaBanco.setComponentAt(iIndexTab,this.autoripagoBeanSwingJInternalFrame.getContentPane());
				}

				//AutoriPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.autoripagoSessionBean.setEsGuardarRelacionado(false);
				this.autoripagoBeanSwingJInternalFrame=null;//new AutoriPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.autoripagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAutoriPago) {
					this.jTabbedPaneRelacionesCuentaBanco.add("Autori Pagos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameAutoriPagoOrdenCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.autoripagoordencompraSessionBean=new AutoriPagoOrdenCompraSessionBean();
		this.autoripagoordencompraSessionBean.setConGuardarRelaciones(false);
		this.autoripagoordencompraSessionBean.setEsGuardarRelacionado(true);

		this.autoripagoordencompraBeanSwingJInternalFrame=null;//new AutoriPagoOrdenCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.autoripagoordencompraBeanSwingJInternalFramePopup=new AutoriPagoOrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.autoripagoordencompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {

				AutoriPagoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				AutoriPagoOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.autoripagoordencompraSessionBean.setEsGuardarRelacionado(true);

				this.autoripagoordencompraBeanSwingJInternalFrame=new AutoriPagoOrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.autoripagoordencompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.autoripagoordencompraBeanSwingJInternalFrame.setautoripagoordencompraSessionBean(this.autoripagoordencompraSessionBean);

				//this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
				//this.gridBagConstraintsCuentaBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCuentaBanco.gridx = 0;
				//this.jContentPaneDetalleCuentaBanco.add(this.autoripagoordencompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCuentaBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCuentaBanco.add("Autori Pago Orden Compras",this.autoripagoordencompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCuentaBanco.setComponentAt(iIndexTab,this.autoripagoordencompraBeanSwingJInternalFrame.getContentPane());
				}

				//AutoriPagoOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.autoripagoordencompraSessionBean.setEsGuardarRelacionado(false);
				this.autoripagoordencompraBeanSwingJInternalFrame=null;//new AutoriPagoOrdenCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.autoripagoordencompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAutoriPagoOrdenCompra) {
					this.jTabbedPaneRelacionesCuentaBanco.add("Autori Pago Orden Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleChequeGirado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallechequegiradoSessionBean=new DetalleChequeGiradoSessionBean();
		this.detallechequegiradoSessionBean.setConGuardarRelaciones(false);
		this.detallechequegiradoSessionBean.setEsGuardarRelacionado(true);

		this.detallechequegiradoBeanSwingJInternalFrame=null;//new DetalleChequeGiradoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallechequegiradoBeanSwingJInternalFramePopup=new DetalleChequeGiradoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallechequegiradoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {

				DetalleChequeGiradoJInternalFrame.STIPO_TAMANIO_GENERAL=CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleChequeGiradoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallechequegiradoSessionBean.setEsGuardarRelacionado(true);

				this.detallechequegiradoBeanSwingJInternalFrame=new DetalleChequeGiradoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallechequegiradoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallechequegiradoBeanSwingJInternalFrame.setdetallechequegiradoSessionBean(this.detallechequegiradoSessionBean);

				//this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
				//this.gridBagConstraintsCuentaBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCuentaBanco.gridx = 0;
				//this.jContentPaneDetalleCuentaBanco.add(this.detallechequegiradoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCuentaBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCuentaBanco.add("Detalle Cheque Girados",this.detallechequegiradoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCuentaBanco.setComponentAt(iIndexTab,this.detallechequegiradoBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleChequeGiradoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallechequegiradoSessionBean.setEsGuardarRelacionado(false);
				this.detallechequegiradoBeanSwingJInternalFrame=null;//new DetalleChequeGiradoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallechequegiradoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleChequeGirado) {
					this.jTabbedPaneRelacionesCuentaBanco.add("Detalle Cheque Girados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePagoAuto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pagoautoSessionBean=new PagoAutoSessionBean();
		this.pagoautoSessionBean.setConGuardarRelaciones(false);
		this.pagoautoSessionBean.setEsGuardarRelacionado(true);

		this.pagoautoBeanSwingJInternalFrame=null;//new PagoAutoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pagoautoBeanSwingJInternalFramePopup=new PagoAutoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pagoautoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pagoautoSessionBean.getEsGuardarRelacionado()) {

				PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL=CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PagoAutoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CuentaBancoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pagoautoSessionBean.setEsGuardarRelacionado(true);

				this.pagoautoBeanSwingJInternalFrame=new PagoAutoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.pagoautoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pagoautoBeanSwingJInternalFrame.setpagoautoSessionBean(this.pagoautoSessionBean);

				//this.gridBagConstraintsCuentaBanco = new GridBagConstraints();
				//this.gridBagConstraintsCuentaBanco.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCuentaBanco.gridx = 0;
				//this.jContentPaneDetalleCuentaBanco.add(this.pagoautoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCuentaBanco);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCuentaBanco.add("Pago Autos",this.pagoautoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCuentaBanco.setComponentAt(iIndexTab,this.pagoautoBeanSwingJInternalFrame.getContentPane());
				}

				//PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pagoautoSessionBean.setEsGuardarRelacionado(false);
				this.pagoautoBeanSwingJInternalFrame=null;//new PagoAutoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pagoautoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePagoAuto) {
					this.jTabbedPaneRelacionesCuentaBanco.add("Pago Autos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPagoAutoBeanSwingJInternalFrame(List<CuentaBanco> cuentabancos,CuentaBanco cuentabanco,PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pagoautoBeanSwingJInternalFrame=new PagoAutoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pagoautoBeanSwingJInternalFrame.getPagoAutoLogic().setConnexion(this.cuentabancoLogic.getConnexion());

					pagoautoBeanSwingJInternalFrame.setcuentabancosForeignKey(cuentabancos);
					pagoautoBeanSwingJInternalFrame.setcuentabancoForeignKey(cuentabanco);
					pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setisBusquedaDesdeForeignKeySesionCuentaBanco(true);
					pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setlidCuentaBancoActual(cuentabanco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pagoautoBeanSwingJInternalFrame.cargarCombosForeignKeyPagoAuto(pagoautoBeanSwingJInternalFrame.isCargarCombosDependencia);
					pagoautoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCuentaBanco(true);
					pagoautoBeanSwingJInternalFrame.setid_cuenta_bancoFK_IdCuentaBanco(cuentabanco.getId());

					if(!this.conCargarFormDetalle) {
						pagoautoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pagoautoBeanSwingJInternalFrame.setSelectedItemCombosFrameCuentaBancoForeignKey(cuentabanco,1,false,true,true);
					pagoautoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pagoautoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCuentaBanco");
					pagoautoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCuentaBanco");
					pagoautoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPagoAuto(true);
					pagoautoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPagoAuto("n",pagoautoBeanSwingJInternalFrame.isGuardarCambiosEnLote, pagoautoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pagoautoBeanSwingJInternalFrame.setAutoscrolls(true);
					pagoautoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pagoautoBeanSwingJInternalFrame.actualizarEstadoPanelsPagoAuto("relacionado");
					} else {
						pagoautoBeanSwingJInternalFrame.actualizarEstadoPanelsPagoAuto("no_relacionado");
					}

					pagoautoBeanSwingJInternalFrame.getjButtonRecargarInformacionPagoAuto().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAutoriPagoOrdenCompraBeanSwingJInternalFrame(List<CuentaBanco> cuentabancos,CuentaBanco cuentabanco,AutoriPagoOrdenCompraBeanSwingJInternalFrame autoripagoordencompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//autoripagoordencompraBeanSwingJInternalFrame=new AutoriPagoOrdenCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					autoripagoordencompraBeanSwingJInternalFrame.getAutoriPagoOrdenCompraLogic().setConnexion(this.cuentabancoLogic.getConnexion());

					autoripagoordencompraBeanSwingJInternalFrame.setcuentabancosForeignKey(cuentabancos);
					autoripagoordencompraBeanSwingJInternalFrame.setcuentabancoForeignKey(cuentabanco);
					autoripagoordencompraBeanSwingJInternalFrame.autoripagoordencompraSessionBean.setisBusquedaDesdeForeignKeySesionCuentaBanco(true);
					autoripagoordencompraBeanSwingJInternalFrame.autoripagoordencompraSessionBean.setlidCuentaBancoActual(cuentabanco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					autoripagoordencompraBeanSwingJInternalFrame.cargarCombosForeignKeyAutoriPagoOrdenCompra(autoripagoordencompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					autoripagoordencompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaCuentaBanco(true);
					autoripagoordencompraBeanSwingJInternalFrame.setid_cuenta_bancoFK_IdCuentaBanco(cuentabanco.getId());

					if(!this.conCargarFormDetalle) {
						autoripagoordencompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					autoripagoordencompraBeanSwingJInternalFrame.setSelectedItemCombosFrameCuentaBancoForeignKey(cuentabanco,1,false,true,true);
					autoripagoordencompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					autoripagoordencompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdCuentaBanco");
					autoripagoordencompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCuentaBanco");
					autoripagoordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriPagoOrdenCompra(true);
					autoripagoordencompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAutoriPagoOrdenCompra("n",autoripagoordencompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, autoripagoordencompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					autoripagoordencompraBeanSwingJInternalFrame.setAutoscrolls(true);
					autoripagoordencompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						autoripagoordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPagoOrdenCompra("relacionado");
					} else {
						autoripagoordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPagoOrdenCompra("no_relacionado");
					}

					autoripagoordencompraBeanSwingJInternalFrame.getjButtonRecargarInformacionAutoriPagoOrdenCompra().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleChequeGiradoBeanSwingJInternalFrame(List<CuentaBanco> cuentabancos,CuentaBanco cuentabanco,DetalleChequeGiradoBeanSwingJInternalFrame detallechequegiradoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallechequegiradoBeanSwingJInternalFrame=new DetalleChequeGiradoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallechequegiradoBeanSwingJInternalFrame.getDetalleChequeGiradoLogic().setConnexion(this.cuentabancoLogic.getConnexion());

					detallechequegiradoBeanSwingJInternalFrame.setcuentabancosForeignKey(cuentabancos);
					detallechequegiradoBeanSwingJInternalFrame.setcuentabancoForeignKey(cuentabanco);
					detallechequegiradoBeanSwingJInternalFrame.detallechequegiradoSessionBean.setisBusquedaDesdeForeignKeySesionCuentaBanco(true);
					detallechequegiradoBeanSwingJInternalFrame.detallechequegiradoSessionBean.setlidCuentaBancoActual(cuentabanco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallechequegiradoBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleChequeGirado(detallechequegiradoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallechequegiradoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCuentaBanco(true);
					detallechequegiradoBeanSwingJInternalFrame.setid_cuenta_bancoFK_IdCuentaBanco(cuentabanco.getId());

					if(!this.conCargarFormDetalle) {
						detallechequegiradoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallechequegiradoBeanSwingJInternalFrame.setSelectedItemCombosFrameCuentaBancoForeignKey(cuentabanco,1,false,true,true);
					detallechequegiradoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallechequegiradoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCuentaBanco");
					detallechequegiradoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCuentaBanco");
					detallechequegiradoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleChequeGirado(true);
					detallechequegiradoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleChequeGirado("n",detallechequegiradoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallechequegiradoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallechequegiradoBeanSwingJInternalFrame.setAutoscrolls(true);
					detallechequegiradoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallechequegiradoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleChequeGirado("relacionado");
					} else {
						detallechequegiradoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleChequeGirado("no_relacionado");
					}

					detallechequegiradoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleChequeGirado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAutoriPagoBeanSwingJInternalFrame(List<CuentaBanco> cuentabancos,CuentaBanco cuentabanco,AutoriPagoBeanSwingJInternalFrame autoripagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//autoripagoBeanSwingJInternalFrame=new AutoriPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					autoripagoBeanSwingJInternalFrame.getAutoriPagoLogic().setConnexion(this.cuentabancoLogic.getConnexion());

					autoripagoBeanSwingJInternalFrame.setcuentabancosForeignKey(cuentabancos);
					autoripagoBeanSwingJInternalFrame.setcuentabancoForeignKey(cuentabanco);
					autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setisBusquedaDesdeForeignKeySesionCuentaBanco(true);
					autoripagoBeanSwingJInternalFrame.autoripagoSessionBean.setlidCuentaBancoActual(cuentabanco.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					autoripagoBeanSwingJInternalFrame.cargarCombosForeignKeyAutoriPago(autoripagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					autoripagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCuentaBanco(true);
					autoripagoBeanSwingJInternalFrame.setid_cuenta_bancoFK_IdCuentaBanco(cuentabanco.getId());

					if(!this.conCargarFormDetalle) {
						autoripagoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					autoripagoBeanSwingJInternalFrame.setSelectedItemCombosFrameCuentaBancoForeignKey(cuentabanco,1,false,true,true);
					autoripagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					autoripagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCuentaBanco");
					autoripagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCuentaBanco");
					autoripagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriPago(true);
					autoripagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAutoriPago("n",autoripagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, autoripagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					autoripagoBeanSwingJInternalFrame.setAutoscrolls(true);
					autoripagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						autoripagoBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPago("relacionado");
					} else {
						autoripagoBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriPago("no_relacionado");
					}

					autoripagoBeanSwingJInternalFrame.getjButtonRecargarInformacionAutoriPago().setVisible(false);

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
