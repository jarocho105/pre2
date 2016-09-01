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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.ParametroFactuPrincipalConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class ParametroFactuPrincipalDetalleFormJInternalFrame extends ParametroFactuPrincipalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroFactuPrincipal;
	
	protected JMenuBar jmenuBarDetalleParametroFactuPrincipal;
	
	protected JMenu jmenuDetalleParametroFactuPrincipal;
	protected JMenu jmenuDetalleArchivoParametroFactuPrincipal;
	protected JMenu jmenuDetalleAccionesParametroFactuPrincipal;
	protected JMenu jmenuDetalleDatosParametroFactuPrincipal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFactuPrincipal;	
	protected GridBagConstraints gridBagConstraintsParametroFactuPrincipal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroFactuPrincipalBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroFactuPrincipal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoParamFactuDescuentoBeanSwingJInternalFrame tipoparamfactudescuentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoparamfactudescuento="";

	protected TipoParamFactuListadoClienteBeanSwingJInternalFrame tipoparamfactulistadoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoparamfactulistadocliente="";

	protected TipoParamFactuSecuenciaTrabajoBeanSwingJInternalFrame tipoparamfactusecuenciatrabajoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoparamfactusecuenciatrabajo="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentofactura="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentonotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentonotacredito="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentonotadebitoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentonotadebito="";

	protected LibroContableBeanSwingJInternalFrame librocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_librocontable="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefleteventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefleteventa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableotrocargoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableotrocargo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablefinanBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablefinan="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableboniBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableboni="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablebonidevolBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablebonidevol="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableiceBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontableice="";
	
	public ParametroFactuPrincipalSessionBean parametrofactuprincipalSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoParamFactuDescuentoSessionBean tipoparamfactudescuentoSessionBean;
	public TipoParamFactuListadoClienteSessionBean tipoparamfactulistadoclienteSessionBean;
	public TipoParamFactuSecuenciaTrabajoSessionBean tipoparamfactusecuenciatrabajoSessionBean;
	public TipoDocumentoSessionBean tipodocumentofacturaSessionBean;
	public TipoDocumentoSessionBean tipodocumentonotacreditoSessionBean;
	public TipoDocumentoSessionBean tipodocumentonotadebitoSessionBean;
	public LibroContableSessionBean librocontableSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public CuentaContableSessionBean cuentacontablefleteventaSessionBean;
	public CuentaContableSessionBean cuentacontableotrocargoSessionBean;
	public CuentaContableSessionBean cuentacontablefinanSessionBean;
	public CuentaContableSessionBean cuentacontableboniSessionBean;
	public CuentaContableSessionBean cuentacontablebonidevolSessionBean;
	public CuentaContableSessionBean cuentacontableiceSessionBean;	
	
	public ParametroFactuPrincipalLogic parametrofactuprincipalLogic;
	
	public JScrollPane jScrollPanelDatosParametroFactuPrincipal;
	public JScrollPane jScrollPanelDatosEdicionParametroFactuPrincipal;
	public JScrollPane jScrollPanelDatosGeneralParametroFactuPrincipal;
	
	protected JPanel jPanelCamposParametroFactuPrincipal;    
	protected JPanel jPanelCamposOcultosParametroFactuPrincipal;    	
	protected JPanel jPanelAccionesParametroFactuPrincipal;
	protected JPanel jPanelAccionesFormularioParametroFactuPrincipal;
    
	
	
	protected JTabbedPane jTabbedPaneCamposParametroFactuPrincipal;	
	protected Integer iXPanelCamposParametroFactuPrincipal=0;
	protected Integer iYPanelCamposParametroFactuPrincipal=0;
	
	protected Integer iXPanelCamposOcultosParametroFactuPrincipal=0;
	protected Integer iYPanelCamposOcultosParametroFactuPrincipal=0;
	
	

	protected JPanel jPanelCamposIniciogeneralParametroFactuPrincipal;
	protected Integer iXPanelCamposIniciogeneralParametroFactuPrincipal=0;
	protected Integer iYPanelCamposIniciogeneralParametroFactuPrincipal=0;

	protected JPanel jPanelCamposIniciotipo_documentoParametroFactuPrincipal;
	protected Integer iXPanelCamposIniciotipo_documentoParametroFactuPrincipal=0;
	protected Integer iYPanelCamposIniciotipo_documentoParametroFactuPrincipal=0;

	protected JPanel jPanelCamposIniciocontableParametroFactuPrincipal;
	protected Integer iXPanelCamposIniciocontableParametroFactuPrincipal=0;
	protected Integer iYPanelCamposIniciocontableParametroFactuPrincipal=0;

	protected JPanel jPanelCamposInicioorden_despachoParametroFactuPrincipal;
	protected Integer iXPanelCamposInicioorden_despachoParametroFactuPrincipal=0;
	protected Integer iYPanelCamposInicioorden_despachoParametroFactuPrincipal=0;

	protected JPanel jPanelCamposIniciosecuencialParametroFactuPrincipal;
	protected Integer iXPanelCamposIniciosecuencialParametroFactuPrincipal=0;
	protected Integer iYPanelCamposIniciosecuencialParametroFactuPrincipal=0;

	protected JPanel jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal;
	protected Integer iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;
	protected Integer iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;

	protected JPanel jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal;
	protected Integer iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal=0;
	protected Integer iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal=0;

	protected JPanel jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal;
	protected Integer iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal=0;
	protected Integer iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal=0;

	protected JPanel jPanelCamposIniciocuenta_contableParametroFactuPrincipal;
	protected Integer iXPanelCamposIniciocuenta_contableParametroFactuPrincipal=0;
	protected Integer iYPanelCamposIniciocuenta_contableParametroFactuPrincipal=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroFactuPrincipal;
	public JButton jButtonModificarParametroFactuPrincipal;
	public JButton jButtonActualizarParametroFactuPrincipal;
    public JButton jButtonEliminarParametroFactuPrincipal;
	public JButton jButtonCancelarParametroFactuPrincipal;
    public JButton jButtonGuardarCambiosParametroFactuPrincipal;
	public JButton jButtonGuardarCambiosTablaParametroFactuPrincipal;
	protected JButton jButtonCerrarParametroFactuPrincipal;
	
	
	protected JButton jButtonProcesarInformacionParametroFactuPrincipal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroFactuPrincipal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroFactuPrincipal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroFactuPrincipal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFactuPrincipal;
	protected JButton jButtonModificarToolBarParametroFactuPrincipal;
	protected JButton jButtonActualizarToolBarParametroFactuPrincipal;
    protected JButton jButtonEliminarToolBarParametroFactuPrincipal;
	protected JButton jButtonCancelarToolBarParametroFactuPrincipal;
    protected JButton jButtonGuardarCambiosToolBarParametroFactuPrincipal;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroFactuPrincipal;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFactuPrincipal;
	protected JButton jButtonCerrarToolBarParametroFactuPrincipal;
	
	protected JButton jButtonProcesarInformacionToolBarParametroFactuPrincipal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFactuPrincipal;
	protected JMenuItem jMenuItemModificarParametroFactuPrincipal;
	protected JMenuItem jMenuItemActualizarParametroFactuPrincipal;
    protected JMenuItem jMenuItemEliminarParametroFactuPrincipal;
	protected JMenuItem jMenuItemCancelarParametroFactuPrincipal;
    protected JMenuItem jMenuItemGuardarCambiosParametroFactuPrincipal;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFactuPrincipal;
	protected JMenuItem jMenuItemCerrarParametroFactuPrincipal;
	protected JMenuItem jMenuItemDetalleCerrarParametroFactuPrincipal;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFactuPrincipal;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroFactuPrincipal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFactuPrincipal;
	protected JMenuItem jMenuItemMostrarOcultarParametroFactuPrincipal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFactuPrincipal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFactuPrincipal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroFactuPrincipal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroFactuPrincipal;
	public JLabel jLabelIdParametroFactuPrincipal;
	public JLabel jLabelidParametroFactuPrincipal;
	public JButton jButtonidParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelen_lineaParametroFactuPrincipal;
	public JLabel jLabelen_lineaParametroFactuPrincipal;
	public JCheckBox jCheckBoxen_lineaParametroFactuPrincipal;
	public JButton jButtonen_lineaParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_cuenta_tipo_clienteParametroFactuPrincipal;
	public JLabel jLabelcon_cuenta_tipo_clienteParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal;
	public JButton jButtoncon_cuenta_tipo_clienteParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_cliente_impuestoParametroFactuPrincipal;
	public JLabel jLabelcon_cliente_impuestoParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_cliente_impuestoParametroFactuPrincipal;
	public JButton jButtoncon_cliente_impuestoParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_impresionParametroFactuPrincipal;
	public JLabel jLabelcon_impresionParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_impresionParametroFactuPrincipal;
	public JButton jButtoncon_impresionParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_secuencial_usuarioParametroFactuPrincipal;
	public JLabel jLabelcon_secuencial_usuarioParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal;
	public JButton jButtoncon_secuencial_usuarioParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_secuencial_editableParametroFactuPrincipal;
	public JLabel jLabelcon_secuencial_editableParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_secuencial_editableParametroFactuPrincipal;
	public JButton jButtoncon_secuencial_editableParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_precio_por_clienteParametroFactuPrincipal;
	public JLabel jLabelcon_precio_por_clienteParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_precio_por_clienteParametroFactuPrincipal;
	public JButton jButtoncon_precio_por_clienteParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_modificar_precioParametroFactuPrincipal;
	public JLabel jLabelcon_modificar_precioParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_modificar_precioParametroFactuPrincipal;
	public JButton jButtoncon_modificar_precioParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_modificar_servicioParametroFactuPrincipal;
	public JLabel jLabelcon_modificar_servicioParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_modificar_servicioParametroFactuPrincipal;
	public JButton jButtoncon_modificar_servicioParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_cambiar_unidadParametroFactuPrincipal;
	public JLabel jLabelcon_cambiar_unidadParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_cambiar_unidadParametroFactuPrincipal;
	public JButton jButtoncon_cambiar_unidadParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelnumero_decimales_unidadParametroFactuPrincipal;
	public JLabel jLabelnumero_decimales_unidadParametroFactuPrincipal;
	public JTextField jTextFieldnumero_decimales_unidadParametroFactuPrincipal;
	public JButton jButtonnumero_decimales_unidadParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_activar_serieParametroFactuPrincipal;
	public JLabel jLabelcon_activar_serieParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_activar_serieParametroFactuPrincipal;
	public JButton jButtoncon_activar_serieParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_activar_loteParametroFactuPrincipal;
	public JLabel jLabelcon_activar_loteParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_activar_loteParametroFactuPrincipal;
	public JButton jButtoncon_activar_loteParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_activar_multi_empresaParametroFactuPrincipal;
	public JLabel jLabelcon_activar_multi_empresaParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal;
	public JButton jButtoncon_activar_multi_empresaParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_centro_costosParametroFactuPrincipal;
	public JLabel jLabelcon_centro_costosParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_centro_costosParametroFactuPrincipal;
	public JButton jButtoncon_centro_costosParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_unidadesParametroFactuPrincipal;
	public JLabel jLabelcon_unidadesParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_unidadesParametroFactuPrincipal;
	public JButton jButtoncon_unidadesParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_cupo_disponibleParametroFactuPrincipal;
	public JLabel jLabelcon_cupo_disponibleParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_cupo_disponibleParametroFactuPrincipal;
	public JButton jButtoncon_cupo_disponibleParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_forma_pagoParametroFactuPrincipal;
	public JLabel jLabelcon_forma_pagoParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_forma_pagoParametroFactuPrincipal;
	public JButton jButtoncon_forma_pagoParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_envio_mailParametroFactuPrincipal;
	public JLabel jLabelcon_envio_mailParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_envio_mailParametroFactuPrincipal;
	public JButton jButtoncon_envio_mailParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_autorizar_proformaParametroFactuPrincipal;
	public JLabel jLabelcon_autorizar_proformaParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_autorizar_proformaParametroFactuPrincipal;
	public JButton jButtoncon_autorizar_proformaParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_bloqueo_pedidoParametroFactuPrincipal;
	public JLabel jLabelcon_bloqueo_pedidoParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal;
	public JButton jButtoncon_bloqueo_pedidoParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_control_anticipoParametroFactuPrincipal;
	public JLabel jLabelcon_control_anticipoParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_control_anticipoParametroFactuPrincipal;
	public JButton jButtoncon_control_anticipoParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_factura_autoParametroFactuPrincipal;
	public JLabel jLabelcon_factura_autoParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_factura_autoParametroFactuPrincipal;
	public JButton jButtoncon_factura_autoParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_grabar_valor_ceroParametroFactuPrincipal;
	public JLabel jLabelcon_grabar_valor_ceroParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal;
	public JButton jButtoncon_grabar_valor_ceroParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_agregar_itemParametroFactuPrincipal;
	public JLabel jLabelcon_agregar_itemParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_agregar_itemParametroFactuPrincipal;
	public JButton jButtoncon_agregar_itemParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelnumero_copiasParametroFactuPrincipal;
	public JLabel jLabelnumero_copiasParametroFactuPrincipal;
	public JTextField jTextFieldnumero_copiasParametroFactuPrincipal;
	public JButton jButtonnumero_copiasParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelleyendaParametroFactuPrincipal;
	public JLabel jLabelleyendaParametroFactuPrincipal;
	public JTextArea jTextArealeyendaParametroFactuPrincipal;
	public JScrollPane jscrollPaneleyendaParametroFactuPrincipal;
	public JButton jButtonleyendaParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelcon_sin_facturaParametroFactuPrincipal;
	public JLabel jLabelcon_sin_facturaParametroFactuPrincipal;
	public JCheckBox jCheckBoxcon_sin_facturaParametroFactuPrincipal;
	public JButton jButtoncon_sin_facturaParametroFactuPrincipalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroFactuPrincipal;
	public JLabel jLabelid_empresaParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroFactuPrincipal;
	public JButton jButtonid_empresaParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_empresaParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroFactuPrincipal;
	public JLabel jLabelid_sucursalParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroFactuPrincipal;
	public JButton jButtonid_sucursalParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_sucursalParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_param_factu_descuentoParametroFactuPrincipal;
	public JLabel jLabelid_tipo_param_factu_descuentoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal;
	public JButton jButtonid_tipo_param_factu_descuentoParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_param_factu_listado_clienteParametroFactuPrincipal;
	public JLabel jLabelid_tipo_param_factu_listado_clienteParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal;
	public JButton jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal;
	public JLabel jLabelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal;
	public JButton jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documento_facturaParametroFactuPrincipal;
	public JLabel jLabelid_tipo_documento_facturaParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_facturaParametroFactuPrincipal;
	public JButton jButtonid_tipo_documento_facturaParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_tipo_documento_facturaParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_facturaParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documento_nota_creditoParametroFactuPrincipal;
	public JLabel jLabelid_tipo_documento_nota_creditoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal;
	public JButton jButtonid_tipo_documento_nota_creditoParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documento_nota_debitoParametroFactuPrincipal;
	public JLabel jLabelid_tipo_documento_nota_debitoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal;
	public JButton jButtonid_tipo_documento_nota_debitoParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelid_libro_contableParametroFactuPrincipal;
	public JLabel jLabelid_libro_contableParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_libro_contableParametroFactuPrincipal;
	public JButton jButtonid_libro_contableParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_libro_contableParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_libro_contableParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaParametroFactuPrincipal;
	public JLabel jLabelid_monedaParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaParametroFactuPrincipal;
	public JButton jButtonid_monedaParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_monedaParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_monedaParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoParametroFactuPrincipal;
	public JLabel jLabelid_formatoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoParametroFactuPrincipal;
	public JButton jButtonid_formatoParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_formatoParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_formatoParametroFactuPrincipalBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_flete_ventaParametroFactuPrincipal;
	public JLabel jLabelid_cuenta_contable_flete_ventaParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal;
	public JButton jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_otro_cargoParametroFactuPrincipal;
	public JLabel jLabelid_cuenta_contable_otro_cargoParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal;
	public JButton jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_finanParametroFactuPrincipal;
	public JLabel jLabelid_cuenta_contable_finanParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_finanParametroFactuPrincipal;
	public JButton jButtonid_cuenta_contable_finanParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finanParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finanParametroFactuPrincipalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_finanParametroFactuPrincipalArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_boniParametroFactuPrincipal;
	public JLabel jLabelid_cuenta_contable_boniParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_boniParametroFactuPrincipal;
	public JButton jButtonid_cuenta_contable_boniParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_cuenta_contable_boniParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_boniParametroFactuPrincipalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_boniParametroFactuPrincipalArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_boni_devolParametroFactuPrincipal;
	public JLabel jLabelid_cuenta_contable_boni_devolParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal;
	public JButton jButtonid_cuenta_contable_boni_devolParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_iceParametroFactuPrincipal;
	public JLabel jLabelid_cuenta_contable_iceParametroFactuPrincipal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_iceParametroFactuPrincipal;
	public JButton jButtonid_cuenta_contable_iceParametroFactuPrincipal= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iceParametroFactuPrincipalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iceParametroFactuPrincipalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_iceParametroFactuPrincipalArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroFactuPrincipal;
	
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
	public int iHeightFormulario=2134;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroFactuPrincipalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroFactuPrincipal=new JPanel();
				this.jPanelAccionesFormularioParametroFactuPrincipal=new JPanel();
				this.jmenuBarDetalleParametroFactuPrincipal=new JMenuBar();
				this.jTtoolBarDetalleParametroFactuPrincipal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuPrincipalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroFactuPrincipal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroFactuPrincipalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroFactuPrincipal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuPrincipalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuPrincipal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuPrincipalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFactuPrincipal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFactuPrincipalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFactuPrincipal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroFactuPrincipal() {
		return this.jButtonActualizarToolBarParametroFactuPrincipal;
	}
	
	public JButton getjButtonEliminarToolBarParametroFactuPrincipal() {
		return this.jButtonEliminarToolBarParametroFactuPrincipal;
	}
	
	public JButton getjButtonCancelarToolBarParametroFactuPrincipal() {
		return this.jButtonCancelarToolBarParametroFactuPrincipal;
	}		
	
	public JButton getjButtonProcesarInformacionParametroFactuPrincipal() {
		return this.jButtonProcesarInformacionParametroFactuPrincipal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFactuPrincipal)	{
		this.jButtonProcesarInformacionParametroFactuPrincipal = jButtonProcesarInformacionParametroFactuPrincipal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFactuPrincipal() {
		return this.jComboBoxTiposAccionesParametroFactuPrincipal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFactuPrincipal(
			JComboBox jComboBoxTiposRelacionesParametroFactuPrincipal) {
		this.jComboBoxTiposRelacionesParametroFactuPrincipal = jComboBoxTiposRelacionesParametroFactuPrincipal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFactuPrincipal(
			JComboBox jComboBoxTiposAccionesParametroFactuPrincipal) {
		this.jComboBoxTiposAccionesParametroFactuPrincipal = jComboBoxTiposAccionesParametroFactuPrincipal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroFactuPrincipal() {
		return this.jComboBoxTiposAccionesFormularioParametroFactuPrincipal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroFactuPrincipal(
			JComboBox jComboBoxTiposAccionesFormularioParametroFactuPrincipal) {
		this.jComboBoxTiposAccionesFormularioParametroFactuPrincipal = jComboBoxTiposAccionesFormularioParametroFactuPrincipal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrofactuprincipalSessionBean=new ParametroFactuPrincipalSessionBean();
		
		this.parametrofactuprincipalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofactuprincipalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFactuPrincipalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFactuPrincipalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFactuPrincipalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Principal  MANTENIMIENTO"));
		
		
		if(iWidth > 4550) {
			iWidth=4550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroFactuPrincipalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroFactuPrincipal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroFactuPrincipal=new JButtonMe();
				this.jButtonModificarToolBarParametroFactuPrincipal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroFactuPrincipal,this.jTtoolBarDetalleParametroFactuPrincipal,
							"actualizar","actualizar","Actualizar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroFactuPrincipal,this.jTtoolBarDetalleParametroFactuPrincipal,
							"eliminar","eliminar","Eliminar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroFactuPrincipal,this.jTtoolBarDetalleParametroFactuPrincipal,
							"cancelar","cancelar","Cancelar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroFactuPrincipal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroFactuPrincipal,this.jTtoolBarDetalleParametroFactuPrincipal,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroFactuPrincipal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroFactuPrincipal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroFactuPrincipal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroFactuPrincipal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroFactuPrincipal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFactuPrincipal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFactuPrincipal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFactuPrincipal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroFactuPrincipal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroFactuPrincipal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroFactuPrincipal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroFactuPrincipal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroFactuPrincipal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroFactuPrincipal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroFactuPrincipal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroFactuPrincipal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroFactuPrincipal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroFactuPrincipal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroFactuPrincipal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroFactuPrincipal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroFactuPrincipal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFactuPrincipal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFactuPrincipal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFactuPrincipal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFactuPrincipal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFactuPrincipal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroFactuPrincipal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroFactuPrincipal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroFactuPrincipal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFactuPrincipal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFactuPrincipal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFactuPrincipal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFactuPrincipal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFactuPrincipal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFactuPrincipal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroFactuPrincipal.add(this.jMenuItemDetalleCerrarParametroFactuPrincipal);
		
		this.jmenuDetalleAccionesParametroFactuPrincipal.add(this.jMenuItemActualizarParametroFactuPrincipal);
		this.jmenuDetalleAccionesParametroFactuPrincipal.add(this.jMenuItemEliminarParametroFactuPrincipal);
		this.jmenuDetalleAccionesParametroFactuPrincipal.add(this.jMenuItemCancelarParametroFactuPrincipal);		
		
		//this.jmenuDetalleDatosParametroFactuPrincipal.add(this.jMenuItemDetalleAbrirOrderByParametroFactuPrincipal);				
		this.jmenuDetalleDatosParametroFactuPrincipal.add(this.jMenuItemDetalleMostarOcultarParametroFactuPrincipal);				
				
		//this.jmenuDetalleAccionesParametroFactuPrincipal.add(this.jMenuItemGuardarCambiosParametroFactuPrincipal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroFactuPrincipal.add(this.jmenuDetalleArchivoParametroFactuPrincipal);		
		this.jmenuBarDetalleParametroFactuPrincipal.add(this.jmenuDetalleAccionesParametroFactuPrincipal);		
		this.jmenuBarDetalleParametroFactuPrincipal.add(this.jmenuDetalleDatosParametroFactuPrincipal);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroFactuPrincipal);				
	}
	
	
	public void inicializarElementosCamposParametroFactuPrincipal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroFactuPrincipal = new JLabelMe();
		jLabelIdParametroFactuPrincipal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroFactuPrincipal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroFactuPrincipal= new GridBagLayout();

		this.jPanelidParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);

		jLabelidParametroFactuPrincipal = new JLabel();
		jLabelidParametroFactuPrincipal.setText("Id");

		jLabelidParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelen_lineaParametroFactuPrincipal = new JLabelMe();
		this.jLabelen_lineaParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_ENLINEA+" : *");
		this.jLabelen_lineaParametroFactuPrincipal.setToolTipText("Contabilizacion En Linea");
		this.jLabelen_lineaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelen_lineaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelen_lineaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelen_lineaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelen_lineaParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelen_lineaParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_ENLINEA);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelen_lineaParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxen_lineaParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxen_lineaParametroFactuPrincipal.setEnabled(false);

		jCheckBoxen_lineaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxen_lineaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxen_lineaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxen_lineaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonen_lineaParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonen_lineaParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonen_lineaParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonen_lineaParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonen_lineaParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonen_lineaParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonen_lineaParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonen_lineaParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxen_lineaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxen_lineaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"en_lineaParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonen_lineaParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_cuenta_tipo_clienteParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_cuenta_tipo_clienteParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONCUENTATIPOCLIENTE+" : *");
		this.jLabelcon_cuenta_tipo_clienteParametroFactuPrincipal.setToolTipText("Cuenta Tipo Cliente");
		this.jLabelcon_cuenta_tipo_clienteParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_cuenta_tipo_clienteParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_cuenta_tipo_clienteParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cuenta_tipo_clienteParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cuenta_tipo_clienteParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cuenta_tipo_clienteParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONCUENTATIPOCLIENTE);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_cuenta_tipo_clienteParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cuenta_tipo_clienteParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_cuenta_tipo_clienteParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuenta_tipo_clienteParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuenta_tipo_clienteParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cuenta_tipo_clienteParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_cuenta_tipo_clienteParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cuenta_tipo_clienteParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cuenta_tipo_clienteParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cuenta_tipo_clienteParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cuenta_tipo_clienteParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_cliente_impuestoParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_cliente_impuestoParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONCLIENTEIMPUESTO+" : *");
		this.jLabelcon_cliente_impuestoParametroFactuPrincipal.setToolTipText("Cliente Impuesto");
		this.jLabelcon_cliente_impuestoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_cliente_impuestoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_cliente_impuestoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cliente_impuestoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cliente_impuestoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cliente_impuestoParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONCLIENTEIMPUESTO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_cliente_impuestoParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_cliente_impuestoParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_cliente_impuestoParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_cliente_impuestoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cliente_impuestoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cliente_impuestoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cliente_impuestoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cliente_impuestoParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_cliente_impuestoParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cliente_impuestoParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cliente_impuestoParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cliente_impuestoParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_cliente_impuestoParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cliente_impuestoParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cliente_impuestoParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cliente_impuestoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cliente_impuestoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cliente_impuestoParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cliente_impuestoParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_impresionParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_impresionParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONIMPRESION+" : *");
		this.jLabelcon_impresionParametroFactuPrincipal.setToolTipText("Impresion");
		this.jLabelcon_impresionParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_impresionParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_impresionParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_impresionParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_impresionParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_impresionParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONIMPRESION);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_impresionParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_impresionParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_impresionParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_impresionParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_impresionParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_impresionParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_impresionParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_impresionParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_impresionParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_impresionParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_impresionParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_impresionParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_impresionParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_impresionParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_impresionParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_impresionParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_impresionParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_impresionParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_impresionParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_secuencial_usuarioParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_secuencial_usuarioParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONSECUENCIALUSUARIO+" : *");
		this.jLabelcon_secuencial_usuarioParametroFactuPrincipal.setToolTipText("Secuencial Usuario");
		this.jLabelcon_secuencial_usuarioParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_secuencial_usuarioParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_secuencial_usuarioParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_secuencial_usuarioParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_secuencial_usuarioParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_secuencial_usuarioParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONSECUENCIALUSUARIO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_secuencial_usuarioParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_secuencial_usuarioParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_secuencial_usuarioParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_secuencial_usuarioParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_secuencial_usuarioParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_secuencial_usuarioParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_secuencial_usuarioParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_secuencial_usuarioParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_secuencial_usuarioParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_secuencial_usuarioParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_secuencial_usuarioParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_secuencial_editableParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_secuencial_editableParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONSECUENCIALEDITABLE+" : *");
		this.jLabelcon_secuencial_editableParametroFactuPrincipal.setToolTipText("Secuencial Editable");
		this.jLabelcon_secuencial_editableParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_secuencial_editableParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_secuencial_editableParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_secuencial_editableParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_secuencial_editableParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_secuencial_editableParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONSECUENCIALEDITABLE);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_secuencial_editableParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_secuencial_editableParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_secuencial_editableParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_secuencial_editableParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_secuencial_editableParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_secuencial_editableParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_secuencial_editableParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_secuencial_editableParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_secuencial_editableParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_secuencial_editableParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_secuencial_editableParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_secuencial_editableParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_secuencial_editableParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_secuencial_editableParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_secuencial_editableParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_secuencial_editableParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_secuencial_editableParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_secuencial_editableParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_secuencial_editableParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_precio_por_clienteParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_precio_por_clienteParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONPRECIOPORCLIENTE+" : *");
		this.jLabelcon_precio_por_clienteParametroFactuPrincipal.setToolTipText("Precio Por Cliente");
		this.jLabelcon_precio_por_clienteParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_precio_por_clienteParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_precio_por_clienteParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_precio_por_clienteParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_precio_por_clienteParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_precio_por_clienteParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONPRECIOPORCLIENTE);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_precio_por_clienteParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_precio_por_clienteParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_precio_por_clienteParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_precio_por_clienteParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precio_por_clienteParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precio_por_clienteParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_precio_por_clienteParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_precio_por_clienteParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_precio_por_clienteParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precio_por_clienteParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precio_por_clienteParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_precio_por_clienteParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_precio_por_clienteParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_precio_por_clienteParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_precio_por_clienteParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_precio_por_clienteParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_precio_por_clienteParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_precio_por_clienteParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_precio_por_clienteParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_modificar_precioParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_modificar_precioParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONMODIFICARPRECIO+" : *");
		this.jLabelcon_modificar_precioParametroFactuPrincipal.setToolTipText("Modificar Precio");
		this.jLabelcon_modificar_precioParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_modificar_precioParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_modificar_precioParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_modificar_precioParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_modificar_precioParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_modificar_precioParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONMODIFICARPRECIO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_modificar_precioParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_modificar_precioParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_modificar_precioParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_modificar_precioParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_modificar_precioParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_modificar_precioParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_modificar_precioParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_modificar_precioParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_modificar_precioParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_modificar_precioParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_modificar_precioParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_modificar_precioParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_modificar_precioParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_modificar_precioParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_modificar_precioParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_modificar_precioParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_modificar_precioParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_modificar_precioParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_modificar_precioParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_modificar_servicioParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_modificar_servicioParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONMODIFICARSERVICIO+" : *");
		this.jLabelcon_modificar_servicioParametroFactuPrincipal.setToolTipText("Modificar Servicio");
		this.jLabelcon_modificar_servicioParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_modificar_servicioParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_modificar_servicioParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_modificar_servicioParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_modificar_servicioParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_modificar_servicioParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONMODIFICARSERVICIO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_modificar_servicioParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_modificar_servicioParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_modificar_servicioParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_modificar_servicioParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_modificar_servicioParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_modificar_servicioParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_modificar_servicioParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_modificar_servicioParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_modificar_servicioParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_modificar_servicioParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_modificar_servicioParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_modificar_servicioParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_modificar_servicioParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_modificar_servicioParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_modificar_servicioParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_modificar_servicioParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_modificar_servicioParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_modificar_servicioParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_modificar_servicioParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_cambiar_unidadParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_cambiar_unidadParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONCAMBIARUNIDAD+" : *");
		this.jLabelcon_cambiar_unidadParametroFactuPrincipal.setToolTipText("Cambiar Unidad");
		this.jLabelcon_cambiar_unidadParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_cambiar_unidadParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_cambiar_unidadParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cambiar_unidadParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cambiar_unidadParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cambiar_unidadParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONCAMBIARUNIDAD);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_cambiar_unidadParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_cambiar_unidadParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_cambiar_unidadParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_cambiar_unidadParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cambiar_unidadParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cambiar_unidadParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cambiar_unidadParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cambiar_unidadParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_cambiar_unidadParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cambiar_unidadParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cambiar_unidadParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cambiar_unidadParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_cambiar_unidadParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cambiar_unidadParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cambiar_unidadParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cambiar_unidadParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cambiar_unidadParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cambiar_unidadParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cambiar_unidadParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelnumero_decimales_unidadParametroFactuPrincipal = new JLabelMe();
		this.jLabelnumero_decimales_unidadParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_NUMERODECIMALESUNIDAD+" : *");
		this.jLabelnumero_decimales_unidadParametroFactuPrincipal.setToolTipText("No Decimales Unidad");
		this.jLabelnumero_decimales_unidadParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_decimales_unidadParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_decimales_unidadParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_decimales_unidadParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_decimales_unidadParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_decimales_unidadParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_NUMERODECIMALESUNIDAD);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelnumero_decimales_unidadParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jTextFieldnumero_decimales_unidadParametroFactuPrincipal= new JTextFieldMe();
		jTextFieldnumero_decimales_unidadParametroFactuPrincipal.setEnabled(false);
		jTextFieldnumero_decimales_unidadParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_decimales_unidadParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_decimales_unidadParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_decimales_unidadParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_decimales_unidadParametroFactuPrincipal.setText("0");

		this.jButtonnumero_decimales_unidadParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonnumero_decimales_unidadParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_decimales_unidadParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_decimales_unidadParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_decimales_unidadParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonnumero_decimales_unidadParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_decimales_unidadParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_decimales_unidadParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_decimales_unidadParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_decimales_unidadParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_decimales_unidadParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_decimales_unidadParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_activar_serieParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_activar_serieParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONACTIVARSERIE+" : *");
		this.jLabelcon_activar_serieParametroFactuPrincipal.setToolTipText("Activar Serie");
		this.jLabelcon_activar_serieParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_activar_serieParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_activar_serieParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_activar_serieParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_activar_serieParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_activar_serieParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONACTIVARSERIE);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_activar_serieParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_activar_serieParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_activar_serieParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_activar_serieParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_activar_serieParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_activar_serieParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_activar_serieParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_activar_serieParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_activar_serieParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_activar_serieParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_activar_serieParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_activar_serieParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_activar_serieParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_activar_serieParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_activar_serieParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_activar_serieParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_activar_serieParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_activar_serieParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_activar_serieParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_activar_loteParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_activar_loteParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONACTIVARLOTE+" : *");
		this.jLabelcon_activar_loteParametroFactuPrincipal.setToolTipText("Activar Lote");
		this.jLabelcon_activar_loteParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_activar_loteParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_activar_loteParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_activar_loteParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_activar_loteParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_activar_loteParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONACTIVARLOTE);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_activar_loteParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_activar_loteParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_activar_loteParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_activar_loteParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_activar_loteParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_activar_loteParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_activar_loteParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_activar_loteParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_activar_loteParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_activar_loteParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_activar_loteParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_activar_loteParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_activar_loteParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_activar_loteParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_activar_loteParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_activar_loteParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_activar_loteParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_activar_loteParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_activar_loteParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_activar_multi_empresaParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_activar_multi_empresaParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONACTIVARMULTIEMPRESA+" : *");
		this.jLabelcon_activar_multi_empresaParametroFactuPrincipal.setToolTipText("Activar Multi Empresa");
		this.jLabelcon_activar_multi_empresaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_activar_multi_empresaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_activar_multi_empresaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_activar_multi_empresaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_activar_multi_empresaParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_activar_multi_empresaParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONACTIVARMULTIEMPRESA);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_activar_multi_empresaParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_activar_multi_empresaParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_activar_multi_empresaParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_activar_multi_empresaParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_activar_multi_empresaParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_activar_multi_empresaParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_activar_multi_empresaParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_activar_multi_empresaParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_activar_multi_empresaParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_activar_multi_empresaParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_activar_multi_empresaParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_centro_costosParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_centro_costosParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONCENTROCOSTOS+" : *");
		this.jLabelcon_centro_costosParametroFactuPrincipal.setToolTipText("Centro Costos");
		this.jLabelcon_centro_costosParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_centro_costosParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_centro_costosParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_centro_costosParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_centro_costosParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_centro_costosParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONCENTROCOSTOS);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_centro_costosParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_centro_costosParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_centro_costosParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_centro_costosParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_centro_costosParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_centro_costosParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_centro_costosParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_centro_costosParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_centro_costosParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_centro_costosParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_centro_costosParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_centro_costosParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_centro_costosParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_centro_costosParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_centro_costosParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_centro_costosParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_centro_costosParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_centro_costosParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_centro_costosParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_unidadesParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_unidadesParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONUNIDADES+" : *");
		this.jLabelcon_unidadesParametroFactuPrincipal.setToolTipText("Convertir Unidades");
		this.jLabelcon_unidadesParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_unidadesParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_unidadesParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_unidadesParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_unidadesParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_unidadesParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONUNIDADES);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_unidadesParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_unidadesParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_unidadesParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_unidadesParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_unidadesParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_unidadesParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_unidadesParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_unidadesParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_unidadesParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_unidadesParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_unidadesParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_unidadesParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_unidadesParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_unidadesParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_unidadesParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_unidadesParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_unidadesParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_unidadesParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_unidadesParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_cupo_disponibleParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_cupo_disponibleParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONCUPODISPONIBLE+" : *");
		this.jLabelcon_cupo_disponibleParametroFactuPrincipal.setToolTipText("Cupo Disponible");
		this.jLabelcon_cupo_disponibleParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_cupo_disponibleParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_cupo_disponibleParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cupo_disponibleParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cupo_disponibleParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cupo_disponibleParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONCUPODISPONIBLE);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_cupo_disponibleParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_cupo_disponibleParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_cupo_disponibleParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_cupo_disponibleParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cupo_disponibleParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cupo_disponibleParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cupo_disponibleParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cupo_disponibleParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_cupo_disponibleParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cupo_disponibleParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cupo_disponibleParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cupo_disponibleParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_cupo_disponibleParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cupo_disponibleParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cupo_disponibleParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cupo_disponibleParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cupo_disponibleParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cupo_disponibleParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cupo_disponibleParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_forma_pagoParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_forma_pagoParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONFORMAPAGO+" : *");
		this.jLabelcon_forma_pagoParametroFactuPrincipal.setToolTipText("Activar Forma Pago");
		this.jLabelcon_forma_pagoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_forma_pagoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_forma_pagoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_forma_pagoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_forma_pagoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_forma_pagoParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONFORMAPAGO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_forma_pagoParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_forma_pagoParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_forma_pagoParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_forma_pagoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_forma_pagoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_forma_pagoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_forma_pagoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_forma_pagoParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_forma_pagoParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_forma_pagoParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_forma_pagoParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_forma_pagoParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_forma_pagoParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_forma_pagoParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_forma_pagoParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_forma_pagoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_forma_pagoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_forma_pagoParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_forma_pagoParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_envio_mailParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_envio_mailParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONENVIOMAIL+" : *");
		this.jLabelcon_envio_mailParametroFactuPrincipal.setToolTipText("Envio Mail");
		this.jLabelcon_envio_mailParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_envio_mailParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_envio_mailParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_envio_mailParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_envio_mailParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_envio_mailParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONENVIOMAIL);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_envio_mailParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_envio_mailParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_envio_mailParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_envio_mailParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_envio_mailParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_envio_mailParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_envio_mailParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_envio_mailParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_envio_mailParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_envio_mailParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_envio_mailParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_envio_mailParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_envio_mailParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_envio_mailParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_envio_mailParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_envio_mailParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_envio_mailParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_envio_mailParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_envio_mailParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_autorizar_proformaParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_autorizar_proformaParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONAUTORIZARPROFORMA+" : *");
		this.jLabelcon_autorizar_proformaParametroFactuPrincipal.setToolTipText("Autorizar Proforma");
		this.jLabelcon_autorizar_proformaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_autorizar_proformaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_autorizar_proformaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_autorizar_proformaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_autorizar_proformaParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_autorizar_proformaParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONAUTORIZARPROFORMA);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_autorizar_proformaParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_autorizar_proformaParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_autorizar_proformaParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_autorizar_proformaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_autorizar_proformaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_autorizar_proformaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_autorizar_proformaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_autorizar_proformaParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_autorizar_proformaParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_autorizar_proformaParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_autorizar_proformaParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_autorizar_proformaParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_autorizar_proformaParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_autorizar_proformaParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_autorizar_proformaParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_autorizar_proformaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_autorizar_proformaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_autorizar_proformaParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_autorizar_proformaParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_bloqueo_pedidoParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_bloqueo_pedidoParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONBLOQUEOPEDIDO+" : *");
		this.jLabelcon_bloqueo_pedidoParametroFactuPrincipal.setToolTipText("Bloqueo Pedido");
		this.jLabelcon_bloqueo_pedidoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_bloqueo_pedidoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_bloqueo_pedidoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_bloqueo_pedidoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_bloqueo_pedidoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_bloqueo_pedidoParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONBLOQUEOPEDIDO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_bloqueo_pedidoParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_bloqueo_pedidoParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_bloqueo_pedidoParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_bloqueo_pedidoParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_bloqueo_pedidoParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_bloqueo_pedidoParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_bloqueo_pedidoParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_bloqueo_pedidoParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_bloqueo_pedidoParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_bloqueo_pedidoParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_bloqueo_pedidoParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_control_anticipoParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_control_anticipoParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONCONTROLANTICIPO+" : *");
		this.jLabelcon_control_anticipoParametroFactuPrincipal.setToolTipText("Control Anticipo");
		this.jLabelcon_control_anticipoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_control_anticipoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_control_anticipoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_control_anticipoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_control_anticipoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_control_anticipoParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONCONTROLANTICIPO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_control_anticipoParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_control_anticipoParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_control_anticipoParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_control_anticipoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_control_anticipoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_control_anticipoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_control_anticipoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_control_anticipoParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_control_anticipoParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_control_anticipoParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_control_anticipoParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_control_anticipoParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_control_anticipoParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_control_anticipoParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_control_anticipoParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_control_anticipoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_control_anticipoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_control_anticipoParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_control_anticipoParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_factura_autoParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_factura_autoParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONFACTURAAUTO+" : *");
		this.jLabelcon_factura_autoParametroFactuPrincipal.setToolTipText("Facturacion Auto.");
		this.jLabelcon_factura_autoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_factura_autoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_factura_autoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_factura_autoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_factura_autoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_factura_autoParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONFACTURAAUTO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_factura_autoParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_factura_autoParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_factura_autoParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_factura_autoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_factura_autoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_factura_autoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_factura_autoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_factura_autoParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_factura_autoParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_factura_autoParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_factura_autoParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_factura_autoParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_factura_autoParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_factura_autoParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_factura_autoParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_factura_autoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_factura_autoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_factura_autoParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_factura_autoParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_grabar_valor_ceroParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_grabar_valor_ceroParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONGRABARVALORCERO+" : *");
		this.jLabelcon_grabar_valor_ceroParametroFactuPrincipal.setToolTipText("Grabar Valor 0");
		this.jLabelcon_grabar_valor_ceroParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_grabar_valor_ceroParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_grabar_valor_ceroParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_grabar_valor_ceroParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_grabar_valor_ceroParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_grabar_valor_ceroParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONGRABARVALORCERO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_grabar_valor_ceroParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_grabar_valor_ceroParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_grabar_valor_ceroParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_grabar_valor_ceroParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_grabar_valor_ceroParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_grabar_valor_ceroParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_grabar_valor_ceroParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_grabar_valor_ceroParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_grabar_valor_ceroParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_grabar_valor_ceroParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_grabar_valor_ceroParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_agregar_itemParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_agregar_itemParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONAGREGARITEM+" : *");
		this.jLabelcon_agregar_itemParametroFactuPrincipal.setToolTipText("Agregar Item");
		this.jLabelcon_agregar_itemParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_agregar_itemParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_agregar_itemParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_agregar_itemParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_agregar_itemParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_agregar_itemParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONAGREGARITEM);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_agregar_itemParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_agregar_itemParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_agregar_itemParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_agregar_itemParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_agregar_itemParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_agregar_itemParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_agregar_itemParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_agregar_itemParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_agregar_itemParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_agregar_itemParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_agregar_itemParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_agregar_itemParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_agregar_itemParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_agregar_itemParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_agregar_itemParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_agregar_itemParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_agregar_itemParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_agregar_itemParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_agregar_itemParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelnumero_copiasParametroFactuPrincipal = new JLabelMe();
		this.jLabelnumero_copiasParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_NUMEROCOPIAS+" : *");
		this.jLabelnumero_copiasParametroFactuPrincipal.setToolTipText("No Copias");
		this.jLabelnumero_copiasParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_copiasParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_copiasParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_copiasParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_copiasParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_copiasParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_NUMEROCOPIAS);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelnumero_copiasParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jTextFieldnumero_copiasParametroFactuPrincipal= new JTextFieldMe();
		jTextFieldnumero_copiasParametroFactuPrincipal.setEnabled(false);
		jTextFieldnumero_copiasParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_copiasParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_copiasParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_copiasParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_copiasParametroFactuPrincipal.setText("0");

		this.jButtonnumero_copiasParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonnumero_copiasParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_copiasParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_copiasParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_copiasParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonnumero_copiasParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_copiasParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_copiasParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_copiasParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_copiasParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_copiasParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_copiasParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelleyendaParametroFactuPrincipal = new JLabelMe();
		this.jLabelleyendaParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_LEYENDA+" : *");
		this.jLabelleyendaParametroFactuPrincipal.setToolTipText("Leyenda");
		this.jLabelleyendaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelleyendaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelleyendaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelleyendaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelleyendaParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelleyendaParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_LEYENDA);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelleyendaParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jTextArealeyendaParametroFactuPrincipal= new JTextAreaMe();
		jTextArealeyendaParametroFactuPrincipal.setEnabled(false);
		jTextArealeyendaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArealeyendaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArealeyendaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArealeyendaParametroFactuPrincipal.setLineWrap(true);
		jTextArealeyendaParametroFactuPrincipal.setWrapStyleWord(true);
		jTextArealeyendaParametroFactuPrincipal.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArealeyendaParametroFactuPrincipal.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArealeyendaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneleyendaParametroFactuPrincipal = new JScrollPane(jTextArealeyendaParametroFactuPrincipal);
		jscrollPaneleyendaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneleyendaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneleyendaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonleyendaParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonleyendaParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonleyendaParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonleyendaParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonleyendaParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonleyendaParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonleyendaParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonleyendaParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArealeyendaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArealeyendaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"leyendaParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonleyendaParametroFactuPrincipalBusqueda.setVisible(false);		}


					
		this.jLabelcon_sin_facturaParametroFactuPrincipal = new JLabelMe();
		this.jLabelcon_sin_facturaParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_CONSINFACTURA+" : *");
		this.jLabelcon_sin_facturaParametroFactuPrincipal.setToolTipText("Sin Factura");
		this.jLabelcon_sin_facturaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_sin_facturaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_sin_facturaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_sin_facturaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_sin_facturaParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_sin_facturaParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_CONSINFACTURA);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelcon_sin_facturaParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jCheckBoxcon_sin_facturaParametroFactuPrincipal= new JCheckBoxMe();
		jCheckBoxcon_sin_facturaParametroFactuPrincipal.setEnabled(false);

		jCheckBoxcon_sin_facturaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_sin_facturaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_sin_facturaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_sin_facturaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_sin_facturaParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtoncon_sin_facturaParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_sin_facturaParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_sin_facturaParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_sin_facturaParametroFactuPrincipalBusqueda.setText("U");
		this.jButtoncon_sin_facturaParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_sin_facturaParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_sin_facturaParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_sin_facturaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_sin_facturaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_sin_facturaParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_sin_facturaParametroFactuPrincipalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroFactuPrincipal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_empresaParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroFactuPrincipal.setToolTipText("Empresa");
		this.jLabelid_empresaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_empresaParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_empresaParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_empresaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroFactuPrincipal.setEnabled(false);

		this.jButtonid_empresaParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_empresaParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_empresaParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuPrincipal"));

		this.jButtonid_empresaParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_empresaParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_empresaParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_empresaParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroFactuPrincipalUpdate"));



					
		this.jLabelid_sucursalParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_sucursalParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroFactuPrincipal.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_sucursalParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_sucursalParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_sucursalParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroFactuPrincipal.setEnabled(false);

		this.jButtonid_sucursalParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_sucursalParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_sucursalParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuPrincipal"));

		this.jButtonid_sucursalParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_sucursalParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_sucursalParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroFactuPrincipalUpdate"));



					
		this.jLabelid_tipo_param_factu_descuentoParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_tipo_param_factu_descuentoParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPOPARAMFACTUDESCUENTO+" : *");
		this.jLabelid_tipo_param_factu_descuentoParametroFactuPrincipal.setToolTipText("T  Descuento General");
		this.jLabelid_tipo_param_factu_descuentoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_param_factu_descuentoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_param_factu_descuentoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_param_factu_descuentoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_param_factu_descuentoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_param_factu_descuentoParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPOPARAMFACTUDESCUENTO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_tipo_param_factu_descuentoParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_param_factu_descuentoParametroFactuPrincipal"));

		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_param_factu_descuentoParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_param_factu_descuentoParametroFactuPrincipalUpdate"));



					
		this.jLabelid_tipo_param_factu_listado_clienteParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPOPARAMFACTULISTADOCLIENTE+" : *");
		this.jLabelid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setToolTipText("T  Listado Cliente/Prov");
		this.jLabelid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_param_factu_listado_clienteParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_param_factu_listado_clienteParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPOPARAMFACTULISTADOCLIENTE);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_param_factu_listado_clienteParametroFactuPrincipal"));

		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_param_factu_listado_clienteParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_param_factu_listado_clienteParametroFactuPrincipalUpdate"));



					
		this.jLabelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPOPARAMFACTUSECUENCIATRABAJO+" : *");
		this.jLabelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setToolTipText("T Secuencia De Trabajo");
		this.jLabelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPOPARAMFACTUSECUENCIATRABAJO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal"));

		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalUpdate"));



					
		this.jLabelid_tipo_documento_facturaParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_tipo_documento_facturaParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPODOCUMENTOFACTURA+" : *");
		this.jLabelid_tipo_documento_facturaParametroFactuPrincipal.setToolTipText("T Documento Factura");
		this.jLabelid_tipo_documento_facturaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_documento_facturaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_documento_facturaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_facturaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documento_facturaParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documento_facturaParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPODOCUMENTOFACTURA);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_tipo_documento_facturaParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_tipo_documento_facturaParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_tipo_documento_facturaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_facturaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_facturaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_facturaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documento_facturaParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_facturaParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documento_facturaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_facturaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_facturaParametroFactuPrincipal"));

		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_facturaParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_facturaParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documento_facturaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_facturaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_facturaParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_facturaParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documento_facturaParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_facturaParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documento_facturaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_facturaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_facturaParametroFactuPrincipalUpdate"));



					
		this.jLabelid_tipo_documento_nota_creditoParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_tipo_documento_nota_creditoParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPODOCUMENTONOTACREDITO+" : *");
		this.jLabelid_tipo_documento_nota_creditoParametroFactuPrincipal.setToolTipText("T Doc Nota Credito");
		this.jLabelid_tipo_documento_nota_creditoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_documento_nota_creditoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_documento_nota_creditoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_nota_creditoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documento_nota_creditoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documento_nota_creditoParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPODOCUMENTONOTACREDITO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_tipo_documento_nota_creditoParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_nota_creditoParametroFactuPrincipal"));

		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_nota_creditoParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_nota_creditoParametroFactuPrincipalUpdate"));



					
		this.jLabelid_tipo_documento_nota_debitoParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_tipo_documento_nota_debitoParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPODOCUMENTONOTADEBITO+" : *");
		this.jLabelid_tipo_documento_nota_debitoParametroFactuPrincipal.setToolTipText("T Doc Nota Debito");
		this.jLabelid_tipo_documento_nota_debitoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_documento_nota_debitoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_documento_nota_debitoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_nota_debitoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documento_nota_debitoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documento_nota_debitoParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDTIPODOCUMENTONOTADEBITO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_tipo_documento_nota_debitoParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_nota_debitoParametroFactuPrincipal"));

		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_nota_debitoParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_nota_debitoParametroFactuPrincipalUpdate"));



					
		this.jLabelid_libro_contableParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_libro_contableParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDLIBROCONTABLE+" : *");
		this.jLabelid_libro_contableParametroFactuPrincipal.setToolTipText("Libro Contable");
		this.jLabelid_libro_contableParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_libro_contableParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_libro_contableParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_libro_contableParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_libro_contableParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_libro_contableParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDLIBROCONTABLE);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_libro_contableParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_libro_contableParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_libro_contableParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_libro_contableParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_libro_contableParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_libro_contableParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_libro_contableParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_libro_contableParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_libro_contableParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_libro_contableParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_libro_contableParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_libro_contableParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_libro_contableParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_libro_contableParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_libro_contableParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_libro_contableParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_libro_contableParametroFactuPrincipal"));

		this.jButtonid_libro_contableParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_libro_contableParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_libro_contableParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_libro_contableParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_libro_contableParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_libro_contableParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_libro_contableParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_libro_contableParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_libro_contableParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_libro_contableParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_libro_contableParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_libro_contableParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_libro_contableParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_libro_contableParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_libro_contableParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_libro_contableParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_libro_contableParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_libro_contableParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_libro_contableParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_libro_contableParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_libro_contableParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_libro_contableParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_libro_contableParametroFactuPrincipalUpdate"));



					
		this.jLabelid_monedaParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_monedaParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaParametroFactuPrincipal.setToolTipText("Moneda");
		this.jLabelid_monedaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_monedaParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_monedaParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_monedaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_monedaParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_monedaParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaParametroFactuPrincipal"));

		this.jButtonid_monedaParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_monedaParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_monedaParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_monedaParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_monedaParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_monedaParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaParametroFactuPrincipalUpdate"));



					
		this.jLabelid_formatoParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_formatoParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoParametroFactuPrincipal.setToolTipText("Formato");
		this.jLabelid_formatoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_formatoParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_formatoParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_formatoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_formatoParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_formatoParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoParametroFactuPrincipal"));

		this.jButtonid_formatoParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_formatoParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_formatoParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_formatoParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_formatoParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_formatoParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoParametroFactuPrincipalUpdate"));



					
		this.jLabelid_cuenta_contable_flete_ventaParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_cuenta_contable_flete_ventaParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEFLETEVENTA+" : *");
		this.jLabelid_cuenta_contable_flete_ventaParametroFactuPrincipal.setToolTipText("C. C. Flete En  Venta");
		this.jLabelid_cuenta_contable_flete_ventaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_flete_ventaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_flete_ventaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_flete_ventaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_flete_ventaParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_flete_ventaParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEFLETEVENTA);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_cuenta_contable_flete_ventaParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_flete_ventaParametroFactuPrincipal"));

		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_flete_ventaParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_flete_ventaParametroFactuPrincipalUpdate"));


		jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalArbol= new JButtonMe();
		jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalArbol.setText("Arbol");
		jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_flete_ventaParametroFactuPrincipalArbol"));



					
		this.jLabelid_cuenta_contable_otro_cargoParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_cuenta_contable_otro_cargoParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEOTROCARGO+" :");
		this.jLabelid_cuenta_contable_otro_cargoParametroFactuPrincipal.setToolTipText("C C. Otros Cargos");
		this.jLabelid_cuenta_contable_otro_cargoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_otro_cargoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_otro_cargoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_otro_cargoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_otro_cargoParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_otro_cargoParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEOTROCARGO);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_cuenta_contable_otro_cargoParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_otro_cargoParametroFactuPrincipal"));

		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_otro_cargoParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_otro_cargoParametroFactuPrincipalUpdate"));


		jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalArbol= new JButtonMe();
		jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalArbol.setText("Arbol");
		jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_otro_cargoParametroFactuPrincipalArbol"));



					
		this.jLabelid_cuenta_contable_finanParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_cuenta_contable_finanParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEFINAN+" : *");
		this.jLabelid_cuenta_contable_finanParametroFactuPrincipal.setToolTipText("C.C.Financiamiento");
		this.jLabelid_cuenta_contable_finanParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_finanParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_finanParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_finanParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_finanParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_finanParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEFINAN);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_cuenta_contable_finanParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_cuenta_contable_finanParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_cuenta_contable_finanParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_finanParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_finanParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_finanParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_finanParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_finanParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_finanParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_finanParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_finanParametroFactuPrincipal"));

		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_finanParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_finanParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_finanParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_finanParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_finanParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_finanParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_finanParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_finanParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_finanParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_finanParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_finanParametroFactuPrincipalUpdate"));


		jButtonid_cuenta_contable_finanParametroFactuPrincipalArbol= new JButtonMe();
		jButtonid_cuenta_contable_finanParametroFactuPrincipalArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_finanParametroFactuPrincipalArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_finanParametroFactuPrincipalArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_finanParametroFactuPrincipalArbol.setText("Arbol");
		jButtonid_cuenta_contable_finanParametroFactuPrincipalArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_finanParametroFactuPrincipalArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_finanParametroFactuPrincipalArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_finanParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_finanParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_finanParametroFactuPrincipalArbol"));



					
		this.jLabelid_cuenta_contable_boniParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_cuenta_contable_boniParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEBONI+" : *");
		this.jLabelid_cuenta_contable_boniParametroFactuPrincipal.setToolTipText("C. C. Bonificaciones");
		this.jLabelid_cuenta_contable_boniParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_boniParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_boniParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_boniParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_boniParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_boniParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEBONI);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_cuenta_contable_boniParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_cuenta_contable_boniParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_cuenta_contable_boniParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_boniParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_boniParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_boniParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_boniParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_boniParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_boniParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_boniParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_boniParametroFactuPrincipal"));

		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_boniParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_boniParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_boniParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_boniParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_boniParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_boniParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_boniParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_boniParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_boniParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_boniParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_boniParametroFactuPrincipalUpdate"));


		jButtonid_cuenta_contable_boniParametroFactuPrincipalArbol= new JButtonMe();
		jButtonid_cuenta_contable_boniParametroFactuPrincipalArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_boniParametroFactuPrincipalArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_boniParametroFactuPrincipalArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_boniParametroFactuPrincipalArbol.setText("Arbol");
		jButtonid_cuenta_contable_boniParametroFactuPrincipalArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_boniParametroFactuPrincipalArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_boniParametroFactuPrincipalArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_boniParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_boniParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_boniParametroFactuPrincipalArbol"));



					
		this.jLabelid_cuenta_contable_boni_devolParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_cuenta_contable_boni_devolParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEBONIDEVOL+" : *");
		this.jLabelid_cuenta_contable_boni_devolParametroFactuPrincipal.setToolTipText("C. C. Dev. Bonificaciones");
		this.jLabelid_cuenta_contable_boni_devolParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_boni_devolParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_boni_devolParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_boni_devolParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_boni_devolParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_boni_devolParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEBONIDEVOL);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_cuenta_contable_boni_devolParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_boni_devolParametroFactuPrincipal"));

		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_boni_devolParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_boni_devolParametroFactuPrincipalUpdate"));


		jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalArbol= new JButtonMe();
		jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalArbol.setText("Arbol");
		jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_boni_devolParametroFactuPrincipalArbol"));



					
		this.jLabelid_cuenta_contable_iceParametroFactuPrincipal = new JLabelMe();
		this.jLabelid_cuenta_contable_iceParametroFactuPrincipal.setText(""+ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEICE+" : *");
		this.jLabelid_cuenta_contable_iceParametroFactuPrincipal.setToolTipText("C Contable Ice");
		this.jLabelid_cuenta_contable_iceParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable_iceParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable_iceParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_iceParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_iceParametroFactuPrincipal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_iceParametroFactuPrincipal.setToolTipText(ParametroFactuPrincipalConstantesFunciones.LABEL_IDCUENTACONTABLEICE);
		this.gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		this.jPanelid_cuenta_contable_iceParametroFactuPrincipal.setLayout(this.gridaBagLayoutParametroFactuPrincipal);


		jComboBoxid_cuenta_contable_iceParametroFactuPrincipal= new JComboBoxMe();
		jComboBoxid_cuenta_contable_iceParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iceParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_iceParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_iceParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_iceParametroFactuPrincipal= new JButtonMe();
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipal.setText("Buscar");
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iceParametroFactuPrincipal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_iceParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iceParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iceParametroFactuPrincipal"));

		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iceParametroFactuPrincipalBusqueda.setText("U");
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iceParametroFactuPrincipalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_iceParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iceParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iceParametroFactuPrincipalBusqueda"));

		if(this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_iceParametroFactuPrincipalUpdate.setText("U");
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_iceParametroFactuPrincipalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iceParametroFactuPrincipalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_iceParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iceParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iceParametroFactuPrincipalUpdate"));


		jButtonid_cuenta_contable_iceParametroFactuPrincipalArbol= new JButtonMe();
		jButtonid_cuenta_contable_iceParametroFactuPrincipalArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iceParametroFactuPrincipalArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iceParametroFactuPrincipalArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_iceParametroFactuPrincipalArbol.setText("Arbol");
		jButtonid_cuenta_contable_iceParametroFactuPrincipalArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_iceParametroFactuPrincipalArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_iceParametroFactuPrincipalArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_iceParametroFactuPrincipal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_iceParametroFactuPrincipal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_iceParametroFactuPrincipalArbol"));



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
		//this.jInternalFrameDetalleParametroFactuPrincipal = new ParametroFactuPrincipalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Principal  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFactuPrincipal= new GridBagLayout();
		

		
		String sToolTipParametroFactuPrincipal="";
		sToolTipParametroFactuPrincipal=ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFactuPrincipal+="(Facturacion.ParametroFactuPrincipal)";
		}
		
		if(!this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFactuPrincipal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroFactuPrincipal = new JButtonMe();
		this.jButtonModificarParametroFactuPrincipal = new JButtonMe();
        this.jButtonActualizarParametroFactuPrincipal = new JButtonMe();
        this.jButtonEliminarParametroFactuPrincipal = new JButtonMe();
        this.jButtonCancelarParametroFactuPrincipal = new JButtonMe();
        this.jButtonGuardarCambiosParametroFactuPrincipal = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroFactuPrincipal = new JButtonMe();
		this.jButtonCerrarParametroFactuPrincipal = new JButtonMe();
		
		this.jScrollPanelDatosParametroFactuPrincipal = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroFactuPrincipal = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroFactuPrincipal = new JScrollPane();
				
		
		
		this.jPanelCamposParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposParametroFactuPrincipal=new JTabbedPane();
		
		this.jTabbedPaneCamposParametroFactuPrincipal.setTabPlacement(JTabbedPane.LEFT);
		
		this.jTabbedPaneCamposParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontableParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioorden_despachoParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciosecuencialParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Principal ";
		
		if(!this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Principal s" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFactuPrincipal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroFactuPrincipal.setName("jPanelCamposParametroFactuPrincipal"); 

		this.jPanelCamposOcultosParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroFactuPrincipal.setName("jPanelCamposOcultosParametroFactuPrincipal"); 

        this.jPanelAccionesParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFactuPrincipal.setToolTipText("Acciones");
        this.jPanelAccionesParametroFactuPrincipal.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroFactuPrincipal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroFactuPrincipal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroFactuPrincipal.setName("jPanelCamposFingeneralParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Documento"));
		this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal.setName("jPanelCamposFintipo_documentoParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontableParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableParametroFactuPrincipal.setName("jPanelCamposFincontableParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioorden_despachoParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden Despacho"));
		this.jPanelCamposInicioorden_despachoParametroFactuPrincipal.setName("jPanelCamposFinorden_despachoParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioorden_despachoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciosecuencialParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Secuencial"));
		this.jPanelCamposIniciosecuencialParametroFactuPrincipal.setName("jPanelCamposFinsecuencialParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciosecuencialParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuracion Producto Detalle"));
		this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.setName("jPanelCamposFinconfiguracion_producto_detalleParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Control Cartera Pedido"));
		this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal.setName("jPanelCamposFincontrol_cartera_pedidoParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuracion Factura"));
		this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal.setName("jPanelCamposFinconfiguracion_facturaParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Contable"));
		this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal.setName("jPanelCamposFincuenta_contableParametroFactuPrincipal");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroFactuPrincipal.setText("Nuevo");
		this.jButtonModificarParametroFactuPrincipal.setText("Editar");
        this.jButtonActualizarParametroFactuPrincipal.setText("Actualizar");
        this.jButtonEliminarParametroFactuPrincipal.setText("Eliminar");
        this.jButtonCancelarParametroFactuPrincipal.setText("Cancelar");
        this.jButtonGuardarCambiosParametroFactuPrincipal.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroFactuPrincipal.setText("Guardar");
		this.jButtonCerrarParametroFactuPrincipal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFactuPrincipal,"nuevo_button","Nuevo",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroFactuPrincipal,"modificar_button","Editar",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroFactuPrincipal,"actualizar_button","Actualizar",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroFactuPrincipal,"eliminar_button","Eliminar",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroFactuPrincipal,"cancelar_button","Cancelar",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroFactuPrincipal,"guardarcambios_button","Guardar",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFactuPrincipal,"guardarcambiostabla_button","Guardar",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFactuPrincipal,"cerrar_button","Salir",this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroFactuPrincipal.setToolTipText("Nuevo"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroFactuPrincipal.setToolTipText("Editar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroFactuPrincipal.setToolTipText("Actualizar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroFactuPrincipal.setToolTipText("Eliminar)"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroFactuPrincipal.setToolTipText("Cancelar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroFactuPrincipal.setToolTipText("Guardar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroFactuPrincipal.setToolTipText("Guardar"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFactuPrincipal.setToolTipText("Salir"+" "+ParametroFactuPrincipalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFactuPrincipal";
		inputMap = this.jButtonNuevoParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFactuPrincipal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFactuPrincipal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroFactuPrincipal";
		inputMap = this.jButtonActualizarParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroFactuPrincipal"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroFactuPrincipal";
		inputMap = this.jButtonEliminarParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroFactuPrincipal"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroFactuPrincipal";
		inputMap = this.jButtonCancelarParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroFactuPrincipal"));
		
		//CERRAR		
		sMapKey = "CerrarParametroFactuPrincipal";
		inputMap = this.jButtonCerrarParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFactuPrincipal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFactuPrincipal";
		inputMap = this.jButtonGuardarCambiosTablaParametroFactuPrincipal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFactuPrincipal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFactuPrincipal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroFactuPrincipal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroFactuPrincipal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroFactuPrincipal.setToolTipText("Nuevo ParametroFactuPrincipal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroFactuPrincipal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroFactuPrincipal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroFactuPrincipal.setToolTipText("Sin Cerrar Ventana ParametroFactuPrincipal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroFactuPrincipal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroFactuPrincipal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroFactuPrincipal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroFactuPrincipal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFactuPrincipal.setText("Accion");
		this.jComboBoxTiposAccionesParametroFactuPrincipal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroFactuPrincipal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroFactuPrincipal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroFactuPrincipal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroFactuPrincipal = new JLabelMe();
		
		this.jLabelAccionesParametroFactuPrincipal.setText("Acciones");		
		this.jLabelAccionesParametroFactuPrincipal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuPrincipal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFactuPrincipal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroFactuPrincipal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroFactuPrincipal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroFactuPrincipal=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroFactuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroFactuPrincipal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroFactuPrincipal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuPrincipal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFactuPrincipal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroFactuPrincipal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFactuPrincipal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFactuPrincipal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroFactuPrincipal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroFactuPrincipal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroFactuPrincipal = new GridBagLayout();
		
		this.jPanelCamposParametroFactuPrincipal.setLayout(gridaBagLayoutCamposParametroFactuPrincipal);
		this.jPanelCamposOcultosParametroFactuPrincipal.setLayout(gridaBagLayoutCamposOcultosParametroFactuPrincipal);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroFactuPrincipal.setLayout(gridaBagLayoutCamposIniciogeneralParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposIniciotipo_documentoParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal.setLayout(gridaBagLayoutCamposIniciotipo_documentoParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposIniciocontableParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposIniciocontableParametroFactuPrincipal.setLayout(gridaBagLayoutCamposIniciocontableParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposInicioorden_despachoParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposInicioorden_despachoParametroFactuPrincipal.setLayout(gridaBagLayoutCamposInicioorden_despachoParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposIniciosecuencialParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposIniciosecuencialParametroFactuPrincipal.setLayout(gridaBagLayoutCamposIniciosecuencialParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.setLayout(gridaBagLayoutCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal.setLayout(gridaBagLayoutCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposInicioconfiguracion_facturaParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal.setLayout(gridaBagLayoutCamposInicioconfiguracion_facturaParametroFactuPrincipal);

		GridBagLayout gridaBagLayoutCamposIniciocuenta_contableParametroFactuPrincipal= new GridBagLayout();
		this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal.setLayout(gridaBagLayoutCamposIniciocuenta_contableParametroFactuPrincipal);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroFactuPrincipal.add(jLabelIdParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroFactuPrincipal.add(jLabelidParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroFactuPrincipal.add(jLabelid_empresaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFactuPrincipal.add(jButtonid_empresaParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroFactuPrincipal.add(jButtonid_empresaParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroFactuPrincipal.add(jComboBoxid_empresaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroFactuPrincipal.add(jLabelid_sucursalParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroFactuPrincipal.add(jButtonid_sucursalParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroFactuPrincipal.add(jButtonid_sucursalParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroFactuPrincipal.add(jComboBoxid_sucursalParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_param_factu_descuentoParametroFactuPrincipal.add(jLabelid_tipo_param_factu_descuentoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_param_factu_descuentoParametroFactuPrincipal.add(jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_param_factu_descuentoParametroFactuPrincipal.add(jButtonid_tipo_param_factu_descuentoParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_param_factu_descuentoParametroFactuPrincipal.add(jComboBoxid_tipo_param_factu_descuentoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_param_factu_listado_clienteParametroFactuPrincipal.add(jLabelid_tipo_param_factu_listado_clienteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_param_factu_listado_clienteParametroFactuPrincipal.add(jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_param_factu_listado_clienteParametroFactuPrincipal.add(jButtonid_tipo_param_factu_listado_clienteParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_param_factu_listado_clienteParametroFactuPrincipal.add(jComboBoxid_tipo_param_factu_listado_clienteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.add(jLabelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.add(jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.add(jButtonid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal.add(jComboBoxid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documento_facturaParametroFactuPrincipal.add(jLabelid_tipo_documento_facturaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_facturaParametroFactuPrincipal.add(jButtonid_tipo_documento_facturaParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_facturaParametroFactuPrincipal.add(jButtonid_tipo_documento_facturaParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documento_facturaParametroFactuPrincipal.add(jComboBoxid_tipo_documento_facturaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documento_nota_creditoParametroFactuPrincipal.add(jLabelid_tipo_documento_nota_creditoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_nota_creditoParametroFactuPrincipal.add(jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_nota_creditoParametroFactuPrincipal.add(jButtonid_tipo_documento_nota_creditoParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documento_nota_creditoParametroFactuPrincipal.add(jComboBoxid_tipo_documento_nota_creditoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documento_nota_debitoParametroFactuPrincipal.add(jLabelid_tipo_documento_nota_debitoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_nota_debitoParametroFactuPrincipal.add(jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_nota_debitoParametroFactuPrincipal.add(jButtonid_tipo_documento_nota_debitoParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documento_nota_debitoParametroFactuPrincipal.add(jComboBoxid_tipo_documento_nota_debitoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelen_lineaParametroFactuPrincipal.add(jLabelen_lineaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelen_lineaParametroFactuPrincipal.add(jButtonen_lineaParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelen_lineaParametroFactuPrincipal.add(jCheckBoxen_lineaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_cuenta_tipo_clienteParametroFactuPrincipal.add(jLabelcon_cuenta_tipo_clienteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cuenta_tipo_clienteParametroFactuPrincipal.add(jButtoncon_cuenta_tipo_clienteParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_cuenta_tipo_clienteParametroFactuPrincipal.add(jCheckBoxcon_cuenta_tipo_clienteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_cliente_impuestoParametroFactuPrincipal.add(jLabelcon_cliente_impuestoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cliente_impuestoParametroFactuPrincipal.add(jButtoncon_cliente_impuestoParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_cliente_impuestoParametroFactuPrincipal.add(jCheckBoxcon_cliente_impuestoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_libro_contableParametroFactuPrincipal.add(jLabelid_libro_contableParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_libro_contableParametroFactuPrincipal.add(jButtonid_libro_contableParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_libro_contableParametroFactuPrincipal.add(jButtonid_libro_contableParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_libro_contableParametroFactuPrincipal.add(jComboBoxid_libro_contableParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaParametroFactuPrincipal.add(jLabelid_monedaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaParametroFactuPrincipal.add(jButtonid_monedaParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaParametroFactuPrincipal.add(jButtonid_monedaParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaParametroFactuPrincipal.add(jComboBoxid_monedaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_impresionParametroFactuPrincipal.add(jLabelcon_impresionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_impresionParametroFactuPrincipal.add(jButtoncon_impresionParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_impresionParametroFactuPrincipal.add(jCheckBoxcon_impresionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoParametroFactuPrincipal.add(jLabelid_formatoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoParametroFactuPrincipal.add(jButtonid_formatoParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoParametroFactuPrincipal.add(jButtonid_formatoParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoParametroFactuPrincipal.add(jComboBoxid_formatoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_secuencial_usuarioParametroFactuPrincipal.add(jLabelcon_secuencial_usuarioParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_secuencial_usuarioParametroFactuPrincipal.add(jButtoncon_secuencial_usuarioParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_secuencial_usuarioParametroFactuPrincipal.add(jCheckBoxcon_secuencial_usuarioParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_secuencial_editableParametroFactuPrincipal.add(jLabelcon_secuencial_editableParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_secuencial_editableParametroFactuPrincipal.add(jButtoncon_secuencial_editableParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_secuencial_editableParametroFactuPrincipal.add(jCheckBoxcon_secuencial_editableParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_precio_por_clienteParametroFactuPrincipal.add(jLabelcon_precio_por_clienteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_precio_por_clienteParametroFactuPrincipal.add(jButtoncon_precio_por_clienteParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_precio_por_clienteParametroFactuPrincipal.add(jCheckBoxcon_precio_por_clienteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_modificar_precioParametroFactuPrincipal.add(jLabelcon_modificar_precioParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_modificar_precioParametroFactuPrincipal.add(jButtoncon_modificar_precioParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_modificar_precioParametroFactuPrincipal.add(jCheckBoxcon_modificar_precioParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_modificar_servicioParametroFactuPrincipal.add(jLabelcon_modificar_servicioParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_modificar_servicioParametroFactuPrincipal.add(jButtoncon_modificar_servicioParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_modificar_servicioParametroFactuPrincipal.add(jCheckBoxcon_modificar_servicioParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_cambiar_unidadParametroFactuPrincipal.add(jLabelcon_cambiar_unidadParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cambiar_unidadParametroFactuPrincipal.add(jButtoncon_cambiar_unidadParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_cambiar_unidadParametroFactuPrincipal.add(jCheckBoxcon_cambiar_unidadParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_decimales_unidadParametroFactuPrincipal.add(jLabelnumero_decimales_unidadParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_decimales_unidadParametroFactuPrincipal.add(jButtonnumero_decimales_unidadParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_decimales_unidadParametroFactuPrincipal.add(jTextFieldnumero_decimales_unidadParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_activar_serieParametroFactuPrincipal.add(jLabelcon_activar_serieParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_activar_serieParametroFactuPrincipal.add(jButtoncon_activar_serieParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_activar_serieParametroFactuPrincipal.add(jCheckBoxcon_activar_serieParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_activar_loteParametroFactuPrincipal.add(jLabelcon_activar_loteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_activar_loteParametroFactuPrincipal.add(jButtoncon_activar_loteParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_activar_loteParametroFactuPrincipal.add(jCheckBoxcon_activar_loteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_activar_multi_empresaParametroFactuPrincipal.add(jLabelcon_activar_multi_empresaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_activar_multi_empresaParametroFactuPrincipal.add(jButtoncon_activar_multi_empresaParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_activar_multi_empresaParametroFactuPrincipal.add(jCheckBoxcon_activar_multi_empresaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_centro_costosParametroFactuPrincipal.add(jLabelcon_centro_costosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_centro_costosParametroFactuPrincipal.add(jButtoncon_centro_costosParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_centro_costosParametroFactuPrincipal.add(jCheckBoxcon_centro_costosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_unidadesParametroFactuPrincipal.add(jLabelcon_unidadesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_unidadesParametroFactuPrincipal.add(jButtoncon_unidadesParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_unidadesParametroFactuPrincipal.add(jCheckBoxcon_unidadesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_cupo_disponibleParametroFactuPrincipal.add(jLabelcon_cupo_disponibleParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cupo_disponibleParametroFactuPrincipal.add(jButtoncon_cupo_disponibleParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_cupo_disponibleParametroFactuPrincipal.add(jCheckBoxcon_cupo_disponibleParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_forma_pagoParametroFactuPrincipal.add(jLabelcon_forma_pagoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_forma_pagoParametroFactuPrincipal.add(jButtoncon_forma_pagoParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_forma_pagoParametroFactuPrincipal.add(jCheckBoxcon_forma_pagoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_envio_mailParametroFactuPrincipal.add(jLabelcon_envio_mailParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_envio_mailParametroFactuPrincipal.add(jButtoncon_envio_mailParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_envio_mailParametroFactuPrincipal.add(jCheckBoxcon_envio_mailParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_autorizar_proformaParametroFactuPrincipal.add(jLabelcon_autorizar_proformaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_autorizar_proformaParametroFactuPrincipal.add(jButtoncon_autorizar_proformaParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_autorizar_proformaParametroFactuPrincipal.add(jCheckBoxcon_autorizar_proformaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_bloqueo_pedidoParametroFactuPrincipal.add(jLabelcon_bloqueo_pedidoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_bloqueo_pedidoParametroFactuPrincipal.add(jButtoncon_bloqueo_pedidoParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_bloqueo_pedidoParametroFactuPrincipal.add(jCheckBoxcon_bloqueo_pedidoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_control_anticipoParametroFactuPrincipal.add(jLabelcon_control_anticipoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_control_anticipoParametroFactuPrincipal.add(jButtoncon_control_anticipoParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_control_anticipoParametroFactuPrincipal.add(jCheckBoxcon_control_anticipoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_factura_autoParametroFactuPrincipal.add(jLabelcon_factura_autoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_factura_autoParametroFactuPrincipal.add(jButtoncon_factura_autoParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_factura_autoParametroFactuPrincipal.add(jCheckBoxcon_factura_autoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_grabar_valor_ceroParametroFactuPrincipal.add(jLabelcon_grabar_valor_ceroParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_grabar_valor_ceroParametroFactuPrincipal.add(jButtoncon_grabar_valor_ceroParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_grabar_valor_ceroParametroFactuPrincipal.add(jCheckBoxcon_grabar_valor_ceroParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_agregar_itemParametroFactuPrincipal.add(jLabelcon_agregar_itemParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_agregar_itemParametroFactuPrincipal.add(jButtoncon_agregar_itemParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_agregar_itemParametroFactuPrincipal.add(jCheckBoxcon_agregar_itemParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_copiasParametroFactuPrincipal.add(jLabelnumero_copiasParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_copiasParametroFactuPrincipal.add(jButtonnumero_copiasParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_copiasParametroFactuPrincipal.add(jTextFieldnumero_copiasParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelleyendaParametroFactuPrincipal.add(jLabelleyendaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelleyendaParametroFactuPrincipal.add(jButtonleyendaParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelleyendaParametroFactuPrincipal.add(jscrollPaneleyendaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_sin_facturaParametroFactuPrincipal.add(jLabelcon_sin_facturaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_sin_facturaParametroFactuPrincipal.add(jButtoncon_sin_facturaParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_sin_facturaParametroFactuPrincipal.add(jCheckBoxcon_sin_facturaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_flete_ventaParametroFactuPrincipal.add(jLabelid_cuenta_contable_flete_ventaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_flete_ventaParametroFactuPrincipal.add(jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_flete_ventaParametroFactuPrincipal.add(jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalArbol, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 4;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_flete_ventaParametroFactuPrincipal.add(jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 5;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_flete_ventaParametroFactuPrincipal.add(jButtonid_cuenta_contable_flete_ventaParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_flete_ventaParametroFactuPrincipal.add(jComboBoxid_cuenta_contable_flete_ventaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_otro_cargoParametroFactuPrincipal.add(jLabelid_cuenta_contable_otro_cargoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_otro_cargoParametroFactuPrincipal.add(jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_otro_cargoParametroFactuPrincipal.add(jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalArbol, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 4;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_otro_cargoParametroFactuPrincipal.add(jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 5;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_otro_cargoParametroFactuPrincipal.add(jButtonid_cuenta_contable_otro_cargoParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_otro_cargoParametroFactuPrincipal.add(jComboBoxid_cuenta_contable_otro_cargoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_finanParametroFactuPrincipal.add(jLabelid_cuenta_contable_finanParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_finanParametroFactuPrincipal.add(jButtonid_cuenta_contable_finanParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_finanParametroFactuPrincipal.add(jButtonid_cuenta_contable_finanParametroFactuPrincipalArbol, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 4;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_finanParametroFactuPrincipal.add(jButtonid_cuenta_contable_finanParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 5;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_finanParametroFactuPrincipal.add(jButtonid_cuenta_contable_finanParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_finanParametroFactuPrincipal.add(jComboBoxid_cuenta_contable_finanParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_boniParametroFactuPrincipal.add(jLabelid_cuenta_contable_boniParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_boniParametroFactuPrincipal.add(jButtonid_cuenta_contable_boniParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_boniParametroFactuPrincipal.add(jButtonid_cuenta_contable_boniParametroFactuPrincipalArbol, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 4;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_boniParametroFactuPrincipal.add(jButtonid_cuenta_contable_boniParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 5;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_boniParametroFactuPrincipal.add(jButtonid_cuenta_contable_boniParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_boniParametroFactuPrincipal.add(jComboBoxid_cuenta_contable_boniParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_boni_devolParametroFactuPrincipal.add(jLabelid_cuenta_contable_boni_devolParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_boni_devolParametroFactuPrincipal.add(jButtonid_cuenta_contable_boni_devolParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_boni_devolParametroFactuPrincipal.add(jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalArbol, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 4;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_boni_devolParametroFactuPrincipal.add(jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 5;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_boni_devolParametroFactuPrincipal.add(jButtonid_cuenta_contable_boni_devolParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_boni_devolParametroFactuPrincipal.add(jComboBoxid_cuenta_contable_boni_devolParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_iceParametroFactuPrincipal.add(jLabelid_cuenta_contable_iceParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 2;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_iceParametroFactuPrincipal.add(jButtonid_cuenta_contable_iceParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 3;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_iceParametroFactuPrincipal.add(jButtonid_cuenta_contable_iceParametroFactuPrincipalArbol, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 4;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iceParametroFactuPrincipal.add(jButtonid_cuenta_contable_iceParametroFactuPrincipalBusqueda, this.gridBagConstraintsParametroFactuPrincipal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		//this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 5;
		this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
		this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_iceParametroFactuPrincipal.add(jButtonid_cuenta_contable_iceParametroFactuPrincipalUpdate, this.gridBagConstraintsParametroFactuPrincipal);
	}

	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = 1;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_iceParametroFactuPrincipal.add(jComboBoxid_cuenta_contable_iceParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposOcultosParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposOcultosParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroFactuPrincipal.add(this.jPanelid_empresaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposOcultosParametroFactuPrincipal % 1==0) {
		iXPanelCamposOcultosParametroFactuPrincipal=0;
		iYPanelCamposOcultosParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposOcultosParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposOcultosParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroFactuPrincipal.add(this.jPanelid_sucursalParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposOcultosParametroFactuPrincipal % 1==0) {
		iXPanelCamposOcultosParametroFactuPrincipal=0;
		iYPanelCamposOcultosParametroFactuPrincipal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciogeneralParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciogeneralParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuPrincipal.add(this.jPanelidParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciogeneralParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuPrincipal=0;
		iYPanelCamposIniciogeneralParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciogeneralParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciogeneralParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuPrincipal.add(this.jPanelid_tipo_param_factu_descuentoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciogeneralParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuPrincipal=0;
		iYPanelCamposIniciogeneralParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciogeneralParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciogeneralParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuPrincipal.add(this.jPanelid_tipo_param_factu_listado_clienteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciogeneralParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuPrincipal=0;
		iYPanelCamposIniciogeneralParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciogeneralParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciogeneralParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroFactuPrincipal.add(this.jPanelid_tipo_param_factu_secuencia_trabajoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciogeneralParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciogeneralParametroFactuPrincipal=0;
		iYPanelCamposIniciogeneralParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciotipo_documentoParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciotipo_documentoParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal.add(this.jPanelid_tipo_documento_facturaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciotipo_documentoParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciotipo_documentoParametroFactuPrincipal=0;
		iYPanelCamposIniciotipo_documentoParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciotipo_documentoParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciotipo_documentoParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal.add(this.jPanelid_tipo_documento_nota_creditoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciotipo_documentoParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciotipo_documentoParametroFactuPrincipal=0;
		iYPanelCamposIniciotipo_documentoParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciotipo_documentoParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciotipo_documentoParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal.add(this.jPanelid_tipo_documento_nota_debitoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciotipo_documentoParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciotipo_documentoParametroFactuPrincipal=0;
		iYPanelCamposIniciotipo_documentoParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocontableParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocontableParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableParametroFactuPrincipal.add(this.jPanelen_lineaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocontableParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocontableParametroFactuPrincipal=0;
		iYPanelCamposIniciocontableParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocontableParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocontableParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableParametroFactuPrincipal.add(this.jPanelcon_cuenta_tipo_clienteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocontableParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocontableParametroFactuPrincipal=0;
		iYPanelCamposIniciocontableParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocontableParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocontableParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableParametroFactuPrincipal.add(this.jPanelcon_cliente_impuestoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocontableParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocontableParametroFactuPrincipal=0;
		iYPanelCamposIniciocontableParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocontableParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocontableParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableParametroFactuPrincipal.add(this.jPanelid_libro_contableParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocontableParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocontableParametroFactuPrincipal=0;
		iYPanelCamposIniciocontableParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocontableParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocontableParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableParametroFactuPrincipal.add(this.jPanelid_monedaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocontableParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocontableParametroFactuPrincipal=0;
		iYPanelCamposIniciocontableParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioorden_despachoParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioorden_despachoParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioorden_despachoParametroFactuPrincipal.add(this.jPanelcon_impresionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioorden_despachoParametroFactuPrincipal % 1==0) {
		iXPanelCamposInicioorden_despachoParametroFactuPrincipal=0;
		iYPanelCamposInicioorden_despachoParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioorden_despachoParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioorden_despachoParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioorden_despachoParametroFactuPrincipal.add(this.jPanelid_formatoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioorden_despachoParametroFactuPrincipal % 1==0) {
		iXPanelCamposInicioorden_despachoParametroFactuPrincipal=0;
		iYPanelCamposInicioorden_despachoParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciosecuencialParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciosecuencialParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciosecuencialParametroFactuPrincipal.add(this.jPanelcon_secuencial_usuarioParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciosecuencialParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciosecuencialParametroFactuPrincipal=0;
		iYPanelCamposIniciosecuencialParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciosecuencialParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciosecuencialParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciosecuencialParametroFactuPrincipal.add(this.jPanelcon_secuencial_editableParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciosecuencialParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciosecuencialParametroFactuPrincipal=0;
		iYPanelCamposIniciosecuencialParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.add(this.jPanelcon_precio_por_clienteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal % 2==0) {
		iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.add(this.jPanelcon_modificar_precioParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal % 2==0) {
		iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.add(this.jPanelcon_modificar_servicioParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal % 2==0) {
		iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.add(this.jPanelcon_cambiar_unidadParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal % 2==0) {
		iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.add(this.jPanelnumero_decimales_unidadParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal % 2==0) {
		iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.add(this.jPanelcon_activar_serieParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal % 2==0) {
		iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.add(this.jPanelcon_activar_loteParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal % 2==0) {
		iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.add(this.jPanelcon_activar_multi_empresaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal % 2==0) {
		iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.add(this.jPanelcon_centro_costosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal % 2==0) {
		iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal.add(this.jPanelcon_unidadesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal % 2==0) {
		iXPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal.add(this.jPanelcon_cupo_disponibleParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal=0;
		iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal.add(this.jPanelcon_forma_pagoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal=0;
		iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal.add(this.jPanelcon_envio_mailParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal=0;
		iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal.add(this.jPanelcon_autorizar_proformaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal=0;
		iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal.add(this.jPanelcon_bloqueo_pedidoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal=0;
		iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal.add(this.jPanelcon_control_anticipoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal=0;
		iYPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal.add(this.jPanelcon_factura_autoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal % 1==0) {
		iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal.add(this.jPanelcon_grabar_valor_ceroParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal % 1==0) {
		iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal.add(this.jPanelcon_agregar_itemParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal % 1==0) {
		iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal.add(this.jPanelnumero_copiasParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal % 1==0) {
		iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal.add(this.jPanelleyendaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal % 1==0) {
		iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal.add(this.jPanelcon_sin_facturaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal % 1==0) {
		iXPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal=0;
		iYPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocuenta_contableParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocuenta_contableParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal.add(this.jPanelid_cuenta_contable_flete_ventaParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocuenta_contableParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocuenta_contableParametroFactuPrincipal=0;
		iYPanelCamposIniciocuenta_contableParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocuenta_contableParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocuenta_contableParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal.add(this.jPanelid_cuenta_contable_otro_cargoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocuenta_contableParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocuenta_contableParametroFactuPrincipal=0;
		iYPanelCamposIniciocuenta_contableParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocuenta_contableParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocuenta_contableParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal.add(this.jPanelid_cuenta_contable_finanParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocuenta_contableParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocuenta_contableParametroFactuPrincipal=0;
		iYPanelCamposIniciocuenta_contableParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocuenta_contableParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocuenta_contableParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal.add(this.jPanelid_cuenta_contable_boniParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocuenta_contableParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocuenta_contableParametroFactuPrincipal=0;
		iYPanelCamposIniciocuenta_contableParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocuenta_contableParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocuenta_contableParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal.add(this.jPanelid_cuenta_contable_boni_devolParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocuenta_contableParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocuenta_contableParametroFactuPrincipal=0;
		iYPanelCamposIniciocuenta_contableParametroFactuPrincipal++;
	}
	this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFactuPrincipal.gridy = iYPanelCamposIniciocuenta_contableParametroFactuPrincipal;
	this.gridBagConstraintsParametroFactuPrincipal.gridx = iXPanelCamposIniciocuenta_contableParametroFactuPrincipal++;
	this.gridBagConstraintsParametroFactuPrincipal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFactuPrincipal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal.add(this.jPanelid_cuenta_contable_iceParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);



	if(iXPanelCamposIniciocuenta_contableParametroFactuPrincipal % 1==0) {
		iXPanelCamposIniciocuenta_contableParametroFactuPrincipal=0;
		iYPanelCamposIniciocuenta_contableParametroFactuPrincipal++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroFactuPrincipal= new GridBagLayout();
		this.jPanelAccionesParametroFactuPrincipal.setLayout(gridaBagLayoutAccionesParametroFactuPrincipal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroFactuPrincipal= new GridBagLayout();
		this.jPanelAccionesFormularioParametroFactuPrincipal.setLayout(gridaBagLayoutAccionesFormularioParametroFactuPrincipal);
		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFactuPrincipal.add(this.jComboBoxTiposAccionesFormularioParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFactuPrincipal.add(this.jCheckBoxPostAccionNuevoParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrofactuprincipalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFactuPrincipal.add(this.jCheckBoxPostAccionSinCerrarParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrofactuprincipalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFactuPrincipal.add(this.jCheckBoxPostAccionSinMensajeParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroFactuPrincipal.add(this.jButtonModificarParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);							

		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;
		this.gridBagConstraintsParametroFactuPrincipal.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroFactuPrincipal.add(this.jButtonEliminarParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		
			
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFactuPrincipal.add(this.jButtonActualizarParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);


		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFactuPrincipal.add(this.jButtonGuardarCambiosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);	
		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = 0;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroFactuPrincipal.add(this.jButtonCancelarParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFactuPrincipal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFactuPrincipal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofactuprincipalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();						
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;		
			//this.gridBagConstraintsParametroFactuPrincipal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFactuPrincipal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFactuPrincipal.gridx =0;
		this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFactuPrincipal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroFactuPrincipalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroFactuPrincipal = new ParametroFactuPrincipalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Principal  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Principal  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Principal  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroFactuPrincipalModel parametrofactuprincipalModel=new ParametroFactuPrincipalModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroFactuPrincipalModel.ParametroFactuPrincipalFocusTraversalPolicy parametrofactuprincipalFocusTraversalPolicy = parametrofactuprincipalModel.new ParametroFactuPrincipalFocusTraversalPolicy(this);
			
			//parametrofactuprincipalFocusTraversalPolicy.setparametrofactuprincipalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrofactuprincipalModel);
			
			
			this.jContentPaneDetalleParametroFactuPrincipal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroFactuPrincipal = new GridBagLayout();	
			this.jContentPaneDetalleParametroFactuPrincipal.setLayout(gridaBagLayoutDetalleParametroFactuPrincipal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFactuPrincipal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
				this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
					
				
				this.jContentPaneDetalleParametroFactuPrincipal.add(jTtoolBarDetalleParametroFactuPrincipal, gridBagConstraintsParametroFactuPrincipal);								
				
}
			
			this.jScrollPanelDatosEdicionParametroFactuPrincipal=   new JScrollPane(jContentPaneDetalleParametroFactuPrincipal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroFactuPrincipal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposParametroFactuPrincipal.add("General",this.jPanelCamposIniciogeneralParametroFactuPrincipal);
		this.jTabbedPaneCamposParametroFactuPrincipal.add("Tipo Documento",this.jPanelCamposIniciotipo_documentoParametroFactuPrincipal);
		this.jTabbedPaneCamposParametroFactuPrincipal.add("Contable",this.jPanelCamposIniciocontableParametroFactuPrincipal);
		this.jTabbedPaneCamposParametroFactuPrincipal.add("Orden Despacho",this.jPanelCamposInicioorden_despachoParametroFactuPrincipal);
		this.jTabbedPaneCamposParametroFactuPrincipal.add("Secuencial",this.jPanelCamposIniciosecuencialParametroFactuPrincipal);
		this.jTabbedPaneCamposParametroFactuPrincipal.add("Configuracion Producto Detalle",this.jPanelCamposInicioconfiguracion_producto_detalleParametroFactuPrincipal);
		this.jTabbedPaneCamposParametroFactuPrincipal.add("Control Cartera Pedido",this.jPanelCamposIniciocontrol_cartera_pedidoParametroFactuPrincipal);
		this.jTabbedPaneCamposParametroFactuPrincipal.add("Configuracion Factura",this.jPanelCamposInicioconfiguracion_facturaParametroFactuPrincipal);
		this.jTabbedPaneCamposParametroFactuPrincipal.add("Cuenta Contable",this.jPanelCamposIniciocuenta_contableParametroFactuPrincipal);
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
						
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	        
			this.jContentPaneDetalleParametroFactuPrincipal.add(jTabbedPaneCamposParametroFactuPrincipal, gridBagConstraintsParametroFactuPrincipal);
			
			
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
						&& parametrofactuprincipalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrofactuprincipalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroFactuPrincipal= new GridBagConstraints();
						this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
						this.jContentPaneDetalleParametroFactuPrincipal.add(this.jTabbedPaneRelacionesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroFactuPrincipal.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroFactuPrincipal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
					this.gridBagConstraintsParametroFactuPrincipal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
					
				
					this.jContentPaneDetalleParametroFactuPrincipal.add(jPanelCamposOcultosParametroFactuPrincipal, gridBagConstraintsParametroFactuPrincipal);
				
					this.jPanelCamposOcultosParametroFactuPrincipal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	        this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroFactuPrincipal.add(this.jPanelAccionesFormularioParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);							
			
			
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
	        this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroFactuPrincipal.add(this.jPanelAccionesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroFactuPrincipal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroFactuPrincipal=   new JScrollPane(this.jPanelCamposParametroFactuPrincipal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFactuPrincipal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuPrincipal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFactuPrincipal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
			this.gridBagConstraintsParametroFactuPrincipal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroFactuPrincipal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroFactuPrincipal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);			
			
			this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
			this.gridBagConstraintsParametroFactuPrincipal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
			
			
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		
			
		this.gridBagConstraintsParametroFactuPrincipal = new GridBagConstraints();
		this.gridBagConstraintsParametroFactuPrincipal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFactuPrincipal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFactuPrincipal, this.gridBagConstraintsParametroFactuPrincipal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroFactuPrincipal;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroFactuPrincipal;
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
