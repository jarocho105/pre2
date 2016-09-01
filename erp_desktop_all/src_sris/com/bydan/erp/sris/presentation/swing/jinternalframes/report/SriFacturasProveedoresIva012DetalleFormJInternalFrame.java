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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.sris.util.report.SriFacturasProveedoresIva012ConstantesFunciones;

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
public class SriFacturasProveedoresIva012DetalleFormJInternalFrame extends SriFacturasProveedoresIva012BeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSriFacturasProveedoresIva012;
	
	protected JMenuBar jmenuBarDetalleSriFacturasProveedoresIva012;
	
	protected JMenu jmenuDetalleSriFacturasProveedoresIva012;
	protected JMenu jmenuDetalleArchivoSriFacturasProveedoresIva012;
	protected JMenu jmenuDetalleAccionesSriFacturasProveedoresIva012;
	protected JMenu jmenuDetalleDatosSriFacturasProveedoresIva012;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSriFacturasProveedoresIva012;	
	protected GridBagConstraints gridBagConstraintsSriFacturasProveedoresIva012;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SriFacturasProveedoresIva012BeanSwingJInternalFrameAdditional jInternalFrameDetalleSriFacturasProveedoresIva012;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionivaprestaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivapresta="";
	
	public SriFacturasProveedoresIva012SessionBean srifacturasproveedoresiva012SessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	public TipoRetencionSessionBean tiporetencionivaSessionBean;
	public TipoRetencionSessionBean tiporetencionivaprestaSessionBean;	
	
	public SriFacturasProveedoresIva012Logic srifacturasproveedoresiva012Logic;
	
	public JScrollPane jScrollPanelDatosSriFacturasProveedoresIva012;
	public JScrollPane jScrollPanelDatosEdicionSriFacturasProveedoresIva012;
	public JScrollPane jScrollPanelDatosGeneralSriFacturasProveedoresIva012;
	
	protected JPanel jPanelCamposSriFacturasProveedoresIva012;    
	protected JPanel jPanelCamposOcultosSriFacturasProveedoresIva012;    	
	protected JPanel jPanelAccionesSriFacturasProveedoresIva012;
	protected JPanel jPanelAccionesFormularioSriFacturasProveedoresIva012;
    
	
	
	protected Integer iXPanelCamposSriFacturasProveedoresIva012=0;
	protected Integer iYPanelCamposSriFacturasProveedoresIva012=0;
	
	protected Integer iXPanelCamposOcultosSriFacturasProveedoresIva012=0;
	protected Integer iYPanelCamposOcultosSriFacturasProveedoresIva012=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSriFacturasProveedoresIva012;
	public JButton jButtonModificarSriFacturasProveedoresIva012;
	public JButton jButtonActualizarSriFacturasProveedoresIva012;
    public JButton jButtonEliminarSriFacturasProveedoresIva012;
	public JButton jButtonCancelarSriFacturasProveedoresIva012;
    public JButton jButtonGuardarCambiosSriFacturasProveedoresIva012;
	public JButton jButtonGuardarCambiosTablaSriFacturasProveedoresIva012;
	protected JButton jButtonCerrarSriFacturasProveedoresIva012;
	
	
	protected JButton jButtonProcesarInformacionSriFacturasProveedoresIva012;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSriFacturasProveedoresIva012;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSriFacturasProveedoresIva012;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSriFacturasProveedoresIva012;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonModificarToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonActualizarToolBarSriFacturasProveedoresIva012;
    protected JButton jButtonEliminarToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonCancelarToolBarSriFacturasProveedoresIva012;
    protected JButton jButtonGuardarCambiosToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonGuardarCambiosTablaToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonMostrarOcultarTablaToolBarSriFacturasProveedoresIva012;
	protected JButton jButtonCerrarToolBarSriFacturasProveedoresIva012;
	
	protected JButton jButtonProcesarInformacionToolBarSriFacturasProveedoresIva012;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemModificarSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemActualizarSriFacturasProveedoresIva012;
    protected JMenuItem jMenuItemEliminarSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemCancelarSriFacturasProveedoresIva012;
    protected JMenuItem jMenuItemGuardarCambiosSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemGuardarCambiosTablaSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemCerrarSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemDetalleCerrarSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemDetalleMostarOcultarSriFacturasProveedoresIva012;
	
	protected JMenuItem jMenuItemProcesarInformacionSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSriFacturasProveedoresIva012;
	protected JMenuItem jMenuItemMostrarOcultarSriFacturasProveedoresIva012;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSriFacturasProveedoresIva012;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSriFacturasProveedoresIva012;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSriFacturasProveedoresIva012;
	public JLabel jLabelIdSriFacturasProveedoresIva012;
	public JLabel jLabelidSriFacturasProveedoresIva012;
	public JButton jButtonidSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelrucSriFacturasProveedoresIva012;
	public JLabel jLabelrucSriFacturasProveedoresIva012;
	public JTextField jTextFieldrucSriFacturasProveedoresIva012;
	public JButton jButtonrucSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_comprobanteSriFacturasProveedoresIva012;
	public JLabel jLabelnombre_tipo_comprobanteSriFacturasProveedoresIva012;
	public JTextArea jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012;
	public JScrollPane jscrollPanenombre_tipo_comprobanteSriFacturasProveedoresIva012;
	public JButton jButtonnombre_tipo_comprobanteSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteSriFacturasProveedoresIva012;
	public JLabel jLabelnombre_completo_clienteSriFacturasProveedoresIva012;
	public JTextArea jTextAreanombre_completo_clienteSriFacturasProveedoresIva012;
	public JScrollPane jscrollPanenombre_completo_clienteSriFacturasProveedoresIva012;
	public JButton jButtonnombre_completo_clienteSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelruc_datoSriFacturasProveedoresIva012;
	public JLabel jLabelruc_datoSriFacturasProveedoresIva012;
	public JTextField jTextFieldruc_datoSriFacturasProveedoresIva012;
	public JButton jButtonruc_datoSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoSriFacturasProveedoresIva012;
	public JLabel jLabelnumero_documentoSriFacturasProveedoresIva012;
	public JTextField jTextFieldnumero_documentoSriFacturasProveedoresIva012;
	public JButton jButtonnumero_documentoSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionSriFacturasProveedoresIva012;
	public JLabel jLabelfecha_emisionSriFacturasProveedoresIva012;
	//public JFormattedTextField jDateChooserfecha_emisionSriFacturasProveedoresIva012;

	public JDateChooser jDateChooserfecha_emisionSriFacturasProveedoresIva012;
	public JButton jButtonfecha_emisionSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelfecha_registro_contableSriFacturasProveedoresIva012;
	public JLabel jLabelfecha_registro_contableSriFacturasProveedoresIva012;
	//public JFormattedTextField jDateChooserfecha_registro_contableSriFacturasProveedoresIva012;

	public JDateChooser jDateChooserfecha_registro_contableSriFacturasProveedoresIva012;
	public JButton jButtonfecha_registro_contableSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelnumero_serieSriFacturasProveedoresIva012;
	public JLabel jLabelnumero_serieSriFacturasProveedoresIva012;
	public JTextField jTextFieldnumero_serieSriFacturasProveedoresIva012;
	public JButton jButtonnumero_serieSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaSriFacturasProveedoresIva012;
	public JLabel jLabeltotal_ivaSriFacturasProveedoresIva012;
	public JTextField jTextFieldtotal_ivaSriFacturasProveedoresIva012;
	public JButton jButtontotal_ivaSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaSriFacturasProveedoresIva012;
	public JLabel jLabeltotal_sin_ivaSriFacturasProveedoresIva012;
	public JTextField jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012;
	public JButton jButtontotal_sin_ivaSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPaneltransfe_iva_retenidoSriFacturasProveedoresIva012;
	public JLabel jLabeltransfe_iva_retenidoSriFacturasProveedoresIva012;
	public JTextField jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012;
	public JButton jButtontransfe_iva_retenidoSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelpresta_iva_retenidoSriFacturasProveedoresIva012;
	public JLabel jLabelpresta_iva_retenidoSriFacturasProveedoresIva012;
	public JTextField jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012;
	public JButton jButtonpresta_iva_retenidoSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012;
	public JLabel jLabelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012;
	public JTextArea jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012;
	public JScrollPane jscrollPanenombre_tipo_retencion_fuente1SriFacturasProveedoresIva012;
	public JButton jButtonnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelret_fuente1_porcentajeSriFacturasProveedoresIva012;
	public JLabel jLabelret_fuente1_porcentajeSriFacturasProveedoresIva012;
	public JTextField jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012;
	public JButton jButtonret_fuente1_porcentajeSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelret_fuente1_retenidoSriFacturasProveedoresIva012;
	public JLabel jLabelret_fuente1_retenidoSriFacturasProveedoresIva012;
	public JTextField jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012;
	public JButton jButtonret_fuente1_retenidoSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012;
	public JLabel jLabelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012;
	public JTextArea jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012;
	public JScrollPane jscrollPanenombre_tipo_retencion_fuente2SriFacturasProveedoresIva012;
	public JButton jButtonnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelret_fuente2_porcentajeSriFacturasProveedoresIva012;
	public JLabel jLabelret_fuente2_porcentajeSriFacturasProveedoresIva012;
	public JTextField jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012;
	public JButton jButtonret_fuente2_porcentajeSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelret_fuente2_retenidoSriFacturasProveedoresIva012;
	public JLabel jLabelret_fuente2_retenidoSriFacturasProveedoresIva012;
	public JTextField jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012;
	public JButton jButtonret_fuente2_retenidoSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012;
	public JLabel jLabelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012;
	public JTextArea jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012;
	public JScrollPane jscrollPanenombre_tipo_retencion_iva1SriFacturasProveedoresIva012;
	public JButton jButtonnombre_tipo_retencion_iva1SriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelret_iva_bien_porcentajeSriFacturasProveedoresIva012;
	public JLabel jLabelret_iva_bien_porcentajeSriFacturasProveedoresIva012;
	public JTextField jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012;
	public JButton jButtonret_iva_bien_porcentajeSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelret_iva_bien_retenidoSriFacturasProveedoresIva012;
	public JLabel jLabelret_iva_bien_retenidoSriFacturasProveedoresIva012;
	public JTextField jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012;
	public JButton jButtonret_iva_bien_retenidoSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012;
	public JLabel jLabelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012;
	public JTextArea jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012;
	public JScrollPane jscrollPanenombre_tipo_retencion_iva2SriFacturasProveedoresIva012;
	public JButton jButtonnombre_tipo_retencion_iva2SriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelret_iva_servicio_porcentajeSriFacturasProveedoresIva012;
	public JLabel jLabelret_iva_servicio_porcentajeSriFacturasProveedoresIva012;
	public JTextField jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012;
	public JButton jButtonret_iva_servicio_porcentajeSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelret_iva_servicio_retenidoSriFacturasProveedoresIva012;
	public JLabel jLabelret_iva_servicio_retenidoSriFacturasProveedoresIva012;
	public JTextField jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012;
	public JButton jButtonret_iva_servicio_retenidoSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSriFacturasProveedoresIva012;
	public JLabel jLabelid_empresaSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSriFacturasProveedoresIva012;
	public JButton jButtonid_empresaSriFacturasProveedoresIva012= new JButtonMe();
	public JButton jButtonid_empresaSriFacturasProveedoresIva012Update= new JButtonMe();
	public JButton jButtonid_empresaSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelid_periodo_declaraSriFacturasProveedoresIva012;
	public JLabel jLabelid_periodo_declaraSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraSriFacturasProveedoresIva012;
	public JButton jButtonid_periodo_declaraSriFacturasProveedoresIva012= new JButtonMe();
	public JButton jButtonid_periodo_declaraSriFacturasProveedoresIva012Update= new JButtonMe();
	public JButton jButtonid_periodo_declaraSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelid_tipo_ivaSriFacturasProveedoresIva012;
	public JLabel jLabelid_tipo_ivaSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ivaSriFacturasProveedoresIva012;
	public JButton jButtonid_tipo_ivaSriFacturasProveedoresIva012= new JButtonMe();
	public JButton jButtonid_tipo_ivaSriFacturasProveedoresIva012Update= new JButtonMe();
	public JButton jButtonid_tipo_ivaSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_ivaSriFacturasProveedoresIva012;
	public JLabel jLabelid_tipo_retencion_ivaSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012;
	public JButton jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Update= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012;
	public JLabel jLabelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012;
	public JButton jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Update= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Busqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSriFacturasProveedoresIva012;
	
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
	public int iHeightFormulario=828;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SriFacturasProveedoresIva012DetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSriFacturasProveedoresIva012=new JPanel();
				this.jPanelAccionesFormularioSriFacturasProveedoresIva012=new JPanel();
				this.jmenuBarDetalleSriFacturasProveedoresIva012=new JMenuBar();
				this.jTtoolBarDetalleSriFacturasProveedoresIva012=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresIva012DetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SriFacturasProveedoresIva012 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SriFacturasProveedoresIva012DetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SriFacturasProveedoresIva012 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresIva012DetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriFacturasProveedoresIva012 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresIva012DetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SriFacturasProveedoresIva012 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SriFacturasProveedoresIva012DetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SriFacturasProveedoresIva012 No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSriFacturasProveedoresIva012() {
		return this.jButtonActualizarToolBarSriFacturasProveedoresIva012;
	}
	
	public JButton getjButtonEliminarToolBarSriFacturasProveedoresIva012() {
		return this.jButtonEliminarToolBarSriFacturasProveedoresIva012;
	}
	
	public JButton getjButtonCancelarToolBarSriFacturasProveedoresIva012() {
		return this.jButtonCancelarToolBarSriFacturasProveedoresIva012;
	}		
	
	public JButton getjButtonProcesarInformacionSriFacturasProveedoresIva012() {
		return this.jButtonProcesarInformacionSriFacturasProveedoresIva012;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSriFacturasProveedoresIva012)	{
		this.jButtonProcesarInformacionSriFacturasProveedoresIva012 = jButtonProcesarInformacionSriFacturasProveedoresIva012;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSriFacturasProveedoresIva012() {
		return this.jComboBoxTiposAccionesSriFacturasProveedoresIva012;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSriFacturasProveedoresIva012(
			JComboBox jComboBoxTiposRelacionesSriFacturasProveedoresIva012) {
		this.jComboBoxTiposRelacionesSriFacturasProveedoresIva012 = jComboBoxTiposRelacionesSriFacturasProveedoresIva012;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSriFacturasProveedoresIva012(
			JComboBox jComboBoxTiposAccionesSriFacturasProveedoresIva012) {
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012 = jComboBoxTiposAccionesSriFacturasProveedoresIva012;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012() {
		return this.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012(
			JComboBox jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012) {
		this.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012 = jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.srifacturasproveedoresiva012SessionBean=new SriFacturasProveedoresIva012SessionBean();
		
		this.srifacturasproveedoresiva012SessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.srifacturasproveedoresiva012SessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SriFacturasProveedoresIva012JInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SriFacturasProveedoresIva012JInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SriFacturasProveedoresIva012JInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Sri Facturas Proveedores Iva012 MANTENIMIENTO"));
		
		
		if(iWidth > 3050) {
			iWidth=3050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado()) {
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
	
		SriFacturasProveedoresIva012JInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSriFacturasProveedoresIva012= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSriFacturasProveedoresIva012=new JButtonMe();
				this.jButtonModificarToolBarSriFacturasProveedoresIva012=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSriFacturasProveedoresIva012,this.jTtoolBarDetalleSriFacturasProveedoresIva012,
							"actualizar","actualizar","Actualizar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSriFacturasProveedoresIva012,this.jTtoolBarDetalleSriFacturasProveedoresIva012,
							"eliminar","eliminar","Eliminar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSriFacturasProveedoresIva012,this.jTtoolBarDetalleSriFacturasProveedoresIva012,
							"cancelar","cancelar","Cancelar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSriFacturasProveedoresIva012=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSriFacturasProveedoresIva012,this.jTtoolBarDetalleSriFacturasProveedoresIva012,
							"guardarcambios","guardarcambios","Guardar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSriFacturasProveedoresIva012=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSriFacturasProveedoresIva012=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSriFacturasProveedoresIva012=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSriFacturasProveedoresIva012=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSriFacturasProveedoresIva012=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSriFacturasProveedoresIva012= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSriFacturasProveedoresIva012.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSriFacturasProveedoresIva012,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSriFacturasProveedoresIva012= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSriFacturasProveedoresIva012.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSriFacturasProveedoresIva012,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSriFacturasProveedoresIva012= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSriFacturasProveedoresIva012.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSriFacturasProveedoresIva012,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSriFacturasProveedoresIva012= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSriFacturasProveedoresIva012.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSriFacturasProveedoresIva012,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSriFacturasProveedoresIva012= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSriFacturasProveedoresIva012.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSriFacturasProveedoresIva012,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSriFacturasProveedoresIva012= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSriFacturasProveedoresIva012.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSriFacturasProveedoresIva012,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSriFacturasProveedoresIva012= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSriFacturasProveedoresIva012.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSriFacturasProveedoresIva012,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSriFacturasProveedoresIva012= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSriFacturasProveedoresIva012.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSriFacturasProveedoresIva012,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSriFacturasProveedoresIva012= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSriFacturasProveedoresIva012.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSriFacturasProveedoresIva012,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSriFacturasProveedoresIva012= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSriFacturasProveedoresIva012.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSriFacturasProveedoresIva012,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSriFacturasProveedoresIva012.add(this.jMenuItemDetalleCerrarSriFacturasProveedoresIva012);
		
		this.jmenuDetalleAccionesSriFacturasProveedoresIva012.add(this.jMenuItemActualizarSriFacturasProveedoresIva012);
		this.jmenuDetalleAccionesSriFacturasProveedoresIva012.add(this.jMenuItemEliminarSriFacturasProveedoresIva012);
		this.jmenuDetalleAccionesSriFacturasProveedoresIva012.add(this.jMenuItemCancelarSriFacturasProveedoresIva012);		
		
		//this.jmenuDetalleDatosSriFacturasProveedoresIva012.add(this.jMenuItemDetalleAbrirOrderBySriFacturasProveedoresIva012);				
		this.jmenuDetalleDatosSriFacturasProveedoresIva012.add(this.jMenuItemDetalleMostarOcultarSriFacturasProveedoresIva012);				
				
		//this.jmenuDetalleAccionesSriFacturasProveedoresIva012.add(this.jMenuItemGuardarCambiosSriFacturasProveedoresIva012);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSriFacturasProveedoresIva012.add(this.jmenuDetalleArchivoSriFacturasProveedoresIva012);		
		this.jmenuBarDetalleSriFacturasProveedoresIva012.add(this.jmenuDetalleAccionesSriFacturasProveedoresIva012);		
		this.jmenuBarDetalleSriFacturasProveedoresIva012.add(this.jmenuDetalleDatosSriFacturasProveedoresIva012);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSriFacturasProveedoresIva012);				
	}
	
	
	public void inicializarElementosCamposSriFacturasProveedoresIva012() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSriFacturasProveedoresIva012 = new JLabelMe();
		jLabelIdSriFacturasProveedoresIva012.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSriFacturasProveedoresIva012 = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSriFacturasProveedoresIva012= new GridBagLayout();

		this.jPanelidSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);

		jLabelidSriFacturasProveedoresIva012 = new JLabel();
		jLabelidSriFacturasProveedoresIva012.setText("Id");

		jLabelidSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelrucSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelrucSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucSriFacturasProveedoresIva012.setToolTipText("Ruc");
		this.jLabelrucSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelrucSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldrucSriFacturasProveedoresIva012= new JTextFieldMe();

		jTextFieldrucSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldrucSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonrucSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonrucSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_comprobanteSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelnombre_tipo_comprobanteSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE+" : *");
		this.jLabelnombre_tipo_comprobanteSriFacturasProveedoresIva012.setToolTipText("Nombre Tipo Comprobante");
		this.jLabelnombre_tipo_comprobanteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_comprobanteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_comprobanteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_comprobanteSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_comprobanteSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_comprobanteSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPOCOMPROBANTE);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelnombre_tipo_comprobanteSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012= new JTextAreaMe();
		jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012.setEnabled(false);
		jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012.setLineWrap(true);
		jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012.setWrapStyleWord(true);
		jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_comprobanteSriFacturasProveedoresIva012 = new JScrollPane(jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012);
		jscrollPanenombre_tipo_comprobanteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_comprobanteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_comprobanteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_tipo_comprobanteSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonnombre_tipo_comprobanteSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_comprobanteSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_comprobanteSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_comprobanteSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonnombre_tipo_comprobanteSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_comprobanteSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_comprobanteSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_comprobanteSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_comprobanteSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_comprobanteSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelnombre_completo_clienteSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteSriFacturasProveedoresIva012.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelnombre_completo_clienteSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextAreanombre_completo_clienteSriFacturasProveedoresIva012= new JTextAreaMe();
		jTextAreanombre_completo_clienteSriFacturasProveedoresIva012.setEnabled(false);
		jTextAreanombre_completo_clienteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteSriFacturasProveedoresIva012.setLineWrap(true);
		jTextAreanombre_completo_clienteSriFacturasProveedoresIva012.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteSriFacturasProveedoresIva012.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteSriFacturasProveedoresIva012.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteSriFacturasProveedoresIva012 = new JScrollPane(jTextAreanombre_completo_clienteSriFacturasProveedoresIva012);
		jscrollPanenombre_completo_clienteSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_completo_clienteSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_completo_clienteSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_completo_clienteSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonnombre_completo_clienteSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelruc_datoSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelruc_datoSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RUCDATO+" : *");
		this.jLabelruc_datoSriFacturasProveedoresIva012.setToolTipText("Ruc Dato");
		this.jLabelruc_datoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_datoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_datoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_datoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_datoSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_datoSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RUCDATO);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelruc_datoSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldruc_datoSriFacturasProveedoresIva012= new JTextFieldMe();

		jTextFieldruc_datoSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldruc_datoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_datoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_datoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_datoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_datoSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonruc_datoSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_datoSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_datoSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_datoSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonruc_datoSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_datoSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_datoSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_datoSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_datoSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_datoSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_datoSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelnumero_documentoSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelnumero_documentoSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NUMERODOCUMENTO+" : *");
		this.jLabelnumero_documentoSriFacturasProveedoresIva012.setToolTipText("Numero Documento");
		this.jLabelnumero_documentoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelnumero_documentoSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldnumero_documentoSriFacturasProveedoresIva012= new JTextFieldMe();

		jTextFieldnumero_documentoSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldnumero_documentoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonnumero_documentoSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonnumero_documentoSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelfecha_emisionSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionSriFacturasProveedoresIva012.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelfecha_emisionSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		//jFormattedTextFieldfecha_emisionSriFacturasProveedoresIva012= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionSriFacturasProveedoresIva012= new JDateChooser();
		jDateChooserfecha_emisionSriFacturasProveedoresIva012.setEnabled(false);
		jDateChooserfecha_emisionSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionSriFacturasProveedoresIva012.setDate(new Date());
		jDateChooserfecha_emisionSriFacturasProveedoresIva012.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionSriFacturasProveedoresIva012.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonfecha_emisionSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonfecha_emisionSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelfecha_registro_contableSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelfecha_registro_contableSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_FECHAREGISTROCONTABLE+" : *");
		this.jLabelfecha_registro_contableSriFacturasProveedoresIva012.setToolTipText("Fecha Registro Contable");
		this.jLabelfecha_registro_contableSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_registro_contableSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_registro_contableSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_registro_contableSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_registro_contableSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_registro_contableSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelfecha_registro_contableSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		//jFormattedTextFieldfecha_registro_contableSriFacturasProveedoresIva012= new JFormattedTextFieldMe();

		jDateChooserfecha_registro_contableSriFacturasProveedoresIva012= new JDateChooser();
		jDateChooserfecha_registro_contableSriFacturasProveedoresIva012.setEnabled(false);
		jDateChooserfecha_registro_contableSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_registro_contableSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_registro_contableSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_registro_contableSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_registro_contableSriFacturasProveedoresIva012.setDate(new Date());
		jDateChooserfecha_registro_contableSriFacturasProveedoresIva012.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_registro_contableSriFacturasProveedoresIva012.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_registro_contableSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonfecha_registro_contableSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_registro_contableSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_registro_contableSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_registro_contableSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonfecha_registro_contableSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_registro_contableSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_registro_contableSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_registro_contableSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_registro_contableSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_registro_contableSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_registro_contableSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelnumero_serieSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelnumero_serieSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NUMEROSERIE+" : *");
		this.jLabelnumero_serieSriFacturasProveedoresIva012.setToolTipText("Numero Serie");
		this.jLabelnumero_serieSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serieSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serieSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serieSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NUMEROSERIE);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelnumero_serieSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldnumero_serieSriFacturasProveedoresIva012= new JTextFieldMe();

		jTextFieldnumero_serieSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldnumero_serieSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serieSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_serieSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonnumero_serieSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serieSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonnumero_serieSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serieSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serieSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serieSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serieSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serieSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serieSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabeltotal_ivaSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaSriFacturasProveedoresIva012.setToolTipText("Total Iva");
		this.jLabeltotal_ivaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPaneltotal_ivaSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldtotal_ivaSriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldtotal_ivaSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldtotal_ivaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaSriFacturasProveedoresIva012.setText("0.0");

		this.jButtontotal_ivaSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtontotal_ivaSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtontotal_ivaSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabeltotal_sin_ivaSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaSriFacturasProveedoresIva012.setToolTipText("Total Sin Iva");
		this.jLabeltotal_sin_ivaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPaneltotal_sin_ivaSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012.setText("0.0");

		this.jButtontotal_sin_ivaSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtontotal_sin_ivaSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtontotal_sin_ivaSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabeltransfe_iva_retenidoSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabeltransfe_iva_retenidoSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_TRANSFEIVARETENIDO+" : *");
		this.jLabeltransfe_iva_retenidoSriFacturasProveedoresIva012.setToolTipText("Transfe Iva Reteno");
		this.jLabeltransfe_iva_retenidoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltransfe_iva_retenidoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltransfe_iva_retenidoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltransfe_iva_retenidoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltransfe_iva_retenidoSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltransfe_iva_retenidoSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_TRANSFEIVARETENIDO);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPaneltransfe_iva_retenidoSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012.setText("0.0");

		this.jButtontransfe_iva_retenidoSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtontransfe_iva_retenidoSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransfe_iva_retenidoSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransfe_iva_retenidoSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontransfe_iva_retenidoSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtontransfe_iva_retenidoSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontransfe_iva_retenidoSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontransfe_iva_retenidoSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"transfe_iva_retenidoSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontransfe_iva_retenidoSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelpresta_iva_retenidoSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelpresta_iva_retenidoSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_PRESTAIVARETENIDO+" : *");
		this.jLabelpresta_iva_retenidoSriFacturasProveedoresIva012.setToolTipText("Presta Iva Reteno");
		this.jLabelpresta_iva_retenidoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpresta_iva_retenidoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpresta_iva_retenidoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpresta_iva_retenidoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpresta_iva_retenidoSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpresta_iva_retenidoSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_PRESTAIVARETENIDO);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelpresta_iva_retenidoSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012.setText("0.0");

		this.jButtonpresta_iva_retenidoSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonpresta_iva_retenidoSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpresta_iva_retenidoSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpresta_iva_retenidoSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpresta_iva_retenidoSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonpresta_iva_retenidoSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpresta_iva_retenidoSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpresta_iva_retenidoSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"presta_iva_retenidoSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpresta_iva_retenidoSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTE1+" : *");
		this.jLabelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setToolTipText("Nombre Tipo Retencion Fuente1");
		this.jLabelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTE1);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012= new JTextAreaMe();
		jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setEnabled(false);
		jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setLineWrap(true);
		jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setWrapStyleWord(true);
		jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_retencion_fuente1SriFacturasProveedoresIva012 = new JScrollPane(jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012);
		jscrollPanenombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_retencion_fuente1SriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelret_fuente1_porcentajeSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelret_fuente1_porcentajeSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETFUENTE1PORCENTAJE+" : *");
		this.jLabelret_fuente1_porcentajeSriFacturasProveedoresIva012.setToolTipText("Ret Fuente1 Porcentaje");
		this.jLabelret_fuente1_porcentajeSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelret_fuente1_porcentajeSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelret_fuente1_porcentajeSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelret_fuente1_porcentajeSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_fuente1_porcentajeSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_fuente1_porcentajeSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETFUENTE1PORCENTAJE);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelret_fuente1_porcentajeSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012.setText("0.0");

		this.jButtonret_fuente1_porcentajeSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonret_fuente1_porcentajeSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente1_porcentajeSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente1_porcentajeSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_fuente1_porcentajeSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonret_fuente1_porcentajeSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_fuente1_porcentajeSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_fuente1_porcentajeSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_fuente1_porcentajeSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_fuente1_porcentajeSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelret_fuente1_retenidoSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelret_fuente1_retenidoSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETFUENTE1RETENIDO+" : *");
		this.jLabelret_fuente1_retenidoSriFacturasProveedoresIva012.setToolTipText("Ret Fuente1 Reteno");
		this.jLabelret_fuente1_retenidoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_fuente1_retenidoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_fuente1_retenidoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelret_fuente1_retenidoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_fuente1_retenidoSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_fuente1_retenidoSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETFUENTE1RETENIDO);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelret_fuente1_retenidoSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012.setText("0.0");

		this.jButtonret_fuente1_retenidoSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonret_fuente1_retenidoSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente1_retenidoSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente1_retenidoSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_fuente1_retenidoSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonret_fuente1_retenidoSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_fuente1_retenidoSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_fuente1_retenidoSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_fuente1_retenidoSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_fuente1_retenidoSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTE2+" : *");
		this.jLabelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setToolTipText("Nombre Tipo Retencion Fuente2");
		this.jLabelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTE2);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012= new JTextAreaMe();
		jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setEnabled(false);
		jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setLineWrap(true);
		jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setWrapStyleWord(true);
		jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_retencion_fuente2SriFacturasProveedoresIva012 = new JScrollPane(jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012);
		jscrollPanenombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_retencion_fuente2SriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelret_fuente2_porcentajeSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelret_fuente2_porcentajeSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETFUENTE2PORCENTAJE+" : *");
		this.jLabelret_fuente2_porcentajeSriFacturasProveedoresIva012.setToolTipText("Ret Fuente2 Porcentaje");
		this.jLabelret_fuente2_porcentajeSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelret_fuente2_porcentajeSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelret_fuente2_porcentajeSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelret_fuente2_porcentajeSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_fuente2_porcentajeSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_fuente2_porcentajeSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETFUENTE2PORCENTAJE);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelret_fuente2_porcentajeSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012.setText("0.0");

		this.jButtonret_fuente2_porcentajeSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonret_fuente2_porcentajeSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente2_porcentajeSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente2_porcentajeSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_fuente2_porcentajeSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonret_fuente2_porcentajeSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_fuente2_porcentajeSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_fuente2_porcentajeSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_fuente2_porcentajeSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_fuente2_porcentajeSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelret_fuente2_retenidoSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelret_fuente2_retenidoSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETFUENTE2RETENIDO+" : *");
		this.jLabelret_fuente2_retenidoSriFacturasProveedoresIva012.setToolTipText("Ret Fuente2 Reteno");
		this.jLabelret_fuente2_retenidoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_fuente2_retenidoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_fuente2_retenidoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelret_fuente2_retenidoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_fuente2_retenidoSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_fuente2_retenidoSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETFUENTE2RETENIDO);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelret_fuente2_retenidoSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012.setText("0.0");

		this.jButtonret_fuente2_retenidoSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonret_fuente2_retenidoSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente2_retenidoSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente2_retenidoSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_fuente2_retenidoSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonret_fuente2_retenidoSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_fuente2_retenidoSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_fuente2_retenidoSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_fuente2_retenidoSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_fuente2_retenidoSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPORETENCIONIVA1+" : *");
		this.jLabelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setToolTipText("Nombre Tipo Retencion Iva1");
		this.jLabelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPORETENCIONIVA1);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012= new JTextAreaMe();
		jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setEnabled(false);
		jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setLineWrap(true);
		jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setWrapStyleWord(true);
		jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_retencion_iva1SriFacturasProveedoresIva012 = new JScrollPane(jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012);
		jscrollPanenombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_retencion_iva1SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_tipo_retencion_iva1SriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonnombre_tipo_retencion_iva1SriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_retencion_iva1SriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_retencion_iva1SriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_retencion_iva1SriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonnombre_tipo_retencion_iva1SriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_retencion_iva1SriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_retencion_iva1SriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_retencion_iva1SriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_retencion_iva1SriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_retencion_iva1SriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelret_iva_bien_porcentajeSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelret_iva_bien_porcentajeSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETIVABIENPORCENTAJE+" : *");
		this.jLabelret_iva_bien_porcentajeSriFacturasProveedoresIva012.setToolTipText("Ret Iva Bien Porcentaje");
		this.jLabelret_iva_bien_porcentajeSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelret_iva_bien_porcentajeSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelret_iva_bien_porcentajeSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelret_iva_bien_porcentajeSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_iva_bien_porcentajeSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_iva_bien_porcentajeSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETIVABIENPORCENTAJE);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelret_iva_bien_porcentajeSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012.setText("0.0");

		this.jButtonret_iva_bien_porcentajeSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonret_iva_bien_porcentajeSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_bien_porcentajeSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_bien_porcentajeSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_iva_bien_porcentajeSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonret_iva_bien_porcentajeSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_iva_bien_porcentajeSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_iva_bien_porcentajeSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_iva_bien_porcentajeSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_iva_bien_porcentajeSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelret_iva_bien_retenidoSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelret_iva_bien_retenidoSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETIVABIENRETENIDO+" : *");
		this.jLabelret_iva_bien_retenidoSriFacturasProveedoresIva012.setToolTipText("Ret Iva Bien Reteno");
		this.jLabelret_iva_bien_retenidoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_iva_bien_retenidoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_iva_bien_retenidoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelret_iva_bien_retenidoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_iva_bien_retenidoSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_iva_bien_retenidoSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETIVABIENRETENIDO);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelret_iva_bien_retenidoSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012.setText("0.0");

		this.jButtonret_iva_bien_retenidoSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonret_iva_bien_retenidoSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_bien_retenidoSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_bien_retenidoSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_iva_bien_retenidoSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonret_iva_bien_retenidoSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_iva_bien_retenidoSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_iva_bien_retenidoSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_iva_bien_retenidoSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_iva_bien_retenidoSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPORETENCIONIVA2+" : *");
		this.jLabelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setToolTipText("Nombre Tipo Retencion Iva2");
		this.jLabelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_NOMBRETIPORETENCIONIVA2);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012= new JTextAreaMe();
		jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setEnabled(false);
		jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setLineWrap(true);
		jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setWrapStyleWord(true);
		jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_retencion_iva2SriFacturasProveedoresIva012 = new JScrollPane(jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012);
		jscrollPanenombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_tipo_retencion_iva2SriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_tipo_retencion_iva2SriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonnombre_tipo_retencion_iva2SriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_retencion_iva2SriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_retencion_iva2SriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_retencion_iva2SriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonnombre_tipo_retencion_iva2SriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_retencion_iva2SriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_retencion_iva2SriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_retencion_iva2SriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_retencion_iva2SriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_retencion_iva2SriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelret_iva_servicio_porcentajeSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelret_iva_servicio_porcentajeSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETIVASERVICIOPORCENTAJE+" : *");
		this.jLabelret_iva_servicio_porcentajeSriFacturasProveedoresIva012.setToolTipText("Ret Iva Servicio Porcentaje");
		this.jLabelret_iva_servicio_porcentajeSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelret_iva_servicio_porcentajeSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelret_iva_servicio_porcentajeSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelret_iva_servicio_porcentajeSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_iva_servicio_porcentajeSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_iva_servicio_porcentajeSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETIVASERVICIOPORCENTAJE);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelret_iva_servicio_porcentajeSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012.setText("0.0");

		this.jButtonret_iva_servicio_porcentajeSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonret_iva_servicio_porcentajeSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_servicio_porcentajeSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_servicio_porcentajeSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_iva_servicio_porcentajeSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonret_iva_servicio_porcentajeSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_iva_servicio_porcentajeSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_iva_servicio_porcentajeSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_iva_servicio_porcentajeSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_iva_servicio_porcentajeSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


					
		this.jLabelret_iva_servicio_retenidoSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelret_iva_servicio_retenidoSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETIVASERVICIORETENIDO+" : *");
		this.jLabelret_iva_servicio_retenidoSriFacturasProveedoresIva012.setToolTipText("Ret Iva Servicio Reteno");
		this.jLabelret_iva_servicio_retenidoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelret_iva_servicio_retenidoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelret_iva_servicio_retenidoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelret_iva_servicio_retenidoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_iva_servicio_retenidoSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_iva_servicio_retenidoSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_RETIVASERVICIORETENIDO);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelret_iva_servicio_retenidoSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012= new JTextFieldMe();
		jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012.setEnabled(false);
		jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012.setText("0.0");

		this.jButtonret_iva_servicio_retenidoSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonret_iva_servicio_retenidoSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_servicio_retenidoSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_servicio_retenidoSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_iva_servicio_retenidoSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonret_iva_servicio_retenidoSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_iva_servicio_retenidoSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_iva_servicio_retenidoSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_iva_servicio_retenidoSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_iva_servicio_retenidoSriFacturasProveedoresIva012Busqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSriFacturasProveedoresIva012() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelid_empresaSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSriFacturasProveedoresIva012.setToolTipText("Empresa");
		this.jLabelid_empresaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelid_empresaSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jComboBoxid_empresaSriFacturasProveedoresIva012= new JComboBoxMe();
		jComboBoxid_empresaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSriFacturasProveedoresIva012.setEnabled(false);

		this.jButtonid_empresaSriFacturasProveedoresIva012= new JButtonMe();
		this.jButtonid_empresaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSriFacturasProveedoresIva012.setText("Buscar");
		this.jButtonid_empresaSriFacturasProveedoresIva012.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSriFacturasProveedoresIva012.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSriFacturasProveedoresIva012,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSriFacturasProveedoresIva012"));

		this.jButtonid_empresaSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonid_empresaSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonid_empresaSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSriFacturasProveedoresIva012Busqueda.setVisible(false);		}

		this.jButtonid_empresaSriFacturasProveedoresIva012Update= new JButtonMe();
		this.jButtonid_empresaSriFacturasProveedoresIva012Update.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriFacturasProveedoresIva012Update.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSriFacturasProveedoresIva012Update.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSriFacturasProveedoresIva012Update.setText("U");
		this.jButtonid_empresaSriFacturasProveedoresIva012Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSriFacturasProveedoresIva012Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSriFacturasProveedoresIva012Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSriFacturasProveedoresIva012Update"));



					
		this.jLabelid_periodo_declaraSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelid_periodo_declaraSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDPERIODODECLARA+" : *");
		this.jLabelid_periodo_declaraSriFacturasProveedoresIva012.setToolTipText("Periodo Declara");
		this.jLabelid_periodo_declaraSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodo_declaraSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodo_declaraSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDPERIODODECLARA);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelid_periodo_declaraSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jComboBoxid_periodo_declaraSriFacturasProveedoresIva012= new JComboBoxMe();
		jComboBoxid_periodo_declaraSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012= new JButtonMe();
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012.setText("Buscar");
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraSriFacturasProveedoresIva012,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodo_declaraSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraSriFacturasProveedoresIva012"));

		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodo_declaraSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Busqueda.setVisible(false);		}

		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Update= new JButtonMe();
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Update.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Update.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Update.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Update.setText("U");
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraSriFacturasProveedoresIva012Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodo_declaraSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraSriFacturasProveedoresIva012Update"));



					
		this.jLabelid_tipo_ivaSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelid_tipo_ivaSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDTIPOIVA+" : *");
		this.jLabelid_tipo_ivaSriFacturasProveedoresIva012.setToolTipText("Tipo Iva");
		this.jLabelid_tipo_ivaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ivaSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_ivaSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_ivaSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDTIPOIVA);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelid_tipo_ivaSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jComboBoxid_tipo_ivaSriFacturasProveedoresIva012= new JComboBoxMe();
		jComboBoxid_tipo_ivaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ivaSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012= new JButtonMe();
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012.setText("Buscar");
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaSriFacturasProveedoresIva012,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_ivaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaSriFacturasProveedoresIva012"));

		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_ivaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Busqueda.setVisible(false);		}

		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Update= new JButtonMe();
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Update.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Update.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Update.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Update.setText("U");
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaSriFacturasProveedoresIva012Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_ivaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaSriFacturasProveedoresIva012Update"));



					
		this.jLabelid_tipo_retencion_ivaSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelid_tipo_retencion_ivaSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDTIPORETENCIONIVA+" : *");
		this.jLabelid_tipo_retencion_ivaSriFacturasProveedoresIva012.setToolTipText("Tipo Retencion Iva");
		this.jLabelid_tipo_retencion_ivaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_ivaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_ivaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_ivaSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_ivaSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_ivaSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDTIPORETENCIONIVA);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelid_tipo_retencion_ivaSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012= new JComboBoxMe();
		jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012.setText("Buscar");
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaSriFacturasProveedoresIva012"));

		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Busqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Update= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Update.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Update.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Update.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Update.setText("U");
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaSriFacturasProveedoresIva012Update"));



					
		this.jLabelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012 = new JLabelMe();
		this.jLabelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setText(""+SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA+" : *");
		this.jLabelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setToolTipText("Tipo Retencion Iva Presta");
		this.jLabelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setToolTipText(SriFacturasProveedoresIva012ConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA);
		this.gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		this.jPanelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setLayout(this.gridaBagLayoutSriFacturasProveedoresIva012);


		jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setText("Buscar");
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_prestaSriFacturasProveedoresIva012"));

		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Busqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Busqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Busqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Busqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Busqueda.setText("U");
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Busqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Busqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Busqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Busqueda"));

		if(this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Busqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Update= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Update.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Update.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Update.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Update.setText("U");
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Update.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Update.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Update,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Update"));



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
		//this.jInternalFrameDetalleSriFacturasProveedoresIva012 = new SriFacturasProveedoresIva012BeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Sri Facturas Proveedores Iva012 DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSriFacturasProveedoresIva012= new GridBagLayout();
		

		
		String sToolTipSriFacturasProveedoresIva012="";
		sToolTipSriFacturasProveedoresIva012=SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSriFacturasProveedoresIva012+="(Sris.SriFacturasProveedoresIva012)";
		}
		
		if(!this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado()) {
			sToolTipSriFacturasProveedoresIva012+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonModificarSriFacturasProveedoresIva012 = new JButtonMe();
        this.jButtonActualizarSriFacturasProveedoresIva012 = new JButtonMe();
        this.jButtonEliminarSriFacturasProveedoresIva012 = new JButtonMe();
        this.jButtonCancelarSriFacturasProveedoresIva012 = new JButtonMe();
        this.jButtonGuardarCambiosSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012 = new JButtonMe();
		this.jButtonCerrarSriFacturasProveedoresIva012 = new JButtonMe();
		
		this.jScrollPanelDatosSriFacturasProveedoresIva012 = new JScrollPane();   
        this.jScrollPanelDatosEdicionSriFacturasProveedoresIva012 = new JScrollPane();
		this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012 = new JScrollPane();
				
		
		
		this.jPanelCamposSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Sri Facturas Proveedores Iva012";
		
		if(!this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sri Facturas Proveedores Iva012es" + this.sPath));
		} else {
			this.jScrollPanelDatosSriFacturasProveedoresIva012.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSriFacturasProveedoresIva012.setName("jPanelCamposSriFacturasProveedoresIva012"); 

		this.jPanelCamposOcultosSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSriFacturasProveedoresIva012.setName("jPanelCamposOcultosSriFacturasProveedoresIva012"); 

        this.jPanelAccionesSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSriFacturasProveedoresIva012.setToolTipText("Acciones");
        this.jPanelAccionesSriFacturasProveedoresIva012.setName("Acciones"); 

		this.jPanelAccionesFormularioSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSriFacturasProveedoresIva012.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSriFacturasProveedoresIva012.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSriFacturasProveedoresIva012.setText("Nuevo");
		this.jButtonModificarSriFacturasProveedoresIva012.setText("Editar");
        this.jButtonActualizarSriFacturasProveedoresIva012.setText("Actualizar");
        this.jButtonEliminarSriFacturasProveedoresIva012.setText("Eliminar");
        this.jButtonCancelarSriFacturasProveedoresIva012.setText("Cancelar");
        this.jButtonGuardarCambiosSriFacturasProveedoresIva012.setText("Guardar");
		this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012.setText("Guardar");
		this.jButtonCerrarSriFacturasProveedoresIva012.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSriFacturasProveedoresIva012,"nuevo_button","Nuevo",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSriFacturasProveedoresIva012,"modificar_button","Editar",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSriFacturasProveedoresIva012,"actualizar_button","Actualizar",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSriFacturasProveedoresIva012,"eliminar_button","Eliminar",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSriFacturasProveedoresIva012,"cancelar_button","Cancelar",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSriFacturasProveedoresIva012,"guardarcambios_button","Guardar",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012,"guardarcambiostabla_button","Guardar",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSriFacturasProveedoresIva012,"cerrar_button","Salir",this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSriFacturasProveedoresIva012.setToolTipText("Nuevo"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSriFacturasProveedoresIva012.setToolTipText("Editar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSriFacturasProveedoresIva012.setToolTipText("Actualizar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSriFacturasProveedoresIva012.setToolTipText("Eliminar)"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSriFacturasProveedoresIva012.setToolTipText("Cancelar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSriFacturasProveedoresIva012.setToolTipText("Guardar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012.setToolTipText("Guardar"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSriFacturasProveedoresIva012.setToolTipText("Salir"+" "+SriFacturasProveedoresIva012ConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSriFacturasProveedoresIva012";
		inputMap = this.jButtonNuevoSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSriFacturasProveedoresIva012.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSriFacturasProveedoresIva012"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSriFacturasProveedoresIva012";
		inputMap = this.jButtonActualizarSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSriFacturasProveedoresIva012"));
		
		//ELIMINAR
		sMapKey = "EliminarSriFacturasProveedoresIva012";
		inputMap = this.jButtonEliminarSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSriFacturasProveedoresIva012"));
		
		//CANCELAR	
		sMapKey = "CancelarSriFacturasProveedoresIva012";
		inputMap = this.jButtonCancelarSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSriFacturasProveedoresIva012"));
		
		//CERRAR		
		sMapKey = "CerrarSriFacturasProveedoresIva012";
		inputMap = this.jButtonCerrarSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSriFacturasProveedoresIva012"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSriFacturasProveedoresIva012";
		inputMap = this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSriFacturasProveedoresIva012.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSriFacturasProveedoresIva012"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSriFacturasProveedoresIva012 = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSriFacturasProveedoresIva012.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSriFacturasProveedoresIva012.setToolTipText("Nuevo SriFacturasProveedoresIva012");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSriFacturasProveedoresIva012 = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSriFacturasProveedoresIva012.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSriFacturasProveedoresIva012.setToolTipText("Sin Cerrar Ventana SriFacturasProveedoresIva012");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSriFacturasProveedoresIva012 = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSriFacturasProveedoresIva012.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSriFacturasProveedoresIva012.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012 = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSriFacturasProveedoresIva012.setText("Accion");
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012 = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSriFacturasProveedoresIva012 = new JLabelMe();
		
		this.jLabelAccionesSriFacturasProveedoresIva012.setText("Acciones");		
		this.jLabelAccionesSriFacturasProveedoresIva012.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriFacturasProveedoresIva012.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSriFacturasProveedoresIva012.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSriFacturasProveedoresIva012();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSriFacturasProveedoresIva012();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSriFacturasProveedoresIva012=new JTabbedPane();
		this.jTabbedPaneRelacionesSriFacturasProveedoresIva012.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSriFacturasProveedoresIva012,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSriFacturasProveedoresIva012.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSriFacturasProveedoresIva012 = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSriFacturasProveedoresIva012 = new GridBagLayout();
		
		this.jPanelCamposSriFacturasProveedoresIva012.setLayout(gridaBagLayoutCamposSriFacturasProveedoresIva012);
		this.jPanelCamposOcultosSriFacturasProveedoresIva012.setLayout(gridaBagLayoutCamposOcultosSriFacturasProveedoresIva012);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSriFacturasProveedoresIva012.add(jLabelIdSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSriFacturasProveedoresIva012.add(jLabelidSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSriFacturasProveedoresIva012.add(jLabelid_empresaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSriFacturasProveedoresIva012.add(jButtonid_empresaSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 3;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSriFacturasProveedoresIva012.add(jButtonid_empresaSriFacturasProveedoresIva012Update, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSriFacturasProveedoresIva012.add(jComboBoxid_empresaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodo_declaraSriFacturasProveedoresIva012.add(jLabelid_periodo_declaraSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraSriFacturasProveedoresIva012.add(jButtonid_periodo_declaraSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 3;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraSriFacturasProveedoresIva012.add(jButtonid_periodo_declaraSriFacturasProveedoresIva012Update, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodo_declaraSriFacturasProveedoresIva012.add(jComboBoxid_periodo_declaraSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucSriFacturasProveedoresIva012.add(jLabelrucSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucSriFacturasProveedoresIva012.add(jButtonrucSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucSriFacturasProveedoresIva012.add(jTextFieldrucSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_comprobanteSriFacturasProveedoresIva012.add(jLabelnombre_tipo_comprobanteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_comprobanteSriFacturasProveedoresIva012.add(jButtonnombre_tipo_comprobanteSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_comprobanteSriFacturasProveedoresIva012.add(jscrollPanenombre_tipo_comprobanteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteSriFacturasProveedoresIva012.add(jLabelnombre_completo_clienteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteSriFacturasProveedoresIva012.add(jButtonnombre_completo_clienteSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteSriFacturasProveedoresIva012.add(jscrollPanenombre_completo_clienteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_datoSriFacturasProveedoresIva012.add(jLabelruc_datoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_datoSriFacturasProveedoresIva012.add(jButtonruc_datoSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_datoSriFacturasProveedoresIva012.add(jTextFieldruc_datoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documentoSriFacturasProveedoresIva012.add(jLabelnumero_documentoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoSriFacturasProveedoresIva012.add(jButtonnumero_documentoSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documentoSriFacturasProveedoresIva012.add(jTextFieldnumero_documentoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionSriFacturasProveedoresIva012.add(jLabelfecha_emisionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionSriFacturasProveedoresIva012.add(jButtonfecha_emisionSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionSriFacturasProveedoresIva012.add(jDateChooserfecha_emisionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_registro_contableSriFacturasProveedoresIva012.add(jLabelfecha_registro_contableSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_registro_contableSriFacturasProveedoresIva012.add(jButtonfecha_registro_contableSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_registro_contableSriFacturasProveedoresIva012.add(jDateChooserfecha_registro_contableSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_serieSriFacturasProveedoresIva012.add(jLabelnumero_serieSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serieSriFacturasProveedoresIva012.add(jButtonnumero_serieSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_serieSriFacturasProveedoresIva012.add(jTextFieldnumero_serieSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaSriFacturasProveedoresIva012.add(jLabeltotal_ivaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaSriFacturasProveedoresIva012.add(jButtontotal_ivaSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaSriFacturasProveedoresIva012.add(jTextFieldtotal_ivaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaSriFacturasProveedoresIva012.add(jLabeltotal_sin_ivaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaSriFacturasProveedoresIva012.add(jButtontotal_sin_ivaSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaSriFacturasProveedoresIva012.add(jTextFieldtotal_sin_ivaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_ivaSriFacturasProveedoresIva012.add(jLabelid_tipo_ivaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaSriFacturasProveedoresIva012.add(jButtonid_tipo_ivaSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 3;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaSriFacturasProveedoresIva012.add(jButtonid_tipo_ivaSriFacturasProveedoresIva012Update, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_ivaSriFacturasProveedoresIva012.add(jComboBoxid_tipo_ivaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_ivaSriFacturasProveedoresIva012.add(jLabelid_tipo_retencion_ivaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_ivaSriFacturasProveedoresIva012.add(jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 3;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_ivaSriFacturasProveedoresIva012.add(jButtonid_tipo_retencion_ivaSriFacturasProveedoresIva012Update, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_ivaSriFacturasProveedoresIva012.add(jComboBoxid_tipo_retencion_ivaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltransfe_iva_retenidoSriFacturasProveedoresIva012.add(jLabeltransfe_iva_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPaneltransfe_iva_retenidoSriFacturasProveedoresIva012.add(jButtontransfe_iva_retenidoSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltransfe_iva_retenidoSriFacturasProveedoresIva012.add(jTextFieldtransfe_iva_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.add(jLabelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.add(jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 3;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.add(jButtonid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012Update, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012.add(jComboBoxid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpresta_iva_retenidoSriFacturasProveedoresIva012.add(jLabelpresta_iva_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelpresta_iva_retenidoSriFacturasProveedoresIva012.add(jButtonpresta_iva_retenidoSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpresta_iva_retenidoSriFacturasProveedoresIva012.add(jTextFieldpresta_iva_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.add(jLabelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.add(jButtonnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012.add(jscrollPanenombre_tipo_retencion_fuente1SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelret_fuente1_porcentajeSriFacturasProveedoresIva012.add(jLabelret_fuente1_porcentajeSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_fuente1_porcentajeSriFacturasProveedoresIva012.add(jButtonret_fuente1_porcentajeSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelret_fuente1_porcentajeSriFacturasProveedoresIva012.add(jTextFieldret_fuente1_porcentajeSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelret_fuente1_retenidoSriFacturasProveedoresIva012.add(jLabelret_fuente1_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_fuente1_retenidoSriFacturasProveedoresIva012.add(jButtonret_fuente1_retenidoSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelret_fuente1_retenidoSriFacturasProveedoresIva012.add(jTextFieldret_fuente1_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.add(jLabelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.add(jButtonnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012.add(jscrollPanenombre_tipo_retencion_fuente2SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelret_fuente2_porcentajeSriFacturasProveedoresIva012.add(jLabelret_fuente2_porcentajeSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_fuente2_porcentajeSriFacturasProveedoresIva012.add(jButtonret_fuente2_porcentajeSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelret_fuente2_porcentajeSriFacturasProveedoresIva012.add(jTextFieldret_fuente2_porcentajeSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelret_fuente2_retenidoSriFacturasProveedoresIva012.add(jLabelret_fuente2_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_fuente2_retenidoSriFacturasProveedoresIva012.add(jButtonret_fuente2_retenidoSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelret_fuente2_retenidoSriFacturasProveedoresIva012.add(jTextFieldret_fuente2_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012.add(jLabelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012.add(jButtonnombre_tipo_retencion_iva1SriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012.add(jscrollPanenombre_tipo_retencion_iva1SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelret_iva_bien_porcentajeSriFacturasProveedoresIva012.add(jLabelret_iva_bien_porcentajeSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_iva_bien_porcentajeSriFacturasProveedoresIva012.add(jButtonret_iva_bien_porcentajeSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelret_iva_bien_porcentajeSriFacturasProveedoresIva012.add(jTextFieldret_iva_bien_porcentajeSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelret_iva_bien_retenidoSriFacturasProveedoresIva012.add(jLabelret_iva_bien_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_iva_bien_retenidoSriFacturasProveedoresIva012.add(jButtonret_iva_bien_retenidoSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelret_iva_bien_retenidoSriFacturasProveedoresIva012.add(jTextFieldret_iva_bien_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012.add(jLabelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012.add(jButtonnombre_tipo_retencion_iva2SriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012.add(jscrollPanenombre_tipo_retencion_iva2SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelret_iva_servicio_porcentajeSriFacturasProveedoresIva012.add(jLabelret_iva_servicio_porcentajeSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_iva_servicio_porcentajeSriFacturasProveedoresIva012.add(jButtonret_iva_servicio_porcentajeSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelret_iva_servicio_porcentajeSriFacturasProveedoresIva012.add(jTextFieldret_iva_servicio_porcentajeSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelret_iva_servicio_retenidoSriFacturasProveedoresIva012.add(jLabelret_iva_servicio_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		//this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 2;
		this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_iva_servicio_retenidoSriFacturasProveedoresIva012.add(jButtonret_iva_servicio_retenidoSriFacturasProveedoresIva012Busqueda, this.gridBagConstraintsSriFacturasProveedoresIva012);
	}

	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 1;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelret_iva_servicio_retenidoSriFacturasProveedoresIva012.add(jTextFieldret_iva_servicio_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelidSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelid_periodo_declaraSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelrucSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelnombre_tipo_comprobanteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelnombre_completo_clienteSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelruc_datoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelnumero_documentoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelfecha_emisionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelfecha_registro_contableSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelnumero_serieSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPaneltotal_ivaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPaneltotal_sin_ivaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelid_tipo_ivaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelid_tipo_retencion_ivaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPaneltransfe_iva_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelid_tipo_retencion_iva_prestaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelpresta_iva_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelnombre_tipo_retencion_fuente1SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelret_fuente1_porcentajeSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelret_fuente1_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelnombre_tipo_retencion_fuente2SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelret_fuente2_porcentajeSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelret_fuente2_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelnombre_tipo_retencion_iva1SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelret_iva_bien_porcentajeSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelret_iva_bien_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelnombre_tipo_retencion_iva2SriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelret_iva_servicio_porcentajeSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSriFacturasProveedoresIva012.add(this.jPanelret_iva_servicio_retenidoSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposSriFacturasProveedoresIva012=0;
		iYPanelCamposSriFacturasProveedoresIva012++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iYPanelCamposOcultosSriFacturasProveedoresIva012;
	this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iXPanelCamposOcultosSriFacturasProveedoresIva012++;
	this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSriFacturasProveedoresIva012.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSriFacturasProveedoresIva012.add(this.jPanelid_empresaSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);



	if(iXPanelCamposOcultosSriFacturasProveedoresIva012 % 3==0) {
		iXPanelCamposOcultosSriFacturasProveedoresIva012=0;
		iYPanelCamposOcultosSriFacturasProveedoresIva012++;
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
			
		GridBagLayout gridaBagLayoutAccionesSriFacturasProveedoresIva012= new GridBagLayout();
		this.jPanelAccionesSriFacturasProveedoresIva012.setLayout(gridaBagLayoutAccionesSriFacturasProveedoresIva012);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSriFacturasProveedoresIva012= new GridBagLayout();
		this.jPanelAccionesFormularioSriFacturasProveedoresIva012.setLayout(gridaBagLayoutAccionesFormularioSriFacturasProveedoresIva012);
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSriFacturasProveedoresIva012.add(this.jComboBoxTiposAccionesFormularioSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXAccion++;
			
		this.jPanelAccionesSriFacturasProveedoresIva012.add(this.jButtonModificarSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);							

		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iPosXAccion++;
			
		this.jPanelAccionesSriFacturasProveedoresIva012.add(this.jButtonEliminarSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
			
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXAccion++;
		
		this.jPanelAccionesSriFacturasProveedoresIva012.add(this.jButtonActualizarSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);


		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = iPosXAccion++;
		
		this.jPanelAccionesSriFacturasProveedoresIva012.add(this.jButtonGuardarCambiosSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);	
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = 0;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =iPosXAccion++;
		
		this.jPanelAccionesSriFacturasProveedoresIva012.add(this.jButtonCancelarSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSriFacturasProveedoresIva012 = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSriFacturasProveedoresIva012);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.srifacturasproveedoresiva012SessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();						
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;		
			//this.gridBagConstraintsSriFacturasProveedoresIva012.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSriFacturasProveedoresIva012.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =0;
		this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSriFacturasProveedoresIva012.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SriFacturasProveedoresIva012JInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSriFacturasProveedoresIva012 = new SriFacturasProveedoresIva012BeanSwingJInternalFrameAdditional();//JInternalFrameBase("Sri Facturas Proveedores Iva012 DATOS");
			
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
			
	        //this.setTitle("[FOR] - Sri Facturas Proveedores Iva012 DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sri Facturas Proveedores Iva012 Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SriFacturasProveedoresIva012Model srifacturasproveedoresiva012Model=new SriFacturasProveedoresIva012Model(this);
			
			//SI USARA CLASE INTERNA
			//SriFacturasProveedoresIva012Model.SriFacturasProveedoresIva012FocusTraversalPolicy srifacturasproveedoresiva012FocusTraversalPolicy = srifacturasproveedoresiva012Model.new SriFacturasProveedoresIva012FocusTraversalPolicy(this);
			
			//srifacturasproveedoresiva012FocusTraversalPolicy.setsrifacturasproveedoresiva012JInternalFrame(this);
			
			this.setFocusTraversalPolicy(srifacturasproveedoresiva012Model);
			
			
			this.jContentPaneDetalleSriFacturasProveedoresIva012 = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSriFacturasProveedoresIva012 = new GridBagLayout();	
			this.jContentPaneDetalleSriFacturasProveedoresIva012.setLayout(gridaBagLayoutDetalleSriFacturasProveedoresIva012);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSriFacturasProveedoresIva012 = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
				this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
					
				
				this.jContentPaneDetalleSriFacturasProveedoresIva012.add(jTtoolBarDetalleSriFacturasProveedoresIva012, gridBagConstraintsSriFacturasProveedoresIva012);								
				
}
			
			this.jScrollPanelDatosEdicionSriFacturasProveedoresIva012=   new JScrollPane(jContentPaneDetalleSriFacturasProveedoresIva012,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	        
			this.jContentPaneDetalleSriFacturasProveedoresIva012.add(jPanelCamposSriFacturasProveedoresIva012, gridBagConstraintsSriFacturasProveedoresIva012);
			
			
			
			
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
						//&& srifacturasproveedoresiva012SessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.srifacturasproveedoresiva012SessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSriFacturasProveedoresIva012= new GridBagConstraints();
						this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
						this.jContentPaneDetalleSriFacturasProveedoresIva012.add(this.jTabbedPaneRelacionesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSriFacturasProveedoresIva012.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSriFacturasProveedoresIva012.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
					this.gridBagConstraintsSriFacturasProveedoresIva012.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
					
				
					this.jContentPaneDetalleSriFacturasProveedoresIva012.add(jPanelCamposOcultosSriFacturasProveedoresIva012, gridBagConstraintsSriFacturasProveedoresIva012);
				
					this.jPanelCamposOcultosSriFacturasProveedoresIva012.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	        this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSriFacturasProveedoresIva012.add(this.jPanelAccionesFormularioSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);							
			
			
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
	        this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
	        
			
			this.jContentPaneDetalleSriFacturasProveedoresIva012.add(this.jPanelAccionesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSriFacturasProveedoresIva012);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSriFacturasProveedoresIva012=   new JScrollPane(this.jPanelCamposSriFacturasProveedoresIva012,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSriFacturasProveedoresIva012.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriFacturasProveedoresIva012.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSriFacturasProveedoresIva012.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
			this.gridBagConstraintsSriFacturasProveedoresIva012.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSriFacturasProveedoresIva012.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSriFacturasProveedoresIva012.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);			
			
			this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
			
			
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		
			
		this.gridBagConstraintsSriFacturasProveedoresIva012 = new GridBagConstraints();
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSriFacturasProveedoresIva012.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSriFacturasProveedoresIva012, this.gridBagConstraintsSriFacturasProveedoresIva012);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSriFacturasProveedoresIva012;//jContentPane;
		
		return jScrollPanelDatosEdicionSriFacturasProveedoresIva012;
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
