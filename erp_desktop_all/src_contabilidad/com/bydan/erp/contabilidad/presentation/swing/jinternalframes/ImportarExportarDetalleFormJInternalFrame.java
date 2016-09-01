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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.ImportarExportarConstantesFunciones;

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
public class ImportarExportarDetalleFormJInternalFrame extends ImportarExportarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	/*
	public JToolBar jTtoolBarDetalleImportarExportar;
	
	protected JMenuBar jmenuBarDetalleImportarExportar;
	
	protected JMenu jmenuDetalleImportarExportar;
	protected JMenu jmenuDetalleArchivoImportarExportar;
	protected JMenu jmenuDetalleAccionesImportarExportar;
	protected JMenu jmenuDetalleDatosImportarExportar;
	
	*/
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutImportarExportar;	
	protected GridBagConstraints gridBagConstraintsImportarExportar;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ImportarExportarBeanSwingJInternalFrameAdditional jInternalFrameDetalleImportarExportar;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected PeriodoImportExportBeanSwingJInternalFrame periodoimportexportBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodoimportexport="";

	protected TransaccionContaBeanSwingJInternalFrame transaccioncontaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionconta="";

	protected TipoImportacionBeanSwingJInternalFrame tipoimportacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoimportacion="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobante="";

	protected TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotributario="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoiva="";

	protected TipoIceBeanSwingJInternalFrame tipoiceBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoice="";

	protected TipoBancoBeanSwingJInternalFrame tipobancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipobanco="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobantebancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobantebanco="";
	
	public ImportarExportarSessionBean importarexportarSessionBean;
	
	
	
	
	public ModuloSessionBean moduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public PeriodoImportExportSessionBean periodoimportexportSessionBean;
	public TransaccionContaSessionBean transaccioncontaSessionBean;
	public TipoImportacionSessionBean tipoimportacionSessionBean;
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;
	public TipoTributarioSessionBean tipotributarioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoIvaSessionBean tipoivaSessionBean;
	public TipoIceSessionBean tipoiceSessionBean;
	public TipoBancoSessionBean tipobancoSessionBean;
	public TipoComprobanteSessionBean tipocomprobantebancoSessionBean;	
	
	public ImportarExportarLogic importarexportarLogic;
	
	public JScrollPane jScrollPanelDatosImportarExportar;
	public JScrollPane jScrollPanelDatosEdicionImportarExportar;
	public JScrollPane jScrollPanelDatosGeneralImportarExportar;
	
	protected JPanel jPanelCamposImportarExportar;    
	protected JPanel jPanelCamposOcultosImportarExportar;    	
	protected JPanel jPanelAccionesImportarExportar;
	protected JPanel jPanelAccionesFormularioImportarExportar;
    
	
	
	protected Integer iXPanelCamposImportarExportar=0;
	protected Integer iYPanelCamposImportarExportar=0;
	
	protected Integer iXPanelCamposOcultosImportarExportar=0;
	protected Integer iYPanelCamposOcultosImportarExportar=0;
	
	

	protected JPanel jPanelCamposIniciogeneralImportarExportar;
	protected Integer iXPanelCamposIniciogeneralImportarExportar=0;
	protected Integer iYPanelCamposIniciogeneralImportarExportar=0;

	protected JPanel jPanelCamposIniciovaloresImportarExportar;
	protected Integer iXPanelCamposIniciovaloresImportarExportar=0;
	protected Integer iYPanelCamposIniciovaloresImportarExportar=0;

	protected JPanel jPanelCamposIniciobancoImportarExportar;
	protected Integer iXPanelCamposIniciobancoImportarExportar=0;
	protected Integer iYPanelCamposIniciobancoImportarExportar=0;

	protected JPanel jPanelCamposIniciocomprobanteImportarExportar;
	protected Integer iXPanelCamposIniciocomprobanteImportarExportar=0;
	protected Integer iYPanelCamposIniciocomprobanteImportarExportar=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoImportarExportar;
	public JButton jButtonModificarImportarExportar;
	public JButton jButtonActualizarImportarExportar;
    public JButton jButtonEliminarImportarExportar;
	public JButton jButtonCancelarImportarExportar;
    public JButton jButtonGuardarCambiosImportarExportar;
	public JButton jButtonGuardarCambiosTablaImportarExportar;
	protected JButton jButtonCerrarImportarExportar;
	
	/*
	protected JButton jButtonProcesarInformacionImportarExportar;
	*/
	
	protected JCheckBox jCheckBoxPostAccionNuevoImportarExportar;
	protected JCheckBox jCheckBoxPostAccionSinCerrarImportarExportar;
	protected JCheckBox jCheckBoxPostAccionSinMensajeImportarExportar;
	
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarImportarExportar;
	protected JButton jButtonModificarToolBarImportarExportar;
	protected JButton jButtonActualizarToolBarImportarExportar;
    protected JButton jButtonEliminarToolBarImportarExportar;
	protected JButton jButtonCancelarToolBarImportarExportar;
    protected JButton jButtonGuardarCambiosToolBarImportarExportar;
	protected JButton jButtonGuardarCambiosTablaToolBarImportarExportar;
	protected JButton jButtonMostrarOcultarTablaToolBarImportarExportar;
	protected JButton jButtonCerrarToolBarImportarExportar;
	
	protected JButton jButtonProcesarInformacionToolBarImportarExportar;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoImportarExportar;
	protected JMenuItem jMenuItemModificarImportarExportar;
	protected JMenuItem jMenuItemActualizarImportarExportar;
    protected JMenuItem jMenuItemEliminarImportarExportar;
	protected JMenuItem jMenuItemCancelarImportarExportar;
    protected JMenuItem jMenuItemGuardarCambiosImportarExportar;
	protected JMenuItem jMenuItemGuardarCambiosTablaImportarExportar;
	protected JMenuItem jMenuItemCerrarImportarExportar;
	protected JMenuItem jMenuItemDetalleCerrarImportarExportar;
	protected JMenuItem jMenuItemDetalleMostarOcultarImportarExportar;
	
	protected JMenuItem jMenuItemProcesarInformacionImportarExportar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosImportarExportar;
	protected JMenuItem jMenuItemMostrarOcultarImportarExportar;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesImportarExportar;	
		
	/*
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesImportarExportar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesImportarExportar;
	*/
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioImportarExportar;
	
	/*	
	
	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidImportarExportar;
	public JLabel jLabelIdImportarExportar;
	public JLabel jLabelidImportarExportar;
	public JButton jButtonidImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelrucImportarExportar;
	public JLabel jLabelrucImportarExportar;
	public JTextField jTextFieldrucImportarExportar;
	public JButton jButtonrucImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelfechaImportarExportar;
	public JLabel jLabelfechaImportarExportar;
	//public JFormattedTextField jDateChooserfechaImportarExportar;

	public JDateChooser jDateChooserfechaImportarExportar;
	public JButton jButtonfechaImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteImportarExportar;
	public JLabel jLabelnumero_comprobanteImportarExportar;
	public JTextField jTextFieldnumero_comprobanteImportarExportar;
	public JButton jButtonnumero_comprobanteImportarExportarBusqueda= new JButtonMe();

	public JPanel jPaneldocumento_transporteImportarExportar;
	public JLabel jLabeldocumento_transporteImportarExportar;
	public JTextField jTextFielddocumento_transporteImportarExportar;
	public JButton jButtondocumento_transporteImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelnumero_referencia_comprobanteImportarExportar;
	public JLabel jLabelnumero_referencia_comprobanteImportarExportar;
	public JTextField jTextFieldnumero_referencia_comprobanteImportarExportar;
	public JButton jButtonnumero_referencia_comprobanteImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_fiscalImportarExportar;
	public JLabel jLabelcodigo_fiscalImportarExportar;
	public JTextField jTextFieldcodigo_fiscalImportarExportar;
	public JButton jButtoncodigo_fiscalImportarExportarBusqueda= new JButtonMe();

	public JPanel jPaneles_juridicoImportarExportar;
	public JLabel jLabeles_juridicoImportarExportar;
	public JCheckBox jCheckBoxes_juridicoImportarExportar;
	public JButton jButtones_juridicoImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelbase0ImportarExportar;
	public JLabel jLabelbase0ImportarExportar;
	public JTextField jTextFieldbase0ImportarExportar;
	public JButton jButtonbase0ImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelmonto_total_cifImportarExportar;
	public JLabel jLabelmonto_total_cifImportarExportar;
	public JTextField jTextFieldmonto_total_cifImportarExportar;
	public JButton jButtonmonto_total_cifImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelmonto_ivaImportarExportar;
	public JLabel jLabelmonto_ivaImportarExportar;
	public JTextField jTextFieldmonto_ivaImportarExportar;
	public JButton jButtonmonto_ivaImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelmonto_iceImportarExportar;
	public JLabel jLabelmonto_iceImportarExportar;
	public JTextField jTextFieldmonto_iceImportarExportar;
	public JButton jButtonmonto_iceImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelbase_generalImportarExportar;
	public JLabel jLabelbase_generalImportarExportar;
	public JTextField jTextFieldbase_generalImportarExportar;
	public JButton jButtonbase_generalImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelcon_convenioImportarExportar;
	public JLabel jLabelcon_convenioImportarExportar;
	public JCheckBox jCheckBoxcon_convenioImportarExportar;
	public JButton jButtoncon_convenioImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelcon_devolucionImportarExportar;
	public JLabel jLabelcon_devolucionImportarExportar;
	public JCheckBox jCheckBoxcon_devolucionImportarExportar;
	public JButton jButtoncon_devolucionImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionImportarExportar;
	public JLabel jLabelfecha_emisionImportarExportar;
	//public JFormattedTextField jDateChooserfecha_emisionImportarExportar;

	public JDateChooser jDateChooserfecha_emisionImportarExportar;
	public JButton jButtonfecha_emisionImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelnumero_serie_comprobanteImportarExportar;
	public JLabel jLabelnumero_serie_comprobanteImportarExportar;
	public JTextField jTextFieldnumero_serie_comprobanteImportarExportar;
	public JButton jButtonnumero_serie_comprobanteImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizacion_comprobanteImportarExportar;
	public JLabel jLabelnumero_autorizacion_comprobanteImportarExportar;
	public JTextField jTextFieldnumero_autorizacion_comprobanteImportarExportar;
	public JButton jButtonnumero_autorizacion_comprobanteImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencial_fuenteImportarExportar;
	public JLabel jLabelnumero_secuencial_fuenteImportarExportar;
	public JTextField jTextFieldnumero_secuencial_fuenteImportarExportar;
	public JButton jButtonnumero_secuencial_fuenteImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelvalor_fobImportarExportar;
	public JLabel jLabelvalor_fobImportarExportar;
	public JTextField jTextFieldvalor_fobImportarExportar;
	public JButton jButtonvalor_fobImportarExportarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloImportarExportar;
	public JLabel jLabelid_moduloImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloImportarExportar;
	public JButton jButtonid_moduloImportarExportar= new JButtonMe();
	public JButton jButtonid_moduloImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_moduloImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableImportarExportar;
	public JLabel jLabelid_asiento_contableImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableImportarExportar;
	public JButton jButtonid_asiento_contableImportarExportar= new JButtonMe();
	public JButton jButtonid_asiento_contableImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelid_periodo_import_exportImportarExportar;
	public JLabel jLabelid_periodo_import_exportImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_import_exportImportarExportar;
	public JButton jButtonid_periodo_import_exportImportarExportar= new JButtonMe();
	public JButton jButtonid_periodo_import_exportImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_periodo_import_exportImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_contaImportarExportar;
	public JLabel jLabelid_transaccion_contaImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_contaImportarExportar;
	public JButton jButtonid_transaccion_contaImportarExportar= new JButtonMe();
	public JButton jButtonid_transaccion_contaImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_contaImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_importacionImportarExportar;
	public JLabel jLabelid_tipo_importacionImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_importacionImportarExportar;
	public JButton jButtonid_tipo_importacionImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_importacionImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_importacionImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_comprobanteImportarExportar;
	public JLabel jLabelid_tipo_comprobanteImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comprobanteImportarExportar;
	public JButton jButtonid_tipo_comprobanteImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_tributarioImportarExportar;
	public JLabel jLabelid_tipo_tributarioImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tributarioImportarExportar;
	public JButton jButtonid_tipo_tributarioImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_tributarioImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tributarioImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteImportarExportar;
	public JLabel jLabelid_clienteImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteImportarExportar;
	public JButton jButtonid_clienteImportarExportar= new JButtonMe();
	public JButton jButtonid_clienteImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_clienteImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_ivaImportarExportar;
	public JLabel jLabelid_tipo_ivaImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ivaImportarExportar;
	public JButton jButtonid_tipo_ivaImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_ivaImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ivaImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_iceImportarExportar;
	public JLabel jLabelid_tipo_iceImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_iceImportarExportar;
	public JButton jButtonid_tipo_iceImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_iceImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_iceImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_bancoImportarExportar;
	public JLabel jLabelid_tipo_bancoImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_bancoImportarExportar;
	public JButton jButtonid_tipo_bancoImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_bancoImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_bancoImportarExportarBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_comprobante_bancoImportarExportar;
	public JLabel jLabelid_tipo_comprobante_bancoImportarExportar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comprobante_bancoImportarExportar;
	public JButton jButtonid_tipo_comprobante_bancoImportarExportar= new JButtonMe();
	public JButton jButtonid_tipo_comprobante_bancoImportarExportarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comprobante_bancoImportarExportarBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesImportarExportar;
	
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
	public int iHeightFormulario=1144;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ImportarExportarDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposImportarExportar=new JPanel();
				this.jPanelAccionesFormularioImportarExportar=new JPanel();
				this.jmenuBarDetalleImportarExportar=new JMenuBar();
				this.jTtoolBarDetalleImportarExportar=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportarExportarDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ImportarExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ImportarExportarDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ImportarExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportarExportarDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ImportarExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportarExportarDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ImportarExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportarExportarDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ImportarExportar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	public JButton getjButtonActualizarToolBarImportarExportar() {
		return this.jButtonActualizarToolBarImportarExportar;
	}
	
	public JButton getjButtonEliminarToolBarImportarExportar() {
		return this.jButtonEliminarToolBarImportarExportar;
	}
	
	public JButton getjButtonCancelarToolBarImportarExportar() {
		return this.jButtonCancelarToolBarImportarExportar;
	}		
	
	public JButton getjButtonProcesarInformacionImportarExportar() {
		return this.jButtonProcesarInformacionImportarExportar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionImportarExportar)	{
		this.jButtonProcesarInformacionImportarExportar = jButtonProcesarInformacionImportarExportar;
	}
	*/
	
	

	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesImportarExportar() {
		return this.jComboBoxTiposAccionesImportarExportar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesImportarExportar(
			JComboBox jComboBoxTiposRelacionesImportarExportar) {
		this.jComboBoxTiposRelacionesImportarExportar = jComboBoxTiposRelacionesImportarExportar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesImportarExportar(
			JComboBox jComboBoxTiposAccionesImportarExportar) {
		this.jComboBoxTiposAccionesImportarExportar = jComboBoxTiposAccionesImportarExportar;
	}		
	
	*/		
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioImportarExportar() {
		return this.jComboBoxTiposAccionesFormularioImportarExportar;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioImportarExportar(
			JComboBox jComboBoxTiposAccionesFormularioImportarExportar) {
		this.jComboBoxTiposAccionesFormularioImportarExportar = jComboBoxTiposAccionesFormularioImportarExportar;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.importarexportarSessionBean=new ImportarExportarSessionBean();
		
		this.importarexportarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.importarexportarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.importarexportarSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ImportarExportarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ImportarExportarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ImportarExportarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Importar Exportar MANTENIMIENTO"));
		
		
		if(iWidth > 3250) {
			iWidth=3250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.importarexportarSessionBean.getEsGuardarRelacionado()) {
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
	
		ImportarExportarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleImportarExportar= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarImportarExportar=new JButtonMe();
				this.jButtonModificarToolBarImportarExportar=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarImportarExportar,this.jTtoolBarDetalleImportarExportar,
							"actualizar","actualizar","Actualizar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarImportarExportar,this.jTtoolBarDetalleImportarExportar,
							"eliminar","eliminar","Eliminar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarImportarExportar,this.jTtoolBarDetalleImportarExportar,
							"cancelar","cancelar","Cancelar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarImportarExportar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarImportarExportar,this.jTtoolBarDetalleImportarExportar,
							"guardarcambios","guardarcambios","Guardar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	*/
	
	/*
	public void cargarMenus() {		
		
		this.jmenuBarDetalleImportarExportar=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleImportarExportar=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoImportarExportar=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesImportarExportar=new JMenuMe("Acciones");
		this.jmenuDetalleDatosImportarExportar=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoImportarExportar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoImportarExportar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoImportarExportar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarImportarExportar= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarImportarExportar.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarImportarExportar,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarImportarExportar= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarImportarExportar.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarImportarExportar,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarImportarExportar= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarImportarExportar.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarImportarExportar,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarImportarExportar= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarImportarExportar.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarImportarExportar,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosImportarExportar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosImportarExportar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosImportarExportar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarImportarExportar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarImportarExportar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarImportarExportar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarImportarExportar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarImportarExportar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarImportarExportar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarImportarExportar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarImportarExportar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarImportarExportar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarImportarExportar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarImportarExportar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarImportarExportar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoImportarExportar.add(this.jMenuItemDetalleCerrarImportarExportar);
		
		this.jmenuDetalleAccionesImportarExportar.add(this.jMenuItemActualizarImportarExportar);
		this.jmenuDetalleAccionesImportarExportar.add(this.jMenuItemEliminarImportarExportar);
		this.jmenuDetalleAccionesImportarExportar.add(this.jMenuItemCancelarImportarExportar);		
		
		//this.jmenuDetalleDatosImportarExportar.add(this.jMenuItemDetalleAbrirOrderByImportarExportar);				
		this.jmenuDetalleDatosImportarExportar.add(this.jMenuItemDetalleMostarOcultarImportarExportar);				
				
		//this.jmenuDetalleAccionesImportarExportar.add(this.jMenuItemGuardarCambiosImportarExportar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleImportarExportar.add(this.jmenuDetalleArchivoImportarExportar);		
		this.jmenuBarDetalleImportarExportar.add(this.jmenuDetalleAccionesImportarExportar);		
		this.jmenuBarDetalleImportarExportar.add(this.jmenuDetalleDatosImportarExportar);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleImportarExportar);				
	}
	*/
	
	public void inicializarElementosCamposImportarExportar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdImportarExportar = new JLabelMe();
		jLabelIdImportarExportar.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidImportarExportar = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutImportarExportar= new GridBagLayout();

		this.jPanelidImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);

		jLabelidImportarExportar = new JLabel();
		jLabelidImportarExportar.setText("Id");

		jLabelidImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelrucImportarExportar = new JLabelMe();
		this.jLabelrucImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_RUCINFORMANTE+" : *");
		this.jLabelrucImportarExportar.setToolTipText("Ruc Informa");
		this.jLabelrucImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_RUCINFORMANTE);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelrucImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldrucImportarExportar= new JTextFieldMe();

		jTextFieldrucImportarExportar.setEnabled(false);
		jTextFieldrucImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucImportarExportarBusqueda= new JButtonMe();
		this.jButtonrucImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucImportarExportarBusqueda.setText("U");
		this.jButtonrucImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelfechaImportarExportar = new JLabelMe();
		this.jLabelfechaImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaImportarExportar.setToolTipText("Fecha");
		this.jLabelfechaImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelfechaImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		//jFormattedTextFieldfechaImportarExportar= new JFormattedTextFieldMe();

		jDateChooserfechaImportarExportar= new JDateChooser();
		jDateChooserfechaImportarExportar.setEnabled(false);
		jDateChooserfechaImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaImportarExportar.setDate(new Date());
		jDateChooserfechaImportarExportar.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaImportarExportar.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaImportarExportarBusqueda= new JButtonMe();
		this.jButtonfechaImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaImportarExportarBusqueda.setText("U");
		this.jButtonfechaImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteImportarExportar = new JLabelMe();
		this.jLabelnumero_comprobanteImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteImportarExportar.setToolTipText("No Comp. PreImp");
		this.jLabelnumero_comprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelnumero_comprobanteImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldnumero_comprobanteImportarExportar= new JTextFieldMe();

		jTextFieldnumero_comprobanteImportarExportar.setEnabled(false);
		jTextFieldnumero_comprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteImportarExportarBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteImportarExportarBusqueda.setText("U");
		this.jButtonnumero_comprobanteImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabeldocumento_transporteImportarExportar = new JLabelMe();
		this.jLabeldocumento_transporteImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_DOCUMENTOTRANSPORTE+" : *");
		this.jLabeldocumento_transporteImportarExportar.setToolTipText("Doc. Transporte");
		this.jLabeldocumento_transporteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldocumento_transporteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldocumento_transporteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldocumento_transporteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldocumento_transporteImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldocumento_transporteImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_DOCUMENTOTRANSPORTE);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPaneldocumento_transporteImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFielddocumento_transporteImportarExportar= new JTextFieldMe();

		jTextFielddocumento_transporteImportarExportar.setEnabled(false);
		jTextFielddocumento_transporteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddocumento_transporteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddocumento_transporteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddocumento_transporteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtondocumento_transporteImportarExportarBusqueda= new JButtonMe();
		this.jButtondocumento_transporteImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondocumento_transporteImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondocumento_transporteImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondocumento_transporteImportarExportarBusqueda.setText("U");
		this.jButtondocumento_transporteImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondocumento_transporteImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondocumento_transporteImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddocumento_transporteImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddocumento_transporteImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"documento_transporteImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondocumento_transporteImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelnumero_referencia_comprobanteImportarExportar = new JLabelMe();
		this.jLabelnumero_referencia_comprobanteImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_NUMEROREFERENCIACOMPROBANTE+" : *");
		this.jLabelnumero_referencia_comprobanteImportarExportar.setToolTipText("No Ref. Comp.");
		this.jLabelnumero_referencia_comprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_referencia_comprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_referencia_comprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_referencia_comprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_referencia_comprobanteImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_referencia_comprobanteImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_NUMEROREFERENCIACOMPROBANTE);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelnumero_referencia_comprobanteImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldnumero_referencia_comprobanteImportarExportar= new JTextFieldMe();

		jTextFieldnumero_referencia_comprobanteImportarExportar.setEnabled(false);
		jTextFieldnumero_referencia_comprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_referencia_comprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_referencia_comprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_referencia_comprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_referencia_comprobanteImportarExportarBusqueda= new JButtonMe();
		this.jButtonnumero_referencia_comprobanteImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_referencia_comprobanteImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_referencia_comprobanteImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_referencia_comprobanteImportarExportarBusqueda.setText("U");
		this.jButtonnumero_referencia_comprobanteImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_referencia_comprobanteImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_referencia_comprobanteImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_referencia_comprobanteImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_referencia_comprobanteImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_referencia_comprobanteImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_referencia_comprobanteImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_fiscalImportarExportar = new JLabelMe();
		this.jLabelcodigo_fiscalImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_CODIGOFISCAL+" : *");
		this.jLabelcodigo_fiscalImportarExportar.setToolTipText("Identif. Fiscal Prov.");
		this.jLabelcodigo_fiscalImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_fiscalImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_fiscalImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_fiscalImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_fiscalImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_fiscalImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_CODIGOFISCAL);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelcodigo_fiscalImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldcodigo_fiscalImportarExportar= new JTextFieldMe();

		jTextFieldcodigo_fiscalImportarExportar.setEnabled(false);
		jTextFieldcodigo_fiscalImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_fiscalImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_fiscalImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_fiscalImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_fiscalImportarExportarBusqueda= new JButtonMe();
		this.jButtoncodigo_fiscalImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_fiscalImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_fiscalImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_fiscalImportarExportarBusqueda.setText("U");
		this.jButtoncodigo_fiscalImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_fiscalImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_fiscalImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_fiscalImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_fiscalImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_fiscalImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_fiscalImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabeles_juridicoImportarExportar = new JLabelMe();
		this.jLabeles_juridicoImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_ESJURIDICO+" : *");
		this.jLabeles_juridicoImportarExportar.setToolTipText("Es Juridico");
		this.jLabeles_juridicoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_juridicoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_juridicoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_juridicoImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_juridicoImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_juridicoImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_ESJURIDICO);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPaneles_juridicoImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jCheckBoxes_juridicoImportarExportar= new JCheckBoxMe();
		jCheckBoxes_juridicoImportarExportar.setEnabled(false);

		jCheckBoxes_juridicoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_juridicoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_juridicoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_juridicoImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_juridicoImportarExportarBusqueda= new JButtonMe();
		this.jButtones_juridicoImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_juridicoImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_juridicoImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_juridicoImportarExportarBusqueda.setText("U");
		this.jButtones_juridicoImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_juridicoImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_juridicoImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_juridicoImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_juridicoImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_juridicoImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_juridicoImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelbase0ImportarExportar = new JLabelMe();
		this.jLabelbase0ImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_BASE0+" : *");
		this.jLabelbase0ImportarExportar.setToolTipText("Base 0%");
		this.jLabelbase0ImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase0ImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase0ImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase0ImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase0ImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase0ImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_BASE0);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelbase0ImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldbase0ImportarExportar= new JTextFieldMe();
		jTextFieldbase0ImportarExportar.setEnabled(false);
		jTextFieldbase0ImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase0ImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase0ImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase0ImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase0ImportarExportar.setText("0.0");

		this.jButtonbase0ImportarExportarBusqueda= new JButtonMe();
		this.jButtonbase0ImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase0ImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase0ImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase0ImportarExportarBusqueda.setText("U");
		this.jButtonbase0ImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase0ImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase0ImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase0ImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase0ImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base0ImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase0ImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelmonto_total_cifImportarExportar = new JLabelMe();
		this.jLabelmonto_total_cifImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_MONTOTOTALCIF+" : *");
		this.jLabelmonto_total_cifImportarExportar.setToolTipText("Monto Total Cif");
		this.jLabelmonto_total_cifImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_total_cifImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_total_cifImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_total_cifImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_total_cifImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_total_cifImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_MONTOTOTALCIF);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelmonto_total_cifImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldmonto_total_cifImportarExportar= new JTextFieldMe();
		jTextFieldmonto_total_cifImportarExportar.setEnabled(false);
		jTextFieldmonto_total_cifImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_total_cifImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_total_cifImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_total_cifImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_total_cifImportarExportar.setText("0.0");

		this.jButtonmonto_total_cifImportarExportarBusqueda= new JButtonMe();
		this.jButtonmonto_total_cifImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_total_cifImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_total_cifImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_total_cifImportarExportarBusqueda.setText("U");
		this.jButtonmonto_total_cifImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_total_cifImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_total_cifImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_total_cifImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_total_cifImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_total_cifImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_total_cifImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelmonto_ivaImportarExportar = new JLabelMe();
		this.jLabelmonto_ivaImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_MONTOIVA+" : *");
		this.jLabelmonto_ivaImportarExportar.setToolTipText("Monto Iva");
		this.jLabelmonto_ivaImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_ivaImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_ivaImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_ivaImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_ivaImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_MONTOIVA);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelmonto_ivaImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldmonto_ivaImportarExportar= new JTextFieldMe();
		jTextFieldmonto_ivaImportarExportar.setEnabled(false);
		jTextFieldmonto_ivaImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_ivaImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_ivaImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_ivaImportarExportar.setText("0.0");

		this.jButtonmonto_ivaImportarExportarBusqueda= new JButtonMe();
		this.jButtonmonto_ivaImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_ivaImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_ivaImportarExportarBusqueda.setText("U");
		this.jButtonmonto_ivaImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_ivaImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_ivaImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_ivaImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_ivaImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_ivaImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_ivaImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelmonto_iceImportarExportar = new JLabelMe();
		this.jLabelmonto_iceImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_MONTOICE+" : *");
		this.jLabelmonto_iceImportarExportar.setToolTipText("Monto Ice");
		this.jLabelmonto_iceImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_iceImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_iceImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_iceImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_iceImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_iceImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_MONTOICE);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelmonto_iceImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldmonto_iceImportarExportar= new JTextFieldMe();
		jTextFieldmonto_iceImportarExportar.setEnabled(false);
		jTextFieldmonto_iceImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_iceImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_iceImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_iceImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_iceImportarExportar.setText("0.0");

		this.jButtonmonto_iceImportarExportarBusqueda= new JButtonMe();
		this.jButtonmonto_iceImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_iceImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_iceImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_iceImportarExportarBusqueda.setText("U");
		this.jButtonmonto_iceImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_iceImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_iceImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_iceImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_iceImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_iceImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_iceImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelbase_generalImportarExportar = new JLabelMe();
		this.jLabelbase_generalImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_BASEGENERAL+" : *");
		this.jLabelbase_generalImportarExportar.setToolTipText("Base Gr.");
		this.jLabelbase_generalImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_generalImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_generalImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_generalImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_generalImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_generalImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_BASEGENERAL);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelbase_generalImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldbase_generalImportarExportar= new JTextFieldMe();
		jTextFieldbase_generalImportarExportar.setEnabled(false);
		jTextFieldbase_generalImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_generalImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_generalImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_generalImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_generalImportarExportar.setText("0.0");

		this.jButtonbase_generalImportarExportarBusqueda= new JButtonMe();
		this.jButtonbase_generalImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_generalImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_generalImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_generalImportarExportarBusqueda.setText("U");
		this.jButtonbase_generalImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_generalImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_generalImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_generalImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_generalImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_generalImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_generalImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelcon_convenioImportarExportar = new JLabelMe();
		this.jLabelcon_convenioImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_CONCONVENIO+" : *");
		this.jLabelcon_convenioImportarExportar.setToolTipText("Convenio Int.");
		this.jLabelcon_convenioImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_convenioImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_convenioImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_convenioImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_convenioImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_convenioImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_CONCONVENIO);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelcon_convenioImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jCheckBoxcon_convenioImportarExportar= new JCheckBoxMe();
		jCheckBoxcon_convenioImportarExportar.setEnabled(false);

		jCheckBoxcon_convenioImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_convenioImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_convenioImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_convenioImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_convenioImportarExportarBusqueda= new JButtonMe();
		this.jButtoncon_convenioImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_convenioImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_convenioImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_convenioImportarExportarBusqueda.setText("U");
		this.jButtoncon_convenioImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_convenioImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_convenioImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_convenioImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_convenioImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_convenioImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_convenioImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelcon_devolucionImportarExportar = new JLabelMe();
		this.jLabelcon_devolucionImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_CONDEVOLUCION+" : *");
		this.jLabelcon_devolucionImportarExportar.setToolTipText("Devolucion");
		this.jLabelcon_devolucionImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_devolucionImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_devolucionImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_devolucionImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_devolucionImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_devolucionImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_CONDEVOLUCION);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelcon_devolucionImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jCheckBoxcon_devolucionImportarExportar= new JCheckBoxMe();
		jCheckBoxcon_devolucionImportarExportar.setEnabled(false);

		jCheckBoxcon_devolucionImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_devolucionImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_devolucionImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_devolucionImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_devolucionImportarExportarBusqueda= new JButtonMe();
		this.jButtoncon_devolucionImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_devolucionImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_devolucionImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_devolucionImportarExportarBusqueda.setText("U");
		this.jButtoncon_devolucionImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_devolucionImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_devolucionImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_devolucionImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_devolucionImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_devolucionImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_devolucionImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionImportarExportar = new JLabelMe();
		this.jLabelfecha_emisionImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionImportarExportar.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelfecha_emisionImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		//jFormattedTextFieldfecha_emisionImportarExportar= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionImportarExportar= new JDateChooser();
		jDateChooserfecha_emisionImportarExportar.setEnabled(false);
		jDateChooserfecha_emisionImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionImportarExportar.setDate(new Date());
		jDateChooserfecha_emisionImportarExportar.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionImportarExportar.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionImportarExportarBusqueda= new JButtonMe();
		this.jButtonfecha_emisionImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionImportarExportarBusqueda.setText("U");
		this.jButtonfecha_emisionImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelnumero_serie_comprobanteImportarExportar = new JLabelMe();
		this.jLabelnumero_serie_comprobanteImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_NUMEROSERIECOMPROBANTE+" : *");
		this.jLabelnumero_serie_comprobanteImportarExportar.setToolTipText("No Serie Comp.");
		this.jLabelnumero_serie_comprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serie_comprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serie_comprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serie_comprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serie_comprobanteImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serie_comprobanteImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_NUMEROSERIECOMPROBANTE);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelnumero_serie_comprobanteImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldnumero_serie_comprobanteImportarExportar= new JTextFieldMe();

		jTextFieldnumero_serie_comprobanteImportarExportar.setEnabled(false);
		jTextFieldnumero_serie_comprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serie_comprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serie_comprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serie_comprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_serie_comprobanteImportarExportarBusqueda= new JButtonMe();
		this.jButtonnumero_serie_comprobanteImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serie_comprobanteImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serie_comprobanteImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serie_comprobanteImportarExportarBusqueda.setText("U");
		this.jButtonnumero_serie_comprobanteImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serie_comprobanteImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serie_comprobanteImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serie_comprobanteImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serie_comprobanteImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serie_comprobanteImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serie_comprobanteImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizacion_comprobanteImportarExportar = new JLabelMe();
		this.jLabelnumero_autorizacion_comprobanteImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_NUMEROAUTORIZACIONCOMPROBANTE+" : *");
		this.jLabelnumero_autorizacion_comprobanteImportarExportar.setToolTipText("No Aut. Comp.");
		this.jLabelnumero_autorizacion_comprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_autorizacion_comprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_autorizacion_comprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacion_comprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizacion_comprobanteImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizacion_comprobanteImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_NUMEROAUTORIZACIONCOMPROBANTE);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelnumero_autorizacion_comprobanteImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldnumero_autorizacion_comprobanteImportarExportar= new JTextFieldMe();

		jTextFieldnumero_autorizacion_comprobanteImportarExportar.setEnabled(false);
		jTextFieldnumero_autorizacion_comprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacion_comprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacion_comprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacion_comprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizacion_comprobanteImportarExportarBusqueda= new JButtonMe();
		this.jButtonnumero_autorizacion_comprobanteImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacion_comprobanteImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacion_comprobanteImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizacion_comprobanteImportarExportarBusqueda.setText("U");
		this.jButtonnumero_autorizacion_comprobanteImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizacion_comprobanteImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizacion_comprobanteImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizacion_comprobanteImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizacion_comprobanteImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizacion_comprobanteImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizacion_comprobanteImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelnumero_secuencial_fuenteImportarExportar = new JLabelMe();
		this.jLabelnumero_secuencial_fuenteImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_NUMEROSECUENCIALFUENTE+" : *");
		this.jLabelnumero_secuencial_fuenteImportarExportar.setToolTipText("No. Sec. Comp.Fue/Dui/Das");
		this.jLabelnumero_secuencial_fuenteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_secuencial_fuenteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_secuencial_fuenteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencial_fuenteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencial_fuenteImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencial_fuenteImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_NUMEROSECUENCIALFUENTE);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelnumero_secuencial_fuenteImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldnumero_secuencial_fuenteImportarExportar= new JTextFieldMe();

		jTextFieldnumero_secuencial_fuenteImportarExportar.setEnabled(false);
		jTextFieldnumero_secuencial_fuenteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencial_fuenteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencial_fuenteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencial_fuenteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_secuencial_fuenteImportarExportarBusqueda= new JButtonMe();
		this.jButtonnumero_secuencial_fuenteImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencial_fuenteImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencial_fuenteImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencial_fuenteImportarExportarBusqueda.setText("U");
		this.jButtonnumero_secuencial_fuenteImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencial_fuenteImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencial_fuenteImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencial_fuenteImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencial_fuenteImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencial_fuenteImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencial_fuenteImportarExportarBusqueda.setVisible(false);		}


					
		this.jLabelvalor_fobImportarExportar = new JLabelMe();
		this.jLabelvalor_fobImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_VALORFOB+" : *");
		this.jLabelvalor_fobImportarExportar.setToolTipText("Valor FOB");
		this.jLabelvalor_fobImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_fobImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_fobImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_fobImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_fobImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_fobImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_VALORFOB);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelvalor_fobImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jTextFieldvalor_fobImportarExportar= new JTextFieldMe();
		jTextFieldvalor_fobImportarExportar.setEnabled(false);
		jTextFieldvalor_fobImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_fobImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_fobImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_fobImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_fobImportarExportar.setText("0.0");

		this.jButtonvalor_fobImportarExportarBusqueda= new JButtonMe();
		this.jButtonvalor_fobImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_fobImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_fobImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_fobImportarExportarBusqueda.setText("U");
		this.jButtonvalor_fobImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_fobImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_fobImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_fobImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_fobImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_fobImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_fobImportarExportarBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysImportarExportar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_moduloImportarExportar = new JLabelMe();
		this.jLabelid_moduloImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloImportarExportar.setToolTipText("Modulo");
		this.jLabelid_moduloImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelid_moduloImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jComboBoxid_moduloImportarExportar= new JComboBoxMe();
		jComboBoxid_moduloImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloImportarExportar.setEnabled(false);

		this.jButtonid_moduloImportarExportar= new JButtonMe();
		this.jButtonid_moduloImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloImportarExportar.setText("Buscar");
		this.jButtonid_moduloImportarExportar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloImportarExportar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloImportarExportar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloImportarExportar"));

		this.jButtonid_moduloImportarExportarBusqueda= new JButtonMe();
		this.jButtonid_moduloImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloImportarExportarBusqueda.setText("U");
		this.jButtonid_moduloImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloImportarExportarBusqueda.setVisible(false);		}

		this.jButtonid_moduloImportarExportarUpdate= new JButtonMe();
		this.jButtonid_moduloImportarExportarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloImportarExportarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloImportarExportarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloImportarExportarUpdate.setText("U");
		this.jButtonid_moduloImportarExportarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloImportarExportarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloImportarExportarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloImportarExportarUpdate"));



					
		this.jLabelid_asiento_contableImportarExportar = new JLabelMe();
		this.jLabelid_asiento_contableImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableImportarExportar.setToolTipText("Asiento C.");
		this.jLabelid_asiento_contableImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelid_asiento_contableImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jComboBoxid_asiento_contableImportarExportar= new JComboBoxMe();
		jComboBoxid_asiento_contableImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableImportarExportar= new JButtonMe();
		this.jButtonid_asiento_contableImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableImportarExportar.setText("Buscar");
		this.jButtonid_asiento_contableImportarExportar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableImportarExportar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableImportarExportar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableImportarExportar"));

		this.jButtonid_asiento_contableImportarExportarBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableImportarExportarBusqueda.setText("U");
		this.jButtonid_asiento_contableImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableImportarExportarBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableImportarExportarUpdate= new JButtonMe();
		this.jButtonid_asiento_contableImportarExportarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableImportarExportarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableImportarExportarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableImportarExportarUpdate.setText("U");
		this.jButtonid_asiento_contableImportarExportarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableImportarExportarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableImportarExportarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableImportarExportarUpdate"));



					
		this.jLabelid_periodo_import_exportImportarExportar = new JLabelMe();
		this.jLabelid_periodo_import_exportImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_IDPERIODOIMPORTEXPORT+" : *");
		this.jLabelid_periodo_import_exportImportarExportar.setToolTipText("Periodo");
		this.jLabelid_periodo_import_exportImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodo_import_exportImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodo_import_exportImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_import_exportImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodo_import_exportImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodo_import_exportImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_IDPERIODOIMPORTEXPORT);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelid_periodo_import_exportImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jComboBoxid_periodo_import_exportImportarExportar= new JComboBoxMe();
		jComboBoxid_periodo_import_exportImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_import_exportImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_import_exportImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_import_exportImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodo_import_exportImportarExportar= new JButtonMe();
		this.jButtonid_periodo_import_exportImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_import_exportImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_import_exportImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_import_exportImportarExportar.setText("Buscar");
		this.jButtonid_periodo_import_exportImportarExportar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodo_import_exportImportarExportar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_import_exportImportarExportar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodo_import_exportImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_import_exportImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_import_exportImportarExportar"));

		this.jButtonid_periodo_import_exportImportarExportarBusqueda= new JButtonMe();
		this.jButtonid_periodo_import_exportImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_import_exportImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_import_exportImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_import_exportImportarExportarBusqueda.setText("U");
		this.jButtonid_periodo_import_exportImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodo_import_exportImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_import_exportImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodo_import_exportImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_import_exportImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_import_exportImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodo_import_exportImportarExportarBusqueda.setVisible(false);		}

		this.jButtonid_periodo_import_exportImportarExportarUpdate= new JButtonMe();
		this.jButtonid_periodo_import_exportImportarExportarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_import_exportImportarExportarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_import_exportImportarExportarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_import_exportImportarExportarUpdate.setText("U");
		this.jButtonid_periodo_import_exportImportarExportarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodo_import_exportImportarExportarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_import_exportImportarExportarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodo_import_exportImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_import_exportImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_import_exportImportarExportarUpdate"));



					
		this.jLabelid_transaccion_contaImportarExportar = new JLabelMe();
		this.jLabelid_transaccion_contaImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_IDTRANSACCIONCONTA+" : *");
		this.jLabelid_transaccion_contaImportarExportar.setToolTipText("Transaccion");
		this.jLabelid_transaccion_contaImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_contaImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccion_contaImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_contaImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_contaImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_contaImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_IDTRANSACCIONCONTA);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelid_transaccion_contaImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jComboBoxid_transaccion_contaImportarExportar= new JComboBoxMe();
		jComboBoxid_transaccion_contaImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_contaImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_contaImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_contaImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_contaImportarExportar= new JButtonMe();
		this.jButtonid_transaccion_contaImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_contaImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_contaImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_contaImportarExportar.setText("Buscar");
		this.jButtonid_transaccion_contaImportarExportar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_contaImportarExportar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_contaImportarExportar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_contaImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_contaImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_contaImportarExportar"));

		this.jButtonid_transaccion_contaImportarExportarBusqueda= new JButtonMe();
		this.jButtonid_transaccion_contaImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_contaImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_contaImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_contaImportarExportarBusqueda.setText("U");
		this.jButtonid_transaccion_contaImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_contaImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_contaImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_contaImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_contaImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_contaImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_contaImportarExportarBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_contaImportarExportarUpdate= new JButtonMe();
		this.jButtonid_transaccion_contaImportarExportarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_contaImportarExportarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_contaImportarExportarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_contaImportarExportarUpdate.setText("U");
		this.jButtonid_transaccion_contaImportarExportarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_contaImportarExportarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_contaImportarExportarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_contaImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_contaImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_contaImportarExportarUpdate"));



					
		this.jLabelid_tipo_importacionImportarExportar = new JLabelMe();
		this.jLabelid_tipo_importacionImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_IDTIPOIMPORTACION+" :");
		this.jLabelid_tipo_importacionImportarExportar.setToolTipText("Tipo Importacion");
		this.jLabelid_tipo_importacionImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_importacionImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_importacionImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_importacionImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_importacionImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_importacionImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_IDTIPOIMPORTACION);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelid_tipo_importacionImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jComboBoxid_tipo_importacionImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_importacionImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_importacionImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_importacionImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_importacionImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_importacionImportarExportar= new JButtonMe();
		this.jButtonid_tipo_importacionImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_importacionImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_importacionImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_importacionImportarExportar.setText("Buscar");
		this.jButtonid_tipo_importacionImportarExportar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_importacionImportarExportar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_importacionImportarExportar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_importacionImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_importacionImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_importacionImportarExportar"));

		this.jButtonid_tipo_importacionImportarExportarBusqueda= new JButtonMe();
		this.jButtonid_tipo_importacionImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_importacionImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_importacionImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_importacionImportarExportarBusqueda.setText("U");
		this.jButtonid_tipo_importacionImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_importacionImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_importacionImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_importacionImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_importacionImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_importacionImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_importacionImportarExportarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_importacionImportarExportarUpdate= new JButtonMe();
		this.jButtonid_tipo_importacionImportarExportarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_importacionImportarExportarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_importacionImportarExportarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_importacionImportarExportarUpdate.setText("U");
		this.jButtonid_tipo_importacionImportarExportarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_importacionImportarExportarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_importacionImportarExportarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_importacionImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_importacionImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_importacionImportarExportarUpdate"));



					
		this.jLabelid_tipo_comprobanteImportarExportar = new JLabelMe();
		this.jLabelid_tipo_comprobanteImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_IDTIPOCOMPROBANTE+" : *");
		this.jLabelid_tipo_comprobanteImportarExportar.setToolTipText("Tipo Comprobante");
		this.jLabelid_tipo_comprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_comprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_comprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_comprobanteImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_comprobanteImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelid_tipo_comprobanteImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jComboBoxid_tipo_comprobanteImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_comprobanteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comprobanteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_comprobanteImportarExportar= new JButtonMe();
		this.jButtonid_tipo_comprobanteImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteImportarExportar.setText("Buscar");
		this.jButtonid_tipo_comprobanteImportarExportar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_comprobanteImportarExportar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteImportarExportar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_comprobanteImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteImportarExportar"));

		this.jButtonid_tipo_comprobanteImportarExportarBusqueda= new JButtonMe();
		this.jButtonid_tipo_comprobanteImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comprobanteImportarExportarBusqueda.setText("U");
		this.jButtonid_tipo_comprobanteImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_comprobanteImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_comprobanteImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_comprobanteImportarExportarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_comprobanteImportarExportarUpdate= new JButtonMe();
		this.jButtonid_tipo_comprobanteImportarExportarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteImportarExportarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteImportarExportarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comprobanteImportarExportarUpdate.setText("U");
		this.jButtonid_tipo_comprobanteImportarExportarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_comprobanteImportarExportarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteImportarExportarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_comprobanteImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteImportarExportarUpdate"));



					
		this.jLabelid_tipo_tributarioImportarExportar = new JLabelMe();
		this.jLabelid_tipo_tributarioImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_IDTIPOTRIBUTARIO+" : *");
		this.jLabelid_tipo_tributarioImportarExportar.setToolTipText("Sustento Tribut.");
		this.jLabelid_tipo_tributarioImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_tributarioImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_tributarioImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tributarioImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_tributarioImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_tributarioImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_IDTIPOTRIBUTARIO);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelid_tipo_tributarioImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jComboBoxid_tipo_tributarioImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_tributarioImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tributarioImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_tributarioImportarExportar= new JButtonMe();
		this.jButtonid_tipo_tributarioImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioImportarExportar.setText("Buscar");
		this.jButtonid_tipo_tributarioImportarExportar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_tributarioImportarExportar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioImportarExportar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_tributarioImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioImportarExportar"));

		this.jButtonid_tipo_tributarioImportarExportarBusqueda= new JButtonMe();
		this.jButtonid_tipo_tributarioImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tributarioImportarExportarBusqueda.setText("U");
		this.jButtonid_tipo_tributarioImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_tributarioImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_tributarioImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_tributarioImportarExportarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_tributarioImportarExportarUpdate= new JButtonMe();
		this.jButtonid_tipo_tributarioImportarExportarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioImportarExportarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioImportarExportarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tributarioImportarExportarUpdate.setText("U");
		this.jButtonid_tipo_tributarioImportarExportarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_tributarioImportarExportarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioImportarExportarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_tributarioImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioImportarExportarUpdate"));



					
		this.jLabelid_clienteImportarExportar = new JLabelMe();
		this.jLabelid_clienteImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteImportarExportar.setToolTipText("Proveedor");
		this.jLabelid_clienteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelid_clienteImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jComboBoxid_clienteImportarExportar= new JComboBoxMe();
		jComboBoxid_clienteImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteImportarExportar= new JButtonMe();
		this.jButtonid_clienteImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteImportarExportar.setText("Buscar");
		this.jButtonid_clienteImportarExportar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteImportarExportar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteImportarExportar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteImportarExportar"));

		this.jButtonid_clienteImportarExportarBusqueda= new JButtonMe();
		this.jButtonid_clienteImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteImportarExportarBusqueda.setText("U");
		this.jButtonid_clienteImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteImportarExportarBusqueda.setVisible(false);		}

		this.jButtonid_clienteImportarExportarUpdate= new JButtonMe();
		this.jButtonid_clienteImportarExportarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteImportarExportarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteImportarExportarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteImportarExportarUpdate.setText("U");
		this.jButtonid_clienteImportarExportarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteImportarExportarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteImportarExportarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteImportarExportarUpdate"));



					
		this.jLabelid_tipo_ivaImportarExportar = new JLabelMe();
		this.jLabelid_tipo_ivaImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_IDTIPOIVA+" : *");
		this.jLabelid_tipo_ivaImportarExportar.setToolTipText("% Iva");
		this.jLabelid_tipo_ivaImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_ivaImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ivaImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_ivaImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_ivaImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_IDTIPOIVA);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelid_tipo_ivaImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jComboBoxid_tipo_ivaImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_ivaImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ivaImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ivaImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_ivaImportarExportar= new JButtonMe();
		this.jButtonid_tipo_ivaImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_ivaImportarExportar.setText("Buscar");
		this.jButtonid_tipo_ivaImportarExportar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_ivaImportarExportar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaImportarExportar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_ivaImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaImportarExportar"));

		this.jButtonid_tipo_ivaImportarExportarBusqueda= new JButtonMe();
		this.jButtonid_tipo_ivaImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaImportarExportarBusqueda.setText("U");
		this.jButtonid_tipo_ivaImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_ivaImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_ivaImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_ivaImportarExportarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_ivaImportarExportarUpdate= new JButtonMe();
		this.jButtonid_tipo_ivaImportarExportarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaImportarExportarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_ivaImportarExportarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_ivaImportarExportarUpdate.setText("U");
		this.jButtonid_tipo_ivaImportarExportarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_ivaImportarExportarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_ivaImportarExportarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_ivaImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_ivaImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_ivaImportarExportarUpdate"));



					
		this.jLabelid_tipo_iceImportarExportar = new JLabelMe();
		this.jLabelid_tipo_iceImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_IDTIPOICE+" : *");
		this.jLabelid_tipo_iceImportarExportar.setToolTipText("Codigo Ice");
		this.jLabelid_tipo_iceImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_iceImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_iceImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_iceImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_iceImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_iceImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_IDTIPOICE);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelid_tipo_iceImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jComboBoxid_tipo_iceImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_iceImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_iceImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_iceImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_iceImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_iceImportarExportar= new JButtonMe();
		this.jButtonid_tipo_iceImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_iceImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_iceImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_iceImportarExportar.setText("Buscar");
		this.jButtonid_tipo_iceImportarExportar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_iceImportarExportar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_iceImportarExportar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_iceImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_iceImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_iceImportarExportar"));

		this.jButtonid_tipo_iceImportarExportarBusqueda= new JButtonMe();
		this.jButtonid_tipo_iceImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_iceImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_iceImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_iceImportarExportarBusqueda.setText("U");
		this.jButtonid_tipo_iceImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_iceImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_iceImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_iceImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_iceImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_iceImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_iceImportarExportarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_iceImportarExportarUpdate= new JButtonMe();
		this.jButtonid_tipo_iceImportarExportarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_iceImportarExportarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_iceImportarExportarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_iceImportarExportarUpdate.setText("U");
		this.jButtonid_tipo_iceImportarExportarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_iceImportarExportarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_iceImportarExportarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_iceImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_iceImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_iceImportarExportarUpdate"));



					
		this.jLabelid_tipo_bancoImportarExportar = new JLabelMe();
		this.jLabelid_tipo_bancoImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_IDTIPOBANCO+" : *");
		this.jLabelid_tipo_bancoImportarExportar.setToolTipText("Banco");
		this.jLabelid_tipo_bancoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_bancoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_bancoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_bancoImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_bancoImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_bancoImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_IDTIPOBANCO);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelid_tipo_bancoImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jComboBoxid_tipo_bancoImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_bancoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_bancoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_bancoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_bancoImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_bancoImportarExportar= new JButtonMe();
		this.jButtonid_tipo_bancoImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_bancoImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_bancoImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_bancoImportarExportar.setText("Buscar");
		this.jButtonid_tipo_bancoImportarExportar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_bancoImportarExportar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_bancoImportarExportar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_bancoImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_bancoImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_bancoImportarExportar"));

		this.jButtonid_tipo_bancoImportarExportarBusqueda= new JButtonMe();
		this.jButtonid_tipo_bancoImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_bancoImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_bancoImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_bancoImportarExportarBusqueda.setText("U");
		this.jButtonid_tipo_bancoImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_bancoImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_bancoImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_bancoImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_bancoImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_bancoImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_bancoImportarExportarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_bancoImportarExportarUpdate= new JButtonMe();
		this.jButtonid_tipo_bancoImportarExportarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_bancoImportarExportarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_bancoImportarExportarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_bancoImportarExportarUpdate.setText("U");
		this.jButtonid_tipo_bancoImportarExportarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_bancoImportarExportarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_bancoImportarExportarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_bancoImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_bancoImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_bancoImportarExportarUpdate"));



					
		this.jLabelid_tipo_comprobante_bancoImportarExportar = new JLabelMe();
		this.jLabelid_tipo_comprobante_bancoImportarExportar.setText(""+ImportarExportarConstantesFunciones.LABEL_IDTIPOCOMPROBANTEBANCO+" : *");
		this.jLabelid_tipo_comprobante_bancoImportarExportar.setToolTipText("T. Comprob");
		this.jLabelid_tipo_comprobante_bancoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_comprobante_bancoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_comprobante_bancoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comprobante_bancoImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_comprobante_bancoImportarExportar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_comprobante_bancoImportarExportar.setToolTipText(ImportarExportarConstantesFunciones.LABEL_IDTIPOCOMPROBANTEBANCO);
		this.gridaBagLayoutImportarExportar = new GridBagLayout();
		this.jPanelid_tipo_comprobante_bancoImportarExportar.setLayout(this.gridaBagLayoutImportarExportar);


		jComboBoxid_tipo_comprobante_bancoImportarExportar= new JComboBoxMe();
		jComboBoxid_tipo_comprobante_bancoImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobante_bancoImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobante_bancoImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comprobante_bancoImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_comprobante_bancoImportarExportar= new JButtonMe();
		this.jButtonid_tipo_comprobante_bancoImportarExportar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobante_bancoImportarExportar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobante_bancoImportarExportar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobante_bancoImportarExportar.setText("Buscar");
		this.jButtonid_tipo_comprobante_bancoImportarExportar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_comprobante_bancoImportarExportar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobante_bancoImportarExportar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_comprobante_bancoImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobante_bancoImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobante_bancoImportarExportar"));

		this.jButtonid_tipo_comprobante_bancoImportarExportarBusqueda= new JButtonMe();
		this.jButtonid_tipo_comprobante_bancoImportarExportarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobante_bancoImportarExportarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobante_bancoImportarExportarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comprobante_bancoImportarExportarBusqueda.setText("U");
		this.jButtonid_tipo_comprobante_bancoImportarExportarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_comprobante_bancoImportarExportarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobante_bancoImportarExportarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_comprobante_bancoImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobante_bancoImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobante_bancoImportarExportarBusqueda"));

		if(this.importarexportarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_comprobante_bancoImportarExportarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_comprobante_bancoImportarExportarUpdate= new JButtonMe();
		this.jButtonid_tipo_comprobante_bancoImportarExportarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobante_bancoImportarExportarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobante_bancoImportarExportarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comprobante_bancoImportarExportarUpdate.setText("U");
		this.jButtonid_tipo_comprobante_bancoImportarExportarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_comprobante_bancoImportarExportarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobante_bancoImportarExportarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_comprobante_bancoImportarExportar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobante_bancoImportarExportar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobante_bancoImportarExportarUpdate"));



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
		//this.jInternalFrameDetalleImportarExportar = new ImportarExportarBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Importar Exportar DATOS");
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutImportarExportar= new GridBagLayout();
		

		
		String sToolTipImportarExportar="";
		sToolTipImportarExportar=ImportarExportarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipImportarExportar+="(Contabilidad.ImportarExportar)";
		}
		
		if(!this.importarexportarSessionBean.getEsGuardarRelacionado()) {
			sToolTipImportarExportar+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoImportarExportar = new JButtonMe();
		this.jButtonModificarImportarExportar = new JButtonMe();
        this.jButtonActualizarImportarExportar = new JButtonMe();
        this.jButtonEliminarImportarExportar = new JButtonMe();
        this.jButtonCancelarImportarExportar = new JButtonMe();
        this.jButtonGuardarCambiosImportarExportar = new JButtonMe();
		this.jButtonGuardarCambiosTablaImportarExportar = new JButtonMe();
		this.jButtonCerrarImportarExportar = new JButtonMe();
		
		this.jScrollPanelDatosImportarExportar = new JScrollPane();   
        this.jScrollPanelDatosEdicionImportarExportar = new JScrollPane();
		this.jScrollPanelDatosGeneralImportarExportar = new JScrollPane();
				
		
		
		this.jPanelCamposImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciobancoImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocomprobanteImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Importar Exportar";
		
		if(!this.importarexportarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Importar Exportars" + this.sPath));
		} else {
			this.jScrollPanelDatosImportarExportar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposImportarExportar.setName("jPanelCamposImportarExportar"); 

		this.jPanelCamposOcultosImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosImportarExportar.setName("jPanelCamposOcultosImportarExportar"); 

        this.jPanelAccionesImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesImportarExportar.setToolTipText("Acciones");
        this.jPanelAccionesImportarExportar.setName("Acciones"); 

		this.jPanelAccionesFormularioImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioImportarExportar.setToolTipText("Acciones");
        this.jPanelAccionesFormularioImportarExportar.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralImportarExportar.setName("jPanelCamposFingeneralImportarExportar");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresImportarExportar.setName("jPanelCamposFinvaloresImportarExportar");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciobancoImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Banco"));
		this.jPanelCamposIniciobancoImportarExportar.setName("jPanelCamposFinbancoImportarExportar");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciobancoImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocomprobanteImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Comprobante"));
		this.jPanelCamposIniciocomprobanteImportarExportar.setName("jPanelCamposFincomprobanteImportarExportar");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocomprobanteImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoImportarExportar.setText("Nuevo");
		this.jButtonModificarImportarExportar.setText("Editar");
        this.jButtonActualizarImportarExportar.setText("Actualizar");
        this.jButtonEliminarImportarExportar.setText("Eliminar");
        this.jButtonCancelarImportarExportar.setText("Cancelar");
        this.jButtonGuardarCambiosImportarExportar.setText("Guardar");
		this.jButtonGuardarCambiosTablaImportarExportar.setText("Guardar");
		this.jButtonCerrarImportarExportar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoImportarExportar,"nuevo_button","Nuevo",this.importarexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarImportarExportar,"modificar_button","Editar",this.importarexportarSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarImportarExportar,"actualizar_button","Actualizar",this.importarexportarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarImportarExportar,"eliminar_button","Eliminar",this.importarexportarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarImportarExportar,"cancelar_button","Cancelar",this.importarexportarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosImportarExportar,"guardarcambios_button","Guardar",this.importarexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaImportarExportar,"guardarcambiostabla_button","Guardar",this.importarexportarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportarExportar,"cerrar_button","Salir",this.importarexportarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoImportarExportar.setToolTipText("Nuevo"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarImportarExportar.setToolTipText("Editar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarImportarExportar.setToolTipText("Actualizar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarImportarExportar.setToolTipText("Eliminar)"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarImportarExportar.setToolTipText("Cancelar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosImportarExportar.setToolTipText("Guardar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaImportarExportar.setToolTipText("Guardar"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarImportarExportar.setToolTipText("Salir"+" "+ImportarExportarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoImportarExportar";
		inputMap = this.jButtonNuevoImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoImportarExportar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoImportarExportar"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarImportarExportar";
		inputMap = this.jButtonActualizarImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarImportarExportar"));
		
		//ELIMINAR
		sMapKey = "EliminarImportarExportar";
		inputMap = this.jButtonEliminarImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarImportarExportar"));
		
		//CANCELAR	
		sMapKey = "CancelarImportarExportar";
		inputMap = this.jButtonCancelarImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarImportarExportar"));
		
		//CERRAR		
		sMapKey = "CerrarImportarExportar";
		inputMap = this.jButtonCerrarImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarImportarExportar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaImportarExportar";
		inputMap = this.jButtonGuardarCambiosTablaImportarExportar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaImportarExportar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaImportarExportar"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoImportarExportar = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoImportarExportar.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoImportarExportar.setToolTipText("Nuevo ImportarExportar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarImportarExportar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarImportarExportar.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarImportarExportar.setToolTipText("Sin Cerrar Ventana ImportarExportar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeImportarExportar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeImportarExportar.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeImportarExportar.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
		/*	
			
		this.jComboBoxTiposAccionesImportarExportar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesImportarExportar.setText("Accion");
		this.jComboBoxTiposAccionesImportarExportar.setToolTipText("Tipos de Acciones");
							
		*/

		this.jComboBoxTiposAccionesFormularioImportarExportar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioImportarExportar.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioImportarExportar.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesImportarExportar = new JLabelMe();
		
		this.jLabelAccionesImportarExportar.setText("Acciones");		
		this.jLabelAccionesImportarExportar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImportarExportar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImportarExportar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposImportarExportar();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysImportarExportar();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesImportarExportar=new JTabbedPane();
		this.jTabbedPaneRelacionesImportarExportar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesImportarExportar,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		/*
		this.jComboBoxTiposAccionesImportarExportar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImportarExportar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImportarExportar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesImportarExportar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		*/
		
		this.jComboBoxTiposAccionesFormularioImportarExportar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioImportarExportar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioImportarExportar.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioImportarExportar, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposImportarExportar = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosImportarExportar = new GridBagLayout();
		
		this.jPanelCamposImportarExportar.setLayout(gridaBagLayoutCamposImportarExportar);
		this.jPanelCamposOcultosImportarExportar.setLayout(gridaBagLayoutCamposOcultosImportarExportar);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralImportarExportar= new GridBagLayout();
		this.jPanelCamposIniciogeneralImportarExportar.setLayout(gridaBagLayoutCamposIniciogeneralImportarExportar);

		GridBagLayout gridaBagLayoutCamposIniciovaloresImportarExportar= new GridBagLayout();
		this.jPanelCamposIniciovaloresImportarExportar.setLayout(gridaBagLayoutCamposIniciovaloresImportarExportar);

		GridBagLayout gridaBagLayoutCamposIniciobancoImportarExportar= new GridBagLayout();
		this.jPanelCamposIniciobancoImportarExportar.setLayout(gridaBagLayoutCamposIniciobancoImportarExportar);

		GridBagLayout gridaBagLayoutCamposIniciocomprobanteImportarExportar= new GridBagLayout();
		this.jPanelCamposIniciocomprobanteImportarExportar.setLayout(gridaBagLayoutCamposIniciocomprobanteImportarExportar);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidImportarExportar.add(jLabelIdImportarExportar, this.gridBagConstraintsImportarExportar);



	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidImportarExportar.add(jLabelidImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_moduloImportarExportar.add(jLabelid_moduloImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloImportarExportar.add(jButtonid_moduloImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 3;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloImportarExportar.add(jButtonid_moduloImportarExportarUpdate, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_moduloImportarExportar.add(jComboBoxid_moduloImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableImportarExportar.add(jLabelid_asiento_contableImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 2;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableImportarExportar.add(jButtonid_asiento_contableImportarExportar, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 3;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableImportarExportar.add(jButtonid_asiento_contableImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 4;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableImportarExportar.add(jButtonid_asiento_contableImportarExportarUpdate, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableImportarExportar.add(jComboBoxid_asiento_contableImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelrucImportarExportar.add(jLabelrucImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucImportarExportar.add(jButtonrucImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelrucImportarExportar.add(jTextFieldrucImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodo_import_exportImportarExportar.add(jLabelid_periodo_import_exportImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_import_exportImportarExportar.add(jButtonid_periodo_import_exportImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 3;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_import_exportImportarExportar.add(jButtonid_periodo_import_exportImportarExportarUpdate, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodo_import_exportImportarExportar.add(jComboBoxid_periodo_import_exportImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transaccion_contaImportarExportar.add(jLabelid_transaccion_contaImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_contaImportarExportar.add(jButtonid_transaccion_contaImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 3;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_contaImportarExportar.add(jButtonid_transaccion_contaImportarExportarUpdate, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transaccion_contaImportarExportar.add(jComboBoxid_transaccion_contaImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaImportarExportar.add(jLabelfechaImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaImportarExportar.add(jButtonfechaImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaImportarExportar.add(jDateChooserfechaImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_importacionImportarExportar.add(jLabelid_tipo_importacionImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_importacionImportarExportar.add(jButtonid_tipo_importacionImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 3;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_importacionImportarExportar.add(jButtonid_tipo_importacionImportarExportarUpdate, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_importacionImportarExportar.add(jComboBoxid_tipo_importacionImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_comprobanteImportarExportar.add(jLabelid_tipo_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comprobanteImportarExportar.add(jButtonid_tipo_comprobanteImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 3;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comprobanteImportarExportar.add(jButtonid_tipo_comprobanteImportarExportarUpdate, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_comprobanteImportarExportar.add(jComboBoxid_tipo_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_comprobanteImportarExportar.add(jLabelnumero_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteImportarExportar.add(jButtonnumero_comprobanteImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_comprobanteImportarExportar.add(jTextFieldnumero_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldocumento_transporteImportarExportar.add(jLabeldocumento_transporteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPaneldocumento_transporteImportarExportar.add(jButtondocumento_transporteImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldocumento_transporteImportarExportar.add(jTextFielddocumento_transporteImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_referencia_comprobanteImportarExportar.add(jLabelnumero_referencia_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_referencia_comprobanteImportarExportar.add(jButtonnumero_referencia_comprobanteImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_referencia_comprobanteImportarExportar.add(jTextFieldnumero_referencia_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_tributarioImportarExportar.add(jLabelid_tipo_tributarioImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tributarioImportarExportar.add(jButtonid_tipo_tributarioImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 3;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tributarioImportarExportar.add(jButtonid_tipo_tributarioImportarExportarUpdate, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_tributarioImportarExportar.add(jComboBoxid_tipo_tributarioImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcodigo_fiscalImportarExportar.add(jLabelcodigo_fiscalImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_fiscalImportarExportar.add(jButtoncodigo_fiscalImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcodigo_fiscalImportarExportar.add(jTextFieldcodigo_fiscalImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteImportarExportar.add(jLabelid_clienteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 2;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteImportarExportar.add(jButtonid_clienteImportarExportar, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 3;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteImportarExportar.add(jButtonid_clienteImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 4;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteImportarExportar.add(jButtonid_clienteImportarExportarUpdate, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteImportarExportar.add(jComboBoxid_clienteImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneles_juridicoImportarExportar.add(jLabeles_juridicoImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_juridicoImportarExportar.add(jButtones_juridicoImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneles_juridicoImportarExportar.add(jCheckBoxes_juridicoImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbase0ImportarExportar.add(jLabelbase0ImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase0ImportarExportar.add(jButtonbase0ImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbase0ImportarExportar.add(jTextFieldbase0ImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_total_cifImportarExportar.add(jLabelmonto_total_cifImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_total_cifImportarExportar.add(jButtonmonto_total_cifImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_total_cifImportarExportar.add(jTextFieldmonto_total_cifImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_ivaImportarExportar.add(jLabelmonto_ivaImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_ivaImportarExportar.add(jButtonmonto_ivaImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_ivaImportarExportar.add(jTextFieldmonto_ivaImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_ivaImportarExportar.add(jLabelid_tipo_ivaImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaImportarExportar.add(jButtonid_tipo_ivaImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 3;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_ivaImportarExportar.add(jButtonid_tipo_ivaImportarExportarUpdate, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_ivaImportarExportar.add(jComboBoxid_tipo_ivaImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_iceImportarExportar.add(jLabelmonto_iceImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_iceImportarExportar.add(jButtonmonto_iceImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_iceImportarExportar.add(jTextFieldmonto_iceImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_iceImportarExportar.add(jLabelid_tipo_iceImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_iceImportarExportar.add(jButtonid_tipo_iceImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 3;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_iceImportarExportar.add(jButtonid_tipo_iceImportarExportarUpdate, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_iceImportarExportar.add(jComboBoxid_tipo_iceImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbase_generalImportarExportar.add(jLabelbase_generalImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_generalImportarExportar.add(jButtonbase_generalImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbase_generalImportarExportar.add(jTextFieldbase_generalImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_bancoImportarExportar.add(jLabelid_tipo_bancoImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_bancoImportarExportar.add(jButtonid_tipo_bancoImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 3;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_bancoImportarExportar.add(jButtonid_tipo_bancoImportarExportarUpdate, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_bancoImportarExportar.add(jComboBoxid_tipo_bancoImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_comprobante_bancoImportarExportar.add(jLabelid_tipo_comprobante_bancoImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comprobante_bancoImportarExportar.add(jButtonid_tipo_comprobante_bancoImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 3;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comprobante_bancoImportarExportar.add(jButtonid_tipo_comprobante_bancoImportarExportarUpdate, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_comprobante_bancoImportarExportar.add(jComboBoxid_tipo_comprobante_bancoImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_convenioImportarExportar.add(jLabelcon_convenioImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_convenioImportarExportar.add(jButtoncon_convenioImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_convenioImportarExportar.add(jCheckBoxcon_convenioImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_devolucionImportarExportar.add(jLabelcon_devolucionImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_devolucionImportarExportar.add(jButtoncon_devolucionImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_devolucionImportarExportar.add(jCheckBoxcon_devolucionImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionImportarExportar.add(jLabelfecha_emisionImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionImportarExportar.add(jButtonfecha_emisionImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionImportarExportar.add(jDateChooserfecha_emisionImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_serie_comprobanteImportarExportar.add(jLabelnumero_serie_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serie_comprobanteImportarExportar.add(jButtonnumero_serie_comprobanteImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_serie_comprobanteImportarExportar.add(jTextFieldnumero_serie_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_autorizacion_comprobanteImportarExportar.add(jLabelnumero_autorizacion_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizacion_comprobanteImportarExportar.add(jButtonnumero_autorizacion_comprobanteImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_autorizacion_comprobanteImportarExportar.add(jTextFieldnumero_autorizacion_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_secuencial_fuenteImportarExportar.add(jLabelnumero_secuencial_fuenteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencial_fuenteImportarExportar.add(jButtonnumero_secuencial_fuenteImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_secuencial_fuenteImportarExportar.add(jTextFieldnumero_secuencial_fuenteImportarExportar, this.gridBagConstraintsImportarExportar);


	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 0;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalor_fobImportarExportar.add(jLabelvalor_fobImportarExportar, this.gridBagConstraintsImportarExportar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		//this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = 2;
		this.gridBagConstraintsImportarExportar.ipadx = 0;
		this.gridBagConstraintsImportarExportar.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_fobImportarExportar.add(jButtonvalor_fobImportarExportarBusqueda, this.gridBagConstraintsImportarExportar);
	}

	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportarExportar.gridy = 0;
	this.gridBagConstraintsImportarExportar.gridx = 1;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalor_fobImportarExportar.add(jTextFieldvalor_fobImportarExportar, this.gridBagConstraintsImportarExportar);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposOcultosImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposOcultosImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosImportarExportar.add(this.jPanelid_moduloImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposOcultosImportarExportar % 2==0) {
		iXPanelCamposOcultosImportarExportar=0;
		iYPanelCamposOcultosImportarExportar++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelidImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelid_asiento_contableImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelrucImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelid_periodo_import_exportImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelid_transaccion_contaImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelfechaImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelid_tipo_importacionImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelid_tipo_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelnumero_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPaneldocumento_transporteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelnumero_referencia_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelid_tipo_tributarioImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelcodigo_fiscalImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPanelid_clienteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciogeneralImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciogeneralImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralImportarExportar.add(this.jPaneles_juridicoImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciogeneralImportarExportar % 2==0) {
		iXPanelCamposIniciogeneralImportarExportar=0;
		iYPanelCamposIniciogeneralImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciovaloresImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciovaloresImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovaloresImportarExportar.add(this.jPanelbase0ImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciovaloresImportarExportar % 2==0) {
		iXPanelCamposIniciovaloresImportarExportar=0;
		iYPanelCamposIniciovaloresImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciovaloresImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciovaloresImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovaloresImportarExportar.add(this.jPanelmonto_total_cifImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciovaloresImportarExportar % 2==0) {
		iXPanelCamposIniciovaloresImportarExportar=0;
		iYPanelCamposIniciovaloresImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciovaloresImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciovaloresImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovaloresImportarExportar.add(this.jPanelmonto_ivaImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciovaloresImportarExportar % 2==0) {
		iXPanelCamposIniciovaloresImportarExportar=0;
		iYPanelCamposIniciovaloresImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciovaloresImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciovaloresImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovaloresImportarExportar.add(this.jPanelid_tipo_ivaImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciovaloresImportarExportar % 2==0) {
		iXPanelCamposIniciovaloresImportarExportar=0;
		iYPanelCamposIniciovaloresImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciovaloresImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciovaloresImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovaloresImportarExportar.add(this.jPanelmonto_iceImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciovaloresImportarExportar % 2==0) {
		iXPanelCamposIniciovaloresImportarExportar=0;
		iYPanelCamposIniciovaloresImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciovaloresImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciovaloresImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovaloresImportarExportar.add(this.jPanelid_tipo_iceImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciovaloresImportarExportar % 2==0) {
		iXPanelCamposIniciovaloresImportarExportar=0;
		iYPanelCamposIniciovaloresImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciovaloresImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciovaloresImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovaloresImportarExportar.add(this.jPanelbase_generalImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciovaloresImportarExportar % 2==0) {
		iXPanelCamposIniciovaloresImportarExportar=0;
		iYPanelCamposIniciovaloresImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciobancoImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciobancoImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobancoImportarExportar.add(this.jPanelid_tipo_bancoImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciobancoImportarExportar % 1==0) {
		iXPanelCamposIniciobancoImportarExportar=0;
		iYPanelCamposIniciobancoImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciobancoImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciobancoImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobancoImportarExportar.add(this.jPanelid_tipo_comprobante_bancoImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciobancoImportarExportar % 1==0) {
		iXPanelCamposIniciobancoImportarExportar=0;
		iYPanelCamposIniciobancoImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciobancoImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciobancoImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobancoImportarExportar.add(this.jPanelcon_convenioImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciobancoImportarExportar % 1==0) {
		iXPanelCamposIniciobancoImportarExportar=0;
		iYPanelCamposIniciobancoImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciobancoImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciobancoImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobancoImportarExportar.add(this.jPanelcon_devolucionImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciobancoImportarExportar % 1==0) {
		iXPanelCamposIniciobancoImportarExportar=0;
		iYPanelCamposIniciobancoImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciobancoImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciobancoImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobancoImportarExportar.add(this.jPanelfecha_emisionImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciobancoImportarExportar % 1==0) {
		iXPanelCamposIniciobancoImportarExportar=0;
		iYPanelCamposIniciobancoImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciocomprobanteImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciocomprobanteImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocomprobanteImportarExportar.add(this.jPanelnumero_serie_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciocomprobanteImportarExportar % 1==0) {
		iXPanelCamposIniciocomprobanteImportarExportar=0;
		iYPanelCamposIniciocomprobanteImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciocomprobanteImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciocomprobanteImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocomprobanteImportarExportar.add(this.jPanelnumero_autorizacion_comprobanteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciocomprobanteImportarExportar % 1==0) {
		iXPanelCamposIniciocomprobanteImportarExportar=0;
		iYPanelCamposIniciocomprobanteImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciocomprobanteImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciocomprobanteImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocomprobanteImportarExportar.add(this.jPanelnumero_secuencial_fuenteImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciocomprobanteImportarExportar % 1==0) {
		iXPanelCamposIniciocomprobanteImportarExportar=0;
		iYPanelCamposIniciocomprobanteImportarExportar++;
	}
	this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportarExportar.gridy = iYPanelCamposIniciocomprobanteImportarExportar;
	this.gridBagConstraintsImportarExportar.gridx = iXPanelCamposIniciocomprobanteImportarExportar++;
	this.gridBagConstraintsImportarExportar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportarExportar.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocomprobanteImportarExportar.add(this.jPanelvalor_fobImportarExportar, this.gridBagConstraintsImportarExportar);



	if(iXPanelCamposIniciocomprobanteImportarExportar % 1==0) {
		iXPanelCamposIniciocomprobanteImportarExportar=0;
		iYPanelCamposIniciocomprobanteImportarExportar++;
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
			
		GridBagLayout gridaBagLayoutAccionesImportarExportar= new GridBagLayout();
		this.jPanelAccionesImportarExportar.setLayout(gridaBagLayoutAccionesImportarExportar);
		
		GridBagLayout gridaBagLayoutAccionesFormularioImportarExportar= new GridBagLayout();
		this.jPanelAccionesFormularioImportarExportar.setLayout(gridaBagLayoutAccionesFormularioImportarExportar);
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsImportarExportar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioImportarExportar.add(this.jComboBoxTiposAccionesFormularioImportarExportar, this.gridBagConstraintsImportarExportar);

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsImportarExportar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioImportarExportar.add(this.jCheckBoxPostAccionNuevoImportarExportar, this.gridBagConstraintsImportarExportar);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.importarexportarSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsImportarExportar.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioImportarExportar.add(this.jCheckBoxPostAccionSinCerrarImportarExportar, this.gridBagConstraintsImportarExportar);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.importarexportarSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.importarexportarSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsImportarExportar.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioImportarExportar.add(this.jCheckBoxPostAccionSinMensajeImportarExportar, this.gridBagConstraintsImportarExportar);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx = iPosXAccion++;
			
		this.jPanelAccionesImportarExportar.add(this.jButtonModificarImportarExportar, this.gridBagConstraintsImportarExportar);							

		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportarExportar.gridy = 0;
		this.gridBagConstraintsImportarExportar.gridx =iPosXAccion++;
			
		this.jPanelAccionesImportarExportar.add(this.jButtonEliminarImportarExportar, this.gridBagConstraintsImportarExportar);
		
			
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = 0;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXAccion++;
		
		this.jPanelAccionesImportarExportar.add(this.jButtonActualizarImportarExportar, this.gridBagConstraintsImportarExportar);


		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = 0;		
		this.gridBagConstraintsImportarExportar.gridx = iPosXAccion++;
		
		this.jPanelAccionesImportarExportar.add(this.jButtonGuardarCambiosImportarExportar, this.gridBagConstraintsImportarExportar);	
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = 0;		
		this.gridBagConstraintsImportarExportar.gridx =iPosXAccion++;
		
		this.jPanelAccionesImportarExportar.add(this.jButtonCancelarImportarExportar, this.gridBagConstraintsImportarExportar);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutImportarExportar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutImportarExportar);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.importarexportarSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();						
			this.gridBagConstraintsImportarExportar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsImportarExportar.gridx = 0;		
			//this.gridBagConstraintsImportarExportar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsImportarExportar.ipadx = 100;
				
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
		
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsImportarExportar.gridx =0;
		this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsImportarExportar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosImportarExportar, this.gridBagConstraintsImportarExportar);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ImportarExportarJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleImportarExportar = new ImportarExportarBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Importar Exportar DATOS");
			
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
			
	        //this.setTitle("[FOR] - Importar Exportar DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Importar Exportar Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ImportarExportarModel importarexportarModel=new ImportarExportarModel(this);
			
			//SI USARA CLASE INTERNA
			//ImportarExportarModel.ImportarExportarFocusTraversalPolicy importarexportarFocusTraversalPolicy = importarexportarModel.new ImportarExportarFocusTraversalPolicy(this);
			
			//importarexportarFocusTraversalPolicy.setimportarexportarJInternalFrame(this);
			
			this.setFocusTraversalPolicy(importarexportarModel);
			
			
			this.jContentPaneDetalleImportarExportar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleImportarExportar = new GridBagLayout();	
			this.jContentPaneDetalleImportarExportar.setLayout(gridaBagLayoutDetalleImportarExportar);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosImportarExportar = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				/*
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsImportarExportar = new GridBagConstraints();
				this.gridBagConstraintsImportarExportar.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsImportarExportar.gridx = 0;
					
				
				this.jContentPaneDetalleImportarExportar.add(jTtoolBarDetalleImportarExportar, gridBagConstraintsImportarExportar);								
				*/
}
			
			this.jScrollPanelDatosEdicionImportarExportar=   new JScrollPane(jContentPaneDetalleImportarExportar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionImportarExportar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImportarExportar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImportarExportar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralImportarExportar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralImportarExportar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImportarExportar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImportarExportar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsImportarExportar.gridy = iGridyRelaciones++;
		this.gridBagConstraintsImportarExportar.gridx = 0;
		this.gridBagConstraintsImportarExportar.gridwidth = 2;
		iGridyRelaciones = iGridyRelaciones++;
		iGridyRelaciones++;

		this.jContentPaneDetalleImportarExportar.add(jPanelCamposIniciogeneralImportarExportar, gridBagConstraintsImportarExportar);


		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsImportarExportar.gridy = 1;
		this.gridBagConstraintsImportarExportar.gridx = 0;
		this.gridBagConstraintsImportarExportar.gridwidth = 2;
		iGridyRelaciones = 1;
		iGridyRelaciones++;

		this.jContentPaneDetalleImportarExportar.add(jPanelCamposIniciovaloresImportarExportar, gridBagConstraintsImportarExportar);


		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsImportarExportar.gridy = 2;
		this.gridBagConstraintsImportarExportar.gridx = 0;
		iGridyRelaciones = 2;
		iGridyRelaciones++;

		this.jContentPaneDetalleImportarExportar.add(jPanelCamposIniciobancoImportarExportar, gridBagConstraintsImportarExportar);


		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsImportarExportar.gridy = 2;
		this.gridBagConstraintsImportarExportar.gridx = 1;
		iGridyRelaciones = 2;
		iGridyRelaciones++;

		this.jContentPaneDetalleImportarExportar.add(jPanelCamposIniciocomprobanteImportarExportar, gridBagConstraintsImportarExportar);
			
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
						&& importarexportarSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.importarexportarSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsImportarExportar= new GridBagConstraints();
						this.gridBagConstraintsImportarExportar.gridy = iGridyRelaciones++;
						this.gridBagConstraintsImportarExportar.gridx = 0;
						this.jContentPaneDetalleImportarExportar.add(this.jTabbedPaneRelacionesImportarExportar, this.gridBagConstraintsImportarExportar);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesImportarExportar.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosImportarExportar.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsImportarExportar = new GridBagConstraints();
					this.gridBagConstraintsImportarExportar.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsImportarExportar.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsImportarExportar.gridx = 0;
					
				
					this.jContentPaneDetalleImportarExportar.add(jPanelCamposOcultosImportarExportar, gridBagConstraintsImportarExportar);
				
					this.jPanelCamposOcultosImportarExportar.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsImportarExportar.gridx = 0;
	        this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleImportarExportar.add(this.jPanelAccionesFormularioImportarExportar, this.gridBagConstraintsImportarExportar);							
			
			
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
	        this.gridBagConstraintsImportarExportar.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsImportarExportar.gridx = 0;
	        
			
			this.jContentPaneDetalleImportarExportar.add(this.jPanelAccionesImportarExportar, this.gridBagConstraintsImportarExportar);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionImportarExportar);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionImportarExportar=   new JScrollPane(this.jPanelCamposImportarExportar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionImportarExportar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImportarExportar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImportarExportar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsImportarExportar.gridx = 0;
			this.gridBagConstraintsImportarExportar.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsImportarExportar.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsImportarExportar.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionImportarExportar, this.gridBagConstraintsImportarExportar);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsImportarExportar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioImportarExportar, this.gridBagConstraintsImportarExportar);			
			
			this.gridBagConstraintsImportarExportar = new GridBagConstraints();
			this.gridBagConstraintsImportarExportar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsImportarExportar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesImportarExportar, this.gridBagConstraintsImportarExportar);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportarExportar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposImportarExportar, this.gridBagConstraintsImportarExportar);
			
			
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportarExportar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosImportarExportar, this.gridBagConstraintsImportarExportar);
		
			
		this.gridBagConstraintsImportarExportar = new GridBagConstraints();
		this.gridBagConstraintsImportarExportar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsImportarExportar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesImportarExportar, this.gridBagConstraintsImportarExportar);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralImportarExportar;//jContentPane;
		
		return jScrollPanelDatosEdicionImportarExportar;
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
