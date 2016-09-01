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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.SriConstantesFunciones;

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
public class SriDetalleFormJInternalFrame extends SriBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	/*
	public JToolBar jTtoolBarDetalleSri;
	
	protected JMenuBar jmenuBarDetalleSri;
	
	protected JMenu jmenuDetalleSri;
	protected JMenu jmenuDetalleArchivoSri;
	protected JMenu jmenuDetalleAccionesSri;
	protected JMenu jmenuDetalleDatosSri;
	
	*/
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSri;	
	protected GridBagConstraints gridBagConstraintsSri;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SriBeanSwingJInternalFrameAdditional jInternalFrameDetalleSri;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected TransaccionContaBeanSwingJInternalFrame transaccioncontaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionconta="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobante="";

	protected TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotributario="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";

	protected TipoRetencionIvaBeanSwingJInternalFrame tiporetencionivabienBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivabien="";

	protected TipoRetencionIvaBeanSwingJInternalFrame tiporetencionivaservicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivaservicio="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";
	
	public SriSessionBean sriSessionBean;
	
	
	
	
	public AsientoContableSessionBean asientocontableSessionBean;
	public TransaccionContaSessionBean transaccioncontaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
	public TipoTributarioSessionBean tipotributarioSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	public TipoRetencionIvaSessionBean tiporetencionivabienSessionBean;
	public TipoRetencionIvaSessionBean tiporetencionivaservicioSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;	
	
	public SriLogic sriLogic;
	
	public JScrollPane jScrollPanelDatosSri;
	public JScrollPane jScrollPanelDatosEdicionSri;
	public JScrollPane jScrollPanelDatosGeneralSri;
	
	protected JPanel jPanelCamposSri;    
	protected JPanel jPanelCamposOcultosSri;    	
	protected JPanel jPanelAccionesSri;
	protected JPanel jPanelAccionesFormularioSri;
    
	
	
	protected Integer iXPanelCamposSri=0;
	protected Integer iYPanelCamposSri=0;
	
	protected Integer iXPanelCamposOcultosSri=0;
	protected Integer iYPanelCamposOcultosSri=0;
	
	

	protected JPanel jPanelCamposIniciogeneralSri;
	protected Integer iXPanelCamposIniciogeneralSri=0;
	protected Integer iYPanelCamposIniciogeneralSri=0;

	protected JPanel jPanelCamposIniciogeneral2Sri;
	protected Integer iXPanelCamposIniciogeneral2Sri=0;
	protected Integer iYPanelCamposIniciogeneral2Sri=0;

	protected JPanel jPanelCamposIniciobienes_servicios_tarSri;
	protected Integer iXPanelCamposIniciobienes_servicios_tarSri=0;
	protected Integer iYPanelCamposIniciobienes_servicios_tarSri=0;

	protected JPanel jPanelCamposIniciobienes_servicios_retSri;
	protected Integer iXPanelCamposIniciobienes_servicios_retSri=0;
	protected Integer iYPanelCamposIniciobienes_servicios_retSri=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSri;
	public JButton jButtonModificarSri;
	public JButton jButtonActualizarSri;
    public JButton jButtonEliminarSri;
	public JButton jButtonCancelarSri;
    public JButton jButtonGuardarCambiosSri;
	public JButton jButtonGuardarCambiosTablaSri;
	protected JButton jButtonCerrarSri;
	
	/*
	protected JButton jButtonProcesarInformacionSri;
	*/
	
	protected JCheckBox jCheckBoxPostAccionNuevoSri;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSri;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSri;
	
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarSri;
	protected JButton jButtonModificarToolBarSri;
	protected JButton jButtonActualizarToolBarSri;
    protected JButton jButtonEliminarToolBarSri;
	protected JButton jButtonCancelarToolBarSri;
    protected JButton jButtonGuardarCambiosToolBarSri;
	protected JButton jButtonGuardarCambiosTablaToolBarSri;
	protected JButton jButtonMostrarOcultarTablaToolBarSri;
	protected JButton jButtonCerrarToolBarSri;
	
	protected JButton jButtonProcesarInformacionToolBarSri;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoSri;
	protected JMenuItem jMenuItemModificarSri;
	protected JMenuItem jMenuItemActualizarSri;
    protected JMenuItem jMenuItemEliminarSri;
	protected JMenuItem jMenuItemCancelarSri;
    protected JMenuItem jMenuItemGuardarCambiosSri;
	protected JMenuItem jMenuItemGuardarCambiosTablaSri;
	protected JMenuItem jMenuItemCerrarSri;
	protected JMenuItem jMenuItemDetalleCerrarSri;
	protected JMenuItem jMenuItemDetalleMostarOcultarSri;
	
	protected JMenuItem jMenuItemProcesarInformacionSri;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSri;
	protected JMenuItem jMenuItemMostrarOcultarSri;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesSri;	
		
	/*
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSri;
	*/
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSri;
	
	/*	
	
	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSri;
	public JLabel jLabelIdSri;
	public JLabel jLabelidSri;
	public JButton jButtonidSriBusqueda= new JButtonMe();

	public JPanel jPanelrucSri;
	public JLabel jLabelrucSri;
	public JTextField jTextFieldrucSri;
	public JButton jButtonrucSriBusqueda= new JButtonMe();

	public JPanel jPanelrazon_socialSri;
	public JLabel jLabelrazon_socialSri;
	public JTextArea jTextArearazon_socialSri;
	public JScrollPane jscrollPanerazon_socialSri;
	public JButton jButtonrazon_socialSriBusqueda= new JButtonMe();

	public JPanel jPaneles_riseSri;
	public JLabel jLabeles_riseSri;
	public JCheckBox jCheckBoxes_riseSri;
	public JButton jButtones_riseSriBusqueda= new JButtonMe();

	public JPanel jPanelnumero_serieSri;
	public JLabel jLabelnumero_serieSri;
	public JTextField jTextFieldnumero_serieSri;
	public JButton jButtonnumero_serieSriBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizacionSri;
	public JLabel jLabelnumero_autorizacionSri;
	public JTextField jTextFieldnumero_autorizacionSri;
	public JButton jButtonnumero_autorizacionSriBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialSri;
	public JLabel jLabelnumero_secuencialSri;
	public JTextField jTextFieldnumero_secuencialSri;
	public JButton jButtonnumero_secuencialSriBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionSri;
	public JLabel jLabelfecha_emisionSri;
	//public JFormattedTextField jDateChooserfecha_emisionSri;

	public JDateChooser jDateChooserfecha_emisionSri;
	public JButton jButtonfecha_emisionSriBusqueda= new JButtonMe();

	public JPanel jPanelfecha_registro_contableSri;
	public JLabel jLabelfecha_registro_contableSri;
	//public JFormattedTextField jDateChooserfecha_registro_contableSri;

	public JDateChooser jDateChooserfecha_registro_contableSri;
	public JButton jButtonfecha_registro_contableSriBusqueda= new JButtonMe();

	public JPanel jPanelfecha_caducidadSri;
	public JLabel jLabelfecha_caducidadSri;
	//public JFormattedTextField jDateChooserfecha_caducidadSri;

	public JDateChooser jDateChooserfecha_caducidadSri;
	public JButton jButtonfecha_caducidadSriBusqueda= new JButtonMe();

	public JPanel jPanelbienes_tar12Sri;
	public JLabel jLabelbienes_tar12Sri;
	public JTextField jTextFieldbienes_tar12Sri;
	public JButton jButtonbienes_tar12SriBusqueda= new JButtonMe();

	public JPanel jPanelbienes_tar0Sri;
	public JLabel jLabelbienes_tar0Sri;
	public JTextField jTextFieldbienes_tar0Sri;
	public JButton jButtonbienes_tar0SriBusqueda= new JButtonMe();

	public JPanel jPanelservicios_tar12Sri;
	public JLabel jLabelservicios_tar12Sri;
	public JTextField jTextFieldservicios_tar12Sri;
	public JButton jButtonservicios_tar12SriBusqueda= new JButtonMe();

	public JPanel jPanelservicios_tar0Sri;
	public JLabel jLabelservicios_tar0Sri;
	public JTextField jTextFieldservicios_tar0Sri;
	public JButton jButtonservicios_tar0SriBusqueda= new JButtonMe();

	public JPanel jPanelmonto_ivaSri;
	public JLabel jLabelmonto_ivaSri;
	public JTextField jTextFieldmonto_ivaSri;
	public JButton jButtonmonto_ivaSriBusqueda= new JButtonMe();

	public JPanel jPanelbase_impo_tar12Sri;
	public JLabel jLabelbase_impo_tar12Sri;
	public JTextField jTextFieldbase_impo_tar12Sri;
	public JButton jButtonbase_impo_tar12SriBusqueda= new JButtonMe();

	public JPanel jPanelbase_impo_tar0Sri;
	public JLabel jLabelbase_impo_tar0Sri;
	public JTextField jTextFieldbase_impo_tar0Sri;
	public JButton jButtonbase_impo_tar0SriBusqueda= new JButtonMe();

	public JPanel jPanelmonto_iceSri;
	public JLabel jLabelmonto_iceSri;
	public JTextField jTextFieldmonto_iceSri;
	public JButton jButtonmonto_iceSriBusqueda= new JButtonMe();

	public JPanel jPanelmonto_iva_bienSri;
	public JLabel jLabelmonto_iva_bienSri;
	public JTextField jTextFieldmonto_iva_bienSri;
	public JButton jButtonmonto_iva_bienSriBusqueda= new JButtonMe();

	public JPanel jPanelmonto_iva_servicioSri;
	public JLabel jLabelmonto_iva_servicioSri;
	public JTextField jTextFieldmonto_iva_servicioSri;
	public JButton jButtonmonto_iva_servicioSriBusqueda= new JButtonMe();

	public JPanel jPanelretencion_iva_bienSri;
	public JLabel jLabelretencion_iva_bienSri;
	public JTextField jTextFieldretencion_iva_bienSri;
	public JButton jButtonretencion_iva_bienSriBusqueda= new JButtonMe();

	public JPanel jPanelretencion_iva_servicioSri;
	public JLabel jLabelretencion_iva_servicioSri;
	public JTextField jTextFieldretencion_iva_servicioSri;
	public JButton jButtonretencion_iva_servicioSriBusqueda= new JButtonMe();

	public JPanel jPanelcon_devolucionSri;
	public JLabel jLabelcon_devolucionSri;
	public JCheckBox jCheckBoxcon_devolucionSri;
	public JButton jButtoncon_devolucionSriBusqueda= new JButtonMe();

	
	public JPanel jPanelid_asiento_contableSri;
	public JLabel jLabelid_asiento_contableSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableSri;
	public JButton jButtonid_asiento_contableSri= new JButtonMe();
	public JButton jButtonid_asiento_contableSriUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableSriBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_contaSri;
	public JLabel jLabelid_transaccion_contaSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_contaSri;
	public JButton jButtonid_transaccion_contaSri= new JButtonMe();
	public JButton jButtonid_transaccion_contaSriUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_contaSriBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteSri;
	public JLabel jLabelid_clienteSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteSri;
	public JButton jButtonid_clienteSri= new JButtonMe();
	public JButton jButtonid_clienteSriUpdate= new JButtonMe();
	public JButton jButtonid_clienteSriBusqueda= new JButtonMe();

	public JPanel jPaneltipo_comprobanteSri;
	public JLabel jLabeltipo_comprobanteSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxtipo_comprobanteSri;
	public JButton jButtontipo_comprobanteSri= new JButtonMe();
	public JButton jButtontipo_comprobanteSriUpdate= new JButtonMe();
	public JButton jButtontipo_comprobanteSriBusqueda= new JButtonMe();

	public JPanel jPaneltipo_tributarioSri;
	public JLabel jLabeltipo_tributarioSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxtipo_tributarioSri;
	public JButton jButtontipo_tributarioSri= new JButtonMe();
	public JButton jButtontipo_tributarioSriUpdate= new JButtonMe();
	public JButton jButtontipo_tributarioSriBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_ivaSri;
	public JLabel jLabelid_tipo_ivaSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ivaSri;
	public JButton jButtonid_tipo_ivaSri= new JButtonMe();
	public JButton jButtonid_tipo_ivaSriUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ivaSriBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_iva_bienSri;
	public JLabel jLabelid_tipo_retencion_iva_bienSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_bienSri;
	public JButton jButtonid_tipo_retencion_iva_bienSri= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_bienSriUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_bienSriBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_iva_servicioSri;
	public JLabel jLabelid_tipo_retencion_iva_servicioSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_servicioSri;
	public JButton jButtonid_tipo_retencion_iva_servicioSri= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_servicioSriUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_servicioSriBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoSri;
	public JLabel jLabelid_tipo_movimientoSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoSri;
	public JButton jButtonid_tipo_movimientoSri= new JButtonMe();
	public JButton jButtonid_tipo_movimientoSriUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoSriBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSri;
	
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
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=1012;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SriDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSri=new JPanel();
				this.jPanelAccionesFormularioSri=new JPanel();
				this.jmenuBarDetalleSri=new JMenuBar();
				this.jTtoolBarDetalleSri=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Sri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SriDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Sri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Sri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Sri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	public JButton getjButtonActualizarToolBarSri() {
		return this.jButtonActualizarToolBarSri;
	}
	
	public JButton getjButtonEliminarToolBarSri() {
		return this.jButtonEliminarToolBarSri;
	}
	
	public JButton getjButtonCancelarToolBarSri() {
		return this.jButtonCancelarToolBarSri;
	}		
	
	public JButton getjButtonProcesarInformacionSri() {
		return this.jButtonProcesarInformacionSri;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSri)	{
		this.jButtonProcesarInformacionSri = jButtonProcesarInformacionSri;
	}
	*/
	
	

	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSri() {
		return this.jComboBoxTiposAccionesSri;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSri(
			JComboBox jComboBoxTiposRelacionesSri) {
		this.jComboBoxTiposRelacionesSri = jComboBoxTiposRelacionesSri;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSri(
			JComboBox jComboBoxTiposAccionesSri) {
		this.jComboBoxTiposAccionesSri = jComboBoxTiposAccionesSri;
	}		
	
	*/		
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSri() {
		return this.jComboBoxTiposAccionesFormularioSri;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSri(
			JComboBox jComboBoxTiposAccionesFormularioSri) {
		this.jComboBoxTiposAccionesFormularioSri = jComboBoxTiposAccionesFormularioSri;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.sriSessionBean=new SriSessionBean();
		
		this.sriSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sriSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sriSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SriJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SriJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SriJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sri MANTENIMIENTO"));
		
		
		if(iWidth > 3250) {
			iWidth=3250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.sriSessionBean.getEsGuardarRelacionado()) {
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
	
		SriJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSri= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSri=new JButtonMe();
				this.jButtonModificarToolBarSri=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSri,this.jTtoolBarDetalleSri,
							"actualizar","actualizar","Actualizar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSri,this.jTtoolBarDetalleSri,
							"eliminar","eliminar","Eliminar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSri,this.jTtoolBarDetalleSri,
							"cancelar","cancelar","Cancelar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSri,this.jTtoolBarDetalleSri,
							"guardarcambios","guardarcambios","Guardar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSri,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSri,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSri,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	*/
	
	/*
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSri=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSri=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSri=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSri=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSri=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSri= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSri.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSri,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSri= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSri.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSri,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSri= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSri.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSri,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSri= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSri.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSri,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSri= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSri.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSri,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSri= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSri.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSri,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSri= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSri.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSri,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSri= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSri.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSri,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSri= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSri.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSri,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSri= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSri.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSri,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSri, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSri.add(this.jMenuItemDetalleCerrarSri);
		
		this.jmenuDetalleAccionesSri.add(this.jMenuItemActualizarSri);
		this.jmenuDetalleAccionesSri.add(this.jMenuItemEliminarSri);
		this.jmenuDetalleAccionesSri.add(this.jMenuItemCancelarSri);		
		
		//this.jmenuDetalleDatosSri.add(this.jMenuItemDetalleAbrirOrderBySri);				
		this.jmenuDetalleDatosSri.add(this.jMenuItemDetalleMostarOcultarSri);				
				
		//this.jmenuDetalleAccionesSri.add(this.jMenuItemGuardarCambiosSri);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSri, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSri.add(this.jmenuDetalleArchivoSri);		
		this.jmenuBarDetalleSri.add(this.jmenuDetalleAccionesSri);		
		this.jmenuBarDetalleSri.add(this.jmenuDetalleDatosSri);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSri);				
	}
	*/
	
	public void inicializarElementosCamposSri() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSri = new JLabelMe();
		jLabelIdSri.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSri = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSri.setToolTipText(SriConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSri= new GridBagLayout();

		this.jPanelidSri.setLayout(this.gridaBagLayoutSri);

		jLabelidSri = new JLabel();
		jLabelidSri.setText("Id");

		jLabelidSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelrucSri = new JLabelMe();
		this.jLabelrucSri.setText(""+SriConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucSri.setToolTipText("Ruc");
		this.jLabelrucSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucSri.setToolTipText(SriConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelrucSri.setLayout(this.gridaBagLayoutSri);


		jTextFieldrucSri= new JTextFieldMe();

		jTextFieldrucSri.setEnabled(false);
		jTextFieldrucSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucSriBusqueda= new JButtonMe();
		this.jButtonrucSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucSriBusqueda.setText("U");
		this.jButtonrucSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucSriBusqueda.setVisible(false);		}


					
		this.jLabelrazon_socialSri = new JLabelMe();
		this.jLabelrazon_socialSri.setText(""+SriConstantesFunciones.LABEL_RAZONSOCIAL+" : *");
		this.jLabelrazon_socialSri.setToolTipText("Razon Social");
		this.jLabelrazon_socialSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrazon_socialSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrazon_socialSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrazon_socialSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrazon_socialSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrazon_socialSri.setToolTipText(SriConstantesFunciones.LABEL_RAZONSOCIAL);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelrazon_socialSri.setLayout(this.gridaBagLayoutSri);


		jTextArearazon_socialSri= new JTextAreaMe();
		jTextArearazon_socialSri.setEnabled(false);
		jTextArearazon_socialSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearazon_socialSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearazon_socialSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearazon_socialSri.setLineWrap(true);
		jTextArearazon_socialSri.setWrapStyleWord(true);
		jTextArearazon_socialSri.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearazon_socialSri.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextArearazon_socialSri,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanerazon_socialSri = new JScrollPane(jTextArearazon_socialSri);
		jscrollPanerazon_socialSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerazon_socialSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerazon_socialSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonrazon_socialSriBusqueda= new JButtonMe();
		this.jButtonrazon_socialSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrazon_socialSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrazon_socialSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrazon_socialSriBusqueda.setText("U");
		this.jButtonrazon_socialSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrazon_socialSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrazon_socialSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearazon_socialSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearazon_socialSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"razon_socialSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrazon_socialSriBusqueda.setVisible(false);		}


					
		this.jLabeles_riseSri = new JLabelMe();
		this.jLabeles_riseSri.setText(""+SriConstantesFunciones.LABEL_ESRISE+" : *");
		this.jLabeles_riseSri.setToolTipText("Es Rise");
		this.jLabeles_riseSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_riseSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_riseSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_riseSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_riseSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_riseSri.setToolTipText(SriConstantesFunciones.LABEL_ESRISE);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPaneles_riseSri.setLayout(this.gridaBagLayoutSri);


		jCheckBoxes_riseSri= new JCheckBoxMe();
		jCheckBoxes_riseSri.setEnabled(false);

		jCheckBoxes_riseSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_riseSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_riseSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_riseSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_riseSriBusqueda= new JButtonMe();
		this.jButtones_riseSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_riseSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_riseSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_riseSriBusqueda.setText("U");
		this.jButtones_riseSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_riseSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_riseSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_riseSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_riseSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_riseSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_riseSriBusqueda.setVisible(false);		}


					
		this.jLabelnumero_serieSri = new JLabelMe();
		this.jLabelnumero_serieSri.setText(""+SriConstantesFunciones.LABEL_NUMEROSERIE+" : *");
		this.jLabelnumero_serieSri.setToolTipText("No Serie");
		this.jLabelnumero_serieSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serieSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serieSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serieSri.setToolTipText(SriConstantesFunciones.LABEL_NUMEROSERIE);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelnumero_serieSri.setLayout(this.gridaBagLayoutSri);


		jTextFieldnumero_serieSri= new JTextFieldMe();

		jTextFieldnumero_serieSri.setEnabled(false);
		jTextFieldnumero_serieSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serieSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_serieSriBusqueda= new JButtonMe();
		this.jButtonnumero_serieSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serieSriBusqueda.setText("U");
		this.jButtonnumero_serieSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serieSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serieSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serieSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serieSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serieSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serieSriBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizacionSri = new JLabelMe();
		this.jLabelnumero_autorizacionSri.setText(""+SriConstantesFunciones.LABEL_NUMEROAUTORIZACION+" : *");
		this.jLabelnumero_autorizacionSri.setToolTipText("No Autorizacion");
		this.jLabelnumero_autorizacionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacionSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizacionSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizacionSri.setToolTipText(SriConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelnumero_autorizacionSri.setLayout(this.gridaBagLayoutSri);


		jTextFieldnumero_autorizacionSri= new JTextFieldMe();

		jTextFieldnumero_autorizacionSri.setEnabled(false);
		jTextFieldnumero_autorizacionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacionSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizacionSriBusqueda= new JButtonMe();
		this.jButtonnumero_autorizacionSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizacionSriBusqueda.setText("U");
		this.jButtonnumero_autorizacionSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizacionSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizacionSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizacionSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizacionSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizacionSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizacionSriBusqueda.setVisible(false);		}


					
		this.jLabelnumero_secuencialSri = new JLabelMe();
		this.jLabelnumero_secuencialSri.setText(""+SriConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialSri.setToolTipText("No Secuencial C");
		this.jLabelnumero_secuencialSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_secuencialSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_secuencialSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialSri.setToolTipText(SriConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelnumero_secuencialSri.setLayout(this.gridaBagLayoutSri);


		jTextFieldnumero_secuencialSri= new JTextFieldMe();

		jTextFieldnumero_secuencialSri.setEnabled(false);
		jTextFieldnumero_secuencialSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_secuencialSriBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialSriBusqueda.setText("U");
		this.jButtonnumero_secuencialSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialSriBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionSri = new JLabelMe();
		this.jLabelfecha_emisionSri.setText(""+SriConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionSri.setToolTipText("F. Emision");
		this.jLabelfecha_emisionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionSri.setToolTipText(SriConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelfecha_emisionSri.setLayout(this.gridaBagLayoutSri);


		//jFormattedTextFieldfecha_emisionSri= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionSri= new JDateChooser();
		jDateChooserfecha_emisionSri.setEnabled(false);
		jDateChooserfecha_emisionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionSri,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionSri.setDate(new Date());
		jDateChooserfecha_emisionSri.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionSri.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionSriBusqueda= new JButtonMe();
		this.jButtonfecha_emisionSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionSriBusqueda.setText("U");
		this.jButtonfecha_emisionSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionSriBusqueda.setVisible(false);		}


					
		this.jLabelfecha_registro_contableSri = new JLabelMe();
		this.jLabelfecha_registro_contableSri.setText(""+SriConstantesFunciones.LABEL_FECHAREGISTROCONTABLE+" : *");
		this.jLabelfecha_registro_contableSri.setToolTipText("F. Reg. Contable");
		this.jLabelfecha_registro_contableSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_registro_contableSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_registro_contableSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_registro_contableSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_registro_contableSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_registro_contableSri.setToolTipText(SriConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelfecha_registro_contableSri.setLayout(this.gridaBagLayoutSri);


		//jFormattedTextFieldfecha_registro_contableSri= new JFormattedTextFieldMe();

		jDateChooserfecha_registro_contableSri= new JDateChooser();
		jDateChooserfecha_registro_contableSri.setEnabled(false);
		jDateChooserfecha_registro_contableSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_registro_contableSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_registro_contableSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_registro_contableSri,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_registro_contableSri.setDate(new Date());
		jDateChooserfecha_registro_contableSri.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_registro_contableSri.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_registro_contableSriBusqueda= new JButtonMe();
		this.jButtonfecha_registro_contableSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_registro_contableSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_registro_contableSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_registro_contableSriBusqueda.setText("U");
		this.jButtonfecha_registro_contableSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_registro_contableSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_registro_contableSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_registro_contableSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_registro_contableSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_registro_contableSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_registro_contableSriBusqueda.setVisible(false);		}


					
		this.jLabelfecha_caducidadSri = new JLabelMe();
		this.jLabelfecha_caducidadSri.setText(""+SriConstantesFunciones.LABEL_FECHACADUCIDAD+" : *");
		this.jLabelfecha_caducidadSri.setToolTipText("F. Caducidad");
		this.jLabelfecha_caducidadSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caducidadSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caducidadSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_caducidadSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_caducidadSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_caducidadSri.setToolTipText(SriConstantesFunciones.LABEL_FECHACADUCIDAD);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelfecha_caducidadSri.setLayout(this.gridaBagLayoutSri);


		//jFormattedTextFieldfecha_caducidadSri= new JFormattedTextFieldMe();

		jDateChooserfecha_caducidadSri= new JDateChooser();
		jDateChooserfecha_caducidadSri.setEnabled(false);
		jDateChooserfecha_caducidadSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidadSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidadSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_caducidadSri,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_caducidadSri.setDate(new Date());
		jDateChooserfecha_caducidadSri.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_caducidadSri.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_caducidadSriBusqueda= new JButtonMe();
		this.jButtonfecha_caducidadSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidadSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidadSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_caducidadSriBusqueda.setText("U");
		this.jButtonfecha_caducidadSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_caducidadSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_caducidadSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_caducidadSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_caducidadSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_caducidadSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_caducidadSriBusqueda.setVisible(false);		}


					
		this.jLabelbienes_tar12Sri = new JLabelMe();
		this.jLabelbienes_tar12Sri.setText(""+SriConstantesFunciones.LABEL_BIENESTAR12+" : *");
		this.jLabelbienes_tar12Sri.setToolTipText("Bienes Tar.12");
		this.jLabelbienes_tar12Sri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_tar12Sri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_tar12Sri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbienes_tar12Sri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbienes_tar12Sri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbienes_tar12Sri.setToolTipText(SriConstantesFunciones.LABEL_BIENESTAR12);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelbienes_tar12Sri.setLayout(this.gridaBagLayoutSri);


		jTextFieldbienes_tar12Sri= new JTextFieldMe();
		jTextFieldbienes_tar12Sri.setEnabled(false);
		jTextFieldbienes_tar12Sri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_tar12Sri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_tar12Sri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbienes_tar12Sri,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbienes_tar12Sri.setText("0.0");

		this.jButtonbienes_tar12SriBusqueda= new JButtonMe();
		this.jButtonbienes_tar12SriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_tar12SriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_tar12SriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbienes_tar12SriBusqueda.setText("U");
		this.jButtonbienes_tar12SriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbienes_tar12SriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbienes_tar12SriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbienes_tar12Sri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbienes_tar12Sri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"bienes_tar12SriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbienes_tar12SriBusqueda.setVisible(false);		}


					
		this.jLabelbienes_tar0Sri = new JLabelMe();
		this.jLabelbienes_tar0Sri.setText(""+SriConstantesFunciones.LABEL_BIENESTAR0+" : *");
		this.jLabelbienes_tar0Sri.setToolTipText("Bienes Tar.0");
		this.jLabelbienes_tar0Sri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_tar0Sri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_tar0Sri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbienes_tar0Sri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbienes_tar0Sri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbienes_tar0Sri.setToolTipText(SriConstantesFunciones.LABEL_BIENESTAR0);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelbienes_tar0Sri.setLayout(this.gridaBagLayoutSri);


		jTextFieldbienes_tar0Sri= new JTextFieldMe();
		jTextFieldbienes_tar0Sri.setEnabled(false);
		jTextFieldbienes_tar0Sri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_tar0Sri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_tar0Sri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbienes_tar0Sri,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbienes_tar0Sri.setText("0.0");

		this.jButtonbienes_tar0SriBusqueda= new JButtonMe();
		this.jButtonbienes_tar0SriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_tar0SriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_tar0SriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbienes_tar0SriBusqueda.setText("U");
		this.jButtonbienes_tar0SriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbienes_tar0SriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbienes_tar0SriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbienes_tar0Sri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbienes_tar0Sri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"bienes_tar0SriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbienes_tar0SriBusqueda.setVisible(false);		}


					
		this.jLabelservicios_tar12Sri = new JLabelMe();
		this.jLabelservicios_tar12Sri.setText(""+SriConstantesFunciones.LABEL_SERVICIOSTAR12+" : *");
		this.jLabelservicios_tar12Sri.setToolTipText("Servicios Tar.12");
		this.jLabelservicios_tar12Sri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelservicios_tar12Sri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelservicios_tar12Sri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelservicios_tar12Sri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelservicios_tar12Sri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelservicios_tar12Sri.setToolTipText(SriConstantesFunciones.LABEL_SERVICIOSTAR12);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelservicios_tar12Sri.setLayout(this.gridaBagLayoutSri);


		jTextFieldservicios_tar12Sri= new JTextFieldMe();
		jTextFieldservicios_tar12Sri.setEnabled(false);
		jTextFieldservicios_tar12Sri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_tar12Sri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_tar12Sri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldservicios_tar12Sri,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldservicios_tar12Sri.setText("0.0");

		this.jButtonservicios_tar12SriBusqueda= new JButtonMe();
		this.jButtonservicios_tar12SriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_tar12SriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_tar12SriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonservicios_tar12SriBusqueda.setText("U");
		this.jButtonservicios_tar12SriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonservicios_tar12SriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonservicios_tar12SriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldservicios_tar12Sri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldservicios_tar12Sri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"servicios_tar12SriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonservicios_tar12SriBusqueda.setVisible(false);		}


					
		this.jLabelservicios_tar0Sri = new JLabelMe();
		this.jLabelservicios_tar0Sri.setText(""+SriConstantesFunciones.LABEL_SERVICIOSTAR0+" : *");
		this.jLabelservicios_tar0Sri.setToolTipText("Servicios Tar.0");
		this.jLabelservicios_tar0Sri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelservicios_tar0Sri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelservicios_tar0Sri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelservicios_tar0Sri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelservicios_tar0Sri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelservicios_tar0Sri.setToolTipText(SriConstantesFunciones.LABEL_SERVICIOSTAR0);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelservicios_tar0Sri.setLayout(this.gridaBagLayoutSri);


		jTextFieldservicios_tar0Sri= new JTextFieldMe();
		jTextFieldservicios_tar0Sri.setEnabled(false);
		jTextFieldservicios_tar0Sri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_tar0Sri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_tar0Sri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldservicios_tar0Sri,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldservicios_tar0Sri.setText("0.0");

		this.jButtonservicios_tar0SriBusqueda= new JButtonMe();
		this.jButtonservicios_tar0SriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_tar0SriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_tar0SriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonservicios_tar0SriBusqueda.setText("U");
		this.jButtonservicios_tar0SriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonservicios_tar0SriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonservicios_tar0SriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldservicios_tar0Sri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldservicios_tar0Sri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"servicios_tar0SriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonservicios_tar0SriBusqueda.setVisible(false);		}


					
		this.jLabelmonto_ivaSri = new JLabelMe();
		this.jLabelmonto_ivaSri.setText(""+SriConstantesFunciones.LABEL_MONTOIVA+" : *");
		this.jLabelmonto_ivaSri.setToolTipText("Monto Iva");
		this.jLabelmonto_ivaSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_ivaSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_ivaSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_ivaSri.setToolTipText(SriConstantesFunciones.LABEL_MONTOIVA);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelmonto_ivaSri.setLayout(this.gridaBagLayoutSri);


		jTextFieldmonto_ivaSri= new JTextFieldMe();
		jTextFieldmonto_ivaSri.setEnabled(false);
		jTextFieldmonto_ivaSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_ivaSri,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_ivaSri.setText("0.0");

		this.jButtonmonto_ivaSriBusqueda= new JButtonMe();
		this.jButtonmonto_ivaSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_ivaSriBusqueda.setText("U");
		this.jButtonmonto_ivaSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_ivaSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_ivaSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_ivaSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_ivaSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_ivaSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_ivaSriBusqueda.setVisible(false);		}


					
		this.jLabelbase_impo_tar12Sri = new JLabelMe();
		this.jLabelbase_impo_tar12Sri.setText(""+SriConstantesFunciones.LABEL_BASEIMPOTAR12+" : *");
		this.jLabelbase_impo_tar12Sri.setToolTipText("B. Imp. Tar.12");
		this.jLabelbase_impo_tar12Sri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_impo_tar12Sri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_impo_tar12Sri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_impo_tar12Sri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_impo_tar12Sri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_impo_tar12Sri.setToolTipText(SriConstantesFunciones.LABEL_BASEIMPOTAR12);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelbase_impo_tar12Sri.setLayout(this.gridaBagLayoutSri);


		jTextFieldbase_impo_tar12Sri= new JTextFieldMe();
		jTextFieldbase_impo_tar12Sri.setEnabled(false);
		jTextFieldbase_impo_tar12Sri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_impo_tar12Sri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_impo_tar12Sri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_impo_tar12Sri,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_impo_tar12Sri.setText("0.0");

		this.jButtonbase_impo_tar12SriBusqueda= new JButtonMe();
		this.jButtonbase_impo_tar12SriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_impo_tar12SriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_impo_tar12SriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_impo_tar12SriBusqueda.setText("U");
		this.jButtonbase_impo_tar12SriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_impo_tar12SriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_impo_tar12SriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_impo_tar12Sri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_impo_tar12Sri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_impo_tar12SriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_impo_tar12SriBusqueda.setVisible(false);		}


					
		this.jLabelbase_impo_tar0Sri = new JLabelMe();
		this.jLabelbase_impo_tar0Sri.setText(""+SriConstantesFunciones.LABEL_BASEIMPOTAR0+" : *");
		this.jLabelbase_impo_tar0Sri.setToolTipText("B. Imp. Tar 0");
		this.jLabelbase_impo_tar0Sri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_impo_tar0Sri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_impo_tar0Sri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_impo_tar0Sri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_impo_tar0Sri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_impo_tar0Sri.setToolTipText(SriConstantesFunciones.LABEL_BASEIMPOTAR0);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelbase_impo_tar0Sri.setLayout(this.gridaBagLayoutSri);


		jTextFieldbase_impo_tar0Sri= new JTextFieldMe();
		jTextFieldbase_impo_tar0Sri.setEnabled(false);
		jTextFieldbase_impo_tar0Sri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_impo_tar0Sri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_impo_tar0Sri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_impo_tar0Sri,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_impo_tar0Sri.setText("0.0");

		this.jButtonbase_impo_tar0SriBusqueda= new JButtonMe();
		this.jButtonbase_impo_tar0SriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_impo_tar0SriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_impo_tar0SriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_impo_tar0SriBusqueda.setText("U");
		this.jButtonbase_impo_tar0SriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_impo_tar0SriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_impo_tar0SriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_impo_tar0Sri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_impo_tar0Sri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_impo_tar0SriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_impo_tar0SriBusqueda.setVisible(false);		}


					
		this.jLabelmonto_iceSri = new JLabelMe();
		this.jLabelmonto_iceSri.setText(""+SriConstantesFunciones.LABEL_MONTOICE+" : *");
		this.jLabelmonto_iceSri.setToolTipText("Monto Ice");
		this.jLabelmonto_iceSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_iceSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_iceSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_iceSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_iceSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_iceSri.setToolTipText(SriConstantesFunciones.LABEL_MONTOICE);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelmonto_iceSri.setLayout(this.gridaBagLayoutSri);


		jTextFieldmonto_iceSri= new JTextFieldMe();
		jTextFieldmonto_iceSri.setEnabled(false);
		jTextFieldmonto_iceSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_iceSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_iceSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_iceSri,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_iceSri.setText("0.0");

		this.jButtonmonto_iceSriBusqueda= new JButtonMe();
		this.jButtonmonto_iceSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_iceSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_iceSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_iceSriBusqueda.setText("U");
		this.jButtonmonto_iceSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_iceSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_iceSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_iceSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_iceSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_iceSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_iceSriBusqueda.setVisible(false);		}


					
		this.jLabelmonto_iva_bienSri = new JLabelMe();
		this.jLabelmonto_iva_bienSri.setText(""+SriConstantesFunciones.LABEL_MONTOIVABIEN+" : *");
		this.jLabelmonto_iva_bienSri.setToolTipText("Monto Iva Bien");
		this.jLabelmonto_iva_bienSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_iva_bienSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_iva_bienSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_iva_bienSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_iva_bienSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_iva_bienSri.setToolTipText(SriConstantesFunciones.LABEL_MONTOIVABIEN);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelmonto_iva_bienSri.setLayout(this.gridaBagLayoutSri);


		jTextFieldmonto_iva_bienSri= new JTextFieldMe();
		jTextFieldmonto_iva_bienSri.setEnabled(false);
		jTextFieldmonto_iva_bienSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_iva_bienSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_iva_bienSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_iva_bienSri,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_iva_bienSri.setText("0.0");

		this.jButtonmonto_iva_bienSriBusqueda= new JButtonMe();
		this.jButtonmonto_iva_bienSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_iva_bienSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_iva_bienSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_iva_bienSriBusqueda.setText("U");
		this.jButtonmonto_iva_bienSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_iva_bienSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_iva_bienSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_iva_bienSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_iva_bienSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_iva_bienSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_iva_bienSriBusqueda.setVisible(false);		}


					
		this.jLabelmonto_iva_servicioSri = new JLabelMe();
		this.jLabelmonto_iva_servicioSri.setText(""+SriConstantesFunciones.LABEL_MONTOIVASERVICIO+" : *");
		this.jLabelmonto_iva_servicioSri.setToolTipText("Monto Iva Serv");
		this.jLabelmonto_iva_servicioSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_iva_servicioSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_iva_servicioSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_iva_servicioSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_iva_servicioSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_iva_servicioSri.setToolTipText(SriConstantesFunciones.LABEL_MONTOIVASERVICIO);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelmonto_iva_servicioSri.setLayout(this.gridaBagLayoutSri);


		jTextFieldmonto_iva_servicioSri= new JTextFieldMe();
		jTextFieldmonto_iva_servicioSri.setEnabled(false);
		jTextFieldmonto_iva_servicioSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_iva_servicioSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_iva_servicioSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_iva_servicioSri,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_iva_servicioSri.setText("0.0");

		this.jButtonmonto_iva_servicioSriBusqueda= new JButtonMe();
		this.jButtonmonto_iva_servicioSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_iva_servicioSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_iva_servicioSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_iva_servicioSriBusqueda.setText("U");
		this.jButtonmonto_iva_servicioSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_iva_servicioSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_iva_servicioSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_iva_servicioSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_iva_servicioSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_iva_servicioSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_iva_servicioSriBusqueda.setVisible(false);		}


					
		this.jLabelretencion_iva_bienSri = new JLabelMe();
		this.jLabelretencion_iva_bienSri.setText(""+SriConstantesFunciones.LABEL_RETENCIONIVABIEN+" : *");
		this.jLabelretencion_iva_bienSri.setToolTipText("M.Ret Iva Bien");
		this.jLabelretencion_iva_bienSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencion_iva_bienSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencion_iva_bienSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelretencion_iva_bienSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelretencion_iva_bienSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelretencion_iva_bienSri.setToolTipText(SriConstantesFunciones.LABEL_RETENCIONIVABIEN);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelretencion_iva_bienSri.setLayout(this.gridaBagLayoutSri);


		jTextFieldretencion_iva_bienSri= new JTextFieldMe();
		jTextFieldretencion_iva_bienSri.setEnabled(false);
		jTextFieldretencion_iva_bienSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencion_iva_bienSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencion_iva_bienSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldretencion_iva_bienSri,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldretencion_iva_bienSri.setText("0.0");

		this.jButtonretencion_iva_bienSriBusqueda= new JButtonMe();
		this.jButtonretencion_iva_bienSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencion_iva_bienSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencion_iva_bienSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonretencion_iva_bienSriBusqueda.setText("U");
		this.jButtonretencion_iva_bienSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonretencion_iva_bienSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonretencion_iva_bienSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldretencion_iva_bienSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldretencion_iva_bienSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"retencion_iva_bienSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonretencion_iva_bienSriBusqueda.setVisible(false);		}


					
		this.jLabelretencion_iva_servicioSri = new JLabelMe();
		this.jLabelretencion_iva_servicioSri.setText(""+SriConstantesFunciones.LABEL_RETENCIONIVASERVICIO+" : *");
		this.jLabelretencion_iva_servicioSri.setToolTipText("M.Ret Iva Serv");
		this.jLabelretencion_iva_servicioSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencion_iva_servicioSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencion_iva_servicioSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelretencion_iva_servicioSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelretencion_iva_servicioSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelretencion_iva_servicioSri.setToolTipText(SriConstantesFunciones.LABEL_RETENCIONIVASERVICIO);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelretencion_iva_servicioSri.setLayout(this.gridaBagLayoutSri);


		jTextFieldretencion_iva_servicioSri= new JTextFieldMe();
		jTextFieldretencion_iva_servicioSri.setEnabled(false);
		jTextFieldretencion_iva_servicioSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencion_iva_servicioSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencion_iva_servicioSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldretencion_iva_servicioSri,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldretencion_iva_servicioSri.setText("0.0");

		this.jButtonretencion_iva_servicioSriBusqueda= new JButtonMe();
		this.jButtonretencion_iva_servicioSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencion_iva_servicioSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencion_iva_servicioSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonretencion_iva_servicioSriBusqueda.setText("U");
		this.jButtonretencion_iva_servicioSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonretencion_iva_servicioSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonretencion_iva_servicioSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldretencion_iva_servicioSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldretencion_iva_servicioSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"retencion_iva_servicioSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonretencion_iva_servicioSriBusqueda.setVisible(false);		}


					
		this.jLabelcon_devolucionSri = new JLabelMe();
		this.jLabelcon_devolucionSri.setText(""+SriConstantesFunciones.LABEL_CONDEVOLUCION+" : *");
		this.jLabelcon_devolucionSri.setToolTipText("Con Devolucion");
		this.jLabelcon_devolucionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_devolucionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_devolucionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_devolucionSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_devolucionSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_devolucionSri.setToolTipText(SriConstantesFunciones.LABEL_CONDEVOLUCION);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelcon_devolucionSri.setLayout(this.gridaBagLayoutSri);


		jCheckBoxcon_devolucionSri= new JCheckBoxMe();
		jCheckBoxcon_devolucionSri.setEnabled(false);

		jCheckBoxcon_devolucionSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_devolucionSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_devolucionSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_devolucionSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_devolucionSriBusqueda= new JButtonMe();
		this.jButtoncon_devolucionSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_devolucionSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_devolucionSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_devolucionSriBusqueda.setText("U");
		this.jButtoncon_devolucionSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_devolucionSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_devolucionSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_devolucionSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_devolucionSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_devolucionSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_devolucionSriBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSri() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_asiento_contableSri = new JLabelMe();
		this.jLabelid_asiento_contableSri.setText(""+SriConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableSri.setToolTipText("Asiento C.");
		this.jLabelid_asiento_contableSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableSri.setToolTipText(SriConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelid_asiento_contableSri.setLayout(this.gridaBagLayoutSri);


		jComboBoxid_asiento_contableSri= new JComboBoxMe();
		jComboBoxid_asiento_contableSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableSri= new JButtonMe();
		this.jButtonid_asiento_contableSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableSri.setText("Buscar");
		this.jButtonid_asiento_contableSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableSri"));

		this.jButtonid_asiento_contableSriBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableSriBusqueda.setText("U");
		this.jButtonid_asiento_contableSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableSriBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableSriUpdate= new JButtonMe();
		this.jButtonid_asiento_contableSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableSriUpdate.setText("U");
		this.jButtonid_asiento_contableSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableSriUpdate"));



					
		this.jLabelid_transaccion_contaSri = new JLabelMe();
		this.jLabelid_transaccion_contaSri.setText(""+SriConstantesFunciones.LABEL_IDTRANSACCIONCONTA+" : *");
		this.jLabelid_transaccion_contaSri.setToolTipText("Transaccion");
		this.jLabelid_transaccion_contaSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_contaSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_contaSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_contaSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_contaSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_contaSri.setToolTipText(SriConstantesFunciones.LABEL_IDTRANSACCIONCONTA);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelid_transaccion_contaSri.setLayout(this.gridaBagLayoutSri);


		jComboBoxid_transaccion_contaSri= new JComboBoxMe();
		jComboBoxid_transaccion_contaSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_contaSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_contaSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_contaSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_contaSri= new JButtonMe();
		this.jButtonid_transaccion_contaSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_contaSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_contaSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_contaSri.setText("Buscar");
		this.jButtonid_transaccion_contaSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_contaSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_contaSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_contaSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_contaSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_contaSri"));

		this.jButtonid_transaccion_contaSriBusqueda= new JButtonMe();
		this.jButtonid_transaccion_contaSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_contaSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_contaSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_contaSriBusqueda.setText("U");
		this.jButtonid_transaccion_contaSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_contaSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_contaSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_contaSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_contaSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_contaSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_contaSriBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_contaSriUpdate= new JButtonMe();
		this.jButtonid_transaccion_contaSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_contaSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_contaSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_contaSriUpdate.setText("U");
		this.jButtonid_transaccion_contaSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_contaSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_contaSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_contaSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_contaSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_contaSriUpdate"));



					
		this.jLabelid_clienteSri = new JLabelMe();
		this.jLabelid_clienteSri.setText(""+SriConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteSri.setToolTipText("Cliente");
		this.jLabelid_clienteSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteSri.setToolTipText(SriConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelid_clienteSri.setLayout(this.gridaBagLayoutSri);


		jComboBoxid_clienteSri= new JComboBoxMe();
		jComboBoxid_clienteSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteSri= new JButtonMe();
		this.jButtonid_clienteSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSri.setText("Buscar");
		this.jButtonid_clienteSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSri"));

		this.jButtonid_clienteSriBusqueda= new JButtonMe();
		this.jButtonid_clienteSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteSriBusqueda.setText("U");
		this.jButtonid_clienteSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteSriBusqueda.setVisible(false);		}

		this.jButtonid_clienteSriUpdate= new JButtonMe();
		this.jButtonid_clienteSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteSriUpdate.setText("U");
		this.jButtonid_clienteSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSriUpdate"));



					
		this.jLabeltipo_comprobanteSri = new JLabelMe();
		this.jLabeltipo_comprobanteSri.setText(""+SriConstantesFunciones.LABEL_IDTIPOCOMPROBANTE+" : *");
		this.jLabeltipo_comprobanteSri.setToolTipText("Tipo Comp.");
		this.jLabeltipo_comprobanteSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_comprobanteSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_comprobanteSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_comprobanteSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_comprobanteSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_comprobanteSri.setToolTipText(SriConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPaneltipo_comprobanteSri.setLayout(this.gridaBagLayoutSri);


		jComboBoxtipo_comprobanteSri= new JComboBoxMe();
		jComboBoxtipo_comprobanteSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxtipo_comprobanteSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxtipo_comprobanteSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxtipo_comprobanteSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipo_comprobanteSri= new JButtonMe();
		this.jButtontipo_comprobanteSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtontipo_comprobanteSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtontipo_comprobanteSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtontipo_comprobanteSri.setText("Buscar");
		this.jButtontipo_comprobanteSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtontipo_comprobanteSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_comprobanteSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxtipo_comprobanteSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxtipo_comprobanteSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_comprobanteSri"));

		this.jButtontipo_comprobanteSriBusqueda= new JButtonMe();
		this.jButtontipo_comprobanteSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_comprobanteSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_comprobanteSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_comprobanteSriBusqueda.setText("U");
		this.jButtontipo_comprobanteSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_comprobanteSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_comprobanteSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxtipo_comprobanteSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxtipo_comprobanteSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_comprobanteSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_comprobanteSriBusqueda.setVisible(false);		}

		this.jButtontipo_comprobanteSriUpdate= new JButtonMe();
		this.jButtontipo_comprobanteSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_comprobanteSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_comprobanteSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_comprobanteSriUpdate.setText("U");
		this.jButtontipo_comprobanteSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtontipo_comprobanteSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_comprobanteSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxtipo_comprobanteSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxtipo_comprobanteSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_comprobanteSriUpdate"));



					
		this.jLabeltipo_tributarioSri = new JLabelMe();
		this.jLabeltipo_tributarioSri.setText(""+SriConstantesFunciones.LABEL_IDTIPOTRIBUTARIO+" : *");
		this.jLabeltipo_tributarioSri.setToolTipText("Codigo Tribut");
		this.jLabeltipo_tributarioSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_tributarioSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_tributarioSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_tributarioSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_tributarioSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_tributarioSri.setToolTipText(SriConstantesFunciones.LABEL_IDTIPOTRIBUTARIO);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPaneltipo_tributarioSri.setLayout(this.gridaBagLayoutSri);


		jComboBoxtipo_tributarioSri= new JComboBoxMe();
		jComboBoxtipo_tributarioSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxtipo_tributarioSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxtipo_tributarioSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxtipo_tributarioSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipo_tributarioSri= new JButtonMe();
		this.jButtontipo_tributarioSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtontipo_tributarioSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtontipo_tributarioSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtontipo_tributarioSri.setText("Buscar");
		this.jButtontipo_tributarioSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtontipo_tributarioSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_tributarioSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxtipo_tributarioSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxtipo_tributarioSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_tributarioSri"));

		this.jButtontipo_tributarioSriBusqueda= new JButtonMe();
		this.jButtontipo_tributarioSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_tributarioSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_tributarioSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_tributarioSriBusqueda.setText("U");
		this.jButtontipo_tributarioSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_tributarioSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_tributarioSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxtipo_tributarioSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxtipo_tributarioSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_tributarioSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_tributarioSriBusqueda.setVisible(false);		}

		this.jButtontipo_tributarioSriUpdate= new JButtonMe();
		this.jButtontipo_tributarioSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_tributarioSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_tributarioSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_tributarioSriUpdate.setText("U");
		this.jButtontipo_tributarioSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtontipo_tributarioSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_tributarioSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxtipo_tributarioSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxtipo_tributarioSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_tributarioSriUpdate"));



					
		this.jLabelid_tipo_ivaSri = new JLabelMe();
		this.jLabelid_tipo_ivaSri.setText(""+SriConstantesFunciones.LABEL_IDTIPOIVA+" : *");
		this.jLabelid_tipo_ivaSri.setToolTipText("P Iva");
		this.jLabelid_tipo_ivaSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ivaSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_ivaSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_ivaSri.setToolTipText(SriConstantesFunciones.LABEL_IDTIPOIVA);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelid_tipo_ivaSri.setLayout(this.gridaBagLayoutSri);


		jComboBoxid_tipo_ivaSri= new JComboBoxMe();
		jComboBoxid_tipo_ivaSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ivaSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_ivaSri= new JButtonMe();
		this.jButtonid_tipo_ivaSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaSri.setText("Buscar");
		this.jButtonid_tipo_ivaSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_ivaSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_ivaSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaSri"));

		this.jButtonid_tipo_ivaSriBusqueda= new JButtonMe();
		this.jButtonid_tipo_ivaSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaSriBusqueda.setText("U");
		this.jButtonid_tipo_ivaSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_ivaSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_ivaSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_ivaSriBusqueda.setVisible(false);		}

		this.jButtonid_tipo_ivaSriUpdate= new JButtonMe();
		this.jButtonid_tipo_ivaSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaSriUpdate.setText("U");
		this.jButtonid_tipo_ivaSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_ivaSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_ivaSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaSriUpdate"));



					
		this.jLabelid_tipo_retencion_iva_bienSri = new JLabelMe();
		this.jLabelid_tipo_retencion_iva_bienSri.setText(""+SriConstantesFunciones.LABEL_IDTIPORETENCIONIVABIEN+" : *");
		this.jLabelid_tipo_retencion_iva_bienSri.setToolTipText("P Ret. Iva Bien");
		this.jLabelid_tipo_retencion_iva_bienSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_iva_bienSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_iva_bienSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_bienSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_iva_bienSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_iva_bienSri.setToolTipText(SriConstantesFunciones.LABEL_IDTIPORETENCIONIVABIEN);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelid_tipo_retencion_iva_bienSri.setLayout(this.gridaBagLayoutSri);


		jComboBoxid_tipo_retencion_iva_bienSri= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_bienSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_bienSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_bienSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_bienSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_iva_bienSri= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_bienSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_bienSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_bienSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_bienSri.setText("Buscar");
		this.jButtonid_tipo_retencion_iva_bienSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_iva_bienSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_bienSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_iva_bienSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_bienSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_bienSri"));

		this.jButtonid_tipo_retencion_iva_bienSriBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_bienSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_bienSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_bienSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_bienSriBusqueda.setText("U");
		this.jButtonid_tipo_retencion_iva_bienSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_iva_bienSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_bienSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_iva_bienSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_bienSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_bienSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_iva_bienSriBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_iva_bienSriUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_bienSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_bienSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_bienSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_bienSriUpdate.setText("U");
		this.jButtonid_tipo_retencion_iva_bienSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_iva_bienSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_bienSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_iva_bienSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_bienSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_bienSriUpdate"));



					
		this.jLabelid_tipo_retencion_iva_servicioSri = new JLabelMe();
		this.jLabelid_tipo_retencion_iva_servicioSri.setText(""+SriConstantesFunciones.LABEL_IDTIPORETENCIONIVASERVICIO+" : *");
		this.jLabelid_tipo_retencion_iva_servicioSri.setToolTipText("P. Ret. Iva Serv");
		this.jLabelid_tipo_retencion_iva_servicioSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_iva_servicioSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_iva_servicioSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_servicioSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_iva_servicioSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_iva_servicioSri.setToolTipText(SriConstantesFunciones.LABEL_IDTIPORETENCIONIVASERVICIO);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelid_tipo_retencion_iva_servicioSri.setLayout(this.gridaBagLayoutSri);


		jComboBoxid_tipo_retencion_iva_servicioSri= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_servicioSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_servicioSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_servicioSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_servicioSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_iva_servicioSri= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_servicioSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_servicioSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_servicioSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_servicioSri.setText("Buscar");
		this.jButtonid_tipo_retencion_iva_servicioSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_iva_servicioSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_servicioSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_iva_servicioSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_servicioSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_servicioSri"));

		this.jButtonid_tipo_retencion_iva_servicioSriBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_servicioSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_servicioSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_servicioSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_servicioSriBusqueda.setText("U");
		this.jButtonid_tipo_retencion_iva_servicioSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_iva_servicioSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_servicioSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_iva_servicioSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_servicioSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_servicioSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_iva_servicioSriBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_iva_servicioSriUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_servicioSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_servicioSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_servicioSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_servicioSriUpdate.setText("U");
		this.jButtonid_tipo_retencion_iva_servicioSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_iva_servicioSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_servicioSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_iva_servicioSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_servicioSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_servicioSriUpdate"));



					
		this.jLabelid_tipo_movimientoSri = new JLabelMe();
		this.jLabelid_tipo_movimientoSri.setText(""+SriConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoSri.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-28),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoSri.setToolTipText(SriConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutSri = new GridBagLayout();
		this.jPanelid_tipo_movimientoSri.setLayout(this.gridaBagLayoutSri);


		jComboBoxid_tipo_movimientoSri= new JComboBoxMe();
		jComboBoxid_tipo_movimientoSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoSri,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_movimientoSri.setEnabled(false);

		this.jButtonid_tipo_movimientoSri= new JButtonMe();
		this.jButtonid_tipo_movimientoSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoSri.setText("Buscar");
		this.jButtonid_tipo_movimientoSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoSri"));

		this.jButtonid_tipo_movimientoSriBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoSriBusqueda.setText("U");
		this.jButtonid_tipo_movimientoSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoSriBusqueda"));

		if(this.sriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoSriBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoSriUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoSriUpdate.setText("U");
		this.jButtonid_tipo_movimientoSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoSriUpdate"));



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
		//this.jInternalFrameDetalleSri = new SriBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sri DATOS");
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutSri= new GridBagLayout();
		

		
		String sToolTipSri="";
		sToolTipSri=SriConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSri+="(Contabilidad.Sri)";
		}
		
		if(!this.sriSessionBean.getEsGuardarRelacionado()) {
			sToolTipSri+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSri = new JButtonMe();
		this.jButtonModificarSri = new JButtonMe();
        this.jButtonActualizarSri = new JButtonMe();
        this.jButtonEliminarSri = new JButtonMe();
        this.jButtonCancelarSri = new JButtonMe();
        this.jButtonGuardarCambiosSri = new JButtonMe();
		this.jButtonGuardarCambiosTablaSri = new JButtonMe();
		this.jButtonCerrarSri = new JButtonMe();
		
		this.jScrollPanelDatosSri = new JScrollPane();   
        this.jScrollPanelDatosEdicionSri = new JScrollPane();
		this.jScrollPanelDatosGeneralSri = new JScrollPane();
				
		
		
		this.jPanelCamposSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneral2Sri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciobienes_servicios_tarSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciobienes_servicios_retSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Sri";
		
		if(!this.sriSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sris" + this.sPath));
		} else {
			this.jScrollPanelDatosSri.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSri.setName("jPanelCamposSri"); 

		this.jPanelCamposOcultosSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSri.setName("jPanelCamposOcultosSri"); 

        this.jPanelAccionesSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSri.setToolTipText("Acciones");
        this.jPanelAccionesSri.setName("Acciones"); 

		this.jPanelAccionesFormularioSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSri.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSri.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSri, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSri, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSri, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSri, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralSri.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralSri.setName("jPanelCamposFingeneralSri");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralSri, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciogeneral2Sri.setBorder(javax.swing.BorderFactory.createTitledBorder("General2"));
		this.jPanelCamposIniciogeneral2Sri.setName("jPanelCamposFingeneral2Sri");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneral2Sri, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciobienes_servicios_tarSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Bienes Servicios Tar"));
		this.jPanelCamposIniciobienes_servicios_tarSri.setName("jPanelCamposFinbienes_servicios_tarSri");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciobienes_servicios_tarSri, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciobienes_servicios_retSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Bienes Servicios Ret"));
		this.jPanelCamposIniciobienes_servicios_retSri.setName("jPanelCamposFinbienes_servicios_retSri");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciobienes_servicios_retSri, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSri.setText("Nuevo");
		this.jButtonModificarSri.setText("Editar");
        this.jButtonActualizarSri.setText("Actualizar");
        this.jButtonEliminarSri.setText("Eliminar");
        this.jButtonCancelarSri.setText("Cancelar");
        this.jButtonGuardarCambiosSri.setText("Guardar");
		this.jButtonGuardarCambiosTablaSri.setText("Guardar");
		this.jButtonCerrarSri.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSri,"nuevo_button","Nuevo",this.sriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSri,"modificar_button","Editar",this.sriSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSri,"actualizar_button","Actualizar",this.sriSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSri,"eliminar_button","Eliminar",this.sriSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSri,"cancelar_button","Cancelar",this.sriSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSri,"guardarcambios_button","Guardar",this.sriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSri,"guardarcambiostabla_button","Guardar",this.sriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSri,"cerrar_button","Salir",this.sriSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSri, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSri.setToolTipText("Nuevo"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSri.setToolTipText("Editar"+" "+SriConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSri.setToolTipText("Actualizar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSri.setToolTipText("Eliminar)"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSri.setToolTipText("Cancelar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSri.setToolTipText("Guardar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSri.setToolTipText("Guardar"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSri.setToolTipText("Salir"+" "+SriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSri";
		inputMap = this.jButtonNuevoSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSri"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSri";
		inputMap = this.jButtonActualizarSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSri"));
		
		//ELIMINAR
		sMapKey = "EliminarSri";
		inputMap = this.jButtonEliminarSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSri"));
		
		//CANCELAR	
		sMapKey = "CancelarSri";
		inputMap = this.jButtonCancelarSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSri"));
		
		//CERRAR		
		sMapKey = "CerrarSri";
		inputMap = this.jButtonCerrarSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSri"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSri";
		inputMap = this.jButtonGuardarCambiosTablaSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSri"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSri = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSri.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSri.setToolTipText("Nuevo Sri");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSri, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSri = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSri.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSri.setToolTipText("Sin Cerrar Ventana Sri");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSri, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSri = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSri.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSri.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSri, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
		/*	
			
		this.jComboBoxTiposAccionesSri = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSri.setText("Accion");
		this.jComboBoxTiposAccionesSri.setToolTipText("Tipos de Acciones");
							
		*/

		this.jComboBoxTiposAccionesFormularioSri = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSri.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSri.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSri = new JLabelMe();
		
		this.jLabelAccionesSri.setText("Acciones");		
		this.jLabelAccionesSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSri();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSri();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSri=new JTabbedPane();
		this.jTabbedPaneRelacionesSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSri,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		/*
		this.jComboBoxTiposAccionesSri.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSri.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSri.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		*/
		
		this.jComboBoxTiposAccionesFormularioSri.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSri.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSri.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSri, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSri = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSri = new GridBagLayout();
		
		this.jPanelCamposSri.setLayout(gridaBagLayoutCamposSri);
		this.jPanelCamposOcultosSri.setLayout(gridaBagLayoutCamposOcultosSri);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralSri= new GridBagLayout();
		this.jPanelCamposIniciogeneralSri.setLayout(gridaBagLayoutCamposIniciogeneralSri);

		GridBagLayout gridaBagLayoutCamposIniciogeneral2Sri= new GridBagLayout();
		this.jPanelCamposIniciogeneral2Sri.setLayout(gridaBagLayoutCamposIniciogeneral2Sri);

		GridBagLayout gridaBagLayoutCamposIniciobienes_servicios_tarSri= new GridBagLayout();
		this.jPanelCamposIniciobienes_servicios_tarSri.setLayout(gridaBagLayoutCamposIniciobienes_servicios_tarSri);

		GridBagLayout gridaBagLayoutCamposIniciobienes_servicios_retSri= new GridBagLayout();
		this.jPanelCamposIniciobienes_servicios_retSri.setLayout(gridaBagLayoutCamposIniciobienes_servicios_retSri);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidSri.add(jLabelIdSri, this.gridBagConstraintsSri);



	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidSri.add(jLabelidSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableSri.add(jLabelid_asiento_contableSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsSri = new GridBagConstraints();
	//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 2;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableSri.add(jButtonid_asiento_contableSri, this.gridBagConstraintsSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 3;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableSri.add(jButtonid_asiento_contableSriBusqueda, this.gridBagConstraintsSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 4;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableSri.add(jButtonid_asiento_contableSriUpdate, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableSri.add(jComboBoxid_asiento_contableSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transaccion_contaSri.add(jLabelid_transaccion_contaSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_contaSri.add(jButtonid_transaccion_contaSriBusqueda, this.gridBagConstraintsSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 3;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_contaSri.add(jButtonid_transaccion_contaSriUpdate, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transaccion_contaSri.add(jComboBoxid_transaccion_contaSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelrucSri.add(jLabelrucSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucSri.add(jButtonrucSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelrucSri.add(jTextFieldrucSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteSri.add(jLabelid_clienteSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsSri = new GridBagConstraints();
	//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 2;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteSri.add(jButtonid_clienteSri, this.gridBagConstraintsSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 3;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteSri.add(jButtonid_clienteSriBusqueda, this.gridBagConstraintsSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 4;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteSri.add(jButtonid_clienteSriUpdate, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteSri.add(jComboBoxid_clienteSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelrazon_socialSri.add(jLabelrazon_socialSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelrazon_socialSri.add(jButtonrazon_socialSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelrazon_socialSri.add(jscrollPanerazon_socialSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltipo_comprobanteSri.add(jLabeltipo_comprobanteSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_comprobanteSri.add(jButtontipo_comprobanteSriBusqueda, this.gridBagConstraintsSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 3;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_comprobanteSri.add(jButtontipo_comprobanteSriUpdate, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltipo_comprobanteSri.add(jComboBoxtipo_comprobanteSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneles_riseSri.add(jLabeles_riseSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_riseSri.add(jButtones_riseSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneles_riseSri.add(jCheckBoxes_riseSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_serieSri.add(jLabelnumero_serieSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serieSri.add(jButtonnumero_serieSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_serieSri.add(jTextFieldnumero_serieSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_autorizacionSri.add(jLabelnumero_autorizacionSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizacionSri.add(jButtonnumero_autorizacionSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_autorizacionSri.add(jTextFieldnumero_autorizacionSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_secuencialSri.add(jLabelnumero_secuencialSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialSri.add(jButtonnumero_secuencialSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_secuencialSri.add(jTextFieldnumero_secuencialSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionSri.add(jLabelfecha_emisionSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionSri.add(jButtonfecha_emisionSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionSri.add(jDateChooserfecha_emisionSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_registro_contableSri.add(jLabelfecha_registro_contableSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_registro_contableSri.add(jButtonfecha_registro_contableSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_registro_contableSri.add(jDateChooserfecha_registro_contableSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_caducidadSri.add(jLabelfecha_caducidadSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_caducidadSri.add(jButtonfecha_caducidadSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_caducidadSri.add(jDateChooserfecha_caducidadSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltipo_tributarioSri.add(jLabeltipo_tributarioSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_tributarioSri.add(jButtontipo_tributarioSriBusqueda, this.gridBagConstraintsSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 3;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_tributarioSri.add(jButtontipo_tributarioSriUpdate, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltipo_tributarioSri.add(jComboBoxtipo_tributarioSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbienes_tar12Sri.add(jLabelbienes_tar12Sri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelbienes_tar12Sri.add(jButtonbienes_tar12SriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbienes_tar12Sri.add(jTextFieldbienes_tar12Sri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbienes_tar0Sri.add(jLabelbienes_tar0Sri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelbienes_tar0Sri.add(jButtonbienes_tar0SriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbienes_tar0Sri.add(jTextFieldbienes_tar0Sri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_ivaSri.add(jLabelid_tipo_ivaSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaSri.add(jButtonid_tipo_ivaSriBusqueda, this.gridBagConstraintsSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 3;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaSri.add(jButtonid_tipo_ivaSriUpdate, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_ivaSri.add(jComboBoxid_tipo_ivaSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelservicios_tar12Sri.add(jLabelservicios_tar12Sri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelservicios_tar12Sri.add(jButtonservicios_tar12SriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelservicios_tar12Sri.add(jTextFieldservicios_tar12Sri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelservicios_tar0Sri.add(jLabelservicios_tar0Sri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelservicios_tar0Sri.add(jButtonservicios_tar0SriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelservicios_tar0Sri.add(jTextFieldservicios_tar0Sri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_ivaSri.add(jLabelmonto_ivaSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_ivaSri.add(jButtonmonto_ivaSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_ivaSri.add(jTextFieldmonto_ivaSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbase_impo_tar12Sri.add(jLabelbase_impo_tar12Sri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_impo_tar12Sri.add(jButtonbase_impo_tar12SriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbase_impo_tar12Sri.add(jTextFieldbase_impo_tar12Sri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbase_impo_tar0Sri.add(jLabelbase_impo_tar0Sri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_impo_tar0Sri.add(jButtonbase_impo_tar0SriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbase_impo_tar0Sri.add(jTextFieldbase_impo_tar0Sri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_iceSri.add(jLabelmonto_iceSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_iceSri.add(jButtonmonto_iceSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_iceSri.add(jTextFieldmonto_iceSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_iva_bienSri.add(jLabelmonto_iva_bienSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_iva_bienSri.add(jButtonmonto_iva_bienSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_iva_bienSri.add(jTextFieldmonto_iva_bienSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_iva_servicioSri.add(jLabelmonto_iva_servicioSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_iva_servicioSri.add(jButtonmonto_iva_servicioSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_iva_servicioSri.add(jTextFieldmonto_iva_servicioSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_retencion_iva_bienSri.add(jLabelid_tipo_retencion_iva_bienSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_bienSri.add(jButtonid_tipo_retencion_iva_bienSriBusqueda, this.gridBagConstraintsSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 3;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_bienSri.add(jButtonid_tipo_retencion_iva_bienSriUpdate, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_retencion_iva_bienSri.add(jComboBoxid_tipo_retencion_iva_bienSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_retencion_iva_servicioSri.add(jLabelid_tipo_retencion_iva_servicioSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_servicioSri.add(jButtonid_tipo_retencion_iva_servicioSriBusqueda, this.gridBagConstraintsSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 3;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_servicioSri.add(jButtonid_tipo_retencion_iva_servicioSriUpdate, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_retencion_iva_servicioSri.add(jComboBoxid_tipo_retencion_iva_servicioSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelretencion_iva_bienSri.add(jLabelretencion_iva_bienSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelretencion_iva_bienSri.add(jButtonretencion_iva_bienSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelretencion_iva_bienSri.add(jTextFieldretencion_iva_bienSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelretencion_iva_servicioSri.add(jLabelretencion_iva_servicioSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelretencion_iva_servicioSri.add(jButtonretencion_iva_servicioSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelretencion_iva_servicioSri.add(jTextFieldretencion_iva_servicioSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_devolucionSri.add(jLabelcon_devolucionSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_devolucionSri.add(jButtoncon_devolucionSriBusqueda, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_devolucionSri.add(jCheckBoxcon_devolucionSri, this.gridBagConstraintsSri);


	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 0;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_movimientoSri.add(jLabelid_tipo_movimientoSri, this.gridBagConstraintsSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 2;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoSri.add(jButtonid_tipo_movimientoSriBusqueda, this.gridBagConstraintsSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSri = new GridBagConstraints();
		//this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = 3;
		this.gridBagConstraintsSri.ipadx = 0;
		this.gridBagConstraintsSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoSri.add(jButtonid_tipo_movimientoSriUpdate, this.gridBagConstraintsSri);
	}

	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSri.gridy = 0;
	this.gridBagConstraintsSri.gridx = 1;
	this.gridBagConstraintsSri.ipadx = 0;
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_movimientoSri.add(jComboBoxid_tipo_movimientoSri, this.gridBagConstraintsSri);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposOcultosSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposOcultosSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosSri.add(this.jPanelid_tipo_movimientoSri, this.gridBagConstraintsSri);



	if(iXPanelCamposOcultosSri % 2==0) {
		iXPanelCamposOcultosSri=0;
		iYPanelCamposOcultosSri++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneralSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneralSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralSri.add(this.jPanelidSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneralSri % 2==0) {
		iXPanelCamposIniciogeneralSri=0;
		iYPanelCamposIniciogeneralSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneralSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneralSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralSri.add(this.jPanelid_asiento_contableSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneralSri % 2==0) {
		iXPanelCamposIniciogeneralSri=0;
		iYPanelCamposIniciogeneralSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneralSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneralSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralSri.add(this.jPanelid_transaccion_contaSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneralSri % 2==0) {
		iXPanelCamposIniciogeneralSri=0;
		iYPanelCamposIniciogeneralSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneralSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneralSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralSri.add(this.jPanelrucSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneralSri % 2==0) {
		iXPanelCamposIniciogeneralSri=0;
		iYPanelCamposIniciogeneralSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneralSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneralSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralSri.add(this.jPanelid_clienteSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneralSri % 2==0) {
		iXPanelCamposIniciogeneralSri=0;
		iYPanelCamposIniciogeneralSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneralSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneralSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralSri.add(this.jPanelrazon_socialSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneralSri % 2==0) {
		iXPanelCamposIniciogeneralSri=0;
		iYPanelCamposIniciogeneralSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneralSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneralSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralSri.add(this.jPaneltipo_comprobanteSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneralSri % 2==0) {
		iXPanelCamposIniciogeneralSri=0;
		iYPanelCamposIniciogeneralSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneralSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneralSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralSri.add(this.jPaneles_riseSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneralSri % 2==0) {
		iXPanelCamposIniciogeneralSri=0;
		iYPanelCamposIniciogeneralSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneral2Sri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneral2Sri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneral2Sri.add(this.jPanelnumero_serieSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneral2Sri % 3==0) {
		iXPanelCamposIniciogeneral2Sri=0;
		iYPanelCamposIniciogeneral2Sri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneral2Sri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneral2Sri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneral2Sri.add(this.jPanelnumero_autorizacionSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneral2Sri % 3==0) {
		iXPanelCamposIniciogeneral2Sri=0;
		iYPanelCamposIniciogeneral2Sri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneral2Sri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneral2Sri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneral2Sri.add(this.jPanelnumero_secuencialSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneral2Sri % 3==0) {
		iXPanelCamposIniciogeneral2Sri=0;
		iYPanelCamposIniciogeneral2Sri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneral2Sri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneral2Sri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneral2Sri.add(this.jPanelfecha_emisionSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneral2Sri % 3==0) {
		iXPanelCamposIniciogeneral2Sri=0;
		iYPanelCamposIniciogeneral2Sri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneral2Sri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneral2Sri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneral2Sri.add(this.jPanelfecha_registro_contableSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneral2Sri % 3==0) {
		iXPanelCamposIniciogeneral2Sri=0;
		iYPanelCamposIniciogeneral2Sri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneral2Sri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneral2Sri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneral2Sri.add(this.jPanelfecha_caducidadSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneral2Sri % 3==0) {
		iXPanelCamposIniciogeneral2Sri=0;
		iYPanelCamposIniciogeneral2Sri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciogeneral2Sri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciogeneral2Sri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneral2Sri.add(this.jPaneltipo_tributarioSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciogeneral2Sri % 3==0) {
		iXPanelCamposIniciogeneral2Sri=0;
		iYPanelCamposIniciogeneral2Sri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_tarSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_tarSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_tarSri.add(this.jPanelbienes_tar12Sri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_tarSri % 3==0) {
		iXPanelCamposIniciobienes_servicios_tarSri=0;
		iYPanelCamposIniciobienes_servicios_tarSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_tarSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_tarSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_tarSri.add(this.jPanelbienes_tar0Sri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_tarSri % 3==0) {
		iXPanelCamposIniciobienes_servicios_tarSri=0;
		iYPanelCamposIniciobienes_servicios_tarSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_tarSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_tarSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_tarSri.add(this.jPanelid_tipo_ivaSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_tarSri % 3==0) {
		iXPanelCamposIniciobienes_servicios_tarSri=0;
		iYPanelCamposIniciobienes_servicios_tarSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_tarSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_tarSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_tarSri.add(this.jPanelservicios_tar12Sri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_tarSri % 3==0) {
		iXPanelCamposIniciobienes_servicios_tarSri=0;
		iYPanelCamposIniciobienes_servicios_tarSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_tarSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_tarSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_tarSri.add(this.jPanelservicios_tar0Sri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_tarSri % 3==0) {
		iXPanelCamposIniciobienes_servicios_tarSri=0;
		iYPanelCamposIniciobienes_servicios_tarSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_tarSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_tarSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_tarSri.add(this.jPanelmonto_ivaSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_tarSri % 3==0) {
		iXPanelCamposIniciobienes_servicios_tarSri=0;
		iYPanelCamposIniciobienes_servicios_tarSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_tarSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_tarSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_tarSri.add(this.jPanelbase_impo_tar12Sri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_tarSri % 3==0) {
		iXPanelCamposIniciobienes_servicios_tarSri=0;
		iYPanelCamposIniciobienes_servicios_tarSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_tarSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_tarSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_tarSri.add(this.jPanelbase_impo_tar0Sri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_tarSri % 3==0) {
		iXPanelCamposIniciobienes_servicios_tarSri=0;
		iYPanelCamposIniciobienes_servicios_tarSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_tarSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_tarSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_tarSri.add(this.jPanelmonto_iceSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_tarSri % 3==0) {
		iXPanelCamposIniciobienes_servicios_tarSri=0;
		iYPanelCamposIniciobienes_servicios_tarSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_retSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_retSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_retSri.add(this.jPanelmonto_iva_bienSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_retSri % 2==0) {
		iXPanelCamposIniciobienes_servicios_retSri=0;
		iYPanelCamposIniciobienes_servicios_retSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_retSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_retSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_retSri.add(this.jPanelmonto_iva_servicioSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_retSri % 2==0) {
		iXPanelCamposIniciobienes_servicios_retSri=0;
		iYPanelCamposIniciobienes_servicios_retSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_retSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_retSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_retSri.add(this.jPanelid_tipo_retencion_iva_bienSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_retSri % 2==0) {
		iXPanelCamposIniciobienes_servicios_retSri=0;
		iYPanelCamposIniciobienes_servicios_retSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_retSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_retSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_retSri.add(this.jPanelid_tipo_retencion_iva_servicioSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_retSri % 2==0) {
		iXPanelCamposIniciobienes_servicios_retSri=0;
		iYPanelCamposIniciobienes_servicios_retSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_retSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_retSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_retSri.add(this.jPanelretencion_iva_bienSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_retSri % 2==0) {
		iXPanelCamposIniciobienes_servicios_retSri=0;
		iYPanelCamposIniciobienes_servicios_retSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_retSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_retSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_retSri.add(this.jPanelretencion_iva_servicioSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_retSri % 2==0) {
		iXPanelCamposIniciobienes_servicios_retSri=0;
		iYPanelCamposIniciobienes_servicios_retSri++;
	}
	this.gridBagConstraintsSri = new GridBagConstraints();
	this.gridBagConstraintsSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSri.gridy = iYPanelCamposIniciobienes_servicios_retSri;
	this.gridBagConstraintsSri.gridx = iXPanelCamposIniciobienes_servicios_retSri++;
	this.gridBagConstraintsSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSri.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobienes_servicios_retSri.add(this.jPanelcon_devolucionSri, this.gridBagConstraintsSri);



	if(iXPanelCamposIniciobienes_servicios_retSri % 2==0) {
		iXPanelCamposIniciobienes_servicios_retSri=0;
		iYPanelCamposIniciobienes_servicios_retSri++;
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
			
		GridBagLayout gridaBagLayoutAccionesSri= new GridBagLayout();
		this.jPanelAccionesSri.setLayout(gridaBagLayoutAccionesSri);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSri= new GridBagLayout();
		this.jPanelAccionesFormularioSri.setLayout(gridaBagLayoutAccionesFormularioSri);
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSri.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSri.add(this.jComboBoxTiposAccionesFormularioSri, this.gridBagConstraintsSri);

		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSri.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSri.add(this.jCheckBoxPostAccionNuevoSri, this.gridBagConstraintsSri);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.sriSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSri.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSri.add(this.jCheckBoxPostAccionSinCerrarSri, this.gridBagConstraintsSri);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.sriSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.sriSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSri.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSri.add(this.jCheckBoxPostAccionSinMensajeSri, this.gridBagConstraintsSri);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx = iPosXAccion++;
			
		this.jPanelAccionesSri.add(this.jButtonModificarSri, this.gridBagConstraintsSri);							

		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSri.gridy = 0;
		this.gridBagConstraintsSri.gridx =iPosXAccion++;
			
		this.jPanelAccionesSri.add(this.jButtonEliminarSri, this.gridBagConstraintsSri);
		
			
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = 0;		
		this.gridBagConstraintsSri.gridx = iPosXAccion++;
		
		this.jPanelAccionesSri.add(this.jButtonActualizarSri, this.gridBagConstraintsSri);


		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = 0;		
		this.gridBagConstraintsSri.gridx = iPosXAccion++;
		
		this.jPanelAccionesSri.add(this.jButtonGuardarCambiosSri, this.gridBagConstraintsSri);	
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = 0;		
		this.gridBagConstraintsSri.gridx =iPosXAccion++;
		
		this.jPanelAccionesSri.add(this.jButtonCancelarSri, this.gridBagConstraintsSri);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSri = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSri);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sriSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsSri = new GridBagConstraints();						
			this.gridBagConstraintsSri.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSri.gridx = 0;		
			//this.gridBagConstraintsSri.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSri.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSri.ipadx = 100;
				
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
		
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSri.gridx =0;
		this.gridBagConstraintsSri.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSri.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSri, this.gridBagConstraintsSri);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SriJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSri = new SriBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sri DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sri DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sri Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SriModel sriModel=new SriModel(this);
			
			//SI USARA CLASE INTERNA
			//SriModel.SriFocusTraversalPolicy sriFocusTraversalPolicy = sriModel.new SriFocusTraversalPolicy(this);
			
			//sriFocusTraversalPolicy.setsriJInternalFrame(this);
			
			this.setFocusTraversalPolicy(sriModel);
			
			
			this.jContentPaneDetalleSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSri = new GridBagLayout();	
			this.jContentPaneDetalleSri.setLayout(gridaBagLayoutDetalleSri);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSri = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				/*
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSri = new GridBagConstraints();
				this.gridBagConstraintsSri.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSri.gridx = 0;
					
				
				this.jContentPaneDetalleSri.add(jTtoolBarDetalleSri, gridBagConstraintsSri);								
				*/
}
			
			this.jScrollPanelDatosEdicionSri=   new JScrollPane(jContentPaneDetalleSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSri.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSri.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSri.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSri=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSri.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSri.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSri.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsSri.gridy = iGridyRelaciones++;
		this.gridBagConstraintsSri.gridx = 0;

		this.jContentPaneDetalleSri.add(jPanelCamposIniciogeneralSri, gridBagConstraintsSri);


		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsSri.gridy = iGridyRelaciones++;
		this.gridBagConstraintsSri.gridx = 0;

		this.jContentPaneDetalleSri.add(jPanelCamposIniciogeneral2Sri, gridBagConstraintsSri);


		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsSri.gridy = iGridyRelaciones++;
		this.gridBagConstraintsSri.gridx = 0;

		this.jContentPaneDetalleSri.add(jPanelCamposIniciobienes_servicios_tarSri, gridBagConstraintsSri);


		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsSri.gridy = iGridyRelaciones++;
		this.gridBagConstraintsSri.gridx = 0;

		this.jContentPaneDetalleSri.add(jPanelCamposIniciobienes_servicios_retSri, gridBagConstraintsSri);
			
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
						&& sriSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.sriSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSri= new GridBagConstraints();
						this.gridBagConstraintsSri.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSri.gridx = 0;
						this.jContentPaneDetalleSri.add(this.jTabbedPaneRelacionesSri, this.gridBagConstraintsSri);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSri.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSri.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSri = new GridBagConstraints();
					this.gridBagConstraintsSri.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSri.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSri.gridx = 0;
					
				
					this.jContentPaneDetalleSri.add(jPanelCamposOcultosSri, gridBagConstraintsSri);
				
					this.jPanelCamposOcultosSri.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSri.gridx = 0;
	        this.gridBagConstraintsSri.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSri.add(this.jPanelAccionesFormularioSri, this.gridBagConstraintsSri);							
			
			
			
			this.gridBagConstraintsSri = new GridBagConstraints();
	        this.gridBagConstraintsSri.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSri.gridx = 0;
	        
			
			this.jContentPaneDetalleSri.add(this.jPanelAccionesSri, this.gridBagConstraintsSri);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSri);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSri=   new JScrollPane(this.jPanelCamposSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSri.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSri.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSri.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSri.gridx = 0;
			this.gridBagConstraintsSri.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSri.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSri.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSri, this.gridBagConstraintsSri);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSri.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSri, this.gridBagConstraintsSri);			
			
			this.gridBagConstraintsSri = new GridBagConstraints();
			this.gridBagConstraintsSri.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSri.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSri, this.gridBagConstraintsSri);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSri.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSri, this.gridBagConstraintsSri);
			
			
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSri.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSri, this.gridBagConstraintsSri);
		
			
		this.gridBagConstraintsSri = new GridBagConstraints();
		this.gridBagConstraintsSri.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSri.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSri, this.gridBagConstraintsSri);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSri;//jContentPane;
		
		return jScrollPanelDatosEdicionSri;
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
