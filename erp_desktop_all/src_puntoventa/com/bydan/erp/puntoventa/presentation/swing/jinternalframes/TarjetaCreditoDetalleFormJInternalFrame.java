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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.puntoventa.util.TarjetaCreditoConstantesFunciones;

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
public class TarjetaCreditoDetalleFormJInternalFrame extends TarjetaCreditoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTarjetaCredito;
	
	protected JMenuBar jmenuBarDetalleTarjetaCredito;
	
	protected JMenu jmenuDetalleTarjetaCredito;
	protected JMenu jmenuDetalleArchivoTarjetaCredito;
	protected JMenu jmenuDetalleAccionesTarjetaCredito;
	protected JMenu jmenuDetalleDatosTarjetaCredito;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTarjetaCredito;	
	protected GridBagConstraints gridBagConstraintsTarjetaCredito;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TarjetaCreditoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTarjetaCredito;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencion="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected TipoRetencionIvaBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecomisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecomision="";

	protected FormulaBeanSwingJInternalFrame formulapagobancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formulapagobanco="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablediferenciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablediferencia="";

	protected FormulaBeanSwingJInternalFrame formularetencionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formularetencion="";

	protected FormulaBeanSwingJInternalFrame formulacomisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formulacomision="";
	
	public TarjetaCreditoSessionBean tarjetacreditoSessionBean;
	
	

	public TarjetaCreditoConexionBeanSwingJInternalFrame tarjetacreditoconexionBeanSwingJInternalFrame=null;
	public TarjetaCreditoConexionBeanSwingJInternalFrame tarjetacreditoconexionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTarjetaCreditoConexion=false;
	public TarjetaCreditoConexionSessionBean tarjetacreditoconexionSessionBean;

	public TarjetaCreditoDescuentoBeanSwingJInternalFrame tarjetacreditodescuentoBeanSwingJInternalFrame=null;
	public TarjetaCreditoDescuentoBeanSwingJInternalFrame tarjetacreditodescuentoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTarjetaCreditoDescuento=false;
	public TarjetaCreditoDescuentoSessionBean tarjetacreditodescuentoSessionBean;

	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;
	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormaPagoPuntoVenta=false;
	public FormaPagoPuntoVentaSessionBean formapagopuntoventaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoRetencionSessionBean tiporetencionSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public TipoRetencionIvaSessionBean tiporetencionivaSessionBean;
	public CuentaContableSessionBean cuentacontablecomisionSessionBean;
	public FormulaSessionBean formulapagobancoSessionBean;
	public CuentaContableSessionBean cuentacontablediferenciaSessionBean;
	public FormulaSessionBean formularetencionSessionBean;
	public FormulaSessionBean formulacomisionSessionBean;	
	
	public TarjetaCreditoLogic tarjetacreditoLogic;
	
	public JScrollPane jScrollPanelDatosTarjetaCredito;
	public JScrollPane jScrollPanelDatosEdicionTarjetaCredito;
	public JScrollPane jScrollPanelDatosGeneralTarjetaCredito;
	
	protected JPanel jPanelCamposTarjetaCredito;    
	protected JPanel jPanelCamposOcultosTarjetaCredito;    	
	protected JPanel jPanelAccionesTarjetaCredito;
	protected JPanel jPanelAccionesFormularioTarjetaCredito;
    
	
	
	protected JTabbedPane jTabbedPaneCamposTarjetaCredito;	
	protected Integer iXPanelCamposTarjetaCredito=0;
	protected Integer iYPanelCamposTarjetaCredito=0;
	
	protected Integer iXPanelCamposOcultosTarjetaCredito=0;
	protected Integer iYPanelCamposOcultosTarjetaCredito=0;
	
	

	protected JPanel jPanelCamposIniciogeneralTarjetaCredito;
	protected Integer iXPanelCamposIniciogeneralTarjetaCredito=0;
	protected Integer iYPanelCamposIniciogeneralTarjetaCredito=0;

	protected JPanel jPanelCamposIniciovaloresTarjetaCredito;
	protected Integer iXPanelCamposIniciovaloresTarjetaCredito=0;
	protected Integer iYPanelCamposIniciovaloresTarjetaCredito=0;

	protected JPanel jPanelCamposIniciocontableTarjetaCredito;
	protected Integer iXPanelCamposIniciocontableTarjetaCredito=0;
	protected Integer iYPanelCamposIniciocontableTarjetaCredito=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTarjetaCredito;
	public JButton jButtonModificarTarjetaCredito;
	public JButton jButtonActualizarTarjetaCredito;
    public JButton jButtonEliminarTarjetaCredito;
	public JButton jButtonCancelarTarjetaCredito;
    public JButton jButtonGuardarCambiosTarjetaCredito;
	public JButton jButtonGuardarCambiosTablaTarjetaCredito;
	protected JButton jButtonCerrarTarjetaCredito;
	
	
	protected JButton jButtonProcesarInformacionTarjetaCredito;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTarjetaCredito;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTarjetaCredito;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTarjetaCredito;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTarjetaCredito;
	protected JButton jButtonModificarToolBarTarjetaCredito;
	protected JButton jButtonActualizarToolBarTarjetaCredito;
    protected JButton jButtonEliminarToolBarTarjetaCredito;
	protected JButton jButtonCancelarToolBarTarjetaCredito;
    protected JButton jButtonGuardarCambiosToolBarTarjetaCredito;
	protected JButton jButtonGuardarCambiosTablaToolBarTarjetaCredito;
	protected JButton jButtonMostrarOcultarTablaToolBarTarjetaCredito;
	protected JButton jButtonCerrarToolBarTarjetaCredito;
	
	protected JButton jButtonProcesarInformacionToolBarTarjetaCredito;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTarjetaCredito;
	protected JMenuItem jMenuItemModificarTarjetaCredito;
	protected JMenuItem jMenuItemActualizarTarjetaCredito;
    protected JMenuItem jMenuItemEliminarTarjetaCredito;
	protected JMenuItem jMenuItemCancelarTarjetaCredito;
    protected JMenuItem jMenuItemGuardarCambiosTarjetaCredito;
	protected JMenuItem jMenuItemGuardarCambiosTablaTarjetaCredito;
	protected JMenuItem jMenuItemCerrarTarjetaCredito;
	protected JMenuItem jMenuItemDetalleCerrarTarjetaCredito;
	protected JMenuItem jMenuItemDetalleMostarOcultarTarjetaCredito;
	
	protected JMenuItem jMenuItemProcesarInformacionTarjetaCredito;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTarjetaCredito;
	protected JMenuItem jMenuItemMostrarOcultarTarjetaCredito;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTarjetaCredito;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTarjetaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTarjetaCredito;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTarjetaCredito;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTarjetaCredito;
	public JLabel jLabelIdTarjetaCredito;
	public JLabel jLabelidTarjetaCredito;
	public JButton jButtonidTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTarjetaCredito;
	public JLabel jLabelcodigoTarjetaCredito;
	public JTextField jTextFieldcodigoTarjetaCredito;
	public JButton jButtoncodigoTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTarjetaCredito;
	public JLabel jLabelnombreTarjetaCredito;
	public JTextArea jTextAreanombreTarjetaCredito;
	public JScrollPane jscrollPanenombreTarjetaCredito;
	public JButton jButtonnombreTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_cortoTarjetaCredito;
	public JLabel jLabelnombre_cortoTarjetaCredito;
	public JTextField jTextFieldnombre_cortoTarjetaCredito;
	public JButton jButtonnombre_cortoTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneldigito_validoTarjetaCredito;
	public JLabel jLabeldigito_validoTarjetaCredito;
	public JTextField jTextFielddigito_validoTarjetaCredito;
	public JButton jButtondigito_validoTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneldigito_tarjetaTarjetaCredito;
	public JLabel jLabeldigito_tarjetaTarjetaCredito;
	public JTextField jTextFielddigito_tarjetaTarjetaCredito;
	public JButton jButtondigito_tarjetaTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelcomisionTarjetaCredito;
	public JLabel jLabelcomisionTarjetaCredito;
	public JTextField jTextFieldcomisionTarjetaCredito;
	public JButton jButtoncomisionTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelinteresTarjetaCredito;
	public JLabel jLabelinteresTarjetaCredito;
	public JTextField jTextFieldinteresTarjetaCredito;
	public JButton jButtoninteresTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelmonto_minimoTarjetaCredito;
	public JLabel jLabelmonto_minimoTarjetaCredito;
	public JTextField jTextFieldmonto_minimoTarjetaCredito;
	public JButton jButtonmonto_minimoTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_retencionTarjetaCredito;
	public JLabel jLabelporcentaje_retencionTarjetaCredito;
	public JTextField jTextFieldporcentaje_retencionTarjetaCredito;
	public JButton jButtonporcentaje_retencionTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelcomision_retencionTarjetaCredito;
	public JLabel jLabelcomision_retencionTarjetaCredito;
	public JTextField jTextFieldcomision_retencionTarjetaCredito;
	public JButton jButtoncomision_retencionTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneles_retencion_redondeoTarjetaCredito;
	public JLabel jLabeles_retencion_redondeoTarjetaCredito;
	public JCheckBox jCheckBoxes_retencion_redondeoTarjetaCredito;
	public JButton jButtones_retencion_redondeoTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneles_pago_banco_redondeoTarjetaCredito;
	public JLabel jLabeles_pago_banco_redondeoTarjetaCredito;
	public JCheckBox jCheckBoxes_pago_banco_redondeoTarjetaCredito;
	public JButton jButtones_pago_banco_redondeoTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneles_comision_redondeoTarjetaCredito;
	public JLabel jLabeles_comision_redondeoTarjetaCredito;
	public JCheckBox jCheckBoxes_comision_redondeoTarjetaCredito;
	public JButton jButtones_comision_redondeoTarjetaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTarjetaCredito;
	public JLabel jLabelid_empresaTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTarjetaCredito;
	public JButton jButtonid_empresaTarjetaCredito= new JButtonMe();
	public JButton jButtonid_empresaTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTarjetaCredito;
	public JLabel jLabelid_sucursalTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTarjetaCredito;
	public JButton jButtonid_sucursalTarjetaCredito= new JButtonMe();
	public JButton jButtonid_sucursalTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoTarjetaCredito;
	public JLabel jLabelid_bancoTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoTarjetaCredito;
	public JButton jButtonid_bancoTarjetaCredito= new JButtonMe();
	public JButton jButtonid_bancoTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_bancoTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencionTarjetaCredito;
	public JLabel jLabelid_tipo_retencionTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencionTarjetaCredito;
	public JButton jButtonid_tipo_retencionTarjetaCredito= new JButtonMe();
	public JButton jButtonid_tipo_retencionTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencionTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableTarjetaCredito;
	public JLabel jLabelid_cuenta_contableTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableTarjetaCredito;
	public JButton jButtonid_cuenta_contableTarjetaCredito= new JButtonMe();
	public JButton jButtonid_cuenta_contableTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableTarjetaCreditoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableTarjetaCreditoArbol= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_ivaTarjetaCredito;
	public JLabel jLabelid_tipo_retencion_ivaTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_ivaTarjetaCredito;
	public JButton jButtonid_tipo_retencion_ivaTarjetaCredito= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_ivaTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_comisionTarjetaCredito;
	public JLabel jLabelid_cuenta_contable_comisionTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_comisionTarjetaCredito;
	public JButton jButtonid_cuenta_contable_comisionTarjetaCredito= new JButtonMe();
	public JButton jButtonid_cuenta_contable_comisionTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_comisionTarjetaCreditoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_comisionTarjetaCreditoArbol= new JButtonMe();

	public JPanel jPanelid_formula_pago_bancoTarjetaCredito;
	public JLabel jLabelid_formula_pago_bancoTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formula_pago_bancoTarjetaCredito;
	public JButton jButtonid_formula_pago_bancoTarjetaCredito= new JButtonMe();
	public JButton jButtonid_formula_pago_bancoTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_formula_pago_bancoTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_diferenciaTarjetaCredito;
	public JLabel jLabelid_cuenta_contable_diferenciaTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_diferenciaTarjetaCredito;
	public JButton jButtonid_cuenta_contable_diferenciaTarjetaCredito= new JButtonMe();
	public JButton jButtonid_cuenta_contable_diferenciaTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_diferenciaTarjetaCreditoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_diferenciaTarjetaCreditoArbol= new JButtonMe();

	public JPanel jPanelid_formula_retencionTarjetaCredito;
	public JLabel jLabelid_formula_retencionTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formula_retencionTarjetaCredito;
	public JButton jButtonid_formula_retencionTarjetaCredito= new JButtonMe();
	public JButton jButtonid_formula_retencionTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_formula_retencionTarjetaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_formula_comisionTarjetaCredito;
	public JLabel jLabelid_formula_comisionTarjetaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formula_comisionTarjetaCredito;
	public JButton jButtonid_formula_comisionTarjetaCredito= new JButtonMe();
	public JButton jButtonid_formula_comisionTarjetaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_formula_comisionTarjetaCreditoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTarjetaCredito;
	
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
	public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TarjetaCreditoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTarjetaCredito=new JPanel();
				this.jPanelAccionesFormularioTarjetaCredito=new JPanel();
				this.jmenuBarDetalleTarjetaCredito=new JMenuBar();
				this.jTtoolBarDetalleTarjetaCredito=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TarjetaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TarjetaCreditoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TarjetaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TarjetaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TarjetaCreditoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TarjetaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTarjetaCredito() {
		return this.jButtonActualizarToolBarTarjetaCredito;
	}
	
	public JButton getjButtonEliminarToolBarTarjetaCredito() {
		return this.jButtonEliminarToolBarTarjetaCredito;
	}
	
	public JButton getjButtonCancelarToolBarTarjetaCredito() {
		return this.jButtonCancelarToolBarTarjetaCredito;
	}		
	
	public JButton getjButtonProcesarInformacionTarjetaCredito() {
		return this.jButtonProcesarInformacionTarjetaCredito;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTarjetaCredito)	{
		this.jButtonProcesarInformacionTarjetaCredito = jButtonProcesarInformacionTarjetaCredito;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTarjetaCredito() {
		return this.jComboBoxTiposAccionesTarjetaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTarjetaCredito(
			JComboBox jComboBoxTiposRelacionesTarjetaCredito) {
		this.jComboBoxTiposRelacionesTarjetaCredito = jComboBoxTiposRelacionesTarjetaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTarjetaCredito(
			JComboBox jComboBoxTiposAccionesTarjetaCredito) {
		this.jComboBoxTiposAccionesTarjetaCredito = jComboBoxTiposAccionesTarjetaCredito;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTarjetaCredito() {
		return this.jComboBoxTiposAccionesFormularioTarjetaCredito;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTarjetaCredito(
			JComboBox jComboBoxTiposAccionesFormularioTarjetaCredito) {
		this.jComboBoxTiposAccionesFormularioTarjetaCredito = jComboBoxTiposAccionesFormularioTarjetaCredito;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tarjetacreditoSessionBean=new TarjetaCreditoSessionBean();
		
		this.tarjetacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tarjetacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tarjetacreditoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
		//this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
		//this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TarjetaCreditoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tarjeta Credito MANTENIMIENTO"));
		
		
		if(iWidth > 2450) {
			iWidth=2450;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {
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
	
		TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTarjetaCredito= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTarjetaCredito=new JButtonMe();
				this.jButtonModificarToolBarTarjetaCredito=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTarjetaCredito,this.jTtoolBarDetalleTarjetaCredito,
							"actualizar","actualizar","Actualizar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTarjetaCredito,this.jTtoolBarDetalleTarjetaCredito,
							"eliminar","eliminar","Eliminar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTarjetaCredito,this.jTtoolBarDetalleTarjetaCredito,
							"cancelar","cancelar","Cancelar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTarjetaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTarjetaCredito,this.jTtoolBarDetalleTarjetaCredito,
							"guardarcambios","guardarcambios","Guardar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTarjetaCredito=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTarjetaCredito=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTarjetaCredito=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTarjetaCredito=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTarjetaCredito=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTarjetaCredito= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTarjetaCredito.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTarjetaCredito,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTarjetaCredito= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTarjetaCredito.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTarjetaCredito,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTarjetaCredito= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTarjetaCredito.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTarjetaCredito,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTarjetaCredito= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTarjetaCredito.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTarjetaCredito,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTarjetaCredito= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTarjetaCredito.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTarjetaCredito,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTarjetaCredito= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTarjetaCredito.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTarjetaCredito,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTarjetaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTarjetaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTarjetaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTarjetaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTarjetaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTarjetaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTarjetaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTarjetaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTarjetaCredito,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTarjetaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTarjetaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTarjetaCredito,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTarjetaCredito.add(this.jMenuItemDetalleCerrarTarjetaCredito);
		
		this.jmenuDetalleAccionesTarjetaCredito.add(this.jMenuItemActualizarTarjetaCredito);
		this.jmenuDetalleAccionesTarjetaCredito.add(this.jMenuItemEliminarTarjetaCredito);
		this.jmenuDetalleAccionesTarjetaCredito.add(this.jMenuItemCancelarTarjetaCredito);		
		
		//this.jmenuDetalleDatosTarjetaCredito.add(this.jMenuItemDetalleAbrirOrderByTarjetaCredito);				
		this.jmenuDetalleDatosTarjetaCredito.add(this.jMenuItemDetalleMostarOcultarTarjetaCredito);				
				
		//this.jmenuDetalleAccionesTarjetaCredito.add(this.jMenuItemGuardarCambiosTarjetaCredito);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTarjetaCredito.add(this.jmenuDetalleArchivoTarjetaCredito);		
		this.jmenuBarDetalleTarjetaCredito.add(this.jmenuDetalleAccionesTarjetaCredito);		
		this.jmenuBarDetalleTarjetaCredito.add(this.jmenuDetalleDatosTarjetaCredito);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTarjetaCredito.add(this.jmenuDetalleTarjetaCredito);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTarjetaCredito);				
	}
	
	
	public void inicializarElementosCamposTarjetaCredito() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTarjetaCredito = new JLabelMe();
		jLabelIdTarjetaCredito.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTarjetaCredito = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTarjetaCredito= new GridBagLayout();

		this.jPanelidTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);

		jLabelidTarjetaCredito = new JLabel();
		jLabelidTarjetaCredito.setText("Id");

		jLabelidTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTarjetaCredito = new JLabelMe();
		this.jLabelcodigoTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTarjetaCredito.setToolTipText("Codigo");
		this.jLabelcodigoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelcodigoTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jTextFieldcodigoTarjetaCredito= new JTextFieldMe();

		jTextFieldcodigoTarjetaCredito.setEnabled(false);
		jTextFieldcodigoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtoncodigoTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTarjetaCreditoBusqueda.setText("U");
		this.jButtoncodigoTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTarjetaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTarjetaCredito = new JLabelMe();
		this.jLabelnombreTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTarjetaCredito.setToolTipText("Nombre");
		this.jLabelnombreTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelnombreTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jTextAreanombreTarjetaCredito= new JTextAreaMe();
		jTextAreanombreTarjetaCredito.setEnabled(false);
		jTextAreanombreTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTarjetaCredito.setLineWrap(true);
		jTextAreanombreTarjetaCredito.setWrapStyleWord(true);
		jTextAreanombreTarjetaCredito.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTarjetaCredito.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTarjetaCredito = new JScrollPane(jTextAreanombreTarjetaCredito);
		jscrollPanenombreTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonnombreTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTarjetaCreditoBusqueda.setText("U");
		this.jButtonnombreTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTarjetaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelnombre_cortoTarjetaCredito = new JLabelMe();
		this.jLabelnombre_cortoTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_NOMBRECORTO+" : *");
		this.jLabelnombre_cortoTarjetaCredito.setToolTipText("Nombre Corto");
		this.jLabelnombre_cortoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cortoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_cortoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_cortoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_cortoTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_cortoTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_NOMBRECORTO);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelnombre_cortoTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jTextFieldnombre_cortoTarjetaCredito= new JTextFieldMe();

		jTextFieldnombre_cortoTarjetaCredito.setEnabled(false);
		jTextFieldnombre_cortoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_cortoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_cortoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_cortoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_cortoTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonnombre_cortoTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cortoTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_cortoTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_cortoTarjetaCreditoBusqueda.setText("U");
		this.jButtonnombre_cortoTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_cortoTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_cortoTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_cortoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_cortoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_cortoTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_cortoTarjetaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeldigito_validoTarjetaCredito = new JLabelMe();
		this.jLabeldigito_validoTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_DIGITOVALIDO+" : *");
		this.jLabeldigito_validoTarjetaCredito.setToolTipText("Digito Valido");
		this.jLabeldigito_validoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldigito_validoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldigito_validoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldigito_validoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldigito_validoTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldigito_validoTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_DIGITOVALIDO);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPaneldigito_validoTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jTextFielddigito_validoTarjetaCredito= new JTextFieldMe();
		jTextFielddigito_validoTarjetaCredito.setEnabled(false);
		jTextFielddigito_validoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddigito_validoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddigito_validoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddigito_validoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddigito_validoTarjetaCredito.setText("0");

		this.jButtondigito_validoTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtondigito_validoTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondigito_validoTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondigito_validoTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondigito_validoTarjetaCreditoBusqueda.setText("U");
		this.jButtondigito_validoTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondigito_validoTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondigito_validoTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddigito_validoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddigito_validoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"digito_validoTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondigito_validoTarjetaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeldigito_tarjetaTarjetaCredito = new JLabelMe();
		this.jLabeldigito_tarjetaTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_DIGITOTARJETA+" : *");
		this.jLabeldigito_tarjetaTarjetaCredito.setToolTipText("Digito Tarjeta");
		this.jLabeldigito_tarjetaTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldigito_tarjetaTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldigito_tarjetaTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldigito_tarjetaTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldigito_tarjetaTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldigito_tarjetaTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_DIGITOTARJETA);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPaneldigito_tarjetaTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jTextFielddigito_tarjetaTarjetaCredito= new JTextFieldMe();
		jTextFielddigito_tarjetaTarjetaCredito.setEnabled(false);
		jTextFielddigito_tarjetaTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddigito_tarjetaTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddigito_tarjetaTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddigito_tarjetaTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddigito_tarjetaTarjetaCredito.setText("0");

		this.jButtondigito_tarjetaTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtondigito_tarjetaTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondigito_tarjetaTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondigito_tarjetaTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondigito_tarjetaTarjetaCreditoBusqueda.setText("U");
		this.jButtondigito_tarjetaTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondigito_tarjetaTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondigito_tarjetaTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddigito_tarjetaTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddigito_tarjetaTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"digito_tarjetaTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondigito_tarjetaTarjetaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelcomisionTarjetaCredito = new JLabelMe();
		this.jLabelcomisionTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_COMISION+" : *");
		this.jLabelcomisionTarjetaCredito.setToolTipText("Comision");
		this.jLabelcomisionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcomisionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcomisionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcomisionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcomisionTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcomisionTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_COMISION);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelcomisionTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jTextFieldcomisionTarjetaCredito= new JTextFieldMe();
		jTextFieldcomisionTarjetaCredito.setEnabled(false);
		jTextFieldcomisionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcomisionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcomisionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcomisionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcomisionTarjetaCredito.setText("0.0");

		this.jButtoncomisionTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtoncomisionTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncomisionTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncomisionTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncomisionTarjetaCreditoBusqueda.setText("U");
		this.jButtoncomisionTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncomisionTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncomisionTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcomisionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcomisionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"comisionTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncomisionTarjetaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelinteresTarjetaCredito = new JLabelMe();
		this.jLabelinteresTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_INTERES+" : *");
		this.jLabelinteresTarjetaCredito.setToolTipText("Interes");
		this.jLabelinteresTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinteresTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelinteresTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelinteresTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelinteresTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelinteresTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_INTERES);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelinteresTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jTextFieldinteresTarjetaCredito= new JTextFieldMe();
		jTextFieldinteresTarjetaCredito.setEnabled(false);
		jTextFieldinteresTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinteresTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldinteresTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldinteresTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldinteresTarjetaCredito.setText("0.0");

		this.jButtoninteresTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtoninteresTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninteresTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoninteresTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoninteresTarjetaCreditoBusqueda.setText("U");
		this.jButtoninteresTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoninteresTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoninteresTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldinteresTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldinteresTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"interesTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoninteresTarjetaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelmonto_minimoTarjetaCredito = new JLabelMe();
		this.jLabelmonto_minimoTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_MONTOMINIMO+" : *");
		this.jLabelmonto_minimoTarjetaCredito.setToolTipText("Monto Minimo");
		this.jLabelmonto_minimoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_minimoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmonto_minimoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_minimoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_minimoTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_minimoTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_MONTOMINIMO);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelmonto_minimoTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jTextFieldmonto_minimoTarjetaCredito= new JTextFieldMe();
		jTextFieldmonto_minimoTarjetaCredito.setEnabled(false);
		jTextFieldmonto_minimoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_minimoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_minimoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_minimoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_minimoTarjetaCredito.setText("0.0");

		this.jButtonmonto_minimoTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonmonto_minimoTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_minimoTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_minimoTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_minimoTarjetaCreditoBusqueda.setText("U");
		this.jButtonmonto_minimoTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_minimoTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_minimoTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_minimoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_minimoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_minimoTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_minimoTarjetaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_retencionTarjetaCredito = new JLabelMe();
		this.jLabelporcentaje_retencionTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_PORCENTAJERETENCION+" : *");
		this.jLabelporcentaje_retencionTarjetaCredito.setToolTipText("% Retencion");
		this.jLabelporcentaje_retencionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_retencionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_retencionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_retencionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_retencionTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_retencionTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_PORCENTAJERETENCION);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelporcentaje_retencionTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jTextFieldporcentaje_retencionTarjetaCredito= new JTextFieldMe();
		jTextFieldporcentaje_retencionTarjetaCredito.setEnabled(false);
		jTextFieldporcentaje_retencionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_retencionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_retencionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_retencionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_retencionTarjetaCredito.setText("0.0");

		this.jButtonporcentaje_retencionTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonporcentaje_retencionTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_retencionTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_retencionTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_retencionTarjetaCreditoBusqueda.setText("U");
		this.jButtonporcentaje_retencionTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_retencionTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_retencionTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_retencionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_retencionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_retencionTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_retencionTarjetaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelcomision_retencionTarjetaCredito = new JLabelMe();
		this.jLabelcomision_retencionTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_COMISIONRETENCION+" : *");
		this.jLabelcomision_retencionTarjetaCredito.setToolTipText("Comision Retencion");
		this.jLabelcomision_retencionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcomision_retencionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcomision_retencionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcomision_retencionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcomision_retencionTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcomision_retencionTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_COMISIONRETENCION);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelcomision_retencionTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jTextFieldcomision_retencionTarjetaCredito= new JTextFieldMe();
		jTextFieldcomision_retencionTarjetaCredito.setEnabled(false);
		jTextFieldcomision_retencionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcomision_retencionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcomision_retencionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcomision_retencionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcomision_retencionTarjetaCredito.setText("0.0");

		this.jButtoncomision_retencionTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtoncomision_retencionTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncomision_retencionTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncomision_retencionTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncomision_retencionTarjetaCreditoBusqueda.setText("U");
		this.jButtoncomision_retencionTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncomision_retencionTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncomision_retencionTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcomision_retencionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcomision_retencionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"comision_retencionTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncomision_retencionTarjetaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeles_retencion_redondeoTarjetaCredito = new JLabelMe();
		this.jLabeles_retencion_redondeoTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_ESRETENCIONREDONDEO+" : *");
		this.jLabeles_retencion_redondeoTarjetaCredito.setToolTipText("Retencion Redondeo");
		this.jLabeles_retencion_redondeoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_retencion_redondeoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_retencion_redondeoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_retencion_redondeoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_retencion_redondeoTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_retencion_redondeoTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_ESRETENCIONREDONDEO);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPaneles_retencion_redondeoTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jCheckBoxes_retencion_redondeoTarjetaCredito= new JCheckBoxMe();
		jCheckBoxes_retencion_redondeoTarjetaCredito.setEnabled(false);

		jCheckBoxes_retencion_redondeoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_retencion_redondeoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_retencion_redondeoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_retencion_redondeoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_retencion_redondeoTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtones_retencion_redondeoTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_retencion_redondeoTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_retencion_redondeoTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_retencion_redondeoTarjetaCreditoBusqueda.setText("U");
		this.jButtones_retencion_redondeoTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_retencion_redondeoTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_retencion_redondeoTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_retencion_redondeoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_retencion_redondeoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_retencion_redondeoTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_retencion_redondeoTarjetaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeles_pago_banco_redondeoTarjetaCredito = new JLabelMe();
		this.jLabeles_pago_banco_redondeoTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_ESPAGOBANCOREDONDEO+" : *");
		this.jLabeles_pago_banco_redondeoTarjetaCredito.setToolTipText("Pago Banco Redondeo");
		this.jLabeles_pago_banco_redondeoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_pago_banco_redondeoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_pago_banco_redondeoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_pago_banco_redondeoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_pago_banco_redondeoTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_pago_banco_redondeoTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_ESPAGOBANCOREDONDEO);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPaneles_pago_banco_redondeoTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jCheckBoxes_pago_banco_redondeoTarjetaCredito= new JCheckBoxMe();
		jCheckBoxes_pago_banco_redondeoTarjetaCredito.setEnabled(false);

		jCheckBoxes_pago_banco_redondeoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_pago_banco_redondeoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_pago_banco_redondeoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_pago_banco_redondeoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_pago_banco_redondeoTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtones_pago_banco_redondeoTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_pago_banco_redondeoTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_pago_banco_redondeoTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_pago_banco_redondeoTarjetaCreditoBusqueda.setText("U");
		this.jButtones_pago_banco_redondeoTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_pago_banco_redondeoTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_pago_banco_redondeoTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_pago_banco_redondeoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_pago_banco_redondeoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_pago_banco_redondeoTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_pago_banco_redondeoTarjetaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeles_comision_redondeoTarjetaCredito = new JLabelMe();
		this.jLabeles_comision_redondeoTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_ESCOMISIONREDONDEO+" : *");
		this.jLabeles_comision_redondeoTarjetaCredito.setToolTipText("Comision Redondeo");
		this.jLabeles_comision_redondeoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_comision_redondeoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_comision_redondeoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_comision_redondeoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_comision_redondeoTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_comision_redondeoTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_ESCOMISIONREDONDEO);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPaneles_comision_redondeoTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jCheckBoxes_comision_redondeoTarjetaCredito= new JCheckBoxMe();
		jCheckBoxes_comision_redondeoTarjetaCredito.setEnabled(false);

		jCheckBoxes_comision_redondeoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_comision_redondeoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_comision_redondeoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_comision_redondeoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_comision_redondeoTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtones_comision_redondeoTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_comision_redondeoTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_comision_redondeoTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_comision_redondeoTarjetaCreditoBusqueda.setText("U");
		this.jButtones_comision_redondeoTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_comision_redondeoTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_comision_redondeoTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_comision_redondeoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_comision_redondeoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_comision_redondeoTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_comision_redondeoTarjetaCreditoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTarjetaCredito() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTarjetaCredito = new JLabelMe();
		this.jLabelid_empresaTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTarjetaCredito.setToolTipText("Empresa");
		this.jLabelid_empresaTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelid_empresaTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jComboBoxid_empresaTarjetaCredito= new JComboBoxMe();
		jComboBoxid_empresaTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTarjetaCredito.setEnabled(false);

		this.jButtonid_empresaTarjetaCredito= new JButtonMe();
		this.jButtonid_empresaTarjetaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTarjetaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTarjetaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTarjetaCredito.setText("Buscar");
		this.jButtonid_empresaTarjetaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTarjetaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTarjetaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTarjetaCredito"));

		this.jButtonid_empresaTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonid_empresaTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTarjetaCreditoBusqueda.setText("U");
		this.jButtonid_empresaTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTarjetaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTarjetaCreditoUpdate= new JButtonMe();
		this.jButtonid_empresaTarjetaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTarjetaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTarjetaCreditoUpdate.setText("U");
		this.jButtonid_empresaTarjetaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTarjetaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTarjetaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTarjetaCreditoUpdate"));



					
		this.jLabelid_sucursalTarjetaCredito = new JLabelMe();
		this.jLabelid_sucursalTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTarjetaCredito.setToolTipText("Sucursal");
		this.jLabelid_sucursalTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelid_sucursalTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jComboBoxid_sucursalTarjetaCredito= new JComboBoxMe();
		jComboBoxid_sucursalTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTarjetaCredito.setEnabled(false);

		this.jButtonid_sucursalTarjetaCredito= new JButtonMe();
		this.jButtonid_sucursalTarjetaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTarjetaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTarjetaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTarjetaCredito.setText("Buscar");
		this.jButtonid_sucursalTarjetaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTarjetaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTarjetaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTarjetaCredito"));

		this.jButtonid_sucursalTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonid_sucursalTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTarjetaCreditoBusqueda.setText("U");
		this.jButtonid_sucursalTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTarjetaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTarjetaCreditoUpdate= new JButtonMe();
		this.jButtonid_sucursalTarjetaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTarjetaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTarjetaCreditoUpdate.setText("U");
		this.jButtonid_sucursalTarjetaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTarjetaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTarjetaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTarjetaCreditoUpdate"));



					
		this.jLabelid_bancoTarjetaCredito = new JLabelMe();
		this.jLabelid_bancoTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoTarjetaCredito.setToolTipText("Banco");
		this.jLabelid_bancoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelid_bancoTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jComboBoxid_bancoTarjetaCredito= new JComboBoxMe();
		jComboBoxid_bancoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoTarjetaCredito= new JButtonMe();
		this.jButtonid_bancoTarjetaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoTarjetaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoTarjetaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoTarjetaCredito.setText("Buscar");
		this.jButtonid_bancoTarjetaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoTarjetaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoTarjetaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoTarjetaCredito"));

		this.jButtonid_bancoTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonid_bancoTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoTarjetaCreditoBusqueda.setText("U");
		this.jButtonid_bancoTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoTarjetaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_bancoTarjetaCreditoUpdate= new JButtonMe();
		this.jButtonid_bancoTarjetaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoTarjetaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoTarjetaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoTarjetaCreditoUpdate.setText("U");
		this.jButtonid_bancoTarjetaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoTarjetaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoTarjetaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoTarjetaCreditoUpdate"));



					
		this.jLabelid_tipo_retencionTarjetaCredito = new JLabelMe();
		this.jLabelid_tipo_retencionTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_IDTIPORETENCION+" : *");
		this.jLabelid_tipo_retencionTarjetaCredito.setToolTipText("Tipo Retencion");
		this.jLabelid_tipo_retencionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencionTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencionTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_IDTIPORETENCION);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelid_tipo_retencionTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jComboBoxid_tipo_retencionTarjetaCredito= new JComboBoxMe();
		jComboBoxid_tipo_retencionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencionTarjetaCredito= new JButtonMe();
		this.jButtonid_tipo_retencionTarjetaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionTarjetaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionTarjetaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencionTarjetaCredito.setText("Buscar");
		this.jButtonid_tipo_retencionTarjetaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencionTarjetaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionTarjetaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionTarjetaCredito"));

		this.jButtonid_tipo_retencionTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencionTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionTarjetaCreditoBusqueda.setText("U");
		this.jButtonid_tipo_retencionTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencionTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencionTarjetaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencionTarjetaCreditoUpdate= new JButtonMe();
		this.jButtonid_tipo_retencionTarjetaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionTarjetaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencionTarjetaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencionTarjetaCreditoUpdate.setText("U");
		this.jButtonid_tipo_retencionTarjetaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencionTarjetaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencionTarjetaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencionTarjetaCreditoUpdate"));



					
		this.jLabelid_cuenta_contableTarjetaCredito = new JLabelMe();
		this.jLabelid_cuenta_contableTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableTarjetaCredito.setToolTipText("Cta Contable");
		this.jLabelid_cuenta_contableTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contableTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contableTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelid_cuenta_contableTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jComboBoxid_cuenta_contableTarjetaCredito= new JComboBoxMe();
		jComboBoxid_cuenta_contableTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableTarjetaCredito= new JButtonMe();
		this.jButtonid_cuenta_contableTarjetaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTarjetaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTarjetaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTarjetaCredito.setText("Buscar");
		this.jButtonid_cuenta_contableTarjetaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableTarjetaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTarjetaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTarjetaCredito"));

		this.jButtonid_cuenta_contableTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableTarjetaCreditoBusqueda.setText("U");
		this.jButtonid_cuenta_contableTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableTarjetaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableTarjetaCreditoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableTarjetaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTarjetaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTarjetaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableTarjetaCreditoUpdate.setText("U");
		this.jButtonid_cuenta_contableTarjetaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableTarjetaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTarjetaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTarjetaCreditoUpdate"));


		jButtonid_cuenta_contableTarjetaCreditoArbol= new JButtonMe();
		jButtonid_cuenta_contableTarjetaCreditoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTarjetaCreditoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTarjetaCreditoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTarjetaCreditoArbol.setText("Arbol");
		jButtonid_cuenta_contableTarjetaCreditoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableTarjetaCreditoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTarjetaCreditoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTarjetaCreditoArbol"));



					
		this.jLabelid_tipo_retencion_ivaTarjetaCredito = new JLabelMe();
		this.jLabelid_tipo_retencion_ivaTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_IDTIPORETENCIONIVA+" : *");
		this.jLabelid_tipo_retencion_ivaTarjetaCredito.setToolTipText("Tipo Retencion Iva");
		this.jLabelid_tipo_retencion_ivaTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_ivaTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_ivaTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_ivaTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_ivaTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_ivaTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_IDTIPORETENCIONIVA);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelid_tipo_retencion_ivaTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jComboBoxid_tipo_retencion_ivaTarjetaCredito= new JComboBoxMe();
		jComboBoxid_tipo_retencion_ivaTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_ivaTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_ivaTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_ivaTarjetaCredito= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaTarjetaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaTarjetaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaTarjetaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_ivaTarjetaCredito.setText("Buscar");
		this.jButtonid_tipo_retencion_ivaTarjetaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_ivaTarjetaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaTarjetaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_ivaTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaTarjetaCredito"));

		this.jButtonid_tipo_retencion_ivaTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_ivaTarjetaCreditoBusqueda.setText("U");
		this.jButtonid_tipo_retencion_ivaTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_ivaTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_ivaTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_ivaTarjetaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_ivaTarjetaCreditoUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_ivaTarjetaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaTarjetaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_ivaTarjetaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_ivaTarjetaCreditoUpdate.setText("U");
		this.jButtonid_tipo_retencion_ivaTarjetaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_ivaTarjetaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_ivaTarjetaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_ivaTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_ivaTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_ivaTarjetaCreditoUpdate"));



					
		this.jLabelid_cuenta_contable_comisionTarjetaCredito = new JLabelMe();
		this.jLabelid_cuenta_contable_comisionTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_IDCUENTACONTABLECOMISION+" : *");
		this.jLabelid_cuenta_contable_comisionTarjetaCredito.setToolTipText("Cta Contable Comision");
		this.jLabelid_cuenta_contable_comisionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_comisionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_comisionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_comisionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_comisionTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_comisionTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_IDCUENTACONTABLECOMISION);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelid_cuenta_contable_comisionTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jComboBoxid_cuenta_contable_comisionTarjetaCredito= new JComboBoxMe();
		jComboBoxid_cuenta_contable_comisionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_comisionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_comisionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_comisionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_comisionTarjetaCredito= new JButtonMe();
		this.jButtonid_cuenta_contable_comisionTarjetaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_comisionTarjetaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_comisionTarjetaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_comisionTarjetaCredito.setText("Buscar");
		this.jButtonid_cuenta_contable_comisionTarjetaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_comisionTarjetaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_comisionTarjetaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_comisionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_comisionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_comisionTarjetaCredito"));

		this.jButtonid_cuenta_contable_comisionTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_comisionTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_comisionTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_comisionTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_comisionTarjetaCreditoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_comisionTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_comisionTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_comisionTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_comisionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_comisionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_comisionTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_comisionTarjetaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_comisionTarjetaCreditoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_comisionTarjetaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_comisionTarjetaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_comisionTarjetaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_comisionTarjetaCreditoUpdate.setText("U");
		this.jButtonid_cuenta_contable_comisionTarjetaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_comisionTarjetaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_comisionTarjetaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_comisionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_comisionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_comisionTarjetaCreditoUpdate"));


		jButtonid_cuenta_contable_comisionTarjetaCreditoArbol= new JButtonMe();
		jButtonid_cuenta_contable_comisionTarjetaCreditoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_comisionTarjetaCreditoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_comisionTarjetaCreditoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_comisionTarjetaCreditoArbol.setText("Arbol");
		jButtonid_cuenta_contable_comisionTarjetaCreditoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_comisionTarjetaCreditoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_comisionTarjetaCreditoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_comisionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_comisionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_comisionTarjetaCreditoArbol"));



					
		this.jLabelid_formula_pago_bancoTarjetaCredito = new JLabelMe();
		this.jLabelid_formula_pago_bancoTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_IDFORMULAPAGOBANCO+" : *");
		this.jLabelid_formula_pago_bancoTarjetaCredito.setToolTipText("Formula Pago Banco");
		this.jLabelid_formula_pago_bancoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formula_pago_bancoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formula_pago_bancoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formula_pago_bancoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formula_pago_bancoTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formula_pago_bancoTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_IDFORMULAPAGOBANCO);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelid_formula_pago_bancoTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jComboBoxid_formula_pago_bancoTarjetaCredito= new JComboBoxMe();
		jComboBoxid_formula_pago_bancoTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formula_pago_bancoTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formula_pago_bancoTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formula_pago_bancoTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formula_pago_bancoTarjetaCredito= new JButtonMe();
		this.jButtonid_formula_pago_bancoTarjetaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formula_pago_bancoTarjetaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formula_pago_bancoTarjetaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formula_pago_bancoTarjetaCredito.setText("Buscar");
		this.jButtonid_formula_pago_bancoTarjetaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formula_pago_bancoTarjetaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formula_pago_bancoTarjetaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formula_pago_bancoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formula_pago_bancoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formula_pago_bancoTarjetaCredito"));

		this.jButtonid_formula_pago_bancoTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonid_formula_pago_bancoTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formula_pago_bancoTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formula_pago_bancoTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formula_pago_bancoTarjetaCreditoBusqueda.setText("U");
		this.jButtonid_formula_pago_bancoTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formula_pago_bancoTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formula_pago_bancoTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formula_pago_bancoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formula_pago_bancoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formula_pago_bancoTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formula_pago_bancoTarjetaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_formula_pago_bancoTarjetaCreditoUpdate= new JButtonMe();
		this.jButtonid_formula_pago_bancoTarjetaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formula_pago_bancoTarjetaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formula_pago_bancoTarjetaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formula_pago_bancoTarjetaCreditoUpdate.setText("U");
		this.jButtonid_formula_pago_bancoTarjetaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formula_pago_bancoTarjetaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formula_pago_bancoTarjetaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formula_pago_bancoTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formula_pago_bancoTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formula_pago_bancoTarjetaCreditoUpdate"));



					
		this.jLabelid_cuenta_contable_diferenciaTarjetaCredito = new JLabelMe();
		this.jLabelid_cuenta_contable_diferenciaTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_IDCUENTACONTABLEDIFERENCIA+" : *");
		this.jLabelid_cuenta_contable_diferenciaTarjetaCredito.setToolTipText("Cta Contable Diferencia");
		this.jLabelid_cuenta_contable_diferenciaTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_diferenciaTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_diferenciaTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_diferenciaTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_diferenciaTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_diferenciaTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_IDCUENTACONTABLEDIFERENCIA);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelid_cuenta_contable_diferenciaTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jComboBoxid_cuenta_contable_diferenciaTarjetaCredito= new JComboBoxMe();
		jComboBoxid_cuenta_contable_diferenciaTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_diferenciaTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_diferenciaTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_diferenciaTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_diferenciaTarjetaCredito= new JButtonMe();
		this.jButtonid_cuenta_contable_diferenciaTarjetaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_diferenciaTarjetaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_diferenciaTarjetaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_diferenciaTarjetaCredito.setText("Buscar");
		this.jButtonid_cuenta_contable_diferenciaTarjetaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_diferenciaTarjetaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_diferenciaTarjetaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_diferenciaTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_diferenciaTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_diferenciaTarjetaCredito"));

		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoBusqueda.setText("U");
		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_diferenciaTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_diferenciaTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_diferenciaTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoUpdate.setText("U");
		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_diferenciaTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_diferenciaTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_diferenciaTarjetaCreditoUpdate"));


		jButtonid_cuenta_contable_diferenciaTarjetaCreditoArbol= new JButtonMe();
		jButtonid_cuenta_contable_diferenciaTarjetaCreditoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_diferenciaTarjetaCreditoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_diferenciaTarjetaCreditoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_diferenciaTarjetaCreditoArbol.setText("Arbol");
		jButtonid_cuenta_contable_diferenciaTarjetaCreditoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_diferenciaTarjetaCreditoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_diferenciaTarjetaCreditoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_diferenciaTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_diferenciaTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_diferenciaTarjetaCreditoArbol"));



					
		this.jLabelid_formula_retencionTarjetaCredito = new JLabelMe();
		this.jLabelid_formula_retencionTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_IDFORMULARETENCION+" : *");
		this.jLabelid_formula_retencionTarjetaCredito.setToolTipText("Formula Retencion");
		this.jLabelid_formula_retencionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formula_retencionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formula_retencionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formula_retencionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formula_retencionTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formula_retencionTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_IDFORMULARETENCION);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelid_formula_retencionTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jComboBoxid_formula_retencionTarjetaCredito= new JComboBoxMe();
		jComboBoxid_formula_retencionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formula_retencionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formula_retencionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formula_retencionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formula_retencionTarjetaCredito= new JButtonMe();
		this.jButtonid_formula_retencionTarjetaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formula_retencionTarjetaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formula_retencionTarjetaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formula_retencionTarjetaCredito.setText("Buscar");
		this.jButtonid_formula_retencionTarjetaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formula_retencionTarjetaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formula_retencionTarjetaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formula_retencionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formula_retencionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formula_retencionTarjetaCredito"));

		this.jButtonid_formula_retencionTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonid_formula_retencionTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formula_retencionTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formula_retencionTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formula_retencionTarjetaCreditoBusqueda.setText("U");
		this.jButtonid_formula_retencionTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formula_retencionTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formula_retencionTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formula_retencionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formula_retencionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formula_retencionTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formula_retencionTarjetaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_formula_retencionTarjetaCreditoUpdate= new JButtonMe();
		this.jButtonid_formula_retencionTarjetaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formula_retencionTarjetaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formula_retencionTarjetaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formula_retencionTarjetaCreditoUpdate.setText("U");
		this.jButtonid_formula_retencionTarjetaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formula_retencionTarjetaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formula_retencionTarjetaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formula_retencionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formula_retencionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formula_retencionTarjetaCreditoUpdate"));



					
		this.jLabelid_formula_comisionTarjetaCredito = new JLabelMe();
		this.jLabelid_formula_comisionTarjetaCredito.setText(""+TarjetaCreditoConstantesFunciones.LABEL_IDFORMULACOMISION+" : *");
		this.jLabelid_formula_comisionTarjetaCredito.setToolTipText("Formula Comision");
		this.jLabelid_formula_comisionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formula_comisionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_formula_comisionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formula_comisionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formula_comisionTarjetaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formula_comisionTarjetaCredito.setToolTipText(TarjetaCreditoConstantesFunciones.LABEL_IDFORMULACOMISION);
		this.gridaBagLayoutTarjetaCredito = new GridBagLayout();
		this.jPanelid_formula_comisionTarjetaCredito.setLayout(this.gridaBagLayoutTarjetaCredito);


		jComboBoxid_formula_comisionTarjetaCredito= new JComboBoxMe();
		jComboBoxid_formula_comisionTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formula_comisionTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formula_comisionTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formula_comisionTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formula_comisionTarjetaCredito= new JButtonMe();
		this.jButtonid_formula_comisionTarjetaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formula_comisionTarjetaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formula_comisionTarjetaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formula_comisionTarjetaCredito.setText("Buscar");
		this.jButtonid_formula_comisionTarjetaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formula_comisionTarjetaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formula_comisionTarjetaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formula_comisionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formula_comisionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formula_comisionTarjetaCredito"));

		this.jButtonid_formula_comisionTarjetaCreditoBusqueda= new JButtonMe();
		this.jButtonid_formula_comisionTarjetaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formula_comisionTarjetaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formula_comisionTarjetaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formula_comisionTarjetaCreditoBusqueda.setText("U");
		this.jButtonid_formula_comisionTarjetaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formula_comisionTarjetaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formula_comisionTarjetaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formula_comisionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formula_comisionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formula_comisionTarjetaCreditoBusqueda"));

		if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formula_comisionTarjetaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_formula_comisionTarjetaCreditoUpdate= new JButtonMe();
		this.jButtonid_formula_comisionTarjetaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formula_comisionTarjetaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formula_comisionTarjetaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formula_comisionTarjetaCreditoUpdate.setText("U");
		this.jButtonid_formula_comisionTarjetaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formula_comisionTarjetaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formula_comisionTarjetaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formula_comisionTarjetaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formula_comisionTarjetaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formula_comisionTarjetaCreditoUpdate"));



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
		//this.jInternalFrameDetalleTarjetaCredito = new TarjetaCreditoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tarjeta Credito DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTarjetaCredito= new GridBagLayout();
		

		
		String sToolTipTarjetaCredito="";
		sToolTipTarjetaCredito=TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTarjetaCredito+="(PuntoVenta.TarjetaCredito)";
		}
		
		if(!this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTarjetaCredito+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTarjetaCredito = new JButtonMe();
		this.jButtonModificarTarjetaCredito = new JButtonMe();
        this.jButtonActualizarTarjetaCredito = new JButtonMe();
        this.jButtonEliminarTarjetaCredito = new JButtonMe();
        this.jButtonCancelarTarjetaCredito = new JButtonMe();
        this.jButtonGuardarCambiosTarjetaCredito = new JButtonMe();
		this.jButtonGuardarCambiosTablaTarjetaCredito = new JButtonMe();
		this.jButtonCerrarTarjetaCredito = new JButtonMe();
		
		this.jScrollPanelDatosTarjetaCredito = new JScrollPane();   
        this.jScrollPanelDatosEdicionTarjetaCredito = new JScrollPane();
		this.jScrollPanelDatosGeneralTarjetaCredito = new JScrollPane();
				
		
		
		this.jPanelCamposTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		this.jTabbedPaneCamposTarjetaCredito=new JTabbedPane();
		
		
		this.jTabbedPaneCamposTarjetaCredito.setBorder(javax.swing.BorderFactory.createEmptyBorder());//javax.swing.BorderFactory.createTitledBorder("Campos")
		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneCamposTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontableTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Tarjeta Credito";
		
		if(!this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tarjeta Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosTarjetaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTarjetaCredito.setName("jPanelCamposTarjetaCredito"); 

		this.jPanelCamposOcultosTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTarjetaCredito.setName("jPanelCamposOcultosTarjetaCredito"); 

        this.jPanelAccionesTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTarjetaCredito.setToolTipText("Acciones");
        this.jPanelAccionesTarjetaCredito.setName("Acciones"); 

		this.jPanelAccionesFormularioTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTarjetaCredito.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTarjetaCredito.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralTarjetaCredito.setName("jPanelCamposFingeneralTarjetaCredito");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresTarjetaCredito.setName("jPanelCamposFinvaloresTarjetaCredito");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontableTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableTarjetaCredito.setName("jPanelCamposFincontableTarjetaCredito");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTarjetaCredito.setText("Nuevo");
		this.jButtonModificarTarjetaCredito.setText("Editar");
        this.jButtonActualizarTarjetaCredito.setText("Actualizar");
        this.jButtonEliminarTarjetaCredito.setText("Eliminar");
        this.jButtonCancelarTarjetaCredito.setText("Cancelar");
        this.jButtonGuardarCambiosTarjetaCredito.setText("Guardar");
		this.jButtonGuardarCambiosTablaTarjetaCredito.setText("Guardar");
		this.jButtonCerrarTarjetaCredito.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTarjetaCredito,"nuevo_button","Nuevo",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTarjetaCredito,"modificar_button","Editar",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTarjetaCredito,"actualizar_button","Actualizar",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTarjetaCredito,"eliminar_button","Eliminar",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTarjetaCredito,"cancelar_button","Cancelar",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTarjetaCredito,"guardarcambios_button","Guardar",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTarjetaCredito,"guardarcambiostabla_button","Guardar",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTarjetaCredito,"cerrar_button","Salir",this.tarjetacreditoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTarjetaCredito.setToolTipText("Nuevo"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTarjetaCredito.setToolTipText("Editar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTarjetaCredito.setToolTipText("Actualizar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTarjetaCredito.setToolTipText("Eliminar)"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTarjetaCredito.setToolTipText("Cancelar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTarjetaCredito.setToolTipText("Guardar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTarjetaCredito.setToolTipText("Guardar"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTarjetaCredito.setToolTipText("Salir"+" "+TarjetaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTarjetaCredito";
		inputMap = this.jButtonNuevoTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTarjetaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTarjetaCredito"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTarjetaCredito";
		inputMap = this.jButtonActualizarTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTarjetaCredito"));
		
		//ELIMINAR
		sMapKey = "EliminarTarjetaCredito";
		inputMap = this.jButtonEliminarTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTarjetaCredito"));
		
		//CANCELAR	
		sMapKey = "CancelarTarjetaCredito";
		inputMap = this.jButtonCancelarTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTarjetaCredito"));
		
		//CERRAR		
		sMapKey = "CerrarTarjetaCredito";
		inputMap = this.jButtonCerrarTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTarjetaCredito"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTarjetaCredito";
		inputMap = this.jButtonGuardarCambiosTablaTarjetaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTarjetaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTarjetaCredito"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTarjetaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTarjetaCredito.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTarjetaCredito.setToolTipText("Nuevo TarjetaCredito");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTarjetaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTarjetaCredito.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTarjetaCredito.setToolTipText("Sin Cerrar Ventana TarjetaCredito");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTarjetaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTarjetaCredito.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTarjetaCredito.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTarjetaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTarjetaCredito.setText("Accion");
		this.jComboBoxTiposAccionesTarjetaCredito.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTarjetaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTarjetaCredito.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTarjetaCredito.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTarjetaCredito = new JLabelMe();
		
		this.jLabelAccionesTarjetaCredito.setText("Acciones");		
		this.jLabelAccionesTarjetaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTarjetaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTarjetaCredito();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTarjetaCredito();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTarjetaCredito=new JTabbedPane();
		this.jTabbedPaneRelacionesTarjetaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTarjetaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTarjetaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTarjetaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTarjetaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTarjetaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTarjetaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTarjetaCredito.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTarjetaCredito, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTarjetaCredito = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTarjetaCredito = new GridBagLayout();
		
		this.jPanelCamposTarjetaCredito.setLayout(gridaBagLayoutCamposTarjetaCredito);
		this.jPanelCamposOcultosTarjetaCredito.setLayout(gridaBagLayoutCamposOcultosTarjetaCredito);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralTarjetaCredito= new GridBagLayout();
		this.jPanelCamposIniciogeneralTarjetaCredito.setLayout(gridaBagLayoutCamposIniciogeneralTarjetaCredito);

		GridBagLayout gridaBagLayoutCamposIniciovaloresTarjetaCredito= new GridBagLayout();
		this.jPanelCamposIniciovaloresTarjetaCredito.setLayout(gridaBagLayoutCamposIniciovaloresTarjetaCredito);

		GridBagLayout gridaBagLayoutCamposIniciocontableTarjetaCredito= new GridBagLayout();
		this.jPanelCamposIniciocontableTarjetaCredito.setLayout(gridaBagLayoutCamposIniciocontableTarjetaCredito);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTarjetaCredito.add(jLabelIdTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTarjetaCredito.add(jLabelidTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTarjetaCredito.add(jLabelid_empresaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTarjetaCredito.add(jButtonid_empresaTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 3;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTarjetaCredito.add(jButtonid_empresaTarjetaCreditoUpdate, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTarjetaCredito.add(jComboBoxid_empresaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalTarjetaCredito.add(jLabelid_sucursalTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTarjetaCredito.add(jButtonid_sucursalTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 3;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTarjetaCredito.add(jButtonid_sucursalTarjetaCreditoUpdate, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalTarjetaCredito.add(jComboBoxid_sucursalTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoTarjetaCredito.add(jLabelid_bancoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoTarjetaCredito.add(jButtonid_bancoTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 3;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoTarjetaCredito.add(jButtonid_bancoTarjetaCreditoUpdate, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoTarjetaCredito.add(jComboBoxid_bancoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTarjetaCredito.add(jLabelcodigoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTarjetaCredito.add(jButtoncodigoTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTarjetaCredito.add(jTextFieldcodigoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTarjetaCredito.add(jLabelnombreTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTarjetaCredito.add(jButtonnombreTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTarjetaCredito.add(jscrollPanenombreTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_cortoTarjetaCredito.add(jLabelnombre_cortoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_cortoTarjetaCredito.add(jButtonnombre_cortoTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_cortoTarjetaCredito.add(jTextFieldnombre_cortoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldigito_validoTarjetaCredito.add(jLabeldigito_validoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneldigito_validoTarjetaCredito.add(jButtondigito_validoTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldigito_validoTarjetaCredito.add(jTextFielddigito_validoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldigito_tarjetaTarjetaCredito.add(jLabeldigito_tarjetaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneldigito_tarjetaTarjetaCredito.add(jButtondigito_tarjetaTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldigito_tarjetaTarjetaCredito.add(jTextFielddigito_tarjetaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcomisionTarjetaCredito.add(jLabelcomisionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelcomisionTarjetaCredito.add(jButtoncomisionTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcomisionTarjetaCredito.add(jTextFieldcomisionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelinteresTarjetaCredito.add(jLabelinteresTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelinteresTarjetaCredito.add(jButtoninteresTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelinteresTarjetaCredito.add(jTextFieldinteresTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmonto_minimoTarjetaCredito.add(jLabelmonto_minimoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_minimoTarjetaCredito.add(jButtonmonto_minimoTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmonto_minimoTarjetaCredito.add(jTextFieldmonto_minimoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_retencionTarjetaCredito.add(jLabelporcentaje_retencionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_retencionTarjetaCredito.add(jButtonporcentaje_retencionTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_retencionTarjetaCredito.add(jTextFieldporcentaje_retencionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcomision_retencionTarjetaCredito.add(jLabelcomision_retencionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelcomision_retencionTarjetaCredito.add(jButtoncomision_retencionTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcomision_retencionTarjetaCredito.add(jTextFieldcomision_retencionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_retencion_redondeoTarjetaCredito.add(jLabeles_retencion_redondeoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_retencion_redondeoTarjetaCredito.add(jButtones_retencion_redondeoTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_retencion_redondeoTarjetaCredito.add(jCheckBoxes_retencion_redondeoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_pago_banco_redondeoTarjetaCredito.add(jLabeles_pago_banco_redondeoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_pago_banco_redondeoTarjetaCredito.add(jButtones_pago_banco_redondeoTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_pago_banco_redondeoTarjetaCredito.add(jCheckBoxes_pago_banco_redondeoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_comision_redondeoTarjetaCredito.add(jLabeles_comision_redondeoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_comision_redondeoTarjetaCredito.add(jButtones_comision_redondeoTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_comision_redondeoTarjetaCredito.add(jCheckBoxes_comision_redondeoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencionTarjetaCredito.add(jLabelid_tipo_retencionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionTarjetaCredito.add(jButtonid_tipo_retencionTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 3;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencionTarjetaCredito.add(jButtonid_tipo_retencionTarjetaCreditoUpdate, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencionTarjetaCredito.add(jComboBoxid_tipo_retencionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableTarjetaCredito.add(jLabelid_cuenta_contableTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableTarjetaCredito.add(jButtonid_cuenta_contableTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 3;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableTarjetaCredito.add(jButtonid_cuenta_contableTarjetaCreditoUpdate, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableTarjetaCredito.add(jComboBoxid_cuenta_contableTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_ivaTarjetaCredito.add(jLabelid_tipo_retencion_ivaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_ivaTarjetaCredito.add(jButtonid_tipo_retencion_ivaTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 3;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_ivaTarjetaCredito.add(jButtonid_tipo_retencion_ivaTarjetaCreditoUpdate, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_ivaTarjetaCredito.add(jComboBoxid_tipo_retencion_ivaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_comisionTarjetaCredito.add(jLabelid_cuenta_contable_comisionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_comisionTarjetaCredito.add(jButtonid_cuenta_contable_comisionTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 3;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_comisionTarjetaCredito.add(jButtonid_cuenta_contable_comisionTarjetaCreditoUpdate, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_comisionTarjetaCredito.add(jComboBoxid_cuenta_contable_comisionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formula_pago_bancoTarjetaCredito.add(jLabelid_formula_pago_bancoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formula_pago_bancoTarjetaCredito.add(jButtonid_formula_pago_bancoTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 3;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formula_pago_bancoTarjetaCredito.add(jButtonid_formula_pago_bancoTarjetaCreditoUpdate, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formula_pago_bancoTarjetaCredito.add(jComboBoxid_formula_pago_bancoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_diferenciaTarjetaCredito.add(jLabelid_cuenta_contable_diferenciaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_diferenciaTarjetaCredito.add(jButtonid_cuenta_contable_diferenciaTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 3;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_diferenciaTarjetaCredito.add(jButtonid_cuenta_contable_diferenciaTarjetaCreditoUpdate, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_diferenciaTarjetaCredito.add(jComboBoxid_cuenta_contable_diferenciaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formula_retencionTarjetaCredito.add(jLabelid_formula_retencionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formula_retencionTarjetaCredito.add(jButtonid_formula_retencionTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 3;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formula_retencionTarjetaCredito.add(jButtonid_formula_retencionTarjetaCreditoUpdate, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formula_retencionTarjetaCredito.add(jComboBoxid_formula_retencionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 0;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formula_comisionTarjetaCredito.add(jLabelid_formula_comisionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 2;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formula_comisionTarjetaCredito.add(jButtonid_formula_comisionTarjetaCreditoBusqueda, this.gridBagConstraintsTarjetaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		//this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = 3;
		this.gridBagConstraintsTarjetaCredito.ipadx = 0;
		this.gridBagConstraintsTarjetaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formula_comisionTarjetaCredito.add(jButtonid_formula_comisionTarjetaCreditoUpdate, this.gridBagConstraintsTarjetaCredito);
	}

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTarjetaCredito.gridy = 0;
	this.gridBagConstraintsTarjetaCredito.gridx = 1;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formula_comisionTarjetaCredito.add(jComboBoxid_formula_comisionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposOcultosTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposOcultosTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTarjetaCredito.add(this.jPanelid_empresaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposOcultosTarjetaCredito % 2==0) {
		iXPanelCamposOcultosTarjetaCredito=0;
		iYPanelCamposOcultosTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposOcultosTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposOcultosTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTarjetaCredito.add(this.jPanelid_sucursalTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposOcultosTarjetaCredito % 2==0) {
		iXPanelCamposOcultosTarjetaCredito=0;
		iYPanelCamposOcultosTarjetaCredito++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciogeneralTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciogeneralTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTarjetaCredito.add(this.jPanelidTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciogeneralTarjetaCredito % 2==0) {
		iXPanelCamposIniciogeneralTarjetaCredito=0;
		iYPanelCamposIniciogeneralTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciogeneralTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciogeneralTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTarjetaCredito.add(this.jPanelid_bancoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciogeneralTarjetaCredito % 2==0) {
		iXPanelCamposIniciogeneralTarjetaCredito=0;
		iYPanelCamposIniciogeneralTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciogeneralTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciogeneralTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTarjetaCredito.add(this.jPanelcodigoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciogeneralTarjetaCredito % 2==0) {
		iXPanelCamposIniciogeneralTarjetaCredito=0;
		iYPanelCamposIniciogeneralTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciogeneralTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciogeneralTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTarjetaCredito.add(this.jPanelnombreTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciogeneralTarjetaCredito % 2==0) {
		iXPanelCamposIniciogeneralTarjetaCredito=0;
		iYPanelCamposIniciogeneralTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciogeneralTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciogeneralTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTarjetaCredito.add(this.jPanelnombre_cortoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciogeneralTarjetaCredito % 2==0) {
		iXPanelCamposIniciogeneralTarjetaCredito=0;
		iYPanelCamposIniciogeneralTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciogeneralTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciogeneralTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTarjetaCredito.add(this.jPaneldigito_validoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciogeneralTarjetaCredito % 2==0) {
		iXPanelCamposIniciogeneralTarjetaCredito=0;
		iYPanelCamposIniciogeneralTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciogeneralTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciogeneralTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralTarjetaCredito.add(this.jPaneldigito_tarjetaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciogeneralTarjetaCredito % 2==0) {
		iXPanelCamposIniciogeneralTarjetaCredito=0;
		iYPanelCamposIniciogeneralTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciovaloresTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciovaloresTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresTarjetaCredito.add(this.jPanelcomisionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciovaloresTarjetaCredito % 2==0) {
		iXPanelCamposIniciovaloresTarjetaCredito=0;
		iYPanelCamposIniciovaloresTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciovaloresTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciovaloresTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresTarjetaCredito.add(this.jPanelinteresTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciovaloresTarjetaCredito % 2==0) {
		iXPanelCamposIniciovaloresTarjetaCredito=0;
		iYPanelCamposIniciovaloresTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciovaloresTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciovaloresTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresTarjetaCredito.add(this.jPanelmonto_minimoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciovaloresTarjetaCredito % 2==0) {
		iXPanelCamposIniciovaloresTarjetaCredito=0;
		iYPanelCamposIniciovaloresTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciovaloresTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciovaloresTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresTarjetaCredito.add(this.jPanelporcentaje_retencionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciovaloresTarjetaCredito % 2==0) {
		iXPanelCamposIniciovaloresTarjetaCredito=0;
		iYPanelCamposIniciovaloresTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciovaloresTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciovaloresTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresTarjetaCredito.add(this.jPanelcomision_retencionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciovaloresTarjetaCredito % 2==0) {
		iXPanelCamposIniciovaloresTarjetaCredito=0;
		iYPanelCamposIniciovaloresTarjetaCredito++;
	}

	iXPanelCamposIniciovaloresTarjetaCredito=0;
	iYPanelCamposIniciovaloresTarjetaCredito++;

	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciovaloresTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciovaloresTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresTarjetaCredito.add(this.jPaneles_retencion_redondeoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciovaloresTarjetaCredito % 2==0) {
		iXPanelCamposIniciovaloresTarjetaCredito=0;
		iYPanelCamposIniciovaloresTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciovaloresTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciovaloresTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresTarjetaCredito.add(this.jPaneles_pago_banco_redondeoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciovaloresTarjetaCredito % 2==0) {
		iXPanelCamposIniciovaloresTarjetaCredito=0;
		iYPanelCamposIniciovaloresTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciovaloresTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciovaloresTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresTarjetaCredito.add(this.jPaneles_comision_redondeoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciovaloresTarjetaCredito % 2==0) {
		iXPanelCamposIniciovaloresTarjetaCredito=0;
		iYPanelCamposIniciovaloresTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciocontableTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciocontableTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableTarjetaCredito.add(this.jPanelid_tipo_retencionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciocontableTarjetaCredito % 2==0) {
		iXPanelCamposIniciocontableTarjetaCredito=0;
		iYPanelCamposIniciocontableTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciocontableTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciocontableTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableTarjetaCredito.add(this.jPanelid_cuenta_contableTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciocontableTarjetaCredito % 2==0) {
		iXPanelCamposIniciocontableTarjetaCredito=0;
		iYPanelCamposIniciocontableTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciocontableTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciocontableTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableTarjetaCredito.add(this.jPanelid_tipo_retencion_ivaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciocontableTarjetaCredito % 2==0) {
		iXPanelCamposIniciocontableTarjetaCredito=0;
		iYPanelCamposIniciocontableTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciocontableTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciocontableTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableTarjetaCredito.add(this.jPanelid_cuenta_contable_comisionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciocontableTarjetaCredito % 2==0) {
		iXPanelCamposIniciocontableTarjetaCredito=0;
		iYPanelCamposIniciocontableTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciocontableTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciocontableTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableTarjetaCredito.add(this.jPanelid_formula_pago_bancoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciocontableTarjetaCredito % 2==0) {
		iXPanelCamposIniciocontableTarjetaCredito=0;
		iYPanelCamposIniciocontableTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciocontableTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciocontableTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableTarjetaCredito.add(this.jPanelid_cuenta_contable_diferenciaTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciocontableTarjetaCredito % 2==0) {
		iXPanelCamposIniciocontableTarjetaCredito=0;
		iYPanelCamposIniciocontableTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciocontableTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciocontableTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableTarjetaCredito.add(this.jPanelid_formula_retencionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciocontableTarjetaCredito % 2==0) {
		iXPanelCamposIniciocontableTarjetaCredito=0;
		iYPanelCamposIniciocontableTarjetaCredito++;
	}
	this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTarjetaCredito.gridy = iYPanelCamposIniciocontableTarjetaCredito;
	this.gridBagConstraintsTarjetaCredito.gridx = iXPanelCamposIniciocontableTarjetaCredito++;
	this.gridBagConstraintsTarjetaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTarjetaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableTarjetaCredito.add(this.jPanelid_formula_comisionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);



	if(iXPanelCamposIniciocontableTarjetaCredito % 2==0) {
		iXPanelCamposIniciocontableTarjetaCredito=0;
		iYPanelCamposIniciocontableTarjetaCredito++;
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
			
		GridBagLayout gridaBagLayoutAccionesTarjetaCredito= new GridBagLayout();
		this.jPanelAccionesTarjetaCredito.setLayout(gridaBagLayoutAccionesTarjetaCredito);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTarjetaCredito= new GridBagLayout();
		this.jPanelAccionesFormularioTarjetaCredito.setLayout(gridaBagLayoutAccionesFormularioTarjetaCredito);
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTarjetaCredito.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTarjetaCredito.add(this.jComboBoxTiposAccionesFormularioTarjetaCredito, this.gridBagConstraintsTarjetaCredito);

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTarjetaCredito.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTarjetaCredito.add(this.jCheckBoxPostAccionNuevoTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tarjetacreditoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTarjetaCredito.add(this.jCheckBoxPostAccionSinCerrarTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tarjetacreditoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tarjetacreditoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTarjetaCredito.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTarjetaCredito.add(this.jCheckBoxPostAccionSinMensajeTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccion++;
			
		this.jPanelAccionesTarjetaCredito.add(this.jButtonModificarTarjetaCredito, this.gridBagConstraintsTarjetaCredito);							

		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTarjetaCredito.gridy = 0;
		this.gridBagConstraintsTarjetaCredito.gridx =iPosXAccion++;
			
		this.jPanelAccionesTarjetaCredito.add(this.jButtonEliminarTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
			
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy = 0;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccion++;
		
		this.jPanelAccionesTarjetaCredito.add(this.jButtonActualizarTarjetaCredito, this.gridBagConstraintsTarjetaCredito);


		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy = 0;		
		this.gridBagConstraintsTarjetaCredito.gridx = iPosXAccion++;
		
		this.jPanelAccionesTarjetaCredito.add(this.jButtonGuardarCambiosTarjetaCredito, this.gridBagConstraintsTarjetaCredito);	
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy = 0;		
		this.gridBagConstraintsTarjetaCredito.gridx =iPosXAccion++;
		
		this.jPanelAccionesTarjetaCredito.add(this.jButtonCancelarTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTarjetaCredito = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTarjetaCredito);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();						
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTarjetaCredito.gridx = 0;		
			//this.gridBagConstraintsTarjetaCredito.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTarjetaCredito.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTarjetaCredito.gridx =0;
		this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTarjetaCredito.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TarjetaCreditoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTarjetaCredito = new TarjetaCreditoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tarjeta Credito DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tarjeta Credito DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tarjeta Credito Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TarjetaCreditoModel tarjetacreditoModel=new TarjetaCreditoModel(this);
			
			//SI USARA CLASE INTERNA
			//TarjetaCreditoModel.TarjetaCreditoFocusTraversalPolicy tarjetacreditoFocusTraversalPolicy = tarjetacreditoModel.new TarjetaCreditoFocusTraversalPolicy(this);
			
			//tarjetacreditoFocusTraversalPolicy.settarjetacreditoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tarjetacreditoModel);
			
			
			this.jContentPaneDetalleTarjetaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTarjetaCredito = new GridBagLayout();	
			this.jContentPaneDetalleTarjetaCredito.setLayout(gridaBagLayoutDetalleTarjetaCredito);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTarjetaCredito = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
				this.gridBagConstraintsTarjetaCredito.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTarjetaCredito.gridx = 0;
					
				
				this.jContentPaneDetalleTarjetaCredito.add(jTtoolBarDetalleTarjetaCredito, gridBagConstraintsTarjetaCredito);								
				
}
			
			this.jScrollPanelDatosEdicionTarjetaCredito=   new JScrollPane(jContentPaneDetalleTarjetaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTarjetaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTarjetaCredito=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTarjetaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTarjetaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			
			
			
			
			
		this.jTabbedPaneCamposTarjetaCredito.add("General",this.jPanelCamposIniciogeneralTarjetaCredito);
		this.jTabbedPaneCamposTarjetaCredito.add("Valores",this.jPanelCamposIniciovaloresTarjetaCredito);
		this.jTabbedPaneCamposTarjetaCredito.add("Contable",this.jPanelCamposIniciocontableTarjetaCredito);
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
						
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTarjetaCredito.gridx = 0;
	        
			this.jContentPaneDetalleTarjetaCredito.add(jTabbedPaneCamposTarjetaCredito, gridBagConstraintsTarjetaCredito);
			
			
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
						&& tarjetacreditoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(this.puedeCargarPorParteFormaPagoPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTarjetaCreditoConexion(this.puedeCargarPorParteTarjetaCreditoConexion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTarjetaCreditoDescuento(this.puedeCargarPorParteTarjetaCreditoDescuento,false,-1);
					
					if(this.tarjetacreditoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTarjetaCredito= new GridBagConstraints();
						this.gridBagConstraintsTarjetaCredito.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTarjetaCredito.gridx = 0;
						this.jContentPaneDetalleTarjetaCredito.add(this.jTabbedPaneRelacionesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTarjetaCredito.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTarjetaCreditoConexion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTarjetaCreditoDescuento(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTarjetaCredito.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
					this.gridBagConstraintsTarjetaCredito.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTarjetaCredito.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTarjetaCredito.gridx = 0;
					
				
					this.jContentPaneDetalleTarjetaCredito.add(jPanelCamposOcultosTarjetaCredito, gridBagConstraintsTarjetaCredito);
				
					this.jPanelCamposOcultosTarjetaCredito.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsTarjetaCredito.gridx = 0;
	        this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTarjetaCredito.add(this.jPanelAccionesFormularioTarjetaCredito, this.gridBagConstraintsTarjetaCredito);							
			
			
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
	        this.gridBagConstraintsTarjetaCredito.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsTarjetaCredito.gridx = 0;
	        
			
			this.jContentPaneDetalleTarjetaCredito.add(this.jPanelAccionesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTarjetaCredito);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTarjetaCredito=   new JScrollPane(this.jPanelCamposTarjetaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTarjetaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTarjetaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTarjetaCredito.gridx = 0;
			this.gridBagConstraintsTarjetaCredito.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTarjetaCredito.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTarjetaCredito.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTarjetaCredito.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTarjetaCredito, this.gridBagConstraintsTarjetaCredito);			
			
			this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
			this.gridBagConstraintsTarjetaCredito.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTarjetaCredito.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
			
			
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		
			
		this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
		this.gridBagConstraintsTarjetaCredito.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTarjetaCredito.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTarjetaCredito, this.gridBagConstraintsTarjetaCredito);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTarjetaCredito;//jContentPane;
		
		return jScrollPanelDatosEdicionTarjetaCredito;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		this.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
		this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formapagopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {

				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formapagopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formapagopuntoventaBeanSwingJInternalFrame.setformapagopuntoventaSessionBean(this.formapagopuntoventaSessionBean);

				//this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
				//this.gridBagConstraintsTarjetaCredito.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTarjetaCredito.gridx = 0;
				//this.jContentPaneDetalleTarjetaCredito.add(this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTarjetaCredito);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTarjetaCredito.add("Forma Pagoes",this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTarjetaCredito.setComponentAt(iIndexTab,this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormaPagoPuntoVenta) {
					this.jTabbedPaneRelacionesTarjetaCredito.add("Forma Pagoes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTarjetaCreditoConexion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tarjetacreditoconexionSessionBean=new TarjetaCreditoConexionSessionBean();
		this.tarjetacreditoconexionSessionBean.setConGuardarRelaciones(false);
		this.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(true);

		this.tarjetacreditoconexionBeanSwingJInternalFrame=null;//new TarjetaCreditoConexionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tarjetacreditoconexionBeanSwingJInternalFramePopup=new TarjetaCreditoConexionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tarjetacreditoconexionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {

				TarjetaCreditoConexionJInternalFrame.STIPO_TAMANIO_GENERAL=TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;
				TarjetaCreditoConexionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(true);

				this.tarjetacreditoconexionBeanSwingJInternalFrame=new TarjetaCreditoConexionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tarjetacreditoconexionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tarjetacreditoconexionBeanSwingJInternalFrame.settarjetacreditoconexionSessionBean(this.tarjetacreditoconexionSessionBean);

				//this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
				//this.gridBagConstraintsTarjetaCredito.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTarjetaCredito.gridx = 0;
				//this.jContentPaneDetalleTarjetaCredito.add(this.tarjetacreditoconexionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTarjetaCredito);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTarjetaCredito.add("Tarjeta Credito Conexiones",this.tarjetacreditoconexionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTarjetaCredito.setComponentAt(iIndexTab,this.tarjetacreditoconexionBeanSwingJInternalFrame.getContentPane());
				}

				//TarjetaCreditoConexionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tarjetacreditoconexionSessionBean.setEsGuardarRelacionado(false);
				this.tarjetacreditoconexionBeanSwingJInternalFrame=null;//new TarjetaCreditoConexionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tarjetacreditoconexionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTarjetaCreditoConexion) {
					this.jTabbedPaneRelacionesTarjetaCredito.add("Tarjeta Credito Conexiones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTarjetaCreditoDescuento(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tarjetacreditodescuentoSessionBean=new TarjetaCreditoDescuentoSessionBean();
		this.tarjetacreditodescuentoSessionBean.setConGuardarRelaciones(false);
		this.tarjetacreditodescuentoSessionBean.setEsGuardarRelacionado(true);

		this.tarjetacreditodescuentoBeanSwingJInternalFrame=null;//new TarjetaCreditoDescuentoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tarjetacreditodescuentoBeanSwingJInternalFramePopup=new TarjetaCreditoDescuentoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tarjetacreditodescuentoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {

				TarjetaCreditoDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL=TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;
				TarjetaCreditoDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tarjetacreditodescuentoSessionBean.setEsGuardarRelacionado(true);

				this.tarjetacreditodescuentoBeanSwingJInternalFrame=new TarjetaCreditoDescuentoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tarjetacreditodescuentoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tarjetacreditodescuentoBeanSwingJInternalFrame.settarjetacreditodescuentoSessionBean(this.tarjetacreditodescuentoSessionBean);

				//this.gridBagConstraintsTarjetaCredito = new GridBagConstraints();
				//this.gridBagConstraintsTarjetaCredito.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTarjetaCredito.gridx = 0;
				//this.jContentPaneDetalleTarjetaCredito.add(this.tarjetacreditodescuentoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTarjetaCredito);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTarjetaCredito.add("Tarjeta Credito Descuentos",this.tarjetacreditodescuentoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTarjetaCredito.setComponentAt(iIndexTab,this.tarjetacreditodescuentoBeanSwingJInternalFrame.getContentPane());
				}

				//TarjetaCreditoDescuentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tarjetacreditodescuentoSessionBean.setEsGuardarRelacionado(false);
				this.tarjetacreditodescuentoBeanSwingJInternalFrame=null;//new TarjetaCreditoDescuentoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tarjetacreditodescuentoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTarjetaCreditoDescuento) {
					this.jTabbedPaneRelacionesTarjetaCredito.add("Tarjeta Credito Descuentos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTarjetaCreditoConexionBeanSwingJInternalFrame(List<TarjetaCredito> tarjetacreditos,TarjetaCredito tarjetacredito,TarjetaCreditoConexionBeanSwingJInternalFrame tarjetacreditoconexionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tarjetacreditoconexionBeanSwingJInternalFrame=new TarjetaCreditoConexionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tarjetacreditoconexionBeanSwingJInternalFrame.getTarjetaCreditoConexionLogic().setConnexion(this.tarjetacreditoLogic.getConnexion());

					tarjetacreditoconexionBeanSwingJInternalFrame.settarjetacreditosForeignKey(tarjetacreditos);
					tarjetacreditoconexionBeanSwingJInternalFrame.settarjetacreditoForeignKey(tarjetacredito);
					tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionSessionBean.setisBusquedaDesdeForeignKeySesionTarjetaCredito(true);
					tarjetacreditoconexionBeanSwingJInternalFrame.tarjetacreditoconexionSessionBean.setlidTarjetaCreditoActual(tarjetacredito.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tarjetacreditoconexionBeanSwingJInternalFrame.cargarCombosForeignKeyTarjetaCreditoConexion(tarjetacreditoconexionBeanSwingJInternalFrame.isCargarCombosDependencia);
					tarjetacreditoconexionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTarjetaCredito(true);
					tarjetacreditoconexionBeanSwingJInternalFrame.setid_tarjeta_creditoFK_IdTarjetaCredito(tarjetacredito.getId());

					if(!this.conCargarFormDetalle) {
						tarjetacreditoconexionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tarjetacreditoconexionBeanSwingJInternalFrame.setSelectedItemCombosFrameTarjetaCreditoForeignKey(tarjetacredito,1,false,true,true);
					tarjetacreditoconexionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tarjetacreditoconexionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTarjetaCredito");
					tarjetacreditoconexionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTarjetaCredito");
					tarjetacreditoconexionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCreditoConexion(true);
					tarjetacreditoconexionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTarjetaCreditoConexion("n",tarjetacreditoconexionBeanSwingJInternalFrame.isGuardarCambiosEnLote, tarjetacreditoconexionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tarjetacreditoconexionBeanSwingJInternalFrame.setAutoscrolls(true);
					tarjetacreditoconexionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tarjetacreditoconexionBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCreditoConexion("relacionado");
					} else {
						tarjetacreditoconexionBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCreditoConexion("no_relacionado");
					}

					tarjetacreditoconexionBeanSwingJInternalFrame.getjButtonRecargarInformacionTarjetaCreditoConexion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTarjetaCreditoDescuentoBeanSwingJInternalFrame(List<TarjetaCredito> tarjetacreditos,TarjetaCredito tarjetacredito,TarjetaCreditoDescuentoBeanSwingJInternalFrame tarjetacreditodescuentoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tarjetacreditodescuentoBeanSwingJInternalFrame=new TarjetaCreditoDescuentoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tarjetacreditodescuentoBeanSwingJInternalFrame.getTarjetaCreditoDescuentoLogic().setConnexion(this.tarjetacreditoLogic.getConnexion());

					tarjetacreditodescuentoBeanSwingJInternalFrame.settarjetacreditosForeignKey(tarjetacreditos);
					tarjetacreditodescuentoBeanSwingJInternalFrame.settarjetacreditoForeignKey(tarjetacredito);
					tarjetacreditodescuentoBeanSwingJInternalFrame.tarjetacreditodescuentoSessionBean.setisBusquedaDesdeForeignKeySesionTarjetaCredito(true);
					tarjetacreditodescuentoBeanSwingJInternalFrame.tarjetacreditodescuentoSessionBean.setlidTarjetaCreditoActual(tarjetacredito.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tarjetacreditodescuentoBeanSwingJInternalFrame.cargarCombosForeignKeyTarjetaCreditoDescuento(tarjetacreditodescuentoBeanSwingJInternalFrame.isCargarCombosDependencia);
					tarjetacreditodescuentoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTarjetaCredito(true);
					tarjetacreditodescuentoBeanSwingJInternalFrame.setid_tarjeta_creditoFK_IdTarjetaCredito(tarjetacredito.getId());

					if(!this.conCargarFormDetalle) {
						tarjetacreditodescuentoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tarjetacreditodescuentoBeanSwingJInternalFrame.setSelectedItemCombosFrameTarjetaCreditoForeignKey(tarjetacredito,1,false,true,true);
					tarjetacreditodescuentoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tarjetacreditodescuentoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTarjetaCredito");
					tarjetacreditodescuentoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTarjetaCredito");
					tarjetacreditodescuentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCreditoDescuento(true);
					tarjetacreditodescuentoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTarjetaCreditoDescuento("n",tarjetacreditodescuentoBeanSwingJInternalFrame.isGuardarCambiosEnLote, tarjetacreditodescuentoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tarjetacreditodescuentoBeanSwingJInternalFrame.setAutoscrolls(true);
					tarjetacreditodescuentoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tarjetacreditodescuentoBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCreditoDescuento("relacionado");
					} else {
						tarjetacreditodescuentoBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCreditoDescuento("no_relacionado");
					}

					tarjetacreditodescuentoBeanSwingJInternalFrame.getjButtonRecargarInformacionTarjetaCreditoDescuento().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(List<TarjetaCredito> tarjetacreditos,TarjetaCredito tarjetacredito,FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formapagopuntoventaBeanSwingJInternalFrame.getFormaPagoPuntoVentaLogic().setConnexion(this.tarjetacreditoLogic.getConnexion());

					formapagopuntoventaBeanSwingJInternalFrame.settarjetacreditosForeignKey(tarjetacreditos);
					formapagopuntoventaBeanSwingJInternalFrame.settarjetacreditoForeignKey(tarjetacredito);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionTarjetaCredito(true);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setlidTarjetaCreditoActual(tarjetacredito.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formapagopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFormaPagoPuntoVenta(formapagopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formapagopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTarjetaCredito(true);
					formapagopuntoventaBeanSwingJInternalFrame.setid_tarjeta_creditoFK_IdTarjetaCredito(tarjetacredito.getId());

					if(!this.conCargarFormDetalle) {
						formapagopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formapagopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameTarjetaCreditoForeignKey(tarjetacredito,1,false,true,true);
					formapagopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formapagopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTarjetaCredito");
					formapagopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTarjetaCredito");
					formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(true);
					formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormaPagoPuntoVenta("n",formapagopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, formapagopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formapagopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("relacionado");
					} else {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");
					}

					formapagopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionFormaPagoPuntoVenta().setVisible(false);

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
