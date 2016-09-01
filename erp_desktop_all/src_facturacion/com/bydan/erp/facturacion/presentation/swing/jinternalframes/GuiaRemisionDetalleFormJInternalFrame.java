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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.GuiaRemisionConstantesFunciones;

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
public class GuiaRemisionDetalleFormJInternalFrame extends GuiaRemisionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGuiaRemision;
	
	protected JMenuBar jmenuBarDetalleGuiaRemision;
	
	protected JMenu jmenuDetalleGuiaRemision;
	protected JMenu jmenuDetalleArchivoGuiaRemision;
	protected JMenu jmenuDetalleAccionesGuiaRemision;
	protected JMenu jmenuDetalleDatosGuiaRemision;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGuiaRemision;	
	protected GridBagConstraints gridBagConstraintsGuiaRemision;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GuiaRemisionBeanSwingJInternalFrameAdditional jInternalFrameDetalleGuiaRemision;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected ConsultorBeanSwingJInternalFrame consultorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consultor="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subcliente="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected CiudadBeanSwingJInternalFrame ciudadorigenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudadorigen="";

	protected CiudadBeanSwingJInternalFrame ciudaddestinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudaddestino="";

	protected TipoLlamadaBeanSwingJInternalFrame tipollamadaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipollamada="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";
	
	public GuiaRemisionSessionBean guiaremisionSessionBean;
	
	

	public DetalleGuiaRemisionBeanSwingJInternalFrame detalleguiaremisionBeanSwingJInternalFrame=null;
	public DetalleGuiaRemisionBeanSwingJInternalFrame detalleguiaremisionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleGuiaRemision=false;
	public DetalleGuiaRemisionSessionBean detalleguiaremisionSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public ConsultorSessionBean consultorSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public SubClienteSessionBean subclienteSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public CiudadSessionBean ciudadorigenSessionBean;
	public CiudadSessionBean ciudaddestinoSessionBean;
	public TipoLlamadaSessionBean tipollamadaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;	
	
	public GuiaRemisionLogic guiaremisionLogic;
	
	public JScrollPane jScrollPanelDatosGuiaRemision;
	public JScrollPane jScrollPanelDatosEdicionGuiaRemision;
	public JScrollPane jScrollPanelDatosGeneralGuiaRemision;
	
	protected JPanel jPanelCamposGuiaRemision;    
	protected JPanel jPanelCamposOcultosGuiaRemision;    	
	protected JPanel jPanelAccionesGuiaRemision;
	protected JPanel jPanelAccionesFormularioGuiaRemision;
    
	
	
	protected Integer iXPanelCamposGuiaRemision=0;
	protected Integer iYPanelCamposGuiaRemision=0;
	
	protected Integer iXPanelCamposOcultosGuiaRemision=0;
	protected Integer iYPanelCamposOcultosGuiaRemision=0;
	
	

	protected JPanel jPanelCamposFintotalGuiaRemision;
	protected Integer iXPanelCamposFintotalGuiaRemision=0;
	protected Integer iYPanelCamposFintotalGuiaRemision=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGuiaRemision;
	public JButton jButtonModificarGuiaRemision;
	public JButton jButtonActualizarGuiaRemision;
    public JButton jButtonEliminarGuiaRemision;
	public JButton jButtonCancelarGuiaRemision;
    public JButton jButtonGuardarCambiosGuiaRemision;
	public JButton jButtonGuardarCambiosTablaGuiaRemision;
	protected JButton jButtonCerrarGuiaRemision;
	
	
	protected JButton jButtonProcesarInformacionGuiaRemision;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGuiaRemision;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGuiaRemision;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGuiaRemision;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGuiaRemision;
	protected JButton jButtonModificarToolBarGuiaRemision;
	protected JButton jButtonActualizarToolBarGuiaRemision;
    protected JButton jButtonEliminarToolBarGuiaRemision;
	protected JButton jButtonCancelarToolBarGuiaRemision;
    protected JButton jButtonGuardarCambiosToolBarGuiaRemision;
	protected JButton jButtonGuardarCambiosTablaToolBarGuiaRemision;
	protected JButton jButtonMostrarOcultarTablaToolBarGuiaRemision;
	protected JButton jButtonCerrarToolBarGuiaRemision;
	
	protected JButton jButtonProcesarInformacionToolBarGuiaRemision;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGuiaRemision;
	protected JMenuItem jMenuItemModificarGuiaRemision;
	protected JMenuItem jMenuItemActualizarGuiaRemision;
    protected JMenuItem jMenuItemEliminarGuiaRemision;
	protected JMenuItem jMenuItemCancelarGuiaRemision;
    protected JMenuItem jMenuItemGuardarCambiosGuiaRemision;
	protected JMenuItem jMenuItemGuardarCambiosTablaGuiaRemision;
	protected JMenuItem jMenuItemCerrarGuiaRemision;
	protected JMenuItem jMenuItemDetalleCerrarGuiaRemision;
	protected JMenuItem jMenuItemDetalleMostarOcultarGuiaRemision;
	
	protected JMenuItem jMenuItemProcesarInformacionGuiaRemision;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGuiaRemision;
	protected JMenuItem jMenuItemMostrarOcultarGuiaRemision;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGuiaRemision;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGuiaRemision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGuiaRemision;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGuiaRemision;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGuiaRemision;
	public JLabel jLabelIdGuiaRemision;
	public JLabel jLabelidGuiaRemision;
	public JButton jButtonidGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialGuiaRemision;
	public JLabel jLabelsecuencialGuiaRemision;
	public JTextField jTextFieldsecuencialGuiaRemision;
	public JButton jButtonsecuencialGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionGuiaRemision;
	public JLabel jLabelfecha_emisionGuiaRemision;
	//public JFormattedTextField jDateChooserfecha_emisionGuiaRemision;

	public JDateChooser jDateChooserfecha_emisionGuiaRemision;
	public JButton jButtonfecha_emisionGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_camionGuiaRemision;
	public JLabel jLabelnumero_camionGuiaRemision;
	public JTextField jTextFieldnumero_camionGuiaRemision;
	public JButton jButtonnumero_camionGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelidentificacionGuiaRemision;
	public JLabel jLabelidentificacionGuiaRemision;
	public JTextField jTextFieldidentificacionGuiaRemision;
	public JButton jButtonidentificacionGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_origenGuiaRemision;
	public JLabel jLabelfecha_origenGuiaRemision;
	//public JFormattedTextField jDateChooserfecha_origenGuiaRemision;

	public JDateChooser jDateChooserfecha_origenGuiaRemision;
	public JButton jButtonfecha_origenGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_destinoGuiaRemision;
	public JLabel jLabelfecha_destinoGuiaRemision;
	//public JFormattedTextField jDateChooserfecha_destinoGuiaRemision;

	public JDateChooser jDateChooserfecha_destinoGuiaRemision;
	public JButton jButtonfecha_destinoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneltransporte_codigoGuiaRemision;
	public JLabel jLabeltransporte_codigoGuiaRemision;
	public JTextArea jTextAreatransporte_codigoGuiaRemision;
	public JScrollPane jscrollPanetransporte_codigoGuiaRemision;
	public JButton jButtontransporte_codigoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_bultosGuiaRemision;
	public JLabel jLabelcantidad_bultosGuiaRemision;
	public JTextField jTextFieldcantidad_bultosGuiaRemision;
	public JButton jButtoncantidad_bultosGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelhora_inicioGuiaRemision;
	public JLabel jLabelhora_inicioGuiaRemision;
	public JSpinner jSpinnerhora_inicioGuiaRemision= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_inicioGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelhora_finGuiaRemision;
	public JLabel jLabelhora_finGuiaRemision;
	public JSpinner jSpinnerhora_finGuiaRemision= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_finGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelcupoGuiaRemision;
	public JLabel jLabelcupoGuiaRemision;
	public JTextField jTextFieldcupoGuiaRemision;
	public JButton jButtoncupoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelsaldoGuiaRemision;
	public JLabel jLabelsaldoGuiaRemision;
	public JTextField jTextFieldsaldoGuiaRemision;
	public JButton jButtonsaldoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneldocumentoGuiaRemision;
	public JLabel jLabeldocumentoGuiaRemision;
	public JTextField jTextFielddocumentoGuiaRemision;
	public JButton jButtondocumentoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneldisponibleGuiaRemision;
	public JLabel jLabeldisponibleGuiaRemision;
	public JTextField jTextFielddisponibleGuiaRemision;
	public JButton jButtondisponibleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionGuiaRemision;
	public JLabel jLabeldescripcionGuiaRemision;
	public JTextArea jTextAreadescripcionGuiaRemision;
	public JScrollPane jscrollPanedescripcionGuiaRemision;
	public JButton jButtondescripcionGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaGuiaRemision;
	public JLabel jLabeltotal_ivaGuiaRemision;
	public JTextField jTextFieldtotal_ivaGuiaRemision;
	public JButton jButtontotal_ivaGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaGuiaRemision;
	public JLabel jLabeltotal_sin_ivaGuiaRemision;
	public JTextField jTextFieldtotal_sin_ivaGuiaRemision;
	public JButton jButtontotal_sin_ivaGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoGuiaRemision;
	public JLabel jLabeldescuentoGuiaRemision;
	public JTextField jTextFielddescuentoGuiaRemision;
	public JButton jButtondescuentoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelfleteGuiaRemision;
	public JLabel jLabelfleteGuiaRemision;
	public JTextField jTextFieldfleteGuiaRemision;
	public JButton jButtonfleteGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelotroGuiaRemision;
	public JLabel jLabelotroGuiaRemision;
	public JTextField jTextFieldotroGuiaRemision;
	public JButton jButtonotroGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoGuiaRemision;
	public JLabel jLabelfinanciamientoGuiaRemision;
	public JTextField jTextFieldfinanciamientoGuiaRemision;
	public JButton jButtonfinanciamientoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelivaGuiaRemision;
	public JLabel jLabelivaGuiaRemision;
	public JTextField jTextFieldivaGuiaRemision;
	public JButton jButtonivaGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneltotalGuiaRemision;
	public JLabel jLabeltotalGuiaRemision;
	public JTextField jTextFieldtotalGuiaRemision;
	public JButton jButtontotalGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelmonto_retencionGuiaRemision;
	public JLabel jLabelmonto_retencionGuiaRemision;
	public JTextField jTextFieldmonto_retencionGuiaRemision;
	public JButton jButtonmonto_retencionGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelfechaGuiaRemision;
	public JLabel jLabelfechaGuiaRemision;
	//public JFormattedTextField jDateChooserfechaGuiaRemision;

	public JDateChooser jDateChooserfechaGuiaRemision;
	public JButton jButtonfechaGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelruc_clienteGuiaRemision;
	public JLabel jLabelruc_clienteGuiaRemision;
	public JTextField jTextFieldruc_clienteGuiaRemision;
	public JButton jButtonruc_clienteGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteGuiaRemision;
	public JLabel jLabelnombre_clienteGuiaRemision;
	public JTextArea jTextAreanombre_clienteGuiaRemision;
	public JScrollPane jscrollPanenombre_clienteGuiaRemision;
	public JButton jButtonnombre_clienteGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_clienteGuiaRemision;
	public JLabel jLabeltelefono_clienteGuiaRemision;
	public JTextArea jTextAreatelefono_clienteGuiaRemision;
	public JScrollPane jscrollPanetelefono_clienteGuiaRemision;
	public JButton jButtontelefono_clienteGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_clienteGuiaRemision;
	public JLabel jLabeldireccion_clienteGuiaRemision;
	public JTextArea jTextAreadireccion_clienteGuiaRemision;
	public JScrollPane jscrollPanedireccion_clienteGuiaRemision;
	public JButton jButtondireccion_clienteGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoGuiaRemision;
	public JLabel jLabelnumero_pre_impresoGuiaRemision;
	public JTextField jTextFieldnumero_pre_impresoGuiaRemision;
	public JButton jButtonnumero_pre_impresoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelpeso_brutoGuiaRemision;
	public JLabel jLabelpeso_brutoGuiaRemision;
	public JTextField jTextFieldpeso_brutoGuiaRemision;
	public JButton jButtonpeso_brutoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_autorizacionGuiaRemision;
	public JLabel jLabelfecha_autorizacionGuiaRemision;
	//public JFormattedTextField jDateChooserfecha_autorizacionGuiaRemision;

	public JDateChooser jDateChooserfecha_autorizacionGuiaRemision;
	public JButton jButtonfecha_autorizacionGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoGuiaRemision;
	public JLabel jLabelfecha_vencimientoGuiaRemision;
	//public JFormattedTextField jDateChooserfecha_vencimientoGuiaRemision;

	public JDateChooser jDateChooserfecha_vencimientoGuiaRemision;
	public JButton jButtonfecha_vencimientoGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGuiaRemision;
	public JLabel jLabelid_empresaGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGuiaRemision;
	public JButton jButtonid_empresaGuiaRemision= new JButtonMe();
	public JButton jButtonid_empresaGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_empresaGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalGuiaRemision;
	public JLabel jLabelid_sucursalGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalGuiaRemision;
	public JButton jButtonid_sucursalGuiaRemision= new JButtonMe();
	public JButton jButtonid_sucursalGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioGuiaRemision;
	public JLabel jLabelid_ejercicioGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioGuiaRemision;
	public JButton jButtonid_ejercicioGuiaRemision= new JButtonMe();
	public JButton jButtonid_ejercicioGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoGuiaRemision;
	public JLabel jLabelid_periodoGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoGuiaRemision;
	public JButton jButtonid_periodoGuiaRemision= new JButtonMe();
	public JButton jButtonid_periodoGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_periodoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioGuiaRemision;
	public JLabel jLabelid_usuarioGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioGuiaRemision;
	public JButton jButtonid_usuarioGuiaRemision= new JButtonMe();
	public JButton jButtonid_usuarioGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_usuarioGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoGuiaRemision;
	public JLabel jLabelid_formatoGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoGuiaRemision;
	public JButton jButtonid_formatoGuiaRemision= new JButtonMe();
	public JButton jButtonid_formatoGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_formatoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioGuiaRemision;
	public JLabel jLabelid_tipo_precioGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioGuiaRemision;
	public JButton jButtonid_tipo_precioGuiaRemision= new JButtonMe();
	public JButton jButtonid_tipo_precioGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaGuiaRemision;
	public JLabel jLabelid_monedaGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaGuiaRemision;
	public JButton jButtonid_monedaGuiaRemision= new JButtonMe();
	public JButton jButtonid_monedaGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_monedaGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteGuiaRemision;
	public JLabel jLabelid_clienteGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteGuiaRemision;
	public JButton jButtonid_clienteGuiaRemision= new JButtonMe();
	public JButton jButtonid_clienteGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_clienteGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorGuiaRemision;
	public JLabel jLabelid_vendedorGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorGuiaRemision;
	public JButton jButtonid_vendedorGuiaRemision= new JButtonMe();
	public JButton jButtonid_vendedorGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_vendedorGuiaRemisionBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorGuiaRemisionArbol= new JButtonMe();

	public JPanel jPanelid_facturaGuiaRemision;
	public JLabel jLabelid_facturaGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaGuiaRemision;
	public JButton jButtonid_facturaGuiaRemision= new JButtonMe();
	public JButton jButtonid_facturaGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_facturaGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_transportistaGuiaRemision;
	public JLabel jLabelid_transportistaGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaGuiaRemision;
	public JButton jButtonid_transportistaGuiaRemision= new JButtonMe();
	public JButton jButtonid_transportistaGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_transportistaGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_consultorGuiaRemision;
	public JLabel jLabelid_consultorGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consultorGuiaRemision;
	public JButton jButtonid_consultorGuiaRemision= new JButtonMe();
	public JButton jButtonid_consultorGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_consultorGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_transporteGuiaRemision;
	public JLabel jLabelid_transporteGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transporteGuiaRemision;
	public JButton jButtonid_transporteGuiaRemision= new JButtonMe();
	public JButton jButtonid_transporteGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_transporteGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_sub_clienteGuiaRemision;
	public JLabel jLabelid_sub_clienteGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_clienteGuiaRemision;
	public JButton jButtonid_sub_clienteGuiaRemision= new JButtonMe();
	public JButton jButtonid_sub_clienteGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_sub_clienteGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoGuiaRemision;
	public JLabel jLabelid_empleadoGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoGuiaRemision;
	public JButton jButtonid_empleadoGuiaRemision= new JButtonMe();
	public JButton jButtonid_empleadoGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudad_origenGuiaRemision;
	public JLabel jLabelid_ciudad_origenGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudad_origenGuiaRemision;
	public JButton jButtonid_ciudad_origenGuiaRemision= new JButtonMe();
	public JButton jButtonid_ciudad_origenGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_ciudad_origenGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudad_destinoGuiaRemision;
	public JLabel jLabelid_ciudad_destinoGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudad_destinoGuiaRemision;
	public JButton jButtonid_ciudad_destinoGuiaRemision= new JButtonMe();
	public JButton jButtonid_ciudad_destinoGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_ciudad_destinoGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_llamadaGuiaRemision;
	public JLabel jLabelid_tipo_llamadaGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_llamadaGuiaRemision;
	public JButton jButtonid_tipo_llamadaGuiaRemision= new JButtonMe();
	public JButton jButtonid_tipo_llamadaGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_llamadaGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioGuiaRemision;
	public JLabel jLabelid_tipo_cambioGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioGuiaRemision;
	public JButton jButtonid_tipo_cambioGuiaRemision= new JButtonMe();
	public JButton jButtonid_tipo_cambioGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioGuiaRemisionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGuiaRemision;
	
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
		
	public int iWidthFormulario=1415;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public GuiaRemisionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGuiaRemision=new JPanel();
				this.jPanelAccionesFormularioGuiaRemision=new JPanel();
				this.jmenuBarDetalleGuiaRemision=new JMenuBar();
				this.jTtoolBarDetalleGuiaRemision=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiaRemisionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GuiaRemisionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiaRemisionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiaRemisionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuiaRemisionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGuiaRemision() {
		return this.jButtonActualizarToolBarGuiaRemision;
	}
	
	public JButton getjButtonEliminarToolBarGuiaRemision() {
		return this.jButtonEliminarToolBarGuiaRemision;
	}
	
	public JButton getjButtonCancelarToolBarGuiaRemision() {
		return this.jButtonCancelarToolBarGuiaRemision;
	}		
	
	public JButton getjButtonProcesarInformacionGuiaRemision() {
		return this.jButtonProcesarInformacionGuiaRemision;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGuiaRemision)	{
		this.jButtonProcesarInformacionGuiaRemision = jButtonProcesarInformacionGuiaRemision;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGuiaRemision() {
		return this.jComboBoxTiposAccionesGuiaRemision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGuiaRemision(
			JComboBox jComboBoxTiposRelacionesGuiaRemision) {
		this.jComboBoxTiposRelacionesGuiaRemision = jComboBoxTiposRelacionesGuiaRemision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGuiaRemision(
			JComboBox jComboBoxTiposAccionesGuiaRemision) {
		this.jComboBoxTiposAccionesGuiaRemision = jComboBoxTiposAccionesGuiaRemision;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGuiaRemision() {
		return this.jComboBoxTiposAccionesFormularioGuiaRemision;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGuiaRemision(
			JComboBox jComboBoxTiposAccionesFormularioGuiaRemision) {
		this.jComboBoxTiposAccionesFormularioGuiaRemision = jComboBoxTiposAccionesFormularioGuiaRemision;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.guiaremisionSessionBean=new GuiaRemisionSessionBean();
		
		this.guiaremisionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.guiaremisionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.guiaremisionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detalleguiaremisionSessionBean=new DetalleGuiaRemisionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GuiaRemisionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Guia Remision MANTENIMIENTO"));
		
		
		if(iWidth > 3950) {
			iWidth=3950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.guiaremisionSessionBean.getEsGuardarRelacionado()) {
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
	
		GuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGuiaRemision= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGuiaRemision=new JButtonMe();
				this.jButtonModificarToolBarGuiaRemision=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"actualizar","actualizar","Actualizar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"eliminar","eliminar","Eliminar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"cancelar","cancelar","Cancelar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGuiaRemision,this.jTtoolBarDetalleGuiaRemision,
							"guardarcambios","guardarcambios","Guardar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGuiaRemision=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGuiaRemision=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGuiaRemision=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGuiaRemision=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGuiaRemision=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGuiaRemision= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGuiaRemision.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuiaRemision,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGuiaRemision= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGuiaRemision.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGuiaRemision,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGuiaRemision= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGuiaRemision.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGuiaRemision,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGuiaRemision= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGuiaRemision.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGuiaRemision,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGuiaRemision= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGuiaRemision.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGuiaRemision,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGuiaRemision= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGuiaRemision.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGuiaRemision,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGuiaRemision= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGuiaRemision.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGuiaRemision,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGuiaRemision= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGuiaRemision.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGuiaRemision,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGuiaRemision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGuiaRemision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGuiaRemision,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGuiaRemision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGuiaRemision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGuiaRemision,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGuiaRemision.add(this.jMenuItemDetalleCerrarGuiaRemision);
		
		this.jmenuDetalleAccionesGuiaRemision.add(this.jMenuItemActualizarGuiaRemision);
		this.jmenuDetalleAccionesGuiaRemision.add(this.jMenuItemEliminarGuiaRemision);
		this.jmenuDetalleAccionesGuiaRemision.add(this.jMenuItemCancelarGuiaRemision);		
		
		//this.jmenuDetalleDatosGuiaRemision.add(this.jMenuItemDetalleAbrirOrderByGuiaRemision);				
		this.jmenuDetalleDatosGuiaRemision.add(this.jMenuItemDetalleMostarOcultarGuiaRemision);				
				
		//this.jmenuDetalleAccionesGuiaRemision.add(this.jMenuItemGuardarCambiosGuiaRemision);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGuiaRemision.add(this.jmenuDetalleArchivoGuiaRemision);		
		this.jmenuBarDetalleGuiaRemision.add(this.jmenuDetalleAccionesGuiaRemision);		
		this.jmenuBarDetalleGuiaRemision.add(this.jmenuDetalleDatosGuiaRemision);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleGuiaRemision.add(this.jmenuDetalleGuiaRemision);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposGuiaRemision() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGuiaRemision = new JLabelMe();
		jLabelIdGuiaRemision.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGuiaRemision = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGuiaRemision= new GridBagLayout();

		this.jPanelidGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);

		jLabelidGuiaRemision = new JLabel();
		jLabelidGuiaRemision.setText("Id");

		jLabelidGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialGuiaRemision = new JLabelMe();
		this.jLabelsecuencialGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialGuiaRemision.setToolTipText("Nro Guia");
		this.jLabelsecuencialGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelsecuencialGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldsecuencialGuiaRemision= new JTextFieldMe();

		jTextFieldsecuencialGuiaRemision.setEnabled(false);
		jTextFieldsecuencialGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonsecuencialGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialGuiaRemisionBusqueda.setText("U");
		this.jButtonsecuencialGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionGuiaRemision = new JLabelMe();
		this.jLabelfecha_emisionGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionGuiaRemision.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelfecha_emisionGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		//jFormattedTextFieldfecha_emisionGuiaRemision= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionGuiaRemision= new JDateChooser();
		jDateChooserfecha_emisionGuiaRemision.setEnabled(false);
		jDateChooserfecha_emisionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionGuiaRemision.setDate(new Date());
		jDateChooserfecha_emisionGuiaRemision.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionGuiaRemision.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonfecha_emisionGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionGuiaRemisionBusqueda.setText("U");
		this.jButtonfecha_emisionGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelnumero_camionGuiaRemision = new JLabelMe();
		this.jLabelnumero_camionGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_NUMEROCAMION+" :");
		this.jLabelnumero_camionGuiaRemision.setToolTipText("Numero Camion");
		this.jLabelnumero_camionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_camionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_camionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_camionGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_camionGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_camionGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_NUMEROCAMION);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelnumero_camionGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldnumero_camionGuiaRemision= new JTextFieldMe();

		jTextFieldnumero_camionGuiaRemision.setEnabled(false);
		jTextFieldnumero_camionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_camionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_camionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_camionGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_camionGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonnumero_camionGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_camionGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_camionGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_camionGuiaRemisionBusqueda.setText("U");
		this.jButtonnumero_camionGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_camionGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_camionGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_camionGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_camionGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_camionGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_camionGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelidentificacionGuiaRemision = new JLabelMe();
		this.jLabelidentificacionGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDENTIFICACION+" :");
		this.jLabelidentificacionGuiaRemision.setToolTipText("Identificacion");
		this.jLabelidentificacionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelidentificacionGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldidentificacionGuiaRemision= new JTextFieldMe();

		jTextFieldidentificacionGuiaRemision.setEnabled(false);
		jTextFieldidentificacionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonidentificacionGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionGuiaRemisionBusqueda.setText("U");
		this.jButtonidentificacionGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_origenGuiaRemision = new JLabelMe();
		this.jLabelfecha_origenGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_FECHAORIGEN+" : *");
		this.jLabelfecha_origenGuiaRemision.setToolTipText("Fecha Origen");
		this.jLabelfecha_origenGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_origenGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_origenGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_origenGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_origenGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_origenGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_FECHAORIGEN);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelfecha_origenGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		//jFormattedTextFieldfecha_origenGuiaRemision= new JFormattedTextFieldMe();

		jDateChooserfecha_origenGuiaRemision= new JDateChooser();
		jDateChooserfecha_origenGuiaRemision.setEnabled(false);
		jDateChooserfecha_origenGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_origenGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_origenGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_origenGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_origenGuiaRemision.setDate(new Date());
		jDateChooserfecha_origenGuiaRemision.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_origenGuiaRemision.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_origenGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonfecha_origenGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_origenGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_origenGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_origenGuiaRemisionBusqueda.setText("U");
		this.jButtonfecha_origenGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_origenGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_origenGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_origenGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_origenGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_origenGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_origenGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_destinoGuiaRemision = new JLabelMe();
		this.jLabelfecha_destinoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_FECHADESTINO+" : *");
		this.jLabelfecha_destinoGuiaRemision.setToolTipText("Fecha Destino");
		this.jLabelfecha_destinoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_destinoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_destinoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_destinoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_destinoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_destinoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_FECHADESTINO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelfecha_destinoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		//jFormattedTextFieldfecha_destinoGuiaRemision= new JFormattedTextFieldMe();

		jDateChooserfecha_destinoGuiaRemision= new JDateChooser();
		jDateChooserfecha_destinoGuiaRemision.setEnabled(false);
		jDateChooserfecha_destinoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_destinoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_destinoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_destinoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_destinoGuiaRemision.setDate(new Date());
		jDateChooserfecha_destinoGuiaRemision.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_destinoGuiaRemision.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_destinoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonfecha_destinoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_destinoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_destinoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_destinoGuiaRemisionBusqueda.setText("U");
		this.jButtonfecha_destinoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_destinoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_destinoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_destinoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_destinoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_destinoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_destinoGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeltransporte_codigoGuiaRemision = new JLabelMe();
		this.jLabeltransporte_codigoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_TRANSPORTECODIGO+" :");
		this.jLabeltransporte_codigoGuiaRemision.setToolTipText("Transporte Codigo");
		this.jLabeltransporte_codigoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltransporte_codigoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltransporte_codigoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltransporte_codigoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltransporte_codigoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltransporte_codigoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_TRANSPORTECODIGO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPaneltransporte_codigoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextAreatransporte_codigoGuiaRemision= new JTextAreaMe();
		jTextAreatransporte_codigoGuiaRemision.setEnabled(false);
		jTextAreatransporte_codigoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatransporte_codigoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatransporte_codigoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatransporte_codigoGuiaRemision.setLineWrap(true);
		jTextAreatransporte_codigoGuiaRemision.setWrapStyleWord(true);
		jTextAreatransporte_codigoGuiaRemision.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatransporte_codigoGuiaRemision.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatransporte_codigoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetransporte_codigoGuiaRemision = new JScrollPane(jTextAreatransporte_codigoGuiaRemision);
		jscrollPanetransporte_codigoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetransporte_codigoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetransporte_codigoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtontransporte_codigoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtontransporte_codigoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransporte_codigoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontransporte_codigoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontransporte_codigoGuiaRemisionBusqueda.setText("U");
		this.jButtontransporte_codigoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontransporte_codigoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontransporte_codigoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatransporte_codigoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatransporte_codigoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"transporte_codigoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontransporte_codigoGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_bultosGuiaRemision = new JLabelMe();
		this.jLabelcantidad_bultosGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_CANTIDADBULTOS+" : *");
		this.jLabelcantidad_bultosGuiaRemision.setToolTipText("Cantidad Bultos");
		this.jLabelcantidad_bultosGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_bultosGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_bultosGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_bultosGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_bultosGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_bultosGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_CANTIDADBULTOS);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelcantidad_bultosGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldcantidad_bultosGuiaRemision= new JTextFieldMe();
		jTextFieldcantidad_bultosGuiaRemision.setEnabled(false);
		jTextFieldcantidad_bultosGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_bultosGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_bultosGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_bultosGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_bultosGuiaRemision.setText("0");

		this.jButtoncantidad_bultosGuiaRemisionBusqueda= new JButtonMe();
		this.jButtoncantidad_bultosGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_bultosGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_bultosGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_bultosGuiaRemisionBusqueda.setText("U");
		this.jButtoncantidad_bultosGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_bultosGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_bultosGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_bultosGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_bultosGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_bultosGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_bultosGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelhora_inicioGuiaRemision = new JLabelMe();
		this.jLabelhora_inicioGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_HORAINICIO+" : *");
		this.jLabelhora_inicioGuiaRemision.setToolTipText("Hora Inicio");
		this.jLabelhora_inicioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_inicioGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_inicioGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_inicioGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_HORAINICIO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelhora_inicioGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		//jFormattedTextFieldhora_inicioGuiaRemision= new JFormattedTextFieldMe();

		jSpinnerhora_inicioGuiaRemision= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_inicioGuiaRemision.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_inicioGuiaRemision = new JSpinner.DateEditor(jSpinnerhora_inicioGuiaRemision, "HH:mm:ss");

		jSpinnerhora_inicioGuiaRemision.setEditor(timeEditorhora_inicioGuiaRemision);

		jSpinnerhora_inicioGuiaRemision.setValue(new Date());

		jSpinnerhora_inicioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_inicioGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_inicioGuiaRemision.setValue(new Date());
		//jSpinnerhora_inicioGuiaRemision.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_inicioGuiaRemision.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_inicioGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonhora_inicioGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_inicioGuiaRemisionBusqueda.setText("U");
		this.jButtonhora_inicioGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_inicioGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_inicioGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_inicioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_inicioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_inicioGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_inicioGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelhora_finGuiaRemision = new JLabelMe();
		this.jLabelhora_finGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_HORAFIN+" : *");
		this.jLabelhora_finGuiaRemision.setToolTipText("Hora Fin");
		this.jLabelhora_finGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_finGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_finGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_finGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_HORAFIN);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelhora_finGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		//jFormattedTextFieldhora_finGuiaRemision= new JFormattedTextFieldMe();

		jSpinnerhora_finGuiaRemision= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_finGuiaRemision.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_finGuiaRemision = new JSpinner.DateEditor(jSpinnerhora_finGuiaRemision, "HH:mm:ss");

		jSpinnerhora_finGuiaRemision.setEditor(timeEditorhora_finGuiaRemision);

		jSpinnerhora_finGuiaRemision.setValue(new Date());

		jSpinnerhora_finGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_finGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_finGuiaRemision.setValue(new Date());
		//jSpinnerhora_finGuiaRemision.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_finGuiaRemision.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_finGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonhora_finGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_finGuiaRemisionBusqueda.setText("U");
		this.jButtonhora_finGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_finGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_finGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_finGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_finGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_finGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_finGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelcupoGuiaRemision = new JLabelMe();
		this.jLabelcupoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_CUPO+" : *");
		this.jLabelcupoGuiaRemision.setToolTipText("Cupo");
		this.jLabelcupoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcupoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcupoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcupoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcupoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcupoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_CUPO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelcupoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldcupoGuiaRemision= new JTextFieldMe();
		jTextFieldcupoGuiaRemision.setEnabled(false);
		jTextFieldcupoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcupoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcupoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcupoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcupoGuiaRemision.setText("0.0");

		this.jButtoncupoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtoncupoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncupoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncupoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncupoGuiaRemisionBusqueda.setText("U");
		this.jButtoncupoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncupoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncupoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcupoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcupoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cupoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncupoGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelsaldoGuiaRemision = new JLabelMe();
		this.jLabelsaldoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoGuiaRemision.setToolTipText("Saldo");
		this.jLabelsaldoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelsaldoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldsaldoGuiaRemision= new JTextFieldMe();
		jTextFieldsaldoGuiaRemision.setEnabled(false);
		jTextFieldsaldoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoGuiaRemision.setText("0.0");

		this.jButtonsaldoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonsaldoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoGuiaRemisionBusqueda.setText("U");
		this.jButtonsaldoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeldocumentoGuiaRemision = new JLabelMe();
		this.jLabeldocumentoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_DOCUMENTO+" : *");
		this.jLabeldocumentoGuiaRemision.setToolTipText("Documento");
		this.jLabeldocumentoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldocumentoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldocumentoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldocumentoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldocumentoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldocumentoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_DOCUMENTO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPaneldocumentoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFielddocumentoGuiaRemision= new JTextFieldMe();
		jTextFielddocumentoGuiaRemision.setEnabled(false);
		jTextFielddocumentoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddocumentoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddocumentoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddocumentoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddocumentoGuiaRemision.setText("0.0");

		this.jButtondocumentoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtondocumentoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondocumentoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondocumentoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondocumentoGuiaRemisionBusqueda.setText("U");
		this.jButtondocumentoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondocumentoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondocumentoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddocumentoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddocumentoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"documentoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondocumentoGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeldisponibleGuiaRemision = new JLabelMe();
		this.jLabeldisponibleGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_DISPONIBLE+" : *");
		this.jLabeldisponibleGuiaRemision.setToolTipText("Disponible");
		this.jLabeldisponibleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldisponibleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldisponibleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldisponibleGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_DISPONIBLE);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPaneldisponibleGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFielddisponibleGuiaRemision= new JTextFieldMe();
		jTextFielddisponibleGuiaRemision.setEnabled(false);
		jTextFielddisponibleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddisponibleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddisponibleGuiaRemision.setText("0.0");

		this.jButtondisponibleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtondisponibleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondisponibleGuiaRemisionBusqueda.setText("U");
		this.jButtondisponibleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondisponibleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondisponibleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddisponibleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddisponibleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"disponibleGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondisponibleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionGuiaRemision = new JLabelMe();
		this.jLabeldescripcionGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionGuiaRemision.setToolTipText("Descripcion");
		this.jLabeldescripcionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPaneldescripcionGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextAreadescripcionGuiaRemision= new JTextAreaMe();
		jTextAreadescripcionGuiaRemision.setEnabled(false);
		jTextAreadescripcionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionGuiaRemision.setLineWrap(true);
		jTextAreadescripcionGuiaRemision.setWrapStyleWord(true);
		jTextAreadescripcionGuiaRemision.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionGuiaRemision.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionGuiaRemision = new JScrollPane(jTextAreadescripcionGuiaRemision);
		jscrollPanedescripcionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedescripcionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedescripcionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtondescripcionGuiaRemisionBusqueda= new JButtonMe();
		this.jButtondescripcionGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionGuiaRemisionBusqueda.setText("U");
		this.jButtondescripcionGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaGuiaRemision = new JLabelMe();
		this.jLabeltotal_ivaGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaGuiaRemision.setToolTipText("Total Iva");
		this.jLabeltotal_ivaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPaneltotal_ivaGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldtotal_ivaGuiaRemision= new JTextFieldMe();
		jTextFieldtotal_ivaGuiaRemision.setEnabled(false);
		jTextFieldtotal_ivaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaGuiaRemision.setText("0.0");

		this.jButtontotal_ivaGuiaRemisionBusqueda= new JButtonMe();
		this.jButtontotal_ivaGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaGuiaRemisionBusqueda.setText("U");
		this.jButtontotal_ivaGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaGuiaRemision = new JLabelMe();
		this.jLabeltotal_sin_ivaGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaGuiaRemision.setToolTipText("Total Sin Iva");
		this.jLabeltotal_sin_ivaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPaneltotal_sin_ivaGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldtotal_sin_ivaGuiaRemision= new JTextFieldMe();
		jTextFieldtotal_sin_ivaGuiaRemision.setEnabled(false);
		jTextFieldtotal_sin_ivaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaGuiaRemision.setText("0.0");

		this.jButtontotal_sin_ivaGuiaRemisionBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaGuiaRemisionBusqueda.setText("U");
		this.jButtontotal_sin_ivaGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoGuiaRemision = new JLabelMe();
		this.jLabeldescuentoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoGuiaRemision.setToolTipText("Descuento");
		this.jLabeldescuentoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPaneldescuentoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFielddescuentoGuiaRemision= new JTextFieldMe();
		jTextFielddescuentoGuiaRemision.setEnabled(false);
		jTextFielddescuentoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoGuiaRemision.setText("0.0");

		this.jButtondescuentoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtondescuentoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoGuiaRemisionBusqueda.setText("U");
		this.jButtondescuentoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelfleteGuiaRemision = new JLabelMe();
		this.jLabelfleteGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteGuiaRemision.setToolTipText("Flete");
		this.jLabelfleteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelfleteGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldfleteGuiaRemision= new JTextFieldMe();
		jTextFieldfleteGuiaRemision.setEnabled(false);
		jTextFieldfleteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteGuiaRemision.setText("0.0");

		this.jButtonfleteGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonfleteGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteGuiaRemisionBusqueda.setText("U");
		this.jButtonfleteGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelotroGuiaRemision = new JLabelMe();
		this.jLabelotroGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_OTRO+" : *");
		this.jLabelotroGuiaRemision.setToolTipText("Otro");
		this.jLabelotroGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotroGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotroGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotroGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_OTRO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelotroGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldotroGuiaRemision= new JTextFieldMe();
		jTextFieldotroGuiaRemision.setEnabled(false);
		jTextFieldotroGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotroGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotroGuiaRemision.setText("0.0");

		this.jButtonotroGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonotroGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotroGuiaRemisionBusqueda.setText("U");
		this.jButtonotroGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotroGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotroGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotroGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotroGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otroGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotroGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoGuiaRemision = new JLabelMe();
		this.jLabelfinanciamientoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoGuiaRemision.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelfinanciamientoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldfinanciamientoGuiaRemision= new JTextFieldMe();
		jTextFieldfinanciamientoGuiaRemision.setEnabled(false);
		jTextFieldfinanciamientoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoGuiaRemision.setText("0.0");

		this.jButtonfinanciamientoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonfinanciamientoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoGuiaRemisionBusqueda.setText("U");
		this.jButtonfinanciamientoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelivaGuiaRemision = new JLabelMe();
		this.jLabelivaGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaGuiaRemision.setToolTipText("Iva");
		this.jLabelivaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelivaGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldivaGuiaRemision= new JTextFieldMe();
		jTextFieldivaGuiaRemision.setEnabled(false);
		jTextFieldivaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaGuiaRemision.setText("0.0");

		this.jButtonivaGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonivaGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaGuiaRemisionBusqueda.setText("U");
		this.jButtonivaGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeltotalGuiaRemision = new JLabelMe();
		this.jLabeltotalGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalGuiaRemision.setToolTipText("Total");
		this.jLabeltotalGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPaneltotalGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldtotalGuiaRemision= new JTextFieldMe();
		jTextFieldtotalGuiaRemision.setEnabled(false);
		jTextFieldtotalGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalGuiaRemision.setText("0.0");

		this.jButtontotalGuiaRemisionBusqueda= new JButtonMe();
		this.jButtontotalGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalGuiaRemisionBusqueda.setText("U");
		this.jButtontotalGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelmonto_retencionGuiaRemision = new JLabelMe();
		this.jLabelmonto_retencionGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_MONTORETENCION+" : *");
		this.jLabelmonto_retencionGuiaRemision.setToolTipText("Monto Retencion");
		this.jLabelmonto_retencionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_retencionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_retencionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_retencionGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_retencionGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_retencionGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_MONTORETENCION);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelmonto_retencionGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldmonto_retencionGuiaRemision= new JTextFieldMe();
		jTextFieldmonto_retencionGuiaRemision.setEnabled(false);
		jTextFieldmonto_retencionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_retencionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_retencionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_retencionGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_retencionGuiaRemision.setText("0.0");

		this.jButtonmonto_retencionGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonmonto_retencionGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_retencionGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_retencionGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_retencionGuiaRemisionBusqueda.setText("U");
		this.jButtonmonto_retencionGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_retencionGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_retencionGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_retencionGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_retencionGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_retencionGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_retencionGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelfechaGuiaRemision = new JLabelMe();
		this.jLabelfechaGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaGuiaRemision.setToolTipText("Fecha");
		this.jLabelfechaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelfechaGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		//jFormattedTextFieldfechaGuiaRemision= new JFormattedTextFieldMe();

		jDateChooserfechaGuiaRemision= new JDateChooser();
		jDateChooserfechaGuiaRemision.setEnabled(false);
		jDateChooserfechaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaGuiaRemision.setDate(new Date());
		jDateChooserfechaGuiaRemision.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaGuiaRemision.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonfechaGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaGuiaRemisionBusqueda.setText("U");
		this.jButtonfechaGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelruc_clienteGuiaRemision = new JLabelMe();
		this.jLabelruc_clienteGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_RUCCLIENTE+" :");
		this.jLabelruc_clienteGuiaRemision.setToolTipText("Ruc Cliente");
		this.jLabelruc_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_clienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_clienteGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_clienteGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_RUCCLIENTE);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelruc_clienteGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldruc_clienteGuiaRemision= new JTextFieldMe();

		jTextFieldruc_clienteGuiaRemision.setEnabled(false);
		jTextFieldruc_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_clienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_clienteGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonruc_clienteGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clienteGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clienteGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_clienteGuiaRemisionBusqueda.setText("U");
		this.jButtonruc_clienteGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_clienteGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_clienteGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_clienteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_clienteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_clienteGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_clienteGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteGuiaRemision = new JLabelMe();
		this.jLabelnombre_clienteGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteGuiaRemision.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelnombre_clienteGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextAreanombre_clienteGuiaRemision= new JTextAreaMe();
		jTextAreanombre_clienteGuiaRemision.setEnabled(false);
		jTextAreanombre_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteGuiaRemision.setLineWrap(true);
		jTextAreanombre_clienteGuiaRemision.setWrapStyleWord(true);
		jTextAreanombre_clienteGuiaRemision.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteGuiaRemision.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteGuiaRemision = new JScrollPane(jTextAreanombre_clienteGuiaRemision);
		jscrollPanenombre_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_clienteGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonnombre_clienteGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteGuiaRemisionBusqueda.setText("U");
		this.jButtonnombre_clienteGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_clienteGuiaRemision = new JLabelMe();
		this.jLabeltelefono_clienteGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_TELEFONOCLIENTE+" :");
		this.jLabeltelefono_clienteGuiaRemision.setToolTipText("Telefono Cliente");
		this.jLabeltelefono_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_clienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_clienteGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_clienteGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_TELEFONOCLIENTE);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPaneltelefono_clienteGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextAreatelefono_clienteGuiaRemision= new JTextAreaMe();
		jTextAreatelefono_clienteGuiaRemision.setEnabled(false);
		jTextAreatelefono_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_clienteGuiaRemision.setLineWrap(true);
		jTextAreatelefono_clienteGuiaRemision.setWrapStyleWord(true);
		jTextAreatelefono_clienteGuiaRemision.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_clienteGuiaRemision.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_clienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_clienteGuiaRemision = new JScrollPane(jTextAreatelefono_clienteGuiaRemision);
		jscrollPanetelefono_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetelefono_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetelefono_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtontelefono_clienteGuiaRemisionBusqueda= new JButtonMe();
		this.jButtontelefono_clienteGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_clienteGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_clienteGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_clienteGuiaRemisionBusqueda.setText("U");
		this.jButtontelefono_clienteGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_clienteGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_clienteGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_clienteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_clienteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_clienteGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_clienteGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_clienteGuiaRemision = new JLabelMe();
		this.jLabeldireccion_clienteGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_DIRECCIONCLIENTE+" :");
		this.jLabeldireccion_clienteGuiaRemision.setToolTipText("Direccion Cliente");
		this.jLabeldireccion_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_clienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_clienteGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_clienteGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_DIRECCIONCLIENTE);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPaneldireccion_clienteGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextAreadireccion_clienteGuiaRemision= new JTextAreaMe();
		jTextAreadireccion_clienteGuiaRemision.setEnabled(false);
		jTextAreadireccion_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clienteGuiaRemision.setLineWrap(true);
		jTextAreadireccion_clienteGuiaRemision.setWrapStyleWord(true);
		jTextAreadireccion_clienteGuiaRemision.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_clienteGuiaRemision.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_clienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_clienteGuiaRemision = new JScrollPane(jTextAreadireccion_clienteGuiaRemision);
		jscrollPanedireccion_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccion_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccion_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondireccion_clienteGuiaRemisionBusqueda= new JButtonMe();
		this.jButtondireccion_clienteGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_clienteGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_clienteGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_clienteGuiaRemisionBusqueda.setText("U");
		this.jButtondireccion_clienteGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_clienteGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_clienteGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_clienteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_clienteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_clienteGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_clienteGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impresoGuiaRemision = new JLabelMe();
		this.jLabelnumero_pre_impresoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_NUMEROPREIMPRESO+" :");
		this.jLabelnumero_pre_impresoGuiaRemision.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelnumero_pre_impresoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldnumero_pre_impresoGuiaRemision= new JTextFieldMe();

		jTextFieldnumero_pre_impresoGuiaRemision.setEnabled(false);
		jTextFieldnumero_pre_impresoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoGuiaRemisionBusqueda.setText("U");
		this.jButtonnumero_pre_impresoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelpeso_brutoGuiaRemision = new JLabelMe();
		this.jLabelpeso_brutoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_PESOBRUTO+" : *");
		this.jLabelpeso_brutoGuiaRemision.setToolTipText("Peso Bruto");
		this.jLabelpeso_brutoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpeso_brutoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpeso_brutoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpeso_brutoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpeso_brutoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpeso_brutoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_PESOBRUTO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelpeso_brutoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jTextFieldpeso_brutoGuiaRemision= new JTextFieldMe();
		jTextFieldpeso_brutoGuiaRemision.setEnabled(false);
		jTextFieldpeso_brutoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpeso_brutoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpeso_brutoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpeso_brutoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpeso_brutoGuiaRemision.setText("0.0");

		this.jButtonpeso_brutoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonpeso_brutoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpeso_brutoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpeso_brutoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpeso_brutoGuiaRemisionBusqueda.setText("U");
		this.jButtonpeso_brutoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpeso_brutoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpeso_brutoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpeso_brutoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpeso_brutoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"peso_brutoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpeso_brutoGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_autorizacionGuiaRemision = new JLabelMe();
		this.jLabelfecha_autorizacionGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_FECHAAUTORIZACION+" : *");
		this.jLabelfecha_autorizacionGuiaRemision.setToolTipText("Fecha Autorizacion");
		this.jLabelfecha_autorizacionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_autorizacionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_autorizacionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_autorizacionGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_autorizacionGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_autorizacionGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_FECHAAUTORIZACION);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelfecha_autorizacionGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		//jFormattedTextFieldfecha_autorizacionGuiaRemision= new JFormattedTextFieldMe();

		jDateChooserfecha_autorizacionGuiaRemision= new JDateChooser();
		jDateChooserfecha_autorizacionGuiaRemision.setEnabled(false);
		jDateChooserfecha_autorizacionGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autorizacionGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autorizacionGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_autorizacionGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_autorizacionGuiaRemision.setDate(new Date());
		jDateChooserfecha_autorizacionGuiaRemision.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_autorizacionGuiaRemision.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_autorizacionGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonfecha_autorizacionGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autorizacionGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autorizacionGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_autorizacionGuiaRemisionBusqueda.setText("U");
		this.jButtonfecha_autorizacionGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_autorizacionGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_autorizacionGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_autorizacionGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_autorizacionGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_autorizacionGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_autorizacionGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoGuiaRemision = new JLabelMe();
		this.jLabelfecha_vencimientoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoGuiaRemision.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelfecha_vencimientoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		//jFormattedTextFieldfecha_vencimientoGuiaRemision= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoGuiaRemision= new JDateChooser();
		jDateChooserfecha_vencimientoGuiaRemision.setEnabled(false);
		jDateChooserfecha_vencimientoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoGuiaRemision.setDate(new Date());
		jDateChooserfecha_vencimientoGuiaRemision.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoGuiaRemision.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoGuiaRemisionBusqueda.setText("U");
		this.jButtonfecha_vencimientoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoGuiaRemisionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGuiaRemision() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGuiaRemision = new JLabelMe();
		this.jLabelid_empresaGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGuiaRemision.setToolTipText("Empresa");
		this.jLabelid_empresaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_empresaGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_empresaGuiaRemision= new JComboBoxMe();
		jComboBoxid_empresaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGuiaRemision.setEnabled(false);

		this.jButtonid_empresaGuiaRemision= new JButtonMe();
		this.jButtonid_empresaGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGuiaRemision.setText("Buscar");
		this.jButtonid_empresaGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGuiaRemision"));

		this.jButtonid_empresaGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_empresaGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGuiaRemisionBusqueda.setText("U");
		this.jButtonid_empresaGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_empresaGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_empresaGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGuiaRemisionUpdate.setText("U");
		this.jButtonid_empresaGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGuiaRemisionUpdate"));



					
		this.jLabelid_sucursalGuiaRemision = new JLabelMe();
		this.jLabelid_sucursalGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalGuiaRemision.setToolTipText("Sucursal");
		this.jLabelid_sucursalGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_sucursalGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_sucursalGuiaRemision= new JComboBoxMe();
		jComboBoxid_sucursalGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalGuiaRemision.setEnabled(false);

		this.jButtonid_sucursalGuiaRemision= new JButtonMe();
		this.jButtonid_sucursalGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalGuiaRemision.setText("Buscar");
		this.jButtonid_sucursalGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGuiaRemision"));

		this.jButtonid_sucursalGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_sucursalGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalGuiaRemisionBusqueda.setText("U");
		this.jButtonid_sucursalGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_sucursalGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalGuiaRemisionUpdate.setText("U");
		this.jButtonid_sucursalGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalGuiaRemisionUpdate"));



					
		this.jLabelid_ejercicioGuiaRemision = new JLabelMe();
		this.jLabelid_ejercicioGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioGuiaRemision.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_ejercicioGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_ejercicioGuiaRemision= new JComboBoxMe();
		jComboBoxid_ejercicioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioGuiaRemision.setEnabled(false);

		this.jButtonid_ejercicioGuiaRemision= new JButtonMe();
		this.jButtonid_ejercicioGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioGuiaRemision.setText("Buscar");
		this.jButtonid_ejercicioGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioGuiaRemision"));

		this.jButtonid_ejercicioGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_ejercicioGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioGuiaRemisionBusqueda.setText("U");
		this.jButtonid_ejercicioGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_ejercicioGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioGuiaRemisionUpdate.setText("U");
		this.jButtonid_ejercicioGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioGuiaRemisionUpdate"));



					
		this.jLabelid_periodoGuiaRemision = new JLabelMe();
		this.jLabelid_periodoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoGuiaRemision.setToolTipText("Periodo");
		this.jLabelid_periodoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_periodoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_periodoGuiaRemision= new JComboBoxMe();
		jComboBoxid_periodoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoGuiaRemision.setEnabled(false);

		this.jButtonid_periodoGuiaRemision= new JButtonMe();
		this.jButtonid_periodoGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoGuiaRemision.setText("Buscar");
		this.jButtonid_periodoGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoGuiaRemision"));

		this.jButtonid_periodoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_periodoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoGuiaRemisionBusqueda.setText("U");
		this.jButtonid_periodoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_periodoGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_periodoGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoGuiaRemisionUpdate.setText("U");
		this.jButtonid_periodoGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoGuiaRemisionUpdate"));



					
		this.jLabelid_usuarioGuiaRemision = new JLabelMe();
		this.jLabelid_usuarioGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioGuiaRemision.setToolTipText("Usuario");
		this.jLabelid_usuarioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_usuarioGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_usuarioGuiaRemision= new JComboBoxMe();
		jComboBoxid_usuarioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioGuiaRemision.setEnabled(false);

		this.jButtonid_usuarioGuiaRemision= new JButtonMe();
		this.jButtonid_usuarioGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioGuiaRemision.setText("Buscar");
		this.jButtonid_usuarioGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioGuiaRemision"));

		this.jButtonid_usuarioGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_usuarioGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioGuiaRemisionBusqueda.setText("U");
		this.jButtonid_usuarioGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_usuarioGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_usuarioGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioGuiaRemisionUpdate.setText("U");
		this.jButtonid_usuarioGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioGuiaRemisionUpdate"));



					
		this.jLabelid_formatoGuiaRemision = new JLabelMe();
		this.jLabelid_formatoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDFORMATO+" :");
		this.jLabelid_formatoGuiaRemision.setToolTipText("Formato");
		this.jLabelid_formatoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_formatoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_formatoGuiaRemision= new JComboBoxMe();
		jComboBoxid_formatoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoGuiaRemision= new JButtonMe();
		this.jButtonid_formatoGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoGuiaRemision.setText("Buscar");
		this.jButtonid_formatoGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoGuiaRemision"));

		this.jButtonid_formatoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_formatoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoGuiaRemisionBusqueda.setText("U");
		this.jButtonid_formatoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_formatoGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_formatoGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoGuiaRemisionUpdate.setText("U");
		this.jButtonid_formatoGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoGuiaRemisionUpdate"));



					
		this.jLabelid_tipo_precioGuiaRemision = new JLabelMe();
		this.jLabelid_tipo_precioGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioGuiaRemision.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_tipo_precioGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_tipo_precioGuiaRemision= new JComboBoxMe();
		jComboBoxid_tipo_precioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioGuiaRemision= new JButtonMe();
		this.jButtonid_tipo_precioGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioGuiaRemision.setText("Buscar");
		this.jButtonid_tipo_precioGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioGuiaRemision"));

		this.jButtonid_tipo_precioGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioGuiaRemisionBusqueda.setText("U");
		this.jButtonid_tipo_precioGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_tipo_precioGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioGuiaRemisionUpdate.setText("U");
		this.jButtonid_tipo_precioGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioGuiaRemisionUpdate"));



					
		this.jLabelid_monedaGuiaRemision = new JLabelMe();
		this.jLabelid_monedaGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaGuiaRemision.setToolTipText("Moneda");
		this.jLabelid_monedaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_monedaGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_monedaGuiaRemision= new JComboBoxMe();
		jComboBoxid_monedaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaGuiaRemision= new JButtonMe();
		this.jButtonid_monedaGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaGuiaRemision.setText("Buscar");
		this.jButtonid_monedaGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaGuiaRemision"));

		this.jButtonid_monedaGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_monedaGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaGuiaRemisionBusqueda.setText("U");
		this.jButtonid_monedaGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_monedaGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_monedaGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaGuiaRemisionUpdate.setText("U");
		this.jButtonid_monedaGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaGuiaRemisionUpdate"));



					
		this.jLabelid_clienteGuiaRemision = new JLabelMe();
		this.jLabelid_clienteGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteGuiaRemision.setToolTipText("Cliente");
		this.jLabelid_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_clienteGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_clienteGuiaRemision= new JComboBoxMe();
		jComboBoxid_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteGuiaRemision= new JButtonMe();
		this.jButtonid_clienteGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteGuiaRemision.setText("Buscar");
		this.jButtonid_clienteGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteGuiaRemision"));

		this.jButtonid_clienteGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_clienteGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteGuiaRemisionBusqueda.setText("U");
		this.jButtonid_clienteGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_clienteGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_clienteGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteGuiaRemisionUpdate.setText("U");
		this.jButtonid_clienteGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteGuiaRemisionUpdate"));



					
		this.jLabelid_vendedorGuiaRemision = new JLabelMe();
		this.jLabelid_vendedorGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDVENDEDOR+" :");
		this.jLabelid_vendedorGuiaRemision.setToolTipText("Vendedor");
		this.jLabelid_vendedorGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_vendedorGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_vendedorGuiaRemision= new JComboBoxMe();
		jComboBoxid_vendedorGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorGuiaRemision= new JButtonMe();
		this.jButtonid_vendedorGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorGuiaRemision.setText("Buscar");
		this.jButtonid_vendedorGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorGuiaRemision"));

		this.jButtonid_vendedorGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_vendedorGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorGuiaRemisionBusqueda.setText("U");
		this.jButtonid_vendedorGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_vendedorGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_vendedorGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorGuiaRemisionUpdate.setText("U");
		this.jButtonid_vendedorGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorGuiaRemisionUpdate"));


		jButtonid_vendedorGuiaRemisionArbol= new JButtonMe();
		jButtonid_vendedorGuiaRemisionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorGuiaRemisionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorGuiaRemisionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorGuiaRemisionArbol.setText("Arbol");
		jButtonid_vendedorGuiaRemisionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorGuiaRemisionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorGuiaRemisionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorGuiaRemisionArbol"));



					
		this.jLabelid_facturaGuiaRemision = new JLabelMe();
		this.jLabelid_facturaGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDFACTURA+" :");
		this.jLabelid_facturaGuiaRemision.setToolTipText("Factura");
		this.jLabelid_facturaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_facturaGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_facturaGuiaRemision= new JComboBoxMe();
		jComboBoxid_facturaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaGuiaRemision= new JButtonMe();
		this.jButtonid_facturaGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaGuiaRemision.setText("Buscar");
		this.jButtonid_facturaGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaGuiaRemision"));

		this.jButtonid_facturaGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_facturaGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaGuiaRemisionBusqueda.setText("U");
		this.jButtonid_facturaGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_facturaGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_facturaGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaGuiaRemisionUpdate.setText("U");
		this.jButtonid_facturaGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaGuiaRemisionUpdate"));



					
		this.jLabelid_transportistaGuiaRemision = new JLabelMe();
		this.jLabelid_transportistaGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDTRANSPORTISTA+" :");
		this.jLabelid_transportistaGuiaRemision.setToolTipText("Transportista");
		this.jLabelid_transportistaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportistaGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportistaGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDTRANSPORTISTA);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_transportistaGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_transportistaGuiaRemision= new JComboBoxMe();
		jComboBoxid_transportistaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transportistaGuiaRemision= new JButtonMe();
		this.jButtonid_transportistaGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaGuiaRemision.setText("Buscar");
		this.jButtonid_transportistaGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportistaGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportistaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaGuiaRemision"));

		this.jButtonid_transportistaGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_transportistaGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaGuiaRemisionBusqueda.setText("U");
		this.jButtonid_transportistaGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportistaGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportistaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportistaGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_transportistaGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_transportistaGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaGuiaRemisionUpdate.setText("U");
		this.jButtonid_transportistaGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportistaGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportistaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaGuiaRemisionUpdate"));



					
		this.jLabelid_consultorGuiaRemision = new JLabelMe();
		this.jLabelid_consultorGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDCONSULTOR+" : *");
		this.jLabelid_consultorGuiaRemision.setToolTipText("Consultor");
		this.jLabelid_consultorGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consultorGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consultorGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_consultorGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_consultorGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_consultorGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDCONSULTOR);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_consultorGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_consultorGuiaRemision= new JComboBoxMe();
		jComboBoxid_consultorGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consultorGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consultorGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consultorGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_consultorGuiaRemision= new JButtonMe();
		this.jButtonid_consultorGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consultorGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consultorGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consultorGuiaRemision.setText("Buscar");
		this.jButtonid_consultorGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_consultorGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consultorGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_consultorGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consultorGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consultorGuiaRemision"));

		this.jButtonid_consultorGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_consultorGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consultorGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consultorGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consultorGuiaRemisionBusqueda.setText("U");
		this.jButtonid_consultorGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_consultorGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consultorGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_consultorGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consultorGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consultorGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_consultorGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_consultorGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_consultorGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consultorGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consultorGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consultorGuiaRemisionUpdate.setText("U");
		this.jButtonid_consultorGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_consultorGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consultorGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_consultorGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consultorGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consultorGuiaRemisionUpdate"));



					
		this.jLabelid_transporteGuiaRemision = new JLabelMe();
		this.jLabelid_transporteGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDTRANSPORTE+" : *");
		this.jLabelid_transporteGuiaRemision.setToolTipText("Transporte");
		this.jLabelid_transporteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transporteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transporteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transporteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transporteGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transporteGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDTRANSPORTE);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_transporteGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_transporteGuiaRemision= new JComboBoxMe();
		jComboBoxid_transporteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transporteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transporteGuiaRemision= new JButtonMe();
		this.jButtonid_transporteGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteGuiaRemision.setText("Buscar");
		this.jButtonid_transporteGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transporteGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transporteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteGuiaRemision"));

		this.jButtonid_transporteGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_transporteGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transporteGuiaRemisionBusqueda.setText("U");
		this.jButtonid_transporteGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transporteGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transporteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transporteGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_transporteGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_transporteGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transporteGuiaRemisionUpdate.setText("U");
		this.jButtonid_transporteGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transporteGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transporteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteGuiaRemisionUpdate"));



					
		this.jLabelid_sub_clienteGuiaRemision = new JLabelMe();
		this.jLabelid_sub_clienteGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDSUBCLIENTE+" : *");
		this.jLabelid_sub_clienteGuiaRemision.setToolTipText("Sub Cliente");
		this.jLabelid_sub_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sub_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sub_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sub_clienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sub_clienteGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sub_clienteGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDSUBCLIENTE);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_sub_clienteGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_sub_clienteGuiaRemision= new JComboBoxMe();
		jComboBoxid_sub_clienteGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_clienteGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sub_clienteGuiaRemision= new JButtonMe();
		this.jButtonid_sub_clienteGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clienteGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clienteGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clienteGuiaRemision.setText("Buscar");
		this.jButtonid_sub_clienteGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sub_clienteGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clienteGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sub_clienteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clienteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clienteGuiaRemision"));

		this.jButtonid_sub_clienteGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_sub_clienteGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_clienteGuiaRemisionBusqueda.setText("U");
		this.jButtonid_sub_clienteGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sub_clienteGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clienteGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sub_clienteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clienteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clienteGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sub_clienteGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_sub_clienteGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_sub_clienteGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_clienteGuiaRemisionUpdate.setText("U");
		this.jButtonid_sub_clienteGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sub_clienteGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clienteGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sub_clienteGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clienteGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clienteGuiaRemisionUpdate"));



					
		this.jLabelid_empleadoGuiaRemision = new JLabelMe();
		this.jLabelid_empleadoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoGuiaRemision.setToolTipText("Empleado");
		this.jLabelid_empleadoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_empleadoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_empleadoGuiaRemision= new JComboBoxMe();
		jComboBoxid_empleadoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoGuiaRemision= new JButtonMe();
		this.jButtonid_empleadoGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoGuiaRemision.setText("Buscar");
		this.jButtonid_empleadoGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoGuiaRemision"));

		this.jButtonid_empleadoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_empleadoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoGuiaRemisionBusqueda.setText("U");
		this.jButtonid_empleadoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_empleadoGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_empleadoGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoGuiaRemisionUpdate.setText("U");
		this.jButtonid_empleadoGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoGuiaRemisionUpdate"));



					
		this.jLabelid_ciudad_origenGuiaRemision = new JLabelMe();
		this.jLabelid_ciudad_origenGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDCIUDADORIGEN+" :");
		this.jLabelid_ciudad_origenGuiaRemision.setToolTipText("Ciudad Origen");
		this.jLabelid_ciudad_origenGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudad_origenGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudad_origenGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudad_origenGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudad_origenGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudad_origenGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDCIUDADORIGEN);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_ciudad_origenGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_ciudad_origenGuiaRemision= new JComboBoxMe();
		jComboBoxid_ciudad_origenGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudad_origenGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudad_origenGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudad_origenGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudad_origenGuiaRemision= new JButtonMe();
		this.jButtonid_ciudad_origenGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudad_origenGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudad_origenGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudad_origenGuiaRemision.setText("Buscar");
		this.jButtonid_ciudad_origenGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudad_origenGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudad_origenGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudad_origenGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudad_origenGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudad_origenGuiaRemision"));

		this.jButtonid_ciudad_origenGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_ciudad_origenGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudad_origenGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudad_origenGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudad_origenGuiaRemisionBusqueda.setText("U");
		this.jButtonid_ciudad_origenGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudad_origenGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudad_origenGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudad_origenGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudad_origenGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudad_origenGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudad_origenGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_ciudad_origenGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_ciudad_origenGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudad_origenGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudad_origenGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudad_origenGuiaRemisionUpdate.setText("U");
		this.jButtonid_ciudad_origenGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudad_origenGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudad_origenGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudad_origenGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudad_origenGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudad_origenGuiaRemisionUpdate"));



					
		this.jLabelid_ciudad_destinoGuiaRemision = new JLabelMe();
		this.jLabelid_ciudad_destinoGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDCIUDADDESTINO+" :");
		this.jLabelid_ciudad_destinoGuiaRemision.setToolTipText("Ciudad Destino");
		this.jLabelid_ciudad_destinoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudad_destinoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudad_destinoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudad_destinoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudad_destinoGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudad_destinoGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDCIUDADDESTINO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_ciudad_destinoGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_ciudad_destinoGuiaRemision= new JComboBoxMe();
		jComboBoxid_ciudad_destinoGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudad_destinoGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudad_destinoGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudad_destinoGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudad_destinoGuiaRemision= new JButtonMe();
		this.jButtonid_ciudad_destinoGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudad_destinoGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudad_destinoGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudad_destinoGuiaRemision.setText("Buscar");
		this.jButtonid_ciudad_destinoGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudad_destinoGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudad_destinoGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudad_destinoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudad_destinoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudad_destinoGuiaRemision"));

		this.jButtonid_ciudad_destinoGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_ciudad_destinoGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudad_destinoGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudad_destinoGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudad_destinoGuiaRemisionBusqueda.setText("U");
		this.jButtonid_ciudad_destinoGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudad_destinoGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudad_destinoGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudad_destinoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudad_destinoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudad_destinoGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudad_destinoGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_ciudad_destinoGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_ciudad_destinoGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudad_destinoGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudad_destinoGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudad_destinoGuiaRemisionUpdate.setText("U");
		this.jButtonid_ciudad_destinoGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudad_destinoGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudad_destinoGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudad_destinoGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudad_destinoGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudad_destinoGuiaRemisionUpdate"));



					
		this.jLabelid_tipo_llamadaGuiaRemision = new JLabelMe();
		this.jLabelid_tipo_llamadaGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDTIPOLLAMADA+" : *");
		this.jLabelid_tipo_llamadaGuiaRemision.setToolTipText("Tipo Llamada");
		this.jLabelid_tipo_llamadaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_llamadaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_llamadaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_llamadaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_llamadaGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_llamadaGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDTIPOLLAMADA);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_tipo_llamadaGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_tipo_llamadaGuiaRemision= new JComboBoxMe();
		jComboBoxid_tipo_llamadaGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_llamadaGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_llamadaGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_llamadaGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_llamadaGuiaRemision= new JButtonMe();
		this.jButtonid_tipo_llamadaGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_llamadaGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_llamadaGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_llamadaGuiaRemision.setText("Buscar");
		this.jButtonid_tipo_llamadaGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_llamadaGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_llamadaGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_llamadaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_llamadaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_llamadaGuiaRemision"));

		this.jButtonid_tipo_llamadaGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_tipo_llamadaGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_llamadaGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_llamadaGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_llamadaGuiaRemisionBusqueda.setText("U");
		this.jButtonid_tipo_llamadaGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_llamadaGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_llamadaGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_llamadaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_llamadaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_llamadaGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_llamadaGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_llamadaGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_tipo_llamadaGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_llamadaGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_llamadaGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_llamadaGuiaRemisionUpdate.setText("U");
		this.jButtonid_tipo_llamadaGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_llamadaGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_llamadaGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_llamadaGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_llamadaGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_llamadaGuiaRemisionUpdate"));



					
		this.jLabelid_tipo_cambioGuiaRemision = new JLabelMe();
		this.jLabelid_tipo_cambioGuiaRemision.setText(""+GuiaRemisionConstantesFunciones.LABEL_IDTIPOCAMBIO+" : *");
		this.jLabelid_tipo_cambioGuiaRemision.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioGuiaRemision.setToolTipText(GuiaRemisionConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutGuiaRemision = new GridBagLayout();
		this.jPanelid_tipo_cambioGuiaRemision.setLayout(this.gridaBagLayoutGuiaRemision);


		jComboBoxid_tipo_cambioGuiaRemision= new JComboBoxMe();
		jComboBoxid_tipo_cambioGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_cambioGuiaRemision.setEnabled(false);

		this.jButtonid_tipo_cambioGuiaRemision= new JButtonMe();
		this.jButtonid_tipo_cambioGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioGuiaRemision.setText("Buscar");
		this.jButtonid_tipo_cambioGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioGuiaRemision"));

		this.jButtonid_tipo_cambioGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioGuiaRemisionBusqueda.setText("U");
		this.jButtonid_tipo_cambioGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioGuiaRemisionBusqueda"));

		if(this.guiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioGuiaRemisionUpdate.setText("U");
		this.jButtonid_tipo_cambioGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioGuiaRemisionUpdate"));



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
		//this.jInternalFrameDetalleGuiaRemision = new GuiaRemisionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Guia Remision DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGuiaRemision= new GridBagLayout();
		

		
		String sToolTipGuiaRemision="";
		sToolTipGuiaRemision=GuiaRemisionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGuiaRemision+="(Facturacion.GuiaRemision)";
		}
		
		if(!this.guiaremisionSessionBean.getEsGuardarRelacionado()) {
			sToolTipGuiaRemision+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGuiaRemision = new JButtonMe();
		this.jButtonModificarGuiaRemision = new JButtonMe();
        this.jButtonActualizarGuiaRemision = new JButtonMe();
        this.jButtonEliminarGuiaRemision = new JButtonMe();
        this.jButtonCancelarGuiaRemision = new JButtonMe();
        this.jButtonGuardarCambiosGuiaRemision = new JButtonMe();
		this.jButtonGuardarCambiosTablaGuiaRemision = new JButtonMe();
		this.jButtonCerrarGuiaRemision = new JButtonMe();
		
		this.jScrollPanelDatosGuiaRemision = new JScrollPane();   
        this.jScrollPanelDatosEdicionGuiaRemision = new JScrollPane();
		this.jScrollPanelDatosGeneralGuiaRemision = new JScrollPane();
				
		
		
		this.jPanelCamposGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Guia Remision";
		
		if(!this.guiaremisionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guia Remisiones" + this.sPath));
		} else {
			this.jScrollPanelDatosGuiaRemision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposGuiaRemision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposGuiaRemision.setName("jPanelCamposGuiaRemision"); 

		this.jPanelCamposOcultosGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGuiaRemision.setName("jPanelCamposOcultosGuiaRemision"); 

        this.jPanelAccionesGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGuiaRemision.setToolTipText("Acciones");
        this.jPanelAccionesGuiaRemision.setName("Acciones"); 

		this.jPanelAccionesFormularioGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGuiaRemision.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGuiaRemision.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalGuiaRemision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalGuiaRemision.setName("jPanelCamposFintotalGuiaRemision");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGuiaRemision.setText("Nuevo");
		this.jButtonModificarGuiaRemision.setText("Editar");
        this.jButtonActualizarGuiaRemision.setText("Actualizar");
        this.jButtonEliminarGuiaRemision.setText("Eliminar");
        this.jButtonCancelarGuiaRemision.setText("Cancelar");
        this.jButtonGuardarCambiosGuiaRemision.setText("Guardar");
		this.jButtonGuardarCambiosTablaGuiaRemision.setText("Guardar");
		this.jButtonCerrarGuiaRemision.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuiaRemision,"nuevo_button","Nuevo",this.guiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGuiaRemision,"modificar_button","Editar",this.guiaremisionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGuiaRemision,"actualizar_button","Actualizar",this.guiaremisionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGuiaRemision,"eliminar_button","Eliminar",this.guiaremisionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGuiaRemision,"cancelar_button","Cancelar",this.guiaremisionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGuiaRemision,"guardarcambios_button","Guardar",this.guiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGuiaRemision,"guardarcambiostabla_button","Guardar",this.guiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGuiaRemision,"cerrar_button","Salir",this.guiaremisionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGuiaRemision.setToolTipText("Nuevo"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGuiaRemision.setToolTipText("Editar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGuiaRemision.setToolTipText("Actualizar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGuiaRemision.setToolTipText("Eliminar)"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGuiaRemision.setToolTipText("Cancelar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGuiaRemision.setToolTipText("Guardar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGuiaRemision.setToolTipText("Guardar"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGuiaRemision.setToolTipText("Salir"+" "+GuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGuiaRemision";
		inputMap = this.jButtonNuevoGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGuiaRemision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGuiaRemision"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGuiaRemision";
		inputMap = this.jButtonActualizarGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGuiaRemision"));
		
		//ELIMINAR
		sMapKey = "EliminarGuiaRemision";
		inputMap = this.jButtonEliminarGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGuiaRemision"));
		
		//CANCELAR	
		sMapKey = "CancelarGuiaRemision";
		inputMap = this.jButtonCancelarGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGuiaRemision"));
		
		//CERRAR		
		sMapKey = "CerrarGuiaRemision";
		inputMap = this.jButtonCerrarGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGuiaRemision"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGuiaRemision";
		inputMap = this.jButtonGuardarCambiosTablaGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGuiaRemision"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGuiaRemision = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGuiaRemision.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGuiaRemision.setToolTipText("Nuevo GuiaRemision");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGuiaRemision = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGuiaRemision.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGuiaRemision.setToolTipText("Sin Cerrar Ventana GuiaRemision");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGuiaRemision = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGuiaRemision.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGuiaRemision.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGuiaRemision.setText("Accion");
		this.jComboBoxTiposAccionesGuiaRemision.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGuiaRemision.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGuiaRemision.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGuiaRemision = new JLabelMe();
		
		this.jLabelAccionesGuiaRemision.setText("Acciones");		
		this.jLabelAccionesGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGuiaRemision();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGuiaRemision();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGuiaRemision=new JTabbedPane();
		this.jTabbedPaneRelacionesGuiaRemision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGuiaRemision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGuiaRemision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGuiaRemision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGuiaRemision.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGuiaRemision.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGuiaRemision.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGuiaRemision = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGuiaRemision = new GridBagLayout();
		
		this.jPanelCamposGuiaRemision.setLayout(gridaBagLayoutCamposGuiaRemision);
		this.jPanelCamposOcultosGuiaRemision.setLayout(gridaBagLayoutCamposOcultosGuiaRemision);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalGuiaRemision= new GridBagLayout();
		this.jPanelCamposFintotalGuiaRemision.setLayout(gridaBagLayoutCamposFintotalGuiaRemision);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGuiaRemision.add(jLabelIdGuiaRemision, this.gridBagConstraintsGuiaRemision);



	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGuiaRemision.add(jLabelidGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGuiaRemision.add(jLabelid_empresaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGuiaRemision.add(jButtonid_empresaGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGuiaRemision.add(jButtonid_empresaGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGuiaRemision.add(jComboBoxid_empresaGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalGuiaRemision.add(jLabelid_sucursalGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalGuiaRemision.add(jButtonid_sucursalGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalGuiaRemision.add(jButtonid_sucursalGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalGuiaRemision.add(jComboBoxid_sucursalGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioGuiaRemision.add(jLabelid_ejercicioGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioGuiaRemision.add(jButtonid_ejercicioGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioGuiaRemision.add(jButtonid_ejercicioGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioGuiaRemision.add(jComboBoxid_ejercicioGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoGuiaRemision.add(jLabelid_periodoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoGuiaRemision.add(jButtonid_periodoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoGuiaRemision.add(jButtonid_periodoGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoGuiaRemision.add(jComboBoxid_periodoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioGuiaRemision.add(jLabelid_usuarioGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioGuiaRemision.add(jButtonid_usuarioGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioGuiaRemision.add(jButtonid_usuarioGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioGuiaRemision.add(jComboBoxid_usuarioGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialGuiaRemision.add(jLabelsecuencialGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialGuiaRemision.add(jButtonsecuencialGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialGuiaRemision.add(jTextFieldsecuencialGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionGuiaRemision.add(jLabelfecha_emisionGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionGuiaRemision.add(jButtonfecha_emisionGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionGuiaRemision.add(jDateChooserfecha_emisionGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoGuiaRemision.add(jLabelid_formatoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoGuiaRemision.add(jButtonid_formatoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoGuiaRemision.add(jButtonid_formatoGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoGuiaRemision.add(jComboBoxid_formatoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioGuiaRemision.add(jLabelid_tipo_precioGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioGuiaRemision.add(jButtonid_tipo_precioGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioGuiaRemision.add(jButtonid_tipo_precioGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioGuiaRemision.add(jComboBoxid_tipo_precioGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaGuiaRemision.add(jLabelid_monedaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaGuiaRemision.add(jButtonid_monedaGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaGuiaRemision.add(jButtonid_monedaGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaGuiaRemision.add(jComboBoxid_monedaGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_camionGuiaRemision.add(jLabelnumero_camionGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_camionGuiaRemision.add(jButtonnumero_camionGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_camionGuiaRemision.add(jTextFieldnumero_camionGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteGuiaRemision.add(jLabelid_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 2;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteGuiaRemision.add(jButtonid_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteGuiaRemision.add(jButtonid_clienteGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 4;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteGuiaRemision.add(jButtonid_clienteGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteGuiaRemision.add(jComboBoxid_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorGuiaRemision.add(jLabelid_vendedorGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorGuiaRemision.add(jButtonid_vendedorGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorGuiaRemision.add(jButtonid_vendedorGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorGuiaRemision.add(jComboBoxid_vendedorGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaGuiaRemision.add(jLabelid_facturaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 2;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaGuiaRemision.add(jButtonid_facturaGuiaRemision, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaGuiaRemision.add(jButtonid_facturaGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 4;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaGuiaRemision.add(jButtonid_facturaGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaGuiaRemision.add(jComboBoxid_facturaGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transportistaGuiaRemision.add(jLabelid_transportistaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaGuiaRemision.add(jButtonid_transportistaGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaGuiaRemision.add(jButtonid_transportistaGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transportistaGuiaRemision.add(jComboBoxid_transportistaGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionGuiaRemision.add(jLabelidentificacionGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionGuiaRemision.add(jButtonidentificacionGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionGuiaRemision.add(jTextFieldidentificacionGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_origenGuiaRemision.add(jLabelfecha_origenGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_origenGuiaRemision.add(jButtonfecha_origenGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_origenGuiaRemision.add(jDateChooserfecha_origenGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_destinoGuiaRemision.add(jLabelfecha_destinoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_destinoGuiaRemision.add(jButtonfecha_destinoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_destinoGuiaRemision.add(jDateChooserfecha_destinoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltransporte_codigoGuiaRemision.add(jLabeltransporte_codigoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneltransporte_codigoGuiaRemision.add(jButtontransporte_codigoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltransporte_codigoGuiaRemision.add(jscrollPanetransporte_codigoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_bultosGuiaRemision.add(jLabelcantidad_bultosGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_bultosGuiaRemision.add(jButtoncantidad_bultosGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_bultosGuiaRemision.add(jTextFieldcantidad_bultosGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_consultorGuiaRemision.add(jLabelid_consultorGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consultorGuiaRemision.add(jButtonid_consultorGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consultorGuiaRemision.add(jButtonid_consultorGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_consultorGuiaRemision.add(jComboBoxid_consultorGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transporteGuiaRemision.add(jLabelid_transporteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transporteGuiaRemision.add(jButtonid_transporteGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transporteGuiaRemision.add(jButtonid_transporteGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transporteGuiaRemision.add(jComboBoxid_transporteGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sub_clienteGuiaRemision.add(jLabelid_sub_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_clienteGuiaRemision.add(jButtonid_sub_clienteGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_clienteGuiaRemision.add(jButtonid_sub_clienteGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sub_clienteGuiaRemision.add(jComboBoxid_sub_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoGuiaRemision.add(jLabelid_empleadoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoGuiaRemision.add(jButtonid_empleadoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoGuiaRemision.add(jButtonid_empleadoGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoGuiaRemision.add(jComboBoxid_empleadoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudad_origenGuiaRemision.add(jLabelid_ciudad_origenGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudad_origenGuiaRemision.add(jButtonid_ciudad_origenGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudad_origenGuiaRemision.add(jButtonid_ciudad_origenGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudad_origenGuiaRemision.add(jComboBoxid_ciudad_origenGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudad_destinoGuiaRemision.add(jLabelid_ciudad_destinoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudad_destinoGuiaRemision.add(jButtonid_ciudad_destinoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudad_destinoGuiaRemision.add(jButtonid_ciudad_destinoGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudad_destinoGuiaRemision.add(jComboBoxid_ciudad_destinoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_llamadaGuiaRemision.add(jLabelid_tipo_llamadaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_llamadaGuiaRemision.add(jButtonid_tipo_llamadaGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_llamadaGuiaRemision.add(jButtonid_tipo_llamadaGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_llamadaGuiaRemision.add(jComboBoxid_tipo_llamadaGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_inicioGuiaRemision.add(jLabelhora_inicioGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_inicioGuiaRemision.add(jButtonhora_inicioGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_inicioGuiaRemision.add(jSpinnerhora_inicioGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_finGuiaRemision.add(jLabelhora_finGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_finGuiaRemision.add(jButtonhora_finGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_finGuiaRemision.add(jSpinnerhora_finGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcupoGuiaRemision.add(jLabelcupoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelcupoGuiaRemision.add(jButtoncupoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcupoGuiaRemision.add(jTextFieldcupoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoGuiaRemision.add(jLabelsaldoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoGuiaRemision.add(jButtonsaldoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoGuiaRemision.add(jTextFieldsaldoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldocumentoGuiaRemision.add(jLabeldocumentoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneldocumentoGuiaRemision.add(jButtondocumentoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldocumentoGuiaRemision.add(jTextFielddocumentoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldisponibleGuiaRemision.add(jLabeldisponibleGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneldisponibleGuiaRemision.add(jButtondisponibleGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldisponibleGuiaRemision.add(jTextFielddisponibleGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionGuiaRemision.add(jLabeldescripcionGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionGuiaRemision.add(jButtondescripcionGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionGuiaRemision.add(jscrollPanedescripcionGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaGuiaRemision.add(jLabeltotal_ivaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaGuiaRemision.add(jButtontotal_ivaGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaGuiaRemision.add(jTextFieldtotal_ivaGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaGuiaRemision.add(jLabeltotal_sin_ivaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaGuiaRemision.add(jButtontotal_sin_ivaGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaGuiaRemision.add(jTextFieldtotal_sin_ivaGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoGuiaRemision.add(jLabeldescuentoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoGuiaRemision.add(jButtondescuentoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoGuiaRemision.add(jTextFielddescuentoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfleteGuiaRemision.add(jLabelfleteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteGuiaRemision.add(jButtonfleteGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfleteGuiaRemision.add(jTextFieldfleteGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotroGuiaRemision.add(jLabelotroGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelotroGuiaRemision.add(jButtonotroGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotroGuiaRemision.add(jTextFieldotroGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinanciamientoGuiaRemision.add(jLabelfinanciamientoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoGuiaRemision.add(jButtonfinanciamientoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinanciamientoGuiaRemision.add(jTextFieldfinanciamientoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaGuiaRemision.add(jLabelivaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaGuiaRemision.add(jButtonivaGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaGuiaRemision.add(jTextFieldivaGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalGuiaRemision.add(jLabeltotalGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalGuiaRemision.add(jButtontotalGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalGuiaRemision.add(jTextFieldtotalGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_retencionGuiaRemision.add(jLabelmonto_retencionGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_retencionGuiaRemision.add(jButtonmonto_retencionGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_retencionGuiaRemision.add(jTextFieldmonto_retencionGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cambioGuiaRemision.add(jLabelid_tipo_cambioGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 2;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioGuiaRemision.add(jButtonid_tipo_cambioGuiaRemision, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 3;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioGuiaRemision.add(jButtonid_tipo_cambioGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 4;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioGuiaRemision.add(jButtonid_tipo_cambioGuiaRemisionUpdate, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cambioGuiaRemision.add(jComboBoxid_tipo_cambioGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaGuiaRemision.add(jLabelfechaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaGuiaRemision.add(jButtonfechaGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaGuiaRemision.add(jDateChooserfechaGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_clienteGuiaRemision.add(jLabelruc_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_clienteGuiaRemision.add(jButtonruc_clienteGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_clienteGuiaRemision.add(jTextFieldruc_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clienteGuiaRemision.add(jLabelnombre_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteGuiaRemision.add(jButtonnombre_clienteGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clienteGuiaRemision.add(jscrollPanenombre_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_clienteGuiaRemision.add(jLabeltelefono_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_clienteGuiaRemision.add(jButtontelefono_clienteGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_clienteGuiaRemision.add(jscrollPanetelefono_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_clienteGuiaRemision.add(jLabeldireccion_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_clienteGuiaRemision.add(jButtondireccion_clienteGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_clienteGuiaRemision.add(jscrollPanedireccion_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoGuiaRemision.add(jLabelnumero_pre_impresoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoGuiaRemision.add(jButtonnumero_pre_impresoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoGuiaRemision.add(jTextFieldnumero_pre_impresoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpeso_brutoGuiaRemision.add(jLabelpeso_brutoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelpeso_brutoGuiaRemision.add(jButtonpeso_brutoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpeso_brutoGuiaRemision.add(jTextFieldpeso_brutoGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_autorizacionGuiaRemision.add(jLabelfecha_autorizacionGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_autorizacionGuiaRemision.add(jButtonfecha_autorizacionGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_autorizacionGuiaRemision.add(jDateChooserfecha_autorizacionGuiaRemision, this.gridBagConstraintsGuiaRemision);


	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 0;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoGuiaRemision.add(jLabelfecha_vencimientoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = 2;
		this.gridBagConstraintsGuiaRemision.ipadx = 0;
		this.gridBagConstraintsGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoGuiaRemision.add(jButtonfecha_vencimientoGuiaRemisionBusqueda, this.gridBagConstraintsGuiaRemision);
	}

	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuiaRemision.gridy = 0;
	this.gridBagConstraintsGuiaRemision.gridx = 1;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoGuiaRemision.add(jDateChooserfecha_vencimientoGuiaRemision, this.gridBagConstraintsGuiaRemision);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelidGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelsecuencialGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelfecha_emisionGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_formatoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_tipo_precioGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_monedaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelnumero_camionGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_vendedorGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_facturaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_transportistaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelidentificacionGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelfecha_origenGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelfecha_destinoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPaneltransporte_codigoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelcantidad_bultosGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_consultorGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_transporteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_sub_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_empleadoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_ciudad_origenGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_ciudad_destinoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelid_tipo_llamadaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelhora_inicioGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelhora_finGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelcupoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPanelsaldoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPaneldocumentoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPaneldisponibleGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuiaRemision.add(this.jPaneldescripcionGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposGuiaRemision % 4==0) {
		iXPanelCamposGuiaRemision=0;
		iYPanelCamposGuiaRemision++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelid_empresaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelid_sucursalGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelid_ejercicioGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelid_periodoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelid_usuarioGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelmonto_retencionGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 3==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelid_tipo_cambioGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelfechaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelruc_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelnombre_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPaneltelefono_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPaneldireccion_clienteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelnumero_pre_impresoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelpeso_brutoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelfecha_autorizacionGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposOcultosGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposOcultosGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuiaRemision.add(this.jPanelfecha_vencimientoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposOcultosGuiaRemision % 4==0) {
		iXPanelCamposOcultosGuiaRemision=0;
		iYPanelCamposOcultosGuiaRemision++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposFintotalGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposFintotalGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalGuiaRemision.add(this.jPaneltotal_ivaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposFintotalGuiaRemision % 3==0) {
		iXPanelCamposFintotalGuiaRemision=0;
		iYPanelCamposFintotalGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposFintotalGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposFintotalGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalGuiaRemision.add(this.jPaneltotal_sin_ivaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposFintotalGuiaRemision % 3==0) {
		iXPanelCamposFintotalGuiaRemision=0;
		iYPanelCamposFintotalGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposFintotalGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposFintotalGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalGuiaRemision.add(this.jPaneldescuentoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposFintotalGuiaRemision % 3==0) {
		iXPanelCamposFintotalGuiaRemision=0;
		iYPanelCamposFintotalGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposFintotalGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposFintotalGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalGuiaRemision.add(this.jPanelfleteGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposFintotalGuiaRemision % 3==0) {
		iXPanelCamposFintotalGuiaRemision=0;
		iYPanelCamposFintotalGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposFintotalGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposFintotalGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalGuiaRemision.add(this.jPanelotroGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposFintotalGuiaRemision % 3==0) {
		iXPanelCamposFintotalGuiaRemision=0;
		iYPanelCamposFintotalGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposFintotalGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposFintotalGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalGuiaRemision.add(this.jPanelfinanciamientoGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposFintotalGuiaRemision % 3==0) {
		iXPanelCamposFintotalGuiaRemision=0;
		iYPanelCamposFintotalGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposFintotalGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposFintotalGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalGuiaRemision.add(this.jPanelivaGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposFintotalGuiaRemision % 3==0) {
		iXPanelCamposFintotalGuiaRemision=0;
		iYPanelCamposFintotalGuiaRemision++;
	}
	this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuiaRemision.gridy = iYPanelCamposFintotalGuiaRemision;
	this.gridBagConstraintsGuiaRemision.gridx = iXPanelCamposFintotalGuiaRemision++;
	this.gridBagConstraintsGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalGuiaRemision.add(this.jPaneltotalGuiaRemision, this.gridBagConstraintsGuiaRemision);



	if(iXPanelCamposFintotalGuiaRemision % 3==0) {
		iXPanelCamposFintotalGuiaRemision=0;
		iYPanelCamposFintotalGuiaRemision++;
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
			
		GridBagLayout gridaBagLayoutAccionesGuiaRemision= new GridBagLayout();
		this.jPanelAccionesGuiaRemision.setLayout(gridaBagLayoutAccionesGuiaRemision);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGuiaRemision= new GridBagLayout();
		this.jPanelAccionesFormularioGuiaRemision.setLayout(gridaBagLayoutAccionesFormularioGuiaRemision);
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGuiaRemision.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGuiaRemision.add(this.jComboBoxTiposAccionesFormularioGuiaRemision, this.gridBagConstraintsGuiaRemision);

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGuiaRemision.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGuiaRemision.add(this.jCheckBoxPostAccionNuevoGuiaRemision, this.gridBagConstraintsGuiaRemision);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.guiaremisionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGuiaRemision.add(this.jCheckBoxPostAccionSinCerrarGuiaRemision, this.gridBagConstraintsGuiaRemision);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.guiaremisionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.guiaremisionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsGuiaRemision.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioGuiaRemision.add(this.jCheckBoxPostAccionSinMensajeGuiaRemision, this.gridBagConstraintsGuiaRemision);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx = iPosXAccion++;
			
		this.jPanelAccionesGuiaRemision.add(this.jButtonModificarGuiaRemision, this.gridBagConstraintsGuiaRemision);							

		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuiaRemision.gridy = 0;
		this.gridBagConstraintsGuiaRemision.gridx =iPosXAccion++;
			
		this.jPanelAccionesGuiaRemision.add(this.jButtonEliminarGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
			
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = 0;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXAccion++;
		
		this.jPanelAccionesGuiaRemision.add(this.jButtonActualizarGuiaRemision, this.gridBagConstraintsGuiaRemision);


		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = 0;		
		this.gridBagConstraintsGuiaRemision.gridx = iPosXAccion++;
		
		this.jPanelAccionesGuiaRemision.add(this.jButtonGuardarCambiosGuiaRemision, this.gridBagConstraintsGuiaRemision);	
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = 0;		
		this.gridBagConstraintsGuiaRemision.gridx =iPosXAccion++;
		
		this.jPanelAccionesGuiaRemision.add(this.jButtonCancelarGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGuiaRemision = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGuiaRemision);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.guiaremisionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();						
			this.gridBagConstraintsGuiaRemision.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGuiaRemision.gridx = 0;		
			//this.gridBagConstraintsGuiaRemision.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGuiaRemision.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGuiaRemision.gridx =0;
		this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGuiaRemision.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGuiaRemision, this.gridBagConstraintsGuiaRemision);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GuiaRemisionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGuiaRemision = new GuiaRemisionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Guia Remision DATOS");
			
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
			
	        //this.setTitle("[FOR] - Guia Remision DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Guia Remision Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GuiaRemisionModel guiaremisionModel=new GuiaRemisionModel(this);
			
			//SI USARA CLASE INTERNA
			//GuiaRemisionModel.GuiaRemisionFocusTraversalPolicy guiaremisionFocusTraversalPolicy = guiaremisionModel.new GuiaRemisionFocusTraversalPolicy(this);
			
			//guiaremisionFocusTraversalPolicy.setguiaremisionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(guiaremisionModel);
			
			
			this.jContentPaneDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();	
			this.jContentPaneDetalleGuiaRemision.setLayout(gridaBagLayoutDetalleGuiaRemision);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGuiaRemision = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionGuiaRemision=   new JScrollPane(jContentPaneDetalleGuiaRemision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGuiaRemision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGuiaRemision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGuiaRemision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGuiaRemision=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGuiaRemision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGuiaRemision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGuiaRemision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsGuiaRemision.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGuiaRemision.gridx = 0;
	        
			this.jContentPaneDetalleGuiaRemision.add(jPanelCamposGuiaRemision, gridBagConstraintsGuiaRemision);
			
			
			
			
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
						&& guiaremisionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleGuiaRemision(this.puedeCargarPorParteDetalleGuiaRemision,false,-1);
					
					if(this.guiaremisionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGuiaRemision= new GridBagConstraints();
						this.gridBagConstraintsGuiaRemision.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGuiaRemision.gridx = 0;
						this.jContentPaneDetalleGuiaRemision.add(this.jTabbedPaneRelacionesGuiaRemision, this.gridBagConstraintsGuiaRemision);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGuiaRemision.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleGuiaRemision(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsGuiaRemision.gridy = iGridyRelaciones++;
		this.gridBagConstraintsGuiaRemision.gridx = 0;

		this.jContentPaneDetalleGuiaRemision.add(jPanelCamposFintotalGuiaRemision, gridBagConstraintsGuiaRemision);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGuiaRemision.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
					this.gridBagConstraintsGuiaRemision.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGuiaRemision.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGuiaRemision.gridx = 0;
					
				
					this.jContentPaneDetalleGuiaRemision.add(jPanelCamposOcultosGuiaRemision, gridBagConstraintsGuiaRemision);
				
					this.jPanelCamposOcultosGuiaRemision.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsGuiaRemision.gridx = 0;
	        this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGuiaRemision.add(this.jPanelAccionesFormularioGuiaRemision, this.gridBagConstraintsGuiaRemision);							
			
			
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsGuiaRemision.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsGuiaRemision.gridx = 0;
	        
			
			this.jContentPaneDetalleGuiaRemision.add(this.jPanelAccionesGuiaRemision, this.gridBagConstraintsGuiaRemision);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGuiaRemision);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGuiaRemision=   new JScrollPane(this.jPanelCamposGuiaRemision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGuiaRemision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGuiaRemision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGuiaRemision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGuiaRemision.gridx = 0;
			this.gridBagConstraintsGuiaRemision.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGuiaRemision.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGuiaRemision.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGuiaRemision, this.gridBagConstraintsGuiaRemision);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGuiaRemision.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGuiaRemision, this.gridBagConstraintsGuiaRemision);			
			
			this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsGuiaRemision.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGuiaRemision.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGuiaRemision, this.gridBagConstraintsGuiaRemision);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiaRemision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGuiaRemision, this.gridBagConstraintsGuiaRemision);
			
			
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuiaRemision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGuiaRemision, this.gridBagConstraintsGuiaRemision);
		
			
		this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsGuiaRemision.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGuiaRemision.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGuiaRemision, this.gridBagConstraintsGuiaRemision);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGuiaRemision;//jContentPane;
		
		return jScrollPanelDatosEdicionGuiaRemision;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleGuiaRemision(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleguiaremisionSessionBean=new DetalleGuiaRemisionSessionBean();
		this.detalleguiaremisionSessionBean.setConGuardarRelaciones(false);
		this.detalleguiaremisionSessionBean.setEsGuardarRelacionado(true);

		this.detalleguiaremisionBeanSwingJInternalFrame=null;//new DetalleGuiaRemisionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleguiaremisionBeanSwingJInternalFramePopup=new DetalleGuiaRemisionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleguiaremisionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()) {

				DetalleGuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL=GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleGuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=GuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleguiaremisionSessionBean.setEsGuardarRelacionado(true);

				this.detalleguiaremisionBeanSwingJInternalFrame=new DetalleGuiaRemisionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleguiaremisionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleguiaremisionBeanSwingJInternalFrame.setdetalleguiaremisionSessionBean(this.detalleguiaremisionSessionBean);

				//this.gridBagConstraintsGuiaRemision = new GridBagConstraints();
				//this.gridBagConstraintsGuiaRemision.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsGuiaRemision.gridx = 0;
				//this.jContentPaneDetalleGuiaRemision.add(this.detalleguiaremisionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsGuiaRemision);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesGuiaRemision.add("Detalle Guia Remisiones",this.detalleguiaremisionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesGuiaRemision.setComponentAt(iIndexTab,this.detalleguiaremisionBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleGuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleguiaremisionSessionBean.setEsGuardarRelacionado(false);
				this.detalleguiaremisionBeanSwingJInternalFrame=null;//new DetalleGuiaRemisionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleGuiaRemision) {
					this.jTabbedPaneRelacionesGuiaRemision.add("Detalle Guia Remisiones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleGuiaRemisionBeanSwingJInternalFrame(List<GuiaRemision> guiaremisions,GuiaRemision guiaremision,DetalleGuiaRemisionBeanSwingJInternalFrame detalleguiaremisionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleguiaremisionBeanSwingJInternalFrame=new DetalleGuiaRemisionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleguiaremisionBeanSwingJInternalFrame.getDetalleGuiaRemisionLogic().setConnexion(this.guiaremisionLogic.getConnexion());

					detalleguiaremisionBeanSwingJInternalFrame.setguiaremisionsForeignKey(guiaremisions);
					detalleguiaremisionBeanSwingJInternalFrame.setguiaremisionForeignKey(guiaremision);
					detalleguiaremisionBeanSwingJInternalFrame.detalleguiaremisionSessionBean.setisBusquedaDesdeForeignKeySesionGuiaRemision(true);
					detalleguiaremisionBeanSwingJInternalFrame.detalleguiaremisionSessionBean.setlidGuiaRemisionActual(guiaremision.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleguiaremisionBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleGuiaRemision(detalleguiaremisionBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleguiaremisionBeanSwingJInternalFrame.setVisibilidadBusquedasParaGuiaRemision(true);
					detalleguiaremisionBeanSwingJInternalFrame.setid_guia_remisionFK_IdGuiaRemision(guiaremision.getId());

					if(!this.conCargarFormDetalle) {
						detalleguiaremisionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleguiaremisionBeanSwingJInternalFrame.setSelectedItemCombosFrameGuiaRemisionForeignKey(guiaremision,1,false,true,true);
					detalleguiaremisionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleguiaremisionBeanSwingJInternalFrame.procesarBusqueda("FK_IdGuiaRemision");
					detalleguiaremisionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdGuiaRemision");
					detalleguiaremisionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleGuiaRemision(true);
					detalleguiaremisionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleGuiaRemision("n",detalleguiaremisionBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleguiaremisionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleguiaremisionBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleguiaremisionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleguiaremisionBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleGuiaRemision("relacionado");
					} else {
						detalleguiaremisionBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleGuiaRemision("no_relacionado");
					}

					detalleguiaremisionBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleGuiaRemision().setVisible(false);

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
