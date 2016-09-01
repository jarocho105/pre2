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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.DefinicionConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class DefinicionDetalleFormJInternalFrame extends DefinicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDefinicion;
	
	protected JMenuBar jmenuBarDetalleDefinicion;
	
	protected JMenu jmenuDetalleDefinicion;
	protected JMenu jmenuDetalleArchivoDefinicion;
	protected JMenu jmenuDetalleAccionesDefinicion;
	protected JMenu jmenuDetalleDatosDefinicion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDefinicion;	
	protected GridBagConstraints gridBagConstraintsDefinicion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DefinicionBeanSwingJInternalFrameAdditional jInternalFrameDetalleDefinicion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoDefinicionBeanSwingJInternalFrame tipodefinicionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodefinicion="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoIvaItemBeanSwingJInternalFrame tipoivaitemBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoivaitem="";

	protected TipoGlobalClienteBeanSwingJInternalFrame tipoglobalclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoglobalcliente="";

	protected TipoCosteoDefinicionBeanSwingJInternalFrame tipocosteodefinicionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocosteodefinicion="";

	protected TipoCostoDefinicionBeanSwingJInternalFrame tipocostodefinicionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocostodefinicion="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotributario="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected LibroContableBeanSwingJInternalFrame librocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_librocontable="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public DefinicionSessionBean definicionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoDefinicionSessionBean tipodefinicionSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoIvaItemSessionBean tipoivaitemSessionBean;
	public TipoGlobalClienteSessionBean tipoglobalclienteSessionBean;
	public TipoCosteoDefinicionSessionBean tipocosteodefinicionSessionBean;
	public TipoCostoDefinicionSessionBean tipocostodefinicionSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoTributarioSessionBean tipotributarioSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public LibroContableSessionBean librocontableSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public DefinicionLogic definicionLogic;
	
	public JScrollPane jScrollPanelDatosDefinicion;
	public JScrollPane jScrollPanelDatosEdicionDefinicion;
	public JScrollPane jScrollPanelDatosGeneralDefinicion;
	
	protected JPanel jPanelCamposDefinicion;    
	protected JPanel jPanelCamposOcultosDefinicion;    	
	protected JPanel jPanelAccionesDefinicion;
	protected JPanel jPanelAccionesFormularioDefinicion;
    
	
	
	protected Integer iXPanelCamposDefinicion=0;
	protected Integer iYPanelCamposDefinicion=0;
	
	protected Integer iXPanelCamposOcultosDefinicion=0;
	protected Integer iYPanelCamposOcultosDefinicion=0;
	
	

	protected JPanel jPanelCamposIniciobasicoDefinicion;
	protected Integer iXPanelCamposIniciobasicoDefinicion=0;
	protected Integer iYPanelCamposIniciobasicoDefinicion=0;

	protected JPanel jPanelCamposIniciorecargosDefinicion;
	protected Integer iXPanelCamposIniciorecargosDefinicion=0;
	protected Integer iYPanelCamposIniciorecargosDefinicion=0;

	protected JPanel jPanelCamposIniciogeneralDefinicion;
	protected Integer iXPanelCamposIniciogeneralDefinicion=0;
	protected Integer iYPanelCamposIniciogeneralDefinicion=0;

	protected JPanel jPanelCamposIniciotipo_documentoDefinicion;
	protected Integer iXPanelCamposIniciotipo_documentoDefinicion=0;
	protected Integer iYPanelCamposIniciotipo_documentoDefinicion=0;

	protected JPanel jPanelCamposInicioanticipos_otrosDefinicion;
	protected Integer iXPanelCamposInicioanticipos_otrosDefinicion=0;
	protected Integer iYPanelCamposInicioanticipos_otrosDefinicion=0;

	protected JPanel jPanelCamposIniciolistas_preciosDefinicion;
	protected Integer iXPanelCamposIniciolistas_preciosDefinicion=0;
	protected Integer iYPanelCamposIniciolistas_preciosDefinicion=0;

	protected JPanel jPanelCamposInicioseries_archivosDefinicion;
	protected Integer iXPanelCamposInicioseries_archivosDefinicion=0;
	protected Integer iYPanelCamposInicioseries_archivosDefinicion=0;

	protected JPanel jPanelCamposIniciootrosDefinicion;
	protected Integer iXPanelCamposIniciootrosDefinicion=0;
	protected Integer iYPanelCamposIniciootrosDefinicion=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDefinicion;
	public JButton jButtonModificarDefinicion;
	public JButton jButtonActualizarDefinicion;
    public JButton jButtonEliminarDefinicion;
	public JButton jButtonCancelarDefinicion;
    public JButton jButtonGuardarCambiosDefinicion;
	public JButton jButtonGuardarCambiosTablaDefinicion;
	protected JButton jButtonCerrarDefinicion;
	
	
	protected JButton jButtonProcesarInformacionDefinicion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDefinicion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDefinicion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDefinicion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDefinicion;
	protected JButton jButtonModificarToolBarDefinicion;
	protected JButton jButtonActualizarToolBarDefinicion;
    protected JButton jButtonEliminarToolBarDefinicion;
	protected JButton jButtonCancelarToolBarDefinicion;
    protected JButton jButtonGuardarCambiosToolBarDefinicion;
	protected JButton jButtonGuardarCambiosTablaToolBarDefinicion;
	protected JButton jButtonMostrarOcultarTablaToolBarDefinicion;
	protected JButton jButtonCerrarToolBarDefinicion;
	
	protected JButton jButtonProcesarInformacionToolBarDefinicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDefinicion;
	protected JMenuItem jMenuItemModificarDefinicion;
	protected JMenuItem jMenuItemActualizarDefinicion;
    protected JMenuItem jMenuItemEliminarDefinicion;
	protected JMenuItem jMenuItemCancelarDefinicion;
    protected JMenuItem jMenuItemGuardarCambiosDefinicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaDefinicion;
	protected JMenuItem jMenuItemCerrarDefinicion;
	protected JMenuItem jMenuItemDetalleCerrarDefinicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarDefinicion;
	
	protected JMenuItem jMenuItemProcesarInformacionDefinicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDefinicion;
	protected JMenuItem jMenuItemMostrarOcultarDefinicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDefinicion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDefinicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDefinicion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDefinicion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDefinicion;
	public JLabel jLabelIdDefinicion;
	public JLabel jLabelidDefinicion;
	public JButton jButtonidDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_formatoDefinicion;
	public JLabel jLabelsecuencial_formatoDefinicion;
	public JTextField jTextFieldsecuencial_formatoDefinicion;
	public JButton jButtonsecuencial_formatoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialDefinicion;
	public JLabel jLabelsecuencialDefinicion;
	public JTextField jTextFieldsecuencialDefinicion;
	public JButton jButtonsecuencialDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_mostrar_bodegaDefinicion;
	public JLabel jLabelcon_mostrar_bodegaDefinicion;
	public JCheckBox jCheckBoxcon_mostrar_bodegaDefinicion;
	public JButton jButtoncon_mostrar_bodegaDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelfactorDefinicion;
	public JLabel jLabelfactorDefinicion;
	public JTextField jTextFieldfactorDefinicion;
	public JButton jButtonfactorDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_otro_recargoDefinicion;
	public JLabel jLabelcon_otro_recargoDefinicion;
	public JCheckBox jCheckBoxcon_otro_recargoDefinicion;
	public JButton jButtoncon_otro_recargoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_coaDefinicion;
	public JLabel jLabelcon_coaDefinicion;
	public JCheckBox jCheckBoxcon_coaDefinicion;
	public JButton jButtoncon_coaDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_retencionDefinicion;
	public JLabel jLabelcon_retencionDefinicion;
	public JCheckBox jCheckBoxcon_retencionDefinicion;
	public JButton jButtoncon_retencionDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_novedad_productoDefinicion;
	public JLabel jLabelcon_novedad_productoDefinicion;
	public JCheckBox jCheckBoxcon_novedad_productoDefinicion;
	public JButton jButtoncon_novedad_productoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_iceDefinicion;
	public JLabel jLabelcon_iceDefinicion;
	public JCheckBox jCheckBoxcon_iceDefinicion;
	public JButton jButtoncon_iceDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_cantidadDefinicion;
	public JLabel jLabelcon_cantidadDefinicion;
	public JCheckBox jCheckBoxcon_cantidadDefinicion;
	public JButton jButtoncon_cantidadDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_producto_por_proveedorDefinicion;
	public JLabel jLabelcon_producto_por_proveedorDefinicion;
	public JCheckBox jCheckBoxcon_producto_por_proveedorDefinicion;
	public JButton jButtoncon_producto_por_proveedorDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_lote_clienteDefinicion;
	public JLabel jLabelcon_lote_clienteDefinicion;
	public JCheckBox jCheckBoxcon_lote_clienteDefinicion;
	public JButton jButtoncon_lote_clienteDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_cuenta_contableDefinicion;
	public JLabel jLabelcon_cuenta_contableDefinicion;
	public JCheckBox jCheckBoxcon_cuenta_contableDefinicion;
	public JButton jButtoncon_cuenta_contableDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_detalleDefinicion;
	public JLabel jLabelcon_detalleDefinicion;
	public JCheckBox jCheckBoxcon_detalleDefinicion;
	public JButton jButtoncon_detalleDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_iva_incluidoDefinicion;
	public JLabel jLabelcon_iva_incluidoDefinicion;
	public JCheckBox jCheckBoxcon_iva_incluidoDefinicion;
	public JButton jButtoncon_iva_incluidoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_lotesDefinicion;
	public JLabel jLabelcon_lotesDefinicion;
	public JCheckBox jCheckBoxcon_lotesDefinicion;
	public JButton jButtoncon_lotesDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_descuentosDefinicion;
	public JLabel jLabelnumero_descuentosDefinicion;
	public JTextField jTextFieldnumero_descuentosDefinicion;
	public JButton jButtonnumero_descuentosDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_precioDefinicion;
	public JLabel jLabelcon_precioDefinicion;
	public JCheckBox jCheckBoxcon_precioDefinicion;
	public JButton jButtoncon_precioDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_registrosDefinicion;
	public JLabel jLabelnumero_registrosDefinicion;
	public JTextField jTextFieldnumero_registrosDefinicion;
	public JButton jButtonnumero_registrosDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_centro_costoDefinicion;
	public JLabel jLabelcon_centro_costoDefinicion;
	public JCheckBox jCheckBoxcon_centro_costoDefinicion;
	public JButton jButtoncon_centro_costoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_orden_ivaDefinicion;
	public JLabel jLabelcon_orden_ivaDefinicion;
	public JCheckBox jCheckBoxcon_orden_ivaDefinicion;
	public JButton jButtoncon_orden_ivaDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_multi_empresaDefinicion;
	public JLabel jLabelcon_multi_empresaDefinicion;
	public JCheckBox jCheckBoxcon_multi_empresaDefinicion;
	public JButton jButtoncon_multi_empresaDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_en_lineaDefinicion;
	public JLabel jLabelcon_en_lineaDefinicion;
	public JCheckBox jCheckBoxcon_en_lineaDefinicion;
	public JButton jButtoncon_en_lineaDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_evaluacionDefinicion;
	public JLabel jLabelcon_evaluacionDefinicion;
	public JCheckBox jCheckBoxcon_evaluacionDefinicion;
	public JButton jButtoncon_evaluacionDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_otDefinicion;
	public JLabel jLabelcon_otDefinicion;
	public JCheckBox jCheckBoxcon_otDefinicion;
	public JButton jButtoncon_otDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_anticipoDefinicion;
	public JLabel jLabelcon_anticipoDefinicion;
	public JCheckBox jCheckBoxcon_anticipoDefinicion;
	public JButton jButtoncon_anticipoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_cierreDefinicion;
	public JLabel jLabelcon_cierreDefinicion;
	public JCheckBox jCheckBoxcon_cierreDefinicion;
	public JButton jButtoncon_cierreDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_generalDefinicion;
	public JLabel jLabelcon_generalDefinicion;
	public JCheckBox jCheckBoxcon_generalDefinicion;
	public JButton jButtoncon_generalDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_por_productoDefinicion;
	public JLabel jLabelcon_por_productoDefinicion;
	public JCheckBox jCheckBoxcon_por_productoDefinicion;
	public JButton jButtoncon_por_productoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_descuentoDefinicion;
	public JLabel jLabelcon_descuentoDefinicion;
	public JCheckBox jCheckBoxcon_descuentoDefinicion;
	public JButton jButtoncon_descuentoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_seriesDefinicion;
	public JLabel jLabelcon_seriesDefinicion;
	public JCheckBox jCheckBoxcon_seriesDefinicion;
	public JButton jButtoncon_seriesDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDefinicion;
	public JLabel jLabelcantidadDefinicion;
	public JTextField jTextFieldcantidadDefinicion;
	public JButton jButtoncantidadDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_internoDefinicion;
	public JLabel jLabelcon_internoDefinicion;
	public JCheckBox jCheckBoxcon_internoDefinicion;
	public JButton jButtoncon_internoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_reservaDefinicion;
	public JLabel jLabelcon_reservaDefinicion;
	public JCheckBox jCheckBoxcon_reservaDefinicion;
	public JButton jButtoncon_reservaDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_precio_proveedorDefinicion;
	public JLabel jLabelcon_precio_proveedorDefinicion;
	public JCheckBox jCheckBoxcon_precio_proveedorDefinicion;
	public JButton jButtoncon_precio_proveedorDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_produccionDefinicion;
	public JLabel jLabelcon_produccionDefinicion;
	public JCheckBox jCheckBoxcon_produccionDefinicion;
	public JButton jButtoncon_produccionDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_codigo_barraDefinicion;
	public JLabel jLabelcon_codigo_barraDefinicion;
	public JCheckBox jCheckBoxcon_codigo_barraDefinicion;
	public JButton jButtoncon_codigo_barraDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelcon_romaneosDefinicion;
	public JLabel jLabelcon_romaneosDefinicion;
	public JCheckBox jCheckBoxcon_romaneosDefinicion;
	public JButton jButtoncon_romaneosDefinicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDefinicion;
	public JLabel jLabelid_empresaDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDefinicion;
	public JButton jButtonid_empresaDefinicion= new JButtonMe();
	public JButton jButtonid_empresaDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_empresaDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloDefinicion;
	public JLabel jLabelid_moduloDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloDefinicion;
	public JButton jButtonid_moduloDefinicion= new JButtonMe();
	public JButton jButtonid_moduloDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_moduloDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_definicionDefinicion;
	public JLabel jLabelid_tipo_definicionDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_definicionDefinicion;
	public JButton jButtonid_tipo_definicionDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_definicionDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_definicionDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionDefinicion;
	public JLabel jLabelid_transaccionDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionDefinicion;
	public JButton jButtonid_transaccionDefinicion= new JButtonMe();
	public JButton jButtonid_transaccionDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_transaccionDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDefinicion;
	public JLabel jLabelid_sucursalDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDefinicion;
	public JButton jButtonid_sucursalDefinicion= new JButtonMe();
	public JButton jButtonid_sucursalDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_iva_itemDefinicion;
	public JLabel jLabelid_tipo_iva_itemDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_iva_itemDefinicion;
	public JButton jButtonid_tipo_iva_itemDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_iva_itemDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_iva_itemDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_global_clienteDefinicion;
	public JLabel jLabelid_tipo_global_clienteDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_global_clienteDefinicion;
	public JButton jButtonid_tipo_global_clienteDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_global_clienteDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_global_clienteDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_costeo_definicionDefinicion;
	public JLabel jLabelid_tipo_costeo_definicionDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_costeo_definicionDefinicion;
	public JButton jButtonid_tipo_costeo_definicionDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_costeo_definicionDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_costeo_definicionDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_costo_definicionDefinicion;
	public JLabel jLabelid_tipo_costo_definicionDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_costo_definicionDefinicion;
	public JButton jButtonid_tipo_costo_definicionDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_costo_definicionDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_costo_definicionDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoDefinicion;
	public JLabel jLabelid_formatoDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoDefinicion;
	public JButton jButtonid_formatoDefinicion= new JButtonMe();
	public JButton jButtonid_formatoDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_formatoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_tributarioDefinicion;
	public JLabel jLabelid_tipo_tributarioDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tributarioDefinicion;
	public JButton jButtonid_tipo_tributarioDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_tributarioDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tributarioDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencionDefinicion;
	public JLabel jLabelid_tipo_retencionDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionDefinicion;
	public JButton jButtonid_tipo_retencionDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_retencionDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documentoDefinicion;
	public JLabel jLabelid_tipo_documentoDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoDefinicion;
	public JButton jButtonid_tipo_documentoDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_documentoDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_libro_contableDefinicion;
	public JLabel jLabelid_libro_contableDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_libro_contableDefinicion;
	public JButton jButtonid_libro_contableDefinicion= new JButtonMe();
	public JButton jButtonid_libro_contableDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_libro_contableDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloDefinicion;
	public JLabel jLabelid_tipo_transaccion_moduloDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloDefinicion;
	public JButton jButtonid_tipo_transaccion_moduloDefinicion= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloDefinicionBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableDefinicion;
	public JLabel jLabelid_cuenta_contableDefinicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableDefinicion;
	public JButton jButtonid_cuenta_contableDefinicion= new JButtonMe();
	public JButton jButtonid_cuenta_contableDefinicionUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableDefinicionBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableDefinicionArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDefinicion;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="MEDIO";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=2442;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DefinicionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDefinicion=new JPanel();
				this.jPanelAccionesFormularioDefinicion=new JPanel();
				this.jmenuBarDetalleDefinicion=new JMenuBar();
				this.jTtoolBarDetalleDefinicion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefinicionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Definicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DefinicionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Definicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefinicionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Definicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefinicionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Definicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DefinicionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Definicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDefinicion() {
		return this.jButtonActualizarToolBarDefinicion;
	}
	
	public JButton getjButtonEliminarToolBarDefinicion() {
		return this.jButtonEliminarToolBarDefinicion;
	}
	
	public JButton getjButtonCancelarToolBarDefinicion() {
		return this.jButtonCancelarToolBarDefinicion;
	}		
	
	public JButton getjButtonProcesarInformacionDefinicion() {
		return this.jButtonProcesarInformacionDefinicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDefinicion)	{
		this.jButtonProcesarInformacionDefinicion = jButtonProcesarInformacionDefinicion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDefinicion() {
		return this.jComboBoxTiposAccionesDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDefinicion(
			JComboBox jComboBoxTiposRelacionesDefinicion) {
		this.jComboBoxTiposRelacionesDefinicion = jComboBoxTiposRelacionesDefinicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDefinicion(
			JComboBox jComboBoxTiposAccionesDefinicion) {
		this.jComboBoxTiposAccionesDefinicion = jComboBoxTiposAccionesDefinicion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDefinicion() {
		return this.jComboBoxTiposAccionesFormularioDefinicion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDefinicion(
			JComboBox jComboBoxTiposAccionesFormularioDefinicion) {
		this.jComboBoxTiposAccionesFormularioDefinicion = jComboBoxTiposAccionesFormularioDefinicion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.definicionSessionBean=new DefinicionSessionBean();
		
		this.definicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.definicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.definicionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DefinicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Definicion MANTENIMIENTO"));
		
		
		if(iWidth > 5250) {
			iWidth=5250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.definicionSessionBean.getEsGuardarRelacionado()) {
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
	
		DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDefinicion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDefinicion=new JButtonMe();
				this.jButtonModificarToolBarDefinicion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDefinicion,this.jTtoolBarDetalleDefinicion,
							"actualizar","actualizar","Actualizar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDefinicion,this.jTtoolBarDetalleDefinicion,
							"eliminar","eliminar","Eliminar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDefinicion,this.jTtoolBarDetalleDefinicion,
							"cancelar","cancelar","Cancelar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDefinicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDefinicion,this.jTtoolBarDetalleDefinicion,
							"guardarcambios","guardarcambios","Guardar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDefinicion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDefinicion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDefinicion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDefinicion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDefinicion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDefinicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDefinicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDefinicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDefinicion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDefinicion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDefinicion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDefinicion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDefinicion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDefinicion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDefinicion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDefinicion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDefinicion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDefinicion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDefinicion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDefinicion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDefinicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDefinicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDefinicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDefinicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDefinicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDefinicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDefinicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDefinicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDefinicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDefinicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDefinicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDefinicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDefinicion.add(this.jMenuItemDetalleCerrarDefinicion);
		
		this.jmenuDetalleAccionesDefinicion.add(this.jMenuItemActualizarDefinicion);
		this.jmenuDetalleAccionesDefinicion.add(this.jMenuItemEliminarDefinicion);
		this.jmenuDetalleAccionesDefinicion.add(this.jMenuItemCancelarDefinicion);		
		
		//this.jmenuDetalleDatosDefinicion.add(this.jMenuItemDetalleAbrirOrderByDefinicion);				
		this.jmenuDetalleDatosDefinicion.add(this.jMenuItemDetalleMostarOcultarDefinicion);				
				
		//this.jmenuDetalleAccionesDefinicion.add(this.jMenuItemGuardarCambiosDefinicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDefinicion.add(this.jmenuDetalleArchivoDefinicion);		
		this.jmenuBarDetalleDefinicion.add(this.jmenuDetalleAccionesDefinicion);		
		this.jmenuBarDetalleDefinicion.add(this.jmenuDetalleDatosDefinicion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDefinicion);				
	}
	
	
	public void inicializarElementosCamposDefinicion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDefinicion = new JLabelMe();
		jLabelIdDefinicion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDefinicion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDefinicion= new GridBagLayout();

		this.jPanelidDefinicion.setLayout(this.gridaBagLayoutDefinicion);

		jLabelidDefinicion = new JLabel();
		jLabelidDefinicion.setText("Id");

		jLabelidDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencial_formatoDefinicion = new JLabelMe();
		this.jLabelsecuencial_formatoDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_SECUENCIALFORMATO+" : *");
		this.jLabelsecuencial_formatoDefinicion.setToolTipText("Secuencial Formato");
		this.jLabelsecuencial_formatoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_formatoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_formatoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_formatoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_formatoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_formatoDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_SECUENCIALFORMATO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelsecuencial_formatoDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jTextFieldsecuencial_formatoDefinicion= new JTextFieldMe();

		jTextFieldsecuencial_formatoDefinicion.setEnabled(false);
		jTextFieldsecuencial_formatoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_formatoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_formatoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_formatoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencial_formatoDefinicionBusqueda= new JButtonMe();
		this.jButtonsecuencial_formatoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_formatoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_formatoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_formatoDefinicionBusqueda.setText("U");
		this.jButtonsecuencial_formatoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_formatoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_formatoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_formatoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_formatoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_formatoDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_formatoDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialDefinicion = new JLabelMe();
		this.jLabelsecuencialDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialDefinicion.setToolTipText("Secuencia");
		this.jLabelsecuencialDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelsecuencialDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jTextFieldsecuencialDefinicion= new JTextFieldMe();
		jTextFieldsecuencialDefinicion.setEnabled(false);
		jTextFieldsecuencialDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsecuencialDefinicion.setText("0");

		this.jButtonsecuencialDefinicionBusqueda= new JButtonMe();
		this.jButtonsecuencialDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialDefinicionBusqueda.setText("U");
		this.jButtonsecuencialDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_mostrar_bodegaDefinicion = new JLabelMe();
		this.jLabelcon_mostrar_bodegaDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONMOSTRARBODEGA+" : *");
		this.jLabelcon_mostrar_bodegaDefinicion.setToolTipText("Mostrar Bodega");
		this.jLabelcon_mostrar_bodegaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_mostrar_bodegaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_mostrar_bodegaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_mostrar_bodegaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_mostrar_bodegaDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_mostrar_bodegaDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONMOSTRARBODEGA);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_mostrar_bodegaDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_mostrar_bodegaDefinicion= new JCheckBoxMe();
		jCheckBoxcon_mostrar_bodegaDefinicion.setEnabled(false);

		jCheckBoxcon_mostrar_bodegaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mostrar_bodegaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mostrar_bodegaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_mostrar_bodegaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_mostrar_bodegaDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_mostrar_bodegaDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mostrar_bodegaDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mostrar_bodegaDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_mostrar_bodegaDefinicionBusqueda.setText("U");
		this.jButtoncon_mostrar_bodegaDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_mostrar_bodegaDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_mostrar_bodegaDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_mostrar_bodegaDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_mostrar_bodegaDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_mostrar_bodegaDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_mostrar_bodegaDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelfactorDefinicion = new JLabelMe();
		this.jLabelfactorDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_FACTOR+" : *");
		this.jLabelfactorDefinicion.setToolTipText("Factor");
		this.jLabelfactorDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfactorDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfactorDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfactorDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfactorDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfactorDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_FACTOR);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelfactorDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jTextFieldfactorDefinicion= new JTextFieldMe();
		jTextFieldfactorDefinicion.setEnabled(false);
		jTextFieldfactorDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfactorDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfactorDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfactorDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfactorDefinicion.setText("0.0");

		this.jButtonfactorDefinicionBusqueda= new JButtonMe();
		this.jButtonfactorDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfactorDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfactorDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfactorDefinicionBusqueda.setText("U");
		this.jButtonfactorDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfactorDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfactorDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfactorDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfactorDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"factorDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfactorDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_otro_recargoDefinicion = new JLabelMe();
		this.jLabelcon_otro_recargoDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONOTRORECARGO+" : *");
		this.jLabelcon_otro_recargoDefinicion.setToolTipText("Otros Recargos");
		this.jLabelcon_otro_recargoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_otro_recargoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_otro_recargoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_otro_recargoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_otro_recargoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_otro_recargoDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONOTRORECARGO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_otro_recargoDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_otro_recargoDefinicion= new JCheckBoxMe();
		jCheckBoxcon_otro_recargoDefinicion.setEnabled(false);

		jCheckBoxcon_otro_recargoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_otro_recargoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_otro_recargoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_otro_recargoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_otro_recargoDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_otro_recargoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_otro_recargoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_otro_recargoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_otro_recargoDefinicionBusqueda.setText("U");
		this.jButtoncon_otro_recargoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_otro_recargoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_otro_recargoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_otro_recargoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_otro_recargoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_otro_recargoDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_otro_recargoDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_coaDefinicion = new JLabelMe();
		this.jLabelcon_coaDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONCOA+" : *");
		this.jLabelcon_coaDefinicion.setToolTipText("Coa");
		this.jLabelcon_coaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_coaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_coaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_coaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_coaDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_coaDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONCOA);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_coaDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_coaDefinicion= new JCheckBoxMe();
		jCheckBoxcon_coaDefinicion.setEnabled(false);

		jCheckBoxcon_coaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_coaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_coaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_coaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_coaDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_coaDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_coaDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_coaDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_coaDefinicionBusqueda.setText("U");
		this.jButtoncon_coaDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_coaDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_coaDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_coaDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_coaDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_coaDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_coaDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_retencionDefinicion = new JLabelMe();
		this.jLabelcon_retencionDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONRETENCION+" : *");
		this.jLabelcon_retencionDefinicion.setToolTipText("Retenciones");
		this.jLabelcon_retencionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_retencionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_retencionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_retencionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_retencionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_retencionDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONRETENCION);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_retencionDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_retencionDefinicion= new JCheckBoxMe();
		jCheckBoxcon_retencionDefinicion.setEnabled(false);

		jCheckBoxcon_retencionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_retencionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_retencionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_retencionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_retencionDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_retencionDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_retencionDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_retencionDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_retencionDefinicionBusqueda.setText("U");
		this.jButtoncon_retencionDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_retencionDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_retencionDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_retencionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_retencionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_retencionDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_retencionDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_novedad_productoDefinicion = new JLabelMe();
		this.jLabelcon_novedad_productoDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONNOVEDADPRODUCTO+" : *");
		this.jLabelcon_novedad_productoDefinicion.setToolTipText("Novedades Prod");
		this.jLabelcon_novedad_productoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_novedad_productoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_novedad_productoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_novedad_productoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_novedad_productoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_novedad_productoDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONNOVEDADPRODUCTO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_novedad_productoDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_novedad_productoDefinicion= new JCheckBoxMe();
		jCheckBoxcon_novedad_productoDefinicion.setEnabled(false);

		jCheckBoxcon_novedad_productoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_novedad_productoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_novedad_productoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_novedad_productoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_novedad_productoDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_novedad_productoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_novedad_productoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_novedad_productoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_novedad_productoDefinicionBusqueda.setText("U");
		this.jButtoncon_novedad_productoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_novedad_productoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_novedad_productoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_novedad_productoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_novedad_productoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_novedad_productoDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_novedad_productoDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_iceDefinicion = new JLabelMe();
		this.jLabelcon_iceDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONICE+" : *");
		this.jLabelcon_iceDefinicion.setToolTipText(" Ice");
		this.jLabelcon_iceDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_iceDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_iceDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_iceDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_iceDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_iceDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONICE);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_iceDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_iceDefinicion= new JCheckBoxMe();
		jCheckBoxcon_iceDefinicion.setEnabled(false);

		jCheckBoxcon_iceDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_iceDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_iceDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_iceDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_iceDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_iceDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_iceDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_iceDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_iceDefinicionBusqueda.setText("U");
		this.jButtoncon_iceDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_iceDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_iceDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_iceDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_iceDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_iceDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_iceDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_cantidadDefinicion = new JLabelMe();
		this.jLabelcon_cantidadDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONCANTIDAD+" : *");
		this.jLabelcon_cantidadDefinicion.setToolTipText("Con Cantidad");
		this.jLabelcon_cantidadDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_cantidadDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_cantidadDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cantidadDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cantidadDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cantidadDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONCANTIDAD);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_cantidadDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_cantidadDefinicion= new JCheckBoxMe();
		jCheckBoxcon_cantidadDefinicion.setEnabled(false);

		jCheckBoxcon_cantidadDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cantidadDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cantidadDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cantidadDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cantidadDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_cantidadDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cantidadDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cantidadDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cantidadDefinicionBusqueda.setText("U");
		this.jButtoncon_cantidadDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cantidadDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cantidadDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cantidadDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cantidadDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cantidadDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cantidadDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_producto_por_proveedorDefinicion = new JLabelMe();
		this.jLabelcon_producto_por_proveedorDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONPRODUCTOPORPROVEEDOR+" : *");
		this.jLabelcon_producto_por_proveedorDefinicion.setToolTipText("Prod x Proveedor");
		this.jLabelcon_producto_por_proveedorDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_producto_por_proveedorDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_producto_por_proveedorDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_producto_por_proveedorDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_producto_por_proveedorDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_producto_por_proveedorDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONPRODUCTOPORPROVEEDOR);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_producto_por_proveedorDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_producto_por_proveedorDefinicion= new JCheckBoxMe();
		jCheckBoxcon_producto_por_proveedorDefinicion.setEnabled(false);

		jCheckBoxcon_producto_por_proveedorDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_producto_por_proveedorDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_producto_por_proveedorDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_producto_por_proveedorDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_producto_por_proveedorDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_producto_por_proveedorDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_producto_por_proveedorDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_producto_por_proveedorDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_producto_por_proveedorDefinicionBusqueda.setText("U");
		this.jButtoncon_producto_por_proveedorDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_producto_por_proveedorDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_producto_por_proveedorDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_producto_por_proveedorDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_producto_por_proveedorDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_producto_por_proveedorDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_producto_por_proveedorDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_lote_clienteDefinicion = new JLabelMe();
		this.jLabelcon_lote_clienteDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONLOTECLIENTE+" : *");
		this.jLabelcon_lote_clienteDefinicion.setToolTipText("Lote Cliente");
		this.jLabelcon_lote_clienteDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_lote_clienteDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_lote_clienteDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_lote_clienteDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_lote_clienteDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_lote_clienteDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONLOTECLIENTE);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_lote_clienteDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_lote_clienteDefinicion= new JCheckBoxMe();
		jCheckBoxcon_lote_clienteDefinicion.setEnabled(false);

		jCheckBoxcon_lote_clienteDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_lote_clienteDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_lote_clienteDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_lote_clienteDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_lote_clienteDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_lote_clienteDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_lote_clienteDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_lote_clienteDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_lote_clienteDefinicionBusqueda.setText("U");
		this.jButtoncon_lote_clienteDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_lote_clienteDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_lote_clienteDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_lote_clienteDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_lote_clienteDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_lote_clienteDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_lote_clienteDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_cuenta_contableDefinicion = new JLabelMe();
		this.jLabelcon_cuenta_contableDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONCUENTACONTABLE+" : *");
		this.jLabelcon_cuenta_contableDefinicion.setToolTipText("Cuenta Contable");
		this.jLabelcon_cuenta_contableDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_cuenta_contableDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_cuenta_contableDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cuenta_contableDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cuenta_contableDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cuenta_contableDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONCUENTACONTABLE);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_cuenta_contableDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_cuenta_contableDefinicion= new JCheckBoxMe();
		jCheckBoxcon_cuenta_contableDefinicion.setEnabled(false);

		jCheckBoxcon_cuenta_contableDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuenta_contableDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuenta_contableDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cuenta_contableDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cuenta_contableDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_cuenta_contableDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuenta_contableDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuenta_contableDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cuenta_contableDefinicionBusqueda.setText("U");
		this.jButtoncon_cuenta_contableDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cuenta_contableDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cuenta_contableDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cuenta_contableDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cuenta_contableDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cuenta_contableDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cuenta_contableDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_detalleDefinicion = new JLabelMe();
		this.jLabelcon_detalleDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONDETALLE+" : *");
		this.jLabelcon_detalleDefinicion.setToolTipText("Detalle");
		this.jLabelcon_detalleDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_detalleDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_detalleDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_detalleDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_detalleDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_detalleDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONDETALLE);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_detalleDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_detalleDefinicion= new JCheckBoxMe();
		jCheckBoxcon_detalleDefinicion.setEnabled(false);

		jCheckBoxcon_detalleDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalleDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_detalleDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_detalleDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_detalleDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_detalleDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalleDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_detalleDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_detalleDefinicionBusqueda.setText("U");
		this.jButtoncon_detalleDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_detalleDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_detalleDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_detalleDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_detalleDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_detalleDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_detalleDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_iva_incluidoDefinicion = new JLabelMe();
		this.jLabelcon_iva_incluidoDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONIVAINCLUIDO+" : *");
		this.jLabelcon_iva_incluidoDefinicion.setToolTipText("Iva Incluido");
		this.jLabelcon_iva_incluidoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_iva_incluidoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_iva_incluidoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_iva_incluidoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_iva_incluidoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_iva_incluidoDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONIVAINCLUIDO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_iva_incluidoDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_iva_incluidoDefinicion= new JCheckBoxMe();
		jCheckBoxcon_iva_incluidoDefinicion.setEnabled(false);

		jCheckBoxcon_iva_incluidoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_iva_incluidoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_iva_incluidoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_iva_incluidoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_iva_incluidoDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_iva_incluidoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_iva_incluidoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_iva_incluidoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_iva_incluidoDefinicionBusqueda.setText("U");
		this.jButtoncon_iva_incluidoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_iva_incluidoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_iva_incluidoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_iva_incluidoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_iva_incluidoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_iva_incluidoDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_iva_incluidoDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_lotesDefinicion = new JLabelMe();
		this.jLabelcon_lotesDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONLOTES+" : *");
		this.jLabelcon_lotesDefinicion.setToolTipText("Lotes");
		this.jLabelcon_lotesDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_lotesDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_lotesDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_lotesDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_lotesDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_lotesDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONLOTES);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_lotesDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_lotesDefinicion= new JCheckBoxMe();
		jCheckBoxcon_lotesDefinicion.setEnabled(false);

		jCheckBoxcon_lotesDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_lotesDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_lotesDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_lotesDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_lotesDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_lotesDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_lotesDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_lotesDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_lotesDefinicionBusqueda.setText("U");
		this.jButtoncon_lotesDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_lotesDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_lotesDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_lotesDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_lotesDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_lotesDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_lotesDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelnumero_descuentosDefinicion = new JLabelMe();
		this.jLabelnumero_descuentosDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_NUMERODESCUENTOS+" : *");
		this.jLabelnumero_descuentosDefinicion.setToolTipText("No Descuentos");
		this.jLabelnumero_descuentosDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_descuentosDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_descuentosDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_descuentosDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_descuentosDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_descuentosDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_NUMERODESCUENTOS);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelnumero_descuentosDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jTextFieldnumero_descuentosDefinicion= new JTextFieldMe();
		jTextFieldnumero_descuentosDefinicion.setEnabled(false);
		jTextFieldnumero_descuentosDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,-60),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_descuentosDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,-60),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_descuentosDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,-60),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_descuentosDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_descuentosDefinicion.setText("0");

		this.jButtonnumero_descuentosDefinicionBusqueda= new JButtonMe();
		this.jButtonnumero_descuentosDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_descuentosDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_descuentosDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_descuentosDefinicionBusqueda.setText("U");
		this.jButtonnumero_descuentosDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_descuentosDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_descuentosDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_descuentosDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_descuentosDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_descuentosDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_descuentosDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_precioDefinicion = new JLabelMe();
		this.jLabelcon_precioDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONPRECIO+" : *");
		this.jLabelcon_precioDefinicion.setToolTipText("Precio");
		this.jLabelcon_precioDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_precioDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_precioDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_precioDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_precioDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_precioDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONPRECIO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_precioDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_precioDefinicion= new JCheckBoxMe();
		jCheckBoxcon_precioDefinicion.setEnabled(false);

		jCheckBoxcon_precioDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precioDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precioDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_precioDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_precioDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_precioDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precioDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precioDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_precioDefinicionBusqueda.setText("U");
		this.jButtoncon_precioDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_precioDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_precioDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_precioDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_precioDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_precioDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_precioDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelnumero_registrosDefinicion = new JLabelMe();
		this.jLabelnumero_registrosDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_NUMEROREGISTROS+" : *");
		this.jLabelnumero_registrosDefinicion.setToolTipText("No Registros");
		this.jLabelnumero_registrosDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_registrosDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_registrosDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_registrosDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_registrosDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_registrosDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_NUMEROREGISTROS);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelnumero_registrosDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jTextFieldnumero_registrosDefinicion= new JTextFieldMe();
		jTextFieldnumero_registrosDefinicion.setEnabled(false);
		jTextFieldnumero_registrosDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,-60),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_registrosDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,-60),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_registrosDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,-60),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_registrosDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_registrosDefinicion.setText("0");

		this.jButtonnumero_registrosDefinicionBusqueda= new JButtonMe();
		this.jButtonnumero_registrosDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_registrosDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_registrosDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_registrosDefinicionBusqueda.setText("U");
		this.jButtonnumero_registrosDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_registrosDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_registrosDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_registrosDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_registrosDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_registrosDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_registrosDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_centro_costoDefinicion = new JLabelMe();
		this.jLabelcon_centro_costoDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONCENTROCOSTO+" : *");
		this.jLabelcon_centro_costoDefinicion.setToolTipText("Centro Costo");
		this.jLabelcon_centro_costoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_centro_costoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_centro_costoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_centro_costoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_centro_costoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_centro_costoDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONCENTROCOSTO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_centro_costoDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_centro_costoDefinicion= new JCheckBoxMe();
		jCheckBoxcon_centro_costoDefinicion.setEnabled(false);

		jCheckBoxcon_centro_costoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_centro_costoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_centro_costoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_centro_costoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_centro_costoDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_centro_costoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_centro_costoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_centro_costoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_centro_costoDefinicionBusqueda.setText("U");
		this.jButtoncon_centro_costoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_centro_costoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_centro_costoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_centro_costoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_centro_costoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_centro_costoDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_centro_costoDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_orden_ivaDefinicion = new JLabelMe();
		this.jLabelcon_orden_ivaDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONORDENIVA+" : *");
		this.jLabelcon_orden_ivaDefinicion.setToolTipText("Orden Iva Incluido");
		this.jLabelcon_orden_ivaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_orden_ivaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_orden_ivaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_orden_ivaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_orden_ivaDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_orden_ivaDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONORDENIVA);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_orden_ivaDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_orden_ivaDefinicion= new JCheckBoxMe();
		jCheckBoxcon_orden_ivaDefinicion.setEnabled(false);

		jCheckBoxcon_orden_ivaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_orden_ivaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_orden_ivaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_orden_ivaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_orden_ivaDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_orden_ivaDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_orden_ivaDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_orden_ivaDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_orden_ivaDefinicionBusqueda.setText("U");
		this.jButtoncon_orden_ivaDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_orden_ivaDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_orden_ivaDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_orden_ivaDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_orden_ivaDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_orden_ivaDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_orden_ivaDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_multi_empresaDefinicion = new JLabelMe();
		this.jLabelcon_multi_empresaDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONMULTIEMPRESA+" : *");
		this.jLabelcon_multi_empresaDefinicion.setToolTipText("Multi Empresa");
		this.jLabelcon_multi_empresaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_multi_empresaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_multi_empresaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_multi_empresaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_multi_empresaDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_multi_empresaDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONMULTIEMPRESA);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_multi_empresaDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_multi_empresaDefinicion= new JCheckBoxMe();
		jCheckBoxcon_multi_empresaDefinicion.setEnabled(false);

		jCheckBoxcon_multi_empresaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_multi_empresaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_multi_empresaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_multi_empresaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_multi_empresaDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_multi_empresaDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_multi_empresaDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_multi_empresaDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_multi_empresaDefinicionBusqueda.setText("U");
		this.jButtoncon_multi_empresaDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_multi_empresaDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_multi_empresaDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_multi_empresaDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_multi_empresaDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_multi_empresaDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_multi_empresaDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_en_lineaDefinicion = new JLabelMe();
		this.jLabelcon_en_lineaDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONENLINEA+" : *");
		this.jLabelcon_en_lineaDefinicion.setToolTipText("Integracion En Linea");
		this.jLabelcon_en_lineaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_en_lineaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_en_lineaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_en_lineaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_en_lineaDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_en_lineaDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONENLINEA);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_en_lineaDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_en_lineaDefinicion= new JCheckBoxMe();
		jCheckBoxcon_en_lineaDefinicion.setEnabled(false);

		jCheckBoxcon_en_lineaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_en_lineaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_en_lineaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_en_lineaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_en_lineaDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_en_lineaDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_en_lineaDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_en_lineaDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_en_lineaDefinicionBusqueda.setText("U");
		this.jButtoncon_en_lineaDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_en_lineaDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_en_lineaDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_en_lineaDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_en_lineaDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_en_lineaDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_en_lineaDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_evaluacionDefinicion = new JLabelMe();
		this.jLabelcon_evaluacionDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONEVALUACION+" : *");
		this.jLabelcon_evaluacionDefinicion.setToolTipText("Evaluacion");
		this.jLabelcon_evaluacionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_evaluacionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_evaluacionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_evaluacionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_evaluacionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_evaluacionDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONEVALUACION);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_evaluacionDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_evaluacionDefinicion= new JCheckBoxMe();
		jCheckBoxcon_evaluacionDefinicion.setEnabled(false);

		jCheckBoxcon_evaluacionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_evaluacionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_evaluacionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_evaluacionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_evaluacionDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_evaluacionDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_evaluacionDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_evaluacionDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_evaluacionDefinicionBusqueda.setText("U");
		this.jButtoncon_evaluacionDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_evaluacionDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_evaluacionDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_evaluacionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_evaluacionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_evaluacionDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_evaluacionDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_otDefinicion = new JLabelMe();
		this.jLabelcon_otDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONOT+" : *");
		this.jLabelcon_otDefinicion.setToolTipText("OT");
		this.jLabelcon_otDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_otDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_otDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_otDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_otDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_otDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONOT);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_otDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_otDefinicion= new JCheckBoxMe();
		jCheckBoxcon_otDefinicion.setEnabled(false);

		jCheckBoxcon_otDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_otDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_otDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_otDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_otDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_otDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_otDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_otDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_otDefinicionBusqueda.setText("U");
		this.jButtoncon_otDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_otDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_otDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_otDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_otDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_otDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_otDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_anticipoDefinicion = new JLabelMe();
		this.jLabelcon_anticipoDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONANTICIPO+" : *");
		this.jLabelcon_anticipoDefinicion.setToolTipText("Anticipo");
		this.jLabelcon_anticipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_anticipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_anticipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_anticipoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_anticipoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_anticipoDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONANTICIPO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_anticipoDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_anticipoDefinicion= new JCheckBoxMe();
		jCheckBoxcon_anticipoDefinicion.setEnabled(false);

		jCheckBoxcon_anticipoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_anticipoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_anticipoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_anticipoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_anticipoDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_anticipoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_anticipoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_anticipoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_anticipoDefinicionBusqueda.setText("U");
		this.jButtoncon_anticipoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_anticipoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_anticipoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_anticipoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_anticipoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_anticipoDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_anticipoDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_cierreDefinicion = new JLabelMe();
		this.jLabelcon_cierreDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONCIERRE+" : *");
		this.jLabelcon_cierreDefinicion.setToolTipText("Cierre");
		this.jLabelcon_cierreDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_cierreDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_cierreDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cierreDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cierreDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cierreDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONCIERRE);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_cierreDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_cierreDefinicion= new JCheckBoxMe();
		jCheckBoxcon_cierreDefinicion.setEnabled(false);

		jCheckBoxcon_cierreDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cierreDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cierreDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cierreDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cierreDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_cierreDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cierreDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cierreDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cierreDefinicionBusqueda.setText("U");
		this.jButtoncon_cierreDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cierreDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cierreDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cierreDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cierreDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cierreDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cierreDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_generalDefinicion = new JLabelMe();
		this.jLabelcon_generalDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONGENERAL+" : *");
		this.jLabelcon_generalDefinicion.setToolTipText("General");
		this.jLabelcon_generalDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_generalDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_generalDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_generalDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_generalDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_generalDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONGENERAL);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_generalDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_generalDefinicion= new JCheckBoxMe();
		jCheckBoxcon_generalDefinicion.setEnabled(false);

		jCheckBoxcon_generalDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_generalDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_generalDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_generalDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_generalDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_generalDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_generalDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_generalDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_generalDefinicionBusqueda.setText("U");
		this.jButtoncon_generalDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_generalDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_generalDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_generalDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_generalDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_generalDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_generalDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_por_productoDefinicion = new JLabelMe();
		this.jLabelcon_por_productoDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONPORPRODUCTO+" : *");
		this.jLabelcon_por_productoDefinicion.setToolTipText("Por Producto");
		this.jLabelcon_por_productoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_por_productoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_por_productoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_por_productoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_por_productoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_por_productoDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONPORPRODUCTO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_por_productoDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_por_productoDefinicion= new JCheckBoxMe();
		jCheckBoxcon_por_productoDefinicion.setEnabled(false);

		jCheckBoxcon_por_productoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_por_productoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_por_productoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_por_productoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_por_productoDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_por_productoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_por_productoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_por_productoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_por_productoDefinicionBusqueda.setText("U");
		this.jButtoncon_por_productoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_por_productoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_por_productoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_por_productoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_por_productoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_por_productoDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_por_productoDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_descuentoDefinicion = new JLabelMe();
		this.jLabelcon_descuentoDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONDESCUENTO+" : *");
		this.jLabelcon_descuentoDefinicion.setToolTipText("Descuento");
		this.jLabelcon_descuentoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_descuentoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_descuentoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_descuentoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_descuentoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_descuentoDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONDESCUENTO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_descuentoDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_descuentoDefinicion= new JCheckBoxMe();
		jCheckBoxcon_descuentoDefinicion.setEnabled(false);

		jCheckBoxcon_descuentoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_descuentoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_descuentoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_descuentoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_descuentoDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_descuentoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_descuentoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_descuentoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_descuentoDefinicionBusqueda.setText("U");
		this.jButtoncon_descuentoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_descuentoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_descuentoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_descuentoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_descuentoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_descuentoDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_descuentoDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_seriesDefinicion = new JLabelMe();
		this.jLabelcon_seriesDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONSERIES+" : *");
		this.jLabelcon_seriesDefinicion.setToolTipText("Series");
		this.jLabelcon_seriesDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_seriesDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_seriesDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_seriesDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_seriesDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_seriesDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONSERIES);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_seriesDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_seriesDefinicion= new JCheckBoxMe();
		jCheckBoxcon_seriesDefinicion.setEnabled(false);

		jCheckBoxcon_seriesDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_seriesDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_seriesDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_seriesDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_seriesDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_seriesDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_seriesDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_seriesDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_seriesDefinicionBusqueda.setText("U");
		this.jButtoncon_seriesDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_seriesDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_seriesDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_seriesDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_seriesDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_seriesDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_seriesDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDefinicion = new JLabelMe();
		this.jLabelcantidadDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDefinicion.setToolTipText("Cantidad");
		this.jLabelcantidadDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcantidadDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jTextFieldcantidadDefinicion= new JTextFieldMe();
		jTextFieldcantidadDefinicion.setEnabled(false);
		jTextFieldcantidadDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,-50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,-50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,-50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDefinicion.setText("0");

		this.jButtoncantidadDefinicionBusqueda= new JButtonMe();
		this.jButtoncantidadDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDefinicionBusqueda.setText("U");
		this.jButtoncantidadDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_internoDefinicion = new JLabelMe();
		this.jLabelcon_internoDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONINTERNO+" :");
		this.jLabelcon_internoDefinicion.setToolTipText("P. Interno");
		this.jLabelcon_internoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_internoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_internoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_internoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_internoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_internoDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONINTERNO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_internoDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_internoDefinicion= new JCheckBoxMe();
		jCheckBoxcon_internoDefinicion.setEnabled(false);

		jCheckBoxcon_internoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_internoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_internoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_internoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_internoDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_internoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_internoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_internoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_internoDefinicionBusqueda.setText("U");
		this.jButtoncon_internoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_internoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_internoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_internoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_internoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_internoDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_internoDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_reservaDefinicion = new JLabelMe();
		this.jLabelcon_reservaDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONRESERVA+" : *");
		this.jLabelcon_reservaDefinicion.setToolTipText("Reserva");
		this.jLabelcon_reservaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_reservaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_reservaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_reservaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_reservaDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_reservaDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONRESERVA);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_reservaDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_reservaDefinicion= new JCheckBoxMe();
		jCheckBoxcon_reservaDefinicion.setEnabled(false);

		jCheckBoxcon_reservaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_reservaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_reservaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_reservaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_reservaDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_reservaDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_reservaDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_reservaDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_reservaDefinicionBusqueda.setText("U");
		this.jButtoncon_reservaDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_reservaDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_reservaDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_reservaDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_reservaDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_reservaDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_reservaDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_precio_proveedorDefinicion = new JLabelMe();
		this.jLabelcon_precio_proveedorDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONPRECIOPROVEEDOR+" : *");
		this.jLabelcon_precio_proveedorDefinicion.setToolTipText("Precio Proveedor");
		this.jLabelcon_precio_proveedorDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_precio_proveedorDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_precio_proveedorDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_precio_proveedorDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_precio_proveedorDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_precio_proveedorDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONPRECIOPROVEEDOR);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_precio_proveedorDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_precio_proveedorDefinicion= new JCheckBoxMe();
		jCheckBoxcon_precio_proveedorDefinicion.setEnabled(false);

		jCheckBoxcon_precio_proveedorDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precio_proveedorDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precio_proveedorDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_precio_proveedorDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_precio_proveedorDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_precio_proveedorDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precio_proveedorDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precio_proveedorDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_precio_proveedorDefinicionBusqueda.setText("U");
		this.jButtoncon_precio_proveedorDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_precio_proveedorDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_precio_proveedorDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_precio_proveedorDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_precio_proveedorDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_precio_proveedorDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_precio_proveedorDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_produccionDefinicion = new JLabelMe();
		this.jLabelcon_produccionDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONPRODUCCION+" : *");
		this.jLabelcon_produccionDefinicion.setToolTipText("Produccion");
		this.jLabelcon_produccionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_produccionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_produccionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_produccionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_produccionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_produccionDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONPRODUCCION);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_produccionDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_produccionDefinicion= new JCheckBoxMe();
		jCheckBoxcon_produccionDefinicion.setEnabled(false);

		jCheckBoxcon_produccionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_produccionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_produccionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_produccionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_produccionDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_produccionDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_produccionDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_produccionDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_produccionDefinicionBusqueda.setText("U");
		this.jButtoncon_produccionDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_produccionDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_produccionDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_produccionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_produccionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_produccionDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_produccionDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_codigo_barraDefinicion = new JLabelMe();
		this.jLabelcon_codigo_barraDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONCODIGOBARRA+" : *");
		this.jLabelcon_codigo_barraDefinicion.setToolTipText("Con Codigo Barra");
		this.jLabelcon_codigo_barraDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_codigo_barraDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_codigo_barraDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_codigo_barraDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_codigo_barraDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_codigo_barraDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONCODIGOBARRA);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_codigo_barraDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_codigo_barraDefinicion= new JCheckBoxMe();
		jCheckBoxcon_codigo_barraDefinicion.setEnabled(false);

		jCheckBoxcon_codigo_barraDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_codigo_barraDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_codigo_barraDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_codigo_barraDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_codigo_barraDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_codigo_barraDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_codigo_barraDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_codigo_barraDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_codigo_barraDefinicionBusqueda.setText("U");
		this.jButtoncon_codigo_barraDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_codigo_barraDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_codigo_barraDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_codigo_barraDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_codigo_barraDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_codigo_barraDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_codigo_barraDefinicionBusqueda.setVisible(false);		}


					
		this.jLabelcon_romaneosDefinicion = new JLabelMe();
		this.jLabelcon_romaneosDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_CONROMANEOS+" : *");
		this.jLabelcon_romaneosDefinicion.setToolTipText("Romaneos");
		this.jLabelcon_romaneosDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_romaneosDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_romaneosDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_romaneosDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_romaneosDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_romaneosDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_CONROMANEOS);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelcon_romaneosDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jCheckBoxcon_romaneosDefinicion= new JCheckBoxMe();
		jCheckBoxcon_romaneosDefinicion.setEnabled(false);

		jCheckBoxcon_romaneosDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_romaneosDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_romaneosDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-90),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_romaneosDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_romaneosDefinicionBusqueda= new JButtonMe();
		this.jButtoncon_romaneosDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_romaneosDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_romaneosDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_romaneosDefinicionBusqueda.setText("U");
		this.jButtoncon_romaneosDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_romaneosDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_romaneosDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_romaneosDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_romaneosDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_romaneosDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_romaneosDefinicionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDefinicion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDefinicion = new JLabelMe();
		this.jLabelid_empresaDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDefinicion.setToolTipText("Empresa");
		this.jLabelid_empresaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_empresaDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_empresaDefinicion= new JComboBoxMe();
		jComboBoxid_empresaDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDefinicion.setEnabled(false);

		this.jButtonid_empresaDefinicion= new JButtonMe();
		this.jButtonid_empresaDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDefinicion.setText("Buscar");
		this.jButtonid_empresaDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDefinicion"));

		this.jButtonid_empresaDefinicionBusqueda= new JButtonMe();
		this.jButtonid_empresaDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDefinicionBusqueda.setText("U");
		this.jButtonid_empresaDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_empresaDefinicionUpdate= new JButtonMe();
		this.jButtonid_empresaDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDefinicionUpdate.setText("U");
		this.jButtonid_empresaDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDefinicionUpdate"));



					
		this.jLabelid_moduloDefinicion = new JLabelMe();
		this.jLabelid_moduloDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloDefinicion.setToolTipText("Modulo");
		this.jLabelid_moduloDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_moduloDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_moduloDefinicion= new JComboBoxMe();
		jComboBoxid_moduloDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloDefinicion.setEnabled(false);

		this.jButtonid_moduloDefinicion= new JButtonMe();
		this.jButtonid_moduloDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDefinicion.setText("Buscar");
		this.jButtonid_moduloDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDefinicion"));

		this.jButtonid_moduloDefinicionBusqueda= new JButtonMe();
		this.jButtonid_moduloDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDefinicionBusqueda.setText("U");
		this.jButtonid_moduloDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_moduloDefinicionUpdate= new JButtonMe();
		this.jButtonid_moduloDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDefinicionUpdate.setText("U");
		this.jButtonid_moduloDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDefinicionUpdate"));



					
		this.jLabelid_tipo_definicionDefinicion = new JLabelMe();
		this.jLabelid_tipo_definicionDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDTIPODEFINICION+" : *");
		this.jLabelid_tipo_definicionDefinicion.setToolTipText("Tipo");
		this.jLabelid_tipo_definicionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_definicionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_definicionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_definicionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_definicionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_definicionDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDTIPODEFINICION);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_tipo_definicionDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_tipo_definicionDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_definicionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_definicionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_definicionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_definicionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_definicionDefinicion= new JButtonMe();
		this.jButtonid_tipo_definicionDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_definicionDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_definicionDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_definicionDefinicion.setText("Buscar");
		this.jButtonid_tipo_definicionDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_definicionDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_definicionDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_definicionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_definicionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_definicionDefinicion"));

		this.jButtonid_tipo_definicionDefinicionBusqueda= new JButtonMe();
		this.jButtonid_tipo_definicionDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_definicionDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_definicionDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_definicionDefinicionBusqueda.setText("U");
		this.jButtonid_tipo_definicionDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_definicionDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_definicionDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_definicionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_definicionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_definicionDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_definicionDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_definicionDefinicionUpdate= new JButtonMe();
		this.jButtonid_tipo_definicionDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_definicionDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_definicionDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_definicionDefinicionUpdate.setText("U");
		this.jButtonid_tipo_definicionDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_definicionDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_definicionDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_definicionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_definicionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_definicionDefinicionUpdate"));



					
		this.jLabelid_transaccionDefinicion = new JLabelMe();
		this.jLabelid_transaccionDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionDefinicion.setToolTipText("Transaccion");
		this.jLabelid_transaccionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_transaccionDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_transaccionDefinicion= new JComboBoxMe();
		jComboBoxid_transaccionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionDefinicion= new JButtonMe();
		this.jButtonid_transaccionDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDefinicion.setText("Buscar");
		this.jButtonid_transaccionDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDefinicion"));

		this.jButtonid_transaccionDefinicionBusqueda= new JButtonMe();
		this.jButtonid_transaccionDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionDefinicionBusqueda.setText("U");
		this.jButtonid_transaccionDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_transaccionDefinicionUpdate= new JButtonMe();
		this.jButtonid_transaccionDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionDefinicionUpdate.setText("U");
		this.jButtonid_transaccionDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDefinicionUpdate"));



					
		this.jLabelid_sucursalDefinicion = new JLabelMe();
		this.jLabelid_sucursalDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDefinicion.setToolTipText("Sucursal");
		this.jLabelid_sucursalDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_sucursalDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_sucursalDefinicion= new JComboBoxMe();
		jComboBoxid_sucursalDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sucursalDefinicion= new JButtonMe();
		this.jButtonid_sucursalDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDefinicion.setText("Buscar");
		this.jButtonid_sucursalDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDefinicion"));

		this.jButtonid_sucursalDefinicionBusqueda= new JButtonMe();
		this.jButtonid_sucursalDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDefinicionBusqueda.setText("U");
		this.jButtonid_sucursalDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDefinicionUpdate= new JButtonMe();
		this.jButtonid_sucursalDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDefinicionUpdate.setText("U");
		this.jButtonid_sucursalDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDefinicionUpdate"));



					
		this.jLabelid_tipo_iva_itemDefinicion = new JLabelMe();
		this.jLabelid_tipo_iva_itemDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDTIPOIVAITEM+" : *");
		this.jLabelid_tipo_iva_itemDefinicion.setToolTipText("Iva Item");
		this.jLabelid_tipo_iva_itemDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_iva_itemDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_iva_itemDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_iva_itemDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_iva_itemDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_iva_itemDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDTIPOIVAITEM);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_tipo_iva_itemDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_tipo_iva_itemDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_iva_itemDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_iva_itemDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_iva_itemDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_iva_itemDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_iva_itemDefinicion= new JButtonMe();
		this.jButtonid_tipo_iva_itemDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_iva_itemDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_iva_itemDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_iva_itemDefinicion.setText("Buscar");
		this.jButtonid_tipo_iva_itemDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_iva_itemDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_iva_itemDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_iva_itemDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_iva_itemDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_iva_itemDefinicion"));

		this.jButtonid_tipo_iva_itemDefinicionBusqueda= new JButtonMe();
		this.jButtonid_tipo_iva_itemDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_iva_itemDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_iva_itemDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_iva_itemDefinicionBusqueda.setText("U");
		this.jButtonid_tipo_iva_itemDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_iva_itemDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_iva_itemDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_iva_itemDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_iva_itemDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_iva_itemDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_iva_itemDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_iva_itemDefinicionUpdate= new JButtonMe();
		this.jButtonid_tipo_iva_itemDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_iva_itemDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_iva_itemDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_iva_itemDefinicionUpdate.setText("U");
		this.jButtonid_tipo_iva_itemDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_iva_itemDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_iva_itemDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_iva_itemDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_iva_itemDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_iva_itemDefinicionUpdate"));



					
		this.jLabelid_tipo_global_clienteDefinicion = new JLabelMe();
		this.jLabelid_tipo_global_clienteDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDTIPOGLOBALCLIENTE+" : *");
		this.jLabelid_tipo_global_clienteDefinicion.setToolTipText("T. Cliente");
		this.jLabelid_tipo_global_clienteDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_global_clienteDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_global_clienteDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_global_clienteDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_global_clienteDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_global_clienteDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDTIPOGLOBALCLIENTE);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_tipo_global_clienteDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_tipo_global_clienteDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_global_clienteDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_global_clienteDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_global_clienteDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_global_clienteDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_global_clienteDefinicion= new JButtonMe();
		this.jButtonid_tipo_global_clienteDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_global_clienteDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_global_clienteDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_global_clienteDefinicion.setText("Buscar");
		this.jButtonid_tipo_global_clienteDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_global_clienteDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_global_clienteDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_global_clienteDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_global_clienteDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_global_clienteDefinicion"));

		this.jButtonid_tipo_global_clienteDefinicionBusqueda= new JButtonMe();
		this.jButtonid_tipo_global_clienteDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_global_clienteDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_global_clienteDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_global_clienteDefinicionBusqueda.setText("U");
		this.jButtonid_tipo_global_clienteDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_global_clienteDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_global_clienteDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_global_clienteDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_global_clienteDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_global_clienteDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_global_clienteDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_global_clienteDefinicionUpdate= new JButtonMe();
		this.jButtonid_tipo_global_clienteDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_global_clienteDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_global_clienteDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_global_clienteDefinicionUpdate.setText("U");
		this.jButtonid_tipo_global_clienteDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_global_clienteDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_global_clienteDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_global_clienteDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_global_clienteDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_global_clienteDefinicionUpdate"));



					
		this.jLabelid_tipo_costeo_definicionDefinicion = new JLabelMe();
		this.jLabelid_tipo_costeo_definicionDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDTIPOCOSTEODEFINICION+" : *");
		this.jLabelid_tipo_costeo_definicionDefinicion.setToolTipText("T. Costeo");
		this.jLabelid_tipo_costeo_definicionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_costeo_definicionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_costeo_definicionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_costeo_definicionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_costeo_definicionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_costeo_definicionDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDTIPOCOSTEODEFINICION);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_tipo_costeo_definicionDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_tipo_costeo_definicionDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_costeo_definicionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costeo_definicionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costeo_definicionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_costeo_definicionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_costeo_definicionDefinicion= new JButtonMe();
		this.jButtonid_tipo_costeo_definicionDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costeo_definicionDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costeo_definicionDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costeo_definicionDefinicion.setText("Buscar");
		this.jButtonid_tipo_costeo_definicionDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_costeo_definicionDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costeo_definicionDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_costeo_definicionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costeo_definicionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costeo_definicionDefinicion"));

		this.jButtonid_tipo_costeo_definicionDefinicionBusqueda= new JButtonMe();
		this.jButtonid_tipo_costeo_definicionDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costeo_definicionDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costeo_definicionDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_costeo_definicionDefinicionBusqueda.setText("U");
		this.jButtonid_tipo_costeo_definicionDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_costeo_definicionDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costeo_definicionDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_costeo_definicionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costeo_definicionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costeo_definicionDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_costeo_definicionDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_costeo_definicionDefinicionUpdate= new JButtonMe();
		this.jButtonid_tipo_costeo_definicionDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costeo_definicionDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costeo_definicionDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_costeo_definicionDefinicionUpdate.setText("U");
		this.jButtonid_tipo_costeo_definicionDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_costeo_definicionDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costeo_definicionDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_costeo_definicionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costeo_definicionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costeo_definicionDefinicionUpdate"));



					
		this.jLabelid_tipo_costo_definicionDefinicion = new JLabelMe();
		this.jLabelid_tipo_costo_definicionDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDTIPOCOSTODEFINICION+" : *");
		this.jLabelid_tipo_costo_definicionDefinicion.setToolTipText("T. Costo");
		this.jLabelid_tipo_costo_definicionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_costo_definicionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_costo_definicionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_costo_definicionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_costo_definicionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_costo_definicionDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDTIPOCOSTODEFINICION);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_tipo_costo_definicionDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_tipo_costo_definicionDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_costo_definicionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costo_definicionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_costo_definicionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-40),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_costo_definicionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_costo_definicionDefinicion= new JButtonMe();
		this.jButtonid_tipo_costo_definicionDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costo_definicionDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costo_definicionDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_costo_definicionDefinicion.setText("Buscar");
		this.jButtonid_tipo_costo_definicionDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_costo_definicionDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costo_definicionDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_costo_definicionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costo_definicionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costo_definicionDefinicion"));

		this.jButtonid_tipo_costo_definicionDefinicionBusqueda= new JButtonMe();
		this.jButtonid_tipo_costo_definicionDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costo_definicionDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costo_definicionDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_costo_definicionDefinicionBusqueda.setText("U");
		this.jButtonid_tipo_costo_definicionDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_costo_definicionDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costo_definicionDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_costo_definicionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costo_definicionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costo_definicionDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_costo_definicionDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_costo_definicionDefinicionUpdate= new JButtonMe();
		this.jButtonid_tipo_costo_definicionDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costo_definicionDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_costo_definicionDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_costo_definicionDefinicionUpdate.setText("U");
		this.jButtonid_tipo_costo_definicionDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_costo_definicionDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_costo_definicionDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_costo_definicionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_costo_definicionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_costo_definicionDefinicionUpdate"));



					
		this.jLabelid_formatoDefinicion = new JLabelMe();
		this.jLabelid_formatoDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoDefinicion.setToolTipText("Formato");
		this.jLabelid_formatoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_formatoDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_formatoDefinicion= new JComboBoxMe();
		jComboBoxid_formatoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-30),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-30),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-30),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoDefinicion= new JButtonMe();
		this.jButtonid_formatoDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoDefinicion.setText("Buscar");
		this.jButtonid_formatoDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoDefinicion"));

		this.jButtonid_formatoDefinicionBusqueda= new JButtonMe();
		this.jButtonid_formatoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoDefinicionBusqueda.setText("U");
		this.jButtonid_formatoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_formatoDefinicionUpdate= new JButtonMe();
		this.jButtonid_formatoDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoDefinicionUpdate.setText("U");
		this.jButtonid_formatoDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoDefinicionUpdate"));



					
		this.jLabelid_tipo_tributarioDefinicion = new JLabelMe();
		this.jLabelid_tipo_tributarioDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDTIPOTRIBUTARIO+" : *");
		this.jLabelid_tipo_tributarioDefinicion.setToolTipText("Sustento Trib.");
		this.jLabelid_tipo_tributarioDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_tributarioDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_tributarioDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tributarioDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_tributarioDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_tributarioDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDTIPOTRIBUTARIO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_tipo_tributarioDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_tipo_tributarioDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_tributarioDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tributarioDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_tributarioDefinicion= new JButtonMe();
		this.jButtonid_tipo_tributarioDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioDefinicion.setText("Buscar");
		this.jButtonid_tipo_tributarioDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_tributarioDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_tributarioDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioDefinicion"));

		this.jButtonid_tipo_tributarioDefinicionBusqueda= new JButtonMe();
		this.jButtonid_tipo_tributarioDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tributarioDefinicionBusqueda.setText("U");
		this.jButtonid_tipo_tributarioDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_tributarioDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_tributarioDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_tributarioDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_tributarioDefinicionUpdate= new JButtonMe();
		this.jButtonid_tipo_tributarioDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tributarioDefinicionUpdate.setText("U");
		this.jButtonid_tipo_tributarioDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_tributarioDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_tributarioDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioDefinicionUpdate"));



					
		this.jLabelid_tipo_retencionDefinicion = new JLabelMe();
		this.jLabelid_tipo_retencionDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDTIPORETENCION+" : *");
		this.jLabelid_tipo_retencionDefinicion.setToolTipText("Cod Ret.");
		this.jLabelid_tipo_retencionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencionDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencionDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDTIPORETENCION);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_tipo_retencionDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_tipo_retencionDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_retencionDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencionDefinicion= new JButtonMe();
		this.jButtonid_tipo_retencionDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionDefinicion.setText("Buscar");
		this.jButtonid_tipo_retencionDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencionDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionDefinicion"));

		this.jButtonid_tipo_retencionDefinicionBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencionDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionDefinicionBusqueda.setText("U");
		this.jButtonid_tipo_retencionDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencionDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencionDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencionDefinicionUpdate= new JButtonMe();
		this.jButtonid_tipo_retencionDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionDefinicionUpdate.setText("U");
		this.jButtonid_tipo_retencionDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencionDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencionDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionDefinicionUpdate"));



					
		this.jLabelid_tipo_documentoDefinicion = new JLabelMe();
		this.jLabelid_tipo_documentoDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDTIPODOCUMENTO+" : *");
		this.jLabelid_tipo_documentoDefinicion.setToolTipText("Tipo Documento");
		this.jLabelid_tipo_documentoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documentoDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documentoDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_tipo_documentoDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_tipo_documentoDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_documentoDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documentoDefinicion= new JButtonMe();
		this.jButtonid_tipo_documentoDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoDefinicion.setText("Buscar");
		this.jButtonid_tipo_documentoDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documentoDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documentoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoDefinicion"));

		this.jButtonid_tipo_documentoDefinicionBusqueda= new JButtonMe();
		this.jButtonid_tipo_documentoDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoDefinicionBusqueda.setText("U");
		this.jButtonid_tipo_documentoDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documentoDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documentoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documentoDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documentoDefinicionUpdate= new JButtonMe();
		this.jButtonid_tipo_documentoDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoDefinicionUpdate.setText("U");
		this.jButtonid_tipo_documentoDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documentoDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documentoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoDefinicionUpdate"));



					
		this.jLabelid_libro_contableDefinicion = new JLabelMe();
		this.jLabelid_libro_contableDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDLIBROCONTABLE+" : *");
		this.jLabelid_libro_contableDefinicion.setToolTipText("Libro");
		this.jLabelid_libro_contableDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_libro_contableDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_libro_contableDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_libro_contableDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_libro_contableDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_libro_contableDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDLIBROCONTABLE);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_libro_contableDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_libro_contableDefinicion= new JComboBoxMe();
		jComboBoxid_libro_contableDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_libro_contableDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_libro_contableDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_libro_contableDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_libro_contableDefinicion= new JButtonMe();
		this.jButtonid_libro_contableDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_libro_contableDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_libro_contableDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_libro_contableDefinicion.setText("Buscar");
		this.jButtonid_libro_contableDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_libro_contableDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_libro_contableDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_libro_contableDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_libro_contableDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_libro_contableDefinicion"));

		this.jButtonid_libro_contableDefinicionBusqueda= new JButtonMe();
		this.jButtonid_libro_contableDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_libro_contableDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_libro_contableDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_libro_contableDefinicionBusqueda.setText("U");
		this.jButtonid_libro_contableDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_libro_contableDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_libro_contableDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_libro_contableDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_libro_contableDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_libro_contableDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_libro_contableDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_libro_contableDefinicionUpdate= new JButtonMe();
		this.jButtonid_libro_contableDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_libro_contableDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_libro_contableDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_libro_contableDefinicionUpdate.setText("U");
		this.jButtonid_libro_contableDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_libro_contableDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_libro_contableDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_libro_contableDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_libro_contableDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_libro_contableDefinicionUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloDefinicion = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloDefinicion.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_tipo_transaccion_moduloDefinicion= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloDefinicion.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloDefinicion= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDefinicion.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDefinicion"));

		this.jButtonid_tipo_transaccion_moduloDefinicionBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloDefinicionBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloDefinicionUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloDefinicionUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDefinicionUpdate"));



					
		this.jLabelid_cuenta_contableDefinicion = new JLabelMe();
		this.jLabelid_cuenta_contableDefinicion.setText(""+DefinicionConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableDefinicion.setToolTipText("Cuenta Contable.");
		this.jLabelid_cuenta_contableDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableDefinicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableDefinicion.setToolTipText(DefinicionConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutDefinicion = new GridBagLayout();
		this.jPanelid_cuenta_contableDefinicion.setLayout(this.gridaBagLayoutDefinicion);


		jComboBoxid_cuenta_contableDefinicion= new JComboBoxMe();
		jComboBoxid_cuenta_contableDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cuenta_contableDefinicion.setEnabled(false);

		this.jButtonid_cuenta_contableDefinicion= new JButtonMe();
		this.jButtonid_cuenta_contableDefinicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDefinicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDefinicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDefinicion.setText("Buscar");
		this.jButtonid_cuenta_contableDefinicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableDefinicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDefinicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDefinicion"));

		this.jButtonid_cuenta_contableDefinicionBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableDefinicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDefinicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDefinicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableDefinicionBusqueda.setText("U");
		this.jButtonid_cuenta_contableDefinicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableDefinicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDefinicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDefinicionBusqueda"));

		if(this.definicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableDefinicionBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableDefinicionUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableDefinicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDefinicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDefinicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableDefinicionUpdate.setText("U");
		this.jButtonid_cuenta_contableDefinicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableDefinicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDefinicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDefinicionUpdate"));


		jButtonid_cuenta_contableDefinicionArbol= new JButtonMe();
		jButtonid_cuenta_contableDefinicionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDefinicionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDefinicionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDefinicionArbol.setText("Arbol");
		jButtonid_cuenta_contableDefinicionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableDefinicionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDefinicionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDefinicionArbol"));



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
		//this.jInternalFrameDetalleDefinicion = new DefinicionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Definicion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDefinicion= new GridBagLayout();
		

		
		String sToolTipDefinicion="";
		sToolTipDefinicion=DefinicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDefinicion+="(Inventario.Definicion)";
		}
		
		if(!this.definicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDefinicion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDefinicion = new JButtonMe();
		this.jButtonModificarDefinicion = new JButtonMe();
        this.jButtonActualizarDefinicion = new JButtonMe();
        this.jButtonEliminarDefinicion = new JButtonMe();
        this.jButtonCancelarDefinicion = new JButtonMe();
        this.jButtonGuardarCambiosDefinicion = new JButtonMe();
		this.jButtonGuardarCambiosTablaDefinicion = new JButtonMe();
		this.jButtonCerrarDefinicion = new JButtonMe();
		
		this.jScrollPanelDatosDefinicion = new JScrollPane();   
        this.jScrollPanelDatosEdicionDefinicion = new JScrollPane();
		this.jScrollPanelDatosGeneralDefinicion = new JScrollPane();
				
		
		
		this.jPanelCamposDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciobasicoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciorecargosDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneralDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotipo_documentoDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioanticipos_otrosDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciolistas_preciosDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioseries_archivosDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciootrosDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Definicion";
		
		if(!this.definicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Definiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosDefinicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDefinicion.setName("jPanelCamposDefinicion"); 

		this.jPanelCamposOcultosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDefinicion.setName("jPanelCamposOcultosDefinicion"); 

        this.jPanelAccionesDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDefinicion.setToolTipText("Acciones");
        this.jPanelAccionesDefinicion.setName("Acciones"); 

		this.jPanelAccionesFormularioDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDefinicion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDefinicion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciobasicoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Basico"));
		this.jPanelCamposIniciobasicoDefinicion.setName("jPanelCamposFinbasicoDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciobasicoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciorecargosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Recargos"));
		this.jPanelCamposIniciorecargosDefinicion.setName("jPanelCamposFinrecargosDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciorecargosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciogeneralDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDefinicion.setName("jPanelCamposFingeneralDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotipo_documentoDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Documento"));
		this.jPanelCamposIniciotipo_documentoDefinicion.setName("jPanelCamposFintipo_documentoDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotipo_documentoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioanticipos_otrosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Anticipos Otros"));
		this.jPanelCamposInicioanticipos_otrosDefinicion.setName("jPanelCamposFinanticipos_otrosDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioanticipos_otrosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciolistas_preciosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Listas Precios"));
		this.jPanelCamposIniciolistas_preciosDefinicion.setName("jPanelCamposFinlistas_preciosDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciolistas_preciosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioseries_archivosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Series Archivos"));
		this.jPanelCamposInicioseries_archivosDefinicion.setName("jPanelCamposFinseries_archivosDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioseries_archivosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciootrosDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Otros"));
		this.jPanelCamposIniciootrosDefinicion.setName("jPanelCamposFinotrosDefinicion");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciootrosDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDefinicion.setText("Nuevo");
		this.jButtonModificarDefinicion.setText("Editar");
        this.jButtonActualizarDefinicion.setText("Actualizar");
        this.jButtonEliminarDefinicion.setText("Eliminar");
        this.jButtonCancelarDefinicion.setText("Cancelar");
        this.jButtonGuardarCambiosDefinicion.setText("Guardar");
		this.jButtonGuardarCambiosTablaDefinicion.setText("Guardar");
		this.jButtonCerrarDefinicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDefinicion,"nuevo_button","Nuevo",this.definicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDefinicion,"modificar_button","Editar",this.definicionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDefinicion,"actualizar_button","Actualizar",this.definicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDefinicion,"eliminar_button","Eliminar",this.definicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDefinicion,"cancelar_button","Cancelar",this.definicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDefinicion,"guardarcambios_button","Guardar",this.definicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDefinicion,"guardarcambiostabla_button","Guardar",this.definicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDefinicion,"cerrar_button","Salir",this.definicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDefinicion.setToolTipText("Nuevo"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDefinicion.setToolTipText("Editar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDefinicion.setToolTipText("Actualizar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDefinicion.setToolTipText("Eliminar)"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDefinicion.setToolTipText("Cancelar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDefinicion.setToolTipText("Guardar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDefinicion.setToolTipText("Guardar"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDefinicion.setToolTipText("Salir"+" "+DefinicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDefinicion";
		inputMap = this.jButtonNuevoDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDefinicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDefinicion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDefinicion";
		inputMap = this.jButtonActualizarDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDefinicion"));
		
		//ELIMINAR
		sMapKey = "EliminarDefinicion";
		inputMap = this.jButtonEliminarDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDefinicion"));
		
		//CANCELAR	
		sMapKey = "CancelarDefinicion";
		inputMap = this.jButtonCancelarDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDefinicion"));
		
		//CERRAR		
		sMapKey = "CerrarDefinicion";
		inputMap = this.jButtonCerrarDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDefinicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDefinicion";
		inputMap = this.jButtonGuardarCambiosTablaDefinicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDefinicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDefinicion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDefinicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDefinicion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDefinicion.setToolTipText("Nuevo Definicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDefinicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDefinicion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDefinicion.setToolTipText("Sin Cerrar Ventana Definicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDefinicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDefinicion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDefinicion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDefinicion.setText("Accion");
		this.jComboBoxTiposAccionesDefinicion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDefinicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDefinicion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDefinicion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDefinicion = new JLabelMe();
		
		this.jLabelAccionesDefinicion.setText("Acciones");		
		this.jLabelAccionesDefinicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDefinicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDefinicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDefinicion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDefinicion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDefinicion=new JTabbedPane();
		this.jTabbedPaneRelacionesDefinicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDefinicion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDefinicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDefinicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDefinicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDefinicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDefinicion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDefinicion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDefinicion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDefinicion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDefinicion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDefinicion = new GridBagLayout();
		
		this.jPanelCamposDefinicion.setLayout(gridaBagLayoutCamposDefinicion);
		this.jPanelCamposOcultosDefinicion.setLayout(gridaBagLayoutCamposOcultosDefinicion);
		
		

		GridBagLayout gridaBagLayoutCamposIniciobasicoDefinicion= new GridBagLayout();
		this.jPanelCamposIniciobasicoDefinicion.setLayout(gridaBagLayoutCamposIniciobasicoDefinicion);

		GridBagLayout gridaBagLayoutCamposIniciorecargosDefinicion= new GridBagLayout();
		this.jPanelCamposIniciorecargosDefinicion.setLayout(gridaBagLayoutCamposIniciorecargosDefinicion);

		GridBagLayout gridaBagLayoutCamposIniciogeneralDefinicion= new GridBagLayout();
		this.jPanelCamposIniciogeneralDefinicion.setLayout(gridaBagLayoutCamposIniciogeneralDefinicion);

		GridBagLayout gridaBagLayoutCamposIniciotipo_documentoDefinicion= new GridBagLayout();
		this.jPanelCamposIniciotipo_documentoDefinicion.setLayout(gridaBagLayoutCamposIniciotipo_documentoDefinicion);

		GridBagLayout gridaBagLayoutCamposInicioanticipos_otrosDefinicion= new GridBagLayout();
		this.jPanelCamposInicioanticipos_otrosDefinicion.setLayout(gridaBagLayoutCamposInicioanticipos_otrosDefinicion);

		GridBagLayout gridaBagLayoutCamposIniciolistas_preciosDefinicion= new GridBagLayout();
		this.jPanelCamposIniciolistas_preciosDefinicion.setLayout(gridaBagLayoutCamposIniciolistas_preciosDefinicion);

		GridBagLayout gridaBagLayoutCamposInicioseries_archivosDefinicion= new GridBagLayout();
		this.jPanelCamposInicioseries_archivosDefinicion.setLayout(gridaBagLayoutCamposInicioseries_archivosDefinicion);

		GridBagLayout gridaBagLayoutCamposIniciootrosDefinicion= new GridBagLayout();
		this.jPanelCamposIniciootrosDefinicion.setLayout(gridaBagLayoutCamposIniciootrosDefinicion);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidDefinicion.add(jLabelIdDefinicion, this.gridBagConstraintsDefinicion);



	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidDefinicion.add(jLabelidDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaDefinicion.add(jLabelid_empresaDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDefinicion.add(jButtonid_empresaDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDefinicion.add(jButtonid_empresaDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaDefinicion.add(jComboBoxid_empresaDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_moduloDefinicion.add(jLabelid_moduloDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDefinicion.add(jButtonid_moduloDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDefinicion.add(jButtonid_moduloDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_moduloDefinicion.add(jComboBoxid_moduloDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsecuencial_formatoDefinicion.add(jLabelsecuencial_formatoDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_formatoDefinicion.add(jButtonsecuencial_formatoDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsecuencial_formatoDefinicion.add(jTextFieldsecuencial_formatoDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsecuencialDefinicion.add(jLabelsecuencialDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialDefinicion.add(jButtonsecuencialDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsecuencialDefinicion.add(jTextFieldsecuencialDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_definicionDefinicion.add(jLabelid_tipo_definicionDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_definicionDefinicion.add(jButtonid_tipo_definicionDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_definicionDefinicion.add(jButtonid_tipo_definicionDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_definicionDefinicion.add(jComboBoxid_tipo_definicionDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transaccionDefinicion.add(jLabelid_transaccionDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionDefinicion.add(jButtonid_transaccionDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionDefinicion.add(jButtonid_transaccionDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transaccionDefinicion.add(jComboBoxid_transaccionDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalDefinicion.add(jLabelid_sucursalDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDefinicion.add(jButtonid_sucursalDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDefinicion.add(jButtonid_sucursalDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalDefinicion.add(jComboBoxid_sucursalDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_iva_itemDefinicion.add(jLabelid_tipo_iva_itemDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_iva_itemDefinicion.add(jButtonid_tipo_iva_itemDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_iva_itemDefinicion.add(jButtonid_tipo_iva_itemDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_iva_itemDefinicion.add(jComboBoxid_tipo_iva_itemDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_mostrar_bodegaDefinicion.add(jLabelcon_mostrar_bodegaDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_mostrar_bodegaDefinicion.add(jButtoncon_mostrar_bodegaDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_mostrar_bodegaDefinicion.add(jCheckBoxcon_mostrar_bodegaDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfactorDefinicion.add(jLabelfactorDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfactorDefinicion.add(jButtonfactorDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfactorDefinicion.add(jTextFieldfactorDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_otro_recargoDefinicion.add(jLabelcon_otro_recargoDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_otro_recargoDefinicion.add(jButtoncon_otro_recargoDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_otro_recargoDefinicion.add(jCheckBoxcon_otro_recargoDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_global_clienteDefinicion.add(jLabelid_tipo_global_clienteDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_global_clienteDefinicion.add(jButtonid_tipo_global_clienteDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_global_clienteDefinicion.add(jButtonid_tipo_global_clienteDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_global_clienteDefinicion.add(jComboBoxid_tipo_global_clienteDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_coaDefinicion.add(jLabelcon_coaDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_coaDefinicion.add(jButtoncon_coaDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_coaDefinicion.add(jCheckBoxcon_coaDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_costeo_definicionDefinicion.add(jLabelid_tipo_costeo_definicionDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_costeo_definicionDefinicion.add(jButtonid_tipo_costeo_definicionDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_costeo_definicionDefinicion.add(jButtonid_tipo_costeo_definicionDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_costeo_definicionDefinicion.add(jComboBoxid_tipo_costeo_definicionDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_retencionDefinicion.add(jLabelcon_retencionDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_retencionDefinicion.add(jButtoncon_retencionDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_retencionDefinicion.add(jCheckBoxcon_retencionDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_costo_definicionDefinicion.add(jLabelid_tipo_costo_definicionDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_costo_definicionDefinicion.add(jButtonid_tipo_costo_definicionDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_costo_definicionDefinicion.add(jButtonid_tipo_costo_definicionDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_costo_definicionDefinicion.add(jComboBoxid_tipo_costo_definicionDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_novedad_productoDefinicion.add(jLabelcon_novedad_productoDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_novedad_productoDefinicion.add(jButtoncon_novedad_productoDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_novedad_productoDefinicion.add(jCheckBoxcon_novedad_productoDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_iceDefinicion.add(jLabelcon_iceDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_iceDefinicion.add(jButtoncon_iceDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_iceDefinicion.add(jCheckBoxcon_iceDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_cantidadDefinicion.add(jLabelcon_cantidadDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cantidadDefinicion.add(jButtoncon_cantidadDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_cantidadDefinicion.add(jCheckBoxcon_cantidadDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_producto_por_proveedorDefinicion.add(jLabelcon_producto_por_proveedorDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_producto_por_proveedorDefinicion.add(jButtoncon_producto_por_proveedorDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_producto_por_proveedorDefinicion.add(jCheckBoxcon_producto_por_proveedorDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_lote_clienteDefinicion.add(jLabelcon_lote_clienteDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_lote_clienteDefinicion.add(jButtoncon_lote_clienteDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_lote_clienteDefinicion.add(jCheckBoxcon_lote_clienteDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_cuenta_contableDefinicion.add(jLabelcon_cuenta_contableDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cuenta_contableDefinicion.add(jButtoncon_cuenta_contableDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_cuenta_contableDefinicion.add(jCheckBoxcon_cuenta_contableDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_detalleDefinicion.add(jLabelcon_detalleDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_detalleDefinicion.add(jButtoncon_detalleDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_detalleDefinicion.add(jCheckBoxcon_detalleDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_iva_incluidoDefinicion.add(jLabelcon_iva_incluidoDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_iva_incluidoDefinicion.add(jButtoncon_iva_incluidoDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_iva_incluidoDefinicion.add(jCheckBoxcon_iva_incluidoDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_lotesDefinicion.add(jLabelcon_lotesDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_lotesDefinicion.add(jButtoncon_lotesDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_lotesDefinicion.add(jCheckBoxcon_lotesDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_descuentosDefinicion.add(jLabelnumero_descuentosDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_descuentosDefinicion.add(jButtonnumero_descuentosDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_descuentosDefinicion.add(jTextFieldnumero_descuentosDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_precioDefinicion.add(jLabelcon_precioDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_precioDefinicion.add(jButtoncon_precioDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_precioDefinicion.add(jCheckBoxcon_precioDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_registrosDefinicion.add(jLabelnumero_registrosDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_registrosDefinicion.add(jButtonnumero_registrosDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_registrosDefinicion.add(jTextFieldnumero_registrosDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_centro_costoDefinicion.add(jLabelcon_centro_costoDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_centro_costoDefinicion.add(jButtoncon_centro_costoDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_centro_costoDefinicion.add(jCheckBoxcon_centro_costoDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_orden_ivaDefinicion.add(jLabelcon_orden_ivaDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_orden_ivaDefinicion.add(jButtoncon_orden_ivaDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_orden_ivaDefinicion.add(jCheckBoxcon_orden_ivaDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_multi_empresaDefinicion.add(jLabelcon_multi_empresaDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_multi_empresaDefinicion.add(jButtoncon_multi_empresaDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_multi_empresaDefinicion.add(jCheckBoxcon_multi_empresaDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_formatoDefinicion.add(jLabelid_formatoDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoDefinicion.add(jButtonid_formatoDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoDefinicion.add(jButtonid_formatoDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_formatoDefinicion.add(jComboBoxid_formatoDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_en_lineaDefinicion.add(jLabelcon_en_lineaDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_en_lineaDefinicion.add(jButtoncon_en_lineaDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_en_lineaDefinicion.add(jCheckBoxcon_en_lineaDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_tributarioDefinicion.add(jLabelid_tipo_tributarioDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tributarioDefinicion.add(jButtonid_tipo_tributarioDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tributarioDefinicion.add(jButtonid_tipo_tributarioDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_tributarioDefinicion.add(jComboBoxid_tipo_tributarioDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_retencionDefinicion.add(jLabelid_tipo_retencionDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionDefinicion.add(jButtonid_tipo_retencionDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionDefinicion.add(jButtonid_tipo_retencionDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_retencionDefinicion.add(jComboBoxid_tipo_retencionDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_evaluacionDefinicion.add(jLabelcon_evaluacionDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_evaluacionDefinicion.add(jButtoncon_evaluacionDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_evaluacionDefinicion.add(jCheckBoxcon_evaluacionDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_otDefinicion.add(jLabelcon_otDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_otDefinicion.add(jButtoncon_otDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_otDefinicion.add(jCheckBoxcon_otDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_anticipoDefinicion.add(jLabelcon_anticipoDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_anticipoDefinicion.add(jButtoncon_anticipoDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_anticipoDefinicion.add(jCheckBoxcon_anticipoDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_cierreDefinicion.add(jLabelcon_cierreDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cierreDefinicion.add(jButtoncon_cierreDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_cierreDefinicion.add(jCheckBoxcon_cierreDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_generalDefinicion.add(jLabelcon_generalDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_generalDefinicion.add(jButtoncon_generalDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_generalDefinicion.add(jCheckBoxcon_generalDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_por_productoDefinicion.add(jLabelcon_por_productoDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_por_productoDefinicion.add(jButtoncon_por_productoDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_por_productoDefinicion.add(jCheckBoxcon_por_productoDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_descuentoDefinicion.add(jLabelcon_descuentoDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_descuentoDefinicion.add(jButtoncon_descuentoDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_descuentoDefinicion.add(jCheckBoxcon_descuentoDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_seriesDefinicion.add(jLabelcon_seriesDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_seriesDefinicion.add(jButtoncon_seriesDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_seriesDefinicion.add(jCheckBoxcon_seriesDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcantidadDefinicion.add(jLabelcantidadDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDefinicion.add(jButtoncantidadDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcantidadDefinicion.add(jTextFieldcantidadDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_documentoDefinicion.add(jLabelid_tipo_documentoDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoDefinicion.add(jButtonid_tipo_documentoDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoDefinicion.add(jButtonid_tipo_documentoDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_documentoDefinicion.add(jComboBoxid_tipo_documentoDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_libro_contableDefinicion.add(jLabelid_libro_contableDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_libro_contableDefinicion.add(jButtonid_libro_contableDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_libro_contableDefinicion.add(jButtonid_libro_contableDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_libro_contableDefinicion.add(jComboBoxid_libro_contableDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_internoDefinicion.add(jLabelcon_internoDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_internoDefinicion.add(jButtoncon_internoDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_internoDefinicion.add(jCheckBoxcon_internoDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_reservaDefinicion.add(jLabelcon_reservaDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_reservaDefinicion.add(jButtoncon_reservaDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_reservaDefinicion.add(jCheckBoxcon_reservaDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_precio_proveedorDefinicion.add(jLabelcon_precio_proveedorDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_precio_proveedorDefinicion.add(jButtoncon_precio_proveedorDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_precio_proveedorDefinicion.add(jCheckBoxcon_precio_proveedorDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_produccionDefinicion.add(jLabelcon_produccionDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_produccionDefinicion.add(jButtoncon_produccionDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_produccionDefinicion.add(jCheckBoxcon_produccionDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_codigo_barraDefinicion.add(jLabelcon_codigo_barraDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_codigo_barraDefinicion.add(jButtoncon_codigo_barraDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_codigo_barraDefinicion.add(jCheckBoxcon_codigo_barraDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_romaneosDefinicion.add(jLabelcon_romaneosDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_romaneosDefinicion.add(jButtoncon_romaneosDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_romaneosDefinicion.add(jCheckBoxcon_romaneosDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_transaccion_moduloDefinicion.add(jLabelid_tipo_transaccion_moduloDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloDefinicion.add(jButtonid_tipo_transaccion_moduloDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloDefinicion.add(jButtonid_tipo_transaccion_moduloDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_transaccion_moduloDefinicion.add(jComboBoxid_tipo_transaccion_moduloDefinicion, this.gridBagConstraintsDefinicion);


	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 0;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cuenta_contableDefinicion.add(jLabelid_cuenta_contableDefinicion, this.gridBagConstraintsDefinicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 2;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableDefinicion.add(jButtonid_cuenta_contableDefinicionBusqueda, this.gridBagConstraintsDefinicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		//this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = 3;
		this.gridBagConstraintsDefinicion.ipadx = 0;
		this.gridBagConstraintsDefinicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableDefinicion.add(jButtonid_cuenta_contableDefinicionUpdate, this.gridBagConstraintsDefinicion);
	}

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDefinicion.gridy = 0;
	this.gridBagConstraintsDefinicion.gridx = 1;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cuenta_contableDefinicion.add(jComboBoxid_cuenta_contableDefinicion, this.gridBagConstraintsDefinicion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposOcultosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposOcultosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDefinicion.add(this.jPanelid_empresaDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposOcultosDefinicion % 1==0) {
		iXPanelCamposOcultosDefinicion=0;
		iYPanelCamposOcultosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposOcultosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposOcultosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDefinicion.add(this.jPanelid_moduloDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposOcultosDefinicion % 1==0) {
		iXPanelCamposOcultosDefinicion=0;
		iYPanelCamposOcultosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposOcultosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposOcultosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDefinicion.add(this.jPanelid_tipo_transaccion_moduloDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposOcultosDefinicion % 1==0) {
		iXPanelCamposOcultosDefinicion=0;
		iYPanelCamposOcultosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposOcultosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposOcultosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDefinicion.add(this.jPanelid_cuenta_contableDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposOcultosDefinicion % 1==0) {
		iXPanelCamposOcultosDefinicion=0;
		iYPanelCamposOcultosDefinicion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciobasicoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciobasicoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobasicoDefinicion.add(this.jPanelidDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciobasicoDefinicion % 2==0) {
		iXPanelCamposIniciobasicoDefinicion=0;
		iYPanelCamposIniciobasicoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciobasicoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciobasicoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobasicoDefinicion.add(this.jPanelsecuencial_formatoDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciobasicoDefinicion % 2==0) {
		iXPanelCamposIniciobasicoDefinicion=0;
		iYPanelCamposIniciobasicoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciobasicoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciobasicoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobasicoDefinicion.add(this.jPanelsecuencialDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciobasicoDefinicion % 2==0) {
		iXPanelCamposIniciobasicoDefinicion=0;
		iYPanelCamposIniciobasicoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciobasicoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciobasicoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobasicoDefinicion.add(this.jPanelid_tipo_definicionDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciobasicoDefinicion % 2==0) {
		iXPanelCamposIniciobasicoDefinicion=0;
		iYPanelCamposIniciobasicoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciobasicoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciobasicoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobasicoDefinicion.add(this.jPanelid_transaccionDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciobasicoDefinicion % 2==0) {
		iXPanelCamposIniciobasicoDefinicion=0;
		iYPanelCamposIniciobasicoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciobasicoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciobasicoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobasicoDefinicion.add(this.jPanelid_sucursalDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciobasicoDefinicion % 2==0) {
		iXPanelCamposIniciobasicoDefinicion=0;
		iYPanelCamposIniciobasicoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciobasicoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciobasicoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobasicoDefinicion.add(this.jPanelid_tipo_iva_itemDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciobasicoDefinicion % 2==0) {
		iXPanelCamposIniciobasicoDefinicion=0;
		iYPanelCamposIniciobasicoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciobasicoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciobasicoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobasicoDefinicion.add(this.jPanelcon_mostrar_bodegaDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciobasicoDefinicion % 2==0) {
		iXPanelCamposIniciobasicoDefinicion=0;
		iYPanelCamposIniciobasicoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciobasicoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciobasicoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciobasicoDefinicion.add(this.jPanelfactorDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciobasicoDefinicion % 2==0) {
		iXPanelCamposIniciobasicoDefinicion=0;
		iYPanelCamposIniciobasicoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciorecargosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciorecargosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciorecargosDefinicion.add(this.jPanelcon_otro_recargoDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciorecargosDefinicion % 2==0) {
		iXPanelCamposIniciorecargosDefinicion=0;
		iYPanelCamposIniciorecargosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciorecargosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciorecargosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciorecargosDefinicion.add(this.jPanelid_tipo_global_clienteDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciorecargosDefinicion % 2==0) {
		iXPanelCamposIniciorecargosDefinicion=0;
		iYPanelCamposIniciorecargosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciorecargosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciorecargosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciorecargosDefinicion.add(this.jPanelcon_coaDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciorecargosDefinicion % 2==0) {
		iXPanelCamposIniciorecargosDefinicion=0;
		iYPanelCamposIniciorecargosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciorecargosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciorecargosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciorecargosDefinicion.add(this.jPanelid_tipo_costeo_definicionDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciorecargosDefinicion % 2==0) {
		iXPanelCamposIniciorecargosDefinicion=0;
		iYPanelCamposIniciorecargosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciorecargosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciorecargosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciorecargosDefinicion.add(this.jPanelcon_retencionDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciorecargosDefinicion % 2==0) {
		iXPanelCamposIniciorecargosDefinicion=0;
		iYPanelCamposIniciorecargosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciorecargosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciorecargosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciorecargosDefinicion.add(this.jPanelid_tipo_costo_definicionDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciorecargosDefinicion % 2==0) {
		iXPanelCamposIniciorecargosDefinicion=0;
		iYPanelCamposIniciorecargosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciorecargosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciorecargosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciorecargosDefinicion.add(this.jPanelcon_novedad_productoDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciorecargosDefinicion % 2==0) {
		iXPanelCamposIniciorecargosDefinicion=0;
		iYPanelCamposIniciorecargosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciorecargosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciorecargosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciorecargosDefinicion.add(this.jPanelcon_iceDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciorecargosDefinicion % 2==0) {
		iXPanelCamposIniciorecargosDefinicion=0;
		iYPanelCamposIniciorecargosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelcon_cantidadDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelcon_producto_por_proveedorDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelcon_lote_clienteDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelcon_cuenta_contableDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelcon_detalleDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelcon_iva_incluidoDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelcon_lotesDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelnumero_descuentosDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelcon_precioDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelnumero_registrosDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelcon_centro_costoDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelcon_orden_ivaDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelcon_multi_empresaDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelid_formatoDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciogeneralDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciogeneralDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralDefinicion.add(this.jPanelcon_en_lineaDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciogeneralDefinicion % 2==0) {
		iXPanelCamposIniciogeneralDefinicion=0;
		iYPanelCamposIniciogeneralDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciotipo_documentoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciotipo_documentoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciotipo_documentoDefinicion.add(this.jPanelid_tipo_tributarioDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciotipo_documentoDefinicion % 1==0) {
		iXPanelCamposIniciotipo_documentoDefinicion=0;
		iYPanelCamposIniciotipo_documentoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciotipo_documentoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciotipo_documentoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciotipo_documentoDefinicion.add(this.jPanelid_tipo_retencionDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciotipo_documentoDefinicion % 1==0) {
		iXPanelCamposIniciotipo_documentoDefinicion=0;
		iYPanelCamposIniciotipo_documentoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposInicioanticipos_otrosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposInicioanticipos_otrosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanticipos_otrosDefinicion.add(this.jPanelcon_evaluacionDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposInicioanticipos_otrosDefinicion % 2==0) {
		iXPanelCamposInicioanticipos_otrosDefinicion=0;
		iYPanelCamposInicioanticipos_otrosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposInicioanticipos_otrosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposInicioanticipos_otrosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanticipos_otrosDefinicion.add(this.jPanelcon_otDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposInicioanticipos_otrosDefinicion % 2==0) {
		iXPanelCamposInicioanticipos_otrosDefinicion=0;
		iYPanelCamposInicioanticipos_otrosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposInicioanticipos_otrosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposInicioanticipos_otrosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanticipos_otrosDefinicion.add(this.jPanelcon_anticipoDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposInicioanticipos_otrosDefinicion % 2==0) {
		iXPanelCamposInicioanticipos_otrosDefinicion=0;
		iYPanelCamposInicioanticipos_otrosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposInicioanticipos_otrosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposInicioanticipos_otrosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanticipos_otrosDefinicion.add(this.jPanelcon_cierreDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposInicioanticipos_otrosDefinicion % 2==0) {
		iXPanelCamposInicioanticipos_otrosDefinicion=0;
		iYPanelCamposInicioanticipos_otrosDefinicion++;
	}

	iXPanelCamposIniciolistas_preciosDefinicion=0;
	iYPanelCamposIniciolistas_preciosDefinicion++;

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciolistas_preciosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciolistas_preciosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciolistas_preciosDefinicion.add(this.jPanelcon_generalDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciolistas_preciosDefinicion % 2==0) {
		iXPanelCamposIniciolistas_preciosDefinicion=0;
		iYPanelCamposIniciolistas_preciosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciolistas_preciosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciolistas_preciosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciolistas_preciosDefinicion.add(this.jPanelcon_por_productoDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciolistas_preciosDefinicion % 2==0) {
		iXPanelCamposIniciolistas_preciosDefinicion=0;
		iYPanelCamposIniciolistas_preciosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciolistas_preciosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciolistas_preciosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciolistas_preciosDefinicion.add(this.jPanelcon_descuentoDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciolistas_preciosDefinicion % 2==0) {
		iXPanelCamposIniciolistas_preciosDefinicion=0;
		iYPanelCamposIniciolistas_preciosDefinicion++;
	}

	iXPanelCamposInicioseries_archivosDefinicion=0;
	iYPanelCamposInicioseries_archivosDefinicion++;

	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposInicioseries_archivosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposInicioseries_archivosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioseries_archivosDefinicion.add(this.jPanelcon_seriesDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposInicioseries_archivosDefinicion % 2==0) {
		iXPanelCamposInicioseries_archivosDefinicion=0;
		iYPanelCamposInicioseries_archivosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposInicioseries_archivosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposInicioseries_archivosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioseries_archivosDefinicion.add(this.jPanelcantidadDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposInicioseries_archivosDefinicion % 2==0) {
		iXPanelCamposInicioseries_archivosDefinicion=0;
		iYPanelCamposInicioseries_archivosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciotipo_documentoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciotipo_documentoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciotipo_documentoDefinicion.add(this.jPanelid_tipo_documentoDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciotipo_documentoDefinicion % 1==0) {
		iXPanelCamposIniciotipo_documentoDefinicion=0;
		iYPanelCamposIniciotipo_documentoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciotipo_documentoDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciotipo_documentoDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciotipo_documentoDefinicion.add(this.jPanelid_libro_contableDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciotipo_documentoDefinicion % 1==0) {
		iXPanelCamposIniciotipo_documentoDefinicion=0;
		iYPanelCamposIniciotipo_documentoDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciootrosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciootrosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciootrosDefinicion.add(this.jPanelcon_internoDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciootrosDefinicion % 2==0) {
		iXPanelCamposIniciootrosDefinicion=0;
		iYPanelCamposIniciootrosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciootrosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciootrosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciootrosDefinicion.add(this.jPanelcon_reservaDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciootrosDefinicion % 2==0) {
		iXPanelCamposIniciootrosDefinicion=0;
		iYPanelCamposIniciootrosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciootrosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciootrosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciootrosDefinicion.add(this.jPanelcon_precio_proveedorDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciootrosDefinicion % 2==0) {
		iXPanelCamposIniciootrosDefinicion=0;
		iYPanelCamposIniciootrosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciootrosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciootrosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciootrosDefinicion.add(this.jPanelcon_produccionDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciootrosDefinicion % 2==0) {
		iXPanelCamposIniciootrosDefinicion=0;
		iYPanelCamposIniciootrosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciootrosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciootrosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciootrosDefinicion.add(this.jPanelcon_codigo_barraDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciootrosDefinicion % 2==0) {
		iXPanelCamposIniciootrosDefinicion=0;
		iYPanelCamposIniciootrosDefinicion++;
	}
	this.gridBagConstraintsDefinicion = new GridBagConstraints();
	this.gridBagConstraintsDefinicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDefinicion.gridy = iYPanelCamposIniciootrosDefinicion;
	this.gridBagConstraintsDefinicion.gridx = iXPanelCamposIniciootrosDefinicion++;
	this.gridBagConstraintsDefinicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDefinicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciootrosDefinicion.add(this.jPanelcon_romaneosDefinicion, this.gridBagConstraintsDefinicion);



	if(iXPanelCamposIniciootrosDefinicion % 2==0) {
		iXPanelCamposIniciootrosDefinicion=0;
		iYPanelCamposIniciootrosDefinicion++;
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
			
		GridBagLayout gridaBagLayoutAccionesDefinicion= new GridBagLayout();
		this.jPanelAccionesDefinicion.setLayout(gridaBagLayoutAccionesDefinicion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDefinicion= new GridBagLayout();
		this.jPanelAccionesFormularioDefinicion.setLayout(gridaBagLayoutAccionesFormularioDefinicion);
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDefinicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDefinicion.add(this.jComboBoxTiposAccionesFormularioDefinicion, this.gridBagConstraintsDefinicion);

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDefinicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDefinicion.add(this.jCheckBoxPostAccionNuevoDefinicion, this.gridBagConstraintsDefinicion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.definicionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDefinicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDefinicion.add(this.jCheckBoxPostAccionSinCerrarDefinicion, this.gridBagConstraintsDefinicion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.definicionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.definicionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDefinicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDefinicion.add(this.jCheckBoxPostAccionSinMensajeDefinicion, this.gridBagConstraintsDefinicion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx = iPosXAccion++;
			
		this.jPanelAccionesDefinicion.add(this.jButtonModificarDefinicion, this.gridBagConstraintsDefinicion);							

		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDefinicion.gridy = 0;
		this.gridBagConstraintsDefinicion.gridx =iPosXAccion++;
			
		this.jPanelAccionesDefinicion.add(this.jButtonEliminarDefinicion, this.gridBagConstraintsDefinicion);
		
			
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = 0;		
		this.gridBagConstraintsDefinicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesDefinicion.add(this.jButtonActualizarDefinicion, this.gridBagConstraintsDefinicion);


		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = 0;		
		this.gridBagConstraintsDefinicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesDefinicion.add(this.jButtonGuardarCambiosDefinicion, this.gridBagConstraintsDefinicion);	
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = 0;		
		this.gridBagConstraintsDefinicion.gridx =iPosXAccion++;
		
		this.jPanelAccionesDefinicion.add(this.jButtonCancelarDefinicion, this.gridBagConstraintsDefinicion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDefinicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDefinicion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.definicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDefinicion = new GridBagConstraints();						
			this.gridBagConstraintsDefinicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDefinicion.gridx = 0;		
			//this.gridBagConstraintsDefinicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDefinicion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDefinicion.gridx =0;
		this.gridBagConstraintsDefinicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDefinicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDefinicion, this.gridBagConstraintsDefinicion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DefinicionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDefinicion = new DefinicionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Definicion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Definicion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Definicion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DefinicionModel definicionModel=new DefinicionModel(this);
			
			//SI USARA CLASE INTERNA
			//DefinicionModel.DefinicionFocusTraversalPolicy definicionFocusTraversalPolicy = definicionModel.new DefinicionFocusTraversalPolicy(this);
			
			//definicionFocusTraversalPolicy.setdefinicionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(definicionModel);
			
			
			this.jContentPaneDetalleDefinicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDefinicion = new GridBagLayout();	
			this.jContentPaneDetalleDefinicion.setLayout(gridaBagLayoutDetalleDefinicion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDefinicion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDefinicion = new GridBagConstraints();
				this.gridBagConstraintsDefinicion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDefinicion.gridx = 0;
					
				this.gridBagConstraintsDefinicion.gridwidth=2;
				
				this.jContentPaneDetalleDefinicion.add(jTtoolBarDetalleDefinicion, gridBagConstraintsDefinicion);								
				
}
			
			this.jScrollPanelDatosEdicionDefinicion=   new JScrollPane(jContentPaneDetalleDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDefinicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDefinicion.gridy = 1;
		this.gridBagConstraintsDefinicion.gridx = 0;
		this.gridBagConstraintsDefinicion.gridwidth = 2;
		iGridyRelaciones = 1;
		iGridyRelaciones++;

		this.jContentPaneDetalleDefinicion.add(jPanelCamposIniciobasicoDefinicion, gridBagConstraintsDefinicion);


		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDefinicion.gridy = 2;
		this.gridBagConstraintsDefinicion.gridx = 1;
		iGridyRelaciones = 2;
		iGridyRelaciones++;

		this.jContentPaneDetalleDefinicion.add(jPanelCamposIniciorecargosDefinicion, gridBagConstraintsDefinicion);


		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDefinicion.gridy = 2;
		this.gridBagConstraintsDefinicion.gridx = 0;
		this.gridBagConstraintsDefinicion.gridheight = 2;
		iGridyRelaciones = 2;
		iGridyRelaciones++;

		this.jContentPaneDetalleDefinicion.add(jPanelCamposIniciogeneralDefinicion, gridBagConstraintsDefinicion);


		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDefinicion.gridy = 5;
		this.gridBagConstraintsDefinicion.gridx = 0;
		iGridyRelaciones = 5;
		iGridyRelaciones++;

		this.jContentPaneDetalleDefinicion.add(jPanelCamposIniciotipo_documentoDefinicion, gridBagConstraintsDefinicion);


		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDefinicion.gridy = 3;
		this.gridBagConstraintsDefinicion.gridx = 1;
		iGridyRelaciones = 3;
		iGridyRelaciones++;

		this.jContentPaneDetalleDefinicion.add(jPanelCamposInicioanticipos_otrosDefinicion, gridBagConstraintsDefinicion);


		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDefinicion.gridy = 4;
		this.gridBagConstraintsDefinicion.gridx = 0;
		iGridyRelaciones = 4;
		iGridyRelaciones++;

		this.jContentPaneDetalleDefinicion.add(jPanelCamposIniciolistas_preciosDefinicion, gridBagConstraintsDefinicion);


		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDefinicion.gridy = 4;
		this.gridBagConstraintsDefinicion.gridx = 1;
		iGridyRelaciones = 4;
		iGridyRelaciones++;

		this.jContentPaneDetalleDefinicion.add(jPanelCamposInicioseries_archivosDefinicion, gridBagConstraintsDefinicion);


		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDefinicion.gridy = 5;
		this.gridBagConstraintsDefinicion.gridx = 1;
		iGridyRelaciones = 5;
		iGridyRelaciones++;

		this.jContentPaneDetalleDefinicion.add(jPanelCamposIniciootrosDefinicion, gridBagConstraintsDefinicion);
			
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
						&& definicionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.definicionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDefinicion= new GridBagConstraints();
						this.gridBagConstraintsDefinicion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDefinicion.gridx = 0;
						this.jContentPaneDetalleDefinicion.add(this.jTabbedPaneRelacionesDefinicion, this.gridBagConstraintsDefinicion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDefinicion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDefinicion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDefinicion = new GridBagConstraints();
					this.gridBagConstraintsDefinicion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDefinicion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDefinicion.gridx = 0;
					
					this.gridBagConstraintsDefinicion.gridwidth=2;
				
					this.jContentPaneDetalleDefinicion.add(jPanelCamposOcultosDefinicion, gridBagConstraintsDefinicion);
				
					this.jPanelCamposOcultosDefinicion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDefinicion.gridx = 0;
	        this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.CENTER;//WEST;
			
			this.gridBagConstraintsDefinicion.gridwidth=2;
			
			
			this.jContentPaneDetalleDefinicion.add(this.jPanelAccionesFormularioDefinicion, this.gridBagConstraintsDefinicion);							
			
			
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
	        this.gridBagConstraintsDefinicion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDefinicion.gridx = 0;
	        
			this.gridBagConstraintsDefinicion.gridwidth=2;
			
			this.jContentPaneDetalleDefinicion.add(this.jPanelAccionesDefinicion, this.gridBagConstraintsDefinicion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDefinicion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDefinicion=   new JScrollPane(this.jPanelCamposDefinicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDefinicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDefinicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDefinicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDefinicion.gridx = 0;
			this.gridBagConstraintsDefinicion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDefinicion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDefinicion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDefinicion, this.gridBagConstraintsDefinicion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDefinicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDefinicion, this.gridBagConstraintsDefinicion);			
			
			this.gridBagConstraintsDefinicion = new GridBagConstraints();
			this.gridBagConstraintsDefinicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDefinicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDefinicion, this.gridBagConstraintsDefinicion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDefinicion, this.gridBagConstraintsDefinicion);
			
			
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDefinicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDefinicion, this.gridBagConstraintsDefinicion);
		
			
		this.gridBagConstraintsDefinicion = new GridBagConstraints();
		this.gridBagConstraintsDefinicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDefinicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDefinicion, this.gridBagConstraintsDefinicion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDefinicion;//jContentPane;
		
		return jScrollPanelDatosEdicionDefinicion;
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
