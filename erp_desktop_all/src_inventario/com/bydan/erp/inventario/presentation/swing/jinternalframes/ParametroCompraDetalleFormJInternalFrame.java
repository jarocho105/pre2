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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.inventario.util.ParametroCompraConstantesFunciones;

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
public class ParametroCompraDetalleFormJInternalFrame extends ParametroCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroCompra;
	
	protected JMenuBar jmenuBarDetalleParametroCompra;
	
	protected JMenu jmenuDetalleParametroCompra;
	protected JMenu jmenuDetalleArchivoParametroCompra;
	protected JMenu jmenuDetalleAccionesParametroCompra;
	protected JMenu jmenuDetalleDatosParametroCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroCompra;	
	protected GridBagConstraints gridBagConstraintsParametroCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected BodegaBeanSwingJInternalFrame bodegareservaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegareserva="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmbarcadorBeanSwingJInternalFrame embarcadorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_embarcador="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";

	protected FormatoBeanSwingJInternalFrame formatopedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatopedido="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidopendienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidopendiente="";

	protected FormatoBeanSwingJInternalFrame formatocotizacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatocotizacion="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidocotizadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidocotizado="";

	protected FormatoBeanSwingJInternalFrame formatoautorizacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoautorizacion="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoautorizadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidoautorizado="";

	protected FormatoBeanSwingJInternalFrame formatoitemBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formatoitem="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoanuladoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidoanulado="";

	protected PrioridadPedidoBeanSwingJInternalFrame prioridadpedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_prioridadpedido="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidosuspendidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidosuspendido="";

	protected EstadoPedidoBeanSwingJInternalFrame estadopedidoregularizadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadopedidoregularizado="";
	
	public ParametroCompraSessionBean parametrocompraSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public BodegaSessionBean bodegareservaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmbarcadorSessionBean embarcadorSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
	public FormatoSessionBean formatopedidoSessionBean;
	public EstadoPedidoSessionBean estadopedidopendienteSessionBean;
	public FormatoSessionBean formatocotizacionSessionBean;
	public EstadoPedidoSessionBean estadopedidocotizadoSessionBean;
	public FormatoSessionBean formatoautorizacionSessionBean;
	public EstadoPedidoSessionBean estadopedidoautorizadoSessionBean;
	public FormatoSessionBean formatoitemSessionBean;
	public EstadoPedidoSessionBean estadopedidoanuladoSessionBean;
	public PrioridadPedidoSessionBean prioridadpedidoSessionBean;
	public EstadoPedidoSessionBean estadopedidosuspendidoSessionBean;
	public EstadoPedidoSessionBean estadopedidoregularizadoSessionBean;	
	
	public ParametroCompraLogic parametrocompraLogic;
	
	public JScrollPane jScrollPanelDatosParametroCompra;
	public JScrollPane jScrollPanelDatosEdicionParametroCompra;
	public JScrollPane jScrollPanelDatosGeneralParametroCompra;
	
	protected JPanel jPanelCamposParametroCompra;    
	protected JPanel jPanelCamposOcultosParametroCompra;    	
	protected JPanel jPanelAccionesParametroCompra;
	protected JPanel jPanelAccionesFormularioParametroCompra;
    
	
	
	protected JTabbedPane jTabbedPaneCamposParametroCompra;	
	protected Integer iXPanelCamposParametroCompra=0;
	protected Integer iYPanelCamposParametroCompra=0;
	
	protected Integer iXPanelCamposOcultosParametroCompra=0;
	protected Integer iYPanelCamposOcultosParametroCompra=0;
	
	

	protected JPanel jPanelCamposIniciogeneralParametroCompra;
	protected Integer iXPanelCamposIniciogeneralParametroCompra=0;
	protected Integer iYPanelCamposIniciogeneralParametroCompra=0;

	protected JPanel jPanelCamposInicioformato_estadoParametroCompra;
	protected Integer iXPanelCamposInicioformato_estadoParametroCompra=0;
	protected Integer iYPanelCamposInicioformato_estadoParametroCompra=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroCompra;
	public JButton jButtonModificarParametroCompra;
	public JButton jButtonActualizarParametroCompra;
    public JButton jButtonEliminarParametroCompra;
	public JButton jButtonCancelarParametroCompra;
    public JButton jButtonGuardarCambiosParametroCompra;
	public JButton jButtonGuardarCambiosTablaParametroCompra;
	protected JButton jButtonCerrarParametroCompra;
	
	
	protected JButton jButtonProcesarInformacionParametroCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroCompra;
	protected JButton jButtonModificarToolBarParametroCompra;
	protected JButton jButtonActualizarToolBarParametroCompra;
    protected JButton jButtonEliminarToolBarParametroCompra;
	protected JButton jButtonCancelarToolBarParametroCompra;
    protected JButton jButtonGuardarCambiosToolBarParametroCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroCompra;
	protected JButton jButtonCerrarToolBarParametroCompra;
	
	protected JButton jButtonProcesarInformacionToolBarParametroCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroCompra;
	protected JMenuItem jMenuItemModificarParametroCompra;
	protected JMenuItem jMenuItemActualizarParametroCompra;
    protected JMenuItem jMenuItemEliminarParametroCompra;
	protected JMenuItem jMenuItemCancelarParametroCompra;
    protected JMenuItem jMenuItemGuardarCambiosParametroCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroCompra;
	protected JMenuItem jMenuItemCerrarParametroCompra;
	protected JMenuItem jMenuItemDetalleCerrarParametroCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroCompra;
	protected JMenuItem jMenuItemMostrarOcultarParametroCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroCompra;
	public JLabel jLabelIdParametroCompra;
	public JLabel jLabelidParametroCompra;
	public JButton jButtonidParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_pedidoParametroCompra;
	public JLabel jLabelsecuencial_pedidoParametroCompra;
	public JTextField jTextFieldsecuencial_pedidoParametroCompra;
	public JButton jButtonsecuencial_pedidoParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_cotizacionParametroCompra;
	public JLabel jLabelsecuencial_cotizacionParametroCompra;
	public JTextField jTextFieldsecuencial_cotizacionParametroCompra;
	public JButton jButtonsecuencial_cotizacionParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_produccionParametroCompra;
	public JLabel jLabelsecuencial_produccionParametroCompra;
	public JTextField jTextFieldsecuencial_produccionParametroCompra;
	public JButton jButtonsecuencial_produccionParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelcon_centro_costoParametroCompra;
	public JLabel jLabelcon_centro_costoParametroCompra;
	public JCheckBox jCheckBoxcon_centro_costoParametroCompra;
	public JButton jButtoncon_centro_costoParametroCompraBusqueda= new JButtonMe();

	public JPanel jPaneltexto_mailParametroCompra;
	public JLabel jLabeltexto_mailParametroCompra;
	public JTextArea jTextAreatexto_mailParametroCompra;
	public JScrollPane jscrollPanetexto_mailParametroCompra;
	public JButton jButtontexto_mailParametroCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionParametroCompra;
	public JLabel jLabeldescripcionParametroCompra;
	public JTextArea jTextAreadescripcionParametroCompra;
	public JScrollPane jscrollPanedescripcionParametroCompra;
	public JButton jButtondescripcionParametroCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroCompra;
	public JLabel jLabelid_empresaParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroCompra;
	public JButton jButtonid_empresaParametroCompra= new JButtonMe();
	public JButton jButtonid_empresaParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documentoParametroCompra;
	public JLabel jLabelid_tipo_documentoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoParametroCompra;
	public JButton jButtonid_tipo_documentoParametroCompra= new JButtonMe();
	public JButton jButtonid_tipo_documentoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoParametroCompra;
	public JLabel jLabelid_tipo_movimientoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoParametroCompra;
	public JButton jButtonid_tipo_movimientoParametroCompra= new JButtonMe();
	public JButton jButtonid_tipo_movimientoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaParametroCompra;
	public JLabel jLabelid_bodegaParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaParametroCompra;
	public JButton jButtonid_bodegaParametroCompra= new JButtonMe();
	public JButton jButtonid_bodegaParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_bodegaParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_reservaParametroCompra;
	public JLabel jLabelid_bodega_reservaParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_reservaParametroCompra;
	public JButton jButtonid_bodega_reservaParametroCompra= new JButtonMe();
	public JButton jButtonid_bodega_reservaParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_bodega_reservaParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoParametroCompra;
	public JLabel jLabelid_empleadoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoParametroCompra;
	public JButton jButtonid_empleadoParametroCompra= new JButtonMe();
	public JButton jButtonid_empleadoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_embarcadorParametroCompra;
	public JLabel jLabelid_embarcadorParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_embarcadorParametroCompra;
	public JButton jButtonid_embarcadorParametroCompra= new JButtonMe();
	public JButton jButtonid_embarcadorParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_embarcadorParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloParametroCompra;
	public JLabel jLabelid_moduloParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloParametroCompra;
	public JButton jButtonid_moduloParametroCompra= new JButtonMe();
	public JButton jButtonid_moduloParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_moduloParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimiento_moduloParametroCompra;
	public JLabel jLabelid_tipo_movimiento_moduloParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloParametroCompra;
	public JButton jButtonid_tipo_movimiento_moduloParametroCompra= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_pedidoParametroCompra;
	public JLabel jLabelid_formato_pedidoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_pedidoParametroCompra;
	public JButton jButtonid_formato_pedidoParametroCompra= new JButtonMe();
	public JButton jButtonid_formato_pedidoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_formato_pedidoParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pedido_pendienteParametroCompra;
	public JLabel jLabelid_estado_pedido_pendienteParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_pendienteParametroCompra;
	public JButton jButtonid_estado_pedido_pendienteParametroCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_pendienteParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_pendienteParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_cotizacionParametroCompra;
	public JLabel jLabelid_formato_cotizacionParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_cotizacionParametroCompra;
	public JButton jButtonid_formato_cotizacionParametroCompra= new JButtonMe();
	public JButton jButtonid_formato_cotizacionParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_formato_cotizacionParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pedido_cotizadoParametroCompra;
	public JLabel jLabelid_estado_pedido_cotizadoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_cotizadoParametroCompra;
	public JButton jButtonid_estado_pedido_cotizadoParametroCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_cotizadoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_cotizadoParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_autorizacionParametroCompra;
	public JLabel jLabelid_formato_autorizacionParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_autorizacionParametroCompra;
	public JButton jButtonid_formato_autorizacionParametroCompra= new JButtonMe();
	public JButton jButtonid_formato_autorizacionParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_formato_autorizacionParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pedido_autorizadoParametroCompra;
	public JLabel jLabelid_estado_pedido_autorizadoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_autorizadoParametroCompra;
	public JButton jButtonid_estado_pedido_autorizadoParametroCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_autorizadoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_autorizadoParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_formato_itemParametroCompra;
	public JLabel jLabelid_formato_itemParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formato_itemParametroCompra;
	public JButton jButtonid_formato_itemParametroCompra= new JButtonMe();
	public JButton jButtonid_formato_itemParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_formato_itemParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pedido_anuladoParametroCompra;
	public JLabel jLabelid_estado_pedido_anuladoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_anuladoParametroCompra;
	public JButton jButtonid_estado_pedido_anuladoParametroCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_anuladoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_anuladoParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_prioridad_pedidoParametroCompra;
	public JLabel jLabelid_prioridad_pedidoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_prioridad_pedidoParametroCompra;
	public JButton jButtonid_prioridad_pedidoParametroCompra= new JButtonMe();
	public JButton jButtonid_prioridad_pedidoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_prioridad_pedidoParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pedido_suspendidoParametroCompra;
	public JLabel jLabelid_estado_pedido_suspendidoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_suspendidoParametroCompra;
	public JButton jButtonid_estado_pedido_suspendidoParametroCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_suspendidoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_suspendidoParametroCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_pedido_regularizadoParametroCompra;
	public JLabel jLabelid_estado_pedido_regularizadoParametroCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_pedido_regularizadoParametroCompra;
	public JButton jButtonid_estado_pedido_regularizadoParametroCompra= new JButtonMe();
	public JButton jButtonid_estado_pedido_regularizadoParametroCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_pedido_regularizadoParametroCompraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroCompra;
	
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroCompra=new JPanel();
				this.jPanelAccionesFormularioParametroCompra=new JPanel();
				this.jmenuBarDetalleParametroCompra=new JMenuBar();
				this.jTtoolBarDetalleParametroCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroCompra() {
		return this.jButtonActualizarToolBarParametroCompra;
	}
	
	public JButton getjButtonEliminarToolBarParametroCompra() {
		return this.jButtonEliminarToolBarParametroCompra;
	}
	
	public JButton getjButtonCancelarToolBarParametroCompra() {
		return this.jButtonCancelarToolBarParametroCompra;
	}		
	
	public JButton getjButtonProcesarInformacionParametroCompra() {
		return this.jButtonProcesarInformacionParametroCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroCompra)	{
		this.jButtonProcesarInformacionParametroCompra = jButtonProcesarInformacionParametroCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroCompra() {
		return this.jComboBoxTiposAccionesParametroCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroCompra(
			JComboBox jComboBoxTiposRelacionesParametroCompra) {
		this.jComboBoxTiposRelacionesParametroCompra = jComboBoxTiposRelacionesParametroCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroCompra(
			JComboBox jComboBoxTiposAccionesParametroCompra) {
		this.jComboBoxTiposAccionesParametroCompra = jComboBoxTiposAccionesParametroCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroCompra() {
		return this.jComboBoxTiposAccionesFormularioParametroCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroCompra(
			JComboBox jComboBoxTiposAccionesFormularioParametroCompra) {
		this.jComboBoxTiposAccionesFormularioParametroCompra = jComboBoxTiposAccionesFormularioParametroCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrocompraSessionBean=new ParametroCompraSessionBean();
		
		this.parametrocompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrocompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Compra MANTENIMIENTO"));
		
		
		if(iWidth > 2550) {
			iWidth=2550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrocompraSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroCompra=new JButtonMe();
				this.jButtonModificarToolBarParametroCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroCompra,this.jTtoolBarDetalleParametroCompra,
							"actualizar","actualizar","Actualizar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroCompra,this.jTtoolBarDetalleParametroCompra,
							"eliminar","eliminar","Eliminar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroCompra,this.jTtoolBarDetalleParametroCompra,
							"cancelar","cancelar","Cancelar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroCompra,this.jTtoolBarDetalleParametroCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroCompra.add(this.jMenuItemDetalleCerrarParametroCompra);
		
		this.jmenuDetalleAccionesParametroCompra.add(this.jMenuItemActualizarParametroCompra);
		this.jmenuDetalleAccionesParametroCompra.add(this.jMenuItemEliminarParametroCompra);
		this.jmenuDetalleAccionesParametroCompra.add(this.jMenuItemCancelarParametroCompra);		
		
		//this.jmenuDetalleDatosParametroCompra.add(this.jMenuItemDetalleAbrirOrderByParametroCompra);				
		this.jmenuDetalleDatosParametroCompra.add(this.jMenuItemDetalleMostarOcultarParametroCompra);				
				
		//this.jmenuDetalleAccionesParametroCompra.add(this.jMenuItemGuardarCambiosParametroCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroCompra.add(this.jmenuDetalleArchivoParametroCompra);		
		this.jmenuBarDetalleParametroCompra.add(this.jmenuDetalleAccionesParametroCompra);		
		this.jmenuBarDetalleParametroCompra.add(this.jmenuDetalleDatosParametroCompra);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroCompra);				
	}
	
	
	public void inicializarElementosCamposParametroCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroCompra = new JLabelMe();
		jLabelIdParametroCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroCompra= new GridBagLayout();

		this.jPanelidParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);

		jLabelidParametroCompra = new JLabel();
		jLabelidParametroCompra.setText("Id");

		jLabelidParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencial_pedidoParametroCompra = new JLabelMe();
		this.jLabelsecuencial_pedidoParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_SECUENCIALPEDIDO+" : *");
		this.jLabelsecuencial_pedidoParametroCompra.setToolTipText("Secuencial Pedido");
		this.jLabelsecuencial_pedidoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_pedidoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_pedidoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_pedidoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_pedidoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_pedidoParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_SECUENCIALPEDIDO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelsecuencial_pedidoParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jTextFieldsecuencial_pedidoParametroCompra= new JTextFieldMe();

		jTextFieldsecuencial_pedidoParametroCompra.setEnabled(false);
		jTextFieldsecuencial_pedidoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_pedidoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_pedidoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_pedidoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencial_pedidoParametroCompraBusqueda= new JButtonMe();
		this.jButtonsecuencial_pedidoParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_pedidoParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_pedidoParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_pedidoParametroCompraBusqueda.setText("U");
		this.jButtonsecuencial_pedidoParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_pedidoParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_pedidoParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_pedidoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_pedidoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_pedidoParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_pedidoParametroCompraBusqueda.setVisible(false);		}


					
		this.jLabelsecuencial_cotizacionParametroCompra = new JLabelMe();
		this.jLabelsecuencial_cotizacionParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_SECUENCIALCOTIZACION+" : *");
		this.jLabelsecuencial_cotizacionParametroCompra.setToolTipText("Secuencial Cotizacion");
		this.jLabelsecuencial_cotizacionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencial_cotizacionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencial_cotizacionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_cotizacionParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_cotizacionParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_cotizacionParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_SECUENCIALCOTIZACION);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelsecuencial_cotizacionParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jTextFieldsecuencial_cotizacionParametroCompra= new JTextFieldMe();

		jTextFieldsecuencial_cotizacionParametroCompra.setEnabled(false);
		jTextFieldsecuencial_cotizacionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_cotizacionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_cotizacionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_cotizacionParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencial_cotizacionParametroCompraBusqueda= new JButtonMe();
		this.jButtonsecuencial_cotizacionParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_cotizacionParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_cotizacionParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_cotizacionParametroCompraBusqueda.setText("U");
		this.jButtonsecuencial_cotizacionParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_cotizacionParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_cotizacionParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_cotizacionParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_cotizacionParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_cotizacionParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_cotizacionParametroCompraBusqueda.setVisible(false);		}


					
		this.jLabelsecuencial_produccionParametroCompra = new JLabelMe();
		this.jLabelsecuencial_produccionParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_SECUENCIALPRODUCCION+" : *");
		this.jLabelsecuencial_produccionParametroCompra.setToolTipText("Secuencial Produccion");
		this.jLabelsecuencial_produccionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencial_produccionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencial_produccionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_produccionParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_produccionParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_produccionParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_SECUENCIALPRODUCCION);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelsecuencial_produccionParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jTextFieldsecuencial_produccionParametroCompra= new JTextFieldMe();

		jTextFieldsecuencial_produccionParametroCompra.setEnabled(false);
		jTextFieldsecuencial_produccionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_produccionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_produccionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_produccionParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencial_produccionParametroCompraBusqueda= new JButtonMe();
		this.jButtonsecuencial_produccionParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_produccionParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_produccionParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_produccionParametroCompraBusqueda.setText("U");
		this.jButtonsecuencial_produccionParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_produccionParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_produccionParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_produccionParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_produccionParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_produccionParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_produccionParametroCompraBusqueda.setVisible(false);		}


					
		this.jLabelcon_centro_costoParametroCompra = new JLabelMe();
		this.jLabelcon_centro_costoParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_CONCENTROCOSTO+" : *");
		this.jLabelcon_centro_costoParametroCompra.setToolTipText("Con Centro Costo");
		this.jLabelcon_centro_costoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_centro_costoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_centro_costoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_centro_costoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_centro_costoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_centro_costoParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_CONCENTROCOSTO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelcon_centro_costoParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jCheckBoxcon_centro_costoParametroCompra= new JCheckBoxMe();
		jCheckBoxcon_centro_costoParametroCompra.setEnabled(false);

		jCheckBoxcon_centro_costoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_centro_costoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_centro_costoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_centro_costoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_centro_costoParametroCompraBusqueda= new JButtonMe();
		this.jButtoncon_centro_costoParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_centro_costoParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_centro_costoParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_centro_costoParametroCompraBusqueda.setText("U");
		this.jButtoncon_centro_costoParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_centro_costoParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_centro_costoParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_centro_costoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_centro_costoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_centro_costoParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_centro_costoParametroCompraBusqueda.setVisible(false);		}


					
		this.jLabeltexto_mailParametroCompra = new JLabelMe();
		this.jLabeltexto_mailParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_TEXTOMAIL+" : *");
		this.jLabeltexto_mailParametroCompra.setToolTipText("Texto Mail");
		this.jLabeltexto_mailParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltexto_mailParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltexto_mailParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltexto_mailParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltexto_mailParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltexto_mailParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_TEXTOMAIL);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPaneltexto_mailParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jTextAreatexto_mailParametroCompra= new JTextAreaMe();
		jTextAreatexto_mailParametroCompra.setEnabled(false);
		jTextAreatexto_mailParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatexto_mailParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatexto_mailParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatexto_mailParametroCompra.setLineWrap(true);
		jTextAreatexto_mailParametroCompra.setWrapStyleWord(true);
		jTextAreatexto_mailParametroCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatexto_mailParametroCompra.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatexto_mailParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetexto_mailParametroCompra = new JScrollPane(jTextAreatexto_mailParametroCompra);
		jscrollPanetexto_mailParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetexto_mailParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetexto_mailParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontexto_mailParametroCompraBusqueda= new JButtonMe();
		this.jButtontexto_mailParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontexto_mailParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontexto_mailParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontexto_mailParametroCompraBusqueda.setText("U");
		this.jButtontexto_mailParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontexto_mailParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontexto_mailParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatexto_mailParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatexto_mailParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"texto_mailParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontexto_mailParametroCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionParametroCompra = new JLabelMe();
		this.jLabeldescripcionParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionParametroCompra.setToolTipText("Descripcion");
		this.jLabeldescripcionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPaneldescripcionParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jTextAreadescripcionParametroCompra= new JTextAreaMe();
		jTextAreadescripcionParametroCompra.setEnabled(false);
		jTextAreadescripcionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionParametroCompra.setLineWrap(true);
		jTextAreadescripcionParametroCompra.setWrapStyleWord(true);
		jTextAreadescripcionParametroCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionParametroCompra.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionParametroCompra = new JScrollPane(jTextAreadescripcionParametroCompra);
		jscrollPanedescripcionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionParametroCompraBusqueda= new JButtonMe();
		this.jButtondescripcionParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionParametroCompraBusqueda.setText("U");
		this.jButtondescripcionParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionParametroCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroCompra = new JLabelMe();
		this.jLabelid_empresaParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroCompra.setToolTipText("Empresa");
		this.jLabelid_empresaParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_empresaParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_empresaParametroCompra= new JComboBoxMe();
		jComboBoxid_empresaParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroCompra.setEnabled(false);

		this.jButtonid_empresaParametroCompra= new JButtonMe();
		this.jButtonid_empresaParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroCompra.setText("Buscar");
		this.jButtonid_empresaParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroCompra"));

		this.jButtonid_empresaParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroCompraBusqueda.setText("U");
		this.jButtonid_empresaParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroCompraUpdate= new JButtonMe();
		this.jButtonid_empresaParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroCompraUpdate.setText("U");
		this.jButtonid_empresaParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroCompraUpdate"));



					
		this.jLabelid_tipo_documentoParametroCompra = new JLabelMe();
		this.jLabelid_tipo_documentoParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDTIPODOCUMENTO+" : *");
		this.jLabelid_tipo_documentoParametroCompra.setToolTipText("Tipo Documento");
		this.jLabelid_tipo_documentoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documentoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documentoParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_tipo_documentoParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_tipo_documentoParametroCompra= new JComboBoxMe();
		jComboBoxid_tipo_documentoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documentoParametroCompra= new JButtonMe();
		this.jButtonid_tipo_documentoParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoParametroCompra.setText("Buscar");
		this.jButtonid_tipo_documentoParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documentoParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documentoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoParametroCompra"));

		this.jButtonid_tipo_documentoParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_tipo_documentoParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoParametroCompraBusqueda.setText("U");
		this.jButtonid_tipo_documentoParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documentoParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documentoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documentoParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documentoParametroCompraUpdate= new JButtonMe();
		this.jButtonid_tipo_documentoParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoParametroCompraUpdate.setText("U");
		this.jButtonid_tipo_documentoParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documentoParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documentoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoParametroCompraUpdate"));



					
		this.jLabelid_tipo_movimientoParametroCompra = new JLabelMe();
		this.jLabelid_tipo_movimientoParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoParametroCompra.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_tipo_movimientoParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_tipo_movimientoParametroCompra= new JComboBoxMe();
		jComboBoxid_tipo_movimientoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_movimientoParametroCompra= new JButtonMe();
		this.jButtonid_tipo_movimientoParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoParametroCompra.setText("Buscar");
		this.jButtonid_tipo_movimientoParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoParametroCompra"));

		this.jButtonid_tipo_movimientoParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoParametroCompraBusqueda.setText("U");
		this.jButtonid_tipo_movimientoParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoParametroCompraUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoParametroCompraUpdate.setText("U");
		this.jButtonid_tipo_movimientoParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoParametroCompraUpdate"));



					
		this.jLabelid_bodegaParametroCompra = new JLabelMe();
		this.jLabelid_bodegaParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaParametroCompra.setToolTipText("Bodega");
		this.jLabelid_bodegaParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_bodegaParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_bodegaParametroCompra= new JComboBoxMe();
		jComboBoxid_bodegaParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaParametroCompra= new JButtonMe();
		this.jButtonid_bodegaParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaParametroCompra.setText("Buscar");
		this.jButtonid_bodegaParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroCompra"));

		this.jButtonid_bodegaParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_bodegaParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroCompraBusqueda.setText("U");
		this.jButtonid_bodegaParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_bodegaParametroCompraUpdate= new JButtonMe();
		this.jButtonid_bodegaParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaParametroCompraUpdate.setText("U");
		this.jButtonid_bodegaParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaParametroCompraUpdate"));



					
		this.jLabelid_bodega_reservaParametroCompra = new JLabelMe();
		this.jLabelid_bodega_reservaParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDBODEGARESERVA+" : *");
		this.jLabelid_bodega_reservaParametroCompra.setToolTipText("Bodega Reserva");
		this.jLabelid_bodega_reservaParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_reservaParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_reservaParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_reservaParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_reservaParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_reservaParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDBODEGARESERVA);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_bodega_reservaParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_bodega_reservaParametroCompra= new JComboBoxMe();
		jComboBoxid_bodega_reservaParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_reservaParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_reservaParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_reservaParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_reservaParametroCompra= new JButtonMe();
		this.jButtonid_bodega_reservaParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_reservaParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_reservaParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_reservaParametroCompra.setText("Buscar");
		this.jButtonid_bodega_reservaParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_reservaParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_reservaParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_reservaParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_reservaParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_reservaParametroCompra"));

		this.jButtonid_bodega_reservaParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_bodega_reservaParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_reservaParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_reservaParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_reservaParametroCompraBusqueda.setText("U");
		this.jButtonid_bodega_reservaParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_reservaParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_reservaParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_reservaParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_reservaParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_reservaParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_reservaParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_bodega_reservaParametroCompraUpdate= new JButtonMe();
		this.jButtonid_bodega_reservaParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_reservaParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_reservaParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_reservaParametroCompraUpdate.setText("U");
		this.jButtonid_bodega_reservaParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_reservaParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_reservaParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_reservaParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_reservaParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_reservaParametroCompraUpdate"));



					
		this.jLabelid_empleadoParametroCompra = new JLabelMe();
		this.jLabelid_empleadoParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoParametroCompra.setToolTipText("Empleado");
		this.jLabelid_empleadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_empleadoParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_empleadoParametroCompra= new JComboBoxMe();
		jComboBoxid_empleadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoParametroCompra= new JButtonMe();
		this.jButtonid_empleadoParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoParametroCompra.setText("Buscar");
		this.jButtonid_empleadoParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoParametroCompra"));

		this.jButtonid_empleadoParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_empleadoParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoParametroCompraBusqueda.setText("U");
		this.jButtonid_empleadoParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_empleadoParametroCompraUpdate= new JButtonMe();
		this.jButtonid_empleadoParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoParametroCompraUpdate.setText("U");
		this.jButtonid_empleadoParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoParametroCompraUpdate"));



					
		this.jLabelid_embarcadorParametroCompra = new JLabelMe();
		this.jLabelid_embarcadorParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDEMBARCADOR+" : *");
		this.jLabelid_embarcadorParametroCompra.setToolTipText("Embarcador");
		this.jLabelid_embarcadorParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_embarcadorParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_embarcadorParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_embarcadorParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_embarcadorParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_embarcadorParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDEMBARCADOR);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_embarcadorParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_embarcadorParametroCompra= new JComboBoxMe();
		jComboBoxid_embarcadorParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_embarcadorParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_embarcadorParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_embarcadorParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_embarcadorParametroCompra= new JButtonMe();
		this.jButtonid_embarcadorParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_embarcadorParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_embarcadorParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_embarcadorParametroCompra.setText("Buscar");
		this.jButtonid_embarcadorParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_embarcadorParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_embarcadorParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_embarcadorParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_embarcadorParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_embarcadorParametroCompra"));

		this.jButtonid_embarcadorParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_embarcadorParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_embarcadorParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_embarcadorParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_embarcadorParametroCompraBusqueda.setText("U");
		this.jButtonid_embarcadorParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_embarcadorParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_embarcadorParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_embarcadorParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_embarcadorParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_embarcadorParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_embarcadorParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_embarcadorParametroCompraUpdate= new JButtonMe();
		this.jButtonid_embarcadorParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_embarcadorParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_embarcadorParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_embarcadorParametroCompraUpdate.setText("U");
		this.jButtonid_embarcadorParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_embarcadorParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_embarcadorParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_embarcadorParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_embarcadorParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_embarcadorParametroCompraUpdate"));



					
		this.jLabelid_moduloParametroCompra = new JLabelMe();
		this.jLabelid_moduloParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloParametroCompra.setToolTipText("Modulo");
		this.jLabelid_moduloParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_moduloParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_moduloParametroCompra= new JComboBoxMe();
		jComboBoxid_moduloParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloParametroCompra.setEnabled(false);

		this.jButtonid_moduloParametroCompra= new JButtonMe();
		this.jButtonid_moduloParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloParametroCompra.setText("Buscar");
		this.jButtonid_moduloParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloParametroCompra"));

		this.jButtonid_moduloParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_moduloParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloParametroCompraBusqueda.setText("U");
		this.jButtonid_moduloParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_moduloParametroCompraUpdate= new JButtonMe();
		this.jButtonid_moduloParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloParametroCompraUpdate.setText("U");
		this.jButtonid_moduloParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloParametroCompraUpdate"));



					
		this.jLabelid_tipo_movimiento_moduloParametroCompra = new JLabelMe();
		this.jLabelid_tipo_movimiento_moduloParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO+" : *");
		this.jLabelid_tipo_movimiento_moduloParametroCompra.setToolTipText("Tipo Movimiento Modulo");
		this.jLabelid_tipo_movimiento_moduloParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimiento_moduloParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimiento_moduloParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimiento_moduloParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimiento_moduloParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_tipo_movimiento_moduloParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_tipo_movimiento_moduloParametroCompra= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_movimiento_moduloParametroCompra.setEnabled(false);

		this.jButtonid_tipo_movimiento_moduloParametroCompra= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloParametroCompra.setText("Buscar");
		this.jButtonid_tipo_movimiento_moduloParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimiento_moduloParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimiento_moduloParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloParametroCompra"));

		this.jButtonid_tipo_movimiento_moduloParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloParametroCompraBusqueda.setText("U");
		this.jButtonid_tipo_movimiento_moduloParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimiento_moduloParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimiento_moduloParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimiento_moduloParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimiento_moduloParametroCompraUpdate= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloParametroCompraUpdate.setText("U");
		this.jButtonid_tipo_movimiento_moduloParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimiento_moduloParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimiento_moduloParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloParametroCompraUpdate"));



					
		this.jLabelid_formato_pedidoParametroCompra = new JLabelMe();
		this.jLabelid_formato_pedidoParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDFORMATOPEDIDO+" : *");
		this.jLabelid_formato_pedidoParametroCompra.setToolTipText("Formato Pedido");
		this.jLabelid_formato_pedidoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_pedidoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_pedidoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_pedidoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_pedidoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_pedidoParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDFORMATOPEDIDO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_formato_pedidoParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_formato_pedidoParametroCompra= new JComboBoxMe();
		jComboBoxid_formato_pedidoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_pedidoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_pedidoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_pedidoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_pedidoParametroCompra= new JButtonMe();
		this.jButtonid_formato_pedidoParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_pedidoParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_pedidoParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_pedidoParametroCompra.setText("Buscar");
		this.jButtonid_formato_pedidoParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_pedidoParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_pedidoParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_pedidoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_pedidoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_pedidoParametroCompra"));

		this.jButtonid_formato_pedidoParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_formato_pedidoParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_pedidoParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_pedidoParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_pedidoParametroCompraBusqueda.setText("U");
		this.jButtonid_formato_pedidoParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_pedidoParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_pedidoParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_pedidoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_pedidoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_pedidoParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_pedidoParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_formato_pedidoParametroCompraUpdate= new JButtonMe();
		this.jButtonid_formato_pedidoParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_pedidoParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_pedidoParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_pedidoParametroCompraUpdate.setText("U");
		this.jButtonid_formato_pedidoParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_pedidoParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_pedidoParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_pedidoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_pedidoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_pedidoParametroCompraUpdate"));



					
		this.jLabelid_estado_pedido_pendienteParametroCompra = new JLabelMe();
		this.jLabelid_estado_pedido_pendienteParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOPENDIENTE+" : *");
		this.jLabelid_estado_pedido_pendienteParametroCompra.setToolTipText("Estado Pedido Pendiente");
		this.jLabelid_estado_pedido_pendienteParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_pedido_pendienteParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_pedido_pendienteParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_pendienteParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedido_pendienteParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedido_pendienteParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOPENDIENTE);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_estado_pedido_pendienteParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_estado_pedido_pendienteParametroCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_pendienteParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_pendienteParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_pendienteParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_pendienteParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pedido_pendienteParametroCompra= new JButtonMe();
		this.jButtonid_estado_pedido_pendienteParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_pendienteParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_pendienteParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_pendienteParametroCompra.setText("Buscar");
		this.jButtonid_estado_pedido_pendienteParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedido_pendienteParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_pendienteParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedido_pendienteParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_pendienteParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_pendienteParametroCompra"));

		this.jButtonid_estado_pedido_pendienteParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_estado_pedido_pendienteParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_pendienteParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_pendienteParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_pendienteParametroCompraBusqueda.setText("U");
		this.jButtonid_estado_pedido_pendienteParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedido_pendienteParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_pendienteParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedido_pendienteParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_pendienteParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_pendienteParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedido_pendienteParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedido_pendienteParametroCompraUpdate= new JButtonMe();
		this.jButtonid_estado_pedido_pendienteParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_pendienteParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_pendienteParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_pendienteParametroCompraUpdate.setText("U");
		this.jButtonid_estado_pedido_pendienteParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedido_pendienteParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_pendienteParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedido_pendienteParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_pendienteParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_pendienteParametroCompraUpdate"));



					
		this.jLabelid_formato_cotizacionParametroCompra = new JLabelMe();
		this.jLabelid_formato_cotizacionParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDFORMATOCOTIZACION+" : *");
		this.jLabelid_formato_cotizacionParametroCompra.setToolTipText("Formato Cotizacion");
		this.jLabelid_formato_cotizacionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_cotizacionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formato_cotizacionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_cotizacionParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_cotizacionParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_cotizacionParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDFORMATOCOTIZACION);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_formato_cotizacionParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_formato_cotizacionParametroCompra= new JComboBoxMe();
		jComboBoxid_formato_cotizacionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_cotizacionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_cotizacionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_cotizacionParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_cotizacionParametroCompra= new JButtonMe();
		this.jButtonid_formato_cotizacionParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_cotizacionParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_cotizacionParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_cotizacionParametroCompra.setText("Buscar");
		this.jButtonid_formato_cotizacionParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_cotizacionParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_cotizacionParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_cotizacionParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_cotizacionParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_cotizacionParametroCompra"));

		this.jButtonid_formato_cotizacionParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_formato_cotizacionParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_cotizacionParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_cotizacionParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_cotizacionParametroCompraBusqueda.setText("U");
		this.jButtonid_formato_cotizacionParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_cotizacionParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_cotizacionParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_cotizacionParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_cotizacionParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_cotizacionParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_cotizacionParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_formato_cotizacionParametroCompraUpdate= new JButtonMe();
		this.jButtonid_formato_cotizacionParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_cotizacionParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_cotizacionParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_cotizacionParametroCompraUpdate.setText("U");
		this.jButtonid_formato_cotizacionParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_cotizacionParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_cotizacionParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_cotizacionParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_cotizacionParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_cotizacionParametroCompraUpdate"));



					
		this.jLabelid_estado_pedido_cotizadoParametroCompra = new JLabelMe();
		this.jLabelid_estado_pedido_cotizadoParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOCOTIZADO+" : *");
		this.jLabelid_estado_pedido_cotizadoParametroCompra.setToolTipText("Estado Pedido Cotizado");
		this.jLabelid_estado_pedido_cotizadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_pedido_cotizadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_pedido_cotizadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_cotizadoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedido_cotizadoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedido_cotizadoParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOCOTIZADO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_estado_pedido_cotizadoParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_estado_pedido_cotizadoParametroCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_cotizadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_cotizadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_cotizadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_cotizadoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pedido_cotizadoParametroCompra= new JButtonMe();
		this.jButtonid_estado_pedido_cotizadoParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_cotizadoParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_cotizadoParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_cotizadoParametroCompra.setText("Buscar");
		this.jButtonid_estado_pedido_cotizadoParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedido_cotizadoParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_cotizadoParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedido_cotizadoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_cotizadoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_cotizadoParametroCompra"));

		this.jButtonid_estado_pedido_cotizadoParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_estado_pedido_cotizadoParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_cotizadoParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_cotizadoParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_cotizadoParametroCompraBusqueda.setText("U");
		this.jButtonid_estado_pedido_cotizadoParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedido_cotizadoParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_cotizadoParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedido_cotizadoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_cotizadoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_cotizadoParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedido_cotizadoParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedido_cotizadoParametroCompraUpdate= new JButtonMe();
		this.jButtonid_estado_pedido_cotizadoParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_cotizadoParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_cotizadoParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_cotizadoParametroCompraUpdate.setText("U");
		this.jButtonid_estado_pedido_cotizadoParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedido_cotizadoParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_cotizadoParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedido_cotizadoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_cotizadoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_cotizadoParametroCompraUpdate"));



					
		this.jLabelid_formato_autorizacionParametroCompra = new JLabelMe();
		this.jLabelid_formato_autorizacionParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDFORMATOAUTORIZACION+" : *");
		this.jLabelid_formato_autorizacionParametroCompra.setToolTipText("Formato Autorizacion");
		this.jLabelid_formato_autorizacionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_autorizacionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_formato_autorizacionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_autorizacionParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_autorizacionParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_autorizacionParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDFORMATOAUTORIZACION);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_formato_autorizacionParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_formato_autorizacionParametroCompra= new JComboBoxMe();
		jComboBoxid_formato_autorizacionParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_autorizacionParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_autorizacionParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_autorizacionParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_autorizacionParametroCompra= new JButtonMe();
		this.jButtonid_formato_autorizacionParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_autorizacionParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_autorizacionParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_autorizacionParametroCompra.setText("Buscar");
		this.jButtonid_formato_autorizacionParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_autorizacionParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_autorizacionParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_autorizacionParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_autorizacionParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_autorizacionParametroCompra"));

		this.jButtonid_formato_autorizacionParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_formato_autorizacionParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_autorizacionParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_autorizacionParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_autorizacionParametroCompraBusqueda.setText("U");
		this.jButtonid_formato_autorizacionParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_autorizacionParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_autorizacionParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_autorizacionParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_autorizacionParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_autorizacionParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_autorizacionParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_formato_autorizacionParametroCompraUpdate= new JButtonMe();
		this.jButtonid_formato_autorizacionParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_autorizacionParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_autorizacionParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_autorizacionParametroCompraUpdate.setText("U");
		this.jButtonid_formato_autorizacionParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_autorizacionParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_autorizacionParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_autorizacionParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_autorizacionParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_autorizacionParametroCompraUpdate"));



					
		this.jLabelid_estado_pedido_autorizadoParametroCompra = new JLabelMe();
		this.jLabelid_estado_pedido_autorizadoParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOAUTORIZADO+" : *");
		this.jLabelid_estado_pedido_autorizadoParametroCompra.setToolTipText("Estado Pedido Autorizado");
		this.jLabelid_estado_pedido_autorizadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_pedido_autorizadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_pedido_autorizadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_autorizadoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedido_autorizadoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedido_autorizadoParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOAUTORIZADO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_estado_pedido_autorizadoParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_estado_pedido_autorizadoParametroCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_autorizadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_autorizadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_autorizadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_autorizadoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pedido_autorizadoParametroCompra= new JButtonMe();
		this.jButtonid_estado_pedido_autorizadoParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_autorizadoParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_autorizadoParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_autorizadoParametroCompra.setText("Buscar");
		this.jButtonid_estado_pedido_autorizadoParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedido_autorizadoParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_autorizadoParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedido_autorizadoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_autorizadoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_autorizadoParametroCompra"));

		this.jButtonid_estado_pedido_autorizadoParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_estado_pedido_autorizadoParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_autorizadoParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_autorizadoParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_autorizadoParametroCompraBusqueda.setText("U");
		this.jButtonid_estado_pedido_autorizadoParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedido_autorizadoParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_autorizadoParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedido_autorizadoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_autorizadoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_autorizadoParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedido_autorizadoParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedido_autorizadoParametroCompraUpdate= new JButtonMe();
		this.jButtonid_estado_pedido_autorizadoParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_autorizadoParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_autorizadoParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_autorizadoParametroCompraUpdate.setText("U");
		this.jButtonid_estado_pedido_autorizadoParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedido_autorizadoParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_autorizadoParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedido_autorizadoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_autorizadoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_autorizadoParametroCompraUpdate"));



					
		this.jLabelid_formato_itemParametroCompra = new JLabelMe();
		this.jLabelid_formato_itemParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDFORMATOITEM+" : *");
		this.jLabelid_formato_itemParametroCompra.setToolTipText("Formato Item");
		this.jLabelid_formato_itemParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_itemParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formato_itemParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formato_itemParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formato_itemParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formato_itemParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDFORMATOITEM);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_formato_itemParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_formato_itemParametroCompra= new JComboBoxMe();
		jComboBoxid_formato_itemParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_itemParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formato_itemParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formato_itemParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formato_itemParametroCompra= new JButtonMe();
		this.jButtonid_formato_itemParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_itemParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_itemParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formato_itemParametroCompra.setText("Buscar");
		this.jButtonid_formato_itemParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formato_itemParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_itemParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formato_itemParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_itemParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_itemParametroCompra"));

		this.jButtonid_formato_itemParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_formato_itemParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_itemParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_itemParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_itemParametroCompraBusqueda.setText("U");
		this.jButtonid_formato_itemParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formato_itemParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_itemParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formato_itemParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_itemParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_itemParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formato_itemParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_formato_itemParametroCompraUpdate= new JButtonMe();
		this.jButtonid_formato_itemParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_itemParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formato_itemParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formato_itemParametroCompraUpdate.setText("U");
		this.jButtonid_formato_itemParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formato_itemParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formato_itemParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formato_itemParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formato_itemParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formato_itemParametroCompraUpdate"));



					
		this.jLabelid_estado_pedido_anuladoParametroCompra = new JLabelMe();
		this.jLabelid_estado_pedido_anuladoParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOANULADO+" : *");
		this.jLabelid_estado_pedido_anuladoParametroCompra.setToolTipText("Estado Pedido Anulado");
		this.jLabelid_estado_pedido_anuladoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_pedido_anuladoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_pedido_anuladoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_anuladoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedido_anuladoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedido_anuladoParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOANULADO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_estado_pedido_anuladoParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_estado_pedido_anuladoParametroCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_anuladoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_anuladoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_anuladoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_anuladoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pedido_anuladoParametroCompra= new JButtonMe();
		this.jButtonid_estado_pedido_anuladoParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_anuladoParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_anuladoParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_anuladoParametroCompra.setText("Buscar");
		this.jButtonid_estado_pedido_anuladoParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedido_anuladoParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_anuladoParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedido_anuladoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_anuladoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_anuladoParametroCompra"));

		this.jButtonid_estado_pedido_anuladoParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_estado_pedido_anuladoParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_anuladoParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_anuladoParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_anuladoParametroCompraBusqueda.setText("U");
		this.jButtonid_estado_pedido_anuladoParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedido_anuladoParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_anuladoParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedido_anuladoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_anuladoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_anuladoParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedido_anuladoParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedido_anuladoParametroCompraUpdate= new JButtonMe();
		this.jButtonid_estado_pedido_anuladoParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_anuladoParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_anuladoParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_anuladoParametroCompraUpdate.setText("U");
		this.jButtonid_estado_pedido_anuladoParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedido_anuladoParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_anuladoParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedido_anuladoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_anuladoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_anuladoParametroCompraUpdate"));



					
		this.jLabelid_prioridad_pedidoParametroCompra = new JLabelMe();
		this.jLabelid_prioridad_pedidoParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDPRIORIDADPEDIDO+" : *");
		this.jLabelid_prioridad_pedidoParametroCompra.setToolTipText("Prioridad Pedido");
		this.jLabelid_prioridad_pedidoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_prioridad_pedidoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_prioridad_pedidoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_prioridad_pedidoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_prioridad_pedidoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_prioridad_pedidoParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDPRIORIDADPEDIDO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_prioridad_pedidoParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_prioridad_pedidoParametroCompra= new JComboBoxMe();
		jComboBoxid_prioridad_pedidoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_prioridad_pedidoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_prioridad_pedidoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_prioridad_pedidoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_prioridad_pedidoParametroCompra= new JButtonMe();
		this.jButtonid_prioridad_pedidoParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_prioridad_pedidoParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_prioridad_pedidoParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_prioridad_pedidoParametroCompra.setText("Buscar");
		this.jButtonid_prioridad_pedidoParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_prioridad_pedidoParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_prioridad_pedidoParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_prioridad_pedidoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_prioridad_pedidoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_prioridad_pedidoParametroCompra"));

		this.jButtonid_prioridad_pedidoParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_prioridad_pedidoParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_prioridad_pedidoParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_prioridad_pedidoParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_prioridad_pedidoParametroCompraBusqueda.setText("U");
		this.jButtonid_prioridad_pedidoParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_prioridad_pedidoParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_prioridad_pedidoParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_prioridad_pedidoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_prioridad_pedidoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_prioridad_pedidoParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_prioridad_pedidoParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_prioridad_pedidoParametroCompraUpdate= new JButtonMe();
		this.jButtonid_prioridad_pedidoParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_prioridad_pedidoParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_prioridad_pedidoParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_prioridad_pedidoParametroCompraUpdate.setText("U");
		this.jButtonid_prioridad_pedidoParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_prioridad_pedidoParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_prioridad_pedidoParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_prioridad_pedidoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_prioridad_pedidoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_prioridad_pedidoParametroCompraUpdate"));



					
		this.jLabelid_estado_pedido_suspendidoParametroCompra = new JLabelMe();
		this.jLabelid_estado_pedido_suspendidoParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOSUSPENDIDO+" : *");
		this.jLabelid_estado_pedido_suspendidoParametroCompra.setToolTipText("Estado Pedido Suspendo");
		this.jLabelid_estado_pedido_suspendidoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_pedido_suspendidoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_pedido_suspendidoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_suspendidoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedido_suspendidoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedido_suspendidoParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOSUSPENDIDO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_estado_pedido_suspendidoParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_estado_pedido_suspendidoParametroCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_suspendidoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_suspendidoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_suspendidoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_suspendidoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pedido_suspendidoParametroCompra= new JButtonMe();
		this.jButtonid_estado_pedido_suspendidoParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_suspendidoParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_suspendidoParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_suspendidoParametroCompra.setText("Buscar");
		this.jButtonid_estado_pedido_suspendidoParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedido_suspendidoParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_suspendidoParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedido_suspendidoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_suspendidoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_suspendidoParametroCompra"));

		this.jButtonid_estado_pedido_suspendidoParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_estado_pedido_suspendidoParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_suspendidoParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_suspendidoParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_suspendidoParametroCompraBusqueda.setText("U");
		this.jButtonid_estado_pedido_suspendidoParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedido_suspendidoParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_suspendidoParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedido_suspendidoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_suspendidoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_suspendidoParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedido_suspendidoParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedido_suspendidoParametroCompraUpdate= new JButtonMe();
		this.jButtonid_estado_pedido_suspendidoParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_suspendidoParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_suspendidoParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_suspendidoParametroCompraUpdate.setText("U");
		this.jButtonid_estado_pedido_suspendidoParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedido_suspendidoParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_suspendidoParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedido_suspendidoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_suspendidoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_suspendidoParametroCompraUpdate"));



					
		this.jLabelid_estado_pedido_regularizadoParametroCompra = new JLabelMe();
		this.jLabelid_estado_pedido_regularizadoParametroCompra.setText(""+ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOREGULARIZADO+" : *");
		this.jLabelid_estado_pedido_regularizadoParametroCompra.setToolTipText("Estado Pedido Regularizado");
		this.jLabelid_estado_pedido_regularizadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_pedido_regularizadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_pedido_regularizadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_pedido_regularizadoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_pedido_regularizadoParametroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_pedido_regularizadoParametroCompra.setToolTipText(ParametroCompraConstantesFunciones.LABEL_IDESTADOPEDIDOREGULARIZADO);
		this.gridaBagLayoutParametroCompra = new GridBagLayout();
		this.jPanelid_estado_pedido_regularizadoParametroCompra.setLayout(this.gridaBagLayoutParametroCompra);


		jComboBoxid_estado_pedido_regularizadoParametroCompra= new JComboBoxMe();
		jComboBoxid_estado_pedido_regularizadoParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_regularizadoParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_pedido_regularizadoParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_pedido_regularizadoParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_pedido_regularizadoParametroCompra= new JButtonMe();
		this.jButtonid_estado_pedido_regularizadoParametroCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_regularizadoParametroCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_regularizadoParametroCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_pedido_regularizadoParametroCompra.setText("Buscar");
		this.jButtonid_estado_pedido_regularizadoParametroCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_pedido_regularizadoParametroCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_regularizadoParametroCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_pedido_regularizadoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_regularizadoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_regularizadoParametroCompra"));

		this.jButtonid_estado_pedido_regularizadoParametroCompraBusqueda= new JButtonMe();
		this.jButtonid_estado_pedido_regularizadoParametroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_regularizadoParametroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_regularizadoParametroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_regularizadoParametroCompraBusqueda.setText("U");
		this.jButtonid_estado_pedido_regularizadoParametroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_pedido_regularizadoParametroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_regularizadoParametroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_pedido_regularizadoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_regularizadoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_regularizadoParametroCompraBusqueda"));

		if(this.parametrocompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_pedido_regularizadoParametroCompraBusqueda.setVisible(false);		}

		this.jButtonid_estado_pedido_regularizadoParametroCompraUpdate= new JButtonMe();
		this.jButtonid_estado_pedido_regularizadoParametroCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_regularizadoParametroCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_pedido_regularizadoParametroCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_pedido_regularizadoParametroCompraUpdate.setText("U");
		this.jButtonid_estado_pedido_regularizadoParametroCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_pedido_regularizadoParametroCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_pedido_regularizadoParametroCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_pedido_regularizadoParametroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_pedido_regularizadoParametroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_pedido_regularizadoParametroCompraUpdate"));



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
		//this.jInternalFrameDetalleParametroCompra = new ParametroCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroCompra= new GridBagLayout();
		

		
		String sToolTipParametroCompra="";
		sToolTipParametroCompra=ParametroCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroCompra+="(Inventario.ParametroCompra)";
		}
		
		if(!this.parametrocompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroCompra = new JButtonMe();
		this.jButtonModificarParametroCompra = new JButtonMe();
        this.jButtonActualizarParametroCompra = new JButtonMe();
        this.jButtonEliminarParametroCompra = new JButtonMe();
        this.jButtonCancelarParametroCompra = new JButtonMe();
        this.jButtonGuardarCambiosParametroCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroCompra = new JButtonMe();
		this.jButtonCerrarParametroCompra = new JButtonMe();
		
		this.jScrollPanelDatosParametroCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroCompra = new JScrollPane();
				
		
		
		this.jPanelCamposParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposParametroCompra=new JTabbedPane();
		
		
		this.jTabbedPaneCamposParametroCompra.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioformato_estadoParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Compra";
		
		if(!this.parametrocompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Compraes" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroCompra.setName("jPanelCamposParametroCompra"); 

		this.jPanelCamposOcultosParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroCompra.setName("jPanelCamposOcultosParametroCompra"); 

        this.jPanelAccionesParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroCompra.setToolTipText("Acciones");
        this.jPanelAccionesParametroCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralParametroCompra.setName("jPanelCamposFingeneralParametroCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioformato_estadoParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Formato Estado"));
		this.jPanelCamposInicioformato_estadoParametroCompra.setName("jPanelCamposFinformato_estadoParametroCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioformato_estadoParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroCompra.setText("Nuevo");
		this.jButtonModificarParametroCompra.setText("Editar");
        this.jButtonActualizarParametroCompra.setText("Actualizar");
        this.jButtonEliminarParametroCompra.setText("Eliminar");
        this.jButtonCancelarParametroCompra.setText("Cancelar");
        this.jButtonGuardarCambiosParametroCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroCompra.setText("Guardar");
		this.jButtonCerrarParametroCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroCompra,"nuevo_button","Nuevo",this.parametrocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroCompra,"modificar_button","Editar",this.parametrocompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroCompra,"actualizar_button","Actualizar",this.parametrocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroCompra,"eliminar_button","Eliminar",this.parametrocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroCompra,"cancelar_button","Cancelar",this.parametrocompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroCompra,"guardarcambios_button","Guardar",this.parametrocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroCompra,"guardarcambiostabla_button","Guardar",this.parametrocompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroCompra,"cerrar_button","Salir",this.parametrocompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroCompra.setToolTipText("Nuevo"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroCompra.setToolTipText("Editar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroCompra.setToolTipText("Actualizar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroCompra.setToolTipText("Eliminar)"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroCompra.setToolTipText("Cancelar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroCompra.setToolTipText("Guardar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroCompra.setToolTipText("Guardar"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroCompra.setToolTipText("Salir"+" "+ParametroCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroCompra";
		inputMap = this.jButtonNuevoParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroCompra";
		inputMap = this.jButtonActualizarParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroCompra";
		inputMap = this.jButtonEliminarParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroCompra";
		inputMap = this.jButtonCancelarParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroCompra"));
		
		//CERRAR		
		sMapKey = "CerrarParametroCompra";
		inputMap = this.jButtonCerrarParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroCompra";
		inputMap = this.jButtonGuardarCambiosTablaParametroCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroCompra.setToolTipText("Nuevo ParametroCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroCompra.setToolTipText("Sin Cerrar Ventana ParametroCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroCompra.setText("Accion");
		this.jComboBoxTiposAccionesParametroCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroCompra = new JLabelMe();
		
		this.jLabelAccionesParametroCompra.setText("Acciones");		
		this.jLabelAccionesParametroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroCompra = new GridBagLayout();
		
		this.jPanelCamposParametroCompra.setLayout(gridaBagLayoutCamposParametroCompra);
		this.jPanelCamposOcultosParametroCompra.setLayout(gridaBagLayoutCamposOcultosParametroCompra);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralParametroCompra= new GridBagLayout();
		this.jPanelCamposIniciogeneralParametroCompra.setLayout(gridaBagLayoutCamposIniciogeneralParametroCompra);

		GridBagLayout gridaBagLayoutCamposInicioformato_estadoParametroCompra= new GridBagLayout();
		this.jPanelCamposInicioformato_estadoParametroCompra.setLayout(gridaBagLayoutCamposInicioformato_estadoParametroCompra);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroCompra.add(jLabelIdParametroCompra, this.gridBagConstraintsParametroCompra);



	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroCompra.add(jLabelidParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroCompra.add(jLabelid_empresaParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroCompra.add(jButtonid_empresaParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroCompra.add(jButtonid_empresaParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroCompra.add(jComboBoxid_empresaParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_pedidoParametroCompra.add(jLabelsecuencial_pedidoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_pedidoParametroCompra.add(jButtonsecuencial_pedidoParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_pedidoParametroCompra.add(jTextFieldsecuencial_pedidoParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_cotizacionParametroCompra.add(jLabelsecuencial_cotizacionParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_cotizacionParametroCompra.add(jButtonsecuencial_cotizacionParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_cotizacionParametroCompra.add(jTextFieldsecuencial_cotizacionParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_produccionParametroCompra.add(jLabelsecuencial_produccionParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_produccionParametroCompra.add(jButtonsecuencial_produccionParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_produccionParametroCompra.add(jTextFieldsecuencial_produccionParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documentoParametroCompra.add(jLabelid_tipo_documentoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoParametroCompra.add(jButtonid_tipo_documentoParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoParametroCompra.add(jButtonid_tipo_documentoParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documentoParametroCompra.add(jComboBoxid_tipo_documentoParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoParametroCompra.add(jLabelid_tipo_movimientoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoParametroCompra.add(jButtonid_tipo_movimientoParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoParametroCompra.add(jButtonid_tipo_movimientoParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoParametroCompra.add(jComboBoxid_tipo_movimientoParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaParametroCompra.add(jLabelid_bodegaParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroCompra.add(jButtonid_bodegaParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaParametroCompra.add(jButtonid_bodegaParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaParametroCompra.add(jComboBoxid_bodegaParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_reservaParametroCompra.add(jLabelid_bodega_reservaParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_reservaParametroCompra.add(jButtonid_bodega_reservaParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_reservaParametroCompra.add(jButtonid_bodega_reservaParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_reservaParametroCompra.add(jComboBoxid_bodega_reservaParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoParametroCompra.add(jLabelid_empleadoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 2;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoParametroCompra.add(jButtonid_empleadoParametroCompra, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoParametroCompra.add(jButtonid_empleadoParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 4;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoParametroCompra.add(jButtonid_empleadoParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoParametroCompra.add(jComboBoxid_empleadoParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_embarcadorParametroCompra.add(jLabelid_embarcadorParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_embarcadorParametroCompra.add(jButtonid_embarcadorParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_embarcadorParametroCompra.add(jButtonid_embarcadorParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_embarcadorParametroCompra.add(jComboBoxid_embarcadorParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_centro_costoParametroCompra.add(jLabelcon_centro_costoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_centro_costoParametroCompra.add(jButtoncon_centro_costoParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_centro_costoParametroCompra.add(jCheckBoxcon_centro_costoParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltexto_mailParametroCompra.add(jLabeltexto_mailParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneltexto_mailParametroCompra.add(jButtontexto_mailParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltexto_mailParametroCompra.add(jscrollPanetexto_mailParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloParametroCompra.add(jLabelid_moduloParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloParametroCompra.add(jButtonid_moduloParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloParametroCompra.add(jButtonid_moduloParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloParametroCompra.add(jComboBoxid_moduloParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimiento_moduloParametroCompra.add(jLabelid_tipo_movimiento_moduloParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloParametroCompra.add(jButtonid_tipo_movimiento_moduloParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloParametroCompra.add(jButtonid_tipo_movimiento_moduloParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimiento_moduloParametroCompra.add(jComboBoxid_tipo_movimiento_moduloParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionParametroCompra.add(jLabeldescripcionParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionParametroCompra.add(jButtondescripcionParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionParametroCompra.add(jscrollPanedescripcionParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_pedidoParametroCompra.add(jLabelid_formato_pedidoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_pedidoParametroCompra.add(jButtonid_formato_pedidoParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_pedidoParametroCompra.add(jButtonid_formato_pedidoParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_pedidoParametroCompra.add(jComboBoxid_formato_pedidoParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pedido_pendienteParametroCompra.add(jLabelid_estado_pedido_pendienteParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_pendienteParametroCompra.add(jButtonid_estado_pedido_pendienteParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_pendienteParametroCompra.add(jButtonid_estado_pedido_pendienteParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pedido_pendienteParametroCompra.add(jComboBoxid_estado_pedido_pendienteParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_cotizacionParametroCompra.add(jLabelid_formato_cotizacionParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_cotizacionParametroCompra.add(jButtonid_formato_cotizacionParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_cotizacionParametroCompra.add(jButtonid_formato_cotizacionParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_cotizacionParametroCompra.add(jComboBoxid_formato_cotizacionParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pedido_cotizadoParametroCompra.add(jLabelid_estado_pedido_cotizadoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_cotizadoParametroCompra.add(jButtonid_estado_pedido_cotizadoParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_cotizadoParametroCompra.add(jButtonid_estado_pedido_cotizadoParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pedido_cotizadoParametroCompra.add(jComboBoxid_estado_pedido_cotizadoParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_autorizacionParametroCompra.add(jLabelid_formato_autorizacionParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_autorizacionParametroCompra.add(jButtonid_formato_autorizacionParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_autorizacionParametroCompra.add(jButtonid_formato_autorizacionParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_autorizacionParametroCompra.add(jComboBoxid_formato_autorizacionParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pedido_autorizadoParametroCompra.add(jLabelid_estado_pedido_autorizadoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_autorizadoParametroCompra.add(jButtonid_estado_pedido_autorizadoParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_autorizadoParametroCompra.add(jButtonid_estado_pedido_autorizadoParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pedido_autorizadoParametroCompra.add(jComboBoxid_estado_pedido_autorizadoParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formato_itemParametroCompra.add(jLabelid_formato_itemParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_itemParametroCompra.add(jButtonid_formato_itemParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formato_itemParametroCompra.add(jButtonid_formato_itemParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formato_itemParametroCompra.add(jComboBoxid_formato_itemParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pedido_anuladoParametroCompra.add(jLabelid_estado_pedido_anuladoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_anuladoParametroCompra.add(jButtonid_estado_pedido_anuladoParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_anuladoParametroCompra.add(jButtonid_estado_pedido_anuladoParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pedido_anuladoParametroCompra.add(jComboBoxid_estado_pedido_anuladoParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_prioridad_pedidoParametroCompra.add(jLabelid_prioridad_pedidoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_prioridad_pedidoParametroCompra.add(jButtonid_prioridad_pedidoParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_prioridad_pedidoParametroCompra.add(jButtonid_prioridad_pedidoParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_prioridad_pedidoParametroCompra.add(jComboBoxid_prioridad_pedidoParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pedido_suspendidoParametroCompra.add(jLabelid_estado_pedido_suspendidoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_suspendidoParametroCompra.add(jButtonid_estado_pedido_suspendidoParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_suspendidoParametroCompra.add(jButtonid_estado_pedido_suspendidoParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pedido_suspendidoParametroCompra.add(jComboBoxid_estado_pedido_suspendidoParametroCompra, this.gridBagConstraintsParametroCompra);


	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 0;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_pedido_regularizadoParametroCompra.add(jLabelid_estado_pedido_regularizadoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 2;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_regularizadoParametroCompra.add(jButtonid_estado_pedido_regularizadoParametroCompraBusqueda, this.gridBagConstraintsParametroCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		//this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = 3;
		this.gridBagConstraintsParametroCompra.ipadx = 0;
		this.gridBagConstraintsParametroCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_pedido_regularizadoParametroCompra.add(jButtonid_estado_pedido_regularizadoParametroCompraUpdate, this.gridBagConstraintsParametroCompra);
	}

	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCompra.gridy = 0;
	this.gridBagConstraintsParametroCompra.gridx = 1;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_pedido_regularizadoParametroCompra.add(jComboBoxid_estado_pedido_regularizadoParametroCompra, this.gridBagConstraintsParametroCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposOcultosParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposOcultosParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroCompra.add(this.jPanelid_empresaParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposOcultosParametroCompra % 2==0) {
		iXPanelCamposOcultosParametroCompra=0;
		iYPanelCamposOcultosParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposOcultosParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposOcultosParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroCompra.add(this.jPanelid_moduloParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposOcultosParametroCompra % 2==0) {
		iXPanelCamposOcultosParametroCompra=0;
		iYPanelCamposOcultosParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposOcultosParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposOcultosParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroCompra.add(this.jPanelid_tipo_movimiento_moduloParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposOcultosParametroCompra % 2==0) {
		iXPanelCamposOcultosParametroCompra=0;
		iYPanelCamposOcultosParametroCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPanelidParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPanelsecuencial_pedidoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPanelsecuencial_cotizacionParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPanelsecuencial_produccionParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPanelid_tipo_documentoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPanelid_tipo_movimientoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPanelid_bodegaParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPanelid_bodega_reservaParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPanelid_empleadoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPanelid_embarcadorParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPanelcon_centro_costoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPaneltexto_mailParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposIniciogeneralParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposIniciogeneralParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralParametroCompra.add(this.jPaneldescripcionParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposIniciogeneralParametroCompra % 2==0) {
		iXPanelCamposIniciogeneralParametroCompra=0;
		iYPanelCamposIniciogeneralParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposInicioformato_estadoParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposInicioformato_estadoParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformato_estadoParametroCompra.add(this.jPanelid_formato_pedidoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposInicioformato_estadoParametroCompra % 2==0) {
		iXPanelCamposInicioformato_estadoParametroCompra=0;
		iYPanelCamposInicioformato_estadoParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposInicioformato_estadoParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposInicioformato_estadoParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformato_estadoParametroCompra.add(this.jPanelid_estado_pedido_pendienteParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposInicioformato_estadoParametroCompra % 2==0) {
		iXPanelCamposInicioformato_estadoParametroCompra=0;
		iYPanelCamposInicioformato_estadoParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposInicioformato_estadoParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposInicioformato_estadoParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformato_estadoParametroCompra.add(this.jPanelid_formato_cotizacionParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposInicioformato_estadoParametroCompra % 2==0) {
		iXPanelCamposInicioformato_estadoParametroCompra=0;
		iYPanelCamposInicioformato_estadoParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposInicioformato_estadoParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposInicioformato_estadoParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformato_estadoParametroCompra.add(this.jPanelid_estado_pedido_cotizadoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposInicioformato_estadoParametroCompra % 2==0) {
		iXPanelCamposInicioformato_estadoParametroCompra=0;
		iYPanelCamposInicioformato_estadoParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposInicioformato_estadoParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposInicioformato_estadoParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformato_estadoParametroCompra.add(this.jPanelid_formato_autorizacionParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposInicioformato_estadoParametroCompra % 2==0) {
		iXPanelCamposInicioformato_estadoParametroCompra=0;
		iYPanelCamposInicioformato_estadoParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposInicioformato_estadoParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposInicioformato_estadoParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformato_estadoParametroCompra.add(this.jPanelid_estado_pedido_autorizadoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposInicioformato_estadoParametroCompra % 2==0) {
		iXPanelCamposInicioformato_estadoParametroCompra=0;
		iYPanelCamposInicioformato_estadoParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposInicioformato_estadoParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposInicioformato_estadoParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformato_estadoParametroCompra.add(this.jPanelid_formato_itemParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposInicioformato_estadoParametroCompra % 2==0) {
		iXPanelCamposInicioformato_estadoParametroCompra=0;
		iYPanelCamposInicioformato_estadoParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposInicioformato_estadoParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposInicioformato_estadoParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformato_estadoParametroCompra.add(this.jPanelid_estado_pedido_anuladoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposInicioformato_estadoParametroCompra % 2==0) {
		iXPanelCamposInicioformato_estadoParametroCompra=0;
		iYPanelCamposInicioformato_estadoParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposInicioformato_estadoParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposInicioformato_estadoParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformato_estadoParametroCompra.add(this.jPanelid_prioridad_pedidoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposInicioformato_estadoParametroCompra % 2==0) {
		iXPanelCamposInicioformato_estadoParametroCompra=0;
		iYPanelCamposInicioformato_estadoParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposInicioformato_estadoParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposInicioformato_estadoParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformato_estadoParametroCompra.add(this.jPanelid_estado_pedido_suspendidoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposInicioformato_estadoParametroCompra % 2==0) {
		iXPanelCamposInicioformato_estadoParametroCompra=0;
		iYPanelCamposInicioformato_estadoParametroCompra++;
	}
	this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCompra.gridy = iYPanelCamposInicioformato_estadoParametroCompra;
	this.gridBagConstraintsParametroCompra.gridx = iXPanelCamposInicioformato_estadoParametroCompra++;
	this.gridBagConstraintsParametroCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioformato_estadoParametroCompra.add(this.jPanelid_estado_pedido_regularizadoParametroCompra, this.gridBagConstraintsParametroCompra);



	if(iXPanelCamposInicioformato_estadoParametroCompra % 2==0) {
		iXPanelCamposInicioformato_estadoParametroCompra=0;
		iYPanelCamposInicioformato_estadoParametroCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroCompra= new GridBagLayout();
		this.jPanelAccionesParametroCompra.setLayout(gridaBagLayoutAccionesParametroCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroCompra= new GridBagLayout();
		this.jPanelAccionesFormularioParametroCompra.setLayout(gridaBagLayoutAccionesFormularioParametroCompra);
		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroCompra.add(this.jComboBoxTiposAccionesFormularioParametroCompra, this.gridBagConstraintsParametroCompra);

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroCompra.add(this.jCheckBoxPostAccionNuevoParametroCompra, this.gridBagConstraintsParametroCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrocompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroCompra.add(this.jCheckBoxPostAccionSinCerrarParametroCompra, this.gridBagConstraintsParametroCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrocompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrocompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroCompra.add(this.jCheckBoxPostAccionSinMensajeParametroCompra, this.gridBagConstraintsParametroCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroCompra.add(this.jButtonModificarParametroCompra, this.gridBagConstraintsParametroCompra);							

		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCompra.gridy = 0;
		this.gridBagConstraintsParametroCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroCompra.add(this.jButtonEliminarParametroCompra, this.gridBagConstraintsParametroCompra);
		
			
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = 0;		
		this.gridBagConstraintsParametroCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroCompra.add(this.jButtonActualizarParametroCompra, this.gridBagConstraintsParametroCompra);


		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = 0;		
		this.gridBagConstraintsParametroCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroCompra.add(this.jButtonGuardarCambiosParametroCompra, this.gridBagConstraintsParametroCompra);	
		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = 0;		
		this.gridBagConstraintsParametroCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroCompra.add(this.jButtonCancelarParametroCompra, this.gridBagConstraintsParametroCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrocompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();						
			this.gridBagConstraintsParametroCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroCompra.gridx = 0;		
			//this.gridBagConstraintsParametroCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroCompra.gridx =0;
		this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroCompra, this.gridBagConstraintsParametroCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroCompra = new ParametroCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroCompraModel parametrocompraModel=new ParametroCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroCompraModel.ParametroCompraFocusTraversalPolicy parametrocompraFocusTraversalPolicy = parametrocompraModel.new ParametroCompraFocusTraversalPolicy(this);
			
			//parametrocompraFocusTraversalPolicy.setparametrocompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrocompraModel);
			
			
			this.jContentPaneDetalleParametroCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroCompra = new GridBagLayout();	
			this.jContentPaneDetalleParametroCompra.setLayout(gridaBagLayoutDetalleParametroCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroCompra = new GridBagConstraints();
				this.gridBagConstraintsParametroCompra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroCompra.gridx = 0;
					
				
				this.jContentPaneDetalleParametroCompra.add(jTtoolBarDetalleParametroCompra, gridBagConstraintsParametroCompra);								
				
}
			
			this.jScrollPanelDatosEdicionParametroCompra=   new JScrollPane(jContentPaneDetalleParametroCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposParametroCompra.add("General",this.jPanelCamposIniciogeneralParametroCompra);
		this.jTabbedPaneCamposParametroCompra.add("Formato Estado",this.jPanelCamposInicioformato_estadoParametroCompra);
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
						
			this.gridBagConstraintsParametroCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroCompra.gridx = 0;
	        
			this.jContentPaneDetalleParametroCompra.add(jTabbedPaneCamposParametroCompra, gridBagConstraintsParametroCompra);
			
			
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
						&& parametrocompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrocompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroCompra= new GridBagConstraints();
						this.gridBagConstraintsParametroCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroCompra.gridx = 0;
						this.jContentPaneDetalleParametroCompra.add(this.jTabbedPaneRelacionesParametroCompra, this.gridBagConstraintsParametroCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroCompra.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroCompra = new GridBagConstraints();
					this.gridBagConstraintsParametroCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroCompra.gridx = 0;
					
				
					this.jContentPaneDetalleParametroCompra.add(jPanelCamposOcultosParametroCompra, gridBagConstraintsParametroCompra);
				
					this.jPanelCamposOcultosParametroCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroCompra.gridx = 0;
	        this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroCompra.add(this.jPanelAccionesFormularioParametroCompra, this.gridBagConstraintsParametroCompra);							
			
			
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
	        this.gridBagConstraintsParametroCompra.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroCompra.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroCompra.add(this.jPanelAccionesParametroCompra, this.gridBagConstraintsParametroCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroCompra=   new JScrollPane(this.jPanelCamposParametroCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroCompra.gridx = 0;
			this.gridBagConstraintsParametroCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroCompra, this.gridBagConstraintsParametroCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroCompra, this.gridBagConstraintsParametroCompra);			
			
			this.gridBagConstraintsParametroCompra = new GridBagConstraints();
			this.gridBagConstraintsParametroCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroCompra, this.gridBagConstraintsParametroCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroCompra, this.gridBagConstraintsParametroCompra);
			
			
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroCompra, this.gridBagConstraintsParametroCompra);
		
			
		this.gridBagConstraintsParametroCompra = new GridBagConstraints();
		this.gridBagConstraintsParametroCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroCompra, this.gridBagConstraintsParametroCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroCompra;
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
