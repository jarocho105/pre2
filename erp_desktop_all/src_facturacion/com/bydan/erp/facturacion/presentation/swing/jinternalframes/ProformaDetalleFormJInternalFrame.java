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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.ProformaConstantesFunciones;

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
public class ProformaDetalleFormJInternalFrame extends ProformaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProforma;
	
	protected JMenuBar jmenuBarDetalleProforma;
	
	protected JMenu jmenuDetalleProforma;
	protected JMenu jmenuDetalleArchivoProforma;
	protected JMenu jmenuDetalleAccionesProforma;
	protected JMenu jmenuDetalleDatosProforma;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProforma;	
	protected GridBagConstraints gridBagConstraintsProforma;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProformaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProforma;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected EstadoProformaBeanSwingJInternalFrame estadoproformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoproforma="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subcliente="";

	protected TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoviatransporte="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected RutaTransporteBeanSwingJInternalFrame rutatransporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rutatransporte="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected TipoProformaBeanSwingJInternalFrame tipoproformaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoproforma="";

	protected ConsignatarioBeanSwingJInternalFrame consignatarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_consignatario="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";
	
	public ProformaSessionBean proformaSessionBean;
	
	

	public TerminoProformaBeanSwingJInternalFrame terminoproformaBeanSwingJInternalFrame=null;
	public TerminoProformaBeanSwingJInternalFrame terminoproformaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTerminoProforma=false;
	public TerminoProformaSessionBean terminoproformaSessionBean;

	public DetalleProformaBeanSwingJInternalFrame detalleproformaBeanSwingJInternalFrame=null;
	public DetalleProformaBeanSwingJInternalFrame detalleproformaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleProforma=false;
	public DetalleProformaSessionBean detalleproformaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public EstadoProformaSessionBean estadoproformaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public SubClienteSessionBean subclienteSessionBean;
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public RutaTransporteSessionBean rutatransporteSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public TipoProformaSessionBean tipoproformaSessionBean;
	public ConsignatarioSessionBean consignatarioSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;	
	
	public ProformaLogic proformaLogic;
	
	public JScrollPane jScrollPanelDatosProforma;
	public JScrollPane jScrollPanelDatosEdicionProforma;
	public JScrollPane jScrollPanelDatosGeneralProforma;
	
	protected JPanel jPanelCamposProforma;    
	protected JPanel jPanelCamposOcultosProforma;    	
	protected JPanel jPanelAccionesProforma;
	protected JPanel jPanelAccionesFormularioProforma;
    
	
	
	protected Integer iXPanelCamposProforma=0;
	protected Integer iYPanelCamposProforma=0;
	
	protected Integer iXPanelCamposOcultosProforma=0;
	protected Integer iYPanelCamposOcultosProforma=0;
	
	

	protected JPanel jPanelCamposFindatos_valoresProforma;
	protected Integer iXPanelCamposFindatos_valoresProforma=0;
	protected Integer iYPanelCamposFindatos_valoresProforma=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProforma;
	public JButton jButtonModificarProforma;
	public JButton jButtonActualizarProforma;
    public JButton jButtonEliminarProforma;
	public JButton jButtonCancelarProforma;
    public JButton jButtonGuardarCambiosProforma;
	public JButton jButtonGuardarCambiosTablaProforma;
	protected JButton jButtonCerrarProforma;
	
	
	protected JButton jButtonProcesarInformacionProforma;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProforma;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProforma;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProforma;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProforma;
	protected JButton jButtonModificarToolBarProforma;
	protected JButton jButtonActualizarToolBarProforma;
    protected JButton jButtonEliminarToolBarProforma;
	protected JButton jButtonCancelarToolBarProforma;
    protected JButton jButtonGuardarCambiosToolBarProforma;
	protected JButton jButtonGuardarCambiosTablaToolBarProforma;
	protected JButton jButtonMostrarOcultarTablaToolBarProforma;
	protected JButton jButtonCerrarToolBarProforma;
	
	protected JButton jButtonProcesarInformacionToolBarProforma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProforma;
	protected JMenuItem jMenuItemModificarProforma;
	protected JMenuItem jMenuItemActualizarProforma;
    protected JMenuItem jMenuItemEliminarProforma;
	protected JMenuItem jMenuItemCancelarProforma;
    protected JMenuItem jMenuItemGuardarCambiosProforma;
	protected JMenuItem jMenuItemGuardarCambiosTablaProforma;
	protected JMenuItem jMenuItemCerrarProforma;
	protected JMenuItem jMenuItemDetalleCerrarProforma;
	protected JMenuItem jMenuItemDetalleMostarOcultarProforma;
	
	protected JMenuItem jMenuItemProcesarInformacionProforma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProforma;
	protected JMenuItem jMenuItemMostrarOcultarProforma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProforma;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProforma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProforma;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProforma;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProforma;
	public JLabel jLabelIdProforma;
	public JLabel jLabelidProforma;
	public JButton jButtonidProformaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoProforma;
	public JLabel jLabelnumero_pre_impresoProforma;
	public JTextField jTextFieldnumero_pre_impresoProforma;
	public JButton jButtonnumero_pre_impresoProformaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionProforma;
	public JLabel jLabelfecha_emisionProforma;
	//public JFormattedTextField jDateChooserfecha_emisionProforma;

	public JDateChooser jDateChooserfecha_emisionProforma;
	public JButton jButtonfecha_emisionProformaBusqueda= new JButtonMe();

	public JPanel jPaneldiasProforma;
	public JLabel jLabeldiasProforma;
	public JTextField jTextFielddiasProforma;
	public JButton jButtondiasProformaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoProforma;
	public JLabel jLabelfecha_vencimientoProforma;
	//public JFormattedTextField jDateChooserfecha_vencimientoProforma;

	public JDateChooser jDateChooserfecha_vencimientoProforma;
	public JButton jButtonfecha_vencimientoProformaBusqueda= new JButtonMe();

	public JPanel jPanelcotizacionProforma;
	public JLabel jLabelcotizacionProforma;
	public JTextField jTextFieldcotizacionProforma;
	public JButton jButtoncotizacionProformaBusqueda= new JButtonMe();

	public JPanel jPaneldireccionProforma;
	public JLabel jLabeldireccionProforma;
	public JTextArea jTextAreadireccionProforma;
	public JScrollPane jscrollPanedireccionProforma;
	public JButton jButtondireccionProformaBusqueda= new JButtonMe();

	public JPanel jPanelrucProforma;
	public JLabel jLabelrucProforma;
	public JTextField jTextFieldrucProforma;
	public JButton jButtonrucProformaBusqueda= new JButtonMe();

	public JPanel jPaneles_ofertaProforma;
	public JLabel jLabeles_ofertaProforma;
	public JCheckBox jCheckBoxes_ofertaProforma;
	public JButton jButtones_ofertaProformaBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoProforma;
	public JLabel jLabeltelefonoProforma;
	public JTextField jTextFieldtelefonoProforma;
	public JButton jButtontelefonoProformaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProforma;
	public JLabel jLabeldescripcionProforma;
	public JTextArea jTextAreadescripcionProforma;
	public JScrollPane jscrollPanedescripcionProforma;
	public JButton jButtondescripcionProformaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_porcentajeProforma;
	public JLabel jLabeldescuento_porcentajeProforma;
	public JTextField jTextFielddescuento_porcentajeProforma;
	public JButton jButtondescuento_porcentajeProformaBusqueda= new JButtonMe();

	public JPanel jPanelmonto_con_ivaProforma;
	public JLabel jLabelmonto_con_ivaProforma;
	public JTextField jTextFieldmonto_con_ivaProforma;
	public JButton jButtonmonto_con_ivaProformaBusqueda= new JButtonMe();

	public JPanel jPanelsumanProforma;
	public JLabel jLabelsumanProforma;
	public JTextField jTextFieldsumanProforma;
	public JButton jButtonsumanProformaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorProforma;
	public JLabel jLabeldescuento_valorProforma;
	public JTextField jTextFielddescuento_valorProforma;
	public JButton jButtondescuento_valorProformaBusqueda= new JButtonMe();

	public JPanel jPanelmonto_sin_ivaProforma;
	public JLabel jLabelmonto_sin_ivaProforma;
	public JTextField jTextFieldmonto_sin_ivaProforma;
	public JButton jButtonmonto_sin_ivaProformaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_generalProforma;
	public JLabel jLabeldescuento_generalProforma;
	public JTextField jTextFielddescuento_generalProforma;
	public JButton jButtondescuento_generalProformaBusqueda= new JButtonMe();

	public JPanel jPanelfleteProforma;
	public JLabel jLabelfleteProforma;
	public JTextField jTextFieldfleteProforma;
	public JButton jButtonfleteProformaBusqueda= new JButtonMe();

	public JPanel jPanelultimo_costoProforma;
	public JLabel jLabelultimo_costoProforma;
	public JTextField jTextFieldultimo_costoProforma;
	public JButton jButtonultimo_costoProformaBusqueda= new JButtonMe();

	public JPanel jPanelsubtotalProforma;
	public JLabel jLabelsubtotalProforma;
	public JTextField jTextFieldsubtotalProforma;
	public JButton jButtonsubtotalProformaBusqueda= new JButtonMe();

	public JPanel jPanelotros_cargosProforma;
	public JLabel jLabelotros_cargosProforma;
	public JTextField jTextFieldotros_cargosProforma;
	public JButton jButtonotros_cargosProformaBusqueda= new JButtonMe();

	public JPanel jPanelmargen_utilidadProforma;
	public JLabel jLabelmargen_utilidadProforma;
	public JTextField jTextFieldmargen_utilidadProforma;
	public JButton jButtonmargen_utilidadProformaBusqueda= new JButtonMe();

	public JPanel jPanelivaProforma;
	public JLabel jLabelivaProforma;
	public JTextField jTextFieldivaProforma;
	public JButton jButtonivaProformaBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoProforma;
	public JLabel jLabelfinanciamientoProforma;
	public JTextField jTextFieldfinanciamientoProforma;
	public JButton jButtonfinanciamientoProformaBusqueda= new JButtonMe();

	public JPanel jPaneltotalProforma;
	public JLabel jLabeltotalProforma;
	public JTextField jTextFieldtotalProforma;
	public JButton jButtontotalProformaBusqueda= new JButtonMe();

	public JPanel jPanelotros_valoresProforma;
	public JLabel jLabelotros_valoresProforma;
	public JTextField jTextFieldotros_valoresProforma;
	public JButton jButtonotros_valoresProformaBusqueda= new JButtonMe();

	public JPanel jPanelanticipoProforma;
	public JLabel jLabelanticipoProforma;
	public JTextField jTextFieldanticipoProforma;
	public JButton jButtonanticipoProformaBusqueda= new JButtonMe();

	public JPanel jPaneliceProforma;
	public JLabel jLabeliceProforma;
	public JTextField jTextFieldiceProforma;
	public JButton jButtoniceProformaBusqueda= new JButtonMe();

	public JPanel jPanelmonto_retencionProforma;
	public JLabel jLabelmonto_retencionProforma;
	public JTextField jTextFieldmonto_retencionProforma;
	public JButton jButtonmonto_retencionProformaBusqueda= new JButtonMe();

	public JPanel jPanelfechaProforma;
	public JLabel jLabelfechaProforma;
	//public JFormattedTextField jDateChooserfechaProforma;

	public JDateChooser jDateChooserfechaProforma;
	public JButton jButtonfechaProformaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_servidorProforma;
	public JLabel jLabelfecha_servidorProforma;
	//public JFormattedTextField jDateChooserfecha_servidorProforma;

	public JDateChooser jDateChooserfecha_servidorProforma;
	public JButton jButtonfecha_servidorProformaBusqueda= new JButtonMe();

	public JPanel jPanelhora_inicioProforma;
	public JLabel jLabelhora_inicioProforma;
	public JSpinner jSpinnerhora_inicioProforma= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_inicioProformaBusqueda= new JButtonMe();

	public JPanel jPanelhora_finProforma;
	public JLabel jLabelhora_finProforma;
	public JSpinner jSpinnerhora_finProforma= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_finProformaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProforma;
	public JLabel jLabelid_empresaProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProforma;
	public JButton jButtonid_empresaProforma= new JButtonMe();
	public JButton jButtonid_empresaProformaUpdate= new JButtonMe();
	public JButton jButtonid_empresaProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalProforma;
	public JLabel jLabelid_sucursalProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalProforma;
	public JButton jButtonid_sucursalProforma= new JButtonMe();
	public JButton jButtonid_sucursalProformaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioProforma;
	public JLabel jLabelid_usuarioProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioProforma;
	public JButton jButtonid_usuarioProforma= new JButtonMe();
	public JButton jButtonid_usuarioProformaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioProforma;
	public JLabel jLabelid_ejercicioProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioProforma;
	public JButton jButtonid_ejercicioProforma= new JButtonMe();
	public JButton jButtonid_ejercicioProformaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoProforma;
	public JLabel jLabelid_periodoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoProforma;
	public JButton jButtonid_periodoProforma= new JButtonMe();
	public JButton jButtonid_periodoProformaUpdate= new JButtonMe();
	public JButton jButtonid_periodoProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_anioProforma;
	public JLabel jLabelid_anioProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioProforma;
	public JButton jButtonid_anioProforma= new JButtonMe();
	public JButton jButtonid_anioProformaUpdate= new JButtonMe();
	public JButton jButtonid_anioProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesProforma;
	public JLabel jLabelid_mesProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesProforma;
	public JButton jButtonid_mesProforma= new JButtonMe();
	public JButton jButtonid_mesProformaUpdate= new JButtonMe();
	public JButton jButtonid_mesProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaProforma;
	public JLabel jLabelid_monedaProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaProforma;
	public JButton jButtonid_monedaProforma= new JButtonMe();
	public JButton jButtonid_monedaProformaUpdate= new JButtonMe();
	public JButton jButtonid_monedaProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoProforma;
	public JLabel jLabelid_empleadoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoProforma;
	public JButton jButtonid_empleadoProforma= new JButtonMe();
	public JButton jButtonid_empleadoProformaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoProforma;
	public JLabel jLabelid_formatoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoProforma;
	public JButton jButtonid_formatoProforma= new JButtonMe();
	public JButton jButtonid_formatoProformaUpdate= new JButtonMe();
	public JButton jButtonid_formatoProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_proformaProforma;
	public JLabel jLabelid_estado_proformaProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_proformaProforma;
	public JButton jButtonid_estado_proformaProforma= new JButtonMe();
	public JButton jButtonid_estado_proformaProformaUpdate= new JButtonMe();
	public JButton jButtonid_estado_proformaProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteProforma;
	public JLabel jLabelid_clienteProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteProforma;
	public JButton jButtonid_clienteProforma= new JButtonMe();
	public JButton jButtonid_clienteProformaUpdate= new JButtonMe();
	public JButton jButtonid_clienteProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioProforma;
	public JLabel jLabelid_tipo_precioProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioProforma;
	public JButton jButtonid_tipo_precioProforma= new JButtonMe();
	public JButton jButtonid_tipo_precioProformaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorProforma;
	public JLabel jLabelid_vendedorProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorProforma;
	public JButton jButtonid_vendedorProforma= new JButtonMe();
	public JButton jButtonid_vendedorProformaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorProformaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorProformaArbol= new JButtonMe();

	public JPanel jPanelid_sub_clienteProforma;
	public JLabel jLabelid_sub_clienteProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_clienteProforma;
	public JButton jButtonid_sub_clienteProforma= new JButtonMe();
	public JButton jButtonid_sub_clienteProformaUpdate= new JButtonMe();
	public JButton jButtonid_sub_clienteProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_via_transporteProforma;
	public JLabel jLabelid_tipo_via_transporteProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_via_transporteProforma;
	public JButton jButtonid_tipo_via_transporteProforma= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteProformaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_via_transporteProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_transporteProforma;
	public JLabel jLabelid_transporteProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transporteProforma;
	public JButton jButtonid_transporteProforma= new JButtonMe();
	public JButton jButtonid_transporteProformaUpdate= new JButtonMe();
	public JButton jButtonid_transporteProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_ruta_transporteProforma;
	public JLabel jLabelid_ruta_transporteProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ruta_transporteProforma;
	public JButton jButtonid_ruta_transporteProforma= new JButtonMe();
	public JButton jButtonid_ruta_transporteProformaUpdate= new JButtonMe();
	public JButton jButtonid_ruta_transporteProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoProforma;
	public JLabel jLabelid_centro_costoProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoProforma;
	public JButton jButtonid_centro_costoProforma= new JButtonMe();
	public JButton jButtonid_centro_costoProformaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoProformaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoProformaArbol= new JButtonMe();

	public JPanel jPanelid_tipo_proformaProforma;
	public JLabel jLabelid_tipo_proformaProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proformaProforma;
	public JButton jButtonid_tipo_proformaProforma= new JButtonMe();
	public JButton jButtonid_tipo_proformaProformaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proformaProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_consignatarioProforma;
	public JLabel jLabelid_consignatarioProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_consignatarioProforma;
	public JButton jButtonid_consignatarioProforma= new JButtonMe();
	public JButton jButtonid_consignatarioProformaUpdate= new JButtonMe();
	public JButton jButtonid_consignatarioProformaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioProforma;
	public JLabel jLabelid_tipo_cambioProforma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioProforma;
	public JButton jButtonid_tipo_cambioProforma= new JButtonMe();
	public JButton jButtonid_tipo_cambioProformaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioProformaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProforma;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1480;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProformaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProforma=new JPanel();
				this.jPanelAccionesFormularioProforma=new JPanel();
				this.jmenuBarDetalleProforma=new JMenuBar();
				this.jTtoolBarDetalleProforma=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProformaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Proforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProformaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Proforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProformaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Proforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProformaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Proforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProformaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Proforma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProforma() {
		return this.jButtonActualizarToolBarProforma;
	}
	
	public JButton getjButtonEliminarToolBarProforma() {
		return this.jButtonEliminarToolBarProforma;
	}
	
	public JButton getjButtonCancelarToolBarProforma() {
		return this.jButtonCancelarToolBarProforma;
	}		
	
	public JButton getjButtonProcesarInformacionProforma() {
		return this.jButtonProcesarInformacionProforma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProforma)	{
		this.jButtonProcesarInformacionProforma = jButtonProcesarInformacionProforma;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProforma() {
		return this.jComboBoxTiposAccionesProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProforma(
			JComboBox jComboBoxTiposRelacionesProforma) {
		this.jComboBoxTiposRelacionesProforma = jComboBoxTiposRelacionesProforma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProforma(
			JComboBox jComboBoxTiposAccionesProforma) {
		this.jComboBoxTiposAccionesProforma = jComboBoxTiposAccionesProforma;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProforma() {
		return this.jComboBoxTiposAccionesFormularioProforma;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProforma(
			JComboBox jComboBoxTiposAccionesFormularioProforma) {
		this.jComboBoxTiposAccionesFormularioProforma = jComboBoxTiposAccionesFormularioProforma;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.proformaSessionBean=new ProformaSessionBean();
		
		this.proformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.proformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.proformaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.terminoproformaSessionBean=new TerminoProformaSessionBean();
		//this.detalleproformaSessionBean=new DetalleProformaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProformaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProformaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Proforma MANTENIMIENTO"));
		
		
		if(iWidth > 3950) {
			iWidth=3950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.proformaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProforma= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProforma=new JButtonMe();
				this.jButtonModificarToolBarProforma=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProforma,this.jTtoolBarDetalleProforma,
							"actualizar","actualizar","Actualizar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProforma,this.jTtoolBarDetalleProforma,
							"eliminar","eliminar","Eliminar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProforma,this.jTtoolBarDetalleProforma,
							"cancelar","cancelar","Cancelar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProforma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProforma,this.jTtoolBarDetalleProforma,
							"guardarcambios","guardarcambios","Guardar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProforma,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProforma=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProforma=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProforma=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProforma=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProforma=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProforma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProforma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProforma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProforma= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProforma.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProforma,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProforma= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProforma.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProforma,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProforma= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProforma.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProforma,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProforma= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProforma.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProforma,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProforma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProforma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProforma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProforma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProforma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProforma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProforma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProforma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProforma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProforma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProforma, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProforma.add(this.jMenuItemDetalleCerrarProforma);
		
		this.jmenuDetalleAccionesProforma.add(this.jMenuItemActualizarProforma);
		this.jmenuDetalleAccionesProforma.add(this.jMenuItemEliminarProforma);
		this.jmenuDetalleAccionesProforma.add(this.jMenuItemCancelarProforma);		
		
		//this.jmenuDetalleDatosProforma.add(this.jMenuItemDetalleAbrirOrderByProforma);				
		this.jmenuDetalleDatosProforma.add(this.jMenuItemDetalleMostarOcultarProforma);				
				
		//this.jmenuDetalleAccionesProforma.add(this.jMenuItemGuardarCambiosProforma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProforma.add(this.jmenuDetalleArchivoProforma);		
		this.jmenuBarDetalleProforma.add(this.jmenuDetalleAccionesProforma);		
		this.jmenuBarDetalleProforma.add(this.jmenuDetalleDatosProforma);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleProforma, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleProforma.add(this.jmenuDetalleProforma);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProforma = new JLabelMe();
		jLabelIdProforma.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProforma = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProforma.setToolTipText(ProformaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProforma= new GridBagLayout();

		this.jPanelidProforma.setLayout(this.gridaBagLayoutProforma);

		jLabelidProforma = new JLabel();
		jLabelidProforma.setText("Id");

		jLabelidProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_pre_impresoProforma = new JLabelMe();
		this.jLabelnumero_pre_impresoProforma.setText(""+ProformaConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoProforma.setToolTipText("Nro PreImpreso");
		this.jLabelnumero_pre_impresoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_pre_impresoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_pre_impresoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoProforma.setToolTipText(ProformaConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelnumero_pre_impresoProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldnumero_pre_impresoProforma= new JTextFieldMe();

		jTextFieldnumero_pre_impresoProforma.setEnabled(false);
		jTextFieldnumero_pre_impresoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoProformaBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoProformaBusqueda.setText("U");
		this.jButtonnumero_pre_impresoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoProformaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionProforma = new JLabelMe();
		this.jLabelfecha_emisionProforma.setText(""+ProformaConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionProforma.setToolTipText("F Emision");
		this.jLabelfecha_emisionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionProforma.setToolTipText(ProformaConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelfecha_emisionProforma.setLayout(this.gridaBagLayoutProforma);


		//jFormattedTextFieldfecha_emisionProforma= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionProforma= new JDateChooser();
		jDateChooserfecha_emisionProforma.setEnabled(false);
		jDateChooserfecha_emisionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionProforma.setDate(new Date());
		jDateChooserfecha_emisionProforma.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionProforma.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionProformaBusqueda= new JButtonMe();
		this.jButtonfecha_emisionProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionProformaBusqueda.setText("U");
		this.jButtonfecha_emisionProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionProformaBusqueda.setVisible(false);		}


					
		this.jLabeldiasProforma = new JLabelMe();
		this.jLabeldiasProforma.setText(""+ProformaConstantesFunciones.LABEL_DIAS+" : *");
		this.jLabeldiasProforma.setToolTipText("Nro Dias");
		this.jLabeldiasProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiasProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiasProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldiasProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldiasProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldiasProforma.setToolTipText(ProformaConstantesFunciones.LABEL_DIAS);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPaneldiasProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFielddiasProforma= new JTextFieldMe();
		jTextFielddiasProforma.setEnabled(false);
		jTextFielddiasProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiasProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiasProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddiasProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddiasProforma.setText("0");

		this.jButtondiasProformaBusqueda= new JButtonMe();
		this.jButtondiasProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiasProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiasProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondiasProformaBusqueda.setText("U");
		this.jButtondiasProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondiasProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondiasProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddiasProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddiasProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"diasProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondiasProformaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoProforma = new JLabelMe();
		this.jLabelfecha_vencimientoProforma.setText(""+ProformaConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoProforma.setToolTipText("F Vencimiento");
		this.jLabelfecha_vencimientoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_vencimientoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_vencimientoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoProforma.setToolTipText(ProformaConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelfecha_vencimientoProforma.setLayout(this.gridaBagLayoutProforma);


		//jFormattedTextFieldfecha_vencimientoProforma= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoProforma= new JDateChooser();
		jDateChooserfecha_vencimientoProforma.setEnabled(false);
		jDateChooserfecha_vencimientoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoProforma.setDate(new Date());
		jDateChooserfecha_vencimientoProforma.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoProforma.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoProformaBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoProformaBusqueda.setText("U");
		this.jButtonfecha_vencimientoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoProformaBusqueda.setVisible(false);		}


					
		this.jLabelcotizacionProforma = new JLabelMe();
		this.jLabelcotizacionProforma.setText(""+ProformaConstantesFunciones.LABEL_COTIZACION+" : *");
		this.jLabelcotizacionProforma.setToolTipText("Cotizacion");
		this.jLabelcotizacionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcotizacionProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcotizacionProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcotizacionProforma.setToolTipText(ProformaConstantesFunciones.LABEL_COTIZACION);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelcotizacionProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldcotizacionProforma= new JTextFieldMe();
		jTextFieldcotizacionProforma.setEnabled(false);
		jTextFieldcotizacionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcotizacionProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcotizacionProforma.setText("0.0");

		this.jButtoncotizacionProformaBusqueda= new JButtonMe();
		this.jButtoncotizacionProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncotizacionProformaBusqueda.setText("U");
		this.jButtoncotizacionProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncotizacionProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncotizacionProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcotizacionProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcotizacionProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cotizacionProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncotizacionProformaBusqueda.setVisible(false);		}


					
		this.jLabeldireccionProforma = new JLabelMe();
		this.jLabeldireccionProforma.setText(""+ProformaConstantesFunciones.LABEL_DIRECCION+" :");
		this.jLabeldireccionProforma.setToolTipText("Direccion");
		this.jLabeldireccionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionProforma.setToolTipText(ProformaConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPaneldireccionProforma.setLayout(this.gridaBagLayoutProforma);


		jTextAreadireccionProforma= new JTextAreaMe();
		jTextAreadireccionProforma.setEnabled(false);
		jTextAreadireccionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionProforma.setLineWrap(true);
		jTextAreadireccionProforma.setWrapStyleWord(true);
		jTextAreadireccionProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionProforma.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionProforma = new JScrollPane(jTextAreadireccionProforma);
		jscrollPanedireccionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondireccionProformaBusqueda= new JButtonMe();
		this.jButtondireccionProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionProformaBusqueda.setText("U");
		this.jButtondireccionProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionProformaBusqueda.setVisible(false);		}


					
		this.jLabelrucProforma = new JLabelMe();
		this.jLabelrucProforma.setText(""+ProformaConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucProforma.setToolTipText("Ruc");
		this.jLabelrucProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucProforma.setToolTipText(ProformaConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelrucProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldrucProforma= new JTextFieldMe();

		jTextFieldrucProforma.setEnabled(false);
		jTextFieldrucProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucProformaBusqueda= new JButtonMe();
		this.jButtonrucProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucProformaBusqueda.setText("U");
		this.jButtonrucProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucProformaBusqueda.setVisible(false);		}


					
		this.jLabeles_ofertaProforma = new JLabelMe();
		this.jLabeles_ofertaProforma.setText(""+ProformaConstantesFunciones.LABEL_ESOFERTA+" : *");
		this.jLabeles_ofertaProforma.setToolTipText("Es Oferta");
		this.jLabeles_ofertaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_ofertaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_ofertaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_ofertaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_ofertaProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_ofertaProforma.setToolTipText(ProformaConstantesFunciones.LABEL_ESOFERTA);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPaneles_ofertaProforma.setLayout(this.gridaBagLayoutProforma);


		jCheckBoxes_ofertaProforma= new JCheckBoxMe();
		jCheckBoxes_ofertaProforma.setEnabled(false);

		jCheckBoxes_ofertaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_ofertaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_ofertaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_ofertaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_ofertaProformaBusqueda= new JButtonMe();
		this.jButtones_ofertaProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_ofertaProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_ofertaProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_ofertaProformaBusqueda.setText("U");
		this.jButtones_ofertaProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_ofertaProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_ofertaProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_ofertaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_ofertaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_ofertaProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_ofertaProformaBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoProforma = new JLabelMe();
		this.jLabeltelefonoProforma.setText(""+ProformaConstantesFunciones.LABEL_TELEFONO+" :");
		this.jLabeltelefonoProforma.setToolTipText("Telefono");
		this.jLabeltelefonoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoProforma.setToolTipText(ProformaConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPaneltelefonoProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldtelefonoProforma= new JTextFieldMe();

		jTextFieldtelefonoProforma.setEnabled(false);
		jTextFieldtelefonoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoProformaBusqueda= new JButtonMe();
		this.jButtontelefonoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoProformaBusqueda.setText("U");
		this.jButtontelefonoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoProformaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProforma = new JLabelMe();
		this.jLabeldescripcionProforma.setText(""+ProformaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionProforma.setToolTipText("Descripcion");
		this.jLabeldescripcionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProforma.setToolTipText(ProformaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPaneldescripcionProforma.setLayout(this.gridaBagLayoutProforma);


		jTextAreadescripcionProforma= new JTextAreaMe();
		jTextAreadescripcionProforma.setEnabled(false);
		jTextAreadescripcionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProforma.setLineWrap(true);
		jTextAreadescripcionProforma.setWrapStyleWord(true);
		jTextAreadescripcionProforma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProforma.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProforma = new JScrollPane(jTextAreadescripcionProforma);
		jscrollPanedescripcionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionProformaBusqueda= new JButtonMe();
		this.jButtondescripcionProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProformaBusqueda.setText("U");
		this.jButtondescripcionProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProformaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_porcentajeProforma = new JLabelMe();
		this.jLabeldescuento_porcentajeProforma.setText(""+ProformaConstantesFunciones.LABEL_DESCUENTOPORCENTAJE+" : *");
		this.jLabeldescuento_porcentajeProforma.setToolTipText("Dscto %");
		this.jLabeldescuento_porcentajeProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_porcentajeProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_porcentajeProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_porcentajeProforma.setToolTipText(ProformaConstantesFunciones.LABEL_DESCUENTOPORCENTAJE);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPaneldescuento_porcentajeProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFielddescuento_porcentajeProforma= new JTextFieldMe();
		jTextFielddescuento_porcentajeProforma.setEnabled(false);
		jTextFielddescuento_porcentajeProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_porcentajeProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_porcentajeProforma.setText("0.0");

		this.jButtondescuento_porcentajeProformaBusqueda= new JButtonMe();
		this.jButtondescuento_porcentajeProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_porcentajeProformaBusqueda.setText("U");
		this.jButtondescuento_porcentajeProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_porcentajeProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_porcentajeProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_porcentajeProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_porcentajeProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_porcentajeProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_porcentajeProformaBusqueda.setVisible(false);		}


					
		this.jLabelmonto_con_ivaProforma = new JLabelMe();
		this.jLabelmonto_con_ivaProforma.setText(""+ProformaConstantesFunciones.LABEL_MONTOCONIVA+" : *");
		this.jLabelmonto_con_ivaProforma.setToolTipText("Monto Con Iva");
		this.jLabelmonto_con_ivaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_con_ivaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_con_ivaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_con_ivaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_con_ivaProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_con_ivaProforma.setToolTipText(ProformaConstantesFunciones.LABEL_MONTOCONIVA);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelmonto_con_ivaProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldmonto_con_ivaProforma= new JTextFieldMe();
		jTextFieldmonto_con_ivaProforma.setEnabled(false);
		jTextFieldmonto_con_ivaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_con_ivaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_con_ivaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_con_ivaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_con_ivaProforma.setText("0.0");

		this.jButtonmonto_con_ivaProformaBusqueda= new JButtonMe();
		this.jButtonmonto_con_ivaProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_con_ivaProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_con_ivaProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_con_ivaProformaBusqueda.setText("U");
		this.jButtonmonto_con_ivaProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_con_ivaProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_con_ivaProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_con_ivaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_con_ivaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_con_ivaProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_con_ivaProformaBusqueda.setVisible(false);		}


					
		this.jLabelsumanProforma = new JLabelMe();
		this.jLabelsumanProforma.setText(""+ProformaConstantesFunciones.LABEL_SUMAN+" : *");
		this.jLabelsumanProforma.setToolTipText("Suman");
		this.jLabelsumanProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsumanProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsumanProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsumanProforma.setToolTipText(ProformaConstantesFunciones.LABEL_SUMAN);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelsumanProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldsumanProforma= new JTextFieldMe();
		jTextFieldsumanProforma.setEnabled(false);
		jTextFieldsumanProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsumanProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsumanProforma.setText("0.0");

		this.jButtonsumanProformaBusqueda= new JButtonMe();
		this.jButtonsumanProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsumanProformaBusqueda.setText("U");
		this.jButtonsumanProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsumanProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsumanProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsumanProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsumanProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sumanProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsumanProformaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorProforma = new JLabelMe();
		this.jLabeldescuento_valorProforma.setText(""+ProformaConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorProforma.setToolTipText("Dscto Valor");
		this.jLabeldescuento_valorProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorProforma.setToolTipText(ProformaConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPaneldescuento_valorProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFielddescuento_valorProforma= new JTextFieldMe();
		jTextFielddescuento_valorProforma.setEnabled(false);
		jTextFielddescuento_valorProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorProforma.setText("0.0");

		this.jButtondescuento_valorProformaBusqueda= new JButtonMe();
		this.jButtondescuento_valorProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorProformaBusqueda.setText("U");
		this.jButtondescuento_valorProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorProformaBusqueda.setVisible(false);		}


					
		this.jLabelmonto_sin_ivaProforma = new JLabelMe();
		this.jLabelmonto_sin_ivaProforma.setText(""+ProformaConstantesFunciones.LABEL_MONTOSINIVA+" : *");
		this.jLabelmonto_sin_ivaProforma.setToolTipText("Monto Sin Iva");
		this.jLabelmonto_sin_ivaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_sin_ivaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_sin_ivaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_sin_ivaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_sin_ivaProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_sin_ivaProforma.setToolTipText(ProformaConstantesFunciones.LABEL_MONTOSINIVA);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelmonto_sin_ivaProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldmonto_sin_ivaProforma= new JTextFieldMe();
		jTextFieldmonto_sin_ivaProforma.setEnabled(false);
		jTextFieldmonto_sin_ivaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_sin_ivaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_sin_ivaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_sin_ivaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_sin_ivaProforma.setText("0.0");

		this.jButtonmonto_sin_ivaProformaBusqueda= new JButtonMe();
		this.jButtonmonto_sin_ivaProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_sin_ivaProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_sin_ivaProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_sin_ivaProformaBusqueda.setText("U");
		this.jButtonmonto_sin_ivaProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_sin_ivaProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_sin_ivaProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_sin_ivaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_sin_ivaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_sin_ivaProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_sin_ivaProformaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_generalProforma = new JLabelMe();
		this.jLabeldescuento_generalProforma.setText(""+ProformaConstantesFunciones.LABEL_DESCUENTOGENERAL+" : *");
		this.jLabeldescuento_generalProforma.setToolTipText("Dscto General");
		this.jLabeldescuento_generalProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_generalProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_generalProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_generalProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_generalProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_generalProforma.setToolTipText(ProformaConstantesFunciones.LABEL_DESCUENTOGENERAL);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPaneldescuento_generalProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFielddescuento_generalProforma= new JTextFieldMe();
		jTextFielddescuento_generalProforma.setEnabled(false);
		jTextFielddescuento_generalProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_generalProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_generalProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_generalProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_generalProforma.setText("0.0");

		this.jButtondescuento_generalProformaBusqueda= new JButtonMe();
		this.jButtondescuento_generalProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_generalProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_generalProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_generalProformaBusqueda.setText("U");
		this.jButtondescuento_generalProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_generalProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_generalProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_generalProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_generalProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_generalProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_generalProformaBusqueda.setVisible(false);		}


					
		this.jLabelfleteProforma = new JLabelMe();
		this.jLabelfleteProforma.setText(""+ProformaConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteProforma.setToolTipText("Flete");
		this.jLabelfleteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteProforma.setToolTipText(ProformaConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelfleteProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldfleteProforma= new JTextFieldMe();
		jTextFieldfleteProforma.setEnabled(false);
		jTextFieldfleteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteProforma.setText("0.0");

		this.jButtonfleteProformaBusqueda= new JButtonMe();
		this.jButtonfleteProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteProformaBusqueda.setText("U");
		this.jButtonfleteProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteProformaBusqueda.setVisible(false);		}


					
		this.jLabelultimo_costoProforma = new JLabelMe();
		this.jLabelultimo_costoProforma.setText(""+ProformaConstantesFunciones.LABEL_ULTIMOCOSTO+" : *");
		this.jLabelultimo_costoProforma.setToolTipText("Ultimo Costo");
		this.jLabelultimo_costoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelultimo_costoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelultimo_costoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelultimo_costoProforma.setToolTipText(ProformaConstantesFunciones.LABEL_ULTIMOCOSTO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelultimo_costoProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldultimo_costoProforma= new JTextFieldMe();
		jTextFieldultimo_costoProforma.setEnabled(false);
		jTextFieldultimo_costoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldultimo_costoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldultimo_costoProforma.setText("0.0");

		this.jButtonultimo_costoProformaBusqueda= new JButtonMe();
		this.jButtonultimo_costoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonultimo_costoProformaBusqueda.setText("U");
		this.jButtonultimo_costoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonultimo_costoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonultimo_costoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldultimo_costoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldultimo_costoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ultimo_costoProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonultimo_costoProformaBusqueda.setVisible(false);		}


					
		this.jLabelsubtotalProforma = new JLabelMe();
		this.jLabelsubtotalProforma.setText(""+ProformaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsubtotalProforma.setToolTipText("Subtotal");
		this.jLabelsubtotalProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsubtotalProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsubtotalProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsubtotalProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsubtotalProforma.setToolTipText(ProformaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelsubtotalProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldsubtotalProforma= new JTextFieldMe();
		jTextFieldsubtotalProforma.setEnabled(false);
		jTextFieldsubtotalProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsubtotalProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsubtotalProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsubtotalProforma.setText("0.0");

		this.jButtonsubtotalProformaBusqueda= new JButtonMe();
		this.jButtonsubtotalProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsubtotalProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsubtotalProformaBusqueda.setText("U");
		this.jButtonsubtotalProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsubtotalProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsubtotalProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsubtotalProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsubtotalProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"subtotalProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsubtotalProformaBusqueda.setVisible(false);		}


					
		this.jLabelotros_cargosProforma = new JLabelMe();
		this.jLabelotros_cargosProforma.setText(""+ProformaConstantesFunciones.LABEL_OTROSCARGOS+" : *");
		this.jLabelotros_cargosProforma.setToolTipText("Otros Cargos");
		this.jLabelotros_cargosProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotros_cargosProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotros_cargosProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotros_cargosProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotros_cargosProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotros_cargosProforma.setToolTipText(ProformaConstantesFunciones.LABEL_OTROSCARGOS);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelotros_cargosProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldotros_cargosProforma= new JTextFieldMe();
		jTextFieldotros_cargosProforma.setEnabled(false);
		jTextFieldotros_cargosProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_cargosProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_cargosProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotros_cargosProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotros_cargosProforma.setText("0.0");

		this.jButtonotros_cargosProformaBusqueda= new JButtonMe();
		this.jButtonotros_cargosProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_cargosProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_cargosProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotros_cargosProformaBusqueda.setText("U");
		this.jButtonotros_cargosProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotros_cargosProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotros_cargosProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotros_cargosProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotros_cargosProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otros_cargosProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotros_cargosProformaBusqueda.setVisible(false);		}


					
		this.jLabelmargen_utilidadProforma = new JLabelMe();
		this.jLabelmargen_utilidadProforma.setText(""+ProformaConstantesFunciones.LABEL_MARGENUTILIDAD+" : *");
		this.jLabelmargen_utilidadProforma.setToolTipText("Margen Utilidad");
		this.jLabelmargen_utilidadProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmargen_utilidadProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmargen_utilidadProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmargen_utilidadProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmargen_utilidadProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmargen_utilidadProforma.setToolTipText(ProformaConstantesFunciones.LABEL_MARGENUTILIDAD);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelmargen_utilidadProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldmargen_utilidadProforma= new JTextFieldMe();
		jTextFieldmargen_utilidadProforma.setEnabled(false);
		jTextFieldmargen_utilidadProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmargen_utilidadProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmargen_utilidadProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmargen_utilidadProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmargen_utilidadProforma.setText("0.0");

		this.jButtonmargen_utilidadProformaBusqueda= new JButtonMe();
		this.jButtonmargen_utilidadProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmargen_utilidadProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmargen_utilidadProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmargen_utilidadProformaBusqueda.setText("U");
		this.jButtonmargen_utilidadProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmargen_utilidadProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmargen_utilidadProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmargen_utilidadProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmargen_utilidadProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"margen_utilidadProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmargen_utilidadProformaBusqueda.setVisible(false);		}


					
		this.jLabelivaProforma = new JLabelMe();
		this.jLabelivaProforma.setText(""+ProformaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaProforma.setToolTipText("Iva");
		this.jLabelivaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelivaProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldivaProforma= new JTextFieldMe();
		jTextFieldivaProforma.setEnabled(false);
		jTextFieldivaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaProforma.setText("0.0");

		this.jButtonivaProformaBusqueda= new JButtonMe();
		this.jButtonivaProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaProformaBusqueda.setText("U");
		this.jButtonivaProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaProformaBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoProforma = new JLabelMe();
		this.jLabelfinanciamientoProforma.setText(""+ProformaConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoProforma.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoProforma.setToolTipText(ProformaConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelfinanciamientoProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldfinanciamientoProforma= new JTextFieldMe();
		jTextFieldfinanciamientoProforma.setEnabled(false);
		jTextFieldfinanciamientoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoProforma.setText("0.0");

		this.jButtonfinanciamientoProformaBusqueda= new JButtonMe();
		this.jButtonfinanciamientoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoProformaBusqueda.setText("U");
		this.jButtonfinanciamientoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoProformaBusqueda.setVisible(false);		}


					
		this.jLabeltotalProforma = new JLabelMe();
		this.jLabeltotalProforma.setText(""+ProformaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalProforma.setToolTipText("Total");
		this.jLabeltotalProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalProforma.setToolTipText(ProformaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPaneltotalProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldtotalProforma= new JTextFieldMe();
		jTextFieldtotalProforma.setEnabled(false);
		jTextFieldtotalProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalProforma.setText("0.0");

		this.jButtontotalProformaBusqueda= new JButtonMe();
		this.jButtontotalProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalProformaBusqueda.setText("U");
		this.jButtontotalProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalProformaBusqueda.setVisible(false);		}


					
		this.jLabelotros_valoresProforma = new JLabelMe();
		this.jLabelotros_valoresProforma.setText(""+ProformaConstantesFunciones.LABEL_OTROSVALORES+" : *");
		this.jLabelotros_valoresProforma.setToolTipText("Otros Valores");
		this.jLabelotros_valoresProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotros_valoresProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotros_valoresProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotros_valoresProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotros_valoresProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotros_valoresProforma.setToolTipText(ProformaConstantesFunciones.LABEL_OTROSVALORES);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelotros_valoresProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldotros_valoresProforma= new JTextFieldMe();
		jTextFieldotros_valoresProforma.setEnabled(false);
		jTextFieldotros_valoresProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_valoresProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_valoresProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotros_valoresProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotros_valoresProforma.setText("0.0");

		this.jButtonotros_valoresProformaBusqueda= new JButtonMe();
		this.jButtonotros_valoresProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_valoresProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_valoresProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotros_valoresProformaBusqueda.setText("U");
		this.jButtonotros_valoresProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotros_valoresProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotros_valoresProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotros_valoresProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotros_valoresProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otros_valoresProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotros_valoresProformaBusqueda.setVisible(false);		}


					
		this.jLabelanticipoProforma = new JLabelMe();
		this.jLabelanticipoProforma.setText(""+ProformaConstantesFunciones.LABEL_ANTICIPO+" : *");
		this.jLabelanticipoProforma.setToolTipText("Anticipo");
		this.jLabelanticipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanticipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanticipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanticipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanticipoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanticipoProforma.setToolTipText(ProformaConstantesFunciones.LABEL_ANTICIPO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelanticipoProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldanticipoProforma= new JTextFieldMe();
		jTextFieldanticipoProforma.setEnabled(false);
		jTextFieldanticipoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanticipoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanticipoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanticipoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldanticipoProforma.setText("0.0");

		this.jButtonanticipoProformaBusqueda= new JButtonMe();
		this.jButtonanticipoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanticipoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanticipoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanticipoProformaBusqueda.setText("U");
		this.jButtonanticipoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanticipoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanticipoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanticipoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanticipoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anticipoProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanticipoProformaBusqueda.setVisible(false);		}


					
		this.jLabeliceProforma = new JLabelMe();
		this.jLabeliceProforma.setText(""+ProformaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceProforma.setToolTipText("Ice");
		this.jLabeliceProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceProforma.setToolTipText(ProformaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPaneliceProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldiceProforma= new JTextFieldMe();
		jTextFieldiceProforma.setEnabled(false);
		jTextFieldiceProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceProforma.setText("0.0");

		this.jButtoniceProformaBusqueda= new JButtonMe();
		this.jButtoniceProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceProformaBusqueda.setText("U");
		this.jButtoniceProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceProformaBusqueda.setVisible(false);		}


					
		this.jLabelmonto_retencionProforma = new JLabelMe();
		this.jLabelmonto_retencionProforma.setText(""+ProformaConstantesFunciones.LABEL_MONTORETENCION+" : *");
		this.jLabelmonto_retencionProforma.setToolTipText("Monto Retencion");
		this.jLabelmonto_retencionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_retencionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_retencionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_retencionProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_retencionProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_retencionProforma.setToolTipText(ProformaConstantesFunciones.LABEL_MONTORETENCION);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelmonto_retencionProforma.setLayout(this.gridaBagLayoutProforma);


		jTextFieldmonto_retencionProforma= new JTextFieldMe();
		jTextFieldmonto_retencionProforma.setEnabled(false);
		jTextFieldmonto_retencionProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_retencionProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_retencionProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_retencionProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_retencionProforma.setText("0.0");

		this.jButtonmonto_retencionProformaBusqueda= new JButtonMe();
		this.jButtonmonto_retencionProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_retencionProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_retencionProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_retencionProformaBusqueda.setText("U");
		this.jButtonmonto_retencionProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_retencionProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_retencionProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_retencionProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_retencionProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_retencionProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_retencionProformaBusqueda.setVisible(false);		}


					
		this.jLabelfechaProforma = new JLabelMe();
		this.jLabelfechaProforma.setText(""+ProformaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaProforma.setToolTipText("Fecha");
		this.jLabelfechaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaProforma.setToolTipText(ProformaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelfechaProforma.setLayout(this.gridaBagLayoutProforma);


		//jFormattedTextFieldfechaProforma= new JFormattedTextFieldMe();

		jDateChooserfechaProforma= new JDateChooser();
		jDateChooserfechaProforma.setEnabled(false);
		jDateChooserfechaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaProforma.setDate(new Date());
		jDateChooserfechaProforma.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaProforma.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaProformaBusqueda= new JButtonMe();
		this.jButtonfechaProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaProformaBusqueda.setText("U");
		this.jButtonfechaProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaProformaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_servidorProforma = new JLabelMe();
		this.jLabelfecha_servidorProforma.setText(""+ProformaConstantesFunciones.LABEL_FECHASERVIDOR+" : *");
		this.jLabelfecha_servidorProforma.setToolTipText("Fecha Servidor");
		this.jLabelfecha_servidorProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_servidorProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_servidorProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_servidorProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_servidorProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_servidorProforma.setToolTipText(ProformaConstantesFunciones.LABEL_FECHASERVIDOR);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelfecha_servidorProforma.setLayout(this.gridaBagLayoutProforma);


		//jFormattedTextFieldfecha_servidorProforma= new JFormattedTextFieldMe();

		jDateChooserfecha_servidorProforma= new JDateChooser();
		jDateChooserfecha_servidorProforma.setEnabled(false);
		jDateChooserfecha_servidorProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_servidorProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_servidorProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_servidorProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_servidorProforma.setDate(new Date());
		jDateChooserfecha_servidorProforma.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_servidorProforma.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_servidorProformaBusqueda= new JButtonMe();
		this.jButtonfecha_servidorProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_servidorProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_servidorProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_servidorProformaBusqueda.setText("U");
		this.jButtonfecha_servidorProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_servidorProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_servidorProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_servidorProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_servidorProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_servidorProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_servidorProformaBusqueda.setVisible(false);		}


					
		this.jLabelhora_inicioProforma = new JLabelMe();
		this.jLabelhora_inicioProforma.setText(""+ProformaConstantesFunciones.LABEL_HORAINICIO+" : *");
		this.jLabelhora_inicioProforma.setToolTipText("Hora Inicio");
		this.jLabelhora_inicioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_inicioProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_inicioProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_inicioProforma.setToolTipText(ProformaConstantesFunciones.LABEL_HORAINICIO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelhora_inicioProforma.setLayout(this.gridaBagLayoutProforma);


		//jFormattedTextFieldhora_inicioProforma= new JFormattedTextFieldMe();

		jSpinnerhora_inicioProforma= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_inicioProforma.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_inicioProforma = new JSpinner.DateEditor(jSpinnerhora_inicioProforma, "HH:mm:ss");

		jSpinnerhora_inicioProforma.setEditor(timeEditorhora_inicioProforma);

		jSpinnerhora_inicioProforma.setValue(new Date());

		jSpinnerhora_inicioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_inicioProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_inicioProforma.setValue(new Date());
		//jSpinnerhora_inicioProforma.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_inicioProforma.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_inicioProformaBusqueda= new JButtonMe();
		this.jButtonhora_inicioProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_inicioProformaBusqueda.setText("U");
		this.jButtonhora_inicioProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_inicioProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_inicioProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_inicioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_inicioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_inicioProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_inicioProformaBusqueda.setVisible(false);		}


					
		this.jLabelhora_finProforma = new JLabelMe();
		this.jLabelhora_finProforma.setText(""+ProformaConstantesFunciones.LABEL_HORAFIN+" : *");
		this.jLabelhora_finProforma.setToolTipText("Hora Fin");
		this.jLabelhora_finProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_finProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_finProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_finProforma.setToolTipText(ProformaConstantesFunciones.LABEL_HORAFIN);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelhora_finProforma.setLayout(this.gridaBagLayoutProforma);


		//jFormattedTextFieldhora_finProforma= new JFormattedTextFieldMe();

		jSpinnerhora_finProforma= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_finProforma.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_finProforma = new JSpinner.DateEditor(jSpinnerhora_finProforma, "HH:mm:ss");

		jSpinnerhora_finProforma.setEditor(timeEditorhora_finProforma);

		jSpinnerhora_finProforma.setValue(new Date());

		jSpinnerhora_finProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_finProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_finProforma.setValue(new Date());
		//jSpinnerhora_finProforma.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_finProforma.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_finProformaBusqueda= new JButtonMe();
		this.jButtonhora_finProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_finProformaBusqueda.setText("U");
		this.jButtonhora_finProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_finProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_finProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_finProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_finProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_finProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_finProformaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProforma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProforma = new JLabelMe();
		this.jLabelid_empresaProforma.setText(""+ProformaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProforma.setToolTipText("Empresa");
		this.jLabelid_empresaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_empresaProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_empresaProforma= new JComboBoxMe();
		jComboBoxid_empresaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProforma.setEnabled(false);

		this.jButtonid_empresaProforma= new JButtonMe();
		this.jButtonid_empresaProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProforma.setText("Buscar");
		this.jButtonid_empresaProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProforma"));

		this.jButtonid_empresaProformaBusqueda= new JButtonMe();
		this.jButtonid_empresaProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProformaBusqueda.setText("U");
		this.jButtonid_empresaProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProformaBusqueda.setVisible(false);		}

		this.jButtonid_empresaProformaUpdate= new JButtonMe();
		this.jButtonid_empresaProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProformaUpdate.setText("U");
		this.jButtonid_empresaProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProformaUpdate"));



					
		this.jLabelid_sucursalProforma = new JLabelMe();
		this.jLabelid_sucursalProforma.setText(""+ProformaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalProforma.setToolTipText("Sucursal");
		this.jLabelid_sucursalProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_sucursalProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_sucursalProforma= new JComboBoxMe();
		jComboBoxid_sucursalProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalProforma.setEnabled(false);

		this.jButtonid_sucursalProforma= new JButtonMe();
		this.jButtonid_sucursalProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalProforma.setText("Buscar");
		this.jButtonid_sucursalProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProforma"));

		this.jButtonid_sucursalProformaBusqueda= new JButtonMe();
		this.jButtonid_sucursalProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProformaBusqueda.setText("U");
		this.jButtonid_sucursalProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalProformaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalProformaUpdate= new JButtonMe();
		this.jButtonid_sucursalProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalProformaUpdate.setText("U");
		this.jButtonid_sucursalProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalProformaUpdate"));



					
		this.jLabelid_usuarioProforma = new JLabelMe();
		this.jLabelid_usuarioProforma.setText(""+ProformaConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioProforma.setToolTipText("Usuario");
		this.jLabelid_usuarioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_usuarioProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_usuarioProforma= new JComboBoxMe();
		jComboBoxid_usuarioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioProforma.setEnabled(false);

		this.jButtonid_usuarioProforma= new JButtonMe();
		this.jButtonid_usuarioProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioProforma.setText("Buscar");
		this.jButtonid_usuarioProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioProforma"));

		this.jButtonid_usuarioProformaBusqueda= new JButtonMe();
		this.jButtonid_usuarioProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioProformaBusqueda.setText("U");
		this.jButtonid_usuarioProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioProformaBusqueda.setVisible(false);		}

		this.jButtonid_usuarioProformaUpdate= new JButtonMe();
		this.jButtonid_usuarioProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioProformaUpdate.setText("U");
		this.jButtonid_usuarioProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioProformaUpdate"));



					
		this.jLabelid_ejercicioProforma = new JLabelMe();
		this.jLabelid_ejercicioProforma.setText(""+ProformaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioProforma.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_ejercicioProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_ejercicioProforma= new JComboBoxMe();
		jComboBoxid_ejercicioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioProforma.setEnabled(false);

		this.jButtonid_ejercicioProforma= new JButtonMe();
		this.jButtonid_ejercicioProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioProforma.setText("Buscar");
		this.jButtonid_ejercicioProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProforma"));

		this.jButtonid_ejercicioProformaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProformaBusqueda.setText("U");
		this.jButtonid_ejercicioProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioProformaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioProformaUpdate= new JButtonMe();
		this.jButtonid_ejercicioProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioProformaUpdate.setText("U");
		this.jButtonid_ejercicioProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioProformaUpdate"));



					
		this.jLabelid_periodoProforma = new JLabelMe();
		this.jLabelid_periodoProforma.setText(""+ProformaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoProforma.setToolTipText("Periodo");
		this.jLabelid_periodoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_periodoProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_periodoProforma= new JComboBoxMe();
		jComboBoxid_periodoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoProforma.setEnabled(false);

		this.jButtonid_periodoProforma= new JButtonMe();
		this.jButtonid_periodoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoProforma.setText("Buscar");
		this.jButtonid_periodoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProforma"));

		this.jButtonid_periodoProformaBusqueda= new JButtonMe();
		this.jButtonid_periodoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoProformaBusqueda.setText("U");
		this.jButtonid_periodoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoProformaBusqueda.setVisible(false);		}

		this.jButtonid_periodoProformaUpdate= new JButtonMe();
		this.jButtonid_periodoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoProformaUpdate.setText("U");
		this.jButtonid_periodoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoProformaUpdate"));



					
		this.jLabelid_anioProforma = new JLabelMe();
		this.jLabelid_anioProforma.setText(""+ProformaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioProforma.setToolTipText("Anio");
		this.jLabelid_anioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_anioProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_anioProforma= new JComboBoxMe();
		jComboBoxid_anioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioProforma.setEnabled(false);

		this.jButtonid_anioProforma= new JButtonMe();
		this.jButtonid_anioProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioProforma.setText("Buscar");
		this.jButtonid_anioProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProforma"));

		this.jButtonid_anioProformaBusqueda= new JButtonMe();
		this.jButtonid_anioProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProformaBusqueda.setText("U");
		this.jButtonid_anioProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioProformaBusqueda.setVisible(false);		}

		this.jButtonid_anioProformaUpdate= new JButtonMe();
		this.jButtonid_anioProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioProformaUpdate.setText("U");
		this.jButtonid_anioProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioProformaUpdate"));



					
		this.jLabelid_mesProforma = new JLabelMe();
		this.jLabelid_mesProforma.setText(""+ProformaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesProforma.setToolTipText("Mes");
		this.jLabelid_mesProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_mesProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_mesProforma= new JComboBoxMe();
		jComboBoxid_mesProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesProforma.setEnabled(false);

		this.jButtonid_mesProforma= new JButtonMe();
		this.jButtonid_mesProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesProforma.setText("Buscar");
		this.jButtonid_mesProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProforma"));

		this.jButtonid_mesProformaBusqueda= new JButtonMe();
		this.jButtonid_mesProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProformaBusqueda.setText("U");
		this.jButtonid_mesProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesProformaBusqueda.setVisible(false);		}

		this.jButtonid_mesProformaUpdate= new JButtonMe();
		this.jButtonid_mesProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesProformaUpdate.setText("U");
		this.jButtonid_mesProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesProformaUpdate"));



					
		this.jLabelid_monedaProforma = new JLabelMe();
		this.jLabelid_monedaProforma.setText(""+ProformaConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaProforma.setToolTipText("Moneda");
		this.jLabelid_monedaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_monedaProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_monedaProforma= new JComboBoxMe();
		jComboBoxid_monedaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaProforma= new JButtonMe();
		this.jButtonid_monedaProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaProforma.setText("Buscar");
		this.jButtonid_monedaProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaProforma"));

		this.jButtonid_monedaProformaBusqueda= new JButtonMe();
		this.jButtonid_monedaProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaProformaBusqueda.setText("U");
		this.jButtonid_monedaProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaProformaBusqueda.setVisible(false);		}

		this.jButtonid_monedaProformaUpdate= new JButtonMe();
		this.jButtonid_monedaProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaProformaUpdate.setText("U");
		this.jButtonid_monedaProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaProformaUpdate"));



					
		this.jLabelid_empleadoProforma = new JLabelMe();
		this.jLabelid_empleadoProforma.setText(""+ProformaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoProforma.setToolTipText("Empleado");
		this.jLabelid_empleadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_empleadoProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_empleadoProforma= new JComboBoxMe();
		jComboBoxid_empleadoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoProforma= new JButtonMe();
		this.jButtonid_empleadoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoProforma.setText("Buscar");
		this.jButtonid_empleadoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProforma"));

		this.jButtonid_empleadoProformaBusqueda= new JButtonMe();
		this.jButtonid_empleadoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoProformaBusqueda.setText("U");
		this.jButtonid_empleadoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoProformaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoProformaUpdate= new JButtonMe();
		this.jButtonid_empleadoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoProformaUpdate.setText("U");
		this.jButtonid_empleadoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoProformaUpdate"));



					
		this.jLabelid_formatoProforma = new JLabelMe();
		this.jLabelid_formatoProforma.setText(""+ProformaConstantesFunciones.LABEL_IDFORMATO+" :");
		this.jLabelid_formatoProforma.setToolTipText("Formato");
		this.jLabelid_formatoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_formatoProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_formatoProforma= new JComboBoxMe();
		jComboBoxid_formatoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoProforma= new JButtonMe();
		this.jButtonid_formatoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoProforma.setText("Buscar");
		this.jButtonid_formatoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoProforma"));

		this.jButtonid_formatoProformaBusqueda= new JButtonMe();
		this.jButtonid_formatoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoProformaBusqueda.setText("U");
		this.jButtonid_formatoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoProformaBusqueda.setVisible(false);		}

		this.jButtonid_formatoProformaUpdate= new JButtonMe();
		this.jButtonid_formatoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoProformaUpdate.setText("U");
		this.jButtonid_formatoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoProformaUpdate"));



					
		this.jLabelid_estado_proformaProforma = new JLabelMe();
		this.jLabelid_estado_proformaProforma.setText(""+ProformaConstantesFunciones.LABEL_IDESTADOPROFORMA+" : *");
		this.jLabelid_estado_proformaProforma.setToolTipText("Estado");
		this.jLabelid_estado_proformaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_proformaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_proformaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_proformaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_proformaProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_proformaProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDESTADOPROFORMA);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_estado_proformaProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_estado_proformaProforma= new JComboBoxMe();
		jComboBoxid_estado_proformaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_proformaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_proformaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_proformaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_proformaProforma= new JButtonMe();
		this.jButtonid_estado_proformaProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_proformaProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_proformaProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_proformaProforma.setText("Buscar");
		this.jButtonid_estado_proformaProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_proformaProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_proformaProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_proformaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_proformaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_proformaProforma"));

		this.jButtonid_estado_proformaProformaBusqueda= new JButtonMe();
		this.jButtonid_estado_proformaProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_proformaProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_proformaProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_proformaProformaBusqueda.setText("U");
		this.jButtonid_estado_proformaProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_proformaProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_proformaProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_proformaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_proformaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_proformaProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_proformaProformaBusqueda.setVisible(false);		}

		this.jButtonid_estado_proformaProformaUpdate= new JButtonMe();
		this.jButtonid_estado_proformaProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_proformaProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_proformaProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_proformaProformaUpdate.setText("U");
		this.jButtonid_estado_proformaProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_proformaProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_proformaProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_proformaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_proformaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_proformaProformaUpdate"));



					
		this.jLabelid_clienteProforma = new JLabelMe();
		this.jLabelid_clienteProforma.setText(""+ProformaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteProforma.setToolTipText("Cliente");
		this.jLabelid_clienteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_clienteProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_clienteProforma= new JComboBoxMe();
		jComboBoxid_clienteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteProforma= new JButtonMe();
		this.jButtonid_clienteProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteProforma.setText("Buscar");
		this.jButtonid_clienteProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProforma"));

		this.jButtonid_clienteProformaBusqueda= new JButtonMe();
		this.jButtonid_clienteProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteProformaBusqueda.setText("U");
		this.jButtonid_clienteProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteProformaBusqueda.setVisible(false);		}

		this.jButtonid_clienteProformaUpdate= new JButtonMe();
		this.jButtonid_clienteProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteProformaUpdate.setText("U");
		this.jButtonid_clienteProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteProformaUpdate"));



					
		this.jLabelid_tipo_precioProforma = new JLabelMe();
		this.jLabelid_tipo_precioProforma.setText(""+ProformaConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioProforma.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_tipo_precioProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_tipo_precioProforma= new JComboBoxMe();
		jComboBoxid_tipo_precioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioProforma= new JButtonMe();
		this.jButtonid_tipo_precioProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioProforma.setText("Buscar");
		this.jButtonid_tipo_precioProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioProforma"));

		this.jButtonid_tipo_precioProformaBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioProformaBusqueda.setText("U");
		this.jButtonid_tipo_precioProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioProformaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioProformaUpdate= new JButtonMe();
		this.jButtonid_tipo_precioProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioProformaUpdate.setText("U");
		this.jButtonid_tipo_precioProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioProformaUpdate"));



					
		this.jLabelid_vendedorProforma = new JLabelMe();
		this.jLabelid_vendedorProforma.setText(""+ProformaConstantesFunciones.LABEL_IDVENDEDOR+" :");
		this.jLabelid_vendedorProforma.setToolTipText("Vendedor");
		this.jLabelid_vendedorProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_vendedorProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_vendedorProforma= new JComboBoxMe();
		jComboBoxid_vendedorProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorProforma= new JButtonMe();
		this.jButtonid_vendedorProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorProforma.setText("Buscar");
		this.jButtonid_vendedorProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProforma"));

		this.jButtonid_vendedorProformaBusqueda= new JButtonMe();
		this.jButtonid_vendedorProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorProformaBusqueda.setText("U");
		this.jButtonid_vendedorProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorProformaBusqueda.setVisible(false);		}

		this.jButtonid_vendedorProformaUpdate= new JButtonMe();
		this.jButtonid_vendedorProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorProformaUpdate.setText("U");
		this.jButtonid_vendedorProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProformaUpdate"));


		jButtonid_vendedorProformaArbol= new JButtonMe();
		jButtonid_vendedorProformaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorProformaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorProformaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorProformaArbol.setText("Arbol");
		jButtonid_vendedorProformaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorProformaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorProformaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorProformaArbol"));



					
		this.jLabelid_sub_clienteProforma = new JLabelMe();
		this.jLabelid_sub_clienteProforma.setText(""+ProformaConstantesFunciones.LABEL_IDSUBCLIENTE+" :");
		this.jLabelid_sub_clienteProforma.setToolTipText("Contacto");
		this.jLabelid_sub_clienteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sub_clienteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sub_clienteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sub_clienteProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sub_clienteProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sub_clienteProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDSUBCLIENTE);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_sub_clienteProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_sub_clienteProforma= new JComboBoxMe();
		jComboBoxid_sub_clienteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_clienteProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sub_clienteProforma= new JButtonMe();
		this.jButtonid_sub_clienteProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clienteProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clienteProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clienteProforma.setText("Buscar");
		this.jButtonid_sub_clienteProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sub_clienteProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clienteProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sub_clienteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clienteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clienteProforma"));

		this.jButtonid_sub_clienteProformaBusqueda= new JButtonMe();
		this.jButtonid_sub_clienteProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_clienteProformaBusqueda.setText("U");
		this.jButtonid_sub_clienteProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sub_clienteProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clienteProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sub_clienteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clienteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clienteProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sub_clienteProformaBusqueda.setVisible(false);		}

		this.jButtonid_sub_clienteProformaUpdate= new JButtonMe();
		this.jButtonid_sub_clienteProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_clienteProformaUpdate.setText("U");
		this.jButtonid_sub_clienteProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sub_clienteProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clienteProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sub_clienteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clienteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clienteProformaUpdate"));



					
		this.jLabelid_tipo_via_transporteProforma = new JLabelMe();
		this.jLabelid_tipo_via_transporteProforma.setText(""+ProformaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE+" : *");
		this.jLabelid_tipo_via_transporteProforma.setToolTipText("Forma Envio");
		this.jLabelid_tipo_via_transporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_via_transporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_via_transporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_via_transporteProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_via_transporteProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_via_transporteProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_tipo_via_transporteProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_tipo_via_transporteProforma= new JComboBoxMe();
		jComboBoxid_tipo_via_transporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_via_transporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_via_transporteProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_via_transporteProforma= new JButtonMe();
		this.jButtonid_tipo_via_transporteProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_via_transporteProforma.setText("Buscar");
		this.jButtonid_tipo_via_transporteProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_via_transporteProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_via_transporteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteProforma"));

		this.jButtonid_tipo_via_transporteProformaBusqueda= new JButtonMe();
		this.jButtonid_tipo_via_transporteProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transporteProformaBusqueda.setText("U");
		this.jButtonid_tipo_via_transporteProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_via_transporteProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_via_transporteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_via_transporteProformaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_via_transporteProformaUpdate= new JButtonMe();
		this.jButtonid_tipo_via_transporteProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_via_transporteProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_via_transporteProformaUpdate.setText("U");
		this.jButtonid_tipo_via_transporteProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_via_transporteProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_via_transporteProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_via_transporteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_via_transporteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_via_transporteProformaUpdate"));



					
		this.jLabelid_transporteProforma = new JLabelMe();
		this.jLabelid_transporteProforma.setText(""+ProformaConstantesFunciones.LABEL_IDTRANSPORTE+" : *");
		this.jLabelid_transporteProforma.setToolTipText("Transporte");
		this.jLabelid_transporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transporteProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transporteProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transporteProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDTRANSPORTE);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_transporteProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_transporteProforma= new JComboBoxMe();
		jComboBoxid_transporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transporteProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transporteProforma= new JButtonMe();
		this.jButtonid_transporteProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteProforma.setText("Buscar");
		this.jButtonid_transporteProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transporteProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transporteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteProforma"));

		this.jButtonid_transporteProformaBusqueda= new JButtonMe();
		this.jButtonid_transporteProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transporteProformaBusqueda.setText("U");
		this.jButtonid_transporteProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transporteProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transporteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transporteProformaBusqueda.setVisible(false);		}

		this.jButtonid_transporteProformaUpdate= new JButtonMe();
		this.jButtonid_transporteProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transporteProformaUpdate.setText("U");
		this.jButtonid_transporteProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transporteProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transporteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteProformaUpdate"));



					
		this.jLabelid_ruta_transporteProforma = new JLabelMe();
		this.jLabelid_ruta_transporteProforma.setText(""+ProformaConstantesFunciones.LABEL_IDRUTATRANSPORTE+" : *");
		this.jLabelid_ruta_transporteProforma.setToolTipText("Ruta");
		this.jLabelid_ruta_transporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ruta_transporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ruta_transporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ruta_transporteProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ruta_transporteProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ruta_transporteProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDRUTATRANSPORTE);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_ruta_transporteProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_ruta_transporteProforma= new JComboBoxMe();
		jComboBoxid_ruta_transporteProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ruta_transporteProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ruta_transporteProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ruta_transporteProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ruta_transporteProforma= new JButtonMe();
		this.jButtonid_ruta_transporteProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ruta_transporteProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ruta_transporteProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ruta_transporteProforma.setText("Buscar");
		this.jButtonid_ruta_transporteProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ruta_transporteProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ruta_transporteProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ruta_transporteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ruta_transporteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ruta_transporteProforma"));

		this.jButtonid_ruta_transporteProformaBusqueda= new JButtonMe();
		this.jButtonid_ruta_transporteProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ruta_transporteProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ruta_transporteProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ruta_transporteProformaBusqueda.setText("U");
		this.jButtonid_ruta_transporteProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ruta_transporteProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ruta_transporteProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ruta_transporteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ruta_transporteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ruta_transporteProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ruta_transporteProformaBusqueda.setVisible(false);		}

		this.jButtonid_ruta_transporteProformaUpdate= new JButtonMe();
		this.jButtonid_ruta_transporteProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ruta_transporteProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ruta_transporteProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ruta_transporteProformaUpdate.setText("U");
		this.jButtonid_ruta_transporteProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ruta_transporteProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ruta_transporteProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ruta_transporteProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ruta_transporteProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ruta_transporteProformaUpdate"));



					
		this.jLabelid_centro_costoProforma = new JLabelMe();
		this.jLabelid_centro_costoProforma.setText(""+ProformaConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoProforma.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_centro_costoProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_centro_costoProforma= new JComboBoxMe();
		jComboBoxid_centro_costoProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_centro_costoProforma.setEnabled(false);

		this.jButtonid_centro_costoProforma= new JButtonMe();
		this.jButtonid_centro_costoProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoProforma.setText("Buscar");
		this.jButtonid_centro_costoProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoProforma"));

		this.jButtonid_centro_costoProformaBusqueda= new JButtonMe();
		this.jButtonid_centro_costoProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoProformaBusqueda.setText("U");
		this.jButtonid_centro_costoProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoProformaBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoProformaUpdate= new JButtonMe();
		this.jButtonid_centro_costoProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoProformaUpdate.setText("U");
		this.jButtonid_centro_costoProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoProformaUpdate"));


		jButtonid_centro_costoProformaArbol= new JButtonMe();
		jButtonid_centro_costoProformaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoProformaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoProformaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoProformaArbol.setText("Arbol");
		jButtonid_centro_costoProformaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoProformaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoProformaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoProformaArbol"));



					
		this.jLabelid_tipo_proformaProforma = new JLabelMe();
		this.jLabelid_tipo_proformaProforma.setText(""+ProformaConstantesFunciones.LABEL_IDTIPOPROFORMA+" : *");
		this.jLabelid_tipo_proformaProforma.setToolTipText("Tipo Proforma");
		this.jLabelid_tipo_proformaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_proformaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_proformaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proformaProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_proformaProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_proformaProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDTIPOPROFORMA);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_tipo_proformaProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_tipo_proformaProforma= new JComboBoxMe();
		jComboBoxid_tipo_proformaProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proformaProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proformaProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proformaProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_proformaProforma.setEnabled(false);

		this.jButtonid_tipo_proformaProforma= new JButtonMe();
		this.jButtonid_tipo_proformaProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proformaProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proformaProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proformaProforma.setText("Buscar");
		this.jButtonid_tipo_proformaProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_proformaProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proformaProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_proformaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proformaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proformaProforma"));

		this.jButtonid_tipo_proformaProformaBusqueda= new JButtonMe();
		this.jButtonid_tipo_proformaProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proformaProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proformaProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proformaProformaBusqueda.setText("U");
		this.jButtonid_tipo_proformaProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_proformaProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proformaProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_proformaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proformaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proformaProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_proformaProformaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_proformaProformaUpdate= new JButtonMe();
		this.jButtonid_tipo_proformaProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proformaProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proformaProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proformaProformaUpdate.setText("U");
		this.jButtonid_tipo_proformaProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_proformaProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proformaProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_proformaProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proformaProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proformaProformaUpdate"));



					
		this.jLabelid_consignatarioProforma = new JLabelMe();
		this.jLabelid_consignatarioProforma.setText(""+ProformaConstantesFunciones.LABEL_IDCONSIGNATARIO+" : *");
		this.jLabelid_consignatarioProforma.setToolTipText("Consignatario");
		this.jLabelid_consignatarioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consignatarioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_consignatarioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_consignatarioProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_consignatarioProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_consignatarioProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDCONSIGNATARIO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_consignatarioProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_consignatarioProforma= new JComboBoxMe();
		jComboBoxid_consignatarioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignatarioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_consignatarioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_consignatarioProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_consignatarioProforma.setEnabled(false);

		this.jButtonid_consignatarioProforma= new JButtonMe();
		this.jButtonid_consignatarioProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consignatarioProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consignatarioProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_consignatarioProforma.setText("Buscar");
		this.jButtonid_consignatarioProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_consignatarioProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consignatarioProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_consignatarioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consignatarioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consignatarioProforma"));

		this.jButtonid_consignatarioProformaBusqueda= new JButtonMe();
		this.jButtonid_consignatarioProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignatarioProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignatarioProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consignatarioProformaBusqueda.setText("U");
		this.jButtonid_consignatarioProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_consignatarioProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consignatarioProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_consignatarioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consignatarioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consignatarioProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_consignatarioProformaBusqueda.setVisible(false);		}

		this.jButtonid_consignatarioProformaUpdate= new JButtonMe();
		this.jButtonid_consignatarioProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignatarioProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_consignatarioProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_consignatarioProformaUpdate.setText("U");
		this.jButtonid_consignatarioProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_consignatarioProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_consignatarioProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_consignatarioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_consignatarioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_consignatarioProformaUpdate"));



					
		this.jLabelid_tipo_cambioProforma = new JLabelMe();
		this.jLabelid_tipo_cambioProforma.setText(""+ProformaConstantesFunciones.LABEL_IDTIPOCAMBIO+" :");
		this.jLabelid_tipo_cambioProforma.setToolTipText("T. Cambio");
		this.jLabelid_tipo_cambioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioProforma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioProforma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioProforma.setToolTipText(ProformaConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutProforma = new GridBagLayout();
		this.jPanelid_tipo_cambioProforma.setLayout(this.gridaBagLayoutProforma);


		jComboBoxid_tipo_cambioProforma= new JComboBoxMe();
		jComboBoxid_tipo_cambioProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_cambioProforma.setEnabled(false);

		this.jButtonid_tipo_cambioProforma= new JButtonMe();
		this.jButtonid_tipo_cambioProforma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioProforma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioProforma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioProforma.setText("Buscar");
		this.jButtonid_tipo_cambioProforma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioProforma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioProforma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioProforma"));

		this.jButtonid_tipo_cambioProformaBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioProformaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioProformaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioProformaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioProformaBusqueda.setText("U");
		this.jButtonid_tipo_cambioProformaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioProformaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioProformaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioProformaBusqueda"));

		if(this.proformaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioProformaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioProformaUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioProformaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioProformaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioProformaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioProformaUpdate.setText("U");
		this.jButtonid_tipo_cambioProformaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioProformaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioProformaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioProformaUpdate"));



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
		//this.jInternalFrameDetalleProforma = new ProformaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Proforma DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProforma= new GridBagLayout();
		

		
		String sToolTipProforma="";
		sToolTipProforma=ProformaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProforma+="(Facturacion.Proforma)";
		}
		
		if(!this.proformaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProforma+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProforma = new JButtonMe();
		this.jButtonModificarProforma = new JButtonMe();
        this.jButtonActualizarProforma = new JButtonMe();
        this.jButtonEliminarProforma = new JButtonMe();
        this.jButtonCancelarProforma = new JButtonMe();
        this.jButtonGuardarCambiosProforma = new JButtonMe();
		this.jButtonGuardarCambiosTablaProforma = new JButtonMe();
		this.jButtonCerrarProforma = new JButtonMe();
		
		this.jScrollPanelDatosProforma = new JScrollPane();   
        this.jScrollPanelDatosEdicionProforma = new JScrollPane();
		this.jScrollPanelDatosGeneralProforma = new JScrollPane();
				
		
		
		this.jPanelCamposProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFindatos_valoresProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Proforma";
		
		if(!this.proformaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Proformas" + this.sPath));
		} else {
			this.jScrollPanelDatosProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposProforma.setName("jPanelCamposProforma"); 

		this.jPanelCamposOcultosProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProforma.setName("jPanelCamposOcultosProforma"); 

        this.jPanelAccionesProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProforma.setToolTipText("Acciones");
        this.jPanelAccionesProforma.setName("Acciones"); 

		this.jPanelAccionesFormularioProforma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProforma.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProforma.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProforma, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProforma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFindatos_valoresProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFindatos_valoresProforma.setName("jPanelCamposFindatos_valoresProforma");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFindatos_valoresProforma, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProforma.setText("Nuevo");
		this.jButtonModificarProforma.setText("Editar");
        this.jButtonActualizarProforma.setText("Actualizar");
        this.jButtonEliminarProforma.setText("Eliminar");
        this.jButtonCancelarProforma.setText("Cancelar");
        this.jButtonGuardarCambiosProforma.setText("Guardar");
		this.jButtonGuardarCambiosTablaProforma.setText("Guardar");
		this.jButtonCerrarProforma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProforma,"nuevo_button","Nuevo",this.proformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProforma,"modificar_button","Editar",this.proformaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProforma,"actualizar_button","Actualizar",this.proformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProforma,"eliminar_button","Eliminar",this.proformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProforma,"cancelar_button","Cancelar",this.proformaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProforma,"guardarcambios_button","Guardar",this.proformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProforma,"guardarcambiostabla_button","Guardar",this.proformaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProforma,"cerrar_button","Salir",this.proformaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProforma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProforma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProforma.setToolTipText("Nuevo"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProforma.setToolTipText("Editar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProforma.setToolTipText("Actualizar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProforma.setToolTipText("Eliminar)"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProforma.setToolTipText("Cancelar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProforma.setToolTipText("Guardar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProforma.setToolTipText("Guardar"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProforma.setToolTipText("Salir"+" "+ProformaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProforma";
		inputMap = this.jButtonNuevoProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProforma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProforma"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProforma";
		inputMap = this.jButtonActualizarProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProforma"));
		
		//ELIMINAR
		sMapKey = "EliminarProforma";
		inputMap = this.jButtonEliminarProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProforma"));
		
		//CANCELAR	
		sMapKey = "CancelarProforma";
		inputMap = this.jButtonCancelarProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProforma"));
		
		//CERRAR		
		sMapKey = "CerrarProforma";
		inputMap = this.jButtonCerrarProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProforma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProforma";
		inputMap = this.jButtonGuardarCambiosTablaProforma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProforma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProforma"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProforma.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProforma.setToolTipText("Nuevo Proforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProforma.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProforma.setToolTipText("Sin Cerrar Ventana Proforma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProforma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProforma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProforma.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProforma.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProforma, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProforma.setText("Accion");
		this.jComboBoxTiposAccionesProforma.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProforma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProforma.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProforma.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProforma = new JLabelMe();
		
		this.jLabelAccionesProforma.setText("Acciones");		
		this.jLabelAccionesProforma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProforma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProforma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProforma();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProforma();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProforma=new JTabbedPane();
		this.jTabbedPaneRelacionesProforma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProforma,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProforma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProforma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProforma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProforma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProforma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProforma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProforma.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProforma, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProforma = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProforma = new GridBagLayout();
		
		this.jPanelCamposProforma.setLayout(gridaBagLayoutCamposProforma);
		this.jPanelCamposOcultosProforma.setLayout(gridaBagLayoutCamposOcultosProforma);
		
		

		GridBagLayout gridaBagLayoutCamposFindatos_valoresProforma= new GridBagLayout();
		this.jPanelCamposFindatos_valoresProforma.setLayout(gridaBagLayoutCamposFindatos_valoresProforma);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidProforma.add(jLabelIdProforma, this.gridBagConstraintsProforma);



	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidProforma.add(jLabelidProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaProforma.add(jLabelid_empresaProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProforma.add(jButtonid_empresaProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProforma.add(jButtonid_empresaProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaProforma.add(jComboBoxid_empresaProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalProforma.add(jLabelid_sucursalProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProforma.add(jButtonid_sucursalProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalProforma.add(jButtonid_sucursalProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalProforma.add(jComboBoxid_sucursalProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_usuarioProforma.add(jLabelid_usuarioProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioProforma.add(jButtonid_usuarioProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioProforma.add(jButtonid_usuarioProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_usuarioProforma.add(jComboBoxid_usuarioProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioProforma.add(jLabelid_ejercicioProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProforma.add(jButtonid_ejercicioProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioProforma.add(jButtonid_ejercicioProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioProforma.add(jComboBoxid_ejercicioProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoProforma.add(jLabelid_periodoProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoProforma.add(jButtonid_periodoProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoProforma.add(jButtonid_periodoProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoProforma.add(jComboBoxid_periodoProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioProforma.add(jLabelid_anioProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProforma.add(jButtonid_anioProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioProforma.add(jButtonid_anioProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioProforma.add(jComboBoxid_anioProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesProforma.add(jLabelid_mesProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProforma.add(jButtonid_mesProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesProforma.add(jButtonid_mesProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesProforma.add(jComboBoxid_mesProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_pre_impresoProforma.add(jLabelnumero_pre_impresoProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoProforma.add(jButtonnumero_pre_impresoProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_pre_impresoProforma.add(jTextFieldnumero_pre_impresoProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionProforma.add(jLabelfecha_emisionProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionProforma.add(jButtonfecha_emisionProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionProforma.add(jDateChooserfecha_emisionProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldiasProforma.add(jLabeldiasProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldiasProforma.add(jButtondiasProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldiasProforma.add(jTextFielddiasProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_vencimientoProforma.add(jLabelfecha_vencimientoProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoProforma.add(jButtonfecha_vencimientoProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_vencimientoProforma.add(jDateChooserfecha_vencimientoProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaProforma.add(jLabelid_monedaProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaProforma.add(jButtonid_monedaProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaProforma.add(jButtonid_monedaProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaProforma.add(jComboBoxid_monedaProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcotizacionProforma.add(jLabelcotizacionProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcotizacionProforma.add(jButtoncotizacionProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcotizacionProforma.add(jTextFieldcotizacionProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empleadoProforma.add(jLabelid_empleadoProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProforma = new GridBagConstraints();
	//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 2;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoProforma.add(jButtonid_empleadoProforma, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoProforma.add(jButtonid_empleadoProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 4;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoProforma.add(jButtonid_empleadoProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empleadoProforma.add(jComboBoxid_empleadoProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_formatoProforma.add(jLabelid_formatoProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoProforma.add(jButtonid_formatoProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoProforma.add(jButtonid_formatoProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_formatoProforma.add(jComboBoxid_formatoProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_proformaProforma.add(jLabelid_estado_proformaProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_proformaProforma.add(jButtonid_estado_proformaProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_proformaProforma.add(jButtonid_estado_proformaProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_proformaProforma.add(jComboBoxid_estado_proformaProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldireccionProforma.add(jLabeldireccionProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionProforma.add(jButtondireccionProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldireccionProforma.add(jscrollPanedireccionProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteProforma.add(jLabelid_clienteProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProforma = new GridBagConstraints();
	//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 2;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteProforma.add(jButtonid_clienteProforma, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteProforma.add(jButtonid_clienteProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 4;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteProforma.add(jButtonid_clienteProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteProforma.add(jComboBoxid_clienteProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelrucProforma.add(jLabelrucProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucProforma.add(jButtonrucProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelrucProforma.add(jTextFieldrucProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneles_ofertaProforma.add(jLabeles_ofertaProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_ofertaProforma.add(jButtones_ofertaProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneles_ofertaProforma.add(jCheckBoxes_ofertaProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltelefonoProforma.add(jLabeltelefonoProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoProforma.add(jButtontelefonoProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltelefonoProforma.add(jTextFieldtelefonoProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_precioProforma.add(jLabelid_tipo_precioProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioProforma.add(jButtonid_tipo_precioProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioProforma.add(jButtonid_tipo_precioProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_precioProforma.add(jComboBoxid_tipo_precioProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_vendedorProforma.add(jLabelid_vendedorProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProforma = new GridBagConstraints();
	//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 2;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorProforma.add(jButtonid_vendedorProforma, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProforma = new GridBagConstraints();
	//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 3;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorProforma.add(jButtonid_vendedorProformaArbol, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 4;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorProforma.add(jButtonid_vendedorProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 5;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorProforma.add(jButtonid_vendedorProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_vendedorProforma.add(jComboBoxid_vendedorProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sub_clienteProforma.add(jLabelid_sub_clienteProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_clienteProforma.add(jButtonid_sub_clienteProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_clienteProforma.add(jButtonid_sub_clienteProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sub_clienteProforma.add(jComboBoxid_sub_clienteProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_via_transporteProforma.add(jLabelid_tipo_via_transporteProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transporteProforma.add(jButtonid_tipo_via_transporteProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_via_transporteProforma.add(jButtonid_tipo_via_transporteProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_via_transporteProforma.add(jComboBoxid_tipo_via_transporteProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transporteProforma.add(jLabelid_transporteProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transporteProforma.add(jButtonid_transporteProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transporteProforma.add(jButtonid_transporteProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transporteProforma.add(jComboBoxid_transporteProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ruta_transporteProforma.add(jLabelid_ruta_transporteProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ruta_transporteProforma.add(jButtonid_ruta_transporteProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ruta_transporteProforma.add(jButtonid_ruta_transporteProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ruta_transporteProforma.add(jComboBoxid_ruta_transporteProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionProforma.add(jLabeldescripcionProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProforma.add(jButtondescripcionProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionProforma.add(jscrollPanedescripcionProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuento_porcentajeProforma.add(jLabeldescuento_porcentajeProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_porcentajeProforma.add(jButtondescuento_porcentajeProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuento_porcentajeProforma.add(jTextFielddescuento_porcentajeProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_con_ivaProforma.add(jLabelmonto_con_ivaProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_con_ivaProforma.add(jButtonmonto_con_ivaProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_con_ivaProforma.add(jTextFieldmonto_con_ivaProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsumanProforma.add(jLabelsumanProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelsumanProforma.add(jButtonsumanProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsumanProforma.add(jTextFieldsumanProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuento_valorProforma.add(jLabeldescuento_valorProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorProforma.add(jButtondescuento_valorProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuento_valorProforma.add(jTextFielddescuento_valorProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_sin_ivaProforma.add(jLabelmonto_sin_ivaProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_sin_ivaProforma.add(jButtonmonto_sin_ivaProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_sin_ivaProforma.add(jTextFieldmonto_sin_ivaProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuento_generalProforma.add(jLabeldescuento_generalProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_generalProforma.add(jButtondescuento_generalProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuento_generalProforma.add(jTextFielddescuento_generalProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfleteProforma.add(jLabelfleteProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteProforma.add(jButtonfleteProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfleteProforma.add(jTextFieldfleteProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelultimo_costoProforma.add(jLabelultimo_costoProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelultimo_costoProforma.add(jButtonultimo_costoProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelultimo_costoProforma.add(jTextFieldultimo_costoProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsubtotalProforma.add(jLabelsubtotalProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelsubtotalProforma.add(jButtonsubtotalProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsubtotalProforma.add(jTextFieldsubtotalProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelotros_cargosProforma.add(jLabelotros_cargosProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelotros_cargosProforma.add(jButtonotros_cargosProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelotros_cargosProforma.add(jTextFieldotros_cargosProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmargen_utilidadProforma.add(jLabelmargen_utilidadProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelmargen_utilidadProforma.add(jButtonmargen_utilidadProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmargen_utilidadProforma.add(jTextFieldmargen_utilidadProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelivaProforma.add(jLabelivaProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaProforma.add(jButtonivaProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelivaProforma.add(jTextFieldivaProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfinanciamientoProforma.add(jLabelfinanciamientoProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoProforma.add(jButtonfinanciamientoProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfinanciamientoProforma.add(jTextFieldfinanciamientoProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalProforma.add(jLabeltotalProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalProforma.add(jButtontotalProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalProforma.add(jTextFieldtotalProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelotros_valoresProforma.add(jLabelotros_valoresProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelotros_valoresProforma.add(jButtonotros_valoresProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelotros_valoresProforma.add(jTextFieldotros_valoresProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelanticipoProforma.add(jLabelanticipoProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelanticipoProforma.add(jButtonanticipoProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelanticipoProforma.add(jTextFieldanticipoProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneliceProforma.add(jLabeliceProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceProforma.add(jButtoniceProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneliceProforma.add(jTextFieldiceProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_retencionProforma.add(jLabelmonto_retencionProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_retencionProforma.add(jButtonmonto_retencionProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_retencionProforma.add(jTextFieldmonto_retencionProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaProforma.add(jLabelfechaProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaProforma.add(jButtonfechaProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaProforma.add(jDateChooserfechaProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_servidorProforma.add(jLabelfecha_servidorProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_servidorProforma.add(jButtonfecha_servidorProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_servidorProforma.add(jDateChooserfecha_servidorProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelhora_inicioProforma.add(jLabelhora_inicioProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_inicioProforma.add(jButtonhora_inicioProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelhora_inicioProforma.add(jSpinnerhora_inicioProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelhora_finProforma.add(jLabelhora_finProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_finProforma.add(jButtonhora_finProformaBusqueda, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelhora_finProforma.add(jSpinnerhora_finProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_centro_costoProforma.add(jLabelid_centro_costoProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProforma = new GridBagConstraints();
	//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 2;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoProforma.add(jButtonid_centro_costoProforma, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProforma = new GridBagConstraints();
	//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 3;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoProforma.add(jButtonid_centro_costoProformaArbol, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 4;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoProforma.add(jButtonid_centro_costoProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 5;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoProforma.add(jButtonid_centro_costoProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_centro_costoProforma.add(jComboBoxid_centro_costoProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_proformaProforma.add(jLabelid_tipo_proformaProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proformaProforma.add(jButtonid_tipo_proformaProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proformaProforma.add(jButtonid_tipo_proformaProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_proformaProforma.add(jComboBoxid_tipo_proformaProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_consignatarioProforma.add(jLabelid_consignatarioProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 2;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consignatarioProforma.add(jButtonid_consignatarioProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_consignatarioProforma.add(jButtonid_consignatarioProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_consignatarioProforma.add(jComboBoxid_consignatarioProforma, this.gridBagConstraintsProforma);


	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 0;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_cambioProforma.add(jLabelid_tipo_cambioProforma, this.gridBagConstraintsProforma);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsProforma = new GridBagConstraints();
	//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 2;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioProforma.add(jButtonid_tipo_cambioProforma, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 3;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioProforma.add(jButtonid_tipo_cambioProformaBusqueda, this.gridBagConstraintsProforma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProforma = new GridBagConstraints();
		//this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = 4;
		this.gridBagConstraintsProforma.ipadx = 0;
		this.gridBagConstraintsProforma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioProforma.add(jButtonid_tipo_cambioProformaUpdate, this.gridBagConstraintsProforma);
	}

	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProforma.gridy = 0;
	this.gridBagConstraintsProforma.gridx = 1;
	this.gridBagConstraintsProforma.ipadx = 0;
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_cambioProforma.add(jComboBoxid_tipo_cambioProforma, this.gridBagConstraintsProforma);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelidProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelnumero_pre_impresoProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelfecha_emisionProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPaneldiasProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelfecha_vencimientoProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelid_monedaProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelcotizacionProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelid_empleadoProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelid_formatoProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelid_estado_proformaProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPaneldireccionProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelid_clienteProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelrucProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPaneles_ofertaProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPaneltelefonoProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelid_tipo_precioProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelid_vendedorProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelid_sub_clienteProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelid_tipo_via_transporteProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelid_transporteProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPanelid_ruta_transporteProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposProforma.add(this.jPaneldescripcionProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposProforma % 4==0) {
		iXPanelCamposProforma=0;
		iYPanelCamposProforma++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelid_empresaProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelid_sucursalProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelid_usuarioProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelid_ejercicioProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelid_periodoProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelid_anioProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelid_mesProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPaneliceProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelmonto_retencionProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelfechaProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelfecha_servidorProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelhora_inicioProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelhora_finProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelid_centro_costoProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelid_tipo_proformaProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelid_consignatarioProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposOcultosProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposOcultosProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosProforma.add(this.jPanelid_tipo_cambioProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposOcultosProforma % 4==0) {
		iXPanelCamposOcultosProforma=0;
		iYPanelCamposOcultosProforma++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPaneldescuento_porcentajeProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPanelmonto_con_ivaProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPanelsumanProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPaneldescuento_valorProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPanelmonto_sin_ivaProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPaneldescuento_generalProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPanelfleteProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPanelultimo_costoProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPanelsubtotalProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPanelotros_cargosProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPanelmargen_utilidadProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPanelivaProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPanelfinanciamientoProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPaneltotalProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPanelotros_valoresProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
	}
	this.gridBagConstraintsProforma = new GridBagConstraints();
	this.gridBagConstraintsProforma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProforma.gridy = iYPanelCamposFindatos_valoresProforma;
	this.gridBagConstraintsProforma.gridx = iXPanelCamposFindatos_valoresProforma++;
	this.gridBagConstraintsProforma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProforma.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFindatos_valoresProforma.add(this.jPanelanticipoProforma, this.gridBagConstraintsProforma);



	if(iXPanelCamposFindatos_valoresProforma % 3==0) {
		iXPanelCamposFindatos_valoresProforma=0;
		iYPanelCamposFindatos_valoresProforma++;
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
			
		GridBagLayout gridaBagLayoutAccionesProforma= new GridBagLayout();
		this.jPanelAccionesProforma.setLayout(gridaBagLayoutAccionesProforma);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProforma= new GridBagLayout();
		this.jPanelAccionesFormularioProforma.setLayout(gridaBagLayoutAccionesFormularioProforma);
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProforma.add(this.jComboBoxTiposAccionesFormularioProforma, this.gridBagConstraintsProforma);

		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProforma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProforma.add(this.jCheckBoxPostAccionNuevoProforma, this.gridBagConstraintsProforma);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.proformaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProforma.add(this.jCheckBoxPostAccionSinCerrarProforma, this.gridBagConstraintsProforma);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.proformaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.proformaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProforma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProforma.add(this.jCheckBoxPostAccionSinMensajeProforma, this.gridBagConstraintsProforma);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx = iPosXAccion++;
			
		this.jPanelAccionesProforma.add(this.jButtonModificarProforma, this.gridBagConstraintsProforma);							

		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProforma.gridy = 0;
		this.gridBagConstraintsProforma.gridx =iPosXAccion++;
			
		this.jPanelAccionesProforma.add(this.jButtonEliminarProforma, this.gridBagConstraintsProforma);
		
			
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = 0;		
		this.gridBagConstraintsProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesProforma.add(this.jButtonActualizarProforma, this.gridBagConstraintsProforma);


		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = 0;		
		this.gridBagConstraintsProforma.gridx = iPosXAccion++;
		
		this.jPanelAccionesProforma.add(this.jButtonGuardarCambiosProforma, this.gridBagConstraintsProforma);	
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = 0;		
		this.gridBagConstraintsProforma.gridx =iPosXAccion++;
		
		this.jPanelAccionesProforma.add(this.jButtonCancelarProforma, this.gridBagConstraintsProforma);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProforma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProforma);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.proformaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProforma = new GridBagConstraints();						
			this.gridBagConstraintsProforma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProforma.gridx = 0;		
			//this.gridBagConstraintsProforma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProforma.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProforma.gridx =0;
		this.gridBagConstraintsProforma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProforma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProforma, this.gridBagConstraintsProforma);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProformaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProforma = new ProformaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Proforma DATOS");
			
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
			
	        //this.setTitle("[FOR] - Proforma DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proforma Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProformaModel proformaModel=new ProformaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProformaModel.ProformaFocusTraversalPolicy proformaFocusTraversalPolicy = proformaModel.new ProformaFocusTraversalPolicy(this);
			
			//proformaFocusTraversalPolicy.setproformaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(proformaModel);
			
			
			this.jContentPaneDetalleProforma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProforma = new GridBagLayout();	
			this.jContentPaneDetalleProforma.setLayout(gridaBagLayoutDetalleProforma);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProforma = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionProforma=   new JScrollPane(jContentPaneDetalleProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProforma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsProforma.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProforma.gridx = 0;
	        
			this.jContentPaneDetalleProforma.add(jPanelCamposProforma, gridBagConstraintsProforma);
			
			
			
			
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
						&& proformaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleProforma(this.puedeCargarPorParteDetalleProforma,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTerminoProforma(this.puedeCargarPorParteTerminoProforma,false,-1);
					
					if(this.proformaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProforma= new GridBagConstraints();
						this.gridBagConstraintsProforma.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProforma.gridx = 0;
						this.jContentPaneDetalleProforma.add(this.jTabbedPaneRelacionesProforma, this.gridBagConstraintsProforma);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProforma.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleProforma(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTerminoProforma(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsProforma.gridy = iGridyRelaciones++;
		this.gridBagConstraintsProforma.gridx = 0;

		this.jContentPaneDetalleProforma.add(jPanelCamposFindatos_valoresProforma, gridBagConstraintsProforma);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProforma.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProforma = new GridBagConstraints();
					this.gridBagConstraintsProforma.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProforma.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProforma.gridx = 0;
					
				
					this.jContentPaneDetalleProforma.add(jPanelCamposOcultosProforma, gridBagConstraintsProforma);
				
					this.jPanelCamposOcultosProforma.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsProforma.gridx = 0;
	        this.gridBagConstraintsProforma.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProforma.add(this.jPanelAccionesFormularioProforma, this.gridBagConstraintsProforma);							
			
			
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsProforma.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsProforma.gridx = 0;
	        
			
			this.jContentPaneDetalleProforma.add(this.jPanelAccionesProforma, this.gridBagConstraintsProforma);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProforma);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProforma=   new JScrollPane(this.jPanelCamposProforma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProforma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProforma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProforma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProforma.gridx = 0;
			this.gridBagConstraintsProforma.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProforma.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProforma.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProforma, this.gridBagConstraintsProforma);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProforma, this.gridBagConstraintsProforma);			
			
			this.gridBagConstraintsProforma = new GridBagConstraints();
			this.gridBagConstraintsProforma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProforma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProforma, this.gridBagConstraintsProforma);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProforma, this.gridBagConstraintsProforma);
			
			
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProforma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProforma, this.gridBagConstraintsProforma);
		
			
		this.gridBagConstraintsProforma = new GridBagConstraints();
		this.gridBagConstraintsProforma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProforma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProforma, this.gridBagConstraintsProforma);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProforma;//jContentPane;
		
		return jScrollPanelDatosEdicionProforma;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleProforma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleproformaSessionBean=new DetalleProformaSessionBean();
		this.detalleproformaSessionBean.setConGuardarRelaciones(false);
		this.detalleproformaSessionBean.setEsGuardarRelacionado(true);

		this.detalleproformaBeanSwingJInternalFrame=null;//new DetalleProformaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleproformaBeanSwingJInternalFramePopup=new DetalleProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleproformaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleproformaSessionBean.getEsGuardarRelacionado()) {

				DetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL=ProformaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProformaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleproformaSessionBean.setEsGuardarRelacionado(true);

				this.detalleproformaBeanSwingJInternalFrame=new DetalleProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleproformaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleproformaBeanSwingJInternalFrame.setdetalleproformaSessionBean(this.detalleproformaSessionBean);

				//this.gridBagConstraintsProforma = new GridBagConstraints();
				//this.gridBagConstraintsProforma.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProforma.gridx = 0;
				//this.jContentPaneDetalleProforma.add(this.detalleproformaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProforma);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProforma.add("Detalle Proformas",this.detalleproformaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProforma.setComponentAt(iIndexTab,this.detalleproformaBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleproformaSessionBean.setEsGuardarRelacionado(false);
				this.detalleproformaBeanSwingJInternalFrame=null;//new DetalleProformaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleproformaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleProforma) {
					this.jTabbedPaneRelacionesProforma.add("Detalle Proformas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTerminoProforma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.terminoproformaSessionBean=new TerminoProformaSessionBean();
		this.terminoproformaSessionBean.setConGuardarRelaciones(true);
		this.terminoproformaSessionBean.setEsGuardarRelacionado(true);

		this.terminoproformaBeanSwingJInternalFrame=null;//new TerminoProformaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.terminoproformaBeanSwingJInternalFramePopup=new TerminoProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.terminoproformaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.terminoproformaSessionBean.getEsGuardarRelacionado()) {

				TerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL=ProformaJInternalFrame.STIPO_TAMANIO_GENERAL;
				TerminoProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProformaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.terminoproformaSessionBean.setEsGuardarRelacionado(true);

				this.terminoproformaBeanSwingJInternalFrame=new TerminoProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.terminoproformaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.terminoproformaBeanSwingJInternalFrame.setterminoproformaSessionBean(this.terminoproformaSessionBean);

				//this.gridBagConstraintsProforma = new GridBagConstraints();
				//this.gridBagConstraintsProforma.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProforma.gridx = 0;
				//this.jContentPaneDetalleProforma.add(this.terminoproformaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProforma);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProforma.add("Termino Proformas",this.terminoproformaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProforma.setComponentAt(iIndexTab,this.terminoproformaBeanSwingJInternalFrame.getContentPane());
				}

				//TerminoProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.terminoproformaSessionBean.setEsGuardarRelacionado(false);
				this.terminoproformaBeanSwingJInternalFrame=null;//new TerminoProformaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTerminoProforma) {
					this.jTabbedPaneRelacionesProforma.add("Termino Proformas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTerminoProformaBeanSwingJInternalFrame(List<Proforma> proformas,Proforma proforma,TerminoProformaBeanSwingJInternalFrame terminoproformaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//terminoproformaBeanSwingJInternalFrame=new TerminoProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					terminoproformaBeanSwingJInternalFrame.getTerminoProformaLogic().setConnexion(this.proformaLogic.getConnexion());

					terminoproformaBeanSwingJInternalFrame.setproformasForeignKey(proformas);
					terminoproformaBeanSwingJInternalFrame.setproformaForeignKey(proforma);
					terminoproformaBeanSwingJInternalFrame.terminoproformaSessionBean.setisBusquedaDesdeForeignKeySesionProforma(true);
					terminoproformaBeanSwingJInternalFrame.terminoproformaSessionBean.setlidProformaActual(proforma.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					terminoproformaBeanSwingJInternalFrame.cargarCombosForeignKeyTerminoProforma(terminoproformaBeanSwingJInternalFrame.isCargarCombosDependencia);
					terminoproformaBeanSwingJInternalFrame.setVisibilidadBusquedasParaProforma(true);
					terminoproformaBeanSwingJInternalFrame.setid_proformaFK_IdProforma(proforma.getId());

					if(!this.conCargarFormDetalle) {
						terminoproformaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					terminoproformaBeanSwingJInternalFrame.setSelectedItemCombosFrameProformaForeignKey(proforma,1,false,true,true);
					terminoproformaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					terminoproformaBeanSwingJInternalFrame.procesarBusqueda("FK_IdProforma");
					terminoproformaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProforma");
					terminoproformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTerminoProforma(true);
					terminoproformaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTerminoProforma("n",terminoproformaBeanSwingJInternalFrame.isGuardarCambiosEnLote, terminoproformaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					terminoproformaBeanSwingJInternalFrame.setAutoscrolls(true);
					terminoproformaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						terminoproformaBeanSwingJInternalFrame.actualizarEstadoPanelsTerminoProforma("relacionado");
					} else {
						terminoproformaBeanSwingJInternalFrame.actualizarEstadoPanelsTerminoProforma("no_relacionado");
					}

					terminoproformaBeanSwingJInternalFrame.getjButtonRecargarInformacionTerminoProforma().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleProformaBeanSwingJInternalFrame(List<Proforma> proformas,Proforma proforma,DetalleProformaBeanSwingJInternalFrame detalleproformaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleproformaBeanSwingJInternalFrame=new DetalleProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleproformaBeanSwingJInternalFrame.getDetalleProformaLogic().setConnexion(this.proformaLogic.getConnexion());

					detalleproformaBeanSwingJInternalFrame.setproformasForeignKey(proformas);
					detalleproformaBeanSwingJInternalFrame.setproformaForeignKey(proforma);
					detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setisBusquedaDesdeForeignKeySesionProforma(true);
					detalleproformaBeanSwingJInternalFrame.detalleproformaSessionBean.setlidProformaActual(proforma.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleproformaBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleProforma(detalleproformaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleproformaBeanSwingJInternalFrame.setVisibilidadBusquedasParaProforma(true);
					detalleproformaBeanSwingJInternalFrame.setid_proformaFK_IdProforma(proforma.getId());

					if(!this.conCargarFormDetalle) {
						detalleproformaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleproformaBeanSwingJInternalFrame.setSelectedItemCombosFrameProformaForeignKey(proforma,1,false,true,true);
					detalleproformaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleproformaBeanSwingJInternalFrame.procesarBusqueda("FK_IdProforma");
					detalleproformaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProforma");
					detalleproformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleProforma(true);
					detalleproformaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleProforma("n",detalleproformaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleproformaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleproformaBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleproformaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleproformaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleProforma("relacionado");
					} else {
						detalleproformaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleProforma("no_relacionado");
					}

					detalleproformaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleProforma().setVisible(false);

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
