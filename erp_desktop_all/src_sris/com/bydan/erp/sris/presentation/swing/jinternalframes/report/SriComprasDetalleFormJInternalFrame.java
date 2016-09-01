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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.SriComprasConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class SriComprasDetalleFormJInternalFrame extends SriComprasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSriCompras;
	
	protected JMenuBar jmenuBarDetalleSriCompras;
	
	protected JMenu jmenuDetalleSriCompras;
	protected JMenu jmenuDetalleArchivoSriCompras;
	protected JMenu jmenuDetalleAccionesSriCompras;
	protected JMenu jmenuDetalleDatosSriCompras;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSriCompras;	
	protected GridBagConstraints gridBagConstraintsSriCompras;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SriComprasBeanSwingJInternalFrameAdditional jInternalFrameDetalleSriCompras;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaprestaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivapresta="";
	
	public SriComprasSessionBean sricomprasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	public TipoRetencionSessionBean tiporetencionivaSessionBean;
	public TipoRetencionSessionBean tiporetencionivaprestaSessionBean;	
	
	public SriComprasLogic sricomprasLogic;
	
	public JScrollPane jScrollPanelDatosSriCompras;
	public JScrollPane jScrollPanelDatosEdicionSriCompras;
	public JScrollPane jScrollPanelDatosGeneralSriCompras;
	
	protected JPanel jPanelCamposSriCompras;    
	protected JPanel jPanelCamposOcultosSriCompras;    	
	protected JPanel jPanelAccionesSriCompras;
	protected JPanel jPanelAccionesFormularioSriCompras;
    
	
	
	protected Integer iXPanelCamposSriCompras=0;
	protected Integer iYPanelCamposSriCompras=0;
	
	protected Integer iXPanelCamposOcultosSriCompras=0;
	protected Integer iYPanelCamposOcultosSriCompras=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSriCompras;
	public JButton jButtonModificarSriCompras;
	public JButton jButtonActualizarSriCompras;
    public JButton jButtonEliminarSriCompras;
	public JButton jButtonCancelarSriCompras;
    public JButton jButtonGuardarCambiosSriCompras;
	public JButton jButtonGuardarCambiosTablaSriCompras;
	protected JButton jButtonCerrarSriCompras;
	
	
	protected JButton jButtonProcesarInformacionSriCompras;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSriCompras;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSriCompras;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSriCompras;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSriCompras;
	protected JButton jButtonModificarToolBarSriCompras;
	protected JButton jButtonActualizarToolBarSriCompras;
    protected JButton jButtonEliminarToolBarSriCompras;
	protected JButton jButtonCancelarToolBarSriCompras;
    protected JButton jButtonGuardarCambiosToolBarSriCompras;
	protected JButton jButtonGuardarCambiosTablaToolBarSriCompras;
	protected JButton jButtonMostrarOcultarTablaToolBarSriCompras;
	protected JButton jButtonCerrarToolBarSriCompras;
	
	protected JButton jButtonProcesarInformacionToolBarSriCompras;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSriCompras;
	protected JMenuItem jMenuItemModificarSriCompras;
	protected JMenuItem jMenuItemActualizarSriCompras;
    protected JMenuItem jMenuItemEliminarSriCompras;
	protected JMenuItem jMenuItemCancelarSriCompras;
    protected JMenuItem jMenuItemGuardarCambiosSriCompras;
	protected JMenuItem jMenuItemGuardarCambiosTablaSriCompras;
	protected JMenuItem jMenuItemCerrarSriCompras;
	protected JMenuItem jMenuItemDetalleCerrarSriCompras;
	protected JMenuItem jMenuItemDetalleMostarOcultarSriCompras;
	
	protected JMenuItem jMenuItemProcesarInformacionSriCompras;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSriCompras;
	protected JMenuItem jMenuItemMostrarOcultarSriCompras;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSriCompras;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSriCompras;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSriCompras;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSriCompras;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSriCompras;
	public JLabel jLabelIdSriCompras;
	public JLabel jLabelidSriCompras;
	public JButton jButtonidSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelrucSriCompras;
	public JLabel jLabelrucSriCompras;
	public JTextField jTextFieldrucSriCompras;
	public JButton jButtonrucSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_comprobanteSriCompras;
	public JLabel jLabelnombre_tipo_comprobanteSriCompras;
	public JTextArea jTextAreanombre_tipo_comprobanteSriCompras;
	public JScrollPane jscrollPanenombre_tipo_comprobanteSriCompras;
	public JButton jButtonnombre_tipo_comprobanteSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteSriCompras;
	public JLabel jLabelnombre_completo_clienteSriCompras;
	public JTextArea jTextAreanombre_completo_clienteSriCompras;
	public JScrollPane jscrollPanenombre_completo_clienteSriCompras;
	public JButton jButtonnombre_completo_clienteSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelruc_datoSriCompras;
	public JLabel jLabelruc_datoSriCompras;
	public JTextField jTextFieldruc_datoSriCompras;
	public JButton jButtonruc_datoSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoSriCompras;
	public JLabel jLabelnumero_documentoSriCompras;
	public JTextField jTextFieldnumero_documentoSriCompras;
	public JButton jButtonnumero_documentoSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionSriCompras;
	public JLabel jLabelfecha_emisionSriCompras;
	//public JFormattedTextField jDateChooserfecha_emisionSriCompras;

	public JDateChooser jDateChooserfecha_emisionSriCompras;
	public JButton jButtonfecha_emisionSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_registro_contableSriCompras;
	public JLabel jLabelfecha_registro_contableSriCompras;
	//public JFormattedTextField jDateChooserfecha_registro_contableSriCompras;

	public JDateChooser jDateChooserfecha_registro_contableSriCompras;
	public JButton jButtonfecha_registro_contableSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_serieSriCompras;
	public JLabel jLabelnumero_serieSriCompras;
	public JTextField jTextFieldnumero_serieSriCompras;
	public JButton jButtonnumero_serieSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizacionSriCompras;
	public JLabel jLabelnumero_autorizacionSriCompras;
	public JTextField jTextFieldnumero_autorizacionSriCompras;
	public JButton jButtonnumero_autorizacionSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelbienes_ivaSriCompras;
	public JLabel jLabelbienes_ivaSriCompras;
	public JTextField jTextFieldbienes_ivaSriCompras;
	public JButton jButtonbienes_ivaSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelservicion_ivaSriCompras;
	public JLabel jLabelservicion_ivaSriCompras;
	public JTextField jTextFieldservicion_ivaSriCompras;
	public JButton jButtonservicion_ivaSriComprasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaSriCompras;
	public JLabel jLabeltotal_ivaSriCompras;
	public JTextField jTextFieldtotal_ivaSriCompras;
	public JButton jButtontotal_ivaSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelbienes_sin_ivaSriCompras;
	public JLabel jLabelbienes_sin_ivaSriCompras;
	public JTextField jTextFieldbienes_sin_ivaSriCompras;
	public JButton jButtonbienes_sin_ivaSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelservicios_sin_ivaSriCompras;
	public JLabel jLabelservicios_sin_ivaSriCompras;
	public JTextField jTextFieldservicios_sin_ivaSriCompras;
	public JButton jButtonservicios_sin_ivaSriComprasBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaSriCompras;
	public JLabel jLabeltotal_sin_ivaSriCompras;
	public JTextField jTextFieldtotal_sin_ivaSriCompras;
	public JButton jButtontotal_sin_ivaSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelmonto_ivaSriCompras;
	public JLabel jLabelmonto_ivaSriCompras;
	public JTextField jTextFieldmonto_ivaSriCompras;
	public JButton jButtonmonto_ivaSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelmonto_iceSriCompras;
	public JLabel jLabelmonto_iceSriCompras;
	public JTextField jTextFieldmonto_iceSriCompras;
	public JButton jButtonmonto_iceSriComprasBusqueda= new JButtonMe();

	public JPanel jPaneltransfe_iva_retenerSriCompras;
	public JLabel jLabeltransfe_iva_retenerSriCompras;
	public JTextField jTextFieldtransfe_iva_retenerSriCompras;
	public JButton jButtontransfe_iva_retenerSriComprasBusqueda= new JButtonMe();

	public JPanel jPaneltransfe_iva_retenidoSriCompras;
	public JLabel jLabeltransfe_iva_retenidoSriCompras;
	public JTextField jTextFieldtransfe_iva_retenidoSriCompras;
	public JButton jButtontransfe_iva_retenidoSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelpresta_iva_retenerSriCompras;
	public JLabel jLabelpresta_iva_retenerSriCompras;
	public JTextField jTextFieldpresta_iva_retenerSriCompras;
	public JButton jButtonpresta_iva_retenerSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelpresta_iva_retenidoSriCompras;
	public JLabel jLabelpresta_iva_retenidoSriCompras;
	public JTextField jTextFieldpresta_iva_retenidoSriCompras;
	public JButton jButtonpresta_iva_retenidoSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_caducidadSriCompras;
	public JLabel jLabelfecha_caducidadSriCompras;
	//public JFormattedTextField jDateChooserfecha_caducidadSriCompras;

	public JDateChooser jDateChooserfecha_caducidadSriCompras;
	public JButton jButtonfecha_caducidadSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_asiento_contableSriCompras;
	public JLabel jLabelcodigo_asiento_contableSriCompras;
	public JTextField jTextFieldcodigo_asiento_contableSriCompras;
	public JButton jButtoncodigo_asiento_contableSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documento_contableSriCompras;
	public JLabel jLabelnumero_documento_contableSriCompras;
	public JTextField jTextFieldnumero_documento_contableSriCompras;
	public JButton jButtonnumero_documento_contableSriComprasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSriCompras;
	public JLabel jLabelid_empresaSriCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSriCompras;
	public JButton jButtonid_empresaSriCompras= new JButtonMe();
	public JButton jButtonid_empresaSriComprasUpdate= new JButtonMe();
	public JButton jButtonid_empresaSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_periodo_declaraSriCompras;
	public JLabel jLabelid_periodo_declaraSriCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraSriCompras;
	public JButton jButtonid_periodo_declaraSriCompras= new JButtonMe();
	public JButton jButtonid_periodo_declaraSriComprasUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteSriCompras;
	public JLabel jLabelid_clienteSriCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteSriCompras;
	public JButton jButtonid_clienteSriCompras= new JButtonMe();
	public JButton jButtonid_clienteSriComprasUpdate= new JButtonMe();
	public JButton jButtonid_clienteSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_ivaSriCompras;
	public JLabel jLabelid_tipo_ivaSriCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ivaSriCompras;
	public JButton jButtonid_tipo_ivaSriCompras= new JButtonMe();
	public JButton jButtonid_tipo_ivaSriComprasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ivaSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_ivaSriCompras;
	public JLabel jLabelid_tipo_retencion_ivaSriCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_ivaSriCompras;
	public JButton jButtonid_tipo_retencion_ivaSriCompras= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaSriComprasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaSriComprasBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_iva_prestaSriCompras;
	public JLabel jLabelid_tipo_retencion_iva_prestaSriCompras;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_prestaSriCompras;
	public JButton jButtonid_tipo_retencion_iva_prestaSriCompras= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_prestaSriComprasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSriCompras;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SriComprasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSriCompras=new JPanel();
				this.jPanelAccionesFormularioSriCompras=new JPanel();
				this.jmenuBarDetalleSriCompras=new JMenuBar();
				this.jTtoolBarDetalleSriCompras=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriComprasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SriCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SriComprasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SriCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriComprasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriComprasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriComprasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SriCompras No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSriCompras() {
		return this.jButtonActualizarToolBarSriCompras;
	}
	
	public JButton getjButtonEliminarToolBarSriCompras() {
		return this.jButtonEliminarToolBarSriCompras;
	}
	
	public JButton getjButtonCancelarToolBarSriCompras() {
		return this.jButtonCancelarToolBarSriCompras;
	}		
	
	public JButton getjButtonProcesarInformacionSriCompras() {
		return this.jButtonProcesarInformacionSriCompras;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSriCompras)	{
		this.jButtonProcesarInformacionSriCompras = jButtonProcesarInformacionSriCompras;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSriCompras() {
		return this.jComboBoxTiposAccionesSriCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSriCompras(
			JComboBox jComboBoxTiposRelacionesSriCompras) {
		this.jComboBoxTiposRelacionesSriCompras = jComboBoxTiposRelacionesSriCompras;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSriCompras(
			JComboBox jComboBoxTiposAccionesSriCompras) {
		this.jComboBoxTiposAccionesSriCompras = jComboBoxTiposAccionesSriCompras;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSriCompras() {
		return this.jComboBoxTiposAccionesFormularioSriCompras;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSriCompras(
			JComboBox jComboBoxTiposAccionesFormularioSriCompras) {
		this.jComboBoxTiposAccionesFormularioSriCompras = jComboBoxTiposAccionesFormularioSriCompras;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.sricomprasSessionBean=new SriComprasSessionBean();
		
		this.sricomprasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sricomprasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.sricomprasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SriComprasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SriComprasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SriComprasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sri Compras MANTENIMIENTO"));
		
		
		if(iWidth > 3150) {
			iWidth=3150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
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
	
		SriComprasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSriCompras= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSriCompras=new JButtonMe();
				this.jButtonModificarToolBarSriCompras=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSriCompras,this.jTtoolBarDetalleSriCompras,
							"actualizar","actualizar","Actualizar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSriCompras,this.jTtoolBarDetalleSriCompras,
							"eliminar","eliminar","Eliminar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSriCompras,this.jTtoolBarDetalleSriCompras,
							"cancelar","cancelar","Cancelar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSriCompras=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSriCompras,this.jTtoolBarDetalleSriCompras,
							"guardarcambios","guardarcambios","Guardar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSriCompras=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSriCompras=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSriCompras=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSriCompras=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSriCompras=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSriCompras= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSriCompras.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSriCompras,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSriCompras= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSriCompras.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSriCompras,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSriCompras= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSriCompras.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSriCompras,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSriCompras= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSriCompras.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSriCompras,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSriCompras= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSriCompras.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSriCompras,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSriCompras= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSriCompras.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSriCompras,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSriCompras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSriCompras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSriCompras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSriCompras= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSriCompras.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSriCompras,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSriCompras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSriCompras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSriCompras,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSriCompras= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSriCompras.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSriCompras,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSriCompras.add(this.jMenuItemDetalleCerrarSriCompras);
		
		this.jmenuDetalleAccionesSriCompras.add(this.jMenuItemActualizarSriCompras);
		this.jmenuDetalleAccionesSriCompras.add(this.jMenuItemEliminarSriCompras);
		this.jmenuDetalleAccionesSriCompras.add(this.jMenuItemCancelarSriCompras);		
		
		//this.jmenuDetalleDatosSriCompras.add(this.jMenuItemDetalleAbrirOrderBySriCompras);				
		this.jmenuDetalleDatosSriCompras.add(this.jMenuItemDetalleMostarOcultarSriCompras);				
				
		//this.jmenuDetalleAccionesSriCompras.add(this.jMenuItemGuardarCambiosSriCompras);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSriCompras.add(this.jmenuDetalleArchivoSriCompras);		
		this.jmenuBarDetalleSriCompras.add(this.jmenuDetalleAccionesSriCompras);		
		this.jmenuBarDetalleSriCompras.add(this.jmenuDetalleDatosSriCompras);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSriCompras);				
	}
	
	
	public void inicializarElementosCamposSriCompras() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSriCompras = new JLabelMe();
		jLabelIdSriCompras.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSriCompras = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSriCompras= new GridBagLayout();

		this.jPanelidSriCompras.setLayout(this.gridaBagLayoutSriCompras);

		jLabelidSriCompras = new JLabel();
		jLabelidSriCompras.setText("Id");

		jLabelidSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelrucSriCompras = new JLabelMe();
		this.jLabelrucSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucSriCompras.setToolTipText("Ruc");
		this.jLabelrucSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelrucSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldrucSriCompras= new JTextFieldMe();

		jTextFieldrucSriCompras.setEnabled(false);
		jTextFieldrucSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucSriComprasBusqueda= new JButtonMe();
		this.jButtonrucSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucSriComprasBusqueda.setText("U");
		this.jButtonrucSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_comprobanteSriCompras = new JLabelMe();
		this.jLabelnombre_tipo_comprobanteSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE+" : *");
		this.jLabelnombre_tipo_comprobanteSriCompras.setToolTipText("Nombre Tipo Comprobante");
		this.jLabelnombre_tipo_comprobanteSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_comprobanteSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_comprobanteSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_comprobanteSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_comprobanteSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_comprobanteSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelnombre_tipo_comprobanteSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextAreanombre_tipo_comprobanteSriCompras= new JTextAreaMe();
		jTextAreanombre_tipo_comprobanteSriCompras.setEnabled(false);
		jTextAreanombre_tipo_comprobanteSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_comprobanteSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_comprobanteSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_comprobanteSriCompras.setLineWrap(true);
		jTextAreanombre_tipo_comprobanteSriCompras.setWrapStyleWord(true);
		jTextAreanombre_tipo_comprobanteSriCompras.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_comprobanteSriCompras.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_comprobanteSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_comprobanteSriCompras = new JScrollPane(jTextAreanombre_tipo_comprobanteSriCompras);
		jscrollPanenombre_tipo_comprobanteSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_comprobanteSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_comprobanteSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_tipo_comprobanteSriComprasBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_comprobanteSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_comprobanteSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_comprobanteSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_comprobanteSriComprasBusqueda.setText("U");
		this.jButtonnombre_tipo_comprobanteSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_comprobanteSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_comprobanteSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_comprobanteSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_comprobanteSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_comprobanteSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_comprobanteSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteSriCompras = new JLabelMe();
		this.jLabelnombre_completo_clienteSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteSriCompras.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelnombre_completo_clienteSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextAreanombre_completo_clienteSriCompras= new JTextAreaMe();
		jTextAreanombre_completo_clienteSriCompras.setEnabled(false);
		jTextAreanombre_completo_clienteSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteSriCompras.setLineWrap(true);
		jTextAreanombre_completo_clienteSriCompras.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteSriCompras.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteSriCompras.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteSriCompras = new JScrollPane(jTextAreanombre_completo_clienteSriCompras);
		jscrollPanenombre_completo_clienteSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_completo_clienteSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_completo_clienteSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_completo_clienteSriComprasBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteSriComprasBusqueda.setText("U");
		this.jButtonnombre_completo_clienteSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelruc_datoSriCompras = new JLabelMe();
		this.jLabelruc_datoSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_RUCDATO+" : *");
		this.jLabelruc_datoSriCompras.setToolTipText("Ruc Dato");
		this.jLabelruc_datoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_datoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_datoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_datoSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_datoSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_datoSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_RUCDATO);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelruc_datoSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldruc_datoSriCompras= new JTextFieldMe();

		jTextFieldruc_datoSriCompras.setEnabled(false);
		jTextFieldruc_datoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_datoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_datoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_datoSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_datoSriComprasBusqueda= new JButtonMe();
		this.jButtonruc_datoSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_datoSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_datoSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_datoSriComprasBusqueda.setText("U");
		this.jButtonruc_datoSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_datoSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_datoSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_datoSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_datoSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_datoSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_datoSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_documentoSriCompras = new JLabelMe();
		this.jLabelnumero_documentoSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO+" : *");
		this.jLabelnumero_documentoSriCompras.setToolTipText("Numero Documento");
		this.jLabelnumero_documentoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelnumero_documentoSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldnumero_documentoSriCompras= new JTextFieldMe();

		jTextFieldnumero_documentoSriCompras.setEnabled(false);
		jTextFieldnumero_documentoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoSriComprasBusqueda= new JButtonMe();
		this.jButtonnumero_documentoSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoSriComprasBusqueda.setText("U");
		this.jButtonnumero_documentoSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionSriCompras = new JLabelMe();
		this.jLabelfecha_emisionSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionSriCompras.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelfecha_emisionSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		//jFormattedTextFieldfecha_emisionSriCompras= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionSriCompras= new JDateChooser();
		jDateChooserfecha_emisionSriCompras.setEnabled(false);
		jDateChooserfecha_emisionSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionSriCompras.setDate(new Date());
		jDateChooserfecha_emisionSriCompras.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionSriCompras.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionSriComprasBusqueda= new JButtonMe();
		this.jButtonfecha_emisionSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionSriComprasBusqueda.setText("U");
		this.jButtonfecha_emisionSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_registro_contableSriCompras = new JLabelMe();
		this.jLabelfecha_registro_contableSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE+" : *");
		this.jLabelfecha_registro_contableSriCompras.setToolTipText("Fecha Registro Contable");
		this.jLabelfecha_registro_contableSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_registro_contableSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_registro_contableSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_registro_contableSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_registro_contableSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_registro_contableSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelfecha_registro_contableSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		//jFormattedTextFieldfecha_registro_contableSriCompras= new JFormattedTextFieldMe();

		jDateChooserfecha_registro_contableSriCompras= new JDateChooser();
		jDateChooserfecha_registro_contableSriCompras.setEnabled(false);
		jDateChooserfecha_registro_contableSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_registro_contableSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_registro_contableSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_registro_contableSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_registro_contableSriCompras.setDate(new Date());
		jDateChooserfecha_registro_contableSriCompras.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_registro_contableSriCompras.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_registro_contableSriComprasBusqueda= new JButtonMe();
		this.jButtonfecha_registro_contableSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_registro_contableSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_registro_contableSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_registro_contableSriComprasBusqueda.setText("U");
		this.jButtonfecha_registro_contableSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_registro_contableSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_registro_contableSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_registro_contableSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_registro_contableSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_registro_contableSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_registro_contableSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_serieSriCompras = new JLabelMe();
		this.jLabelnumero_serieSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_NUMEROSERIE+" : *");
		this.jLabelnumero_serieSriCompras.setToolTipText("Numero Serie");
		this.jLabelnumero_serieSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serieSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serieSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serieSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_NUMEROSERIE);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelnumero_serieSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldnumero_serieSriCompras= new JTextFieldMe();

		jTextFieldnumero_serieSriCompras.setEnabled(false);
		jTextFieldnumero_serieSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serieSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_serieSriComprasBusqueda= new JButtonMe();
		this.jButtonnumero_serieSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serieSriComprasBusqueda.setText("U");
		this.jButtonnumero_serieSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serieSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serieSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serieSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serieSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serieSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serieSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizacionSriCompras = new JLabelMe();
		this.jLabelnumero_autorizacionSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION+" : *");
		this.jLabelnumero_autorizacionSriCompras.setToolTipText("Numero Autorizacion");
		this.jLabelnumero_autorizacionSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacionSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizacionSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizacionSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelnumero_autorizacionSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldnumero_autorizacionSriCompras= new JTextFieldMe();

		jTextFieldnumero_autorizacionSriCompras.setEnabled(false);
		jTextFieldnumero_autorizacionSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacionSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizacionSriComprasBusqueda= new JButtonMe();
		this.jButtonnumero_autorizacionSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizacionSriComprasBusqueda.setText("U");
		this.jButtonnumero_autorizacionSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizacionSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizacionSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizacionSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizacionSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizacionSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizacionSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelbienes_ivaSriCompras = new JLabelMe();
		this.jLabelbienes_ivaSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_BIENESIVA+" : *");
		this.jLabelbienes_ivaSriCompras.setToolTipText("Bienes Iva");
		this.jLabelbienes_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbienes_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbienes_ivaSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbienes_ivaSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_BIENESIVA);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelbienes_ivaSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldbienes_ivaSriCompras= new JTextFieldMe();
		jTextFieldbienes_ivaSriCompras.setEnabled(false);
		jTextFieldbienes_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbienes_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbienes_ivaSriCompras.setText("0.0");

		this.jButtonbienes_ivaSriComprasBusqueda= new JButtonMe();
		this.jButtonbienes_ivaSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_ivaSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_ivaSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbienes_ivaSriComprasBusqueda.setText("U");
		this.jButtonbienes_ivaSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbienes_ivaSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbienes_ivaSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbienes_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbienes_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"bienes_ivaSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbienes_ivaSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelservicion_ivaSriCompras = new JLabelMe();
		this.jLabelservicion_ivaSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_SERVICIONIVA+" : *");
		this.jLabelservicion_ivaSriCompras.setToolTipText("Servicion Iva");
		this.jLabelservicion_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelservicion_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelservicion_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelservicion_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelservicion_ivaSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelservicion_ivaSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_SERVICIONIVA);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelservicion_ivaSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldservicion_ivaSriCompras= new JTextFieldMe();
		jTextFieldservicion_ivaSriCompras.setEnabled(false);
		jTextFieldservicion_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicion_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicion_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldservicion_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldservicion_ivaSriCompras.setText("0.0");

		this.jButtonservicion_ivaSriComprasBusqueda= new JButtonMe();
		this.jButtonservicion_ivaSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicion_ivaSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicion_ivaSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonservicion_ivaSriComprasBusqueda.setText("U");
		this.jButtonservicion_ivaSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonservicion_ivaSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonservicion_ivaSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldservicion_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldservicion_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"servicion_ivaSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonservicion_ivaSriComprasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaSriCompras = new JLabelMe();
		this.jLabeltotal_ivaSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaSriCompras.setToolTipText("Total Iva");
		this.jLabeltotal_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPaneltotal_ivaSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldtotal_ivaSriCompras= new JTextFieldMe();
		jTextFieldtotal_ivaSriCompras.setEnabled(false);
		jTextFieldtotal_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaSriCompras.setText("0.0");

		this.jButtontotal_ivaSriComprasBusqueda= new JButtonMe();
		this.jButtontotal_ivaSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaSriComprasBusqueda.setText("U");
		this.jButtontotal_ivaSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelbienes_sin_ivaSriCompras = new JLabelMe();
		this.jLabelbienes_sin_ivaSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_BIENESSINIVA+" : *");
		this.jLabelbienes_sin_ivaSriCompras.setToolTipText("Bienes Sin Iva");
		this.jLabelbienes_sin_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_sin_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_sin_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbienes_sin_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbienes_sin_ivaSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbienes_sin_ivaSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_BIENESSINIVA);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelbienes_sin_ivaSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldbienes_sin_ivaSriCompras= new JTextFieldMe();
		jTextFieldbienes_sin_ivaSriCompras.setEnabled(false);
		jTextFieldbienes_sin_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_sin_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_sin_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbienes_sin_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbienes_sin_ivaSriCompras.setText("0.0");

		this.jButtonbienes_sin_ivaSriComprasBusqueda= new JButtonMe();
		this.jButtonbienes_sin_ivaSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_sin_ivaSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_sin_ivaSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbienes_sin_ivaSriComprasBusqueda.setText("U");
		this.jButtonbienes_sin_ivaSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbienes_sin_ivaSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbienes_sin_ivaSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbienes_sin_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbienes_sin_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"bienes_sin_ivaSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbienes_sin_ivaSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelservicios_sin_ivaSriCompras = new JLabelMe();
		this.jLabelservicios_sin_ivaSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA+" : *");
		this.jLabelservicios_sin_ivaSriCompras.setToolTipText("Servicios Sin Iva");
		this.jLabelservicios_sin_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelservicios_sin_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelservicios_sin_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelservicios_sin_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelservicios_sin_ivaSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelservicios_sin_ivaSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_SERVICIOSSINIVA);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelservicios_sin_ivaSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldservicios_sin_ivaSriCompras= new JTextFieldMe();
		jTextFieldservicios_sin_ivaSriCompras.setEnabled(false);
		jTextFieldservicios_sin_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_sin_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_sin_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldservicios_sin_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldservicios_sin_ivaSriCompras.setText("0.0");

		this.jButtonservicios_sin_ivaSriComprasBusqueda= new JButtonMe();
		this.jButtonservicios_sin_ivaSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_sin_ivaSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_sin_ivaSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonservicios_sin_ivaSriComprasBusqueda.setText("U");
		this.jButtonservicios_sin_ivaSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonservicios_sin_ivaSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonservicios_sin_ivaSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldservicios_sin_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldservicios_sin_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"servicios_sin_ivaSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonservicios_sin_ivaSriComprasBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaSriCompras = new JLabelMe();
		this.jLabeltotal_sin_ivaSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaSriCompras.setToolTipText("Total Sin Iva");
		this.jLabeltotal_sin_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPaneltotal_sin_ivaSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldtotal_sin_ivaSriCompras= new JTextFieldMe();
		jTextFieldtotal_sin_ivaSriCompras.setEnabled(false);
		jTextFieldtotal_sin_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaSriCompras.setText("0.0");

		this.jButtontotal_sin_ivaSriComprasBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaSriComprasBusqueda.setText("U");
		this.jButtontotal_sin_ivaSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelmonto_ivaSriCompras = new JLabelMe();
		this.jLabelmonto_ivaSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_MONTOIVA+" : *");
		this.jLabelmonto_ivaSriCompras.setToolTipText("Monto Iva");
		this.jLabelmonto_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_ivaSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_ivaSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_MONTOIVA);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelmonto_ivaSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldmonto_ivaSriCompras= new JTextFieldMe();
		jTextFieldmonto_ivaSriCompras.setEnabled(false);
		jTextFieldmonto_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_ivaSriCompras.setText("0.0");

		this.jButtonmonto_ivaSriComprasBusqueda= new JButtonMe();
		this.jButtonmonto_ivaSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_ivaSriComprasBusqueda.setText("U");
		this.jButtonmonto_ivaSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_ivaSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_ivaSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_ivaSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_ivaSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelmonto_iceSriCompras = new JLabelMe();
		this.jLabelmonto_iceSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_MONTOICE+" : *");
		this.jLabelmonto_iceSriCompras.setToolTipText("Monto Ice");
		this.jLabelmonto_iceSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_iceSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_iceSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_iceSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_iceSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_iceSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_MONTOICE);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelmonto_iceSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldmonto_iceSriCompras= new JTextFieldMe();
		jTextFieldmonto_iceSriCompras.setEnabled(false);
		jTextFieldmonto_iceSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_iceSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_iceSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_iceSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_iceSriCompras.setText("0.0");

		this.jButtonmonto_iceSriComprasBusqueda= new JButtonMe();
		this.jButtonmonto_iceSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_iceSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_iceSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_iceSriComprasBusqueda.setText("U");
		this.jButtonmonto_iceSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_iceSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_iceSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_iceSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_iceSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_iceSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_iceSriComprasBusqueda.setVisible(false);		}


					
		this.jLabeltransfe_iva_retenerSriCompras = new JLabelMe();
		this.jLabeltransfe_iva_retenerSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER+" : *");
		this.jLabeltransfe_iva_retenerSriCompras.setToolTipText("Transfe Iva Retener");
		this.jLabeltransfe_iva_retenerSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltransfe_iva_retenerSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltransfe_iva_retenerSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltransfe_iva_retenerSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltransfe_iva_retenerSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltransfe_iva_retenerSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENER);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPaneltransfe_iva_retenerSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldtransfe_iva_retenerSriCompras= new JTextFieldMe();
		jTextFieldtransfe_iva_retenerSriCompras.setEnabled(false);
		jTextFieldtransfe_iva_retenerSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtransfe_iva_retenerSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtransfe_iva_retenerSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtransfe_iva_retenerSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtransfe_iva_retenerSriCompras.setText("0.0");

		this.jButtontransfe_iva_retenerSriComprasBusqueda= new JButtonMe();
		this.jButtontransfe_iva_retenerSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransfe_iva_retenerSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransfe_iva_retenerSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontransfe_iva_retenerSriComprasBusqueda.setText("U");
		this.jButtontransfe_iva_retenerSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontransfe_iva_retenerSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontransfe_iva_retenerSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtransfe_iva_retenerSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtransfe_iva_retenerSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"transfe_iva_retenerSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontransfe_iva_retenerSriComprasBusqueda.setVisible(false);		}


					
		this.jLabeltransfe_iva_retenidoSriCompras = new JLabelMe();
		this.jLabeltransfe_iva_retenidoSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO+" : *");
		this.jLabeltransfe_iva_retenidoSriCompras.setToolTipText("Transfe Iva Reteno");
		this.jLabeltransfe_iva_retenidoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltransfe_iva_retenidoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltransfe_iva_retenidoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltransfe_iva_retenidoSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltransfe_iva_retenidoSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltransfe_iva_retenidoSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_TRANSFEIVARETENIDO);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPaneltransfe_iva_retenidoSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldtransfe_iva_retenidoSriCompras= new JTextFieldMe();
		jTextFieldtransfe_iva_retenidoSriCompras.setEnabled(false);
		jTextFieldtransfe_iva_retenidoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtransfe_iva_retenidoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtransfe_iva_retenidoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtransfe_iva_retenidoSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtransfe_iva_retenidoSriCompras.setText("0.0");

		this.jButtontransfe_iva_retenidoSriComprasBusqueda= new JButtonMe();
		this.jButtontransfe_iva_retenidoSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransfe_iva_retenidoSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransfe_iva_retenidoSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontransfe_iva_retenidoSriComprasBusqueda.setText("U");
		this.jButtontransfe_iva_retenidoSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontransfe_iva_retenidoSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontransfe_iva_retenidoSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtransfe_iva_retenidoSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtransfe_iva_retenidoSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"transfe_iva_retenidoSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontransfe_iva_retenidoSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelpresta_iva_retenerSriCompras = new JLabelMe();
		this.jLabelpresta_iva_retenerSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER+" : *");
		this.jLabelpresta_iva_retenerSriCompras.setToolTipText("Presta Iva Retener");
		this.jLabelpresta_iva_retenerSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpresta_iva_retenerSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpresta_iva_retenerSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpresta_iva_retenerSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpresta_iva_retenerSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpresta_iva_retenerSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENER);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelpresta_iva_retenerSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldpresta_iva_retenerSriCompras= new JTextFieldMe();
		jTextFieldpresta_iva_retenerSriCompras.setEnabled(false);
		jTextFieldpresta_iva_retenerSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpresta_iva_retenerSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpresta_iva_retenerSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpresta_iva_retenerSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpresta_iva_retenerSriCompras.setText("0.0");

		this.jButtonpresta_iva_retenerSriComprasBusqueda= new JButtonMe();
		this.jButtonpresta_iva_retenerSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpresta_iva_retenerSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpresta_iva_retenerSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpresta_iva_retenerSriComprasBusqueda.setText("U");
		this.jButtonpresta_iva_retenerSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpresta_iva_retenerSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpresta_iva_retenerSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpresta_iva_retenerSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpresta_iva_retenerSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"presta_iva_retenerSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpresta_iva_retenerSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelpresta_iva_retenidoSriCompras = new JLabelMe();
		this.jLabelpresta_iva_retenidoSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO+" : *");
		this.jLabelpresta_iva_retenidoSriCompras.setToolTipText("Presta Iva Reteno");
		this.jLabelpresta_iva_retenidoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpresta_iva_retenidoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpresta_iva_retenidoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpresta_iva_retenidoSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpresta_iva_retenidoSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpresta_iva_retenidoSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_PRESTAIVARETENIDO);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelpresta_iva_retenidoSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldpresta_iva_retenidoSriCompras= new JTextFieldMe();
		jTextFieldpresta_iva_retenidoSriCompras.setEnabled(false);
		jTextFieldpresta_iva_retenidoSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpresta_iva_retenidoSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpresta_iva_retenidoSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpresta_iva_retenidoSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpresta_iva_retenidoSriCompras.setText("0.0");

		this.jButtonpresta_iva_retenidoSriComprasBusqueda= new JButtonMe();
		this.jButtonpresta_iva_retenidoSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpresta_iva_retenidoSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpresta_iva_retenidoSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpresta_iva_retenidoSriComprasBusqueda.setText("U");
		this.jButtonpresta_iva_retenidoSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpresta_iva_retenidoSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpresta_iva_retenidoSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpresta_iva_retenidoSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpresta_iva_retenidoSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"presta_iva_retenidoSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpresta_iva_retenidoSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_caducidadSriCompras = new JLabelMe();
		this.jLabelfecha_caducidadSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD+" : *");
		this.jLabelfecha_caducidadSriCompras.setToolTipText("Fecha Caducad");
		this.jLabelfecha_caducidadSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caducidadSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_caducidadSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_caducidadSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_caducidadSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_caducidadSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_FECHACADUCIDAD);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelfecha_caducidadSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		//jFormattedTextFieldfecha_caducidadSriCompras= new JFormattedTextFieldMe();

		jDateChooserfecha_caducidadSriCompras= new JDateChooser();
		jDateChooserfecha_caducidadSriCompras.setEnabled(false);
		jDateChooserfecha_caducidadSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidadSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidadSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_caducidadSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_caducidadSriCompras.setDate(new Date());
		jDateChooserfecha_caducidadSriCompras.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_caducidadSriCompras.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_caducidadSriComprasBusqueda= new JButtonMe();
		this.jButtonfecha_caducidadSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidadSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidadSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_caducidadSriComprasBusqueda.setText("U");
		this.jButtonfecha_caducidadSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_caducidadSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_caducidadSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_caducidadSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_caducidadSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_caducidadSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_caducidadSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_asiento_contableSriCompras = new JLabelMe();
		this.jLabelcodigo_asiento_contableSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE+" : *");
		this.jLabelcodigo_asiento_contableSriCompras.setToolTipText("Codigo Asiento Contable");
		this.jLabelcodigo_asiento_contableSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_asiento_contableSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_asiento_contableSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_asiento_contableSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_asiento_contableSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_asiento_contableSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_CODIGOASIENTOCONTABLE);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelcodigo_asiento_contableSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldcodigo_asiento_contableSriCompras= new JTextFieldMe();

		jTextFieldcodigo_asiento_contableSriCompras.setEnabled(false);
		jTextFieldcodigo_asiento_contableSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asiento_contableSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asiento_contableSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_asiento_contableSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_asiento_contableSriComprasBusqueda= new JButtonMe();
		this.jButtoncodigo_asiento_contableSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asiento_contableSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asiento_contableSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_asiento_contableSriComprasBusqueda.setText("U");
		this.jButtoncodigo_asiento_contableSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_asiento_contableSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_asiento_contableSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_asiento_contableSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_asiento_contableSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_asiento_contableSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_asiento_contableSriComprasBusqueda.setVisible(false);		}


					
		this.jLabelnumero_documento_contableSriCompras = new JLabelMe();
		this.jLabelnumero_documento_contableSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE+" : *");
		this.jLabelnumero_documento_contableSriCompras.setToolTipText("Numero Documento Contable");
		this.jLabelnumero_documento_contableSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_documento_contableSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_documento_contableSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documento_contableSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documento_contableSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documento_contableSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelnumero_documento_contableSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jTextFieldnumero_documento_contableSriCompras= new JTextFieldMe();

		jTextFieldnumero_documento_contableSriCompras.setEnabled(false);
		jTextFieldnumero_documento_contableSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documento_contableSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documento_contableSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documento_contableSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documento_contableSriComprasBusqueda= new JButtonMe();
		this.jButtonnumero_documento_contableSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documento_contableSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documento_contableSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documento_contableSriComprasBusqueda.setText("U");
		this.jButtonnumero_documento_contableSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documento_contableSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documento_contableSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documento_contableSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documento_contableSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documento_contableSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documento_contableSriComprasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSriCompras() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSriCompras = new JLabelMe();
		this.jLabelid_empresaSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSriCompras.setToolTipText("Empresa");
		this.jLabelid_empresaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelid_empresaSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jComboBoxid_empresaSriCompras= new JComboBoxMe();
		jComboBoxid_empresaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSriCompras.setEnabled(false);

		this.jButtonid_empresaSriCompras= new JButtonMe();
		this.jButtonid_empresaSriCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSriCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSriCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSriCompras.setText("Buscar");
		this.jButtonid_empresaSriCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSriCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSriCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSriCompras"));

		this.jButtonid_empresaSriComprasBusqueda= new JButtonMe();
		this.jButtonid_empresaSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSriComprasBusqueda.setText("U");
		this.jButtonid_empresaSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSriComprasBusqueda.setVisible(false);		}

		this.jButtonid_empresaSriComprasUpdate= new JButtonMe();
		this.jButtonid_empresaSriComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSriComprasUpdate.setText("U");
		this.jButtonid_empresaSriComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSriComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSriComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSriComprasUpdate"));



					
		this.jLabelid_periodo_declaraSriCompras = new JLabelMe();
		this.jLabelid_periodo_declaraSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_IDPERIODODECLARA+" : *");
		this.jLabelid_periodo_declaraSriCompras.setToolTipText("Periodo Declara");
		this.jLabelid_periodo_declaraSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodo_declaraSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodo_declaraSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_IDPERIODODECLARA);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelid_periodo_declaraSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jComboBoxid_periodo_declaraSriCompras= new JComboBoxMe();
		jComboBoxid_periodo_declaraSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodo_declaraSriCompras= new JButtonMe();
		this.jButtonid_periodo_declaraSriCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraSriCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraSriCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraSriCompras.setText("Buscar");
		this.jButtonid_periodo_declaraSriCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodo_declaraSriCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraSriCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodo_declaraSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraSriCompras"));

		this.jButtonid_periodo_declaraSriComprasBusqueda= new JButtonMe();
		this.jButtonid_periodo_declaraSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraSriComprasBusqueda.setText("U");
		this.jButtonid_periodo_declaraSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodo_declaraSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodo_declaraSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodo_declaraSriComprasBusqueda.setVisible(false);		}

		this.jButtonid_periodo_declaraSriComprasUpdate= new JButtonMe();
		this.jButtonid_periodo_declaraSriComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraSriComprasUpdate.setText("U");
		this.jButtonid_periodo_declaraSriComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodo_declaraSriComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraSriComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodo_declaraSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraSriComprasUpdate"));



					
		this.jLabelid_clienteSriCompras = new JLabelMe();
		this.jLabelid_clienteSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteSriCompras.setToolTipText("Cliente");
		this.jLabelid_clienteSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelid_clienteSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jComboBoxid_clienteSriCompras= new JComboBoxMe();
		jComboBoxid_clienteSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteSriCompras= new JButtonMe();
		this.jButtonid_clienteSriCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSriCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSriCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteSriCompras.setText("Buscar");
		this.jButtonid_clienteSriCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteSriCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSriCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSriCompras"));

		this.jButtonid_clienteSriComprasBusqueda= new JButtonMe();
		this.jButtonid_clienteSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteSriComprasBusqueda.setText("U");
		this.jButtonid_clienteSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteSriComprasBusqueda.setVisible(false);		}

		this.jButtonid_clienteSriComprasUpdate= new JButtonMe();
		this.jButtonid_clienteSriComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSriComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteSriComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteSriComprasUpdate.setText("U");
		this.jButtonid_clienteSriComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteSriComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteSriComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteSriComprasUpdate"));



					
		this.jLabelid_tipo_ivaSriCompras = new JLabelMe();
		this.jLabelid_tipo_ivaSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_IDTIPOIVA+" : *");
		this.jLabelid_tipo_ivaSriCompras.setToolTipText("Tipo Iva");
		this.jLabelid_tipo_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_ivaSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_ivaSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_IDTIPOIVA);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelid_tipo_ivaSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jComboBoxid_tipo_ivaSriCompras= new JComboBoxMe();
		jComboBoxid_tipo_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_ivaSriCompras= new JButtonMe();
		this.jButtonid_tipo_ivaSriCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaSriCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaSriCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaSriCompras.setText("Buscar");
		this.jButtonid_tipo_ivaSriCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_ivaSriCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaSriCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaSriCompras"));

		this.jButtonid_tipo_ivaSriComprasBusqueda= new JButtonMe();
		this.jButtonid_tipo_ivaSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaSriComprasBusqueda.setText("U");
		this.jButtonid_tipo_ivaSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_ivaSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_ivaSriComprasBusqueda.setVisible(false);		}

		this.jButtonid_tipo_ivaSriComprasUpdate= new JButtonMe();
		this.jButtonid_tipo_ivaSriComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaSriComprasUpdate.setText("U");
		this.jButtonid_tipo_ivaSriComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_ivaSriComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaSriComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaSriComprasUpdate"));



					
		this.jLabelid_tipo_retencion_ivaSriCompras = new JLabelMe();
		this.jLabelid_tipo_retencion_ivaSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA+" : *");
		this.jLabelid_tipo_retencion_ivaSriCompras.setToolTipText("Tipo Retencion Iva");
		this.jLabelid_tipo_retencion_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_ivaSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_ivaSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVA);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelid_tipo_retencion_ivaSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jComboBoxid_tipo_retencion_ivaSriCompras= new JComboBoxMe();
		jComboBoxid_tipo_retencion_ivaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_ivaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_ivaSriCompras= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaSriCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaSriCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaSriCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaSriCompras.setText("Buscar");
		this.jButtonid_tipo_retencion_ivaSriCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_ivaSriCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaSriCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaSriCompras"));

		this.jButtonid_tipo_retencion_ivaSriComprasBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_ivaSriComprasBusqueda.setText("U");
		this.jButtonid_tipo_retencion_ivaSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_ivaSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_ivaSriComprasBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_ivaSriComprasUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaSriComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaSriComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaSriComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_ivaSriComprasUpdate.setText("U");
		this.jButtonid_tipo_retencion_ivaSriComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_ivaSriComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaSriComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_ivaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaSriComprasUpdate"));



					
		this.jLabelid_tipo_retencion_iva_prestaSriCompras = new JLabelMe();
		this.jLabelid_tipo_retencion_iva_prestaSriCompras.setText(""+SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA+" : *");
		this.jLabelid_tipo_retencion_iva_prestaSriCompras.setToolTipText("Tipo Retencion Iva Presta");
		this.jLabelid_tipo_retencion_iva_prestaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_retencion_iva_prestaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_retencion_iva_prestaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_prestaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_iva_prestaSriCompras=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_iva_prestaSriCompras.setToolTipText(SriComprasConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA);
		this.gridaBagLayoutSriCompras = new GridBagLayout();
		this.jPanelid_tipo_retencion_iva_prestaSriCompras.setLayout(this.gridaBagLayoutSriCompras);


		jComboBoxid_tipo_retencion_iva_prestaSriCompras= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_prestaSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_prestaSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_prestaSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_prestaSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_iva_prestaSriCompras= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_prestaSriCompras.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_prestaSriCompras.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_prestaSriCompras.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_prestaSriCompras.setText("Buscar");
		this.jButtonid_tipo_retencion_iva_prestaSriCompras.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_iva_prestaSriCompras.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_prestaSriCompras,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_iva_prestaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_prestaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_prestaSriCompras"));

		this.jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda.setText("U");
		this.jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_iva_prestaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_prestaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_prestaSriComprasBusqueda"));

		if(this.sricomprasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_iva_prestaSriComprasUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_prestaSriComprasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaSriComprasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaSriComprasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_prestaSriComprasUpdate.setText("U");
		this.jButtonid_tipo_retencion_iva_prestaSriComprasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_iva_prestaSriComprasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_prestaSriComprasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_iva_prestaSriCompras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_prestaSriCompras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_prestaSriComprasUpdate"));



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
		//this.jInternalFrameDetalleSriCompras = new SriComprasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sri Compras DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSriCompras= new GridBagLayout();
		

		
		String sToolTipSriCompras="";
		sToolTipSriCompras=SriComprasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSriCompras+="(Sris.SriCompras)";
		}
		
		if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
			sToolTipSriCompras+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSriCompras = new JButtonMe();
		this.jButtonModificarSriCompras = new JButtonMe();
        this.jButtonActualizarSriCompras = new JButtonMe();
        this.jButtonEliminarSriCompras = new JButtonMe();
        this.jButtonCancelarSriCompras = new JButtonMe();
        this.jButtonGuardarCambiosSriCompras = new JButtonMe();
		this.jButtonGuardarCambiosTablaSriCompras = new JButtonMe();
		this.jButtonCerrarSriCompras = new JButtonMe();
		
		this.jScrollPanelDatosSriCompras = new JScrollPane();   
        this.jScrollPanelDatosEdicionSriCompras = new JScrollPane();
		this.jScrollPanelDatosGeneralSriCompras = new JScrollPane();
				
		
		
		this.jPanelCamposSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sri Compras";
		
		if(!this.sricomprasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Comprases" + this.sPath));
		} else {
			this.jScrollPanelDatosSriCompras.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSriCompras.setName("jPanelCamposSriCompras"); 

		this.jPanelCamposOcultosSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSriCompras.setName("jPanelCamposOcultosSriCompras"); 

        this.jPanelAccionesSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSriCompras.setToolTipText("Acciones");
        this.jPanelAccionesSriCompras.setName("Acciones"); 

		this.jPanelAccionesFormularioSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSriCompras.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSriCompras.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSriCompras.setText("Nuevo");
		this.jButtonModificarSriCompras.setText("Editar");
        this.jButtonActualizarSriCompras.setText("Actualizar");
        this.jButtonEliminarSriCompras.setText("Eliminar");
        this.jButtonCancelarSriCompras.setText("Cancelar");
        this.jButtonGuardarCambiosSriCompras.setText("Guardar");
		this.jButtonGuardarCambiosTablaSriCompras.setText("Guardar");
		this.jButtonCerrarSriCompras.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSriCompras,"nuevo_button","Nuevo",this.sricomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSriCompras,"modificar_button","Editar",this.sricomprasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSriCompras,"actualizar_button","Actualizar",this.sricomprasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSriCompras,"eliminar_button","Eliminar",this.sricomprasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSriCompras,"cancelar_button","Cancelar",this.sricomprasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSriCompras,"guardarcambios_button","Guardar",this.sricomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSriCompras,"guardarcambiostabla_button","Guardar",this.sricomprasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSriCompras,"cerrar_button","Salir",this.sricomprasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSriCompras.setToolTipText("Nuevo"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSriCompras.setToolTipText("Editar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSriCompras.setToolTipText("Actualizar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSriCompras.setToolTipText("Eliminar)"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSriCompras.setToolTipText("Cancelar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSriCompras.setToolTipText("Guardar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSriCompras.setToolTipText("Guardar"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSriCompras.setToolTipText("Salir"+" "+SriComprasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSriCompras";
		inputMap = this.jButtonNuevoSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSriCompras.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSriCompras"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSriCompras";
		inputMap = this.jButtonActualizarSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSriCompras"));
		
		//ELIMINAR
		sMapKey = "EliminarSriCompras";
		inputMap = this.jButtonEliminarSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSriCompras"));
		
		//CANCELAR	
		sMapKey = "CancelarSriCompras";
		inputMap = this.jButtonCancelarSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSriCompras"));
		
		//CERRAR		
		sMapKey = "CerrarSriCompras";
		inputMap = this.jButtonCerrarSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSriCompras"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSriCompras";
		inputMap = this.jButtonGuardarCambiosTablaSriCompras.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSriCompras.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSriCompras"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSriCompras = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSriCompras.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSriCompras.setToolTipText("Nuevo SriCompras");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSriCompras = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSriCompras.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSriCompras.setToolTipText("Sin Cerrar Ventana SriCompras");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSriCompras = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSriCompras.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSriCompras.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSriCompras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSriCompras.setText("Accion");
		this.jComboBoxTiposAccionesSriCompras.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSriCompras = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSriCompras.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSriCompras.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSriCompras = new JLabelMe();
		
		this.jLabelAccionesSriCompras.setText("Acciones");		
		this.jLabelAccionesSriCompras.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriCompras.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriCompras.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSriCompras();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSriCompras();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSriCompras=new JTabbedPane();
		this.jTabbedPaneRelacionesSriCompras.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSriCompras,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSriCompras.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriCompras.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriCompras.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSriCompras, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSriCompras.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSriCompras.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSriCompras.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSriCompras, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSriCompras = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSriCompras = new GridBagLayout();
		
		this.jPanelCamposSriCompras.setLayout(gridaBagLayoutCamposSriCompras);
		this.jPanelCamposOcultosSriCompras.setLayout(gridaBagLayoutCamposOcultosSriCompras);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSriCompras.add(jLabelIdSriCompras, this.gridBagConstraintsSriCompras);



	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSriCompras.add(jLabelidSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSriCompras.add(jLabelid_empresaSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSriCompras.add(jButtonid_empresaSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 3;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSriCompras.add(jButtonid_empresaSriComprasUpdate, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSriCompras.add(jComboBoxid_empresaSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodo_declaraSriCompras.add(jLabelid_periodo_declaraSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraSriCompras.add(jButtonid_periodo_declaraSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 3;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraSriCompras.add(jButtonid_periodo_declaraSriComprasUpdate, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodo_declaraSriCompras.add(jComboBoxid_periodo_declaraSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteSriCompras.add(jLabelid_clienteSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteSriCompras.add(jButtonid_clienteSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 3;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteSriCompras.add(jButtonid_clienteSriComprasUpdate, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteSriCompras.add(jComboBoxid_clienteSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucSriCompras.add(jLabelrucSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucSriCompras.add(jButtonrucSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucSriCompras.add(jTextFieldrucSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_comprobanteSriCompras.add(jLabelnombre_tipo_comprobanteSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_comprobanteSriCompras.add(jButtonnombre_tipo_comprobanteSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_comprobanteSriCompras.add(jscrollPanenombre_tipo_comprobanteSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteSriCompras.add(jLabelnombre_completo_clienteSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteSriCompras.add(jButtonnombre_completo_clienteSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteSriCompras.add(jscrollPanenombre_completo_clienteSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_datoSriCompras.add(jLabelruc_datoSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_datoSriCompras.add(jButtonruc_datoSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_datoSriCompras.add(jTextFieldruc_datoSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documentoSriCompras.add(jLabelnumero_documentoSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoSriCompras.add(jButtonnumero_documentoSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documentoSriCompras.add(jTextFieldnumero_documentoSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionSriCompras.add(jLabelfecha_emisionSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionSriCompras.add(jButtonfecha_emisionSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionSriCompras.add(jDateChooserfecha_emisionSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_registro_contableSriCompras.add(jLabelfecha_registro_contableSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_registro_contableSriCompras.add(jButtonfecha_registro_contableSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_registro_contableSriCompras.add(jDateChooserfecha_registro_contableSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_serieSriCompras.add(jLabelnumero_serieSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serieSriCompras.add(jButtonnumero_serieSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_serieSriCompras.add(jTextFieldnumero_serieSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_autorizacionSriCompras.add(jLabelnumero_autorizacionSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizacionSriCompras.add(jButtonnumero_autorizacionSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_autorizacionSriCompras.add(jTextFieldnumero_autorizacionSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbienes_ivaSriCompras.add(jLabelbienes_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelbienes_ivaSriCompras.add(jButtonbienes_ivaSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbienes_ivaSriCompras.add(jTextFieldbienes_ivaSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelservicion_ivaSriCompras.add(jLabelservicion_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelservicion_ivaSriCompras.add(jButtonservicion_ivaSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelservicion_ivaSriCompras.add(jTextFieldservicion_ivaSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaSriCompras.add(jLabeltotal_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaSriCompras.add(jButtontotal_ivaSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaSriCompras.add(jTextFieldtotal_ivaSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbienes_sin_ivaSriCompras.add(jLabelbienes_sin_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelbienes_sin_ivaSriCompras.add(jButtonbienes_sin_ivaSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbienes_sin_ivaSriCompras.add(jTextFieldbienes_sin_ivaSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelservicios_sin_ivaSriCompras.add(jLabelservicios_sin_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelservicios_sin_ivaSriCompras.add(jButtonservicios_sin_ivaSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelservicios_sin_ivaSriCompras.add(jTextFieldservicios_sin_ivaSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaSriCompras.add(jLabeltotal_sin_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaSriCompras.add(jButtontotal_sin_ivaSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaSriCompras.add(jTextFieldtotal_sin_ivaSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_ivaSriCompras.add(jLabelid_tipo_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaSriCompras.add(jButtonid_tipo_ivaSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 3;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaSriCompras.add(jButtonid_tipo_ivaSriComprasUpdate, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_ivaSriCompras.add(jComboBoxid_tipo_ivaSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_ivaSriCompras.add(jLabelmonto_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_ivaSriCompras.add(jButtonmonto_ivaSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_ivaSriCompras.add(jTextFieldmonto_ivaSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_iceSriCompras.add(jLabelmonto_iceSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_iceSriCompras.add(jButtonmonto_iceSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_iceSriCompras.add(jTextFieldmonto_iceSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltransfe_iva_retenerSriCompras.add(jLabeltransfe_iva_retenerSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPaneltransfe_iva_retenerSriCompras.add(jButtontransfe_iva_retenerSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltransfe_iva_retenerSriCompras.add(jTextFieldtransfe_iva_retenerSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_ivaSriCompras.add(jLabelid_tipo_retencion_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_ivaSriCompras.add(jButtonid_tipo_retencion_ivaSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 3;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_ivaSriCompras.add(jButtonid_tipo_retencion_ivaSriComprasUpdate, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_ivaSriCompras.add(jComboBoxid_tipo_retencion_ivaSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltransfe_iva_retenidoSriCompras.add(jLabeltransfe_iva_retenidoSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPaneltransfe_iva_retenidoSriCompras.add(jButtontransfe_iva_retenidoSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltransfe_iva_retenidoSriCompras.add(jTextFieldtransfe_iva_retenidoSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpresta_iva_retenerSriCompras.add(jLabelpresta_iva_retenerSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelpresta_iva_retenerSriCompras.add(jButtonpresta_iva_retenerSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpresta_iva_retenerSriCompras.add(jTextFieldpresta_iva_retenerSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_iva_prestaSriCompras.add(jLabelid_tipo_retencion_iva_prestaSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_prestaSriCompras.add(jButtonid_tipo_retencion_iva_prestaSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 3;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_prestaSriCompras.add(jButtonid_tipo_retencion_iva_prestaSriComprasUpdate, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_iva_prestaSriCompras.add(jComboBoxid_tipo_retencion_iva_prestaSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpresta_iva_retenidoSriCompras.add(jLabelpresta_iva_retenidoSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelpresta_iva_retenidoSriCompras.add(jButtonpresta_iva_retenidoSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpresta_iva_retenidoSriCompras.add(jTextFieldpresta_iva_retenidoSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_caducidadSriCompras.add(jLabelfecha_caducidadSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_caducidadSriCompras.add(jButtonfecha_caducidadSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_caducidadSriCompras.add(jDateChooserfecha_caducidadSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_asiento_contableSriCompras.add(jLabelcodigo_asiento_contableSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_asiento_contableSriCompras.add(jButtoncodigo_asiento_contableSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_asiento_contableSriCompras.add(jTextFieldcodigo_asiento_contableSriCompras, this.gridBagConstraintsSriCompras);


	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 0;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documento_contableSriCompras.add(jLabelnumero_documento_contableSriCompras, this.gridBagConstraintsSriCompras);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		//this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = 2;
		this.gridBagConstraintsSriCompras.ipadx = 0;
		this.gridBagConstraintsSriCompras.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documento_contableSriCompras.add(jButtonnumero_documento_contableSriComprasBusqueda, this.gridBagConstraintsSriCompras);
	}

	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriCompras.gridy = 0;
	this.gridBagConstraintsSriCompras.gridx = 1;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documento_contableSriCompras.add(jTextFieldnumero_documento_contableSriCompras, this.gridBagConstraintsSriCompras);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelidSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelid_periodo_declaraSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelid_clienteSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelrucSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelnombre_tipo_comprobanteSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelnombre_completo_clienteSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelruc_datoSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelnumero_documentoSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelfecha_emisionSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelfecha_registro_contableSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelnumero_serieSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelnumero_autorizacionSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelbienes_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelservicion_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPaneltotal_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelbienes_sin_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelservicios_sin_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPaneltotal_sin_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelid_tipo_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelmonto_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelmonto_iceSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPaneltransfe_iva_retenerSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelid_tipo_retencion_ivaSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPaneltransfe_iva_retenidoSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelpresta_iva_retenerSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelid_tipo_retencion_iva_prestaSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelpresta_iva_retenidoSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelfecha_caducidadSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelcodigo_asiento_contableSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriCompras.add(this.jPanelnumero_documento_contableSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposSriCompras % 3==0) {
		iXPanelCamposSriCompras=0;
		iYPanelCamposSriCompras++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSriCompras = new GridBagConstraints();
	this.gridBagConstraintsSriCompras.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriCompras.gridy = iYPanelCamposOcultosSriCompras;
	this.gridBagConstraintsSriCompras.gridx = iXPanelCamposOcultosSriCompras++;
	this.gridBagConstraintsSriCompras.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriCompras.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSriCompras.add(this.jPanelid_empresaSriCompras, this.gridBagConstraintsSriCompras);



	if(iXPanelCamposOcultosSriCompras % 3==0) {
		iXPanelCamposOcultosSriCompras=0;
		iYPanelCamposOcultosSriCompras++;
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
			
		GridBagLayout gridaBagLayoutAccionesSriCompras= new GridBagLayout();
		this.jPanelAccionesSriCompras.setLayout(gridaBagLayoutAccionesSriCompras);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSriCompras= new GridBagLayout();
		this.jPanelAccionesFormularioSriCompras.setLayout(gridaBagLayoutAccionesFormularioSriCompras);
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSriCompras.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSriCompras.add(this.jComboBoxTiposAccionesFormularioSriCompras, this.gridBagConstraintsSriCompras);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx = iPosXAccion++;
			
		this.jPanelAccionesSriCompras.add(this.jButtonModificarSriCompras, this.gridBagConstraintsSriCompras);							

		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriCompras.gridy = 0;
		this.gridBagConstraintsSriCompras.gridx =iPosXAccion++;
			
		this.jPanelAccionesSriCompras.add(this.jButtonEliminarSriCompras, this.gridBagConstraintsSriCompras);
		
			
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy = 0;		
		this.gridBagConstraintsSriCompras.gridx = iPosXAccion++;
		
		this.jPanelAccionesSriCompras.add(this.jButtonActualizarSriCompras, this.gridBagConstraintsSriCompras);


		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy = 0;		
		this.gridBagConstraintsSriCompras.gridx = iPosXAccion++;
		
		this.jPanelAccionesSriCompras.add(this.jButtonGuardarCambiosSriCompras, this.gridBagConstraintsSriCompras);	
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy = 0;		
		this.gridBagConstraintsSriCompras.gridx =iPosXAccion++;
		
		this.jPanelAccionesSriCompras.add(this.jButtonCancelarSriCompras, this.gridBagConstraintsSriCompras);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSriCompras = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSriCompras);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.sricomprasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSriCompras = new GridBagConstraints();						
			this.gridBagConstraintsSriCompras.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriCompras.gridx = 0;		
			//this.gridBagConstraintsSriCompras.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSriCompras.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSriCompras.gridx =0;
		this.gridBagConstraintsSriCompras.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSriCompras.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSriCompras, this.gridBagConstraintsSriCompras);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SriComprasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSriCompras = new SriComprasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sri Compras DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sri Compras DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sri Compras Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SriComprasModel sricomprasModel=new SriComprasModel(this);
			
			//SI USARA CLASE INTERNA
			//SriComprasModel.SriComprasFocusTraversalPolicy sricomprasFocusTraversalPolicy = sricomprasModel.new SriComprasFocusTraversalPolicy(this);
			
			//sricomprasFocusTraversalPolicy.setsricomprasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(sricomprasModel);
			
			
			this.jContentPaneDetalleSriCompras = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSriCompras = new GridBagLayout();	
			this.jContentPaneDetalleSriCompras.setLayout(gridaBagLayoutDetalleSriCompras);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSriCompras = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSriCompras = new GridBagConstraints();
				this.gridBagConstraintsSriCompras.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSriCompras.gridx = 0;
					
				
				this.jContentPaneDetalleSriCompras.add(jTtoolBarDetalleSriCompras, gridBagConstraintsSriCompras);								
				
}
			
			this.jScrollPanelDatosEdicionSriCompras=   new JScrollPane(jContentPaneDetalleSriCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSriCompras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriCompras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriCompras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSriCompras=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSriCompras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriCompras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriCompras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSriCompras.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSriCompras.gridx = 0;
	        
			this.jContentPaneDetalleSriCompras.add(jPanelCamposSriCompras, gridBagConstraintsSriCompras);
			
			
			
			
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
						//&& sricomprasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.sricomprasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSriCompras= new GridBagConstraints();
						this.gridBagConstraintsSriCompras.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSriCompras.gridx = 0;
						this.jContentPaneDetalleSriCompras.add(this.jTabbedPaneRelacionesSriCompras, this.gridBagConstraintsSriCompras);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSriCompras.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSriCompras.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSriCompras = new GridBagConstraints();
					this.gridBagConstraintsSriCompras.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSriCompras.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSriCompras.gridx = 0;
					
				
					this.jContentPaneDetalleSriCompras.add(jPanelCamposOcultosSriCompras, gridBagConstraintsSriCompras);
				
					this.jPanelCamposOcultosSriCompras.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSriCompras.gridx = 0;
	        this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSriCompras.add(this.jPanelAccionesFormularioSriCompras, this.gridBagConstraintsSriCompras);							
			
			
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
	        this.gridBagConstraintsSriCompras.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSriCompras.gridx = 0;
	        
			
			this.jContentPaneDetalleSriCompras.add(this.jPanelAccionesSriCompras, this.gridBagConstraintsSriCompras);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSriCompras);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSriCompras=   new JScrollPane(this.jPanelCamposSriCompras,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSriCompras.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriCompras.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriCompras.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSriCompras.gridx = 0;
			this.gridBagConstraintsSriCompras.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSriCompras.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSriCompras.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSriCompras, this.gridBagConstraintsSriCompras);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSriCompras.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSriCompras, this.gridBagConstraintsSriCompras);			
			
			this.gridBagConstraintsSriCompras = new GridBagConstraints();
			this.gridBagConstraintsSriCompras.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSriCompras.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSriCompras, this.gridBagConstraintsSriCompras);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriCompras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSriCompras, this.gridBagConstraintsSriCompras);
			
			
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriCompras.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSriCompras, this.gridBagConstraintsSriCompras);
		
			
		this.gridBagConstraintsSriCompras = new GridBagConstraints();
		this.gridBagConstraintsSriCompras.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSriCompras.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSriCompras, this.gridBagConstraintsSriCompras);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSriCompras;//jContentPane;
		
		return jScrollPanelDatosEdicionSriCompras;
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
