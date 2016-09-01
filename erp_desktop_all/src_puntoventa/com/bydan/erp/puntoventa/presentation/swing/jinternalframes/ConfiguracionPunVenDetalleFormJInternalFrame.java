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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.ConfiguracionPunVenConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class ConfiguracionPunVenDetalleFormJInternalFrame extends ConfiguracionPunVenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConfiguracionPunVen;
	
	protected JMenuBar jmenuBarDetalleConfiguracionPunVen;
	
	protected JMenu jmenuDetalleConfiguracionPunVen;
	protected JMenu jmenuDetalleArchivoConfiguracionPunVen;
	protected JMenu jmenuDetalleAccionesConfiguracionPunVen;
	protected JMenu jmenuDetalleDatosConfiguracionPunVen;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConfiguracionPunVen;	
	protected GridBagConstraints gridBagConstraintsConfiguracionPunVen;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConfiguracionPunVenBeanSwingJInternalFrameAdditional jInternalFrameDetalleConfiguracionPunVen;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableefectivoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableefectivo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableiceBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableice="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableotrosBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableotros="";

	protected ClienteBeanSwingJInternalFrame clienteconsumidorfinalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_clienteconsumidorfinal="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentofactura="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentonotaventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentonotaventa="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentonotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentonotacredito="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentotarjetacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentotarjetacredito="";

	protected FormatoBeanSwingJInternalFrame formatofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatofactura="";

	protected FormatoBeanSwingJInternalFrame formatonotaventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonotaventa="";

	protected FormatoBeanSwingJInternalFrame formatonotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatonotacredito="";

	protected TransaccionBeanSwingJInternalFrame transaccionfacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionfactura="";

	protected TransaccionBeanSwingJInternalFrame transaccionnotaventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionnotaventa="";

	protected TransaccionBeanSwingJInternalFrame transaccionnotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccionnotacredito="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentafacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentafactura="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentanotaventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentanotaventa="";

	protected TransaccionBeanSwingJInternalFrame transaccioncuentanotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccioncuentanotacredito="";
	
	public ConfiguracionPunVenSessionBean configuracionpunvenSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public CuentaContableSessionBean cuentacontableefectivoSessionBean;
	public CuentaContableSessionBean cuentacontableiceSessionBean;
	public CuentaContableSessionBean cuentacontableotrosSessionBean;
	public ClienteSessionBean clienteconsumidorfinalSessionBean;
	public TipoDocumentoSessionBean tipodocumentofacturaSessionBean;
	public TipoDocumentoSessionBean tipodocumentonotaventaSessionBean;
	public TipoDocumentoSessionBean tipodocumentonotacreditoSessionBean;
	public TipoDocumentoSessionBean tipodocumentotarjetacreditoSessionBean;
	public FormatoSessionBean formatofacturaSessionBean;
	public FormatoSessionBean formatonotaventaSessionBean;
	public FormatoSessionBean formatonotacreditoSessionBean;
	public TransaccionSessionBean transaccionfacturaSessionBean;
	public TransaccionSessionBean transaccionnotaventaSessionBean;
	public TransaccionSessionBean transaccionnotacreditoSessionBean;
	public TransaccionSessionBean transaccioncuentafacturaSessionBean;
	public TransaccionSessionBean transaccioncuentanotaventaSessionBean;
	public TransaccionSessionBean transaccioncuentanotacreditoSessionBean;	
	
	public ConfiguracionPunVenLogic configuracionpunvenLogic;
	
	public JScrollPane jScrollPanelDatosConfiguracionPunVen;
	public JScrollPane jScrollPanelDatosEdicionConfiguracionPunVen;
	public JScrollPane jScrollPanelDatosGeneralConfiguracionPunVen;
	
	protected JPanel jPanelCamposConfiguracionPunVen;    
	protected JPanel jPanelCamposOcultosConfiguracionPunVen;    	
	protected JPanel jPanelAccionesConfiguracionPunVen;
	protected JPanel jPanelAccionesFormularioConfiguracionPunVen;
    
	
	
	protected JTabbedPane jTabbedPaneCamposConfiguracionPunVen;	
	protected Integer iXPanelCamposConfiguracionPunVen=0;
	protected Integer iYPanelCamposConfiguracionPunVen=0;
	
	protected Integer iXPanelCamposOcultosConfiguracionPunVen=0;
	protected Integer iYPanelCamposOcultosConfiguracionPunVen=0;
	
	

	protected JPanel jPanelCamposIniciocontableConfiguracionPunVen;
	protected Integer iXPanelCamposIniciocontableConfiguracionPunVen=0;
	protected Integer iYPanelCamposIniciocontableConfiguracionPunVen=0;

	protected JPanel jPanelCamposIniciodocumentoConfiguracionPunVen;
	protected Integer iXPanelCamposIniciodocumentoConfiguracionPunVen=0;
	protected Integer iYPanelCamposIniciodocumentoConfiguracionPunVen=0;

	protected JPanel jPanelCamposInicioformatoConfiguracionPunVen;
	protected Integer iXPanelCamposInicioformatoConfiguracionPunVen=0;
	protected Integer iYPanelCamposInicioformatoConfiguracionPunVen=0;

	protected JPanel jPanelCamposIniciotransaccionConfiguracionPunVen;
	protected Integer iXPanelCamposIniciotransaccionConfiguracionPunVen=0;
	protected Integer iYPanelCamposIniciotransaccionConfiguracionPunVen=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConfiguracionPunVen;
	public JButton jButtonModificarConfiguracionPunVen;
	public JButton jButtonActualizarConfiguracionPunVen;
    public JButton jButtonEliminarConfiguracionPunVen;
	public JButton jButtonCancelarConfiguracionPunVen;
    public JButton jButtonGuardarCambiosConfiguracionPunVen;
	public JButton jButtonGuardarCambiosTablaConfiguracionPunVen;
	protected JButton jButtonCerrarConfiguracionPunVen;
	
	
	protected JButton jButtonProcesarInformacionConfiguracionPunVen;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConfiguracionPunVen;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConfiguracionPunVen;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConfiguracionPunVen;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConfiguracionPunVen;
	protected JButton jButtonModificarToolBarConfiguracionPunVen;
	protected JButton jButtonActualizarToolBarConfiguracionPunVen;
    protected JButton jButtonEliminarToolBarConfiguracionPunVen;
	protected JButton jButtonCancelarToolBarConfiguracionPunVen;
    protected JButton jButtonGuardarCambiosToolBarConfiguracionPunVen;
	protected JButton jButtonGuardarCambiosTablaToolBarConfiguracionPunVen;
	protected JButton jButtonMostrarOcultarTablaToolBarConfiguracionPunVen;
	protected JButton jButtonCerrarToolBarConfiguracionPunVen;
	
	protected JButton jButtonProcesarInformacionToolBarConfiguracionPunVen;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConfiguracionPunVen;
	protected JMenuItem jMenuItemModificarConfiguracionPunVen;
	protected JMenuItem jMenuItemActualizarConfiguracionPunVen;
    protected JMenuItem jMenuItemEliminarConfiguracionPunVen;
	protected JMenuItem jMenuItemCancelarConfiguracionPunVen;
    protected JMenuItem jMenuItemGuardarCambiosConfiguracionPunVen;
	protected JMenuItem jMenuItemGuardarCambiosTablaConfiguracionPunVen;
	protected JMenuItem jMenuItemCerrarConfiguracionPunVen;
	protected JMenuItem jMenuItemDetalleCerrarConfiguracionPunVen;
	protected JMenuItem jMenuItemDetalleMostarOcultarConfiguracionPunVen;
	
	protected JMenuItem jMenuItemProcesarInformacionConfiguracionPunVen;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConfiguracionPunVen;
	protected JMenuItem jMenuItemMostrarOcultarConfiguracionPunVen;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConfiguracionPunVen;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConfiguracionPunVen;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConfiguracionPunVen;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConfiguracionPunVen;
	public JLabel jLabelIdConfiguracionPunVen;
	public JLabel jLabelidConfiguracionPunVen;
	public JButton jButtonidConfiguracionPunVenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaConfiguracionPunVen;
	public JLabel jLabelid_empresaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConfiguracionPunVen;
	public JButton jButtonid_empresaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_empresaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_empresaConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalConfiguracionPunVen;
	public JLabel jLabelid_sucursalConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalConfiguracionPunVen;
	public JButton jButtonid_sucursalConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_sucursalConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_sucursalConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaConfiguracionPunVen;
	public JLabel jLabelid_bodegaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaConfiguracionPunVen;
	public JButton jButtonid_bodegaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_bodegaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_bodegaConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_efectivoConfiguracionPunVen;
	public JLabel jLabelid_cuenta_contable_efectivoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen;
	public JButton jButtonid_cuenta_contable_efectivoConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_cuenta_contable_efectivoConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_efectivoConfiguracionPunVenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_efectivoConfiguracionPunVenArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_iceConfiguracionPunVen;
	public JLabel jLabelid_cuenta_contable_iceConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_iceConfiguracionPunVen;
	public JButton jButtonid_cuenta_contable_iceConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iceConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iceConfiguracionPunVenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iceConfiguracionPunVenArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_otrosConfiguracionPunVen;
	public JLabel jLabelid_cuenta_contable_otrosConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_otrosConfiguracionPunVen;
	public JButton jButtonid_cuenta_contable_otrosConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otrosConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otrosConfiguracionPunVenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otrosConfiguracionPunVenArbol= new JButtonMe();

	public JPanel jPanelid_cliente_consumidor_finalConfiguracionPunVen;
	public JLabel jLabelid_cliente_consumidor_finalConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cliente_consumidor_finalConfiguracionPunVen;
	public JButton jButtonid_cliente_consumidor_finalConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_cliente_consumidor_finalConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_cliente_consumidor_finalConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documento_facturaConfiguracionPunVen;
	public JLabel jLabelid_tipo_documento_facturaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_facturaConfiguracionPunVen;
	public JButton jButtonid_tipo_documento_facturaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_tipo_documento_facturaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_facturaConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documento_nota_ventaConfiguracionPunVen;
	public JLabel jLabelid_tipo_documento_nota_ventaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen;
	public JButton jButtonid_tipo_documento_nota_ventaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_ventaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_ventaConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documento_nota_creditoConfiguracionPunVen;
	public JLabel jLabelid_tipo_documento_nota_creditoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen;
	public JButton jButtonid_tipo_documento_nota_creditoConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_creditoConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_creditoConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documento_tarjeta_creditoConfiguracionPunVen;
	public JLabel jLabelid_tipo_documento_tarjeta_creditoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen;
	public JButton jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_facturaConfiguracionPunVen;
	public JLabel jLabelid_formato_facturaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_facturaConfiguracionPunVen;
	public JButton jButtonid_formato_facturaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_formato_facturaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_formato_facturaConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_nota_ventaConfiguracionPunVen;
	public JLabel jLabelid_formato_nota_ventaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nota_ventaConfiguracionPunVen;
	public JButton jButtonid_formato_nota_ventaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_formato_nota_ventaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_formato_nota_ventaConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_nota_creditoConfiguracionPunVen;
	public JLabel jLabelid_formato_nota_creditoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_nota_creditoConfiguracionPunVen;
	public JButton jButtonid_formato_nota_creditoConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_formato_nota_creditoConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_formato_nota_creditoConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_facturaConfiguracionPunVen;
	public JLabel jLabelid_transaccion_facturaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_facturaConfiguracionPunVen;
	public JButton jButtonid_transaccion_facturaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_transaccion_facturaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_facturaConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_nota_ventaConfiguracionPunVen;
	public JLabel jLabelid_transaccion_nota_ventaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_nota_ventaConfiguracionPunVen;
	public JButton jButtonid_transaccion_nota_ventaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_transaccion_nota_ventaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_nota_ventaConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_nota_creditoConfiguracionPunVen;
	public JLabel jLabelid_transaccion_nota_creditoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_nota_creditoConfiguracionPunVen;
	public JButton jButtonid_transaccion_nota_creditoConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_transaccion_nota_creditoConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_nota_creditoConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_cuenta_facturaConfiguracionPunVen;
	public JLabel jLabelid_transaccion_cuenta_facturaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen;
	public JButton jButtonid_transaccion_cuenta_facturaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_facturaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_facturaConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_cuenta_nota_ventaConfiguracionPunVen;
	public JLabel jLabelid_transaccion_cuenta_nota_ventaConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen;
	public JButton jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccion_cuenta_nota_creditoConfiguracionPunVen;
	public JLabel jLabelid_transaccion_cuenta_nota_creditoConfiguracionPunVen;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen;
	public JButton jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVen= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenUpdate= new JButtonMe();
	public JButton jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConfiguracionPunVen;
	
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
	public int iHeightFormulario=528;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ConfiguracionPunVenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConfiguracionPunVen=new JPanel();
				this.jPanelAccionesFormularioConfiguracionPunVen=new JPanel();
				this.jmenuBarDetalleConfiguracionPunVen=new JMenuBar();
				this.jTtoolBarDetalleConfiguracionPunVen=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConfiguracionPunVenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ConfiguracionPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConfiguracionPunVenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ConfiguracionPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConfiguracionPunVenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConfiguracionPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConfiguracionPunVenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConfiguracionPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConfiguracionPunVenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConfiguracionPunVen No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConfiguracionPunVen() {
		return this.jButtonActualizarToolBarConfiguracionPunVen;
	}
	
	public JButton getjButtonEliminarToolBarConfiguracionPunVen() {
		return this.jButtonEliminarToolBarConfiguracionPunVen;
	}
	
	public JButton getjButtonCancelarToolBarConfiguracionPunVen() {
		return this.jButtonCancelarToolBarConfiguracionPunVen;
	}		
	
	public JButton getjButtonProcesarInformacionConfiguracionPunVen() {
		return this.jButtonProcesarInformacionConfiguracionPunVen;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConfiguracionPunVen)	{
		this.jButtonProcesarInformacionConfiguracionPunVen = jButtonProcesarInformacionConfiguracionPunVen;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConfiguracionPunVen() {
		return this.jComboBoxTiposAccionesConfiguracionPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConfiguracionPunVen(
			JComboBox jComboBoxTiposRelacionesConfiguracionPunVen) {
		this.jComboBoxTiposRelacionesConfiguracionPunVen = jComboBoxTiposRelacionesConfiguracionPunVen;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConfiguracionPunVen(
			JComboBox jComboBoxTiposAccionesConfiguracionPunVen) {
		this.jComboBoxTiposAccionesConfiguracionPunVen = jComboBoxTiposAccionesConfiguracionPunVen;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConfiguracionPunVen() {
		return this.jComboBoxTiposAccionesFormularioConfiguracionPunVen;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConfiguracionPunVen(
			JComboBox jComboBoxTiposAccionesFormularioConfiguracionPunVen) {
		this.jComboBoxTiposAccionesFormularioConfiguracionPunVen = jComboBoxTiposAccionesFormularioConfiguracionPunVen;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.configuracionpunvenSessionBean=new ConfiguracionPunVenSessionBean();
		
		this.configuracionpunvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.configuracionpunvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.configuracionpunvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConfiguracionPunVenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConfiguracionPunVenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConfiguracionPunVenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Configuracion Pun Ven MANTENIMIENTO"));
		
		
		if(iWidth > 2050) {
			iWidth=2050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.configuracionpunvenSessionBean.getEsGuardarRelacionado()) {
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
	
		ConfiguracionPunVenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConfiguracionPunVen= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConfiguracionPunVen=new JButtonMe();
				this.jButtonModificarToolBarConfiguracionPunVen=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConfiguracionPunVen,this.jTtoolBarDetalleConfiguracionPunVen,
							"actualizar","actualizar","Actualizar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConfiguracionPunVen,this.jTtoolBarDetalleConfiguracionPunVen,
							"eliminar","eliminar","Eliminar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConfiguracionPunVen,this.jTtoolBarDetalleConfiguracionPunVen,
							"cancelar","cancelar","Cancelar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConfiguracionPunVen=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConfiguracionPunVen,this.jTtoolBarDetalleConfiguracionPunVen,
							"guardarcambios","guardarcambios","Guardar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConfiguracionPunVen=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConfiguracionPunVen=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConfiguracionPunVen=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConfiguracionPunVen=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConfiguracionPunVen=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConfiguracionPunVen= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConfiguracionPunVen.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConfiguracionPunVen,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConfiguracionPunVen= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConfiguracionPunVen.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConfiguracionPunVen,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConfiguracionPunVen= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConfiguracionPunVen.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConfiguracionPunVen,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConfiguracionPunVen= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConfiguracionPunVen.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConfiguracionPunVen,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConfiguracionPunVen= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConfiguracionPunVen.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConfiguracionPunVen,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConfiguracionPunVen= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConfiguracionPunVen.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConfiguracionPunVen,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConfiguracionPunVen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConfiguracionPunVen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConfiguracionPunVen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConfiguracionPunVen= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConfiguracionPunVen.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConfiguracionPunVen,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConfiguracionPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConfiguracionPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConfiguracionPunVen,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConfiguracionPunVen= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConfiguracionPunVen.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConfiguracionPunVen,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConfiguracionPunVen.add(this.jMenuItemDetalleCerrarConfiguracionPunVen);
		
		this.jmenuDetalleAccionesConfiguracionPunVen.add(this.jMenuItemActualizarConfiguracionPunVen);
		this.jmenuDetalleAccionesConfiguracionPunVen.add(this.jMenuItemEliminarConfiguracionPunVen);
		this.jmenuDetalleAccionesConfiguracionPunVen.add(this.jMenuItemCancelarConfiguracionPunVen);		
		
		//this.jmenuDetalleDatosConfiguracionPunVen.add(this.jMenuItemDetalleAbrirOrderByConfiguracionPunVen);				
		this.jmenuDetalleDatosConfiguracionPunVen.add(this.jMenuItemDetalleMostarOcultarConfiguracionPunVen);				
				
		//this.jmenuDetalleAccionesConfiguracionPunVen.add(this.jMenuItemGuardarCambiosConfiguracionPunVen);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConfiguracionPunVen.add(this.jmenuDetalleArchivoConfiguracionPunVen);		
		this.jmenuBarDetalleConfiguracionPunVen.add(this.jmenuDetalleAccionesConfiguracionPunVen);		
		this.jmenuBarDetalleConfiguracionPunVen.add(this.jmenuDetalleDatosConfiguracionPunVen);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConfiguracionPunVen);				
	}
	
	
	public void inicializarElementosCamposConfiguracionPunVen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConfiguracionPunVen = new JLabelMe();
		jLabelIdConfiguracionPunVen.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConfiguracionPunVen = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConfiguracionPunVen= new GridBagLayout();

		this.jPanelidConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);

		jLabelidConfiguracionPunVen = new JLabel();
		jLabelidConfiguracionPunVen.setText("Id");

		jLabelidConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysConfiguracionPunVen() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaConfiguracionPunVen = new JLabelMe();
		this.jLabelid_empresaConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConfiguracionPunVen.setToolTipText("Empresa");
		this.jLabelid_empresaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_empresaConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_empresaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_empresaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConfiguracionPunVen.setEnabled(false);

		this.jButtonid_empresaConfiguracionPunVen= new JButtonMe();
		this.jButtonid_empresaConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConfiguracionPunVen.setText("Buscar");
		this.jButtonid_empresaConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConfiguracionPunVen"));

		this.jButtonid_empresaConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_empresaConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_empresaConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_empresaConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_empresaConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_empresaConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConfiguracionPunVenUpdate"));



					
		this.jLabelid_sucursalConfiguracionPunVen = new JLabelMe();
		this.jLabelid_sucursalConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalConfiguracionPunVen.setToolTipText("Sucursal");
		this.jLabelid_sucursalConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_sucursalConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_sucursalConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_sucursalConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalConfiguracionPunVen.setEnabled(false);

		this.jButtonid_sucursalConfiguracionPunVen= new JButtonMe();
		this.jButtonid_sucursalConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalConfiguracionPunVen.setText("Buscar");
		this.jButtonid_sucursalConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalConfiguracionPunVen"));

		this.jButtonid_sucursalConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_sucursalConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_sucursalConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_sucursalConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_sucursalConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_sucursalConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalConfiguracionPunVenUpdate"));



					
		this.jLabelid_bodegaConfiguracionPunVen = new JLabelMe();
		this.jLabelid_bodegaConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaConfiguracionPunVen.setToolTipText("Bodega");
		this.jLabelid_bodegaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_bodegaConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_bodegaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_bodegaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaConfiguracionPunVen= new JButtonMe();
		this.jButtonid_bodegaConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaConfiguracionPunVen.setText("Buscar");
		this.jButtonid_bodegaConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaConfiguracionPunVen"));

		this.jButtonid_bodegaConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_bodegaConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_bodegaConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_bodegaConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_bodegaConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_bodegaConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaConfiguracionPunVenUpdate"));



					
		this.jLabelid_cuenta_contable_efectivoConfiguracionPunVen = new JLabelMe();
		this.jLabelid_cuenta_contable_efectivoConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDCUENTACONTABLEEFECTIVO+" : *");
		this.jLabelid_cuenta_contable_efectivoConfiguracionPunVen.setToolTipText("Cta Contable Efectivo");
		this.jLabelid_cuenta_contable_efectivoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_efectivoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_efectivoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_efectivoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_efectivoConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_efectivoConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDCUENTACONTABLEEFECTIVO);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_cuenta_contable_efectivoConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVen= new JButtonMe();
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVen.setText("Buscar");
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_efectivoConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_efectivoConfiguracionPunVen"));

		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_efectivoConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_efectivoConfiguracionPunVenUpdate"));


		jButtonid_cuenta_contable_efectivoConfiguracionPunVenArbol= new JButtonMe();
		jButtonid_cuenta_contable_efectivoConfiguracionPunVenArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_efectivoConfiguracionPunVenArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_efectivoConfiguracionPunVenArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_efectivoConfiguracionPunVenArbol.setText("Arbol");
		jButtonid_cuenta_contable_efectivoConfiguracionPunVenArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_efectivoConfiguracionPunVenArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_efectivoConfiguracionPunVenArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_efectivoConfiguracionPunVenArbol"));



					
		this.jLabelid_cuenta_contable_iceConfiguracionPunVen = new JLabelMe();
		this.jLabelid_cuenta_contable_iceConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDCUENTACONTABLEICE+" : *");
		this.jLabelid_cuenta_contable_iceConfiguracionPunVen.setToolTipText("Cta Contable Ice");
		this.jLabelid_cuenta_contable_iceConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_iceConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_iceConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_iceConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_iceConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_iceConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDCUENTACONTABLEICE);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_cuenta_contable_iceConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_cuenta_contable_iceConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_cuenta_contable_iceConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iceConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iceConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_iceConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_iceConfiguracionPunVen= new JButtonMe();
		this.jButtonid_cuenta_contable_iceConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iceConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iceConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iceConfiguracionPunVen.setText("Buscar");
		this.jButtonid_cuenta_contable_iceConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_iceConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iceConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_iceConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iceConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iceConfiguracionPunVen"));

		this.jButtonid_cuenta_contable_iceConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_iceConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iceConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iceConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iceConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_cuenta_contable_iceConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_iceConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iceConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_iceConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iceConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iceConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_iceConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_iceConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_iceConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iceConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iceConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iceConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_cuenta_contable_iceConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_iceConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iceConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_iceConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iceConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iceConfiguracionPunVenUpdate"));


		jButtonid_cuenta_contable_iceConfiguracionPunVenArbol= new JButtonMe();
		jButtonid_cuenta_contable_iceConfiguracionPunVenArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iceConfiguracionPunVenArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iceConfiguracionPunVenArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iceConfiguracionPunVenArbol.setText("Arbol");
		jButtonid_cuenta_contable_iceConfiguracionPunVenArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_iceConfiguracionPunVenArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iceConfiguracionPunVenArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_iceConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iceConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iceConfiguracionPunVenArbol"));



					
		this.jLabelid_cuenta_contable_otrosConfiguracionPunVen = new JLabelMe();
		this.jLabelid_cuenta_contable_otrosConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDCUENTACONTABLEOTROS+" : *");
		this.jLabelid_cuenta_contable_otrosConfiguracionPunVen.setToolTipText("Cta Contable Otros");
		this.jLabelid_cuenta_contable_otrosConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_otrosConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_otrosConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_otrosConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_otrosConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_otrosConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDCUENTACONTABLEOTROS);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_cuenta_contable_otrosConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_cuenta_contable_otrosConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_cuenta_contable_otrosConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_otrosConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_otrosConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_otrosConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_otrosConfiguracionPunVen= new JButtonMe();
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVen.setText("Buscar");
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_otrosConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_otrosConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_otrosConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_otrosConfiguracionPunVen"));

		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_otrosConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_otrosConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_otrosConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_otrosConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_otrosConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_otrosConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_otrosConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_otrosConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_otrosConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_otrosConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_otrosConfiguracionPunVenUpdate"));


		jButtonid_cuenta_contable_otrosConfiguracionPunVenArbol= new JButtonMe();
		jButtonid_cuenta_contable_otrosConfiguracionPunVenArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_otrosConfiguracionPunVenArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_otrosConfiguracionPunVenArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_otrosConfiguracionPunVenArbol.setText("Arbol");
		jButtonid_cuenta_contable_otrosConfiguracionPunVenArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_otrosConfiguracionPunVenArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_otrosConfiguracionPunVenArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_otrosConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_otrosConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_otrosConfiguracionPunVenArbol"));



					
		this.jLabelid_cliente_consumidor_finalConfiguracionPunVen = new JLabelMe();
		this.jLabelid_cliente_consumidor_finalConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDCLIENTECONSUMIDORFINAL+" : *");
		this.jLabelid_cliente_consumidor_finalConfiguracionPunVen.setToolTipText("Cliente Consumor Final");
		this.jLabelid_cliente_consumidor_finalConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cliente_consumidor_finalConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cliente_consumidor_finalConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cliente_consumidor_finalConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cliente_consumidor_finalConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cliente_consumidor_finalConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDCLIENTECONSUMIDORFINAL);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_cliente_consumidor_finalConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_cliente_consumidor_finalConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_cliente_consumidor_finalConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_consumidor_finalConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cliente_consumidor_finalConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cliente_consumidor_finalConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cliente_consumidor_finalConfiguracionPunVen= new JButtonMe();
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVen.setText("Buscar");
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_consumidor_finalConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cliente_consumidor_finalConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_consumidor_finalConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_consumidor_finalConfiguracionPunVen"));

		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_consumidor_finalConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_consumidor_finalConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cliente_consumidor_finalConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_consumidor_finalConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_consumidor_finalConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cliente_consumidor_finalConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cliente_consumidor_finalConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cliente_consumidor_finalConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cliente_consumidor_finalConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cliente_consumidor_finalConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cliente_consumidor_finalConfiguracionPunVenUpdate"));



					
		this.jLabelid_tipo_documento_facturaConfiguracionPunVen = new JLabelMe();
		this.jLabelid_tipo_documento_facturaConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDTIPODOCUMENTOFACTURA+" : *");
		this.jLabelid_tipo_documento_facturaConfiguracionPunVen.setToolTipText("T Documento Factura");
		this.jLabelid_tipo_documento_facturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_documento_facturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_documento_facturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_facturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documento_facturaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documento_facturaConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDTIPODOCUMENTOFACTURA);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_tipo_documento_facturaConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_tipo_documento_facturaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_tipo_documento_facturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_facturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_facturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_facturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documento_facturaConfiguracionPunVen= new JButtonMe();
		this.jButtonid_tipo_documento_facturaConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_facturaConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_facturaConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_facturaConfiguracionPunVen.setText("Buscar");
		this.jButtonid_tipo_documento_facturaConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documento_facturaConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_facturaConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documento_facturaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_facturaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_facturaConfiguracionPunVen"));

		this.jButtonid_tipo_documento_facturaConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_tipo_documento_facturaConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_facturaConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_facturaConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_facturaConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_tipo_documento_facturaConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documento_facturaConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_facturaConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documento_facturaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_facturaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_facturaConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documento_facturaConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documento_facturaConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_tipo_documento_facturaConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_facturaConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_facturaConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_facturaConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_tipo_documento_facturaConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documento_facturaConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_facturaConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documento_facturaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_facturaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_facturaConfiguracionPunVenUpdate"));



					
		this.jLabelid_tipo_documento_nota_ventaConfiguracionPunVen = new JLabelMe();
		this.jLabelid_tipo_documento_nota_ventaConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDTIPODOCUMENTONOTAVENTA+" : *");
		this.jLabelid_tipo_documento_nota_ventaConfiguracionPunVen.setToolTipText("T Documento Nota Venta");
		this.jLabelid_tipo_documento_nota_ventaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_nota_ventaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_nota_ventaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_nota_ventaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documento_nota_ventaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documento_nota_ventaConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDTIPODOCUMENTONOTAVENTA);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_tipo_documento_nota_ventaConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVen= new JButtonMe();
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVen.setText("Buscar");
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_nota_ventaConfiguracionPunVen"));

		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_nota_ventaConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_nota_ventaConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_nota_ventaConfiguracionPunVenUpdate"));



					
		this.jLabelid_tipo_documento_nota_creditoConfiguracionPunVen = new JLabelMe();
		this.jLabelid_tipo_documento_nota_creditoConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDTIPODOCUMENTONOTACREDITO+" : *");
		this.jLabelid_tipo_documento_nota_creditoConfiguracionPunVen.setToolTipText("T Documento Nota Credito");
		this.jLabelid_tipo_documento_nota_creditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_nota_creditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_nota_creditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_nota_creditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documento_nota_creditoConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documento_nota_creditoConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDTIPODOCUMENTONOTACREDITO);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_tipo_documento_nota_creditoConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVen= new JButtonMe();
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVen.setText("Buscar");
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_nota_creditoConfiguracionPunVen"));

		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_nota_creditoConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_nota_creditoConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_nota_creditoConfiguracionPunVenUpdate"));



					
		this.jLabelid_tipo_documento_tarjeta_creditoConfiguracionPunVen = new JLabelMe();
		this.jLabelid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDTIPODOCUMENTOTARJETACREDITO+" : *");
		this.jLabelid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setToolTipText("T Documento Tarjeta Credito");
		this.jLabelid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_tarjeta_creditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documento_tarjeta_creditoConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDTIPODOCUMENTOTARJETACREDITO);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVen= new JButtonMe();
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setText("Buscar");
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_tarjeta_creditoConfiguracionPunVen"));

		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_tarjeta_creditoConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_tarjeta_creditoConfiguracionPunVenUpdate"));



					
		this.jLabelid_formato_facturaConfiguracionPunVen = new JLabelMe();
		this.jLabelid_formato_facturaConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDFORMATOFACTURA+" : *");
		this.jLabelid_formato_facturaConfiguracionPunVen.setToolTipText("Formato Factura");
		this.jLabelid_formato_facturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_facturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_facturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_facturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_facturaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_facturaConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDFORMATOFACTURA);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_formato_facturaConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_formato_facturaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_formato_facturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_facturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_facturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_facturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_facturaConfiguracionPunVen= new JButtonMe();
		this.jButtonid_formato_facturaConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_facturaConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_facturaConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_facturaConfiguracionPunVen.setText("Buscar");
		this.jButtonid_formato_facturaConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_facturaConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_facturaConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_facturaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_facturaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_facturaConfiguracionPunVen"));

		this.jButtonid_formato_facturaConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_formato_facturaConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_facturaConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_facturaConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_facturaConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_formato_facturaConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_facturaConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_facturaConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_facturaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_facturaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_facturaConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_facturaConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_formato_facturaConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_formato_facturaConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_facturaConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_facturaConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_facturaConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_formato_facturaConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_facturaConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_facturaConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_facturaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_facturaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_facturaConfiguracionPunVenUpdate"));



					
		this.jLabelid_formato_nota_ventaConfiguracionPunVen = new JLabelMe();
		this.jLabelid_formato_nota_ventaConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDFORMATONOTAVENTA+" : *");
		this.jLabelid_formato_nota_ventaConfiguracionPunVen.setToolTipText("Formato Nota Venta");
		this.jLabelid_formato_nota_ventaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_nota_ventaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_nota_ventaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nota_ventaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_nota_ventaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_nota_ventaConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDFORMATONOTAVENTA);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_formato_nota_ventaConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_formato_nota_ventaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_formato_nota_ventaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nota_ventaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nota_ventaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nota_ventaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_nota_ventaConfiguracionPunVen= new JButtonMe();
		this.jButtonid_formato_nota_ventaConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nota_ventaConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nota_ventaConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nota_ventaConfiguracionPunVen.setText("Buscar");
		this.jButtonid_formato_nota_ventaConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_nota_ventaConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nota_ventaConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_nota_ventaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nota_ventaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nota_ventaConfiguracionPunVen"));

		this.jButtonid_formato_nota_ventaConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_formato_nota_ventaConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nota_ventaConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nota_ventaConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nota_ventaConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_formato_nota_ventaConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_nota_ventaConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nota_ventaConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_nota_ventaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nota_ventaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nota_ventaConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_nota_ventaConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_formato_nota_ventaConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_formato_nota_ventaConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nota_ventaConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nota_ventaConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nota_ventaConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_formato_nota_ventaConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_nota_ventaConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nota_ventaConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_nota_ventaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nota_ventaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nota_ventaConfiguracionPunVenUpdate"));



					
		this.jLabelid_formato_nota_creditoConfiguracionPunVen = new JLabelMe();
		this.jLabelid_formato_nota_creditoConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDFORMATONOTACREDITO+" : *");
		this.jLabelid_formato_nota_creditoConfiguracionPunVen.setToolTipText("Formato Nota Credito");
		this.jLabelid_formato_nota_creditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_nota_creditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_nota_creditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_nota_creditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_nota_creditoConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_nota_creditoConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDFORMATONOTACREDITO);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_formato_nota_creditoConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_formato_nota_creditoConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_formato_nota_creditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nota_creditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_nota_creditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_nota_creditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_nota_creditoConfiguracionPunVen= new JButtonMe();
		this.jButtonid_formato_nota_creditoConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nota_creditoConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nota_creditoConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_nota_creditoConfiguracionPunVen.setText("Buscar");
		this.jButtonid_formato_nota_creditoConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_nota_creditoConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nota_creditoConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_nota_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nota_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nota_creditoConfiguracionPunVen"));

		this.jButtonid_formato_nota_creditoConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_formato_nota_creditoConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nota_creditoConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nota_creditoConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nota_creditoConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_formato_nota_creditoConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_nota_creditoConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nota_creditoConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_nota_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nota_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nota_creditoConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_nota_creditoConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_formato_nota_creditoConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_formato_nota_creditoConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nota_creditoConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_nota_creditoConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_nota_creditoConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_formato_nota_creditoConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_nota_creditoConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_nota_creditoConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_nota_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_nota_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_nota_creditoConfiguracionPunVenUpdate"));



					
		this.jLabelid_transaccion_facturaConfiguracionPunVen = new JLabelMe();
		this.jLabelid_transaccion_facturaConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONFACTURA+" : *");
		this.jLabelid_transaccion_facturaConfiguracionPunVen.setToolTipText("Transaccion Factura");
		this.jLabelid_transaccion_facturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_facturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_transaccion_facturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_facturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_facturaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_facturaConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONFACTURA);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_transaccion_facturaConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_transaccion_facturaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_transaccion_facturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_facturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_facturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_facturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_facturaConfiguracionPunVen= new JButtonMe();
		this.jButtonid_transaccion_facturaConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_facturaConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_facturaConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_facturaConfiguracionPunVen.setText("Buscar");
		this.jButtonid_transaccion_facturaConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_facturaConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_facturaConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_facturaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_facturaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_facturaConfiguracionPunVen"));

		this.jButtonid_transaccion_facturaConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_transaccion_facturaConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_facturaConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_facturaConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_facturaConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_transaccion_facturaConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_facturaConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_facturaConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_facturaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_facturaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_facturaConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_facturaConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_facturaConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_transaccion_facturaConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_facturaConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_facturaConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_facturaConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_transaccion_facturaConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_facturaConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_facturaConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_facturaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_facturaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_facturaConfiguracionPunVenUpdate"));



					
		this.jLabelid_transaccion_nota_ventaConfiguracionPunVen = new JLabelMe();
		this.jLabelid_transaccion_nota_ventaConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONNOTAVENTA+" : *");
		this.jLabelid_transaccion_nota_ventaConfiguracionPunVen.setToolTipText("Transaccion Nota Venta");
		this.jLabelid_transaccion_nota_ventaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_nota_ventaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_nota_ventaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_nota_ventaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_nota_ventaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_nota_ventaConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONNOTAVENTA);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_transaccion_nota_ventaConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_transaccion_nota_ventaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_transaccion_nota_ventaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_nota_ventaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_nota_ventaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_nota_ventaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_nota_ventaConfiguracionPunVen= new JButtonMe();
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVen.setText("Buscar");
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_nota_ventaConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_nota_ventaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_nota_ventaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_nota_ventaConfiguracionPunVen"));

		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_nota_ventaConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_nota_ventaConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_nota_ventaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_nota_ventaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_nota_ventaConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_nota_ventaConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_nota_ventaConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_nota_ventaConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_nota_ventaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_nota_ventaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_nota_ventaConfiguracionPunVenUpdate"));



					
		this.jLabelid_transaccion_nota_creditoConfiguracionPunVen = new JLabelMe();
		this.jLabelid_transaccion_nota_creditoConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONNOTACREDITO+" : *");
		this.jLabelid_transaccion_nota_creditoConfiguracionPunVen.setToolTipText("Transaccion Nota Credito");
		this.jLabelid_transaccion_nota_creditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_nota_creditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_nota_creditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_nota_creditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_nota_creditoConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_nota_creditoConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONNOTACREDITO);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_transaccion_nota_creditoConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_transaccion_nota_creditoConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_transaccion_nota_creditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_nota_creditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_nota_creditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_nota_creditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_nota_creditoConfiguracionPunVen= new JButtonMe();
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVen.setText("Buscar");
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_nota_creditoConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_nota_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_nota_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_nota_creditoConfiguracionPunVen"));

		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_nota_creditoConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_nota_creditoConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_nota_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_nota_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_nota_creditoConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_nota_creditoConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_nota_creditoConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_nota_creditoConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_nota_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_nota_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_nota_creditoConfiguracionPunVenUpdate"));



					
		this.jLabelid_transaccion_cuenta_facturaConfiguracionPunVen = new JLabelMe();
		this.jLabelid_transaccion_cuenta_facturaConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONCUENTAFACTURA+" : *");
		this.jLabelid_transaccion_cuenta_facturaConfiguracionPunVen.setToolTipText("Transaccion Cuenta Factura");
		this.jLabelid_transaccion_cuenta_facturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_cuenta_facturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_cuenta_facturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_facturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_cuenta_facturaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_cuenta_facturaConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONCUENTAFACTURA);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_transaccion_cuenta_facturaConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVen= new JButtonMe();
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVen.setText("Buscar");
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_facturaConfiguracionPunVen"));

		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_facturaConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_facturaConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_facturaConfiguracionPunVenUpdate"));



					
		this.jLabelid_transaccion_cuenta_nota_ventaConfiguracionPunVen = new JLabelMe();
		this.jLabelid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONCUENTANOTAVENTA+" : *");
		this.jLabelid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setToolTipText("Transaccion Cuenta Nota Venta");
		this.jLabelid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_nota_ventaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_cuenta_nota_ventaConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONCUENTANOTAVENTA);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVen= new JButtonMe();
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setText("Buscar");
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_nota_ventaConfiguracionPunVen"));

		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_nota_ventaConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_nota_ventaConfiguracionPunVenUpdate"));



					
		this.jLabelid_transaccion_cuenta_nota_creditoConfiguracionPunVen = new JLabelMe();
		this.jLabelid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setText(""+ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONCUENTANOTACREDITO+" : *");
		this.jLabelid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setToolTipText("Transaccion Cuenta Nota Credito");
		this.jLabelid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccion_cuenta_nota_creditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccion_cuenta_nota_creditoConfiguracionPunVen=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setToolTipText(ConfiguracionPunVenConstantesFunciones.LABEL_IDTRANSACCIONCUENTANOTACREDITO);
		this.gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		this.jPanelid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setLayout(this.gridaBagLayoutConfiguracionPunVen);


		jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen= new JComboBoxMe();
		jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVen= new JButtonMe();
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setText("Buscar");
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVen.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVen,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_nota_creditoConfiguracionPunVen"));

		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenBusqueda= new JButtonMe();
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenBusqueda.setText("U");
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_nota_creditoConfiguracionPunVenBusqueda"));

		if(this.configuracionpunvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenBusqueda.setVisible(false);		}

		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenUpdate= new JButtonMe();
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenUpdate.setText("U");
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccion_cuenta_nota_creditoConfiguracionPunVenUpdate"));



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
		//this.jInternalFrameDetalleConfiguracionPunVen = new ConfiguracionPunVenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Configuracion Pun Ven DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConfiguracionPunVen= new GridBagLayout();
		

		
		String sToolTipConfiguracionPunVen="";
		sToolTipConfiguracionPunVen=ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConfiguracionPunVen+="(PuntoVenta.ConfiguracionPunVen)";
		}
		
		if(!this.configuracionpunvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipConfiguracionPunVen+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConfiguracionPunVen = new JButtonMe();
		this.jButtonModificarConfiguracionPunVen = new JButtonMe();
        this.jButtonActualizarConfiguracionPunVen = new JButtonMe();
        this.jButtonEliminarConfiguracionPunVen = new JButtonMe();
        this.jButtonCancelarConfiguracionPunVen = new JButtonMe();
        this.jButtonGuardarCambiosConfiguracionPunVen = new JButtonMe();
		this.jButtonGuardarCambiosTablaConfiguracionPunVen = new JButtonMe();
		this.jButtonCerrarConfiguracionPunVen = new JButtonMe();
		
		this.jScrollPanelDatosConfiguracionPunVen = new JScrollPane();   
        this.jScrollPanelDatosEdicionConfiguracionPunVen = new JScrollPane();
		this.jScrollPanelDatosGeneralConfiguracionPunVen = new JScrollPane();
				
		
		
		this.jPanelCamposConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposConfiguracionPunVen=new JTabbedPane();
		
		
		this.jTabbedPaneCamposConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciocontableConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodocumentoConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioformatoConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotransaccionConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Configuracion Pun Ven";
		
		if(!this.configuracionpunvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Configuracion Pun Venes" + this.sPath));
		} else {
			this.jScrollPanelDatosConfiguracionPunVen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConfiguracionPunVen.setName("jPanelCamposConfiguracionPunVen"); 

		this.jPanelCamposOcultosConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConfiguracionPunVen.setName("jPanelCamposOcultosConfiguracionPunVen"); 

        this.jPanelAccionesConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConfiguracionPunVen.setToolTipText("Acciones");
        this.jPanelAccionesConfiguracionPunVen.setName("Acciones"); 

		this.jPanelAccionesFormularioConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConfiguracionPunVen.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConfiguracionPunVen.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciocontableConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableConfiguracionPunVen.setName("jPanelCamposFincontableConfiguracionPunVen");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodocumentoConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Documento"));
		this.jPanelCamposIniciodocumentoConfiguracionPunVen.setName("jPanelCamposFindocumentoConfiguracionPunVen");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodocumentoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioformatoConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Formato"));
		this.jPanelCamposInicioformatoConfiguracionPunVen.setName("jPanelCamposFinformatoConfiguracionPunVen");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioformatoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotransaccionConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Transaccion"));
		this.jPanelCamposIniciotransaccionConfiguracionPunVen.setName("jPanelCamposFintransaccionConfiguracionPunVen");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotransaccionConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConfiguracionPunVen.setText("Nuevo");
		this.jButtonModificarConfiguracionPunVen.setText("Editar");
        this.jButtonActualizarConfiguracionPunVen.setText("Actualizar");
        this.jButtonEliminarConfiguracionPunVen.setText("Eliminar");
        this.jButtonCancelarConfiguracionPunVen.setText("Cancelar");
        this.jButtonGuardarCambiosConfiguracionPunVen.setText("Guardar");
		this.jButtonGuardarCambiosTablaConfiguracionPunVen.setText("Guardar");
		this.jButtonCerrarConfiguracionPunVen.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConfiguracionPunVen,"nuevo_button","Nuevo",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConfiguracionPunVen,"modificar_button","Editar",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConfiguracionPunVen,"actualizar_button","Actualizar",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConfiguracionPunVen,"eliminar_button","Eliminar",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConfiguracionPunVen,"cancelar_button","Cancelar",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConfiguracionPunVen,"guardarcambios_button","Guardar",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConfiguracionPunVen,"guardarcambiostabla_button","Guardar",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConfiguracionPunVen,"cerrar_button","Salir",this.configuracionpunvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConfiguracionPunVen.setToolTipText("Nuevo"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConfiguracionPunVen.setToolTipText("Editar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConfiguracionPunVen.setToolTipText("Actualizar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConfiguracionPunVen.setToolTipText("Eliminar)"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConfiguracionPunVen.setToolTipText("Cancelar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConfiguracionPunVen.setToolTipText("Guardar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConfiguracionPunVen.setToolTipText("Guardar"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConfiguracionPunVen.setToolTipText("Salir"+" "+ConfiguracionPunVenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConfiguracionPunVen";
		inputMap = this.jButtonNuevoConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConfiguracionPunVen.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConfiguracionPunVen"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConfiguracionPunVen";
		inputMap = this.jButtonActualizarConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConfiguracionPunVen"));
		
		//ELIMINAR
		sMapKey = "EliminarConfiguracionPunVen";
		inputMap = this.jButtonEliminarConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConfiguracionPunVen"));
		
		//CANCELAR	
		sMapKey = "CancelarConfiguracionPunVen";
		inputMap = this.jButtonCancelarConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConfiguracionPunVen"));
		
		//CERRAR		
		sMapKey = "CerrarConfiguracionPunVen";
		inputMap = this.jButtonCerrarConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConfiguracionPunVen"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConfiguracionPunVen";
		inputMap = this.jButtonGuardarCambiosTablaConfiguracionPunVen.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConfiguracionPunVen.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConfiguracionPunVen"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConfiguracionPunVen = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConfiguracionPunVen.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConfiguracionPunVen.setToolTipText("Nuevo ConfiguracionPunVen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConfiguracionPunVen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConfiguracionPunVen.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConfiguracionPunVen.setToolTipText("Sin Cerrar Ventana ConfiguracionPunVen");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConfiguracionPunVen = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConfiguracionPunVen.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConfiguracionPunVen.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConfiguracionPunVen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConfiguracionPunVen.setText("Accion");
		this.jComboBoxTiposAccionesConfiguracionPunVen.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConfiguracionPunVen = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConfiguracionPunVen.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConfiguracionPunVen.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConfiguracionPunVen = new JLabelMe();
		
		this.jLabelAccionesConfiguracionPunVen.setText("Acciones");		
		this.jLabelAccionesConfiguracionPunVen.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConfiguracionPunVen.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConfiguracionPunVen.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConfiguracionPunVen();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConfiguracionPunVen();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConfiguracionPunVen=new JTabbedPane();
		this.jTabbedPaneRelacionesConfiguracionPunVen.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConfiguracionPunVen,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConfiguracionPunVen.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConfiguracionPunVen.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConfiguracionPunVen.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConfiguracionPunVen.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConfiguracionPunVen.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConfiguracionPunVen.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConfiguracionPunVen, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConfiguracionPunVen = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConfiguracionPunVen = new GridBagLayout();
		
		this.jPanelCamposConfiguracionPunVen.setLayout(gridaBagLayoutCamposConfiguracionPunVen);
		this.jPanelCamposOcultosConfiguracionPunVen.setLayout(gridaBagLayoutCamposOcultosConfiguracionPunVen);
		
		

		GridBagLayout gridaBagLayoutCamposIniciocontableConfiguracionPunVen= new GridBagLayout();
		this.jPanelCamposIniciocontableConfiguracionPunVen.setLayout(gridaBagLayoutCamposIniciocontableConfiguracionPunVen);

		GridBagLayout gridaBagLayoutCamposIniciodocumentoConfiguracionPunVen= new GridBagLayout();
		this.jPanelCamposIniciodocumentoConfiguracionPunVen.setLayout(gridaBagLayoutCamposIniciodocumentoConfiguracionPunVen);

		GridBagLayout gridaBagLayoutCamposInicioformatoConfiguracionPunVen= new GridBagLayout();
		this.jPanelCamposInicioformatoConfiguracionPunVen.setLayout(gridaBagLayoutCamposInicioformatoConfiguracionPunVen);

		GridBagLayout gridaBagLayoutCamposIniciotransaccionConfiguracionPunVen= new GridBagLayout();
		this.jPanelCamposIniciotransaccionConfiguracionPunVen.setLayout(gridaBagLayoutCamposIniciotransaccionConfiguracionPunVen);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConfiguracionPunVen.add(jLabelIdConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConfiguracionPunVen.add(jLabelidConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConfiguracionPunVen.add(jLabelid_empresaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConfiguracionPunVen.add(jButtonid_empresaConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConfiguracionPunVen.add(jButtonid_empresaConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConfiguracionPunVen.add(jComboBoxid_empresaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalConfiguracionPunVen.add(jLabelid_sucursalConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalConfiguracionPunVen.add(jButtonid_sucursalConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalConfiguracionPunVen.add(jButtonid_sucursalConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalConfiguracionPunVen.add(jComboBoxid_sucursalConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaConfiguracionPunVen.add(jLabelid_bodegaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaConfiguracionPunVen.add(jButtonid_bodegaConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaConfiguracionPunVen.add(jButtonid_bodegaConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaConfiguracionPunVen.add(jComboBoxid_bodegaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_efectivoConfiguracionPunVen.add(jLabelid_cuenta_contable_efectivoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_efectivoConfiguracionPunVen.add(jButtonid_cuenta_contable_efectivoConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_efectivoConfiguracionPunVen.add(jButtonid_cuenta_contable_efectivoConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_efectivoConfiguracionPunVen.add(jComboBoxid_cuenta_contable_efectivoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_iceConfiguracionPunVen.add(jLabelid_cuenta_contable_iceConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iceConfiguracionPunVen.add(jButtonid_cuenta_contable_iceConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iceConfiguracionPunVen.add(jButtonid_cuenta_contable_iceConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_iceConfiguracionPunVen.add(jComboBoxid_cuenta_contable_iceConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_otrosConfiguracionPunVen.add(jLabelid_cuenta_contable_otrosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_otrosConfiguracionPunVen.add(jButtonid_cuenta_contable_otrosConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_otrosConfiguracionPunVen.add(jButtonid_cuenta_contable_otrosConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_otrosConfiguracionPunVen.add(jComboBoxid_cuenta_contable_otrosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cliente_consumidor_finalConfiguracionPunVen.add(jLabelid_cliente_consumidor_finalConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cliente_consumidor_finalConfiguracionPunVen.add(jButtonid_cliente_consumidor_finalConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_consumidor_finalConfiguracionPunVen.add(jButtonid_cliente_consumidor_finalConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 4;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cliente_consumidor_finalConfiguracionPunVen.add(jButtonid_cliente_consumidor_finalConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cliente_consumidor_finalConfiguracionPunVen.add(jComboBoxid_cliente_consumidor_finalConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documento_facturaConfiguracionPunVen.add(jLabelid_tipo_documento_facturaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_facturaConfiguracionPunVen.add(jButtonid_tipo_documento_facturaConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_facturaConfiguracionPunVen.add(jButtonid_tipo_documento_facturaConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documento_facturaConfiguracionPunVen.add(jComboBoxid_tipo_documento_facturaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documento_nota_ventaConfiguracionPunVen.add(jLabelid_tipo_documento_nota_ventaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_nota_ventaConfiguracionPunVen.add(jButtonid_tipo_documento_nota_ventaConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_nota_ventaConfiguracionPunVen.add(jButtonid_tipo_documento_nota_ventaConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documento_nota_ventaConfiguracionPunVen.add(jComboBoxid_tipo_documento_nota_ventaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documento_nota_creditoConfiguracionPunVen.add(jLabelid_tipo_documento_nota_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_nota_creditoConfiguracionPunVen.add(jButtonid_tipo_documento_nota_creditoConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_nota_creditoConfiguracionPunVen.add(jButtonid_tipo_documento_nota_creditoConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documento_nota_creditoConfiguracionPunVen.add(jComboBoxid_tipo_documento_nota_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documento_tarjeta_creditoConfiguracionPunVen.add(jLabelid_tipo_documento_tarjeta_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_tarjeta_creditoConfiguracionPunVen.add(jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_tarjeta_creditoConfiguracionPunVen.add(jButtonid_tipo_documento_tarjeta_creditoConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documento_tarjeta_creditoConfiguracionPunVen.add(jComboBoxid_tipo_documento_tarjeta_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_facturaConfiguracionPunVen.add(jLabelid_formato_facturaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_facturaConfiguracionPunVen.add(jButtonid_formato_facturaConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_facturaConfiguracionPunVen.add(jButtonid_formato_facturaConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_facturaConfiguracionPunVen.add(jComboBoxid_formato_facturaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_nota_ventaConfiguracionPunVen.add(jLabelid_formato_nota_ventaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nota_ventaConfiguracionPunVen.add(jButtonid_formato_nota_ventaConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nota_ventaConfiguracionPunVen.add(jButtonid_formato_nota_ventaConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_nota_ventaConfiguracionPunVen.add(jComboBoxid_formato_nota_ventaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_nota_creditoConfiguracionPunVen.add(jLabelid_formato_nota_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nota_creditoConfiguracionPunVen.add(jButtonid_formato_nota_creditoConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_nota_creditoConfiguracionPunVen.add(jButtonid_formato_nota_creditoConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_nota_creditoConfiguracionPunVen.add(jComboBoxid_formato_nota_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_facturaConfiguracionPunVen.add(jLabelid_transaccion_facturaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_facturaConfiguracionPunVen.add(jButtonid_transaccion_facturaConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_facturaConfiguracionPunVen.add(jButtonid_transaccion_facturaConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_facturaConfiguracionPunVen.add(jComboBoxid_transaccion_facturaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_nota_ventaConfiguracionPunVen.add(jLabelid_transaccion_nota_ventaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_nota_ventaConfiguracionPunVen.add(jButtonid_transaccion_nota_ventaConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_nota_ventaConfiguracionPunVen.add(jButtonid_transaccion_nota_ventaConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_nota_ventaConfiguracionPunVen.add(jComboBoxid_transaccion_nota_ventaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_nota_creditoConfiguracionPunVen.add(jLabelid_transaccion_nota_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_nota_creditoConfiguracionPunVen.add(jButtonid_transaccion_nota_creditoConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_nota_creditoConfiguracionPunVen.add(jButtonid_transaccion_nota_creditoConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_nota_creditoConfiguracionPunVen.add(jComboBoxid_transaccion_nota_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_cuenta_facturaConfiguracionPunVen.add(jLabelid_transaccion_cuenta_facturaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_facturaConfiguracionPunVen.add(jButtonid_transaccion_cuenta_facturaConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_facturaConfiguracionPunVen.add(jButtonid_transaccion_cuenta_facturaConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_cuenta_facturaConfiguracionPunVen.add(jComboBoxid_transaccion_cuenta_facturaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_cuenta_nota_ventaConfiguracionPunVen.add(jLabelid_transaccion_cuenta_nota_ventaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_nota_ventaConfiguracionPunVen.add(jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_nota_ventaConfiguracionPunVen.add(jButtonid_transaccion_cuenta_nota_ventaConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_cuenta_nota_ventaConfiguracionPunVen.add(jComboBoxid_transaccion_cuenta_nota_ventaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccion_cuenta_nota_creditoConfiguracionPunVen.add(jLabelid_transaccion_cuenta_nota_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 2;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_nota_creditoConfiguracionPunVen.add(jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenBusqueda, this.gridBagConstraintsConfiguracionPunVen);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		//this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = 3;
		this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
		this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccion_cuenta_nota_creditoConfiguracionPunVen.add(jButtonid_transaccion_cuenta_nota_creditoConfiguracionPunVenUpdate, this.gridBagConstraintsConfiguracionPunVen);
	}

	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
	this.gridBagConstraintsConfiguracionPunVen.gridx = 1;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccion_cuenta_nota_creditoConfiguracionPunVen.add(jComboBoxid_transaccion_cuenta_nota_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposOcultosConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposOcultosConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConfiguracionPunVen.add(this.jPanelid_empresaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposOcultosConfiguracionPunVen % 1==0) {
		iXPanelCamposOcultosConfiguracionPunVen=0;
		iYPanelCamposOcultosConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposOcultosConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposOcultosConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConfiguracionPunVen.add(this.jPanelid_sucursalConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposOcultosConfiguracionPunVen % 1==0) {
		iXPanelCamposOcultosConfiguracionPunVen=0;
		iYPanelCamposOcultosConfiguracionPunVen++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciocontableConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciocontableConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableConfiguracionPunVen.add(this.jPanelidConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciocontableConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciocontableConfiguracionPunVen=0;
		iYPanelCamposIniciocontableConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciocontableConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciocontableConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableConfiguracionPunVen.add(this.jPanelid_bodegaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciocontableConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciocontableConfiguracionPunVen=0;
		iYPanelCamposIniciocontableConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciocontableConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciocontableConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableConfiguracionPunVen.add(this.jPanelid_cuenta_contable_efectivoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciocontableConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciocontableConfiguracionPunVen=0;
		iYPanelCamposIniciocontableConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciocontableConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciocontableConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableConfiguracionPunVen.add(this.jPanelid_cuenta_contable_iceConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciocontableConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciocontableConfiguracionPunVen=0;
		iYPanelCamposIniciocontableConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciocontableConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciocontableConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableConfiguracionPunVen.add(this.jPanelid_cuenta_contable_otrosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciocontableConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciocontableConfiguracionPunVen=0;
		iYPanelCamposIniciocontableConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciocontableConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciocontableConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableConfiguracionPunVen.add(this.jPanelid_cliente_consumidor_finalConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciocontableConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciocontableConfiguracionPunVen=0;
		iYPanelCamposIniciocontableConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciodocumentoConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciodocumentoConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodocumentoConfiguracionPunVen.add(this.jPanelid_tipo_documento_facturaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciodocumentoConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciodocumentoConfiguracionPunVen=0;
		iYPanelCamposIniciodocumentoConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciodocumentoConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciodocumentoConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodocumentoConfiguracionPunVen.add(this.jPanelid_tipo_documento_nota_ventaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciodocumentoConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciodocumentoConfiguracionPunVen=0;
		iYPanelCamposIniciodocumentoConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciodocumentoConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciodocumentoConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodocumentoConfiguracionPunVen.add(this.jPanelid_tipo_documento_nota_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciodocumentoConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciodocumentoConfiguracionPunVen=0;
		iYPanelCamposIniciodocumentoConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciodocumentoConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciodocumentoConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciodocumentoConfiguracionPunVen.add(this.jPanelid_tipo_documento_tarjeta_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciodocumentoConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciodocumentoConfiguracionPunVen=0;
		iYPanelCamposIniciodocumentoConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposInicioformatoConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposInicioformatoConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoConfiguracionPunVen.add(this.jPanelid_formato_facturaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposInicioformatoConfiguracionPunVen % 1==0) {
		iXPanelCamposInicioformatoConfiguracionPunVen=0;
		iYPanelCamposInicioformatoConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposInicioformatoConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposInicioformatoConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoConfiguracionPunVen.add(this.jPanelid_formato_nota_ventaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposInicioformatoConfiguracionPunVen % 1==0) {
		iXPanelCamposInicioformatoConfiguracionPunVen=0;
		iYPanelCamposInicioformatoConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposInicioformatoConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposInicioformatoConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformatoConfiguracionPunVen.add(this.jPanelid_formato_nota_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposInicioformatoConfiguracionPunVen % 1==0) {
		iXPanelCamposInicioformatoConfiguracionPunVen=0;
		iYPanelCamposInicioformatoConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciotransaccionConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciotransaccionConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotransaccionConfiguracionPunVen.add(this.jPanelid_transaccion_facturaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciotransaccionConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciotransaccionConfiguracionPunVen=0;
		iYPanelCamposIniciotransaccionConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciotransaccionConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciotransaccionConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotransaccionConfiguracionPunVen.add(this.jPanelid_transaccion_nota_ventaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciotransaccionConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciotransaccionConfiguracionPunVen=0;
		iYPanelCamposIniciotransaccionConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciotransaccionConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciotransaccionConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotransaccionConfiguracionPunVen.add(this.jPanelid_transaccion_nota_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciotransaccionConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciotransaccionConfiguracionPunVen=0;
		iYPanelCamposIniciotransaccionConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciotransaccionConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciotransaccionConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotransaccionConfiguracionPunVen.add(this.jPanelid_transaccion_cuenta_facturaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciotransaccionConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciotransaccionConfiguracionPunVen=0;
		iYPanelCamposIniciotransaccionConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciotransaccionConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciotransaccionConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotransaccionConfiguracionPunVen.add(this.jPanelid_transaccion_cuenta_nota_ventaConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciotransaccionConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciotransaccionConfiguracionPunVen=0;
		iYPanelCamposIniciotransaccionConfiguracionPunVen++;
	}
	this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConfiguracionPunVen.gridy = iYPanelCamposIniciotransaccionConfiguracionPunVen;
	this.gridBagConstraintsConfiguracionPunVen.gridx = iXPanelCamposIniciotransaccionConfiguracionPunVen++;
	this.gridBagConstraintsConfiguracionPunVen.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConfiguracionPunVen.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotransaccionConfiguracionPunVen.add(this.jPanelid_transaccion_cuenta_nota_creditoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);



	if(iXPanelCamposIniciotransaccionConfiguracionPunVen % 1==0) {
		iXPanelCamposIniciotransaccionConfiguracionPunVen=0;
		iYPanelCamposIniciotransaccionConfiguracionPunVen++;
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
			
		GridBagLayout gridaBagLayoutAccionesConfiguracionPunVen= new GridBagLayout();
		this.jPanelAccionesConfiguracionPunVen.setLayout(gridaBagLayoutAccionesConfiguracionPunVen);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConfiguracionPunVen= new GridBagLayout();
		this.jPanelAccionesFormularioConfiguracionPunVen.setLayout(gridaBagLayoutAccionesFormularioConfiguracionPunVen);
		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConfiguracionPunVen.add(this.jComboBoxTiposAccionesFormularioConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConfiguracionPunVen.add(this.jCheckBoxPostAccionNuevoConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.configuracionpunvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConfiguracionPunVen.add(this.jCheckBoxPostAccionSinCerrarConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.configuracionpunvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.configuracionpunvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConfiguracionPunVen.add(this.jCheckBoxPostAccionSinMensajeConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXAccion++;
			
		this.jPanelAccionesConfiguracionPunVen.add(this.jButtonModificarConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);							

		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;
		this.gridBagConstraintsConfiguracionPunVen.gridx =iPosXAccion++;
			
		this.jPanelAccionesConfiguracionPunVen.add(this.jButtonEliminarConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		
			
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXAccion++;
		
		this.jPanelAccionesConfiguracionPunVen.add(this.jButtonActualizarConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);


		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = iPosXAccion++;
		
		this.jPanelAccionesConfiguracionPunVen.add(this.jButtonGuardarCambiosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);	
		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = 0;		
		this.gridBagConstraintsConfiguracionPunVen.gridx =iPosXAccion++;
		
		this.jPanelAccionesConfiguracionPunVen.add(this.jButtonCancelarConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConfiguracionPunVen = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConfiguracionPunVen);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.configuracionpunvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();						
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConfiguracionPunVen.gridx = 0;		
			//this.gridBagConstraintsConfiguracionPunVen.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConfiguracionPunVen.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConfiguracionPunVen.gridx =0;
		this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConfiguracionPunVen.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConfiguracionPunVenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConfiguracionPunVen = new ConfiguracionPunVenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Configuracion Pun Ven DATOS");
			
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
			
	        //this.setTitle("[FOR] - Configuracion Pun Ven DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Configuracion Pun Ven Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConfiguracionPunVenModel configuracionpunvenModel=new ConfiguracionPunVenModel(this);
			
			//SI USARA CLASE INTERNA
			//ConfiguracionPunVenModel.ConfiguracionPunVenFocusTraversalPolicy configuracionpunvenFocusTraversalPolicy = configuracionpunvenModel.new ConfiguracionPunVenFocusTraversalPolicy(this);
			
			//configuracionpunvenFocusTraversalPolicy.setconfiguracionpunvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(configuracionpunvenModel);
			
			
			this.jContentPaneDetalleConfiguracionPunVen = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConfiguracionPunVen = new GridBagLayout();	
			this.jContentPaneDetalleConfiguracionPunVen.setLayout(gridaBagLayoutDetalleConfiguracionPunVen);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConfiguracionPunVen = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
				this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
					
				
				this.jContentPaneDetalleConfiguracionPunVen.add(jTtoolBarDetalleConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);								
				
}
			
			this.jScrollPanelDatosEdicionConfiguracionPunVen=   new JScrollPane(jContentPaneDetalleConfiguracionPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConfiguracionPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConfiguracionPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConfiguracionPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConfiguracionPunVen=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConfiguracionPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConfiguracionPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConfiguracionPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposConfiguracionPunVen.add("Contable",this.jPanelCamposIniciocontableConfiguracionPunVen);
		this.jTabbedPaneCamposConfiguracionPunVen.add("Documento",this.jPanelCamposIniciodocumentoConfiguracionPunVen);
		this.jTabbedPaneCamposConfiguracionPunVen.add("Formato",this.jPanelCamposInicioformatoConfiguracionPunVen);
		this.jTabbedPaneCamposConfiguracionPunVen.add("Transaccion",this.jPanelCamposIniciotransaccionConfiguracionPunVen);
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
						
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	        
			this.jContentPaneDetalleConfiguracionPunVen.add(jTabbedPaneCamposConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);
			
			
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
						&& configuracionpunvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.configuracionpunvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConfiguracionPunVen= new GridBagConstraints();
						this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
						this.jContentPaneDetalleConfiguracionPunVen.add(this.jTabbedPaneRelacionesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConfiguracionPunVen.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConfiguracionPunVen.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
					this.gridBagConstraintsConfiguracionPunVen.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
					
				
					this.jContentPaneDetalleConfiguracionPunVen.add(jPanelCamposOcultosConfiguracionPunVen, gridBagConstraintsConfiguracionPunVen);
				
					this.jPanelCamposOcultosConfiguracionPunVen.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	        this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConfiguracionPunVen.add(this.jPanelAccionesFormularioConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);							
			
			
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
	        this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
	        
			
			this.jContentPaneDetalleConfiguracionPunVen.add(this.jPanelAccionesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConfiguracionPunVen);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConfiguracionPunVen=   new JScrollPane(this.jPanelCamposConfiguracionPunVen,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConfiguracionPunVen.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConfiguracionPunVen.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConfiguracionPunVen.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
			this.gridBagConstraintsConfiguracionPunVen.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConfiguracionPunVen.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConfiguracionPunVen.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);			
			
			this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
			this.gridBagConstraintsConfiguracionPunVen.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
			
			
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConfiguracionPunVen.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		
			
		this.gridBagConstraintsConfiguracionPunVen = new GridBagConstraints();
		this.gridBagConstraintsConfiguracionPunVen.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConfiguracionPunVen.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConfiguracionPunVen, this.gridBagConstraintsConfiguracionPunVen);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConfiguracionPunVen;//jContentPane;
		
		return jScrollPanelDatosEdicionConfiguracionPunVen;
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
