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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.TransaccionLocalConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class TransaccionLocalDetalleFormJInternalFrame extends TransaccionLocalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTransaccionLocal;
	
	protected JMenuBar jmenuBarDetalleTransaccionLocal;
	
	protected JMenu jmenuDetalleTransaccionLocal;
	protected JMenu jmenuDetalleArchivoTransaccionLocal;
	protected JMenu jmenuDetalleAccionesTransaccionLocal;
	protected JMenu jmenuDetalleDatosTransaccionLocal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccionLocal;	
	protected GridBagConstraints gridBagConstraintsTransaccionLocal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TransaccionLocalBeanSwingJInternalFrameAdditional jInternalFrameDetalleTransaccionLocal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_compra="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected TransaccionContaBeanSwingJInternalFrame transaccioncontaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionconta="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobante="";

	protected TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotributario="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";

	protected TipoRetencionIvaBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva="";

	protected TipoRetencionIvaBeanSwingJInternalFrame tiporetencionivaprestaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionivapresta="";
	
	public TransaccionLocalSessionBean transaccionlocalSessionBean;
	
	
	
	
	public CompraSessionBean compraSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public TransaccionContaSessionBean transaccioncontaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
	public TipoTributarioSessionBean tipotributarioSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	public TipoRetencionIvaSessionBean tiporetencionivaSessionBean;
	public TipoRetencionIvaSessionBean tiporetencionivaprestaSessionBean;	
	
	public TransaccionLocalLogic transaccionlocalLogic;
	
	public JScrollPane jScrollPanelDatosTransaccionLocal;
	public JScrollPane jScrollPanelDatosEdicionTransaccionLocal;
	public JScrollPane jScrollPanelDatosGeneralTransaccionLocal;
	
	protected JPanel jPanelCamposTransaccionLocal;    
	protected JPanel jPanelCamposOcultosTransaccionLocal;    	
	protected JPanel jPanelAccionesTransaccionLocal;
	protected JPanel jPanelAccionesFormularioTransaccionLocal;
    
	
	
	protected Integer iXPanelCamposTransaccionLocal=0;
	protected Integer iYPanelCamposTransaccionLocal=0;
	
	protected Integer iXPanelCamposOcultosTransaccionLocal=0;
	protected Integer iYPanelCamposOcultosTransaccionLocal=0;
	
	

	protected JPanel jPanelCamposIniciogeneralTransaccionLocal;
	protected Integer iXPanelCamposIniciogeneralTransaccionLocal=0;
	protected Integer iYPanelCamposIniciogeneralTransaccionLocal=0;

	protected JPanel jPanelCamposIniciovalores1TransaccionLocal;
	protected Integer iXPanelCamposIniciovalores1TransaccionLocal=0;
	protected Integer iYPanelCamposIniciovalores1TransaccionLocal=0;

	protected JPanel jPanelCamposIniciovalores2TransaccionLocal;
	protected Integer iXPanelCamposIniciovalores2TransaccionLocal=0;
	protected Integer iYPanelCamposIniciovalores2TransaccionLocal=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTransaccionLocal;
	public JButton jButtonModificarTransaccionLocal;
	public JButton jButtonActualizarTransaccionLocal;
    public JButton jButtonEliminarTransaccionLocal;
	public JButton jButtonCancelarTransaccionLocal;
    public JButton jButtonGuardarCambiosTransaccionLocal;
	public JButton jButtonGuardarCambiosTablaTransaccionLocal;
	protected JButton jButtonCerrarTransaccionLocal;
	
	
	protected JButton jButtonProcesarInformacionTransaccionLocal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTransaccionLocal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTransaccionLocal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTransaccionLocal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccionLocal;
	protected JButton jButtonModificarToolBarTransaccionLocal;
	protected JButton jButtonActualizarToolBarTransaccionLocal;
    protected JButton jButtonEliminarToolBarTransaccionLocal;
	protected JButton jButtonCancelarToolBarTransaccionLocal;
    protected JButton jButtonGuardarCambiosToolBarTransaccionLocal;
	protected JButton jButtonGuardarCambiosTablaToolBarTransaccionLocal;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccionLocal;
	protected JButton jButtonCerrarToolBarTransaccionLocal;
	
	protected JButton jButtonProcesarInformacionToolBarTransaccionLocal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccionLocal;
	protected JMenuItem jMenuItemModificarTransaccionLocal;
	protected JMenuItem jMenuItemActualizarTransaccionLocal;
    protected JMenuItem jMenuItemEliminarTransaccionLocal;
	protected JMenuItem jMenuItemCancelarTransaccionLocal;
    protected JMenuItem jMenuItemGuardarCambiosTransaccionLocal;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccionLocal;
	protected JMenuItem jMenuItemCerrarTransaccionLocal;
	protected JMenuItem jMenuItemDetalleCerrarTransaccionLocal;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccionLocal;
	
	protected JMenuItem jMenuItemProcesarInformacionTransaccionLocal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccionLocal;
	protected JMenuItem jMenuItemMostrarOcultarTransaccionLocal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccionLocal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccionLocal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccionLocal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTransaccionLocal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTransaccionLocal;
	public JLabel jLabelIdTransaccionLocal;
	public JLabel jLabelidTransaccionLocal;
	public JButton jButtonidTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelrucTransaccionLocal;
	public JLabel jLabelrucTransaccionLocal;
	public JTextField jTextFieldrucTransaccionLocal;
	public JButton jButtonrucTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelrazon_socialTransaccionLocal;
	public JLabel jLabelrazon_socialTransaccionLocal;
	public JTextArea jTextArearazon_socialTransaccionLocal;
	public JScrollPane jscrollPanerazon_socialTransaccionLocal;
	public JButton jButtonrazon_socialTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelidentificacionTransaccionLocal;
	public JLabel jLabelidentificacionTransaccionLocal;
	public JTextField jTextFieldidentificacionTransaccionLocal;
	public JButton jButtonidentificacionTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionTransaccionLocal;
	public JLabel jLabelfecha_emisionTransaccionLocal;
	//public JFormattedTextField jDateChooserfecha_emisionTransaccionLocal;

	public JDateChooser jDateChooserfecha_emisionTransaccionLocal;
	public JButton jButtonfecha_emisionTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelfecha_registro_contableTransaccionLocal;
	public JLabel jLabelfecha_registro_contableTransaccionLocal;
	//public JFormattedTextField jDateChooserfecha_registro_contableTransaccionLocal;

	public JDateChooser jDateChooserfecha_registro_contableTransaccionLocal;
	public JButton jButtonfecha_registro_contableTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialTransaccionLocal;
	public JLabel jLabelnumero_secuencialTransaccionLocal;
	public JTextField jTextFieldnumero_secuencialTransaccionLocal;
	public JButton jButtonnumero_secuencialTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelnumero_serieTransaccionLocal;
	public JLabel jLabelnumero_serieTransaccionLocal;
	public JTextField jTextFieldnumero_serieTransaccionLocal;
	public JButton jButtonnumero_serieTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizacionTransaccionLocal;
	public JLabel jLabelnumero_autorizacionTransaccionLocal;
	public JTextField jTextFieldnumero_autorizacionTransaccionLocal;
	public JButton jButtonnumero_autorizacionTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelfecha_caducidadTransaccionLocal;
	public JLabel jLabelfecha_caducidadTransaccionLocal;
	//public JFormattedTextField jDateChooserfecha_caducidadTransaccionLocal;

	public JDateChooser jDateChooserfecha_caducidadTransaccionLocal;
	public JButton jButtonfecha_caducidadTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documento_contableTransaccionLocal;
	public JLabel jLabelnumero_documento_contableTransaccionLocal;
	public JTextField jTextFieldnumero_documento_contableTransaccionLocal;
	public JButton jButtonnumero_documento_contableTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPaneles_riseTransaccionLocal;
	public JLabel jLabeles_riseTransaccionLocal;
	public JCheckBox jCheckBoxes_riseTransaccionLocal;
	public JButton jButtones_riseTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelbienes_ivaTransaccionLocal;
	public JLabel jLabelbienes_ivaTransaccionLocal;
	public JTextField jTextFieldbienes_ivaTransaccionLocal;
	public JButton jButtonbienes_ivaTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelbienes_sin_ivaTransaccionLocal;
	public JLabel jLabelbienes_sin_ivaTransaccionLocal;
	public JTextField jTextFieldbienes_sin_ivaTransaccionLocal;
	public JButton jButtonbienes_sin_ivaTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelservicios_ivaTransaccionLocal;
	public JLabel jLabelservicios_ivaTransaccionLocal;
	public JTextField jTextFieldservicios_ivaTransaccionLocal;
	public JButton jButtonservicios_ivaTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelservicios_sin_ivaTransaccionLocal;
	public JLabel jLabelservicios_sin_ivaTransaccionLocal;
	public JTextField jTextFieldservicios_sin_ivaTransaccionLocal;
	public JButton jButtonservicios_sin_ivaTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelmonto_ivaTransaccionLocal;
	public JLabel jLabelmonto_ivaTransaccionLocal;
	public JTextField jTextFieldmonto_ivaTransaccionLocal;
	public JButton jButtonmonto_ivaTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaTransaccionLocal;
	public JLabel jLabeltotal_ivaTransaccionLocal;
	public JTextField jTextFieldtotal_ivaTransaccionLocal;
	public JButton jButtontotal_ivaTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaTransaccionLocal;
	public JLabel jLabeltotal_sin_ivaTransaccionLocal;
	public JTextField jTextFieldtotal_sin_ivaTransaccionLocal;
	public JButton jButtontotal_sin_ivaTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelmonto_iceTransaccionLocal;
	public JLabel jLabelmonto_iceTransaccionLocal;
	public JTextField jTextFieldmonto_iceTransaccionLocal;
	public JButton jButtonmonto_iceTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPaneltransfe_iva_retenerTransaccionLocal;
	public JLabel jLabeltransfe_iva_retenerTransaccionLocal;
	public JTextField jTextFieldtransfe_iva_retenerTransaccionLocal;
	public JButton jButtontransfe_iva_retenerTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelpresta_iva_retenerTransaccionLocal;
	public JLabel jLabelpresta_iva_retenerTransaccionLocal;
	public JTextField jTextFieldpresta_iva_retenerTransaccionLocal;
	public JButton jButtonpresta_iva_retenerTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPaneltransfe_iva_retenidoTransaccionLocal;
	public JLabel jLabeltransfe_iva_retenidoTransaccionLocal;
	public JTextField jTextFieldtransfe_iva_retenidoTransaccionLocal;
	public JButton jButtontransfe_iva_retenidoTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelpresta_iva_retenidoTransaccionLocal;
	public JLabel jLabelpresta_iva_retenidoTransaccionLocal;
	public JTextField jTextFieldpresta_iva_retenidoTransaccionLocal;
	public JButton jButtonpresta_iva_retenidoTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelpermite_devolucionTransaccionLocal;
	public JLabel jLabelpermite_devolucionTransaccionLocal;
	public JCheckBox jCheckBoxpermite_devolucionTransaccionLocal;
	public JButton jButtonpermite_devolucionTransaccionLocalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_compraTransaccionLocal;
	public JLabel jLabelid_compraTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_compraTransaccionLocal;
	public JButton jButtonid_compraTransaccionLocal= new JButtonMe();
	public JButton jButtonid_compraTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_compraTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelid_periodo_declaraTransaccionLocal;
	public JLabel jLabelid_periodo_declaraTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraTransaccionLocal;
	public JButton jButtonid_periodo_declaraTransaccionLocal= new JButtonMe();
	public JButton jButtonid_periodo_declaraTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_contaTransaccionLocal;
	public JLabel jLabelid_transaccion_contaTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_contaTransaccionLocal;
	public JButton jButtonid_transaccion_contaTransaccionLocal= new JButtonMe();
	public JButton jButtonid_transaccion_contaTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_contaTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteTransaccionLocal;
	public JLabel jLabelid_clienteTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteTransaccionLocal;
	public JButton jButtonid_clienteTransaccionLocal= new JButtonMe();
	public JButton jButtonid_clienteTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_clienteTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_comprobanteTransaccionLocal;
	public JLabel jLabelid_tipo_comprobanteTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comprobanteTransaccionLocal;
	public JButton jButtonid_tipo_comprobanteTransaccionLocal= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_tributarioTransaccionLocal;
	public JLabel jLabelid_tipo_tributarioTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tributarioTransaccionLocal;
	public JButton jButtonid_tipo_tributarioTransaccionLocal= new JButtonMe();
	public JButton jButtonid_tipo_tributarioTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tributarioTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableTransaccionLocal;
	public JLabel jLabelid_asiento_contableTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableTransaccionLocal;
	public JButton jButtonid_asiento_contableTransaccionLocal= new JButtonMe();
	public JButton jButtonid_asiento_contableTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_ivaTransaccionLocal;
	public JLabel jLabelid_tipo_ivaTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ivaTransaccionLocal;
	public JButton jButtonid_tipo_ivaTransaccionLocal= new JButtonMe();
	public JButton jButtonid_tipo_ivaTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ivaTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_ivaTransaccionLocal;
	public JLabel jLabelid_tipo_retencion_ivaTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_ivaTransaccionLocal;
	public JButton jButtonid_tipo_retencion_ivaTransaccionLocal= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaTransaccionLocalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_iva_prestaTransaccionLocal;
	public JLabel jLabelid_tipo_retencion_iva_prestaTransaccionLocal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal;
	public JButton jButtonid_tipo_retencion_iva_prestaTransaccionLocal= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_prestaTransaccionLocalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva_prestaTransaccionLocalBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTransaccionLocal;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1350;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightFormulario=627;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TransaccionLocalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTransaccionLocal=new JPanel();
				this.jPanelAccionesFormularioTransaccionLocal=new JPanel();
				this.jmenuBarDetalleTransaccionLocal=new JMenuBar();
				this.jTtoolBarDetalleTransaccionLocal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionLocalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TransaccionLocal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TransaccionLocalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TransaccionLocal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionLocalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionLocal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionLocalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionLocal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionLocalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransaccionLocal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTransaccionLocal() {
		return this.jButtonActualizarToolBarTransaccionLocal;
	}
	
	public JButton getjButtonEliminarToolBarTransaccionLocal() {
		return this.jButtonEliminarToolBarTransaccionLocal;
	}
	
	public JButton getjButtonCancelarToolBarTransaccionLocal() {
		return this.jButtonCancelarToolBarTransaccionLocal;
	}		
	
	public JButton getjButtonProcesarInformacionTransaccionLocal() {
		return this.jButtonProcesarInformacionTransaccionLocal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccionLocal)	{
		this.jButtonProcesarInformacionTransaccionLocal = jButtonProcesarInformacionTransaccionLocal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccionLocal() {
		return this.jComboBoxTiposAccionesTransaccionLocal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccionLocal(
			JComboBox jComboBoxTiposRelacionesTransaccionLocal) {
		this.jComboBoxTiposRelacionesTransaccionLocal = jComboBoxTiposRelacionesTransaccionLocal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccionLocal(
			JComboBox jComboBoxTiposAccionesTransaccionLocal) {
		this.jComboBoxTiposAccionesTransaccionLocal = jComboBoxTiposAccionesTransaccionLocal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTransaccionLocal() {
		return this.jComboBoxTiposAccionesFormularioTransaccionLocal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTransaccionLocal(
			JComboBox jComboBoxTiposAccionesFormularioTransaccionLocal) {
		this.jComboBoxTiposAccionesFormularioTransaccionLocal = jComboBoxTiposAccionesFormularioTransaccionLocal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		
		this.transaccionlocalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccionlocalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccionlocalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionLocalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transaccion Local MANTENIMIENTO"));
		
		
		if(iWidth > 3450) {
			iWidth=3450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
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
	
		TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransaccionLocal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTransaccionLocal=new JButtonMe();
				this.jButtonModificarToolBarTransaccionLocal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTransaccionLocal,this.jTtoolBarDetalleTransaccionLocal,
							"actualizar","actualizar","Actualizar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTransaccionLocal,this.jTtoolBarDetalleTransaccionLocal,
							"eliminar","eliminar","Eliminar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTransaccionLocal,this.jTtoolBarDetalleTransaccionLocal,
							"cancelar","cancelar","Cancelar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTransaccionLocal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTransaccionLocal,this.jTtoolBarDetalleTransaccionLocal,
							"guardarcambios","guardarcambios","Guardar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTransaccionLocal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTransaccionLocal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTransaccionLocal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTransaccionLocal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTransaccionLocal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccionLocal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccionLocal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccionLocal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTransaccionLocal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTransaccionLocal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTransaccionLocal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTransaccionLocal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTransaccionLocal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTransaccionLocal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTransaccionLocal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTransaccionLocal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTransaccionLocal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTransaccionLocal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTransaccionLocal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTransaccionLocal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTransaccionLocal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccionLocal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccionLocal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccionLocal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccionLocal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccionLocal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTransaccionLocal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTransaccionLocal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTransaccionLocal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccionLocal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccionLocal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccionLocal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccionLocal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccionLocal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccionLocal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTransaccionLocal.add(this.jMenuItemDetalleCerrarTransaccionLocal);
		
		this.jmenuDetalleAccionesTransaccionLocal.add(this.jMenuItemActualizarTransaccionLocal);
		this.jmenuDetalleAccionesTransaccionLocal.add(this.jMenuItemEliminarTransaccionLocal);
		this.jmenuDetalleAccionesTransaccionLocal.add(this.jMenuItemCancelarTransaccionLocal);		
		
		//this.jmenuDetalleDatosTransaccionLocal.add(this.jMenuItemDetalleAbrirOrderByTransaccionLocal);				
		this.jmenuDetalleDatosTransaccionLocal.add(this.jMenuItemDetalleMostarOcultarTransaccionLocal);				
				
		//this.jmenuDetalleAccionesTransaccionLocal.add(this.jMenuItemGuardarCambiosTransaccionLocal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTransaccionLocal.add(this.jmenuDetalleArchivoTransaccionLocal);		
		this.jmenuBarDetalleTransaccionLocal.add(this.jmenuDetalleAccionesTransaccionLocal);		
		this.jmenuBarDetalleTransaccionLocal.add(this.jmenuDetalleDatosTransaccionLocal);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTransaccionLocal);				
	}
	
	
	public void inicializarElementosCamposTransaccionLocal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTransaccionLocal = new JLabelMe();
		jLabelIdTransaccionLocal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTransaccionLocal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTransaccionLocal= new GridBagLayout();

		this.jPanelidTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);

		jLabelidTransaccionLocal = new JLabel();
		jLabelidTransaccionLocal.setText("Id");

		jLabelidTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelrucTransaccionLocal = new JLabelMe();
		this.jLabelrucTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_RUC+" : *");
		this.jLabelrucTransaccionLocal.setToolTipText("Ruc Informante");
		this.jLabelrucTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelrucTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldrucTransaccionLocal= new JTextFieldMe();

		jTextFieldrucTransaccionLocal.setEnabled(false);
		jTextFieldrucTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonrucTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucTransaccionLocalBusqueda.setText("U");
		this.jButtonrucTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelrazon_socialTransaccionLocal = new JLabelMe();
		this.jLabelrazon_socialTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_RAZONSOCIAL+" : *");
		this.jLabelrazon_socialTransaccionLocal.setToolTipText("Razon Social");
		this.jLabelrazon_socialTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrazon_socialTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrazon_socialTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrazon_socialTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrazon_socialTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrazon_socialTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_RAZONSOCIAL);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelrazon_socialTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextArearazon_socialTransaccionLocal= new JTextAreaMe();
		jTextArearazon_socialTransaccionLocal.setEnabled(false);
		jTextArearazon_socialTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearazon_socialTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearazon_socialTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearazon_socialTransaccionLocal.setLineWrap(true);
		jTextArearazon_socialTransaccionLocal.setWrapStyleWord(true);
		jTextArearazon_socialTransaccionLocal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearazon_socialTransaccionLocal.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArearazon_socialTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanerazon_socialTransaccionLocal = new JScrollPane(jTextArearazon_socialTransaccionLocal);
		jscrollPanerazon_socialTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanerazon_socialTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanerazon_socialTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonrazon_socialTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonrazon_socialTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrazon_socialTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrazon_socialTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrazon_socialTransaccionLocalBusqueda.setText("U");
		this.jButtonrazon_socialTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrazon_socialTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrazon_socialTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearazon_socialTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearazon_socialTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"razon_socialTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrazon_socialTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelidentificacionTransaccionLocal = new JLabelMe();
		this.jLabelidentificacionTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_IDENTIFICACION+" : *");
		this.jLabelidentificacionTransaccionLocal.setToolTipText("Identificacion");
		this.jLabelidentificacionTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelidentificacionTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldidentificacionTransaccionLocal= new JTextFieldMe();

		jTextFieldidentificacionTransaccionLocal.setEnabled(false);
		jTextFieldidentificacionTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonidentificacionTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionTransaccionLocalBusqueda.setText("U");
		this.jButtonidentificacionTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionTransaccionLocal = new JLabelMe();
		this.jLabelfecha_emisionTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionTransaccionLocal.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelfecha_emisionTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		//jFormattedTextFieldfecha_emisionTransaccionLocal= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionTransaccionLocal= new JDateChooser();
		jDateChooserfecha_emisionTransaccionLocal.setEnabled(false);
		jDateChooserfecha_emisionTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionTransaccionLocal.setDate(new Date());
		jDateChooserfecha_emisionTransaccionLocal.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionTransaccionLocal.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonfecha_emisionTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionTransaccionLocalBusqueda.setText("U");
		this.jButtonfecha_emisionTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelfecha_registro_contableTransaccionLocal = new JLabelMe();
		this.jLabelfecha_registro_contableTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_FECHAREGISTROCONTABLE+" : *");
		this.jLabelfecha_registro_contableTransaccionLocal.setToolTipText("Fecha Reg Contable");
		this.jLabelfecha_registro_contableTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_registro_contableTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_registro_contableTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_registro_contableTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_registro_contableTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_registro_contableTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_FECHAREGISTROCONTABLE);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelfecha_registro_contableTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		//jFormattedTextFieldfecha_registro_contableTransaccionLocal= new JFormattedTextFieldMe();

		jDateChooserfecha_registro_contableTransaccionLocal= new JDateChooser();
		jDateChooserfecha_registro_contableTransaccionLocal.setEnabled(false);
		jDateChooserfecha_registro_contableTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_registro_contableTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_registro_contableTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_registro_contableTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_registro_contableTransaccionLocal.setDate(new Date());
		jDateChooserfecha_registro_contableTransaccionLocal.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_registro_contableTransaccionLocal.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_registro_contableTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonfecha_registro_contableTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_registro_contableTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_registro_contableTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_registro_contableTransaccionLocalBusqueda.setText("U");
		this.jButtonfecha_registro_contableTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_registro_contableTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_registro_contableTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_registro_contableTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_registro_contableTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_registro_contableTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_registro_contableTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelnumero_secuencialTransaccionLocal = new JLabelMe();
		this.jLabelnumero_secuencialTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialTransaccionLocal.setToolTipText("Nro Secuencial");
		this.jLabelnumero_secuencialTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelnumero_secuencialTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldnumero_secuencialTransaccionLocal= new JTextFieldMe();

		jTextFieldnumero_secuencialTransaccionLocal.setEnabled(false);
		jTextFieldnumero_secuencialTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_secuencialTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialTransaccionLocalBusqueda.setText("U");
		this.jButtonnumero_secuencialTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelnumero_serieTransaccionLocal = new JLabelMe();
		this.jLabelnumero_serieTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_NUMEROSERIE+" : *");
		this.jLabelnumero_serieTransaccionLocal.setToolTipText("Nro Serie");
		this.jLabelnumero_serieTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serieTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serieTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serieTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_NUMEROSERIE);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelnumero_serieTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldnumero_serieTransaccionLocal= new JTextFieldMe();

		jTextFieldnumero_serieTransaccionLocal.setEnabled(false);
		jTextFieldnumero_serieTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serieTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_serieTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonnumero_serieTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serieTransaccionLocalBusqueda.setText("U");
		this.jButtonnumero_serieTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serieTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serieTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serieTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serieTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serieTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serieTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizacionTransaccionLocal = new JLabelMe();
		this.jLabelnumero_autorizacionTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_NUMEROAUTORIZACION+" :");
		this.jLabelnumero_autorizacionTransaccionLocal.setToolTipText("Nro Autorizacion");
		this.jLabelnumero_autorizacionTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacionTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizacionTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizacionTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelnumero_autorizacionTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldnumero_autorizacionTransaccionLocal= new JTextFieldMe();

		jTextFieldnumero_autorizacionTransaccionLocal.setEnabled(false);
		jTextFieldnumero_autorizacionTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacionTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizacionTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonnumero_autorizacionTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizacionTransaccionLocalBusqueda.setText("U");
		this.jButtonnumero_autorizacionTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizacionTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizacionTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizacionTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizacionTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizacionTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizacionTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelfecha_caducidadTransaccionLocal = new JLabelMe();
		this.jLabelfecha_caducidadTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_FECHACADUCIDAD+" : *");
		this.jLabelfecha_caducidadTransaccionLocal.setToolTipText("Fecha Caducidad");
		this.jLabelfecha_caducidadTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_caducidadTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_caducidadTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_caducidadTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_caducidadTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_caducidadTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_FECHACADUCIDAD);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelfecha_caducidadTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		//jFormattedTextFieldfecha_caducidadTransaccionLocal= new JFormattedTextFieldMe();

		jDateChooserfecha_caducidadTransaccionLocal= new JDateChooser();
		jDateChooserfecha_caducidadTransaccionLocal.setEnabled(false);
		jDateChooserfecha_caducidadTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidadTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidadTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_caducidadTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_caducidadTransaccionLocal.setDate(new Date());
		jDateChooserfecha_caducidadTransaccionLocal.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_caducidadTransaccionLocal.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_caducidadTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonfecha_caducidadTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidadTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidadTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_caducidadTransaccionLocalBusqueda.setText("U");
		this.jButtonfecha_caducidadTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_caducidadTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_caducidadTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_caducidadTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_caducidadTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_caducidadTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_caducidadTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelnumero_documento_contableTransaccionLocal = new JLabelMe();
		this.jLabelnumero_documento_contableTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE+" :");
		this.jLabelnumero_documento_contableTransaccionLocal.setToolTipText("Nro Documento");
		this.jLabelnumero_documento_contableTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_documento_contableTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_documento_contableTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documento_contableTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documento_contableTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documento_contableTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_NUMERODOCUMENTOCONTABLE);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelnumero_documento_contableTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldnumero_documento_contableTransaccionLocal= new JTextFieldMe();

		jTextFieldnumero_documento_contableTransaccionLocal.setEnabled(false);
		jTextFieldnumero_documento_contableTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documento_contableTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documento_contableTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documento_contableTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documento_contableTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonnumero_documento_contableTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documento_contableTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documento_contableTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documento_contableTransaccionLocalBusqueda.setText("U");
		this.jButtonnumero_documento_contableTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documento_contableTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documento_contableTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documento_contableTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documento_contableTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documento_contableTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documento_contableTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabeles_riseTransaccionLocal = new JLabelMe();
		this.jLabeles_riseTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_ESRISE+" : *");
		this.jLabeles_riseTransaccionLocal.setToolTipText("Es Rise");
		this.jLabeles_riseTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_riseTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_riseTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_riseTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_riseTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_riseTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_ESRISE);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPaneles_riseTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jCheckBoxes_riseTransaccionLocal= new JCheckBoxMe();
		jCheckBoxes_riseTransaccionLocal.setEnabled(false);

		jCheckBoxes_riseTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_riseTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_riseTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_riseTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_riseTransaccionLocalBusqueda= new JButtonMe();
		this.jButtones_riseTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_riseTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_riseTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_riseTransaccionLocalBusqueda.setText("U");
		this.jButtones_riseTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_riseTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_riseTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_riseTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_riseTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_riseTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_riseTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelbienes_ivaTransaccionLocal = new JLabelMe();
		this.jLabelbienes_ivaTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_BIENESIVA+" : *");
		this.jLabelbienes_ivaTransaccionLocal.setToolTipText("Bienes Iva");
		this.jLabelbienes_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbienes_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbienes_ivaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbienes_ivaTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_BIENESIVA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelbienes_ivaTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldbienes_ivaTransaccionLocal= new JTextFieldMe();
		jTextFieldbienes_ivaTransaccionLocal.setEnabled(false);
		jTextFieldbienes_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbienes_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbienes_ivaTransaccionLocal.setText("0.0");

		this.jButtonbienes_ivaTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonbienes_ivaTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_ivaTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_ivaTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbienes_ivaTransaccionLocalBusqueda.setText("U");
		this.jButtonbienes_ivaTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbienes_ivaTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbienes_ivaTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbienes_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbienes_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"bienes_ivaTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbienes_ivaTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelbienes_sin_ivaTransaccionLocal = new JLabelMe();
		this.jLabelbienes_sin_ivaTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_BIENESSINIVA+" : *");
		this.jLabelbienes_sin_ivaTransaccionLocal.setToolTipText("BienesTarifa 0");
		this.jLabelbienes_sin_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_sin_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_sin_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbienes_sin_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbienes_sin_ivaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbienes_sin_ivaTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_BIENESSINIVA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelbienes_sin_ivaTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldbienes_sin_ivaTransaccionLocal= new JTextFieldMe();
		jTextFieldbienes_sin_ivaTransaccionLocal.setEnabled(false);
		jTextFieldbienes_sin_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_sin_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_sin_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbienes_sin_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbienes_sin_ivaTransaccionLocal.setText("0.0");

		this.jButtonbienes_sin_ivaTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonbienes_sin_ivaTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_sin_ivaTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_sin_ivaTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbienes_sin_ivaTransaccionLocalBusqueda.setText("U");
		this.jButtonbienes_sin_ivaTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbienes_sin_ivaTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbienes_sin_ivaTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbienes_sin_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbienes_sin_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"bienes_sin_ivaTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbienes_sin_ivaTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelservicios_ivaTransaccionLocal = new JLabelMe();
		this.jLabelservicios_ivaTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_SERVICIOSIVA+" : *");
		this.jLabelservicios_ivaTransaccionLocal.setToolTipText("Servicios Iva");
		this.jLabelservicios_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelservicios_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelservicios_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelservicios_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelservicios_ivaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelservicios_ivaTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_SERVICIOSIVA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelservicios_ivaTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldservicios_ivaTransaccionLocal= new JTextFieldMe();
		jTextFieldservicios_ivaTransaccionLocal.setEnabled(false);
		jTextFieldservicios_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldservicios_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldservicios_ivaTransaccionLocal.setText("0.0");

		this.jButtonservicios_ivaTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonservicios_ivaTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_ivaTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_ivaTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonservicios_ivaTransaccionLocalBusqueda.setText("U");
		this.jButtonservicios_ivaTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonservicios_ivaTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonservicios_ivaTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldservicios_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldservicios_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"servicios_ivaTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonservicios_ivaTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelservicios_sin_ivaTransaccionLocal = new JLabelMe();
		this.jLabelservicios_sin_ivaTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_SERVICIOSSINIVA+" : *");
		this.jLabelservicios_sin_ivaTransaccionLocal.setToolTipText("Servicios Tarifa 0");
		this.jLabelservicios_sin_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelservicios_sin_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelservicios_sin_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelservicios_sin_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelservicios_sin_ivaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelservicios_sin_ivaTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_SERVICIOSSINIVA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelservicios_sin_ivaTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldservicios_sin_ivaTransaccionLocal= new JTextFieldMe();
		jTextFieldservicios_sin_ivaTransaccionLocal.setEnabled(false);
		jTextFieldservicios_sin_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_sin_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_sin_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldservicios_sin_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldservicios_sin_ivaTransaccionLocal.setText("0.0");

		this.jButtonservicios_sin_ivaTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonservicios_sin_ivaTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_sin_ivaTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_sin_ivaTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonservicios_sin_ivaTransaccionLocalBusqueda.setText("U");
		this.jButtonservicios_sin_ivaTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonservicios_sin_ivaTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonservicios_sin_ivaTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldservicios_sin_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldservicios_sin_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"servicios_sin_ivaTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonservicios_sin_ivaTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelmonto_ivaTransaccionLocal = new JLabelMe();
		this.jLabelmonto_ivaTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_MONTOIVA+" : *");
		this.jLabelmonto_ivaTransaccionLocal.setToolTipText("Monto Iva");
		this.jLabelmonto_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_ivaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_ivaTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_MONTOIVA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelmonto_ivaTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldmonto_ivaTransaccionLocal= new JTextFieldMe();
		jTextFieldmonto_ivaTransaccionLocal.setEnabled(false);
		jTextFieldmonto_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_ivaTransaccionLocal.setText("0.0");

		this.jButtonmonto_ivaTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonmonto_ivaTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_ivaTransaccionLocalBusqueda.setText("U");
		this.jButtonmonto_ivaTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_ivaTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_ivaTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_ivaTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_ivaTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaTransaccionLocal = new JLabelMe();
		this.jLabeltotal_ivaTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaTransaccionLocal.setToolTipText("B. Ímp. Iva");
		this.jLabeltotal_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPaneltotal_ivaTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldtotal_ivaTransaccionLocal= new JTextFieldMe();
		jTextFieldtotal_ivaTransaccionLocal.setEnabled(false);
		jTextFieldtotal_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaTransaccionLocal.setText("0.0");

		this.jButtontotal_ivaTransaccionLocalBusqueda= new JButtonMe();
		this.jButtontotal_ivaTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaTransaccionLocalBusqueda.setText("U");
		this.jButtontotal_ivaTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaTransaccionLocal = new JLabelMe();
		this.jLabeltotal_sin_ivaTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaTransaccionLocal.setToolTipText("B. Imp. Tarifa 0");
		this.jLabeltotal_sin_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_sin_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_sin_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPaneltotal_sin_ivaTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldtotal_sin_ivaTransaccionLocal= new JTextFieldMe();
		jTextFieldtotal_sin_ivaTransaccionLocal.setEnabled(false);
		jTextFieldtotal_sin_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaTransaccionLocal.setText("0.0");

		this.jButtontotal_sin_ivaTransaccionLocalBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaTransaccionLocalBusqueda.setText("U");
		this.jButtontotal_sin_ivaTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelmonto_iceTransaccionLocal = new JLabelMe();
		this.jLabelmonto_iceTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_MONTOICE+" : *");
		this.jLabelmonto_iceTransaccionLocal.setToolTipText("Monto ICE");
		this.jLabelmonto_iceTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_iceTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_iceTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_iceTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_iceTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_iceTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_MONTOICE);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelmonto_iceTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldmonto_iceTransaccionLocal= new JTextFieldMe();
		jTextFieldmonto_iceTransaccionLocal.setEnabled(false);
		jTextFieldmonto_iceTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_iceTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_iceTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_iceTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_iceTransaccionLocal.setText("0.0");

		this.jButtonmonto_iceTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonmonto_iceTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_iceTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_iceTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_iceTransaccionLocalBusqueda.setText("U");
		this.jButtonmonto_iceTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_iceTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_iceTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_iceTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_iceTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_iceTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_iceTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabeltransfe_iva_retenerTransaccionLocal = new JLabelMe();
		this.jLabeltransfe_iva_retenerTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_TRANSFEIVARETENER+" : *");
		this.jLabeltransfe_iva_retenerTransaccionLocal.setToolTipText("Monto Iva Retener");
		this.jLabeltransfe_iva_retenerTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltransfe_iva_retenerTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltransfe_iva_retenerTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltransfe_iva_retenerTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltransfe_iva_retenerTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltransfe_iva_retenerTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_TRANSFEIVARETENER);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPaneltransfe_iva_retenerTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldtransfe_iva_retenerTransaccionLocal= new JTextFieldMe();
		jTextFieldtransfe_iva_retenerTransaccionLocal.setEnabled(false);
		jTextFieldtransfe_iva_retenerTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtransfe_iva_retenerTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtransfe_iva_retenerTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtransfe_iva_retenerTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtransfe_iva_retenerTransaccionLocal.setText("0.0");

		this.jButtontransfe_iva_retenerTransaccionLocalBusqueda= new JButtonMe();
		this.jButtontransfe_iva_retenerTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransfe_iva_retenerTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransfe_iva_retenerTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontransfe_iva_retenerTransaccionLocalBusqueda.setText("U");
		this.jButtontransfe_iva_retenerTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontransfe_iva_retenerTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontransfe_iva_retenerTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtransfe_iva_retenerTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtransfe_iva_retenerTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"transfe_iva_retenerTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontransfe_iva_retenerTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelpresta_iva_retenerTransaccionLocal = new JLabelMe();
		this.jLabelpresta_iva_retenerTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_PRESTAIVARETENER+" : *");
		this.jLabelpresta_iva_retenerTransaccionLocal.setToolTipText("Monto Iva Retener.");
		this.jLabelpresta_iva_retenerTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpresta_iva_retenerTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpresta_iva_retenerTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpresta_iva_retenerTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpresta_iva_retenerTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpresta_iva_retenerTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_PRESTAIVARETENER);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelpresta_iva_retenerTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldpresta_iva_retenerTransaccionLocal= new JTextFieldMe();
		jTextFieldpresta_iva_retenerTransaccionLocal.setEnabled(false);
		jTextFieldpresta_iva_retenerTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpresta_iva_retenerTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpresta_iva_retenerTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpresta_iva_retenerTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpresta_iva_retenerTransaccionLocal.setText("0.0");

		this.jButtonpresta_iva_retenerTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonpresta_iva_retenerTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpresta_iva_retenerTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpresta_iva_retenerTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpresta_iva_retenerTransaccionLocalBusqueda.setText("U");
		this.jButtonpresta_iva_retenerTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpresta_iva_retenerTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpresta_iva_retenerTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpresta_iva_retenerTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpresta_iva_retenerTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"presta_iva_retenerTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpresta_iva_retenerTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabeltransfe_iva_retenidoTransaccionLocal = new JLabelMe();
		this.jLabeltransfe_iva_retenidoTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_TRANSFEIVARETENIDO+" : *");
		this.jLabeltransfe_iva_retenidoTransaccionLocal.setToolTipText("Iva Retenido");
		this.jLabeltransfe_iva_retenidoTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltransfe_iva_retenidoTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltransfe_iva_retenidoTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltransfe_iva_retenidoTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltransfe_iva_retenidoTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltransfe_iva_retenidoTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_TRANSFEIVARETENIDO);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPaneltransfe_iva_retenidoTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldtransfe_iva_retenidoTransaccionLocal= new JTextFieldMe();
		jTextFieldtransfe_iva_retenidoTransaccionLocal.setEnabled(false);
		jTextFieldtransfe_iva_retenidoTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtransfe_iva_retenidoTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtransfe_iva_retenidoTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtransfe_iva_retenidoTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtransfe_iva_retenidoTransaccionLocal.setText("0.0");

		this.jButtontransfe_iva_retenidoTransaccionLocalBusqueda= new JButtonMe();
		this.jButtontransfe_iva_retenidoTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransfe_iva_retenidoTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransfe_iva_retenidoTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontransfe_iva_retenidoTransaccionLocalBusqueda.setText("U");
		this.jButtontransfe_iva_retenidoTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontransfe_iva_retenidoTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontransfe_iva_retenidoTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtransfe_iva_retenidoTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtransfe_iva_retenidoTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"transfe_iva_retenidoTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontransfe_iva_retenidoTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelpresta_iva_retenidoTransaccionLocal = new JLabelMe();
		this.jLabelpresta_iva_retenidoTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_PRESTAIVARETENIDO+" : *");
		this.jLabelpresta_iva_retenidoTransaccionLocal.setToolTipText("Iva Retenido.");
		this.jLabelpresta_iva_retenidoTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpresta_iva_retenidoTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpresta_iva_retenidoTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpresta_iva_retenidoTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpresta_iva_retenidoTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpresta_iva_retenidoTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_PRESTAIVARETENIDO);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelpresta_iva_retenidoTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jTextFieldpresta_iva_retenidoTransaccionLocal= new JTextFieldMe();
		jTextFieldpresta_iva_retenidoTransaccionLocal.setEnabled(false);
		jTextFieldpresta_iva_retenidoTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpresta_iva_retenidoTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpresta_iva_retenidoTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpresta_iva_retenidoTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpresta_iva_retenidoTransaccionLocal.setText("0.0");

		this.jButtonpresta_iva_retenidoTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonpresta_iva_retenidoTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpresta_iva_retenidoTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpresta_iva_retenidoTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpresta_iva_retenidoTransaccionLocalBusqueda.setText("U");
		this.jButtonpresta_iva_retenidoTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpresta_iva_retenidoTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpresta_iva_retenidoTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpresta_iva_retenidoTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpresta_iva_retenidoTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"presta_iva_retenidoTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpresta_iva_retenidoTransaccionLocalBusqueda.setVisible(false);		}


					
		this.jLabelpermite_devolucionTransaccionLocal = new JLabelMe();
		this.jLabelpermite_devolucionTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_PERMITEDEVOLUCION+" : *");
		this.jLabelpermite_devolucionTransaccionLocal.setToolTipText("Con Devolucion");
		this.jLabelpermite_devolucionTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpermite_devolucionTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpermite_devolucionTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpermite_devolucionTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpermite_devolucionTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpermite_devolucionTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_PERMITEDEVOLUCION);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelpermite_devolucionTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jCheckBoxpermite_devolucionTransaccionLocal= new JCheckBoxMe();
		jCheckBoxpermite_devolucionTransaccionLocal.setEnabled(false);

		jCheckBoxpermite_devolucionTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpermite_devolucionTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpermite_devolucionTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpermite_devolucionTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpermite_devolucionTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonpermite_devolucionTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpermite_devolucionTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpermite_devolucionTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpermite_devolucionTransaccionLocalBusqueda.setText("U");
		this.jButtonpermite_devolucionTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpermite_devolucionTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpermite_devolucionTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpermite_devolucionTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpermite_devolucionTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"permite_devolucionTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpermite_devolucionTransaccionLocalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTransaccionLocal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_compraTransaccionLocal = new JLabelMe();
		this.jLabelid_compraTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_IDCOMPRA+" :");
		this.jLabelid_compraTransaccionLocal.setToolTipText("Compra");
		this.jLabelid_compraTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_compraTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_compraTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_compraTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_compraTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_compraTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_IDCOMPRA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelid_compraTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jComboBoxid_compraTransaccionLocal= new JComboBoxMe();
		jComboBoxid_compraTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_compraTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_compraTransaccionLocal.setEnabled(false);

		this.jButtonid_compraTransaccionLocal= new JButtonMe();
		this.jButtonid_compraTransaccionLocal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraTransaccionLocal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraTransaccionLocal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraTransaccionLocal.setText("Buscar");
		this.jButtonid_compraTransaccionLocal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_compraTransaccionLocal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraTransaccionLocal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_compraTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraTransaccionLocal"));

		this.jButtonid_compraTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonid_compraTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_compraTransaccionLocalBusqueda.setText("U");
		this.jButtonid_compraTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_compraTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_compraTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_compraTransaccionLocalBusqueda.setVisible(false);		}

		this.jButtonid_compraTransaccionLocalUpdate= new JButtonMe();
		this.jButtonid_compraTransaccionLocalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraTransaccionLocalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraTransaccionLocalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_compraTransaccionLocalUpdate.setText("U");
		this.jButtonid_compraTransaccionLocalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_compraTransaccionLocalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraTransaccionLocalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_compraTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraTransaccionLocalUpdate"));



					
		this.jLabelid_periodo_declaraTransaccionLocal = new JLabelMe();
		this.jLabelid_periodo_declaraTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_IDPERIODODECLARA+" : *");
		this.jLabelid_periodo_declaraTransaccionLocal.setToolTipText("Periodo Declara");
		this.jLabelid_periodo_declaraTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodo_declaraTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodo_declaraTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_IDPERIODODECLARA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelid_periodo_declaraTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jComboBoxid_periodo_declaraTransaccionLocal= new JComboBoxMe();
		jComboBoxid_periodo_declaraTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodo_declaraTransaccionLocal= new JButtonMe();
		this.jButtonid_periodo_declaraTransaccionLocal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraTransaccionLocal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraTransaccionLocal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraTransaccionLocal.setText("Buscar");
		this.jButtonid_periodo_declaraTransaccionLocal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodo_declaraTransaccionLocal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraTransaccionLocal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodo_declaraTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraTransaccionLocal"));

		this.jButtonid_periodo_declaraTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonid_periodo_declaraTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraTransaccionLocalBusqueda.setText("U");
		this.jButtonid_periodo_declaraTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodo_declaraTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodo_declaraTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodo_declaraTransaccionLocalBusqueda.setVisible(false);		}

		this.jButtonid_periodo_declaraTransaccionLocalUpdate= new JButtonMe();
		this.jButtonid_periodo_declaraTransaccionLocalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraTransaccionLocalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraTransaccionLocalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraTransaccionLocalUpdate.setText("U");
		this.jButtonid_periodo_declaraTransaccionLocalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodo_declaraTransaccionLocalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraTransaccionLocalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodo_declaraTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraTransaccionLocalUpdate"));



					
		this.jLabelid_transaccion_contaTransaccionLocal = new JLabelMe();
		this.jLabelid_transaccion_contaTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_IDTRANSACCIONCONTA+" : *");
		this.jLabelid_transaccion_contaTransaccionLocal.setToolTipText("Transaccion");
		this.jLabelid_transaccion_contaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_contaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_contaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_contaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_contaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_contaTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_IDTRANSACCIONCONTA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelid_transaccion_contaTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jComboBoxid_transaccion_contaTransaccionLocal= new JComboBoxMe();
		jComboBoxid_transaccion_contaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_contaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_contaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_contaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_contaTransaccionLocal= new JButtonMe();
		this.jButtonid_transaccion_contaTransaccionLocal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_contaTransaccionLocal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_contaTransaccionLocal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_contaTransaccionLocal.setText("Buscar");
		this.jButtonid_transaccion_contaTransaccionLocal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_contaTransaccionLocal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_contaTransaccionLocal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_contaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_contaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_contaTransaccionLocal"));

		this.jButtonid_transaccion_contaTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonid_transaccion_contaTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_contaTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_contaTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_contaTransaccionLocalBusqueda.setText("U");
		this.jButtonid_transaccion_contaTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_contaTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_contaTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_contaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_contaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_contaTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_contaTransaccionLocalBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_contaTransaccionLocalUpdate= new JButtonMe();
		this.jButtonid_transaccion_contaTransaccionLocalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_contaTransaccionLocalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_contaTransaccionLocalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_contaTransaccionLocalUpdate.setText("U");
		this.jButtonid_transaccion_contaTransaccionLocalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_contaTransaccionLocalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_contaTransaccionLocalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_contaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_contaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_contaTransaccionLocalUpdate"));



					
		this.jLabelid_clienteTransaccionLocal = new JLabelMe();
		this.jLabelid_clienteTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteTransaccionLocal.setToolTipText("Prove/Cliente");
		this.jLabelid_clienteTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelid_clienteTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jComboBoxid_clienteTransaccionLocal= new JComboBoxMe();
		jComboBoxid_clienteTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteTransaccionLocal= new JButtonMe();
		this.jButtonid_clienteTransaccionLocal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteTransaccionLocal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteTransaccionLocal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteTransaccionLocal.setText("Buscar");
		this.jButtonid_clienteTransaccionLocal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteTransaccionLocal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteTransaccionLocal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteTransaccionLocal"));

		this.jButtonid_clienteTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonid_clienteTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteTransaccionLocalBusqueda.setText("U");
		this.jButtonid_clienteTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteTransaccionLocalBusqueda.setVisible(false);		}

		this.jButtonid_clienteTransaccionLocalUpdate= new JButtonMe();
		this.jButtonid_clienteTransaccionLocalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTransaccionLocalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteTransaccionLocalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteTransaccionLocalUpdate.setText("U");
		this.jButtonid_clienteTransaccionLocalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteTransaccionLocalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteTransaccionLocalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteTransaccionLocalUpdate"));



					
		this.jLabelid_tipo_comprobanteTransaccionLocal = new JLabelMe();
		this.jLabelid_tipo_comprobanteTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_IDTIPOCOMPROBANTE+" : *");
		this.jLabelid_tipo_comprobanteTransaccionLocal.setToolTipText("T. Comprobante");
		this.jLabelid_tipo_comprobanteTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_comprobanteTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_comprobanteTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comprobanteTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_comprobanteTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_comprobanteTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelid_tipo_comprobanteTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jComboBoxid_tipo_comprobanteTransaccionLocal= new JComboBoxMe();
		jComboBoxid_tipo_comprobanteTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comprobanteTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_comprobanteTransaccionLocal= new JButtonMe();
		this.jButtonid_tipo_comprobanteTransaccionLocal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteTransaccionLocal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteTransaccionLocal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteTransaccionLocal.setText("Buscar");
		this.jButtonid_tipo_comprobanteTransaccionLocal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_comprobanteTransaccionLocal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteTransaccionLocal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_comprobanteTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteTransaccionLocal"));

		this.jButtonid_tipo_comprobanteTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonid_tipo_comprobanteTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comprobanteTransaccionLocalBusqueda.setText("U");
		this.jButtonid_tipo_comprobanteTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_comprobanteTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_comprobanteTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_comprobanteTransaccionLocalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_comprobanteTransaccionLocalUpdate= new JButtonMe();
		this.jButtonid_tipo_comprobanteTransaccionLocalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteTransaccionLocalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteTransaccionLocalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comprobanteTransaccionLocalUpdate.setText("U");
		this.jButtonid_tipo_comprobanteTransaccionLocalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_comprobanteTransaccionLocalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteTransaccionLocalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_comprobanteTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteTransaccionLocalUpdate"));



					
		this.jLabelid_tipo_tributarioTransaccionLocal = new JLabelMe();
		this.jLabelid_tipo_tributarioTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_IDTIPOTRIBUTARIO+" : *");
		this.jLabelid_tipo_tributarioTransaccionLocal.setToolTipText("Cod. Tributario");
		this.jLabelid_tipo_tributarioTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_tributarioTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_tributarioTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tributarioTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_tributarioTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_tributarioTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_IDTIPOTRIBUTARIO);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelid_tipo_tributarioTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jComboBoxid_tipo_tributarioTransaccionLocal= new JComboBoxMe();
		jComboBoxid_tipo_tributarioTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tributarioTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_tributarioTransaccionLocal= new JButtonMe();
		this.jButtonid_tipo_tributarioTransaccionLocal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioTransaccionLocal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioTransaccionLocal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioTransaccionLocal.setText("Buscar");
		this.jButtonid_tipo_tributarioTransaccionLocal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_tributarioTransaccionLocal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioTransaccionLocal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_tributarioTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioTransaccionLocal"));

		this.jButtonid_tipo_tributarioTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonid_tipo_tributarioTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tributarioTransaccionLocalBusqueda.setText("U");
		this.jButtonid_tipo_tributarioTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_tributarioTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_tributarioTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_tributarioTransaccionLocalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_tributarioTransaccionLocalUpdate= new JButtonMe();
		this.jButtonid_tipo_tributarioTransaccionLocalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioTransaccionLocalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioTransaccionLocalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tributarioTransaccionLocalUpdate.setText("U");
		this.jButtonid_tipo_tributarioTransaccionLocalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_tributarioTransaccionLocalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioTransaccionLocalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_tributarioTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioTransaccionLocalUpdate"));



					
		this.jLabelid_asiento_contableTransaccionLocal = new JLabelMe();
		this.jLabelid_asiento_contableTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_IDASIENTOCONTABLE+" :");
		this.jLabelid_asiento_contableTransaccionLocal.setToolTipText("Asiento C.");
		this.jLabelid_asiento_contableTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelid_asiento_contableTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jComboBoxid_asiento_contableTransaccionLocal= new JComboBoxMe();
		jComboBoxid_asiento_contableTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_asiento_contableTransaccionLocal.setEnabled(false);

		this.jButtonid_asiento_contableTransaccionLocal= new JButtonMe();
		this.jButtonid_asiento_contableTransaccionLocal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableTransaccionLocal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableTransaccionLocal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableTransaccionLocal.setText("Buscar");
		this.jButtonid_asiento_contableTransaccionLocal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableTransaccionLocal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableTransaccionLocal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableTransaccionLocal"));

		this.jButtonid_asiento_contableTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableTransaccionLocalBusqueda.setText("U");
		this.jButtonid_asiento_contableTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableTransaccionLocalBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableTransaccionLocalUpdate= new JButtonMe();
		this.jButtonid_asiento_contableTransaccionLocalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableTransaccionLocalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableTransaccionLocalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableTransaccionLocalUpdate.setText("U");
		this.jButtonid_asiento_contableTransaccionLocalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableTransaccionLocalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableTransaccionLocalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableTransaccionLocalUpdate"));



					
		this.jLabelid_tipo_ivaTransaccionLocal = new JLabelMe();
		this.jLabelid_tipo_ivaTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_IDTIPOIVA+" : *");
		this.jLabelid_tipo_ivaTransaccionLocal.setToolTipText("% Iva");
		this.jLabelid_tipo_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_ivaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_ivaTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_IDTIPOIVA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelid_tipo_ivaTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jComboBoxid_tipo_ivaTransaccionLocal= new JComboBoxMe();
		jComboBoxid_tipo_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_ivaTransaccionLocal= new JButtonMe();
		this.jButtonid_tipo_ivaTransaccionLocal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaTransaccionLocal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaTransaccionLocal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaTransaccionLocal.setText("Buscar");
		this.jButtonid_tipo_ivaTransaccionLocal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_ivaTransaccionLocal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaTransaccionLocal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaTransaccionLocal"));

		this.jButtonid_tipo_ivaTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonid_tipo_ivaTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaTransaccionLocalBusqueda.setText("U");
		this.jButtonid_tipo_ivaTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_ivaTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_ivaTransaccionLocalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_ivaTransaccionLocalUpdate= new JButtonMe();
		this.jButtonid_tipo_ivaTransaccionLocalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaTransaccionLocalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaTransaccionLocalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaTransaccionLocalUpdate.setText("U");
		this.jButtonid_tipo_ivaTransaccionLocalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_ivaTransaccionLocalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaTransaccionLocalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaTransaccionLocalUpdate"));



					
		this.jLabelid_tipo_retencion_ivaTransaccionLocal = new JLabelMe();
		this.jLabelid_tipo_retencion_ivaTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_IDTIPORETENCIONIVA+" : *");
		this.jLabelid_tipo_retencion_ivaTransaccionLocal.setToolTipText("% Iva_");
		this.jLabelid_tipo_retencion_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_ivaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_ivaTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_IDTIPORETENCIONIVA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelid_tipo_retencion_ivaTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jComboBoxid_tipo_retencion_ivaTransaccionLocal= new JComboBoxMe();
		jComboBoxid_tipo_retencion_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_ivaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_ivaTransaccionLocal= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaTransaccionLocal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaTransaccionLocal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaTransaccionLocal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaTransaccionLocal.setText("Buscar");
		this.jButtonid_tipo_retencion_ivaTransaccionLocal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_ivaTransaccionLocal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaTransaccionLocal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaTransaccionLocal"));

		this.jButtonid_tipo_retencion_ivaTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_ivaTransaccionLocalBusqueda.setText("U");
		this.jButtonid_tipo_retencion_ivaTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_ivaTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_ivaTransaccionLocalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_ivaTransaccionLocalUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaTransaccionLocalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaTransaccionLocalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaTransaccionLocalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_ivaTransaccionLocalUpdate.setText("U");
		this.jButtonid_tipo_retencion_ivaTransaccionLocalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_ivaTransaccionLocalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaTransaccionLocalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_ivaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaTransaccionLocalUpdate"));



					
		this.jLabelid_tipo_retencion_iva_prestaTransaccionLocal = new JLabelMe();
		this.jLabelid_tipo_retencion_iva_prestaTransaccionLocal.setText(""+TransaccionLocalConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA+" : *");
		this.jLabelid_tipo_retencion_iva_prestaTransaccionLocal.setToolTipText("% Iva.");
		this.jLabelid_tipo_retencion_iva_prestaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_iva_prestaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_iva_prestaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva_prestaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_iva_prestaTransaccionLocal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_iva_prestaTransaccionLocal.setToolTipText(TransaccionLocalConstantesFunciones.LABEL_IDTIPORETENCIONIVAPRESTA);
		this.gridaBagLayoutTransaccionLocal = new GridBagLayout();
		this.jPanelid_tipo_retencion_iva_prestaTransaccionLocal.setLayout(this.gridaBagLayoutTransaccionLocal);


		jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocal= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocal.setText("Buscar");
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_prestaTransaccionLocal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_prestaTransaccionLocal"));

		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalBusqueda.setText("U");
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_prestaTransaccionLocalBusqueda"));

		if(this.transaccionlocalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalUpdate.setText("U");
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva_prestaTransaccionLocalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva_prestaTransaccionLocalUpdate"));



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
		//this.jInternalFrameDetalleTransaccionLocal = new TransaccionLocalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Transaccion Local DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccionLocal= new GridBagLayout();
		

		
		String sToolTipTransaccionLocal="";
		sToolTipTransaccionLocal=TransaccionLocalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccionLocal+="(Sris.TransaccionLocal)";
		}
		
		if(!this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccionLocal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTransaccionLocal = new JButtonMe();
		this.jButtonModificarTransaccionLocal = new JButtonMe();
        this.jButtonActualizarTransaccionLocal = new JButtonMe();
        this.jButtonEliminarTransaccionLocal = new JButtonMe();
        this.jButtonCancelarTransaccionLocal = new JButtonMe();
        this.jButtonGuardarCambiosTransaccionLocal = new JButtonMe();
		this.jButtonGuardarCambiosTablaTransaccionLocal = new JButtonMe();
		this.jButtonCerrarTransaccionLocal = new JButtonMe();
		
		this.jScrollPanelDatosTransaccionLocal = new JScrollPane();   
        this.jScrollPanelDatosEdicionTransaccionLocal = new JScrollPane();
		this.jScrollPanelDatosGeneralTransaccionLocal = new JScrollPane();
				
		
		
		this.jPanelCamposTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovalores1TransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovalores2TransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Transaccion Local";
		
		if(!this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Locales" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccionLocal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTransaccionLocal.setName("jPanelCamposTransaccionLocal"); 

		this.jPanelCamposOcultosTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTransaccionLocal.setName("jPanelCamposOcultosTransaccionLocal"); 

        this.jPanelAccionesTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccionLocal.setToolTipText("Acciones");
        this.jPanelAccionesTransaccionLocal.setName("Acciones"); 

		this.jPanelAccionesFormularioTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTransaccionLocal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTransaccionLocal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralTransaccionLocal.setName("jPanelCamposFingeneralTransaccionLocal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovalores1TransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores1"));
		this.jPanelCamposIniciovalores1TransaccionLocal.setName("jPanelCamposFinvalores1TransaccionLocal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovalores1TransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovalores2TransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores2"));
		this.jPanelCamposIniciovalores2TransaccionLocal.setName("jPanelCamposFinvalores2TransaccionLocal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovalores2TransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTransaccionLocal.setText("Nuevo");
		this.jButtonModificarTransaccionLocal.setText("Editar");
        this.jButtonActualizarTransaccionLocal.setText("Actualizar");
        this.jButtonEliminarTransaccionLocal.setText("Eliminar");
        this.jButtonCancelarTransaccionLocal.setText("Cancelar");
        this.jButtonGuardarCambiosTransaccionLocal.setText("Guardar");
		this.jButtonGuardarCambiosTablaTransaccionLocal.setText("Guardar");
		this.jButtonCerrarTransaccionLocal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccionLocal,"nuevo_button","Nuevo",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTransaccionLocal,"modificar_button","Editar",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTransaccionLocal,"actualizar_button","Actualizar",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTransaccionLocal,"eliminar_button","Eliminar",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTransaccionLocal,"cancelar_button","Cancelar",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTransaccionLocal,"guardarcambios_button","Guardar",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccionLocal,"guardarcambiostabla_button","Guardar",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccionLocal,"cerrar_button","Salir",this.transaccionlocalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTransaccionLocal.setToolTipText("Nuevo"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTransaccionLocal.setToolTipText("Editar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTransaccionLocal.setToolTipText("Actualizar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTransaccionLocal.setToolTipText("Eliminar)"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTransaccionLocal.setToolTipText("Cancelar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTransaccionLocal.setToolTipText("Guardar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTransaccionLocal.setToolTipText("Guardar"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccionLocal.setToolTipText("Salir"+" "+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccionLocal";
		inputMap = this.jButtonNuevoTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccionLocal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccionLocal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTransaccionLocal";
		inputMap = this.jButtonActualizarTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTransaccionLocal"));
		
		//ELIMINAR
		sMapKey = "EliminarTransaccionLocal";
		inputMap = this.jButtonEliminarTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTransaccionLocal"));
		
		//CANCELAR	
		sMapKey = "CancelarTransaccionLocal";
		inputMap = this.jButtonCancelarTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTransaccionLocal"));
		
		//CERRAR		
		sMapKey = "CerrarTransaccionLocal";
		inputMap = this.jButtonCerrarTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccionLocal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccionLocal";
		inputMap = this.jButtonGuardarCambiosTablaTransaccionLocal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccionLocal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccionLocal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTransaccionLocal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTransaccionLocal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTransaccionLocal.setToolTipText("Nuevo TransaccionLocal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTransaccionLocal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTransaccionLocal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTransaccionLocal.setToolTipText("Sin Cerrar Ventana TransaccionLocal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTransaccionLocal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTransaccionLocal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTransaccionLocal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTransaccionLocal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccionLocal.setText("Accion");
		this.jComboBoxTiposAccionesTransaccionLocal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTransaccionLocal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTransaccionLocal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTransaccionLocal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTransaccionLocal = new JLabelMe();
		
		this.jLabelAccionesTransaccionLocal.setText("Acciones");		
		this.jLabelAccionesTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTransaccionLocal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTransaccionLocal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTransaccionLocal=new JTabbedPane();
		this.jTabbedPaneRelacionesTransaccionLocal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTransaccionLocal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTransaccionLocal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionLocal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionLocal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccionLocal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTransaccionLocal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccionLocal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransaccionLocal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTransaccionLocal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTransaccionLocal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTransaccionLocal = new GridBagLayout();
		
		this.jPanelCamposTransaccionLocal.setLayout(gridaBagLayoutCamposTransaccionLocal);
		this.jPanelCamposOcultosTransaccionLocal.setLayout(gridaBagLayoutCamposOcultosTransaccionLocal);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralTransaccionLocal= new GridBagLayout();
		this.jPanelCamposIniciogeneralTransaccionLocal.setLayout(gridaBagLayoutCamposIniciogeneralTransaccionLocal);

		GridBagLayout gridaBagLayoutCamposIniciovalores1TransaccionLocal= new GridBagLayout();
		this.jPanelCamposIniciovalores1TransaccionLocal.setLayout(gridaBagLayoutCamposIniciovalores1TransaccionLocal);

		GridBagLayout gridaBagLayoutCamposIniciovalores2TransaccionLocal= new GridBagLayout();
		this.jPanelCamposIniciovalores2TransaccionLocal.setLayout(gridaBagLayoutCamposIniciovalores2TransaccionLocal);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTransaccionLocal.add(jLabelIdTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTransaccionLocal.add(jLabelidTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_compraTransaccionLocal.add(jLabelid_compraTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_compraTransaccionLocal.add(jButtonid_compraTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 3;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_compraTransaccionLocal.add(jButtonid_compraTransaccionLocalUpdate, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_compraTransaccionLocal.add(jComboBoxid_compraTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucTransaccionLocal.add(jLabelrucTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucTransaccionLocal.add(jButtonrucTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucTransaccionLocal.add(jTextFieldrucTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrazon_socialTransaccionLocal.add(jLabelrazon_socialTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelrazon_socialTransaccionLocal.add(jButtonrazon_socialTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrazon_socialTransaccionLocal.add(jscrollPanerazon_socialTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodo_declaraTransaccionLocal.add(jLabelid_periodo_declaraTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraTransaccionLocal.add(jButtonid_periodo_declaraTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 3;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraTransaccionLocal.add(jButtonid_periodo_declaraTransaccionLocalUpdate, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodo_declaraTransaccionLocal.add(jComboBoxid_periodo_declaraTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_contaTransaccionLocal.add(jLabelid_transaccion_contaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_contaTransaccionLocal.add(jButtonid_transaccion_contaTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 3;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_contaTransaccionLocal.add(jButtonid_transaccion_contaTransaccionLocalUpdate, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_contaTransaccionLocal.add(jComboBoxid_transaccion_contaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteTransaccionLocal.add(jLabelid_clienteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 2;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteTransaccionLocal.add(jButtonid_clienteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 3;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteTransaccionLocal.add(jButtonid_clienteTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 4;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteTransaccionLocal.add(jButtonid_clienteTransaccionLocalUpdate, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteTransaccionLocal.add(jComboBoxid_clienteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionTransaccionLocal.add(jLabelidentificacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionTransaccionLocal.add(jButtonidentificacionTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionTransaccionLocal.add(jTextFieldidentificacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_comprobanteTransaccionLocal.add(jLabelid_tipo_comprobanteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comprobanteTransaccionLocal.add(jButtonid_tipo_comprobanteTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 3;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comprobanteTransaccionLocal.add(jButtonid_tipo_comprobanteTransaccionLocalUpdate, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_comprobanteTransaccionLocal.add(jComboBoxid_tipo_comprobanteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionTransaccionLocal.add(jLabelfecha_emisionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionTransaccionLocal.add(jButtonfecha_emisionTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionTransaccionLocal.add(jDateChooserfecha_emisionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_registro_contableTransaccionLocal.add(jLabelfecha_registro_contableTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_registro_contableTransaccionLocal.add(jButtonfecha_registro_contableTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_registro_contableTransaccionLocal.add(jDateChooserfecha_registro_contableTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_secuencialTransaccionLocal.add(jLabelnumero_secuencialTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialTransaccionLocal.add(jButtonnumero_secuencialTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_secuencialTransaccionLocal.add(jTextFieldnumero_secuencialTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_serieTransaccionLocal.add(jLabelnumero_serieTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serieTransaccionLocal.add(jButtonnumero_serieTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_serieTransaccionLocal.add(jTextFieldnumero_serieTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_autorizacionTransaccionLocal.add(jLabelnumero_autorizacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizacionTransaccionLocal.add(jButtonnumero_autorizacionTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_autorizacionTransaccionLocal.add(jTextFieldnumero_autorizacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_caducidadTransaccionLocal.add(jLabelfecha_caducidadTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_caducidadTransaccionLocal.add(jButtonfecha_caducidadTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_caducidadTransaccionLocal.add(jDateChooserfecha_caducidadTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_tributarioTransaccionLocal.add(jLabelid_tipo_tributarioTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tributarioTransaccionLocal.add(jButtonid_tipo_tributarioTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 3;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tributarioTransaccionLocal.add(jButtonid_tipo_tributarioTransaccionLocalUpdate, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_tributarioTransaccionLocal.add(jComboBoxid_tipo_tributarioTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documento_contableTransaccionLocal.add(jLabelnumero_documento_contableTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documento_contableTransaccionLocal.add(jButtonnumero_documento_contableTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documento_contableTransaccionLocal.add(jTextFieldnumero_documento_contableTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableTransaccionLocal.add(jLabelid_asiento_contableTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 2;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableTransaccionLocal.add(jButtonid_asiento_contableTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 3;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableTransaccionLocal.add(jButtonid_asiento_contableTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 4;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableTransaccionLocal.add(jButtonid_asiento_contableTransaccionLocalUpdate, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableTransaccionLocal.add(jComboBoxid_asiento_contableTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_riseTransaccionLocal.add(jLabeles_riseTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_riseTransaccionLocal.add(jButtones_riseTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_riseTransaccionLocal.add(jCheckBoxes_riseTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbienes_ivaTransaccionLocal.add(jLabelbienes_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelbienes_ivaTransaccionLocal.add(jButtonbienes_ivaTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbienes_ivaTransaccionLocal.add(jTextFieldbienes_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbienes_sin_ivaTransaccionLocal.add(jLabelbienes_sin_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelbienes_sin_ivaTransaccionLocal.add(jButtonbienes_sin_ivaTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbienes_sin_ivaTransaccionLocal.add(jTextFieldbienes_sin_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_ivaTransaccionLocal.add(jLabelid_tipo_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaTransaccionLocal.add(jButtonid_tipo_ivaTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 3;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaTransaccionLocal.add(jButtonid_tipo_ivaTransaccionLocalUpdate, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_ivaTransaccionLocal.add(jComboBoxid_tipo_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelservicios_ivaTransaccionLocal.add(jLabelservicios_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelservicios_ivaTransaccionLocal.add(jButtonservicios_ivaTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelservicios_ivaTransaccionLocal.add(jTextFieldservicios_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelservicios_sin_ivaTransaccionLocal.add(jLabelservicios_sin_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelservicios_sin_ivaTransaccionLocal.add(jButtonservicios_sin_ivaTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelservicios_sin_ivaTransaccionLocal.add(jTextFieldservicios_sin_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_ivaTransaccionLocal.add(jLabelmonto_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_ivaTransaccionLocal.add(jButtonmonto_ivaTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_ivaTransaccionLocal.add(jTextFieldmonto_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaTransaccionLocal.add(jLabeltotal_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaTransaccionLocal.add(jButtontotal_ivaTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaTransaccionLocal.add(jTextFieldtotal_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaTransaccionLocal.add(jLabeltotal_sin_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaTransaccionLocal.add(jButtontotal_sin_ivaTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaTransaccionLocal.add(jTextFieldtotal_sin_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_iceTransaccionLocal.add(jLabelmonto_iceTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_iceTransaccionLocal.add(jButtonmonto_iceTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_iceTransaccionLocal.add(jTextFieldmonto_iceTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltransfe_iva_retenerTransaccionLocal.add(jLabeltransfe_iva_retenerTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltransfe_iva_retenerTransaccionLocal.add(jButtontransfe_iva_retenerTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltransfe_iva_retenerTransaccionLocal.add(jTextFieldtransfe_iva_retenerTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpresta_iva_retenerTransaccionLocal.add(jLabelpresta_iva_retenerTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelpresta_iva_retenerTransaccionLocal.add(jButtonpresta_iva_retenerTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpresta_iva_retenerTransaccionLocal.add(jTextFieldpresta_iva_retenerTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_ivaTransaccionLocal.add(jLabelid_tipo_retencion_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_ivaTransaccionLocal.add(jButtonid_tipo_retencion_ivaTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 3;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_ivaTransaccionLocal.add(jButtonid_tipo_retencion_ivaTransaccionLocalUpdate, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_ivaTransaccionLocal.add(jComboBoxid_tipo_retencion_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_iva_prestaTransaccionLocal.add(jLabelid_tipo_retencion_iva_prestaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_prestaTransaccionLocal.add(jButtonid_tipo_retencion_iva_prestaTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 3;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva_prestaTransaccionLocal.add(jButtonid_tipo_retencion_iva_prestaTransaccionLocalUpdate, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_iva_prestaTransaccionLocal.add(jComboBoxid_tipo_retencion_iva_prestaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltransfe_iva_retenidoTransaccionLocal.add(jLabeltransfe_iva_retenidoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPaneltransfe_iva_retenidoTransaccionLocal.add(jButtontransfe_iva_retenidoTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltransfe_iva_retenidoTransaccionLocal.add(jTextFieldtransfe_iva_retenidoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpresta_iva_retenidoTransaccionLocal.add(jLabelpresta_iva_retenidoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelpresta_iva_retenidoTransaccionLocal.add(jButtonpresta_iva_retenidoTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpresta_iva_retenidoTransaccionLocal.add(jTextFieldpresta_iva_retenidoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 0;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpermite_devolucionTransaccionLocal.add(jLabelpermite_devolucionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = 2;
		this.gridBagConstraintsTransaccionLocal.ipadx = 0;
		this.gridBagConstraintsTransaccionLocal.insets = new Insets(0, 0, 0, 0);
		this.jPanelpermite_devolucionTransaccionLocal.add(jButtonpermite_devolucionTransaccionLocalBusqueda, this.gridBagConstraintsTransaccionLocal);
	}

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransaccionLocal.gridy = 0;
	this.gridBagConstraintsTransaccionLocal.gridx = 1;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpermite_devolucionTransaccionLocal.add(jCheckBoxpermite_devolucionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTransaccionLocal.add(this.jPanelidentificacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposTransaccionLocal % 4==0) {
		iXPanelCamposTransaccionLocal=0;
		iYPanelCamposTransaccionLocal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposOcultosTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposOcultosTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccionLocal.add(this.jPanelid_compraTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposOcultosTransaccionLocal % 4==0) {
		iXPanelCamposOcultosTransaccionLocal=0;
		iYPanelCamposOcultosTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposOcultosTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposOcultosTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTransaccionLocal.add(this.jPanelid_asiento_contableTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposOcultosTransaccionLocal % 4==0) {
		iXPanelCamposOcultosTransaccionLocal=0;
		iYPanelCamposOcultosTransaccionLocal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelidTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelrucTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelrazon_socialTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelid_periodo_declaraTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelid_transaccion_contaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelid_clienteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelid_tipo_comprobanteTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelfecha_emisionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelfecha_registro_contableTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelnumero_secuencialTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelnumero_serieTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelnumero_autorizacionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelfecha_caducidadTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelid_tipo_tributarioTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPanelnumero_documento_contableTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciogeneralTransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciogeneralTransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTransaccionLocal.add(this.jPaneles_riseTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciogeneralTransaccionLocal % 3==0) {
		iXPanelCamposIniciogeneralTransaccionLocal=0;
		iYPanelCamposIniciogeneralTransaccionLocal++;
	}

	iXPanelCamposIniciovalores1TransaccionLocal=0;
	iYPanelCamposIniciovalores1TransaccionLocal++;


	if(!iXPanelCamposIniciovalores1TransaccionLocal.equals(0)) {
		iXPanelCamposIniciovalores1TransaccionLocal=0;
		iYPanelCamposIniciovalores1TransaccionLocal++;
	}

	JLabelMe jLabelTitulobienes_ivaTransaccionLocal = new JLabelMe();
	jLabelTitulobienes_ivaTransaccionLocal.setText("[Iva]                                                                            [Sin Iva]");
	jLabelTitulobienes_ivaTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulobienes_ivaTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulobienes_ivaTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTitulobienes_ivaTransaccionLocal);

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores1TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores1TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.gridwidth = 7;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores1TransaccionLocal.add(jLabelTitulobienes_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores1TransaccionLocal % 3==0) {
		iXPanelCamposIniciovalores1TransaccionLocal=0;
		iYPanelCamposIniciovalores1TransaccionLocal++;
	}

	if(!iXPanelCamposIniciovalores1TransaccionLocal.equals(0)) {
		iXPanelCamposIniciovalores1TransaccionLocal=0;
		iYPanelCamposIniciovalores1TransaccionLocal++;
	}


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores1TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores1TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores1TransaccionLocal.add(this.jPanelbienes_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores1TransaccionLocal % 3==0) {
		iXPanelCamposIniciovalores1TransaccionLocal=0;
		iYPanelCamposIniciovalores1TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores1TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores1TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores1TransaccionLocal.add(this.jPanelbienes_sin_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores1TransaccionLocal % 3==0) {
		iXPanelCamposIniciovalores1TransaccionLocal=0;
		iYPanelCamposIniciovalores1TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores1TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores1TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores1TransaccionLocal.add(this.jPanelid_tipo_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores1TransaccionLocal % 3==0) {
		iXPanelCamposIniciovalores1TransaccionLocal=0;
		iYPanelCamposIniciovalores1TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores1TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores1TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores1TransaccionLocal.add(this.jPanelservicios_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores1TransaccionLocal % 3==0) {
		iXPanelCamposIniciovalores1TransaccionLocal=0;
		iYPanelCamposIniciovalores1TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores1TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores1TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores1TransaccionLocal.add(this.jPanelservicios_sin_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores1TransaccionLocal % 3==0) {
		iXPanelCamposIniciovalores1TransaccionLocal=0;
		iYPanelCamposIniciovalores1TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores1TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores1TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores1TransaccionLocal.add(this.jPanelmonto_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores1TransaccionLocal % 3==0) {
		iXPanelCamposIniciovalores1TransaccionLocal=0;
		iYPanelCamposIniciovalores1TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores1TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores1TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores1TransaccionLocal.add(this.jPaneltotal_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores1TransaccionLocal % 3==0) {
		iXPanelCamposIniciovalores1TransaccionLocal=0;
		iYPanelCamposIniciovalores1TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores1TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores1TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores1TransaccionLocal.add(this.jPaneltotal_sin_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores1TransaccionLocal % 3==0) {
		iXPanelCamposIniciovalores1TransaccionLocal=0;
		iYPanelCamposIniciovalores1TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores1TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores1TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores1TransaccionLocal.add(this.jPanelmonto_iceTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores1TransaccionLocal % 3==0) {
		iXPanelCamposIniciovalores1TransaccionLocal=0;
		iYPanelCamposIniciovalores1TransaccionLocal++;
	}

	iXPanelCamposIniciovalores2TransaccionLocal=0;
	iYPanelCamposIniciovalores2TransaccionLocal++;


	if(!iXPanelCamposIniciovalores2TransaccionLocal.equals(0)) {
		iXPanelCamposIniciovalores2TransaccionLocal=0;
		iYPanelCamposIniciovalores2TransaccionLocal++;
	}

	JLabelMe jLabelTitulotransfe_iva_retenerTransaccionLocal = new JLabelMe();
	jLabelTitulotransfe_iva_retenerTransaccionLocal.setText("[Bienes]                                                                             [Servicios]");
	jLabelTitulotransfe_iva_retenerTransaccionLocal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulotransfe_iva_retenerTransaccionLocal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulotransfe_iva_retenerTransaccionLocal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTitulotransfe_iva_retenerTransaccionLocal);

	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores2TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores2TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	this.gridBagConstraintsTransaccionLocal.gridwidth = 7;
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores2TransaccionLocal.add(jLabelTitulotransfe_iva_retenerTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores2TransaccionLocal % 2==0) {
		iXPanelCamposIniciovalores2TransaccionLocal=0;
		iYPanelCamposIniciovalores2TransaccionLocal++;
	}

	if(!iXPanelCamposIniciovalores2TransaccionLocal.equals(0)) {
		iXPanelCamposIniciovalores2TransaccionLocal=0;
		iYPanelCamposIniciovalores2TransaccionLocal++;
	}


	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores2TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores2TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores2TransaccionLocal.add(this.jPaneltransfe_iva_retenerTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores2TransaccionLocal % 2==0) {
		iXPanelCamposIniciovalores2TransaccionLocal=0;
		iYPanelCamposIniciovalores2TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores2TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores2TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores2TransaccionLocal.add(this.jPanelpresta_iva_retenerTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores2TransaccionLocal % 2==0) {
		iXPanelCamposIniciovalores2TransaccionLocal=0;
		iYPanelCamposIniciovalores2TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores2TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores2TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores2TransaccionLocal.add(this.jPanelid_tipo_retencion_ivaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores2TransaccionLocal % 2==0) {
		iXPanelCamposIniciovalores2TransaccionLocal=0;
		iYPanelCamposIniciovalores2TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores2TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores2TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores2TransaccionLocal.add(this.jPanelid_tipo_retencion_iva_prestaTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores2TransaccionLocal % 2==0) {
		iXPanelCamposIniciovalores2TransaccionLocal=0;
		iYPanelCamposIniciovalores2TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores2TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores2TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores2TransaccionLocal.add(this.jPaneltransfe_iva_retenidoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores2TransaccionLocal % 2==0) {
		iXPanelCamposIniciovalores2TransaccionLocal=0;
		iYPanelCamposIniciovalores2TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores2TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores2TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores2TransaccionLocal.add(this.jPanelpresta_iva_retenidoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores2TransaccionLocal % 2==0) {
		iXPanelCamposIniciovalores2TransaccionLocal=0;
		iYPanelCamposIniciovalores2TransaccionLocal++;
	}
	this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransaccionLocal.gridy = iYPanelCamposIniciovalores2TransaccionLocal;
	this.gridBagConstraintsTransaccionLocal.gridx = iXPanelCamposIniciovalores2TransaccionLocal++;
	this.gridBagConstraintsTransaccionLocal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransaccionLocal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovalores2TransaccionLocal.add(this.jPanelpermite_devolucionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);



	if(iXPanelCamposIniciovalores2TransaccionLocal % 2==0) {
		iXPanelCamposIniciovalores2TransaccionLocal=0;
		iYPanelCamposIniciovalores2TransaccionLocal++;
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
			
		GridBagLayout gridaBagLayoutAccionesTransaccionLocal= new GridBagLayout();
		this.jPanelAccionesTransaccionLocal.setLayout(gridaBagLayoutAccionesTransaccionLocal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTransaccionLocal= new GridBagLayout();
		this.jPanelAccionesFormularioTransaccionLocal.setLayout(gridaBagLayoutAccionesFormularioTransaccionLocal);
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransaccionLocal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransaccionLocal.add(this.jComboBoxTiposAccionesFormularioTransaccionLocal, this.gridBagConstraintsTransaccionLocal);

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransaccionLocal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransaccionLocal.add(this.jCheckBoxPostAccionNuevoTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.transaccionlocalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransaccionLocal.add(this.jCheckBoxPostAccionSinCerrarTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.transaccionlocalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.transaccionlocalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransaccionLocal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransaccionLocal.add(this.jCheckBoxPostAccionSinMensajeTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXAccion++;
			
		this.jPanelAccionesTransaccionLocal.add(this.jButtonModificarTransaccionLocal, this.gridBagConstraintsTransaccionLocal);							

		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionLocal.gridy = 0;
		this.gridBagConstraintsTransaccionLocal.gridx =iPosXAccion++;
			
		this.jPanelAccionesTransaccionLocal.add(this.jButtonEliminarTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
			
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = 0;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccionLocal.add(this.jButtonActualizarTransaccionLocal, this.gridBagConstraintsTransaccionLocal);


		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = 0;		
		this.gridBagConstraintsTransaccionLocal.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransaccionLocal.add(this.jButtonGuardarCambiosTransaccionLocal, this.gridBagConstraintsTransaccionLocal);	
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = 0;		
		this.gridBagConstraintsTransaccionLocal.gridx =iPosXAccion++;
		
		this.jPanelAccionesTransaccionLocal.add(this.jButtonCancelarTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccionLocal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccionLocal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();						
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionLocal.gridx = 0;		
			//this.gridBagConstraintsTransaccionLocal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccionLocal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccionLocal.gridx =0;
		this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccionLocal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TransaccionLocalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTransaccionLocal = new TransaccionLocalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Transaccion Local DATOS");
			
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
			
	        //this.setTitle("[FOR] - Transaccion Local DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transaccion Local Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TransaccionLocalModel transaccionlocalModel=new TransaccionLocalModel(this);
			
			//SI USARA CLASE INTERNA
			//TransaccionLocalModel.TransaccionLocalFocusTraversalPolicy transaccionlocalFocusTraversalPolicy = transaccionlocalModel.new TransaccionLocalFocusTraversalPolicy(this);
			
			//transaccionlocalFocusTraversalPolicy.settransaccionlocalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(transaccionlocalModel);
			
			
			this.jContentPaneDetalleTransaccionLocal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTransaccionLocal = new GridBagLayout();	
			this.jContentPaneDetalleTransaccionLocal.setLayout(gridaBagLayoutDetalleTransaccionLocal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccionLocal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
				this.gridBagConstraintsTransaccionLocal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTransaccionLocal.gridx = 0;
					
				
				this.jContentPaneDetalleTransaccionLocal.add(jTtoolBarDetalleTransaccionLocal, gridBagConstraintsTransaccionLocal);								
				
}
			
			this.jScrollPanelDatosEdicionTransaccionLocal=   new JScrollPane(jContentPaneDetalleTransaccionLocal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccionLocal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionLocal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionLocal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTransaccionLocal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccionLocal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionLocal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionLocal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsTransaccionLocal.gridy = iGridyRelaciones++;
		this.gridBagConstraintsTransaccionLocal.gridx = 0;

		this.jContentPaneDetalleTransaccionLocal.add(jPanelCamposIniciogeneralTransaccionLocal, gridBagConstraintsTransaccionLocal);


		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsTransaccionLocal.gridy = iGridyRelaciones++;
		this.gridBagConstraintsTransaccionLocal.gridx = 0;

		this.jContentPaneDetalleTransaccionLocal.add(jPanelCamposIniciovalores1TransaccionLocal, gridBagConstraintsTransaccionLocal);


		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsTransaccionLocal.gridy = iGridyRelaciones++;
		this.gridBagConstraintsTransaccionLocal.gridx = 0;

		this.jContentPaneDetalleTransaccionLocal.add(jPanelCamposIniciovalores2TransaccionLocal, gridBagConstraintsTransaccionLocal);
			
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
						&& transaccionlocalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.transaccionlocalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTransaccionLocal= new GridBagConstraints();
						this.gridBagConstraintsTransaccionLocal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTransaccionLocal.gridx = 0;
						this.jContentPaneDetalleTransaccionLocal.add(this.jTabbedPaneRelacionesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTransaccionLocal.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTransaccionLocal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
					this.gridBagConstraintsTransaccionLocal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTransaccionLocal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTransaccionLocal.gridx = 0;
					
				
					this.jContentPaneDetalleTransaccionLocal.add(jPanelCamposOcultosTransaccionLocal, gridBagConstraintsTransaccionLocal);
				
					this.jPanelCamposOcultosTransaccionLocal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTransaccionLocal.gridx = 0;
	        this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTransaccionLocal.add(this.jPanelAccionesFormularioTransaccionLocal, this.gridBagConstraintsTransaccionLocal);							
			
			
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
	        this.gridBagConstraintsTransaccionLocal.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTransaccionLocal.gridx = 0;
	        
			
			this.jContentPaneDetalleTransaccionLocal.add(this.jPanelAccionesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTransaccionLocal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTransaccionLocal=   new JScrollPane(this.jPanelCamposTransaccionLocal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransaccionLocal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionLocal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransaccionLocal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionLocal.gridx = 0;
			this.gridBagConstraintsTransaccionLocal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTransaccionLocal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTransaccionLocal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionLocal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTransaccionLocal, this.gridBagConstraintsTransaccionLocal);			
			
			this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
			this.gridBagConstraintsTransaccionLocal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransaccionLocal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionLocal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
			
			
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionLocal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		
			
		this.gridBagConstraintsTransaccionLocal = new GridBagConstraints();
		this.gridBagConstraintsTransaccionLocal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionLocal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccionLocal, this.gridBagConstraintsTransaccionLocal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTransaccionLocal;//jContentPane;
		
		return jScrollPanelDatosEdicionTransaccionLocal;
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
