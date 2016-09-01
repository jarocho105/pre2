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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.puntoventa.util.FormaPagoPuntoVentaConstantesFunciones;

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
public class FormaPagoPuntoVentaDetalleFormJInternalFrame extends FormaPagoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	/*
	public JToolBar jTtoolBarDetalleFormaPagoPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleFormaPagoPuntoVenta;
	
	protected JMenu jmenuDetalleFormaPagoPuntoVenta;
	protected JMenu jmenuDetalleArchivoFormaPagoPuntoVenta;
	protected JMenu jmenuDetalleAccionesFormaPagoPuntoVenta;
	protected JMenu jmenuDetalleDatosFormaPagoPuntoVenta;
	
	*/
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFormaPagoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsFormaPagoPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FormaPagoPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleFormaPagoPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_facturapuntoventa="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected CuentaBancoPunVenBeanSwingJInternalFrame cuentabancopunvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentabancopunven="";

	protected TipoRiesgoChequeBeanSwingJInternalFrame tiporiesgochequeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporiesgocheque="";

	protected BancoBeanSwingJInternalFrame bancotarjetaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bancotarjeta="";

	protected TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tarjetacredito="";

	protected TipoInteresTarjetaBeanSwingJInternalFrame tipointerestarjetaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipointerestarjeta="";

	protected TipoPagoTarjetaBeanSwingJInternalFrame tipopagotarjetaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipopagotarjeta="";

	protected ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_conexion="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public FormaPagoPuntoVentaSessionBean formapagopuntoventaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public BancoSessionBean bancoSessionBean;
	public CuentaBancoPunVenSessionBean cuentabancopunvenSessionBean;
	public TipoRiesgoChequeSessionBean tiporiesgochequeSessionBean;
	public BancoSessionBean bancotarjetaSessionBean;
	public TarjetaCreditoSessionBean tarjetacreditoSessionBean;
	public TipoInteresTarjetaSessionBean tipointerestarjetaSessionBean;
	public TipoPagoTarjetaSessionBean tipopagotarjetaSessionBean;
	public ConexionSessionBean conexionSessionBean;
	public MesSessionBean mesSessionBean;
	public AnioSessionBean anioSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;	
	
	public FormaPagoPuntoVentaLogic formapagopuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosFormaPagoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionFormaPagoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralFormaPagoPuntoVenta;
	
	protected JPanel jPanelCamposFormaPagoPuntoVenta;    
	protected JPanel jPanelCamposOcultosFormaPagoPuntoVenta;    	
	protected JPanel jPanelAccionesFormaPagoPuntoVenta;
	protected JPanel jPanelAccionesFormularioFormaPagoPuntoVenta;
    
	
	
	protected Integer iXPanelCamposFormaPagoPuntoVenta=0;
	protected Integer iYPanelCamposFormaPagoPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosFormaPagoPuntoVenta=0;
	protected Integer iYPanelCamposOcultosFormaPagoPuntoVenta=0;
	
	

	protected JPanel jPanelCamposIniciogeneralFormaPagoPuntoVenta;
	protected Integer iXPanelCamposIniciogeneralFormaPagoPuntoVenta=0;
	protected Integer iYPanelCamposIniciogeneralFormaPagoPuntoVenta=0;

	protected JPanel jPanelCamposIniciocreditoFormaPagoPuntoVenta;
	protected Integer iXPanelCamposIniciocreditoFormaPagoPuntoVenta=0;
	protected Integer iYPanelCamposIniciocreditoFormaPagoPuntoVenta=0;

	protected JPanel jPanelCamposIniciochequeFormaPagoPuntoVenta;
	protected Integer iXPanelCamposIniciochequeFormaPagoPuntoVenta=0;
	protected Integer iYPanelCamposIniciochequeFormaPagoPuntoVenta=0;

	protected JPanel jPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	protected Integer iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
	protected Integer iYPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFormaPagoPuntoVenta;
	public JButton jButtonModificarFormaPagoPuntoVenta;
	public JButton jButtonActualizarFormaPagoPuntoVenta;
    public JButton jButtonEliminarFormaPagoPuntoVenta;
	public JButton jButtonCancelarFormaPagoPuntoVenta;
    public JButton jButtonGuardarCambiosFormaPagoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaFormaPagoPuntoVenta;
	protected JButton jButtonCerrarFormaPagoPuntoVenta;
	
	/*
	protected JButton jButtonProcesarInformacionFormaPagoPuntoVenta;
	*/
	
	protected JCheckBox jCheckBoxPostAccionNuevoFormaPagoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFormaPagoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFormaPagoPuntoVenta;
	
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarFormaPagoPuntoVenta;
	protected JButton jButtonModificarToolBarFormaPagoPuntoVenta;
	protected JButton jButtonActualizarToolBarFormaPagoPuntoVenta;
    protected JButton jButtonEliminarToolBarFormaPagoPuntoVenta;
	protected JButton jButtonCancelarToolBarFormaPagoPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarFormaPagoPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarFormaPagoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarFormaPagoPuntoVenta;
	protected JButton jButtonCerrarToolBarFormaPagoPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarFormaPagoPuntoVenta;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemModificarFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemActualizarFormaPagoPuntoVenta;
    protected JMenuItem jMenuItemEliminarFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemCancelarFormaPagoPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemCerrarFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarFormaPagoPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFormaPagoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarFormaPagoPuntoVenta;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesFormaPagoPuntoVenta;	
		
	/*
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFormaPagoPuntoVenta;
	*/
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta;
	
	/*	
	
	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFormaPagoPuntoVenta;
	public JLabel jLabelIdFormaPagoPuntoVenta;
	public JLabel jLabelidFormaPagoPuntoVenta;
	public JButton jButtonidFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeFormaPagoPuntoVenta;
	public JLabel jLabelporcentajeFormaPagoPuntoVenta;
	public JTextField jTextFieldporcentajeFormaPagoPuntoVenta;
	public JButton jButtonporcentajeFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelvalorFormaPagoPuntoVenta;
	public JLabel jLabelvalorFormaPagoPuntoVenta;
	public JTextField jTextFieldvalorFormaPagoPuntoVenta;
	public JButton jButtonvalorFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfechaFormaPagoPuntoVenta;
	public JLabel jLabelfechaFormaPagoPuntoVenta;
	//public JFormattedTextField jDateChooserfechaFormaPagoPuntoVenta;

	public JDateChooser jDateChooserfechaFormaPagoPuntoVenta;
	public JButton jButtonfechaFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionFormaPagoPuntoVenta;
	public JLabel jLabeldescripcionFormaPagoPuntoVenta;
	public JTextArea jTextAreadescripcionFormaPagoPuntoVenta;
	public JScrollPane jscrollPanedescripcionFormaPagoPuntoVenta;
	public JButton jButtondescripcionFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioFormaPagoPuntoVenta;
	public JLabel jLabelfecha_inicioFormaPagoPuntoVenta;
	//public JFormattedTextField jDateChooserfecha_inicioFormaPagoPuntoVenta;

	public JDateChooser jDateChooserfecha_inicioFormaPagoPuntoVenta;
	public JButton jButtonfecha_inicioFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_dias_plazoFormaPagoPuntoVenta;
	public JLabel jLabelnumero_dias_plazoFormaPagoPuntoVenta;
	public JTextField jTextFieldnumero_dias_plazoFormaPagoPuntoVenta;
	public JButton jButtonnumero_dias_plazoFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finFormaPagoPuntoVenta;
	public JLabel jLabelfecha_finFormaPagoPuntoVenta;
	//public JFormattedTextField jDateChooserfecha_finFormaPagoPuntoVenta;

	public JDateChooser jDateChooserfecha_finFormaPagoPuntoVenta;
	public JButton jButtonfecha_finFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaFormaPagoPuntoVenta;
	public JLabel jLabelnumero_cuentaFormaPagoPuntoVenta;
	public JTextField jTextFieldnumero_cuentaFormaPagoPuntoVenta;
	public JButton jButtonnumero_cuentaFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_chequeFormaPagoPuntoVenta;
	public JLabel jLabelnumero_chequeFormaPagoPuntoVenta;
	public JTextField jTextFieldnumero_chequeFormaPagoPuntoVenta;
	public JButton jButtonnumero_chequeFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelgiradorFormaPagoPuntoVenta;
	public JLabel jLabelgiradorFormaPagoPuntoVenta;
	public JTextArea jTextAreagiradorFormaPagoPuntoVenta;
	public JScrollPane jscrollPanegiradorFormaPagoPuntoVenta;
	public JButton jButtongiradorFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnumeroFormaPagoPuntoVenta;
	public JLabel jLabelnumeroFormaPagoPuntoVenta;
	public JTextField jTextFieldnumeroFormaPagoPuntoVenta;
	public JButton jButtonnumeroFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltarjeta_habienteFormaPagoPuntoVenta;
	public JLabel jLabeltarjeta_habienteFormaPagoPuntoVenta;
	public JTextArea jTextAreatarjeta_habienteFormaPagoPuntoVenta;
	public JScrollPane jscrollPanetarjeta_habienteFormaPagoPuntoVenta;
	public JButton jButtontarjeta_habienteFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelautorizacionFormaPagoPuntoVenta;
	public JLabel jLabelautorizacionFormaPagoPuntoVenta;
	public JTextArea jTextAreaautorizacionFormaPagoPuntoVenta;
	public JScrollPane jscrollPaneautorizacionFormaPagoPuntoVenta;
	public JButton jButtonautorizacionFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelvoucherFormaPagoPuntoVenta;
	public JLabel jLabelvoucherFormaPagoPuntoVenta;
	public JTextField jTextFieldvoucherFormaPagoPuntoVenta;
	public JButton jButtonvoucherFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelloteFormaPagoPuntoVenta;
	public JLabel jLabelloteFormaPagoPuntoVenta;
	public JTextField jTextFieldloteFormaPagoPuntoVenta;
	public JButton jButtonloteFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelcuotaFormaPagoPuntoVenta;
	public JLabel jLabelcuotaFormaPagoPuntoVenta;
	public JTextField jTextFieldcuotaFormaPagoPuntoVenta;
	public JButton jButtoncuotaFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_retencionFormaPagoPuntoVenta;
	public JLabel jLabelvalor_retencionFormaPagoPuntoVenta;
	public JTextField jTextFieldvalor_retencionFormaPagoPuntoVenta;
	public JButton jButtonvalor_retencionFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_comisionFormaPagoPuntoVenta;
	public JLabel jLabelvalor_comisionFormaPagoPuntoVenta;
	public JTextField jTextFieldvalor_comisionFormaPagoPuntoVenta;
	public JButton jButtonvalor_comisionFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_calculadoFormaPagoPuntoVenta;
	public JLabel jLabelvalor_calculadoFormaPagoPuntoVenta;
	public JTextField jTextFieldvalor_calculadoFormaPagoPuntoVenta;
	public JButton jButtonvalor_calculadoFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_canceladoFormaPagoPuntoVenta;
	public JLabel jLabelvalor_canceladoFormaPagoPuntoVenta;
	public JTextField jTextFieldvalor_canceladoFormaPagoPuntoVenta;
	public JButton jButtonvalor_canceladoFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_difiereFormaPagoPuntoVenta;
	public JLabel jLabelvalor_difiereFormaPagoPuntoVenta;
	public JTextField jTextFieldvalor_difiereFormaPagoPuntoVenta;
	public JButton jButtonvalor_difiereFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencionFormaPagoPuntoVenta;
	public JLabel jLabelnumero_retencionFormaPagoPuntoVenta;
	public JTextField jTextFieldnumero_retencionFormaPagoPuntoVenta;
	public JButton jButtonnumero_retencionFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_liquidacionFormaPagoPuntoVenta;
	public JLabel jLabelnumero_liquidacionFormaPagoPuntoVenta;
	public JTextField jTextFieldnumero_liquidacionFormaPagoPuntoVenta;
	public JButton jButtonnumero_liquidacionFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFormaPagoPuntoVenta;
	public JLabel jLabelid_empresaFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFormaPagoPuntoVenta;
	public JButton jButtonid_empresaFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_empresaFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFormaPagoPuntoVenta;
	public JLabel jLabelid_sucursalFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFormaPagoPuntoVenta;
	public JButton jButtonid_sucursalFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_sucursalFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioFormaPagoPuntoVenta;
	public JLabel jLabelid_ejercicioFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioFormaPagoPuntoVenta;
	public JButton jButtonid_ejercicioFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_ejercicioFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoFormaPagoPuntoVenta;
	public JLabel jLabelid_periodoFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoFormaPagoPuntoVenta;
	public JButton jButtonid_periodoFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_periodoFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_periodoFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_factura_punto_ventaFormaPagoPuntoVenta;
	public JLabel jLabelid_factura_punto_ventaFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta;
	public JButton jButtonid_factura_punto_ventaFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_factura_punto_ventaFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_forma_pagoFormaPagoPuntoVenta;
	public JLabel jLabelid_tipo_forma_pagoFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta;
	public JButton jButtonid_tipo_forma_pagoFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoFormaPagoPuntoVenta;
	public JLabel jLabelid_bancoFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoFormaPagoPuntoVenta;
	public JButton jButtonid_bancoFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_bancoFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_bancoFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_banco_pun_venFormaPagoPuntoVenta;
	public JLabel jLabelid_cuenta_banco_pun_venFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta;
	public JButton jButtonid_cuenta_banco_pun_venFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_riesgo_chequeFormaPagoPuntoVenta;
	public JLabel jLabelid_tipo_riesgo_chequeFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta;
	public JButton jButtonid_tipo_riesgo_chequeFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_banco_tarjetaFormaPagoPuntoVenta;
	public JLabel jLabelid_banco_tarjetaFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_banco_tarjetaFormaPagoPuntoVenta;
	public JButton jButtonid_banco_tarjetaFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_banco_tarjetaFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_banco_tarjetaFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_tarjeta_creditoFormaPagoPuntoVenta;
	public JLabel jLabelid_tarjeta_creditoFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta;
	public JButton jButtonid_tarjeta_creditoFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tarjeta_creditoFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_interes_tarjetaFormaPagoPuntoVenta;
	public JLabel jLabelid_tipo_interes_tarjetaFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta;
	public JButton jButtonid_tipo_interes_tarjetaFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_pago_tarjetaFormaPagoPuntoVenta;
	public JLabel jLabelid_tipo_pago_tarjetaFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta;
	public JButton jButtonid_tipo_pago_tarjetaFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_conexionFormaPagoPuntoVenta;
	public JLabel jLabelid_conexionFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_conexionFormaPagoPuntoVenta;
	public JButton jButtonid_conexionFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_conexionFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_conexionFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesFormaPagoPuntoVenta;
	public JLabel jLabelid_mesFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFormaPagoPuntoVenta;
	public JButton jButtonid_mesFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_mesFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_mesFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_anioFormaPagoPuntoVenta;
	public JLabel jLabelid_anioFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFormaPagoPuntoVenta;
	public JButton jButtonid_anioFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_anioFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_anioFormaPagoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableFormaPagoPuntoVenta;
	public JLabel jLabelid_cuenta_contableFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableFormaPagoPuntoVenta;
	public JButton jButtonid_cuenta_contableFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_cuenta_contableFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableFormaPagoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableFormaPagoPuntoVentaArbol= new JButtonMe();

	public JPanel jPanelid_asiento_contableFormaPagoPuntoVenta;
	public JLabel jLabelid_asiento_contableFormaPagoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFormaPagoPuntoVenta;
	public JButton jButtonid_asiento_contableFormaPagoPuntoVenta= new JButtonMe();
	public JButton jButtonid_asiento_contableFormaPagoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFormaPagoPuntoVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFormaPagoPuntoVenta;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=2618;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FormaPagoPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFormaPagoPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioFormaPagoPuntoVenta=new JPanel();
				this.jmenuBarDetalleFormaPagoPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleFormaPagoPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FormaPagoPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FormaPagoPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FormaPagoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	public JButton getjButtonActualizarToolBarFormaPagoPuntoVenta() {
		return this.jButtonActualizarToolBarFormaPagoPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarFormaPagoPuntoVenta() {
		return this.jButtonEliminarToolBarFormaPagoPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarFormaPagoPuntoVenta() {
		return this.jButtonCancelarToolBarFormaPagoPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionFormaPagoPuntoVenta() {
		return this.jButtonProcesarInformacionFormaPagoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFormaPagoPuntoVenta)	{
		this.jButtonProcesarInformacionFormaPagoPuntoVenta = jButtonProcesarInformacionFormaPagoPuntoVenta;
	}
	*/
	
	

	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormaPagoPuntoVenta() {
		return this.jComboBoxTiposAccionesFormaPagoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesFormaPagoPuntoVenta) {
		this.jComboBoxTiposRelacionesFormaPagoPuntoVenta = jComboBoxTiposRelacionesFormaPagoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormaPagoPuntoVenta) {
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta = jComboBoxTiposAccionesFormaPagoPuntoVenta;
	}		
	
	*/		
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFormaPagoPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFormaPagoPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta = jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		
		this.formapagopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.formapagopuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FormaPagoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 3650) {
			iWidth=3650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFormaPagoPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFormaPagoPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarFormaPagoPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFormaPagoPuntoVenta,this.jTtoolBarDetalleFormaPagoPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFormaPagoPuntoVenta,this.jTtoolBarDetalleFormaPagoPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFormaPagoPuntoVenta,this.jTtoolBarDetalleFormaPagoPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFormaPagoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFormaPagoPuntoVenta,this.jTtoolBarDetalleFormaPagoPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	*/
	
	/*
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFormaPagoPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFormaPagoPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFormaPagoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFormaPagoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFormaPagoPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFormaPagoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFormaPagoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFormaPagoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFormaPagoPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFormaPagoPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFormaPagoPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFormaPagoPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFormaPagoPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFormaPagoPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFormaPagoPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFormaPagoPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFormaPagoPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFormaPagoPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFormaPagoPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFormaPagoPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFormaPagoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFormaPagoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFormaPagoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFormaPagoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFormaPagoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFormaPagoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFormaPagoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFormaPagoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFormaPagoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFormaPagoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFormaPagoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFormaPagoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFormaPagoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFormaPagoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFormaPagoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFormaPagoPuntoVenta.add(this.jMenuItemDetalleCerrarFormaPagoPuntoVenta);
		
		this.jmenuDetalleAccionesFormaPagoPuntoVenta.add(this.jMenuItemActualizarFormaPagoPuntoVenta);
		this.jmenuDetalleAccionesFormaPagoPuntoVenta.add(this.jMenuItemEliminarFormaPagoPuntoVenta);
		this.jmenuDetalleAccionesFormaPagoPuntoVenta.add(this.jMenuItemCancelarFormaPagoPuntoVenta);		
		
		//this.jmenuDetalleDatosFormaPagoPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByFormaPagoPuntoVenta);				
		this.jmenuDetalleDatosFormaPagoPuntoVenta.add(this.jMenuItemDetalleMostarOcultarFormaPagoPuntoVenta);				
				
		//this.jmenuDetalleAccionesFormaPagoPuntoVenta.add(this.jMenuItemGuardarCambiosFormaPagoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFormaPagoPuntoVenta.add(this.jmenuDetalleArchivoFormaPagoPuntoVenta);		
		this.jmenuBarDetalleFormaPagoPuntoVenta.add(this.jmenuDetalleAccionesFormaPagoPuntoVenta);		
		this.jmenuBarDetalleFormaPagoPuntoVenta.add(this.jmenuDetalleDatosFormaPagoPuntoVenta);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFormaPagoPuntoVenta);				
	}
	*/
	
	public void inicializarElementosCamposFormaPagoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFormaPagoPuntoVenta = new JLabelMe();
		jLabelIdFormaPagoPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFormaPagoPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFormaPagoPuntoVenta= new GridBagLayout();

		this.jPanelidFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);

		jLabelidFormaPagoPuntoVenta = new JLabel();
		jLabelidFormaPagoPuntoVenta.setText("Id");

		jLabelidFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelporcentajeFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeFormaPagoPuntoVenta.setToolTipText("Porcentaje");
		this.jLabelporcentajeFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelporcentajeFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldporcentajeFormaPagoPuntoVenta= new JTextFieldMe();
		jTextFieldporcentajeFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldporcentajeFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeFormaPagoPuntoVenta.setText("0.0");

		this.jButtonporcentajeFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonporcentajeFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonporcentajeFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelvalorFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelvalorFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorFormaPagoPuntoVenta.setToolTipText("Valor");
		this.jLabelvalorFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelvalorFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldvalorFormaPagoPuntoVenta= new JTextFieldMe();
		jTextFieldvalorFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldvalorFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorFormaPagoPuntoVenta.setText("0.0");

		this.jButtonvalorFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonvalorFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonvalorFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelfechaFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelfechaFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaFormaPagoPuntoVenta.setToolTipText("Fecha");
		this.jLabelfechaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelfechaFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		//jFormattedTextFieldfechaFormaPagoPuntoVenta= new JFormattedTextFieldMe();

		jDateChooserfechaFormaPagoPuntoVenta= new JDateChooser();
		jDateChooserfechaFormaPagoPuntoVenta.setEnabled(false);
		jDateChooserfechaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaFormaPagoPuntoVenta.setDate(new Date());
		jDateChooserfechaFormaPagoPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaFormaPagoPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfechaFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonfechaFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionFormaPagoPuntoVenta = new JLabelMe();
		this.jLabeldescripcionFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionFormaPagoPuntoVenta.setToolTipText("Descripcion");
		this.jLabeldescripcionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPaneldescripcionFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextAreadescripcionFormaPagoPuntoVenta= new JTextAreaMe();
		jTextAreadescripcionFormaPagoPuntoVenta.setEnabled(false);
		jTextAreadescripcionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFormaPagoPuntoVenta.setLineWrap(true);
		jTextAreadescripcionFormaPagoPuntoVenta.setWrapStyleWord(true);
		jTextAreadescripcionFormaPagoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionFormaPagoPuntoVenta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionFormaPagoPuntoVenta = new JScrollPane(jTextAreadescripcionFormaPagoPuntoVenta);
		jscrollPanedescripcionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescripcionFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtondescripcionFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelfecha_inicioFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioFormaPagoPuntoVenta.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelfecha_inicioFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		//jFormattedTextFieldfecha_inicioFormaPagoPuntoVenta= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioFormaPagoPuntoVenta= new JDateChooser();
		jDateChooserfecha_inicioFormaPagoPuntoVenta.setEnabled(false);
		jDateChooserfecha_inicioFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioFormaPagoPuntoVenta.setDate(new Date());
		jDateChooserfecha_inicioFormaPagoPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioFormaPagoPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfecha_inicioFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonfecha_inicioFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_dias_plazoFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelnumero_dias_plazoFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMERODIASPLAZO+" : *");
		this.jLabelnumero_dias_plazoFormaPagoPuntoVenta.setToolTipText("Numero Dias Plazo");
		this.jLabelnumero_dias_plazoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_dias_plazoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_dias_plazoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_dias_plazoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_dias_plazoFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_dias_plazoFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMERODIASPLAZO);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelnumero_dias_plazoFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldnumero_dias_plazoFormaPagoPuntoVenta= new JTextFieldMe();
		jTextFieldnumero_dias_plazoFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldnumero_dias_plazoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_dias_plazoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_dias_plazoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_dias_plazoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_dias_plazoFormaPagoPuntoVenta.setText("0");

		this.jButtonnumero_dias_plazoFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnumero_dias_plazoFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_dias_plazoFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_dias_plazoFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_dias_plazoFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonnumero_dias_plazoFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_dias_plazoFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_dias_plazoFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_dias_plazoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_dias_plazoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_dias_plazoFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_dias_plazoFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelfecha_finFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finFormaPagoPuntoVenta.setToolTipText("Fecha Fin");
		this.jLabelfecha_finFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelfecha_finFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		//jFormattedTextFieldfecha_finFormaPagoPuntoVenta= new JFormattedTextFieldMe();

		jDateChooserfecha_finFormaPagoPuntoVenta= new JDateChooser();
		jDateChooserfecha_finFormaPagoPuntoVenta.setEnabled(false);
		jDateChooserfecha_finFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finFormaPagoPuntoVenta.setDate(new Date());
		jDateChooserfecha_finFormaPagoPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finFormaPagoPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfecha_finFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonfecha_finFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelnumero_cuentaFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMEROCUENTA+" :");
		this.jLabelnumero_cuentaFormaPagoPuntoVenta.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelnumero_cuentaFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldnumero_cuentaFormaPagoPuntoVenta= new JTextFieldMe();

		jTextFieldnumero_cuentaFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldnumero_cuentaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonnumero_cuentaFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_chequeFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelnumero_chequeFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE+" :");
		this.jLabelnumero_chequeFormaPagoPuntoVenta.setToolTipText("Numero Cheque");
		this.jLabelnumero_chequeFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_chequeFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_chequeFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_chequeFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_chequeFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMEROCHEQUE);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelnumero_chequeFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldnumero_chequeFormaPagoPuntoVenta= new JTextFieldMe();

		jTextFieldnumero_chequeFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldnumero_chequeFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_chequeFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_chequeFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_chequeFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnumero_chequeFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_chequeFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_chequeFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonnumero_chequeFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_chequeFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_chequeFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_chequeFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_chequeFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_chequeFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_chequeFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelgiradorFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelgiradorFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_GIRADOR+" :");
		this.jLabelgiradorFormaPagoPuntoVenta.setToolTipText("Girador");
		this.jLabelgiradorFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgiradorFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgiradorFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgiradorFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgiradorFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgiradorFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_GIRADOR);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelgiradorFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextAreagiradorFormaPagoPuntoVenta= new JTextAreaMe();
		jTextAreagiradorFormaPagoPuntoVenta.setEnabled(false);
		jTextAreagiradorFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagiradorFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagiradorFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreagiradorFormaPagoPuntoVenta.setLineWrap(true);
		jTextAreagiradorFormaPagoPuntoVenta.setWrapStyleWord(true);
		jTextAreagiradorFormaPagoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreagiradorFormaPagoPuntoVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreagiradorFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanegiradorFormaPagoPuntoVenta = new JScrollPane(jTextAreagiradorFormaPagoPuntoVenta);
		jscrollPanegiradorFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanegiradorFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanegiradorFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtongiradorFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtongiradorFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongiradorFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongiradorFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongiradorFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtongiradorFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongiradorFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongiradorFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreagiradorFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreagiradorFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"giradorFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongiradorFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelnumeroFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelnumeroFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMERO+" :");
		this.jLabelnumeroFormaPagoPuntoVenta.setToolTipText("Numero");
		this.jLabelnumeroFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelnumeroFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldnumeroFormaPagoPuntoVenta= new JTextFieldMe();

		jTextFieldnumeroFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldnumeroFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnumeroFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonnumeroFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltarjeta_habienteFormaPagoPuntoVenta = new JLabelMe();
		this.jLabeltarjeta_habienteFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_TARJETAHABIENTE+" :");
		this.jLabeltarjeta_habienteFormaPagoPuntoVenta.setToolTipText("Tarjeta Habiente");
		this.jLabeltarjeta_habienteFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltarjeta_habienteFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltarjeta_habienteFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltarjeta_habienteFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltarjeta_habienteFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltarjeta_habienteFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_TARJETAHABIENTE);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPaneltarjeta_habienteFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextAreatarjeta_habienteFormaPagoPuntoVenta= new JTextAreaMe();
		jTextAreatarjeta_habienteFormaPagoPuntoVenta.setEnabled(false);
		jTextAreatarjeta_habienteFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatarjeta_habienteFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatarjeta_habienteFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatarjeta_habienteFormaPagoPuntoVenta.setLineWrap(true);
		jTextAreatarjeta_habienteFormaPagoPuntoVenta.setWrapStyleWord(true);
		jTextAreatarjeta_habienteFormaPagoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatarjeta_habienteFormaPagoPuntoVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatarjeta_habienteFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetarjeta_habienteFormaPagoPuntoVenta = new JScrollPane(jTextAreatarjeta_habienteFormaPagoPuntoVenta);
		jscrollPanetarjeta_habienteFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetarjeta_habienteFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetarjeta_habienteFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontarjeta_habienteFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtontarjeta_habienteFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontarjeta_habienteFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontarjeta_habienteFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontarjeta_habienteFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtontarjeta_habienteFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontarjeta_habienteFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontarjeta_habienteFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatarjeta_habienteFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatarjeta_habienteFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tarjeta_habienteFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontarjeta_habienteFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelautorizacionFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelautorizacionFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_AUTORIZACION+" :");
		this.jLabelautorizacionFormaPagoPuntoVenta.setToolTipText("Autorizacion");
		this.jLabelautorizacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelautorizacionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautorizacionFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelautorizacionFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_AUTORIZACION);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelautorizacionFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextAreaautorizacionFormaPagoPuntoVenta= new JTextAreaMe();
		jTextAreaautorizacionFormaPagoPuntoVenta.setEnabled(false);
		jTextAreaautorizacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaautorizacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaautorizacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaautorizacionFormaPagoPuntoVenta.setLineWrap(true);
		jTextAreaautorizacionFormaPagoPuntoVenta.setWrapStyleWord(true);
		jTextAreaautorizacionFormaPagoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaautorizacionFormaPagoPuntoVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaautorizacionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneautorizacionFormaPagoPuntoVenta = new JScrollPane(jTextAreaautorizacionFormaPagoPuntoVenta);
		jscrollPaneautorizacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneautorizacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneautorizacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonautorizacionFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonautorizacionFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacionFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacionFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautorizacionFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonautorizacionFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautorizacionFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautorizacionFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaautorizacionFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaautorizacionFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autorizacionFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonautorizacionFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelvoucherFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelvoucherFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_VOUCHER+" :");
		this.jLabelvoucherFormaPagoPuntoVenta.setToolTipText("Voucher");
		this.jLabelvoucherFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvoucherFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvoucherFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvoucherFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvoucherFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvoucherFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_VOUCHER);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelvoucherFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldvoucherFormaPagoPuntoVenta= new JTextFieldMe();

		jTextFieldvoucherFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldvoucherFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvoucherFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvoucherFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvoucherFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonvoucherFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonvoucherFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvoucherFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvoucherFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvoucherFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonvoucherFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvoucherFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvoucherFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvoucherFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvoucherFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"voucherFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvoucherFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelloteFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelloteFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_LOTE+" :");
		this.jLabelloteFormaPagoPuntoVenta.setToolTipText("Lote");
		this.jLabelloteFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelloteFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelloteFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelloteFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelloteFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldloteFormaPagoPuntoVenta= new JTextFieldMe();

		jTextFieldloteFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldloteFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldloteFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonloteFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonloteFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonloteFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonloteFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonloteFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonloteFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldloteFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldloteFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"loteFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonloteFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelcuotaFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelcuotaFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_CUOTA+" :");
		this.jLabelcuotaFormaPagoPuntoVenta.setToolTipText("Cuota");
		this.jLabelcuotaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcuotaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcuotaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcuotaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcuotaFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcuotaFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_CUOTA);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelcuotaFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldcuotaFormaPagoPuntoVenta= new JTextFieldMe();
		jTextFieldcuotaFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldcuotaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuotaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcuotaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcuotaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcuotaFormaPagoPuntoVenta.setText("0");

		this.jButtoncuotaFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtoncuotaFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuotaFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncuotaFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncuotaFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtoncuotaFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncuotaFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncuotaFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcuotaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcuotaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cuotaFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncuotaFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_retencionFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelvalor_retencionFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORRETENCION+" :");
		this.jLabelvalor_retencionFormaPagoPuntoVenta.setToolTipText("Valor Retencion");
		this.jLabelvalor_retencionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_retencionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_retencionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_retencionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_retencionFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_retencionFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORRETENCION);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelvalor_retencionFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldvalor_retencionFormaPagoPuntoVenta= new JTextFieldMe();
		jTextFieldvalor_retencionFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldvalor_retencionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_retencionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_retencionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_retencionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_retencionFormaPagoPuntoVenta.setText("0.0");

		this.jButtonvalor_retencionFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonvalor_retencionFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_retencionFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_retencionFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_retencionFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonvalor_retencionFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_retencionFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_retencionFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_retencionFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_retencionFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_retencionFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_retencionFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_comisionFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelvalor_comisionFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORCOMISION+" :");
		this.jLabelvalor_comisionFormaPagoPuntoVenta.setToolTipText("Valor Comision");
		this.jLabelvalor_comisionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_comisionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_comisionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_comisionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_comisionFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_comisionFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORCOMISION);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelvalor_comisionFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldvalor_comisionFormaPagoPuntoVenta= new JTextFieldMe();
		jTextFieldvalor_comisionFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldvalor_comisionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_comisionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_comisionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_comisionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_comisionFormaPagoPuntoVenta.setText("0.0");

		this.jButtonvalor_comisionFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonvalor_comisionFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_comisionFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_comisionFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_comisionFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonvalor_comisionFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_comisionFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_comisionFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_comisionFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_comisionFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_comisionFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_comisionFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_calculadoFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelvalor_calculadoFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORCALCULADO+" :");
		this.jLabelvalor_calculadoFormaPagoPuntoVenta.setToolTipText("Valor Calculado");
		this.jLabelvalor_calculadoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_calculadoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_calculadoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_calculadoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_calculadoFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_calculadoFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORCALCULADO);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelvalor_calculadoFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldvalor_calculadoFormaPagoPuntoVenta= new JTextFieldMe();
		jTextFieldvalor_calculadoFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldvalor_calculadoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_calculadoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_calculadoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_calculadoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_calculadoFormaPagoPuntoVenta.setText("0.0");

		this.jButtonvalor_calculadoFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonvalor_calculadoFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_calculadoFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_calculadoFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_calculadoFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonvalor_calculadoFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_calculadoFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_calculadoFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_calculadoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_calculadoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_calculadoFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_calculadoFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_canceladoFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelvalor_canceladoFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORCANCELADO+" :");
		this.jLabelvalor_canceladoFormaPagoPuntoVenta.setToolTipText("Valor Cancelado");
		this.jLabelvalor_canceladoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_canceladoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_canceladoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_canceladoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_canceladoFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_canceladoFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORCANCELADO);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelvalor_canceladoFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldvalor_canceladoFormaPagoPuntoVenta= new JTextFieldMe();
		jTextFieldvalor_canceladoFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldvalor_canceladoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_canceladoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_canceladoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_canceladoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_canceladoFormaPagoPuntoVenta.setText("0.0");

		this.jButtonvalor_canceladoFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonvalor_canceladoFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_canceladoFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_canceladoFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_canceladoFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonvalor_canceladoFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_canceladoFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_canceladoFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_canceladoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_canceladoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_canceladoFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_canceladoFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_difiereFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelvalor_difiereFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORDIFIERE+" :");
		this.jLabelvalor_difiereFormaPagoPuntoVenta.setToolTipText("Valor Difiere");
		this.jLabelvalor_difiereFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_difiereFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_difiereFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_difiereFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_difiereFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_difiereFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_VALORDIFIERE);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelvalor_difiereFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldvalor_difiereFormaPagoPuntoVenta= new JTextFieldMe();
		jTextFieldvalor_difiereFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldvalor_difiereFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_difiereFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_difiereFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_difiereFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_difiereFormaPagoPuntoVenta.setText("0.0");

		this.jButtonvalor_difiereFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonvalor_difiereFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_difiereFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_difiereFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_difiereFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonvalor_difiereFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_difiereFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_difiereFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_difiereFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_difiereFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_difiereFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_difiereFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencionFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelnumero_retencionFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMERORETENCION+" :");
		this.jLabelnumero_retencionFormaPagoPuntoVenta.setToolTipText("Numero Retencion");
		this.jLabelnumero_retencionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_retencionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_retencionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencionFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencionFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMERORETENCION);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelnumero_retencionFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldnumero_retencionFormaPagoPuntoVenta= new JTextFieldMe();

		jTextFieldnumero_retencionFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldnumero_retencionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_retencionFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnumero_retencionFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencionFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonnumero_retencionFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencionFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencionFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencionFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencionFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencionFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencionFormaPagoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_liquidacionFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelnumero_liquidacionFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMEROLIQUIDACION+" :");
		this.jLabelnumero_liquidacionFormaPagoPuntoVenta.setToolTipText("Numero Liquidacion");
		this.jLabelnumero_liquidacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_liquidacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_liquidacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_liquidacionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_liquidacionFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_liquidacionFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_NUMEROLIQUIDACION);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelnumero_liquidacionFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jTextFieldnumero_liquidacionFormaPagoPuntoVenta= new JTextFieldMe();

		jTextFieldnumero_liquidacionFormaPagoPuntoVenta.setEnabled(false);
		jTextFieldnumero_liquidacionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_liquidacionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_liquidacionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_liquidacionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_liquidacionFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnumero_liquidacionFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_liquidacionFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_liquidacionFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_liquidacionFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonnumero_liquidacionFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_liquidacionFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_liquidacionFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_liquidacionFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_liquidacionFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_liquidacionFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_liquidacionFormaPagoPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFormaPagoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_empresaFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFormaPagoPuntoVenta.setToolTipText("Empresa");
		this.jLabelid_empresaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_empresaFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_empresaFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_empresaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFormaPagoPuntoVenta.setEnabled(false);

		this.jButtonid_empresaFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_empresaFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_empresaFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormaPagoPuntoVenta"));

		this.jButtonid_empresaFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_empresaFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_empresaFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_empresaFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_sucursalFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_sucursalFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFormaPagoPuntoVenta.setToolTipText("Sucursal");
		this.jLabelid_sucursalFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_sucursalFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_sucursalFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_sucursalFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFormaPagoPuntoVenta.setEnabled(false);

		this.jButtonid_sucursalFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_sucursalFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_sucursalFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormaPagoPuntoVenta"));

		this.jButtonid_sucursalFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_sucursalFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_sucursalFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_sucursalFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_sucursalFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_ejercicioFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_ejercicioFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioFormaPagoPuntoVenta.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_ejercicioFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_ejercicioFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_ejercicioFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioFormaPagoPuntoVenta.setEnabled(false);

		this.jButtonid_ejercicioFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_ejercicioFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_ejercicioFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormaPagoPuntoVenta"));

		this.jButtonid_ejercicioFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_ejercicioFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_ejercicioFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_ejercicioFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_periodoFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_periodoFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoFormaPagoPuntoVenta.setToolTipText("Periodo");
		this.jLabelid_periodoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_periodoFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_periodoFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_periodoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoFormaPagoPuntoVenta.setEnabled(false);

		this.jButtonid_periodoFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_periodoFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_periodoFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormaPagoPuntoVenta"));

		this.jButtonid_periodoFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_periodoFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_periodoFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_periodoFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_periodoFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_periodoFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_factura_punto_ventaFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_factura_punto_ventaFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA+" : *");
		this.jLabelid_factura_punto_ventaFormaPagoPuntoVenta.setToolTipText("Factura Punto Venta");
		this.jLabelid_factura_punto_ventaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_factura_punto_ventaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_factura_punto_ventaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_factura_punto_ventaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_factura_punto_ventaFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_factura_punto_ventaFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDFACTURAPUNTOVENTA);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_factura_punto_ventaFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_factura_punto_ventaFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_punto_ventaFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_punto_ventaFormaPagoPuntoVenta"));

		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_punto_ventaFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_factura_punto_ventaFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_factura_punto_ventaFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_tipo_forma_pagoFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_tipo_forma_pagoFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTIPOFORMAPAGO+" : *");
		this.jLabelid_tipo_forma_pagoFormaPagoPuntoVenta.setToolTipText("Tipo Forma Pago");
		this.jLabelid_tipo_forma_pagoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_forma_pagoFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_forma_pagoFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_tipo_forma_pagoFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoFormaPagoPuntoVenta"));

		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_bancoFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_bancoFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDBANCO+" :");
		this.jLabelid_bancoFormaPagoPuntoVenta.setToolTipText("Banco");
		this.jLabelid_bancoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_bancoFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_bancoFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_bancoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_bancoFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_bancoFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoFormaPagoPuntoVenta"));

		this.jButtonid_bancoFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_bancoFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_bancoFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_bancoFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_bancoFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_bancoFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_cuenta_banco_pun_venFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_cuenta_banco_pun_venFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDCUENTABANCOPUNVEN+" :");
		this.jLabelid_cuenta_banco_pun_venFormaPagoPuntoVenta.setToolTipText("Cuenta Banco Pun Ven");
		this.jLabelid_cuenta_banco_pun_venFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_banco_pun_venFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_banco_pun_venFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_banco_pun_venFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_banco_pun_venFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_banco_pun_venFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDCUENTABANCOPUNVEN);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_cuenta_banco_pun_venFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_banco_pun_venFormaPagoPuntoVenta"));

		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_banco_pun_venFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_banco_pun_venFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_tipo_riesgo_chequeFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_tipo_riesgo_chequeFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTIPORIESGOCHEQUE+" :");
		this.jLabelid_tipo_riesgo_chequeFormaPagoPuntoVenta.setToolTipText("Tipo Riesgo Cheque");
		this.jLabelid_tipo_riesgo_chequeFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_riesgo_chequeFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_riesgo_chequeFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_riesgo_chequeFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_riesgo_chequeFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_riesgo_chequeFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTIPORIESGOCHEQUE);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_tipo_riesgo_chequeFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_riesgo_chequeFormaPagoPuntoVenta"));

		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_riesgo_chequeFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_riesgo_chequeFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_banco_tarjetaFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_banco_tarjetaFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDBANCOTARJETA+" :");
		this.jLabelid_banco_tarjetaFormaPagoPuntoVenta.setToolTipText("Banco");
		this.jLabelid_banco_tarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_banco_tarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_banco_tarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_banco_tarjetaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_banco_tarjetaFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_banco_tarjetaFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDBANCOTARJETA);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_banco_tarjetaFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_banco_tarjetaFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_banco_tarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_banco_tarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_banco_tarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_banco_tarjetaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_banco_tarjetaFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_banco_tarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_banco_tarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_banco_tarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_banco_tarjetaFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_banco_tarjetaFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_banco_tarjetaFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_banco_tarjetaFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_banco_tarjetaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_banco_tarjetaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_banco_tarjetaFormaPagoPuntoVenta"));

		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_banco_tarjetaFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_banco_tarjetaFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_banco_tarjetaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_banco_tarjetaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_banco_tarjetaFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_banco_tarjetaFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_banco_tarjetaFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_banco_tarjetaFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_banco_tarjetaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_banco_tarjetaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_banco_tarjetaFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_tarjeta_creditoFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_tarjeta_creditoFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTARJETACREDITO+" :");
		this.jLabelid_tarjeta_creditoFormaPagoPuntoVenta.setToolTipText("Tarjeta Credito");
		this.jLabelid_tarjeta_creditoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tarjeta_creditoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tarjeta_creditoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tarjeta_creditoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tarjeta_creditoFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tarjeta_creditoFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTARJETACREDITO);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_tarjeta_creditoFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tarjeta_creditoFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tarjeta_creditoFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tarjeta_creditoFormaPagoPuntoVenta"));

		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tarjeta_creditoFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tarjeta_creditoFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tarjeta_creditoFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_tipo_interes_tarjetaFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_tipo_interes_tarjetaFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTIPOINTERESTARJETA+" :");
		this.jLabelid_tipo_interes_tarjetaFormaPagoPuntoVenta.setToolTipText("Tipo Interes Tarjeta");
		this.jLabelid_tipo_interes_tarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_interes_tarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_interes_tarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_interes_tarjetaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_interes_tarjetaFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_interes_tarjetaFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTIPOINTERESTARJETA);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_tipo_interes_tarjetaFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_interes_tarjetaFormaPagoPuntoVenta"));

		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_interes_tarjetaFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_interes_tarjetaFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_tipo_pago_tarjetaFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_tipo_pago_tarjetaFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTIPOPAGOTARJETA+" :");
		this.jLabelid_tipo_pago_tarjetaFormaPagoPuntoVenta.setToolTipText("Tipo Pago Tarjeta");
		this.jLabelid_tipo_pago_tarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_pago_tarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_pago_tarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_pago_tarjetaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_pago_tarjetaFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_pago_tarjetaFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDTIPOPAGOTARJETA);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_tipo_pago_tarjetaFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_pago_tarjetaFormaPagoPuntoVenta"));

		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_pago_tarjetaFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_pago_tarjetaFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_conexionFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_conexionFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDCONEXION+" :");
		this.jLabelid_conexionFormaPagoPuntoVenta.setToolTipText("Conexion");
		this.jLabelid_conexionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_conexionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_conexionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_conexionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_conexionFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_conexionFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDCONEXION);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_conexionFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_conexionFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_conexionFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_conexionFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_conexionFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_conexionFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_conexionFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_conexionFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_conexionFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_conexionFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_conexionFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_conexionFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_conexionFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_conexionFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_conexionFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_conexionFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_conexionFormaPagoPuntoVenta"));

		this.jButtonid_conexionFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_conexionFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_conexionFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_conexionFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_conexionFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_conexionFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_conexionFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_conexionFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_conexionFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_conexionFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_conexionFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_conexionFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_conexionFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_conexionFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_conexionFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_conexionFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_conexionFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_conexionFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_conexionFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_conexionFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_conexionFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_conexionFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_conexionFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_mesFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_mesFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesFormaPagoPuntoVenta.setToolTipText("Mes");
		this.jLabelid_mesFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_mesFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_mesFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_mesFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_mesFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_mesFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFormaPagoPuntoVenta"));

		this.jButtonid_mesFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_mesFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_mesFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_mesFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_mesFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_mesFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_anioFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_anioFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioFormaPagoPuntoVenta.setToolTipText("Anio");
		this.jLabelid_anioFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_anioFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_anioFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_anioFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioFormaPagoPuntoVenta.setEnabled(false);

		this.jButtonid_anioFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_anioFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_anioFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFormaPagoPuntoVenta"));

		this.jButtonid_anioFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_anioFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_anioFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_anioFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_anioFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_anioFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFormaPagoPuntoVentaUpdate"));



					
		this.jLabelid_cuenta_contableFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_cuenta_contableFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDCUENTACONTABLE+" :");
		this.jLabelid_cuenta_contableFormaPagoPuntoVenta.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_cuenta_contableFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_cuenta_contableFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_cuenta_contableFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cuenta_contableFormaPagoPuntoVenta.setEnabled(false);

		this.jButtonid_cuenta_contableFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_cuenta_contableFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_cuenta_contableFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormaPagoPuntoVenta"));

		this.jButtonid_cuenta_contableFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_cuenta_contableFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_cuenta_contableFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormaPagoPuntoVentaUpdate"));


		jButtonid_cuenta_contableFormaPagoPuntoVentaArbol= new JButtonMe();
		jButtonid_cuenta_contableFormaPagoPuntoVentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableFormaPagoPuntoVentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableFormaPagoPuntoVentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableFormaPagoPuntoVentaArbol.setText("Arbol");
		jButtonid_cuenta_contableFormaPagoPuntoVentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableFormaPagoPuntoVentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableFormaPagoPuntoVentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableFormaPagoPuntoVentaArbol"));



					
		this.jLabelid_asiento_contableFormaPagoPuntoVenta = new JLabelMe();
		this.jLabelid_asiento_contableFormaPagoPuntoVenta.setText(""+FormaPagoPuntoVentaConstantesFunciones.LABEL_IDASIENTOCONTABLE+" :");
		this.jLabelid_asiento_contableFormaPagoPuntoVenta.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableFormaPagoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableFormaPagoPuntoVenta.setToolTipText(FormaPagoPuntoVentaConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		this.jPanelid_asiento_contableFormaPagoPuntoVenta.setLayout(this.gridaBagLayoutFormaPagoPuntoVenta);


		jComboBoxid_asiento_contableFormaPagoPuntoVenta= new JComboBoxMe();
		jComboBoxid_asiento_contableFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_asiento_contableFormaPagoPuntoVenta.setEnabled(false);

		this.jButtonid_asiento_contableFormaPagoPuntoVenta= new JButtonMe();
		this.jButtonid_asiento_contableFormaPagoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableFormaPagoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableFormaPagoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableFormaPagoPuntoVenta.setText("Buscar");
		this.jButtonid_asiento_contableFormaPagoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableFormaPagoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableFormaPagoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableFormaPagoPuntoVenta"));

		this.jButtonid_asiento_contableFormaPagoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableFormaPagoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableFormaPagoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableFormaPagoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableFormaPagoPuntoVentaBusqueda.setText("U");
		this.jButtonid_asiento_contableFormaPagoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableFormaPagoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableFormaPagoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableFormaPagoPuntoVentaBusqueda"));

		if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableFormaPagoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableFormaPagoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_asiento_contableFormaPagoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableFormaPagoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableFormaPagoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableFormaPagoPuntoVentaUpdate.setText("U");
		this.jButtonid_asiento_contableFormaPagoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableFormaPagoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableFormaPagoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableFormaPagoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableFormaPagoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableFormaPagoPuntoVentaUpdate"));



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
		//this.jInternalFrameDetalleFormaPagoPuntoVenta = new FormaPagoPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Forma Pago DATOS");
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutFormaPagoPuntoVenta= new GridBagLayout();
		

		
		String sToolTipFormaPagoPuntoVenta="";
		sToolTipFormaPagoPuntoVenta=FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFormaPagoPuntoVenta+="(PuntoVenta.FormaPagoPuntoVenta)";
		}
		
		if(!this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFormaPagoPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonModificarFormaPagoPuntoVenta = new JButtonMe();
        this.jButtonActualizarFormaPagoPuntoVenta = new JButtonMe();
        this.jButtonEliminarFormaPagoPuntoVenta = new JButtonMe();
        this.jButtonCancelarFormaPagoPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta = new JButtonMe();
		this.jButtonCerrarFormaPagoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosFormaPagoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionFormaPagoPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralFormaPagoPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocreditoFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciochequeFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Forma Pago";
		
		if(!this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Forma Pagoes" + this.sPath));
		} else {
			this.jScrollPanelDatosFormaPagoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFormaPagoPuntoVenta.setName("jPanelCamposFormaPagoPuntoVenta"); 

		this.jPanelCamposOcultosFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFormaPagoPuntoVenta.setName("jPanelCamposOcultosFormaPagoPuntoVenta"); 

        this.jPanelAccionesFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFormaPagoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormaPagoPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFormaPagoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFormaPagoPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralFormaPagoPuntoVenta.setName("jPanelCamposFingeneralFormaPagoPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocreditoFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Credito"));
		this.jPanelCamposIniciocreditoFormaPagoPuntoVenta.setName("jPanelCamposFincreditoFormaPagoPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocreditoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciochequeFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Cheque"));
		this.jPanelCamposIniciochequeFormaPagoPuntoVenta.setName("jPanelCamposFinchequeFormaPagoPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciochequeFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarjeta"));
		this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.setName("jPanelCamposFintarjetaFormaPagoPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFormaPagoPuntoVenta.setText("Nuevo");
		this.jButtonModificarFormaPagoPuntoVenta.setText("Editar");
        this.jButtonActualizarFormaPagoPuntoVenta.setText("Actualizar");
        this.jButtonEliminarFormaPagoPuntoVenta.setText("Eliminar");
        this.jButtonCancelarFormaPagoPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosFormaPagoPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta.setText("Guardar");
		this.jButtonCerrarFormaPagoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFormaPagoPuntoVenta,"nuevo_button","Nuevo",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFormaPagoPuntoVenta,"modificar_button","Editar",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFormaPagoPuntoVenta,"actualizar_button","Actualizar",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFormaPagoPuntoVenta,"eliminar_button","Eliminar",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFormaPagoPuntoVenta,"cancelar_button","Cancelar",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFormaPagoPuntoVenta,"guardarcambios_button","Guardar",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta,"guardarcambiostabla_button","Guardar",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFormaPagoPuntoVenta,"cerrar_button","Salir",this.formapagopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFormaPagoPuntoVenta.setToolTipText("Nuevo"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFormaPagoPuntoVenta.setToolTipText("Editar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFormaPagoPuntoVenta.setToolTipText("Actualizar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFormaPagoPuntoVenta.setToolTipText("Eliminar)"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFormaPagoPuntoVenta.setToolTipText("Cancelar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFormaPagoPuntoVenta.setToolTipText("Guardar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta.setToolTipText("Guardar"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFormaPagoPuntoVenta.setToolTipText("Salir"+" "+FormaPagoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFormaPagoPuntoVenta";
		inputMap = this.jButtonNuevoFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFormaPagoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFormaPagoPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFormaPagoPuntoVenta";
		inputMap = this.jButtonActualizarFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFormaPagoPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarFormaPagoPuntoVenta";
		inputMap = this.jButtonEliminarFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFormaPagoPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarFormaPagoPuntoVenta";
		inputMap = this.jButtonCancelarFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFormaPagoPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarFormaPagoPuntoVenta";
		inputMap = this.jButtonCerrarFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFormaPagoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFormaPagoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFormaPagoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFormaPagoPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFormaPagoPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFormaPagoPuntoVenta.setToolTipText("Nuevo FormaPagoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFormaPagoPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFormaPagoPuntoVenta.setToolTipText("Sin Cerrar Ventana FormaPagoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFormaPagoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFormaPagoPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFormaPagoPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
		/*	
			
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormaPagoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta.setToolTipText("Tipos de Acciones");
							
		*/

		this.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFormaPagoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesFormaPagoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesFormaPagoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormaPagoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFormaPagoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFormaPagoPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFormaPagoPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFormaPagoPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesFormaPagoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFormaPagoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		/*
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		*/
		
		this.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFormaPagoPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFormaPagoPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposFormaPagoPuntoVenta.setLayout(gridaBagLayoutCamposFormaPagoPuntoVenta);
		this.jPanelCamposOcultosFormaPagoPuntoVenta.setLayout(gridaBagLayoutCamposOcultosFormaPagoPuntoVenta);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelCamposIniciogeneralFormaPagoPuntoVenta.setLayout(gridaBagLayoutCamposIniciogeneralFormaPagoPuntoVenta);

		GridBagLayout gridaBagLayoutCamposIniciocreditoFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelCamposIniciocreditoFormaPagoPuntoVenta.setLayout(gridaBagLayoutCamposIniciocreditoFormaPagoPuntoVenta);

		GridBagLayout gridaBagLayoutCamposIniciochequeFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelCamposIniciochequeFormaPagoPuntoVenta.setLayout(gridaBagLayoutCamposIniciochequeFormaPagoPuntoVenta);

		GridBagLayout gridaBagLayoutCamposIniciotarjetaFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.setLayout(gridaBagLayoutCamposIniciotarjetaFormaPagoPuntoVenta);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFormaPagoPuntoVenta.add(jLabelIdFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFormaPagoPuntoVenta.add(jLabelidFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFormaPagoPuntoVenta.add(jLabelid_empresaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormaPagoPuntoVenta.add(jButtonid_empresaFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFormaPagoPuntoVenta.add(jButtonid_empresaFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFormaPagoPuntoVenta.add(jComboBoxid_empresaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalFormaPagoPuntoVenta.add(jLabelid_sucursalFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFormaPagoPuntoVenta.add(jButtonid_sucursalFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFormaPagoPuntoVenta.add(jButtonid_sucursalFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalFormaPagoPuntoVenta.add(jComboBoxid_sucursalFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioFormaPagoPuntoVenta.add(jLabelid_ejercicioFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormaPagoPuntoVenta.add(jButtonid_ejercicioFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFormaPagoPuntoVenta.add(jButtonid_ejercicioFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioFormaPagoPuntoVenta.add(jComboBoxid_ejercicioFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoFormaPagoPuntoVenta.add(jLabelid_periodoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFormaPagoPuntoVenta.add(jButtonid_periodoFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFormaPagoPuntoVenta.add(jButtonid_periodoFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoFormaPagoPuntoVenta.add(jComboBoxid_periodoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_factura_punto_ventaFormaPagoPuntoVenta.add(jLabelid_factura_punto_ventaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factura_punto_ventaFormaPagoPuntoVenta.add(jButtonid_factura_punto_ventaFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_factura_punto_ventaFormaPagoPuntoVenta.add(jButtonid_factura_punto_ventaFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_factura_punto_ventaFormaPagoPuntoVenta.add(jComboBoxid_factura_punto_ventaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_forma_pagoFormaPagoPuntoVenta.add(jLabelid_tipo_forma_pagoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoFormaPagoPuntoVenta.add(jButtonid_tipo_forma_pagoFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoFormaPagoPuntoVenta.add(jButtonid_tipo_forma_pagoFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_forma_pagoFormaPagoPuntoVenta.add(jComboBoxid_tipo_forma_pagoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeFormaPagoPuntoVenta.add(jLabelporcentajeFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeFormaPagoPuntoVenta.add(jButtonporcentajeFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeFormaPagoPuntoVenta.add(jTextFieldporcentajeFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorFormaPagoPuntoVenta.add(jLabelvalorFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorFormaPagoPuntoVenta.add(jButtonvalorFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorFormaPagoPuntoVenta.add(jTextFieldvalorFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaFormaPagoPuntoVenta.add(jLabelfechaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaFormaPagoPuntoVenta.add(jButtonfechaFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaFormaPagoPuntoVenta.add(jDateChooserfechaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionFormaPagoPuntoVenta.add(jLabeldescripcionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionFormaPagoPuntoVenta.add(jButtondescripcionFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionFormaPagoPuntoVenta.add(jscrollPanedescripcionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioFormaPagoPuntoVenta.add(jLabelfecha_inicioFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioFormaPagoPuntoVenta.add(jButtonfecha_inicioFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioFormaPagoPuntoVenta.add(jDateChooserfecha_inicioFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_dias_plazoFormaPagoPuntoVenta.add(jLabelnumero_dias_plazoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_dias_plazoFormaPagoPuntoVenta.add(jButtonnumero_dias_plazoFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_dias_plazoFormaPagoPuntoVenta.add(jTextFieldnumero_dias_plazoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finFormaPagoPuntoVenta.add(jLabelfecha_finFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finFormaPagoPuntoVenta.add(jButtonfecha_finFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finFormaPagoPuntoVenta.add(jDateChooserfecha_finFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoFormaPagoPuntoVenta.add(jLabelid_bancoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoFormaPagoPuntoVenta.add(jButtonid_bancoFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoFormaPagoPuntoVenta.add(jButtonid_bancoFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoFormaPagoPuntoVenta.add(jComboBoxid_bancoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_banco_pun_venFormaPagoPuntoVenta.add(jLabelid_cuenta_banco_pun_venFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_banco_pun_venFormaPagoPuntoVenta.add(jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_banco_pun_venFormaPagoPuntoVenta.add(jButtonid_cuenta_banco_pun_venFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_banco_pun_venFormaPagoPuntoVenta.add(jComboBoxid_cuenta_banco_pun_venFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_riesgo_chequeFormaPagoPuntoVenta.add(jLabelid_tipo_riesgo_chequeFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_riesgo_chequeFormaPagoPuntoVenta.add(jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_riesgo_chequeFormaPagoPuntoVenta.add(jButtonid_tipo_riesgo_chequeFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_riesgo_chequeFormaPagoPuntoVenta.add(jComboBoxid_tipo_riesgo_chequeFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaFormaPagoPuntoVenta.add(jLabelnumero_cuentaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaFormaPagoPuntoVenta.add(jButtonnumero_cuentaFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaFormaPagoPuntoVenta.add(jTextFieldnumero_cuentaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_chequeFormaPagoPuntoVenta.add(jLabelnumero_chequeFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_chequeFormaPagoPuntoVenta.add(jButtonnumero_chequeFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_chequeFormaPagoPuntoVenta.add(jTextFieldnumero_chequeFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelgiradorFormaPagoPuntoVenta.add(jLabelgiradorFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelgiradorFormaPagoPuntoVenta.add(jButtongiradorFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelgiradorFormaPagoPuntoVenta.add(jscrollPanegiradorFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_banco_tarjetaFormaPagoPuntoVenta.add(jLabelid_banco_tarjetaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_banco_tarjetaFormaPagoPuntoVenta.add(jButtonid_banco_tarjetaFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_banco_tarjetaFormaPagoPuntoVenta.add(jButtonid_banco_tarjetaFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_banco_tarjetaFormaPagoPuntoVenta.add(jComboBoxid_banco_tarjetaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tarjeta_creditoFormaPagoPuntoVenta.add(jLabelid_tarjeta_creditoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tarjeta_creditoFormaPagoPuntoVenta.add(jButtonid_tarjeta_creditoFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tarjeta_creditoFormaPagoPuntoVenta.add(jButtonid_tarjeta_creditoFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tarjeta_creditoFormaPagoPuntoVenta.add(jComboBoxid_tarjeta_creditoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_interes_tarjetaFormaPagoPuntoVenta.add(jLabelid_tipo_interes_tarjetaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_interes_tarjetaFormaPagoPuntoVenta.add(jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_interes_tarjetaFormaPagoPuntoVenta.add(jButtonid_tipo_interes_tarjetaFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_interes_tarjetaFormaPagoPuntoVenta.add(jComboBoxid_tipo_interes_tarjetaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_pago_tarjetaFormaPagoPuntoVenta.add(jLabelid_tipo_pago_tarjetaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_pago_tarjetaFormaPagoPuntoVenta.add(jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_pago_tarjetaFormaPagoPuntoVenta.add(jButtonid_tipo_pago_tarjetaFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_pago_tarjetaFormaPagoPuntoVenta.add(jComboBoxid_tipo_pago_tarjetaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_conexionFormaPagoPuntoVenta.add(jLabelid_conexionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_conexionFormaPagoPuntoVenta.add(jButtonid_conexionFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_conexionFormaPagoPuntoVenta.add(jButtonid_conexionFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_conexionFormaPagoPuntoVenta.add(jComboBoxid_conexionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesFormaPagoPuntoVenta.add(jLabelid_mesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesFormaPagoPuntoVenta.add(jButtonid_mesFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesFormaPagoPuntoVenta.add(jButtonid_mesFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesFormaPagoPuntoVenta.add(jComboBoxid_mesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroFormaPagoPuntoVenta.add(jLabelnumeroFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroFormaPagoPuntoVenta.add(jButtonnumeroFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroFormaPagoPuntoVenta.add(jTextFieldnumeroFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltarjeta_habienteFormaPagoPuntoVenta.add(jLabeltarjeta_habienteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltarjeta_habienteFormaPagoPuntoVenta.add(jButtontarjeta_habienteFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltarjeta_habienteFormaPagoPuntoVenta.add(jscrollPanetarjeta_habienteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelautorizacionFormaPagoPuntoVenta.add(jLabelautorizacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelautorizacionFormaPagoPuntoVenta.add(jButtonautorizacionFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelautorizacionFormaPagoPuntoVenta.add(jscrollPaneautorizacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvoucherFormaPagoPuntoVenta.add(jLabelvoucherFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvoucherFormaPagoPuntoVenta.add(jButtonvoucherFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvoucherFormaPagoPuntoVenta.add(jTextFieldvoucherFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelloteFormaPagoPuntoVenta.add(jLabelloteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelloteFormaPagoPuntoVenta.add(jButtonloteFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelloteFormaPagoPuntoVenta.add(jTextFieldloteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcuotaFormaPagoPuntoVenta.add(jLabelcuotaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcuotaFormaPagoPuntoVenta.add(jButtoncuotaFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcuotaFormaPagoPuntoVenta.add(jTextFieldcuotaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_retencionFormaPagoPuntoVenta.add(jLabelvalor_retencionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_retencionFormaPagoPuntoVenta.add(jButtonvalor_retencionFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_retencionFormaPagoPuntoVenta.add(jTextFieldvalor_retencionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_comisionFormaPagoPuntoVenta.add(jLabelvalor_comisionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_comisionFormaPagoPuntoVenta.add(jButtonvalor_comisionFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_comisionFormaPagoPuntoVenta.add(jTextFieldvalor_comisionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_calculadoFormaPagoPuntoVenta.add(jLabelvalor_calculadoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_calculadoFormaPagoPuntoVenta.add(jButtonvalor_calculadoFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_calculadoFormaPagoPuntoVenta.add(jTextFieldvalor_calculadoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_canceladoFormaPagoPuntoVenta.add(jLabelvalor_canceladoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_canceladoFormaPagoPuntoVenta.add(jButtonvalor_canceladoFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_canceladoFormaPagoPuntoVenta.add(jTextFieldvalor_canceladoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_difiereFormaPagoPuntoVenta.add(jLabelvalor_difiereFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_difiereFormaPagoPuntoVenta.add(jButtonvalor_difiereFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_difiereFormaPagoPuntoVenta.add(jTextFieldvalor_difiereFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_retencionFormaPagoPuntoVenta.add(jLabelnumero_retencionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencionFormaPagoPuntoVenta.add(jButtonnumero_retencionFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_retencionFormaPagoPuntoVenta.add(jTextFieldnumero_retencionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_liquidacionFormaPagoPuntoVenta.add(jLabelnumero_liquidacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_liquidacionFormaPagoPuntoVenta.add(jButtonnumero_liquidacionFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_liquidacionFormaPagoPuntoVenta.add(jTextFieldnumero_liquidacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioFormaPagoPuntoVenta.add(jLabelid_anioFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioFormaPagoPuntoVenta.add(jButtonid_anioFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioFormaPagoPuntoVenta.add(jButtonid_anioFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioFormaPagoPuntoVenta.add(jComboBoxid_anioFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableFormaPagoPuntoVenta.add(jLabelid_cuenta_contableFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableFormaPagoPuntoVenta.add(jButtonid_cuenta_contableFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableFormaPagoPuntoVenta.add(jButtonid_cuenta_contableFormaPagoPuntoVentaArbol, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 4;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableFormaPagoPuntoVenta.add(jButtonid_cuenta_contableFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 5;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableFormaPagoPuntoVenta.add(jButtonid_cuenta_contableFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableFormaPagoPuntoVenta.add(jComboBoxid_cuenta_contableFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableFormaPagoPuntoVenta.add(jLabelid_asiento_contableFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 2;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableFormaPagoPuntoVenta.add(jButtonid_asiento_contableFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 3;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableFormaPagoPuntoVenta.add(jButtonid_asiento_contableFormaPagoPuntoVentaBusqueda, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 4;
		this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableFormaPagoPuntoVenta.add(jButtonid_asiento_contableFormaPagoPuntoVentaUpdate, this.gridBagConstraintsFormaPagoPuntoVenta);
	}

	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 1;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableFormaPagoPuntoVenta.add(jComboBoxid_asiento_contableFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFormaPagoPuntoVenta.add(this.jPanelidFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposFormaPagoPuntoVenta=0;
		iYPanelCamposFormaPagoPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposOcultosFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposOcultosFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoPuntoVenta.add(this.jPanelid_empresaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposOcultosFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposOcultosFormaPagoPuntoVenta=0;
		iYPanelCamposOcultosFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposOcultosFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposOcultosFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoPuntoVenta.add(this.jPanelid_sucursalFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposOcultosFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposOcultosFormaPagoPuntoVenta=0;
		iYPanelCamposOcultosFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposOcultosFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposOcultosFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoPuntoVenta.add(this.jPanelid_ejercicioFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposOcultosFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposOcultosFormaPagoPuntoVenta=0;
		iYPanelCamposOcultosFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposOcultosFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposOcultosFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoPuntoVenta.add(this.jPanelid_periodoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposOcultosFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposOcultosFormaPagoPuntoVenta=0;
		iYPanelCamposOcultosFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposOcultosFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposOcultosFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoPuntoVenta.add(this.jPanelid_anioFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposOcultosFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposOcultosFormaPagoPuntoVenta=0;
		iYPanelCamposOcultosFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposOcultosFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposOcultosFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoPuntoVenta.add(this.jPanelid_cuenta_contableFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposOcultosFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposOcultosFormaPagoPuntoVenta=0;
		iYPanelCamposOcultosFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposOcultosFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposOcultosFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFormaPagoPuntoVenta.add(this.jPanelid_asiento_contableFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposOcultosFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposOcultosFormaPagoPuntoVenta=0;
		iYPanelCamposOcultosFormaPagoPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciogeneralFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciogeneralFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPagoPuntoVenta.add(this.jPanelid_factura_punto_ventaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciogeneralFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciogeneralFormaPagoPuntoVenta=0;
		iYPanelCamposIniciogeneralFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciogeneralFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciogeneralFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPagoPuntoVenta.add(this.jPanelid_tipo_forma_pagoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciogeneralFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciogeneralFormaPagoPuntoVenta=0;
		iYPanelCamposIniciogeneralFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciogeneralFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciogeneralFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPagoPuntoVenta.add(this.jPanelporcentajeFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciogeneralFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciogeneralFormaPagoPuntoVenta=0;
		iYPanelCamposIniciogeneralFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciogeneralFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciogeneralFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPagoPuntoVenta.add(this.jPanelvalorFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciogeneralFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciogeneralFormaPagoPuntoVenta=0;
		iYPanelCamposIniciogeneralFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciogeneralFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciogeneralFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPagoPuntoVenta.add(this.jPanelfechaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciogeneralFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciogeneralFormaPagoPuntoVenta=0;
		iYPanelCamposIniciogeneralFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciogeneralFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciogeneralFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralFormaPagoPuntoVenta.add(this.jPaneldescripcionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciogeneralFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciogeneralFormaPagoPuntoVenta=0;
		iYPanelCamposIniciogeneralFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciocreditoFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciocreditoFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocreditoFormaPagoPuntoVenta.add(this.jPanelfecha_inicioFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciocreditoFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciocreditoFormaPagoPuntoVenta=0;
		iYPanelCamposIniciocreditoFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciocreditoFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciocreditoFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocreditoFormaPagoPuntoVenta.add(this.jPanelnumero_dias_plazoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciocreditoFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciocreditoFormaPagoPuntoVenta=0;
		iYPanelCamposIniciocreditoFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciocreditoFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciocreditoFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocreditoFormaPagoPuntoVenta.add(this.jPanelfecha_finFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciocreditoFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciocreditoFormaPagoPuntoVenta=0;
		iYPanelCamposIniciocreditoFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciochequeFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciochequeFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciochequeFormaPagoPuntoVenta.add(this.jPanelid_bancoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciochequeFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciochequeFormaPagoPuntoVenta=0;
		iYPanelCamposIniciochequeFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciochequeFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciochequeFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciochequeFormaPagoPuntoVenta.add(this.jPanelid_cuenta_banco_pun_venFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciochequeFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciochequeFormaPagoPuntoVenta=0;
		iYPanelCamposIniciochequeFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciochequeFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciochequeFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciochequeFormaPagoPuntoVenta.add(this.jPanelid_tipo_riesgo_chequeFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciochequeFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciochequeFormaPagoPuntoVenta=0;
		iYPanelCamposIniciochequeFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciochequeFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciochequeFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciochequeFormaPagoPuntoVenta.add(this.jPanelnumero_cuentaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciochequeFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciochequeFormaPagoPuntoVenta=0;
		iYPanelCamposIniciochequeFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciochequeFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciochequeFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciochequeFormaPagoPuntoVenta.add(this.jPanelnumero_chequeFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciochequeFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciochequeFormaPagoPuntoVenta=0;
		iYPanelCamposIniciochequeFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciochequeFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciochequeFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciochequeFormaPagoPuntoVenta.add(this.jPanelgiradorFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciochequeFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciochequeFormaPagoPuntoVenta=0;
		iYPanelCamposIniciochequeFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelid_banco_tarjetaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelid_tarjeta_creditoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelid_tipo_interes_tarjetaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelid_tipo_pago_tarjetaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelid_conexionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelid_mesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelnumeroFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPaneltarjeta_habienteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelautorizacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelvoucherFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelloteFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelcuotaFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelvalor_retencionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelvalor_comisionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelvalor_calculadoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelvalor_canceladoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelvalor_difiereFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelnumero_retencionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	}
	this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iYPanelCamposIniciotarjetaFormaPagoPuntoVenta;
	this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iXPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
	this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFormaPagoPuntoVenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciotarjetaFormaPagoPuntoVenta.add(this.jPanelnumero_liquidacionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);



	if(iXPanelCamposIniciotarjetaFormaPagoPuntoVenta % 1==0) {
		iXPanelCamposIniciotarjetaFormaPagoPuntoVenta=0;
		iYPanelCamposIniciotarjetaFormaPagoPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormaPagoPuntoVenta.setLayout(gridaBagLayoutAccionesFormaPagoPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFormaPagoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioFormaPagoPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioFormaPagoPuntoVenta);
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormaPagoPuntoVenta.add(this.jComboBoxTiposAccionesFormularioFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFormaPagoPuntoVenta.add(this.jCheckBoxPostAccionNuevoFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.formapagopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormaPagoPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.formapagopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFormaPagoPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesFormaPagoPuntoVenta.add(this.jButtonModificarFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);							

		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesFormaPagoPuntoVenta.add(this.jButtonEliminarFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
			
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormaPagoPuntoVenta.add(this.jButtonActualizarFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);


		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesFormaPagoPuntoVenta.add(this.jButtonGuardarCambiosFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);	
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesFormaPagoPuntoVenta.add(this.jButtonCancelarFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFormaPagoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFormaPagoPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsFormaPagoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFormaPagoPuntoVenta.ipadx = 100;
				
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
		
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx =0;
		this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFormaPagoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FormaPagoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFormaPagoPuntoVenta = new FormaPagoPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Forma Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Forma Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Forma Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FormaPagoPuntoVentaModel formapagopuntoventaModel=new FormaPagoPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//FormaPagoPuntoVentaModel.FormaPagoPuntoVentaFocusTraversalPolicy formapagopuntoventaFocusTraversalPolicy = formapagopuntoventaModel.new FormaPagoPuntoVentaFocusTraversalPolicy(this);
			
			//formapagopuntoventaFocusTraversalPolicy.setformapagopuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(formapagopuntoventaModel);
			
			
			this.jContentPaneDetalleFormaPagoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFormaPagoPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleFormaPagoPuntoVenta.setLayout(gridaBagLayoutDetalleFormaPagoPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFormaPagoPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				/*
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
				this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
					
				
				this.jContentPaneDetalleFormaPagoPuntoVenta.add(jTtoolBarDetalleFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);								
				*/
}
			
			this.jScrollPanelDatosEdicionFormaPagoPuntoVenta=   new JScrollPane(jContentPaneDetalleFormaPagoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFormaPagoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleFormaPagoPuntoVenta.add(jPanelCamposFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyRelaciones++;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;

		this.jContentPaneDetalleFormaPagoPuntoVenta.add(jPanelCamposIniciogeneralFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);


		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyRelaciones++;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;

		this.jContentPaneDetalleFormaPagoPuntoVenta.add(jPanelCamposIniciocreditoFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);


		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyRelaciones++;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;

		this.jContentPaneDetalleFormaPagoPuntoVenta.add(jPanelCamposIniciochequeFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);


		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyRelaciones++;
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;

		this.jContentPaneDetalleFormaPagoPuntoVenta.add(jPanelCamposIniciotarjetaFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);
			
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
						&& formapagopuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.formapagopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFormaPagoPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
						this.jContentPaneDetalleFormaPagoPuntoVenta.add(this.jTabbedPaneRelacionesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFormaPagoPuntoVenta.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFormaPagoPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsFormaPagoPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleFormaPagoPuntoVenta.add(jPanelCamposOcultosFormaPagoPuntoVenta, gridBagConstraintsFormaPagoPuntoVenta);
				
					this.jPanelCamposOcultosFormaPagoPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	        this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFormaPagoPuntoVenta.add(this.jPanelAccionesFormularioFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);							
			
			
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
	        this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleFormaPagoPuntoVenta.add(this.jPanelAccionesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFormaPagoPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFormaPagoPuntoVenta=   new JScrollPane(this.jPanelCamposFormaPagoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFormaPagoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormaPagoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFormaPagoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
			this.gridBagConstraintsFormaPagoPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFormaPagoPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFormaPagoPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);			
			
			this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
			
			
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		
			
		this.gridBagConstraintsFormaPagoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFormaPagoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFormaPagoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFormaPagoPuntoVenta, this.gridBagConstraintsFormaPagoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFormaPagoPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionFormaPagoPuntoVenta;
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
