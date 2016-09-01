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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.OrdenCompraConstantesFunciones;

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
public class OrdenCompraDetalleFormJInternalFrame extends OrdenCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleOrdenCompra;
	
	protected JMenuBar jmenuBarDetalleOrdenCompra;
	
	protected JMenu jmenuDetalleOrdenCompra;
	protected JMenu jmenuDetalleArchivoOrdenCompra;
	protected JMenu jmenuDetalleAccionesOrdenCompra;
	protected JMenu jmenuDetalleDatosOrdenCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutOrdenCompra;	
	protected GridBagConstraints gridBagConstraintsOrdenCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected OrdenCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleOrdenCompra;		
	
	public OrdenCompraBeanSwingJInternalFrameTree jInternalFrameTreeOrdenCompra;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected EstadoOrdenCompraBeanSwingJInternalFrame estadoordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoordencompra="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordencompra="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public OrdenCompraSessionBean ordencompraSessionBean;
	
	

	public DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFrame=null;
	public DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleOrdenCompra=false;
	public DetalleOrdenCompraSessionBean detalleordencompraSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public EstadoOrdenCompraSessionBean estadoordencompraSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;	
	
	public OrdenCompraLogic ordencompraLogic;
	
	public JScrollPane jScrollPanelDatosOrdenCompra;
	public JScrollPane jScrollPanelDatosEdicionOrdenCompra;
	public JScrollPane jScrollPanelDatosGeneralOrdenCompra;
	
	protected JPanel jPanelCamposOrdenCompra;    
	protected JPanel jPanelCamposOcultosOrdenCompra;    	
	protected JPanel jPanelAccionesOrdenCompra;
	protected JPanel jPanelAccionesFormularioOrdenCompra;
    
	
	
	protected Integer iXPanelCamposOrdenCompra=0;
	protected Integer iYPanelCamposOrdenCompra=0;
	
	protected Integer iXPanelCamposOcultosOrdenCompra=0;
	protected Integer iYPanelCamposOcultosOrdenCompra=0;
	
	

	protected JPanel jPanelCamposFintotalOrdenCompra;
	protected Integer iXPanelCamposFintotalOrdenCompra=0;
	protected Integer iYPanelCamposFintotalOrdenCompra=0;

	protected JPanel jPanelCamposIniciogeneralOrdenCompra;
	protected Integer iXPanelCamposIniciogeneralOrdenCompra=0;
	protected Integer iYPanelCamposIniciogeneralOrdenCompra=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoOrdenCompra;
	public JButton jButtonModificarOrdenCompra;
	public JButton jButtonActualizarOrdenCompra;
    public JButton jButtonEliminarOrdenCompra;
	public JButton jButtonCancelarOrdenCompra;
    public JButton jButtonGuardarCambiosOrdenCompra;
	public JButton jButtonGuardarCambiosTablaOrdenCompra;
	protected JButton jButtonCerrarOrdenCompra;
	
	
	protected JButton jButtonProcesarInformacionOrdenCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoOrdenCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarOrdenCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeOrdenCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarOrdenCompra;
	protected JButton jButtonModificarToolBarOrdenCompra;
	protected JButton jButtonActualizarToolBarOrdenCompra;
    protected JButton jButtonEliminarToolBarOrdenCompra;
	protected JButton jButtonCancelarToolBarOrdenCompra;
    protected JButton jButtonGuardarCambiosToolBarOrdenCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarOrdenCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarOrdenCompra;
	protected JButton jButtonCerrarToolBarOrdenCompra;
	
	protected JButton jButtonProcesarInformacionToolBarOrdenCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoOrdenCompra;
	protected JMenuItem jMenuItemModificarOrdenCompra;
	protected JMenuItem jMenuItemActualizarOrdenCompra;
    protected JMenuItem jMenuItemEliminarOrdenCompra;
	protected JMenuItem jMenuItemCancelarOrdenCompra;
    protected JMenuItem jMenuItemGuardarCambiosOrdenCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaOrdenCompra;
	protected JMenuItem jMenuItemCerrarOrdenCompra;
	protected JMenuItem jMenuItemDetalleCerrarOrdenCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarOrdenCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionOrdenCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosOrdenCompra;
	protected JMenuItem jMenuItemMostrarOcultarOrdenCompra;
	
	
	//MENU
	
	protected JButton jButtonArbolOrdenCompra;	
	
	protected JLabel jLabelAccionesOrdenCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesOrdenCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesOrdenCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioOrdenCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidOrdenCompra;
	public JLabel jLabelIdOrdenCompra;
	public JLabel jLabelidOrdenCompra;
	public JButton jButtonidOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionOrdenCompra;
	public JLabel jLabelfecha_emisionOrdenCompra;
	//public JFormattedTextField jDateChooserfecha_emisionOrdenCompra;

	public JDateChooser jDateChooserfecha_emisionOrdenCompra;
	public JButton jButtonfecha_emisionOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaOrdenCompra;
	public JLabel jLabelfecha_entregaOrdenCompra;
	//public JFormattedTextField jDateChooserfecha_entregaOrdenCompra;

	public JDateChooser jDateChooserfecha_entregaOrdenCompra;
	public JButton jButtonfecha_entregaOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialOrdenCompra;
	public JLabel jLabelnumero_secuencialOrdenCompra;
	public JTextField jTextFieldnumero_secuencialOrdenCompra;
	public JButton jButtonnumero_secuencialOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionOrdenCompra;
	public JLabel jLabeldescripcionOrdenCompra;
	public JTextArea jTextAreadescripcionOrdenCompra;
	public JScrollPane jscrollPanedescripcionOrdenCompra;
	public JButton jButtondescripcionOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_descuentoOrdenCompra;
	public JLabel jLabelporcentaje_descuentoOrdenCompra;
	public JTextField jTextFieldporcentaje_descuentoOrdenCompra;
	public JButton jButtonporcentaje_descuentoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelsumanOrdenCompra;
	public JLabel jLabelsumanOrdenCompra;
	public JTextField jTextFieldsumanOrdenCompra;
	public JButton jButtonsumanOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPaneliceOrdenCompra;
	public JLabel jLabeliceOrdenCompra;
	public JTextField jTextFieldiceOrdenCompra;
	public JButton jButtoniceOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelvalor_descuentoOrdenCompra;
	public JLabel jLabelvalor_descuentoOrdenCompra;
	public JTextField jTextFieldvalor_descuentoOrdenCompra;
	public JButton jButtonvalor_descuentoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoOrdenCompra;
	public JLabel jLabeltotal_descuentoOrdenCompra;
	public JTextField jTextFieldtotal_descuentoOrdenCompra;
	public JButton jButtontotal_descuentoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelivaOrdenCompra;
	public JLabel jLabelivaOrdenCompra;
	public JTextField jTextFieldivaOrdenCompra;
	public JButton jButtonivaOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelstockOrdenCompra;
	public JLabel jLabelstockOrdenCompra;
	public JTextField jTextFieldstockOrdenCompra;
	public JButton jButtonstockOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalOrdenCompra;
	public JLabel jLabelsub_totalOrdenCompra;
	public JTextField jTextFieldsub_totalOrdenCompra;
	public JButton jButtonsub_totalOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPaneltotal_otroOrdenCompra;
	public JLabel jLabeltotal_otroOrdenCompra;
	public JTextField jTextFieldtotal_otroOrdenCompra;
	public JButton jButtontotal_otroOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelultimo_costoOrdenCompra;
	public JLabel jLabelultimo_costoOrdenCompra;
	public JTextField jTextFieldultimo_costoOrdenCompra;
	public JButton jButtonultimo_costoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_itemsOrdenCompra;
	public JLabel jLabelnumero_itemsOrdenCompra;
	public JTextField jTextFieldnumero_itemsOrdenCompra;
	public JButton jButtonnumero_itemsOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelretencionOrdenCompra;
	public JLabel jLabelretencionOrdenCompra;
	public JTextField jTextFieldretencionOrdenCompra;
	public JButton jButtonretencionOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPaneltotalOrdenCompra;
	public JLabel jLabeltotalOrdenCompra;
	public JTextField jTextFieldtotalOrdenCompra;
	public JButton jButtontotalOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelfleteOrdenCompra;
	public JLabel jLabelfleteOrdenCompra;
	public JTextField jTextFieldfleteOrdenCompra;
	public JButton jButtonfleteOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelimpuestoOrdenCompra;
	public JLabel jLabelimpuestoOrdenCompra;
	public JTextField jTextFieldimpuestoOrdenCompra;
	public JButton jButtonimpuestoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteOrdenCompra;
	public JLabel jLabelnumero_comprobanteOrdenCompra;
	public JTextField jTextFieldnumero_comprobanteOrdenCompra;
	public JButton jButtonnumero_comprobanteOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelfechaOrdenCompra;
	public JLabel jLabelfechaOrdenCompra;
	//public JFormattedTextField jDateChooserfechaOrdenCompra;

	public JDateChooser jDateChooserfechaOrdenCompra;
	public JButton jButtonfechaOrdenCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaOrdenCompra;
	public JLabel jLabelid_empresaOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaOrdenCompra;
	public JButton jButtonid_empresaOrdenCompra= new JButtonMe();
	public JButton jButtonid_empresaOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalOrdenCompra;
	public JLabel jLabelid_sucursalOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalOrdenCompra;
	public JButton jButtonid_sucursalOrdenCompra= new JButtonMe();
	public JButton jButtonid_sucursalOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloOrdenCompra;
	public JLabel jLabelid_moduloOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloOrdenCompra;
	public JButton jButtonid_moduloOrdenCompra= new JButtonMe();
	public JButton jButtonid_moduloOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_moduloOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioOrdenCompra;
	public JLabel jLabelid_ejercicioOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioOrdenCompra;
	public JButton jButtonid_ejercicioOrdenCompra= new JButtonMe();
	public JButton jButtonid_ejercicioOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoOrdenCompra;
	public JLabel jLabelid_periodoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoOrdenCompra;
	public JButton jButtonid_periodoOrdenCompra= new JButtonMe();
	public JButton jButtonid_periodoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_periodoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_anioOrdenCompra;
	public JLabel jLabelid_anioOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioOrdenCompra;
	public JButton jButtonid_anioOrdenCompra= new JButtonMe();
	public JButton jButtonid_anioOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_anioOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_mesOrdenCompra;
	public JLabel jLabelid_mesOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesOrdenCompra;
	public JButton jButtonid_mesOrdenCompra= new JButtonMe();
	public JButton jButtonid_mesOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_mesOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioOrdenCompra;
	public JLabel jLabelid_usuarioOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioOrdenCompra;
	public JButton jButtonid_usuarioOrdenCompra= new JButtonMe();
	public JButton jButtonid_usuarioOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_usuarioOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaOrdenCompra;
	public JLabel jLabelid_monedaOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaOrdenCompra;
	public JButton jButtonid_monedaOrdenCompra= new JButtonMe();
	public JButton jButtonid_monedaOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_monedaOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioOrdenCompra;
	public JLabel jLabelid_tipo_cambioOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioOrdenCompra;
	public JButton jButtonid_tipo_cambioOrdenCompra= new JButtonMe();
	public JButton jButtonid_tipo_cambioOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_orden_compraOrdenCompra;
	public JLabel jLabelid_estado_orden_compraOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_orden_compraOrdenCompra;
	public JButton jButtonid_estado_orden_compraOrdenCompra= new JButtonMe();
	public JButton jButtonid_estado_orden_compraOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_orden_compraOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteOrdenCompra;
	public JLabel jLabelid_clienteOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteOrdenCompra;
	public JButton jButtonid_clienteOrdenCompra= new JButtonMe();
	public JButton jButtonid_clienteOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_clienteOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoOrdenCompra;
	public JLabel jLabelid_formatoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoOrdenCompra;
	public JButton jButtonid_formatoOrdenCompra= new JButtonMe();
	public JButton jButtonid_formatoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_formatoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_transportistaOrdenCompra;
	public JLabel jLabelid_transportistaOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaOrdenCompra;
	public JButton jButtonid_transportistaOrdenCompra= new JButtonMe();
	public JButton jButtonid_transportistaOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_transportistaOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoOrdenCompra;
	public JLabel jLabelid_empleadoOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoOrdenCompra;
	public JButton jButtonid_empleadoOrdenCompra= new JButtonMe();
	public JButton jButtonid_empleadoOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloOrdenCompra;
	public JLabel jLabelid_tipo_transaccion_moduloOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloOrdenCompra;
	public JButton jButtonid_tipo_transaccion_moduloOrdenCompra= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloOrdenCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_orden_compraOrdenCompra;
	public JLabel jLabelid_orden_compraOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_compraOrdenCompra;
	public JButton jButtonid_orden_compraOrdenCompra= new JButtonMe();
	public JButton jButtonid_orden_compraOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_orden_compraOrdenCompraBusqueda= new JButtonMe();
	public JButton jButtonid_orden_compraOrdenCompraArbol= new JButtonMe();

	public JPanel jPanelid_asiento_contableOrdenCompra;
	public JLabel jLabelid_asiento_contableOrdenCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableOrdenCompra;
	public JButton jButtonid_asiento_contableOrdenCompra= new JButtonMe();
	public JButton jButtonid_asiento_contableOrdenCompraUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableOrdenCompraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesOrdenCompra;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1180;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=535;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public OrdenCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposOrdenCompra=new JPanel();
				this.jPanelAccionesFormularioOrdenCompra=new JPanel();
				this.jmenuBarDetalleOrdenCompra=new JMenuBar();
				this.jTtoolBarDetalleOrdenCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("OrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public OrdenCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("OrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("OrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("OrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("OrdenCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	public JButton getjButtonActualizarToolBarOrdenCompra() {
		return this.jButtonActualizarToolBarOrdenCompra;
	}
	
	public JButton getjButtonEliminarToolBarOrdenCompra() {
		return this.jButtonEliminarToolBarOrdenCompra;
	}
	
	public JButton getjButtonCancelarToolBarOrdenCompra() {
		return this.jButtonCancelarToolBarOrdenCompra;
	}		
	
	public JButton getjButtonProcesarInformacionOrdenCompra() {
		return this.jButtonProcesarInformacionOrdenCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionOrdenCompra)	{
		this.jButtonProcesarInformacionOrdenCompra = jButtonProcesarInformacionOrdenCompra;
	}
	
	
	public JButton getjButtonArbolOrdenCompra() {
		return this.jButtonArbolOrdenCompra;
	}
	
	public void setjButtonArbol(JButton jButtonArbolOrdenCompra)	{
		this.jButtonArbolOrdenCompra = jButtonArbolOrdenCompra;
	}
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesOrdenCompra() {
		return this.jComboBoxTiposAccionesOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesOrdenCompra(
			JComboBox jComboBoxTiposRelacionesOrdenCompra) {
		this.jComboBoxTiposRelacionesOrdenCompra = jComboBoxTiposRelacionesOrdenCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesOrdenCompra(
			JComboBox jComboBoxTiposAccionesOrdenCompra) {
		this.jComboBoxTiposAccionesOrdenCompra = jComboBoxTiposAccionesOrdenCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioOrdenCompra() {
		return this.jComboBoxTiposAccionesFormularioOrdenCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioOrdenCompra(
			JComboBox jComboBoxTiposAccionesFormularioOrdenCompra) {
		this.jComboBoxTiposAccionesFormularioOrdenCompra = jComboBoxTiposAccionesFormularioOrdenCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ordencompraSessionBean=new OrdenCompraSessionBean();
		
		this.ordencompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ordencompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ordencompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detalleordencompraSessionBean=new DetalleOrdenCompraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		OrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		OrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		OrdenCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"OrdenCompra MANTENIMIENTO"));
		
		
		if(iWidth > 2650) {
			iWidth=2650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ordencompraSessionBean.getEsGuardarRelacionado()) {
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
	
		OrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleOrdenCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarOrdenCompra=new JButtonMe();
				this.jButtonModificarToolBarOrdenCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"actualizar","actualizar","Actualizar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"eliminar","eliminar","Eliminar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"cancelar","cancelar","Cancelar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarOrdenCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarOrdenCompra,this.jTtoolBarDetalleOrdenCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleOrdenCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleOrdenCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoOrdenCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesOrdenCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosOrdenCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoOrdenCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoOrdenCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoOrdenCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarOrdenCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarOrdenCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarOrdenCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarOrdenCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarOrdenCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarOrdenCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarOrdenCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarOrdenCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarOrdenCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarOrdenCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarOrdenCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarOrdenCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosOrdenCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosOrdenCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosOrdenCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarOrdenCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarOrdenCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarOrdenCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarOrdenCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarOrdenCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarOrdenCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoOrdenCompra.add(this.jMenuItemDetalleCerrarOrdenCompra);
		
		this.jmenuDetalleAccionesOrdenCompra.add(this.jMenuItemActualizarOrdenCompra);
		this.jmenuDetalleAccionesOrdenCompra.add(this.jMenuItemEliminarOrdenCompra);
		this.jmenuDetalleAccionesOrdenCompra.add(this.jMenuItemCancelarOrdenCompra);		
		
		//this.jmenuDetalleDatosOrdenCompra.add(this.jMenuItemDetalleAbrirOrderByOrdenCompra);				
		this.jmenuDetalleDatosOrdenCompra.add(this.jMenuItemDetalleMostarOcultarOrdenCompra);				
				
		//this.jmenuDetalleAccionesOrdenCompra.add(this.jMenuItemGuardarCambiosOrdenCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleOrdenCompra.add(this.jmenuDetalleArchivoOrdenCompra);		
		this.jmenuBarDetalleOrdenCompra.add(this.jmenuDetalleAccionesOrdenCompra);		
		this.jmenuBarDetalleOrdenCompra.add(this.jmenuDetalleDatosOrdenCompra);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleOrdenCompra.add(this.jmenuDetalleOrdenCompra);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposOrdenCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdOrdenCompra = new JLabelMe();
		jLabelIdOrdenCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidOrdenCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutOrdenCompra= new GridBagLayout();

		this.jPanelidOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);

		jLabelidOrdenCompra = new JLabel();
		jLabelidOrdenCompra.setText("Id");

		jLabelidOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emisionOrdenCompra = new JLabelMe();
		this.jLabelfecha_emisionOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionOrdenCompra.setToolTipText("F Emision");
		this.jLabelfecha_emisionOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelfecha_emisionOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		//jFormattedTextFieldfecha_emisionOrdenCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionOrdenCompra= new JDateChooser();
		jDateChooserfecha_emisionOrdenCompra.setEnabled(false);
		jDateChooserfecha_emisionOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionOrdenCompra.setDate(new Date());
		jDateChooserfecha_emisionOrdenCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionOrdenCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionOrdenCompraBusqueda= new JButtonMe();
		this.jButtonfecha_emisionOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionOrdenCompraBusqueda.setText("U");
		this.jButtonfecha_emisionOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaOrdenCompra = new JLabelMe();
		this.jLabelfecha_entregaOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaOrdenCompra.setToolTipText("F Entrega");
		this.jLabelfecha_entregaOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelfecha_entregaOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		//jFormattedTextFieldfecha_entregaOrdenCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaOrdenCompra= new JDateChooser();
		jDateChooserfecha_entregaOrdenCompra.setEnabled(false);
		jDateChooserfecha_entregaOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaOrdenCompra.setDate(new Date());
		jDateChooserfecha_entregaOrdenCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaOrdenCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaOrdenCompraBusqueda= new JButtonMe();
		this.jButtonfecha_entregaOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaOrdenCompraBusqueda.setText("U");
		this.jButtonfecha_entregaOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_secuencialOrdenCompra = new JLabelMe();
		this.jLabelnumero_secuencialOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialOrdenCompra.setToolTipText("No Secuencial");
		this.jLabelnumero_secuencialOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelnumero_secuencialOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldnumero_secuencialOrdenCompra= new JTextFieldMe();

		jTextFieldnumero_secuencialOrdenCompra.setEnabled(false);
		jTextFieldnumero_secuencialOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_secuencialOrdenCompra.setEnabled(false);
		this.jButtonnumero_secuencialOrdenCompraBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialOrdenCompraBusqueda.setText("U");
		this.jButtonnumero_secuencialOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionOrdenCompra = new JLabelMe();
		this.jLabeldescripcionOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionOrdenCompra.setToolTipText("Descripcion");
		this.jLabeldescripcionOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPaneldescripcionOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextAreadescripcionOrdenCompra= new JTextAreaMe();
		jTextAreadescripcionOrdenCompra.setEnabled(false);
		jTextAreadescripcionOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionOrdenCompra.setLineWrap(true);
		jTextAreadescripcionOrdenCompra.setWrapStyleWord(true);
		jTextAreadescripcionOrdenCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionOrdenCompra.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionOrdenCompra = new JScrollPane(jTextAreadescripcionOrdenCompra);
		jscrollPanedescripcionOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionOrdenCompraBusqueda= new JButtonMe();
		this.jButtondescripcionOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionOrdenCompraBusqueda.setText("U");
		this.jButtondescripcionOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_descuentoOrdenCompra = new JLabelMe();
		this.jLabelporcentaje_descuentoOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_PORCENTAJEDESCUENTO+" : *");
		this.jLabelporcentaje_descuentoOrdenCompra.setToolTipText("Descuento %");
		this.jLabelporcentaje_descuentoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_descuentoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_descuentoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_descuentoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_descuentoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_descuentoOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_PORCENTAJEDESCUENTO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelporcentaje_descuentoOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldporcentaje_descuentoOrdenCompra= new JTextFieldMe();
		jTextFieldporcentaje_descuentoOrdenCompra.setEnabled(false);
		jTextFieldporcentaje_descuentoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_descuentoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_descuentoOrdenCompra.setText("0.0");

		this.jButtonporcentaje_descuentoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonporcentaje_descuentoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_descuentoOrdenCompraBusqueda.setText("U");
		this.jButtonporcentaje_descuentoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_descuentoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_descuentoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_descuentoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_descuentoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_descuentoOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_descuentoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelsumanOrdenCompra = new JLabelMe();
		this.jLabelsumanOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_SUMAN+" : *");
		this.jLabelsumanOrdenCompra.setToolTipText("Suman");
		this.jLabelsumanOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsumanOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsumanOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsumanOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_SUMAN);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelsumanOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldsumanOrdenCompra= new JTextFieldMe();
		jTextFieldsumanOrdenCompra.setEnabled(false);
		jTextFieldsumanOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsumanOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsumanOrdenCompra.setText("0.0");

		this.jButtonsumanOrdenCompraBusqueda= new JButtonMe();
		this.jButtonsumanOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsumanOrdenCompraBusqueda.setText("U");
		this.jButtonsumanOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsumanOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsumanOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsumanOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsumanOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sumanOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsumanOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabeliceOrdenCompra = new JLabelMe();
		this.jLabeliceOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceOrdenCompra.setToolTipText("Ice");
		this.jLabeliceOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPaneliceOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldiceOrdenCompra= new JTextFieldMe();
		jTextFieldiceOrdenCompra.setEnabled(false);
		jTextFieldiceOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceOrdenCompra.setText("0.0");

		this.jButtoniceOrdenCompraBusqueda= new JButtonMe();
		this.jButtoniceOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceOrdenCompraBusqueda.setText("U");
		this.jButtoniceOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelvalor_descuentoOrdenCompra = new JLabelMe();
		this.jLabelvalor_descuentoOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_VALORDESCUENTO+" : *");
		this.jLabelvalor_descuentoOrdenCompra.setToolTipText("Descuento Valor");
		this.jLabelvalor_descuentoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_descuentoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_descuentoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_descuentoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_descuentoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_descuentoOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_VALORDESCUENTO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelvalor_descuentoOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldvalor_descuentoOrdenCompra= new JTextFieldMe();
		jTextFieldvalor_descuentoOrdenCompra.setEnabled(false);
		jTextFieldvalor_descuentoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_descuentoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_descuentoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_descuentoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_descuentoOrdenCompra.setText("0.0");

		this.jButtonvalor_descuentoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonvalor_descuentoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_descuentoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_descuentoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_descuentoOrdenCompraBusqueda.setText("U");
		this.jButtonvalor_descuentoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_descuentoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_descuentoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_descuentoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_descuentoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_descuentoOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_descuentoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoOrdenCompra = new JLabelMe();
		this.jLabeltotal_descuentoOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoOrdenCompra.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPaneltotal_descuentoOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldtotal_descuentoOrdenCompra= new JTextFieldMe();
		jTextFieldtotal_descuentoOrdenCompra.setEnabled(false);
		jTextFieldtotal_descuentoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoOrdenCompra.setText("0.0");

		this.jButtontotal_descuentoOrdenCompraBusqueda= new JButtonMe();
		this.jButtontotal_descuentoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoOrdenCompraBusqueda.setText("U");
		this.jButtontotal_descuentoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelivaOrdenCompra = new JLabelMe();
		this.jLabelivaOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaOrdenCompra.setToolTipText("Iva");
		this.jLabelivaOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelivaOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldivaOrdenCompra= new JTextFieldMe();
		jTextFieldivaOrdenCompra.setEnabled(false);
		jTextFieldivaOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaOrdenCompra.setText("0.0");

		this.jButtonivaOrdenCompraBusqueda= new JButtonMe();
		this.jButtonivaOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaOrdenCompraBusqueda.setText("U");
		this.jButtonivaOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelstockOrdenCompra = new JLabelMe();
		this.jLabelstockOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_STOCK+" : *");
		this.jLabelstockOrdenCompra.setToolTipText("Stock");
		this.jLabelstockOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstockOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstockOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelstockOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelstockOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelstockOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_STOCK);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelstockOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldstockOrdenCompra= new JTextFieldMe();
		jTextFieldstockOrdenCompra.setEnabled(false);
		jTextFieldstockOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstockOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstockOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldstockOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldstockOrdenCompra.setText("0.0");

		this.jButtonstockOrdenCompraBusqueda= new JButtonMe();
		this.jButtonstockOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstockOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstockOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonstockOrdenCompraBusqueda.setText("U");
		this.jButtonstockOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonstockOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonstockOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldstockOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldstockOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"stockOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonstockOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalOrdenCompra = new JLabelMe();
		this.jLabelsub_totalOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalOrdenCompra.setToolTipText("Sub Total");
		this.jLabelsub_totalOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelsub_totalOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldsub_totalOrdenCompra= new JTextFieldMe();
		jTextFieldsub_totalOrdenCompra.setEnabled(false);
		jTextFieldsub_totalOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalOrdenCompra.setText("0.0");

		this.jButtonsub_totalOrdenCompraBusqueda= new JButtonMe();
		this.jButtonsub_totalOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalOrdenCompraBusqueda.setText("U");
		this.jButtonsub_totalOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabeltotal_otroOrdenCompra = new JLabelMe();
		this.jLabeltotal_otroOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_TOTALOTRO+" : *");
		this.jLabeltotal_otroOrdenCompra.setToolTipText("Total Otro");
		this.jLabeltotal_otroOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_otroOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_otroOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_otroOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_TOTALOTRO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPaneltotal_otroOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldtotal_otroOrdenCompra= new JTextFieldMe();
		jTextFieldtotal_otroOrdenCompra.setEnabled(false);
		jTextFieldtotal_otroOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_otroOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_otroOrdenCompra.setText("0.0");

		this.jButtontotal_otroOrdenCompraBusqueda= new JButtonMe();
		this.jButtontotal_otroOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_otroOrdenCompraBusqueda.setText("U");
		this.jButtontotal_otroOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_otroOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_otroOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_otroOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_otroOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_otroOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_otroOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelultimo_costoOrdenCompra = new JLabelMe();
		this.jLabelultimo_costoOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_ULTIMOCOSTO+" : *");
		this.jLabelultimo_costoOrdenCompra.setToolTipText("Ultimo Costo");
		this.jLabelultimo_costoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelultimo_costoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelultimo_costoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelultimo_costoOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_ULTIMOCOSTO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelultimo_costoOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldultimo_costoOrdenCompra= new JTextFieldMe();
		jTextFieldultimo_costoOrdenCompra.setEnabled(false);
		jTextFieldultimo_costoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldultimo_costoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldultimo_costoOrdenCompra.setText("0.0");

		this.jButtonultimo_costoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonultimo_costoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonultimo_costoOrdenCompraBusqueda.setText("U");
		this.jButtonultimo_costoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonultimo_costoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonultimo_costoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldultimo_costoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldultimo_costoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ultimo_costoOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonultimo_costoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_itemsOrdenCompra = new JLabelMe();
		this.jLabelnumero_itemsOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_NUMEROITEMS+" : *");
		this.jLabelnumero_itemsOrdenCompra.setToolTipText("No Items");
		this.jLabelnumero_itemsOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_itemsOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_itemsOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_itemsOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_itemsOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_itemsOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_NUMEROITEMS);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelnumero_itemsOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldnumero_itemsOrdenCompra= new JTextFieldMe();
		jTextFieldnumero_itemsOrdenCompra.setEnabled(false);
		jTextFieldnumero_itemsOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_itemsOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_itemsOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_itemsOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_itemsOrdenCompra.setText("0.0");

		this.jButtonnumero_itemsOrdenCompraBusqueda= new JButtonMe();
		this.jButtonnumero_itemsOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_itemsOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_itemsOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_itemsOrdenCompraBusqueda.setText("U");
		this.jButtonnumero_itemsOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_itemsOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_itemsOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_itemsOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_itemsOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_itemsOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_itemsOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelretencionOrdenCompra = new JLabelMe();
		this.jLabelretencionOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_RETENCION+" : *");
		this.jLabelretencionOrdenCompra.setToolTipText("Retencion");
		this.jLabelretencionOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelretencionOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelretencionOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelretencionOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_RETENCION);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelretencionOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldretencionOrdenCompra= new JTextFieldMe();
		jTextFieldretencionOrdenCompra.setEnabled(false);
		jTextFieldretencionOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldretencionOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldretencionOrdenCompra.setText("0.0");

		this.jButtonretencionOrdenCompraBusqueda= new JButtonMe();
		this.jButtonretencionOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonretencionOrdenCompraBusqueda.setText("U");
		this.jButtonretencionOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonretencionOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonretencionOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldretencionOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldretencionOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"retencionOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonretencionOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabeltotalOrdenCompra = new JLabelMe();
		this.jLabeltotalOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalOrdenCompra.setToolTipText("Total");
		this.jLabeltotalOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPaneltotalOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldtotalOrdenCompra= new JTextFieldMe();
		jTextFieldtotalOrdenCompra.setEnabled(false);
		jTextFieldtotalOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalOrdenCompra.setText("0.0");

		this.jButtontotalOrdenCompraBusqueda= new JButtonMe();
		this.jButtontotalOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalOrdenCompraBusqueda.setText("U");
		this.jButtontotalOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelfleteOrdenCompra = new JLabelMe();
		this.jLabelfleteOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteOrdenCompra.setToolTipText("Flete");
		this.jLabelfleteOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelfleteOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldfleteOrdenCompra= new JTextFieldMe();
		jTextFieldfleteOrdenCompra.setEnabled(false);
		jTextFieldfleteOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteOrdenCompra.setText("0.0");

		this.jButtonfleteOrdenCompraBusqueda= new JButtonMe();
		this.jButtonfleteOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteOrdenCompraBusqueda.setText("U");
		this.jButtonfleteOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelimpuestoOrdenCompra = new JLabelMe();
		this.jLabelimpuestoOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IMPUESTO+" : *");
		this.jLabelimpuestoOrdenCompra.setToolTipText("Impuesto");
		this.jLabelimpuestoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuestoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuestoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuestoOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IMPUESTO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelimpuestoOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldimpuestoOrdenCompra= new JTextFieldMe();
		jTextFieldimpuestoOrdenCompra.setEnabled(false);
		jTextFieldimpuestoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuestoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuestoOrdenCompra.setText("0.0");

		this.jButtonimpuestoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonimpuestoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuestoOrdenCompraBusqueda.setText("U");
		this.jButtonimpuestoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuestoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuestoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuestoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuestoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuestoOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuestoOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteOrdenCompra = new JLabelMe();
		this.jLabelnumero_comprobanteOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" :");
		this.jLabelnumero_comprobanteOrdenCompra.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelnumero_comprobanteOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jTextFieldnumero_comprobanteOrdenCompra= new JTextFieldMe();

		jTextFieldnumero_comprobanteOrdenCompra.setEnabled(false);
		jTextFieldnumero_comprobanteOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteOrdenCompraBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteOrdenCompraBusqueda.setText("U");
		this.jButtonnumero_comprobanteOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteOrdenCompraBusqueda.setVisible(false);		}


					
		this.jLabelfechaOrdenCompra = new JLabelMe();
		this.jLabelfechaOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaOrdenCompra.setToolTipText("Fecha");
		this.jLabelfechaOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelfechaOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		//jFormattedTextFieldfechaOrdenCompra= new JFormattedTextFieldMe();

		jDateChooserfechaOrdenCompra= new JDateChooser();
		jDateChooserfechaOrdenCompra.setEnabled(false);
		jDateChooserfechaOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaOrdenCompra.setDate(new Date());
		jDateChooserfechaOrdenCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaOrdenCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaOrdenCompraBusqueda= new JButtonMe();
		this.jButtonfechaOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaOrdenCompraBusqueda.setText("U");
		this.jButtonfechaOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaOrdenCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysOrdenCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaOrdenCompra = new JLabelMe();
		this.jLabelid_empresaOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaOrdenCompra.setToolTipText("Empresa");
		this.jLabelid_empresaOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_empresaOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_empresaOrdenCompra= new JComboBoxMe();
		jComboBoxid_empresaOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaOrdenCompra.setEnabled(false);

		this.jButtonid_empresaOrdenCompra= new JButtonMe();
		this.jButtonid_empresaOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaOrdenCompra.setText("Buscar");
		this.jButtonid_empresaOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaOrdenCompra"));

		this.jButtonid_empresaOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaOrdenCompraBusqueda.setText("U");
		this.jButtonid_empresaOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_empresaOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaOrdenCompraUpdate.setText("U");
		this.jButtonid_empresaOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaOrdenCompraUpdate"));



					
		this.jLabelid_sucursalOrdenCompra = new JLabelMe();
		this.jLabelid_sucursalOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalOrdenCompra.setToolTipText("Sucursal");
		this.jLabelid_sucursalOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_sucursalOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_sucursalOrdenCompra= new JComboBoxMe();
		jComboBoxid_sucursalOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalOrdenCompra.setEnabled(false);

		this.jButtonid_sucursalOrdenCompra= new JButtonMe();
		this.jButtonid_sucursalOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalOrdenCompra.setText("Buscar");
		this.jButtonid_sucursalOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalOrdenCompra"));

		this.jButtonid_sucursalOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_sucursalOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalOrdenCompraBusqueda.setText("U");
		this.jButtonid_sucursalOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_sucursalOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalOrdenCompraUpdate.setText("U");
		this.jButtonid_sucursalOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalOrdenCompraUpdate"));



					
		this.jLabelid_moduloOrdenCompra = new JLabelMe();
		this.jLabelid_moduloOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloOrdenCompra.setToolTipText("Modulo");
		this.jLabelid_moduloOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_moduloOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_moduloOrdenCompra= new JComboBoxMe();
		jComboBoxid_moduloOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloOrdenCompra.setEnabled(false);

		this.jButtonid_moduloOrdenCompra= new JButtonMe();
		this.jButtonid_moduloOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloOrdenCompra.setText("Buscar");
		this.jButtonid_moduloOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloOrdenCompra"));

		this.jButtonid_moduloOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_moduloOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloOrdenCompraBusqueda.setText("U");
		this.jButtonid_moduloOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_moduloOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_moduloOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloOrdenCompraUpdate.setText("U");
		this.jButtonid_moduloOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloOrdenCompraUpdate"));



					
		this.jLabelid_ejercicioOrdenCompra = new JLabelMe();
		this.jLabelid_ejercicioOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioOrdenCompra.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_ejercicioOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_ejercicioOrdenCompra= new JComboBoxMe();
		jComboBoxid_ejercicioOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioOrdenCompra.setEnabled(false);

		this.jButtonid_ejercicioOrdenCompra= new JButtonMe();
		this.jButtonid_ejercicioOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioOrdenCompra.setText("Buscar");
		this.jButtonid_ejercicioOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioOrdenCompra"));

		this.jButtonid_ejercicioOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_ejercicioOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioOrdenCompraBusqueda.setText("U");
		this.jButtonid_ejercicioOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_ejercicioOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioOrdenCompraUpdate.setText("U");
		this.jButtonid_ejercicioOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioOrdenCompraUpdate"));



					
		this.jLabelid_periodoOrdenCompra = new JLabelMe();
		this.jLabelid_periodoOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoOrdenCompra.setToolTipText("Periodo");
		this.jLabelid_periodoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_periodoOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_periodoOrdenCompra= new JComboBoxMe();
		jComboBoxid_periodoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoOrdenCompra.setEnabled(false);

		this.jButtonid_periodoOrdenCompra= new JButtonMe();
		this.jButtonid_periodoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoOrdenCompra.setText("Buscar");
		this.jButtonid_periodoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoOrdenCompra"));

		this.jButtonid_periodoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_periodoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoOrdenCompraBusqueda.setText("U");
		this.jButtonid_periodoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_periodoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_periodoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoOrdenCompraUpdate.setText("U");
		this.jButtonid_periodoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoOrdenCompraUpdate"));



					
		this.jLabelid_anioOrdenCompra = new JLabelMe();
		this.jLabelid_anioOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioOrdenCompra.setToolTipText("Anio");
		this.jLabelid_anioOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_anioOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_anioOrdenCompra= new JComboBoxMe();
		jComboBoxid_anioOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioOrdenCompra.setEnabled(false);

		this.jButtonid_anioOrdenCompra= new JButtonMe();
		this.jButtonid_anioOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioOrdenCompra.setText("Buscar");
		this.jButtonid_anioOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioOrdenCompra"));

		this.jButtonid_anioOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_anioOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioOrdenCompraBusqueda.setText("U");
		this.jButtonid_anioOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_anioOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_anioOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioOrdenCompraUpdate.setText("U");
		this.jButtonid_anioOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioOrdenCompraUpdate"));



					
		this.jLabelid_mesOrdenCompra = new JLabelMe();
		this.jLabelid_mesOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesOrdenCompra.setToolTipText("Mes");
		this.jLabelid_mesOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_mesOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_mesOrdenCompra= new JComboBoxMe();
		jComboBoxid_mesOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesOrdenCompra.setEnabled(false);

		this.jButtonid_mesOrdenCompra= new JButtonMe();
		this.jButtonid_mesOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesOrdenCompra.setText("Buscar");
		this.jButtonid_mesOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesOrdenCompra"));

		this.jButtonid_mesOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_mesOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesOrdenCompraBusqueda.setText("U");
		this.jButtonid_mesOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_mesOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_mesOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesOrdenCompraUpdate.setText("U");
		this.jButtonid_mesOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesOrdenCompraUpdate"));



					
		this.jLabelid_usuarioOrdenCompra = new JLabelMe();
		this.jLabelid_usuarioOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioOrdenCompra.setToolTipText("Usuario");
		this.jLabelid_usuarioOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_usuarioOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_usuarioOrdenCompra= new JComboBoxMe();
		jComboBoxid_usuarioOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioOrdenCompra.setEnabled(false);

		this.jButtonid_usuarioOrdenCompra= new JButtonMe();
		this.jButtonid_usuarioOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioOrdenCompra.setText("Buscar");
		this.jButtonid_usuarioOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioOrdenCompra"));

		this.jButtonid_usuarioOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_usuarioOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioOrdenCompraBusqueda.setText("U");
		this.jButtonid_usuarioOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_usuarioOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_usuarioOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioOrdenCompraUpdate.setText("U");
		this.jButtonid_usuarioOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioOrdenCompraUpdate"));



					
		this.jLabelid_monedaOrdenCompra = new JLabelMe();
		this.jLabelid_monedaOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaOrdenCompra.setToolTipText("Moneda");
		this.jLabelid_monedaOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_monedaOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_monedaOrdenCompra= new JComboBoxMe();
		jComboBoxid_monedaOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaOrdenCompra= new JButtonMe();
		this.jButtonid_monedaOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaOrdenCompra.setText("Buscar");
		this.jButtonid_monedaOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaOrdenCompra"));

		this.jButtonid_monedaOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_monedaOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaOrdenCompraBusqueda.setText("U");
		this.jButtonid_monedaOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_monedaOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_monedaOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaOrdenCompraUpdate.setText("U");
		this.jButtonid_monedaOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaOrdenCompraUpdate"));



					
		this.jLabelid_tipo_cambioOrdenCompra = new JLabelMe();
		this.jLabelid_tipo_cambioOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDTIPOCAMBIO+" :");
		this.jLabelid_tipo_cambioOrdenCompra.setToolTipText("T Cambio");
		this.jLabelid_tipo_cambioOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_tipo_cambioOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_tipo_cambioOrdenCompra= new JComboBoxMe();
		jComboBoxid_tipo_cambioOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cambioOrdenCompra= new JButtonMe();
		this.jButtonid_tipo_cambioOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioOrdenCompra.setText("Buscar");
		this.jButtonid_tipo_cambioOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioOrdenCompra"));

		this.jButtonid_tipo_cambioOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioOrdenCompraBusqueda.setText("U");
		this.jButtonid_tipo_cambioOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioOrdenCompraUpdate.setText("U");
		this.jButtonid_tipo_cambioOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioOrdenCompraUpdate"));



					
		this.jLabelid_estado_orden_compraOrdenCompra = new JLabelMe();
		this.jLabelid_estado_orden_compraOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDESTADOORDENCOMPRA+" : *");
		this.jLabelid_estado_orden_compraOrdenCompra.setToolTipText("Estado");
		this.jLabelid_estado_orden_compraOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_orden_compraOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_orden_compraOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_orden_compraOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_orden_compraOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_orden_compraOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDESTADOORDENCOMPRA);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_estado_orden_compraOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_estado_orden_compraOrdenCompra= new JComboBoxMe();
		jComboBoxid_estado_orden_compraOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_orden_compraOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_orden_compraOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_orden_compraOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_orden_compraOrdenCompra.setEnabled(false);

		this.jButtonid_estado_orden_compraOrdenCompra= new JButtonMe();
		this.jButtonid_estado_orden_compraOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_orden_compraOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_orden_compraOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_orden_compraOrdenCompra.setText("Buscar");
		this.jButtonid_estado_orden_compraOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_orden_compraOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_orden_compraOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_orden_compraOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_orden_compraOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_orden_compraOrdenCompra"));

		this.jButtonid_estado_orden_compraOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_estado_orden_compraOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_orden_compraOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_orden_compraOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_orden_compraOrdenCompraBusqueda.setText("U");
		this.jButtonid_estado_orden_compraOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_orden_compraOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_orden_compraOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_orden_compraOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_orden_compraOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_orden_compraOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_orden_compraOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_estado_orden_compraOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_estado_orden_compraOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_orden_compraOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_orden_compraOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_orden_compraOrdenCompraUpdate.setText("U");
		this.jButtonid_estado_orden_compraOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_orden_compraOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_orden_compraOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_orden_compraOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_orden_compraOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_orden_compraOrdenCompraUpdate"));



					
		this.jLabelid_clienteOrdenCompra = new JLabelMe();
		this.jLabelid_clienteOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteOrdenCompra.setToolTipText("Cliente");
		this.jLabelid_clienteOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_clienteOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_clienteOrdenCompra= new JComboBoxMe();
		jComboBoxid_clienteOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteOrdenCompra= new JButtonMe();
		this.jButtonid_clienteOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteOrdenCompra.setText("Buscar");
		this.jButtonid_clienteOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteOrdenCompra"));

		this.jButtonid_clienteOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_clienteOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteOrdenCompraBusqueda.setText("U");
		this.jButtonid_clienteOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_clienteOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_clienteOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteOrdenCompraUpdate.setText("U");
		this.jButtonid_clienteOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteOrdenCompraUpdate"));



					
		this.jLabelid_formatoOrdenCompra = new JLabelMe();
		this.jLabelid_formatoOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoOrdenCompra.setToolTipText("Formato");
		this.jLabelid_formatoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_formatoOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_formatoOrdenCompra= new JComboBoxMe();
		jComboBoxid_formatoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoOrdenCompra= new JButtonMe();
		this.jButtonid_formatoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoOrdenCompra.setText("Buscar");
		this.jButtonid_formatoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoOrdenCompra"));

		this.jButtonid_formatoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_formatoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoOrdenCompraBusqueda.setText("U");
		this.jButtonid_formatoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_formatoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_formatoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoOrdenCompraUpdate.setText("U");
		this.jButtonid_formatoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoOrdenCompraUpdate"));



					
		this.jLabelid_transportistaOrdenCompra = new JLabelMe();
		this.jLabelid_transportistaOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDTRANSPORTISTA+" :");
		this.jLabelid_transportistaOrdenCompra.setToolTipText("Transportista");
		this.jLabelid_transportistaOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportistaOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportistaOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDTRANSPORTISTA);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_transportistaOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_transportistaOrdenCompra= new JComboBoxMe();
		jComboBoxid_transportistaOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transportistaOrdenCompra= new JButtonMe();
		this.jButtonid_transportistaOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaOrdenCompra.setText("Buscar");
		this.jButtonid_transportistaOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportistaOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportistaOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaOrdenCompra"));

		this.jButtonid_transportistaOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_transportistaOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaOrdenCompraBusqueda.setText("U");
		this.jButtonid_transportistaOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportistaOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportistaOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportistaOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_transportistaOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_transportistaOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaOrdenCompraUpdate.setText("U");
		this.jButtonid_transportistaOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportistaOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportistaOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaOrdenCompraUpdate"));



					
		this.jLabelid_empleadoOrdenCompra = new JLabelMe();
		this.jLabelid_empleadoOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoOrdenCompra.setToolTipText("Empleado");
		this.jLabelid_empleadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_empleadoOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_empleadoOrdenCompra= new JComboBoxMe();
		jComboBoxid_empleadoOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoOrdenCompra= new JButtonMe();
		this.jButtonid_empleadoOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoOrdenCompra.setText("Buscar");
		this.jButtonid_empleadoOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoOrdenCompra"));

		this.jButtonid_empleadoOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_empleadoOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoOrdenCompraBusqueda.setText("U");
		this.jButtonid_empleadoOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_empleadoOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_empleadoOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoOrdenCompraUpdate.setText("U");
		this.jButtonid_empleadoOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoOrdenCompraUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloOrdenCompra = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloOrdenCompra.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_tipo_transaccion_moduloOrdenCompra= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloOrdenCompra.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloOrdenCompra= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloOrdenCompra.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloOrdenCompra"));

		this.jButtonid_tipo_transaccion_moduloOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloOrdenCompraBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloOrdenCompraUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloOrdenCompraUpdate"));



					
		this.jLabelid_orden_compraOrdenCompra = new JLabelMe();
		this.jLabelid_orden_compraOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDORDENCOMPRA+" : *");
		this.jLabelid_orden_compraOrdenCompra.setToolTipText("Orden Compra");
		this.jLabelid_orden_compraOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_orden_compraOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_orden_compraOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_orden_compraOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_orden_compraOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_orden_compraOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDORDENCOMPRA);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_orden_compraOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_orden_compraOrdenCompra= new JComboBoxMe();
		jComboBoxid_orden_compraOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_compraOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_orden_compraOrdenCompra.setEnabled(false);

		this.jButtonid_orden_compraOrdenCompra= new JButtonMe();
		this.jButtonid_orden_compraOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraOrdenCompra.setText("Buscar");
		this.jButtonid_orden_compraOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_orden_compraOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_orden_compraOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraOrdenCompra"));

		this.jButtonid_orden_compraOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_orden_compraOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_compraOrdenCompraBusqueda.setText("U");
		this.jButtonid_orden_compraOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_orden_compraOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_orden_compraOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_orden_compraOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_orden_compraOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_orden_compraOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_compraOrdenCompraUpdate.setText("U");
		this.jButtonid_orden_compraOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_orden_compraOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_orden_compraOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraOrdenCompraUpdate"));


		jButtonid_orden_compraOrdenCompraArbol= new JButtonMe();
		jButtonid_orden_compraOrdenCompraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraOrdenCompraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraOrdenCompraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraOrdenCompraArbol.setText("Arbol");
		jButtonid_orden_compraOrdenCompraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_orden_compraOrdenCompraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraOrdenCompraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_orden_compraOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraOrdenCompraArbol"));



					
		this.jLabelid_asiento_contableOrdenCompra = new JLabelMe();
		this.jLabelid_asiento_contableOrdenCompra.setText(""+OrdenCompraConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableOrdenCompra.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableOrdenCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableOrdenCompra.setToolTipText(OrdenCompraConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutOrdenCompra = new GridBagLayout();
		this.jPanelid_asiento_contableOrdenCompra.setLayout(this.gridaBagLayoutOrdenCompra);


		jComboBoxid_asiento_contableOrdenCompra= new JComboBoxMe();
		jComboBoxid_asiento_contableOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_asiento_contableOrdenCompra.setEnabled(false);

		this.jButtonid_asiento_contableOrdenCompra= new JButtonMe();
		this.jButtonid_asiento_contableOrdenCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableOrdenCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableOrdenCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableOrdenCompra.setText("Buscar");
		this.jButtonid_asiento_contableOrdenCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableOrdenCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableOrdenCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableOrdenCompra"));

		this.jButtonid_asiento_contableOrdenCompraBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableOrdenCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableOrdenCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableOrdenCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableOrdenCompraBusqueda.setText("U");
		this.jButtonid_asiento_contableOrdenCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableOrdenCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableOrdenCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableOrdenCompraBusqueda"));

		if(this.ordencompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableOrdenCompraBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableOrdenCompraUpdate= new JButtonMe();
		this.jButtonid_asiento_contableOrdenCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableOrdenCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableOrdenCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableOrdenCompraUpdate.setText("U");
		this.jButtonid_asiento_contableOrdenCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableOrdenCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableOrdenCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableOrdenCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableOrdenCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableOrdenCompraUpdate"));



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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleOrdenCompra = new OrdenCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("OrdenCompra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutOrdenCompra= new GridBagLayout();
		

		
		String sToolTipOrdenCompra="";
		sToolTipOrdenCompra=OrdenCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipOrdenCompra+="(Inventario.OrdenCompra)";
		}
		
		if(!this.ordencompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipOrdenCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoOrdenCompra = new JButtonMe();
		this.jButtonModificarOrdenCompra = new JButtonMe();
        this.jButtonActualizarOrdenCompra = new JButtonMe();
        this.jButtonEliminarOrdenCompra = new JButtonMe();
        this.jButtonCancelarOrdenCompra = new JButtonMe();
        this.jButtonGuardarCambiosOrdenCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaOrdenCompra = new JButtonMe();
		this.jButtonCerrarOrdenCompra = new JButtonMe();
		
		this.jScrollPanelDatosOrdenCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionOrdenCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralOrdenCompra = new JScrollPane();
				
		
		
		this.jPanelCamposOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneralOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: OrdenCompra";
		
		if(!this.ordencompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos OrdenCompras" + this.sPath));
		} else {
			this.jScrollPanelDatosOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposOrdenCompra.setName("jPanelCamposOrdenCompra"); 

		this.jPanelCamposOcultosOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosOrdenCompra.setName("jPanelCamposOcultosOrdenCompra"); 

        this.jPanelAccionesOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesOrdenCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioOrdenCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioOrdenCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioOrdenCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalOrdenCompra.setName("jPanelCamposFintotalOrdenCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposIniciogeneralOrdenCompra.setName("jPanelCamposFingeneralOrdenCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoOrdenCompra.setText("Nuevo");
		this.jButtonModificarOrdenCompra.setText("Editar");
        this.jButtonActualizarOrdenCompra.setText("Actualizar");
        this.jButtonEliminarOrdenCompra.setText("Eliminar");
        this.jButtonCancelarOrdenCompra.setText("Cancelar");
        this.jButtonGuardarCambiosOrdenCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaOrdenCompra.setText("Guardar");
		this.jButtonCerrarOrdenCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoOrdenCompra,"nuevo_button","Nuevo",this.ordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarOrdenCompra,"modificar_button","Editar",this.ordencompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarOrdenCompra,"actualizar_button","Actualizar",this.ordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarOrdenCompra,"eliminar_button","Eliminar",this.ordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarOrdenCompra,"cancelar_button","Cancelar",this.ordencompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosOrdenCompra,"guardarcambios_button","Guardar",this.ordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaOrdenCompra,"guardarcambiostabla_button","Guardar",this.ordencompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrdenCompra,"cerrar_button","Salir",this.ordencompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoOrdenCompra.setToolTipText("Nuevo"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarOrdenCompra.setToolTipText("Editar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarOrdenCompra.setToolTipText("Actualizar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarOrdenCompra.setToolTipText("Eliminar)"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarOrdenCompra.setToolTipText("Cancelar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosOrdenCompra.setToolTipText("Guardar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaOrdenCompra.setToolTipText("Guardar"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarOrdenCompra.setToolTipText("Salir"+" "+OrdenCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoOrdenCompra";
		inputMap = this.jButtonNuevoOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoOrdenCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoOrdenCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarOrdenCompra";
		inputMap = this.jButtonActualizarOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarOrdenCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarOrdenCompra";
		inputMap = this.jButtonEliminarOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarOrdenCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarOrdenCompra";
		inputMap = this.jButtonCancelarOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarOrdenCompra"));
		
		//CERRAR		
		sMapKey = "CerrarOrdenCompra";
		inputMap = this.jButtonCerrarOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarOrdenCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaOrdenCompra";
		inputMap = this.jButtonGuardarCambiosTablaOrdenCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaOrdenCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaOrdenCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoOrdenCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoOrdenCompra.setToolTipText("Nuevo OrdenCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarOrdenCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarOrdenCompra.setToolTipText("Sin Cerrar Ventana OrdenCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeOrdenCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeOrdenCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeOrdenCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
		this.jButtonArbolOrdenCompra = new JButtonMe();
		this.jButtonArbolOrdenCompra.setText("Arbol");		
		this.jButtonArbolOrdenCompra.setToolTipText("Buscar Por Arbol");
				
		
			
			
		this.jComboBoxTiposAccionesOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesOrdenCompra.setText("Accion");
		this.jComboBoxTiposAccionesOrdenCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioOrdenCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioOrdenCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioOrdenCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesOrdenCompra = new JLabelMe();
		
		this.jLabelAccionesOrdenCompra.setText("Acciones");		
		this.jLabelAccionesOrdenCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOrdenCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOrdenCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposOrdenCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysOrdenCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesOrdenCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesOrdenCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesOrdenCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		this.jButtonArbolOrdenCompra.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolOrdenCompra.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolOrdenCompra.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposAccionesOrdenCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOrdenCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOrdenCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesOrdenCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioOrdenCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioOrdenCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioOrdenCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioOrdenCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposOrdenCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosOrdenCompra = new GridBagLayout();
		
		this.jPanelCamposOrdenCompra.setLayout(gridaBagLayoutCamposOrdenCompra);
		this.jPanelCamposOcultosOrdenCompra.setLayout(gridaBagLayoutCamposOcultosOrdenCompra);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalOrdenCompra= new GridBagLayout();
		this.jPanelCamposFintotalOrdenCompra.setLayout(gridaBagLayoutCamposFintotalOrdenCompra);

		GridBagLayout gridaBagLayoutCamposIniciogeneralOrdenCompra= new GridBagLayout();
		this.jPanelCamposIniciogeneralOrdenCompra.setLayout(gridaBagLayoutCamposIniciogeneralOrdenCompra);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidOrdenCompra.add(jLabelIdOrdenCompra, this.gridBagConstraintsOrdenCompra);



	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidOrdenCompra.add(jLabelidOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaOrdenCompra.add(jLabelid_empresaOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaOrdenCompra.add(jButtonid_empresaOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaOrdenCompra.add(jButtonid_empresaOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaOrdenCompra.add(jComboBoxid_empresaOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalOrdenCompra.add(jLabelid_sucursalOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalOrdenCompra.add(jButtonid_sucursalOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalOrdenCompra.add(jButtonid_sucursalOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalOrdenCompra.add(jComboBoxid_sucursalOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_moduloOrdenCompra.add(jLabelid_moduloOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloOrdenCompra.add(jButtonid_moduloOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloOrdenCompra.add(jButtonid_moduloOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_moduloOrdenCompra.add(jComboBoxid_moduloOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioOrdenCompra.add(jLabelid_ejercicioOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioOrdenCompra.add(jButtonid_ejercicioOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioOrdenCompra.add(jButtonid_ejercicioOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioOrdenCompra.add(jComboBoxid_ejercicioOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoOrdenCompra.add(jLabelid_periodoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoOrdenCompra.add(jButtonid_periodoOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoOrdenCompra.add(jButtonid_periodoOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoOrdenCompra.add(jComboBoxid_periodoOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioOrdenCompra.add(jLabelid_anioOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioOrdenCompra.add(jButtonid_anioOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioOrdenCompra.add(jButtonid_anioOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioOrdenCompra.add(jComboBoxid_anioOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesOrdenCompra.add(jLabelid_mesOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesOrdenCompra.add(jButtonid_mesOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesOrdenCompra.add(jButtonid_mesOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesOrdenCompra.add(jComboBoxid_mesOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_usuarioOrdenCompra.add(jLabelid_usuarioOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioOrdenCompra.add(jButtonid_usuarioOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioOrdenCompra.add(jButtonid_usuarioOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_usuarioOrdenCompra.add(jComboBoxid_usuarioOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionOrdenCompra.add(jLabelfecha_emisionOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionOrdenCompra.add(jButtonfecha_emisionOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionOrdenCompra.add(jDateChooserfecha_emisionOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_entregaOrdenCompra.add(jLabelfecha_entregaOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaOrdenCompra.add(jButtonfecha_entregaOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_entregaOrdenCompra.add(jDateChooserfecha_entregaOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_secuencialOrdenCompra.add(jLabelnumero_secuencialOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialOrdenCompra.add(jButtonnumero_secuencialOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_secuencialOrdenCompra.add(jTextFieldnumero_secuencialOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaOrdenCompra.add(jLabelid_monedaOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaOrdenCompra.add(jButtonid_monedaOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaOrdenCompra.add(jButtonid_monedaOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaOrdenCompra.add(jComboBoxid_monedaOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_cambioOrdenCompra.add(jLabelid_tipo_cambioOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 2;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioOrdenCompra.add(jButtonid_tipo_cambioOrdenCompra, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioOrdenCompra.add(jButtonid_tipo_cambioOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 4;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioOrdenCompra.add(jButtonid_tipo_cambioOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_cambioOrdenCompra.add(jComboBoxid_tipo_cambioOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_orden_compraOrdenCompra.add(jLabelid_estado_orden_compraOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_orden_compraOrdenCompra.add(jButtonid_estado_orden_compraOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_orden_compraOrdenCompra.add(jButtonid_estado_orden_compraOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_orden_compraOrdenCompra.add(jComboBoxid_estado_orden_compraOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteOrdenCompra.add(jLabelid_clienteOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 2;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteOrdenCompra.add(jButtonid_clienteOrdenCompra, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteOrdenCompra.add(jButtonid_clienteOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 4;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteOrdenCompra.add(jButtonid_clienteOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteOrdenCompra.add(jComboBoxid_clienteOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_formatoOrdenCompra.add(jLabelid_formatoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoOrdenCompra.add(jButtonid_formatoOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoOrdenCompra.add(jButtonid_formatoOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_formatoOrdenCompra.add(jComboBoxid_formatoOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transportistaOrdenCompra.add(jLabelid_transportistaOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaOrdenCompra.add(jButtonid_transportistaOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaOrdenCompra.add(jButtonid_transportistaOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transportistaOrdenCompra.add(jComboBoxid_transportistaOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empleadoOrdenCompra.add(jLabelid_empleadoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 2;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoOrdenCompra.add(jButtonid_empleadoOrdenCompra, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoOrdenCompra.add(jButtonid_empleadoOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 4;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoOrdenCompra.add(jButtonid_empleadoOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empleadoOrdenCompra.add(jComboBoxid_empleadoOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionOrdenCompra.add(jLabeldescripcionOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionOrdenCompra.add(jButtondescripcionOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionOrdenCompra.add(jscrollPanedescripcionOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelporcentaje_descuentoOrdenCompra.add(jLabelporcentaje_descuentoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_descuentoOrdenCompra.add(jButtonporcentaje_descuentoOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelporcentaje_descuentoOrdenCompra.add(jTextFieldporcentaje_descuentoOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsumanOrdenCompra.add(jLabelsumanOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelsumanOrdenCompra.add(jButtonsumanOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsumanOrdenCompra.add(jTextFieldsumanOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneliceOrdenCompra.add(jLabeliceOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceOrdenCompra.add(jButtoniceOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneliceOrdenCompra.add(jTextFieldiceOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalor_descuentoOrdenCompra.add(jLabelvalor_descuentoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_descuentoOrdenCompra.add(jButtonvalor_descuentoOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalor_descuentoOrdenCompra.add(jTextFieldvalor_descuentoOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_descuentoOrdenCompra.add(jLabeltotal_descuentoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoOrdenCompra.add(jButtontotal_descuentoOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_descuentoOrdenCompra.add(jTextFieldtotal_descuentoOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelivaOrdenCompra.add(jLabelivaOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaOrdenCompra.add(jButtonivaOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelivaOrdenCompra.add(jTextFieldivaOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelstockOrdenCompra.add(jLabelstockOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelstockOrdenCompra.add(jButtonstockOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelstockOrdenCompra.add(jTextFieldstockOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsub_totalOrdenCompra.add(jLabelsub_totalOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalOrdenCompra.add(jButtonsub_totalOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsub_totalOrdenCompra.add(jTextFieldsub_totalOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_otroOrdenCompra.add(jLabeltotal_otroOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_otroOrdenCompra.add(jButtontotal_otroOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_otroOrdenCompra.add(jTextFieldtotal_otroOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelultimo_costoOrdenCompra.add(jLabelultimo_costoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelultimo_costoOrdenCompra.add(jButtonultimo_costoOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelultimo_costoOrdenCompra.add(jTextFieldultimo_costoOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_itemsOrdenCompra.add(jLabelnumero_itemsOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_itemsOrdenCompra.add(jButtonnumero_itemsOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_itemsOrdenCompra.add(jTextFieldnumero_itemsOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelretencionOrdenCompra.add(jLabelretencionOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelretencionOrdenCompra.add(jButtonretencionOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelretencionOrdenCompra.add(jTextFieldretencionOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalOrdenCompra.add(jLabeltotalOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalOrdenCompra.add(jButtontotalOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalOrdenCompra.add(jTextFieldtotalOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfleteOrdenCompra.add(jLabelfleteOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteOrdenCompra.add(jButtonfleteOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfleteOrdenCompra.add(jTextFieldfleteOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelimpuestoOrdenCompra.add(jLabelimpuestoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuestoOrdenCompra.add(jButtonimpuestoOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelimpuestoOrdenCompra.add(jTextFieldimpuestoOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_transaccion_moduloOrdenCompra.add(jLabelid_tipo_transaccion_moduloOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloOrdenCompra.add(jButtonid_tipo_transaccion_moduloOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloOrdenCompra.add(jButtonid_tipo_transaccion_moduloOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_transaccion_moduloOrdenCompra.add(jComboBoxid_tipo_transaccion_moduloOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_orden_compraOrdenCompra.add(jLabelid_orden_compraOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_compraOrdenCompra.add(jButtonid_orden_compraOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_compraOrdenCompra.add(jButtonid_orden_compraOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_orden_compraOrdenCompra.add(jComboBoxid_orden_compraOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableOrdenCompra.add(jLabelid_asiento_contableOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 2;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableOrdenCompra.add(jButtonid_asiento_contableOrdenCompra, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 3;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableOrdenCompra.add(jButtonid_asiento_contableOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 4;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableOrdenCompra.add(jButtonid_asiento_contableOrdenCompraUpdate, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableOrdenCompra.add(jComboBoxid_asiento_contableOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_comprobanteOrdenCompra.add(jLabelnumero_comprobanteOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteOrdenCompra.add(jButtonnumero_comprobanteOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_comprobanteOrdenCompra.add(jTextFieldnumero_comprobanteOrdenCompra, this.gridBagConstraintsOrdenCompra);


	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 0;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaOrdenCompra.add(jLabelfechaOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		//this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = 2;
		this.gridBagConstraintsOrdenCompra.ipadx = 0;
		this.gridBagConstraintsOrdenCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaOrdenCompra.add(jButtonfechaOrdenCompraBusqueda, this.gridBagConstraintsOrdenCompra);
	}

	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenCompra.gridy = 0;
	this.gridBagConstraintsOrdenCompra.gridx = 1;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaOrdenCompra.add(jDateChooserfechaOrdenCompra, this.gridBagConstraintsOrdenCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelid_empresaOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelid_sucursalOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelid_moduloOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelid_ejercicioOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelid_periodoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelid_anioOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelid_mesOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelid_usuarioOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelfleteOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelimpuestoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelid_tipo_transaccion_moduloOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelid_orden_compraOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelid_asiento_contableOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelnumero_comprobanteOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposOcultosOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposOcultosOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosOrdenCompra.add(this.jPanelfechaOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposOcultosOrdenCompra % 3==0) {
		iXPanelCamposOcultosOrdenCompra=0;
		iYPanelCamposOcultosOrdenCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposIniciogeneralOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposIniciogeneralOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralOrdenCompra.add(this.jPanelidOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposIniciogeneralOrdenCompra % 3==0) {
		iXPanelCamposIniciogeneralOrdenCompra=0;
		iYPanelCamposIniciogeneralOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposIniciogeneralOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposIniciogeneralOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralOrdenCompra.add(this.jPanelfecha_emisionOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposIniciogeneralOrdenCompra % 3==0) {
		iXPanelCamposIniciogeneralOrdenCompra=0;
		iYPanelCamposIniciogeneralOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposIniciogeneralOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposIniciogeneralOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralOrdenCompra.add(this.jPanelfecha_entregaOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposIniciogeneralOrdenCompra % 3==0) {
		iXPanelCamposIniciogeneralOrdenCompra=0;
		iYPanelCamposIniciogeneralOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposIniciogeneralOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposIniciogeneralOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralOrdenCompra.add(this.jPanelnumero_secuencialOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposIniciogeneralOrdenCompra % 3==0) {
		iXPanelCamposIniciogeneralOrdenCompra=0;
		iYPanelCamposIniciogeneralOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposIniciogeneralOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposIniciogeneralOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralOrdenCompra.add(this.jPanelid_monedaOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposIniciogeneralOrdenCompra % 3==0) {
		iXPanelCamposIniciogeneralOrdenCompra=0;
		iYPanelCamposIniciogeneralOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposIniciogeneralOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposIniciogeneralOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralOrdenCompra.add(this.jPanelid_tipo_cambioOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposIniciogeneralOrdenCompra % 3==0) {
		iXPanelCamposIniciogeneralOrdenCompra=0;
		iYPanelCamposIniciogeneralOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposIniciogeneralOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposIniciogeneralOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralOrdenCompra.add(this.jPanelid_estado_orden_compraOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposIniciogeneralOrdenCompra % 3==0) {
		iXPanelCamposIniciogeneralOrdenCompra=0;
		iYPanelCamposIniciogeneralOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposIniciogeneralOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposIniciogeneralOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralOrdenCompra.add(this.jPanelid_clienteOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposIniciogeneralOrdenCompra % 3==0) {
		iXPanelCamposIniciogeneralOrdenCompra=0;
		iYPanelCamposIniciogeneralOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposIniciogeneralOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposIniciogeneralOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralOrdenCompra.add(this.jPanelid_formatoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposIniciogeneralOrdenCompra % 3==0) {
		iXPanelCamposIniciogeneralOrdenCompra=0;
		iYPanelCamposIniciogeneralOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposIniciogeneralOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposIniciogeneralOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralOrdenCompra.add(this.jPanelid_transportistaOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposIniciogeneralOrdenCompra % 3==0) {
		iXPanelCamposIniciogeneralOrdenCompra=0;
		iYPanelCamposIniciogeneralOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposIniciogeneralOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposIniciogeneralOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralOrdenCompra.add(this.jPanelid_empleadoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposIniciogeneralOrdenCompra % 3==0) {
		iXPanelCamposIniciogeneralOrdenCompra=0;
		iYPanelCamposIniciogeneralOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposIniciogeneralOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposIniciogeneralOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralOrdenCompra.add(this.jPaneldescripcionOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposIniciogeneralOrdenCompra % 3==0) {
		iXPanelCamposIniciogeneralOrdenCompra=0;
		iYPanelCamposIniciogeneralOrdenCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPanelporcentaje_descuentoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPanelsumanOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPaneliceOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPanelvalor_descuentoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPaneltotal_descuentoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPanelivaOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPanelstockOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPanelsub_totalOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPaneltotal_otroOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPanelultimo_costoOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPanelnumero_itemsOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPanelretencionOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
	this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
	//NUM X EXTRA
	iXPanelCamposFintotalOrdenCompra+=2;
	this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenCompra.gridy = iYPanelCamposFintotalOrdenCompra;
	this.gridBagConstraintsOrdenCompra.gridx = iXPanelCamposFintotalOrdenCompra++;
	this.gridBagConstraintsOrdenCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalOrdenCompra.add(this.jPaneltotalOrdenCompra, this.gridBagConstraintsOrdenCompra);



	if(iXPanelCamposFintotalOrdenCompra % 3==0) {
		iXPanelCamposFintotalOrdenCompra=0;
		iYPanelCamposFintotalOrdenCompra++;
	}
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesOrdenCompra= new GridBagLayout();
		this.jPanelAccionesOrdenCompra.setLayout(gridaBagLayoutAccionesOrdenCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioOrdenCompra= new GridBagLayout();
		this.jPanelAccionesFormularioOrdenCompra.setLayout(gridaBagLayoutAccionesFormularioOrdenCompra);
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioOrdenCompra.add(this.jComboBoxTiposAccionesFormularioOrdenCompra, this.gridBagConstraintsOrdenCompra);

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioOrdenCompra.add(this.jCheckBoxPostAccionNuevoOrdenCompra, this.gridBagConstraintsOrdenCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.ordencompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioOrdenCompra.add(this.jCheckBoxPostAccionSinCerrarOrdenCompra, this.gridBagConstraintsOrdenCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.ordencompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.ordencompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsOrdenCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioOrdenCompra.add(this.jCheckBoxPostAccionSinMensajeOrdenCompra, this.gridBagConstraintsOrdenCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesOrdenCompra.add(this.jButtonModificarOrdenCompra, this.gridBagConstraintsOrdenCompra);							

		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenCompra.gridy = 0;
		this.gridBagConstraintsOrdenCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesOrdenCompra.add(this.jButtonEliminarOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
			
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = 0;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesOrdenCompra.add(this.jButtonActualizarOrdenCompra, this.gridBagConstraintsOrdenCompra);


		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = 0;		
		this.gridBagConstraintsOrdenCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesOrdenCompra.add(this.jButtonGuardarCambiosOrdenCompra, this.gridBagConstraintsOrdenCompra);	
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = 0;		
		this.gridBagConstraintsOrdenCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesOrdenCompra.add(this.jButtonCancelarOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutOrdenCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutOrdenCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ordencompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();						
			this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsOrdenCompra.gridx = 0;		
			//this.gridBagConstraintsOrdenCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsOrdenCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsOrdenCompra.gridx =0;
		this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsOrdenCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosOrdenCompra, this.gridBagConstraintsOrdenCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeOrdenCompra = new OrdenCompraBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeOrdenCompra.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeOrdenCompra.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeOrdenCompra.setTitle("OrdenCompra ARBOL");
		this.jInternalFrameTreeOrdenCompra.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"OrdenCompra Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeOrdenCompra.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeOrdenCompra.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeOrdenCompra.setResizable(true);
	    this.jInternalFrameTreeOrdenCompra.setClosable(true);
	    this.jInternalFrameTreeOrdenCompra.setMaximizable(true);
			
			
		//if(OrdenCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleOrdenCompra = new OrdenCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("OrdenCompra DATOS");
			
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
			
	        //this.setTitle("[FOR] - OrdenCompra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"OrdenCompra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			OrdenCompraModel ordencompraModel=new OrdenCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//OrdenCompraModel.OrdenCompraFocusTraversalPolicy ordencompraFocusTraversalPolicy = ordencompraModel.new OrdenCompraFocusTraversalPolicy(this);
			
			//ordencompraFocusTraversalPolicy.setordencompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ordencompraModel);
			
			
			this.jContentPaneDetalleOrdenCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleOrdenCompra = new GridBagLayout();	
			this.jContentPaneDetalleOrdenCompra.setLayout(gridaBagLayoutDetalleOrdenCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosOrdenCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionOrdenCompra=   new JScrollPane(jContentPaneDetalleOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralOrdenCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsOrdenCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsOrdenCompra.gridx = 0;
	        
			this.jContentPaneDetalleOrdenCompra.add(jPanelCamposOrdenCompra, gridBagConstraintsOrdenCompra);
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsOrdenCompra.gridy = iGridyRelaciones++;
		this.gridBagConstraintsOrdenCompra.gridx = 0;

		this.jContentPaneDetalleOrdenCompra.add(jPanelCamposIniciogeneralOrdenCompra, gridBagConstraintsOrdenCompra);
			
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
						&& ordencompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleOrdenCompra(this.puedeCargarPorParteDetalleOrdenCompra,false,-1);
					
					if(this.ordencompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsOrdenCompra= new GridBagConstraints();
						this.gridBagConstraintsOrdenCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsOrdenCompra.gridx = 0;
						this.jContentPaneDetalleOrdenCompra.add(this.jTabbedPaneRelacionesOrdenCompra, this.gridBagConstraintsOrdenCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesOrdenCompra.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleOrdenCompra(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsOrdenCompra.gridy = iGridyRelaciones++;
		this.gridBagConstraintsOrdenCompra.gridx = 0;

		this.jContentPaneDetalleOrdenCompra.add(jPanelCamposFintotalOrdenCompra, gridBagConstraintsOrdenCompra);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosOrdenCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
					this.gridBagConstraintsOrdenCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsOrdenCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsOrdenCompra.gridx = 0;
					
				
					this.jContentPaneDetalleOrdenCompra.add(jPanelCamposOcultosOrdenCompra, gridBagConstraintsOrdenCompra);
				
					this.jPanelCamposOcultosOrdenCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsOrdenCompra.gridx = 0;
	        this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleOrdenCompra.add(this.jPanelAccionesFormularioOrdenCompra, this.gridBagConstraintsOrdenCompra);							
			
			
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsOrdenCompra.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsOrdenCompra.gridx = 0;
	        
			
			this.jContentPaneDetalleOrdenCompra.add(this.jPanelAccionesOrdenCompra, this.gridBagConstraintsOrdenCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionOrdenCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionOrdenCompra=   new JScrollPane(this.jPanelCamposOrdenCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionOrdenCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOrdenCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOrdenCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsOrdenCompra.gridx = 0;
			this.gridBagConstraintsOrdenCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsOrdenCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsOrdenCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionOrdenCompra, this.gridBagConstraintsOrdenCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsOrdenCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioOrdenCompra, this.gridBagConstraintsOrdenCompra);			
			
			this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
			this.gridBagConstraintsOrdenCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsOrdenCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesOrdenCompra, this.gridBagConstraintsOrdenCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOrdenCompra, this.gridBagConstraintsOrdenCompra);
			
			
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosOrdenCompra, this.gridBagConstraintsOrdenCompra);
		
			
		this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
		this.gridBagConstraintsOrdenCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsOrdenCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesOrdenCompra, this.gridBagConstraintsOrdenCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralOrdenCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionOrdenCompra;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleOrdenCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleordencompraSessionBean=new DetalleOrdenCompraSessionBean();
		this.detalleordencompraSessionBean.setConGuardarRelaciones(false);
		this.detalleordencompraSessionBean.setEsGuardarRelacionado(true);

		this.detalleordencompraBeanSwingJInternalFrame=null;//new DetalleOrdenCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleordencompraBeanSwingJInternalFramePopup=new DetalleOrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleordencompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {

				DetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=OrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=OrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleordencompraSessionBean.setEsGuardarRelacionado(true);

				this.detalleordencompraBeanSwingJInternalFrame=new DetalleOrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleordencompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleordencompraBeanSwingJInternalFrame.setdetalleordencompraSessionBean(this.detalleordencompraSessionBean);

				//this.gridBagConstraintsOrdenCompra = new GridBagConstraints();
				//this.gridBagConstraintsOrdenCompra.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsOrdenCompra.gridx = 0;
				//this.jContentPaneDetalleOrdenCompra.add(this.detalleordencompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsOrdenCompra);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesOrdenCompra.add("Detalle Orden Compras",this.detalleordencompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesOrdenCompra.setComponentAt(iIndexTab,this.detalleordencompraBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleordencompraSessionBean.setEsGuardarRelacionado(false);
				this.detalleordencompraBeanSwingJInternalFrame=null;//new DetalleOrdenCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleOrdenCompra) {
					this.jTabbedPaneRelacionesOrdenCompra.add("Detalle Orden Compras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleOrdenCompraBeanSwingJInternalFrame(List<OrdenCompra> ordencompras,OrdenCompra ordencompra,DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleordencompraBeanSwingJInternalFrame=new DetalleOrdenCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleordencompraBeanSwingJInternalFrame.getDetalleOrdenCompraLogic().setConnexion(this.ordencompraLogic.getConnexion());

					detalleordencompraBeanSwingJInternalFrame.setordencomprasForeignKey(ordencompras);
					detalleordencompraBeanSwingJInternalFrame.setordencompraForeignKey(ordencompra);
					detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setisBusquedaDesdeForeignKeySesionOrdenCompra(true);
					detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setlidOrdenCompraActual(ordencompra.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleordencompraBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleOrdenCompra(detalleordencompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleordencompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaOrdenCompra(true);
					detalleordencompraBeanSwingJInternalFrame.setid_orden_compraFK_IdOrdenCompra(ordencompra.getId());

					if(!this.conCargarFormDetalle) {
						detalleordencompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleordencompraBeanSwingJInternalFrame.setSelectedItemCombosFrameOrdenCompraForeignKey(ordencompra,1,false,true,true);
					detalleordencompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleordencompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdOrdenCompra");
					detalleordencompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdOrdenCompra");
					detalleordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleOrdenCompra(true);
					detalleordencompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleOrdenCompra("n",detalleordencompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleordencompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleordencompraBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleordencompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleOrdenCompra("relacionado");
					} else {
						detalleordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleOrdenCompra("no_relacionado");
					}

					detalleordencompraBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleOrdenCompra().setVisible(false);

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
