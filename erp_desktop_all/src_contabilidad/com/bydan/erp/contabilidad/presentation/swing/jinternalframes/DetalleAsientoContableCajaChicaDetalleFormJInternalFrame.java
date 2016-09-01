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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.DetalleAsientoContableCajaChicaConstantesFunciones;

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
public class DetalleAsientoContableCajaChicaDetalleFormJInternalFrame extends DetalleAsientoContableCajaChicaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleAsientoContableCajaChica;
	
	protected JMenuBar jmenuBarDetalleDetalleAsientoContableCajaChica;
	
	protected JMenu jmenuDetalleDetalleAsientoContableCajaChica;
	protected JMenu jmenuDetalleArchivoDetalleAsientoContableCajaChica;
	protected JMenu jmenuDetalleAccionesDetalleAsientoContableCajaChica;
	protected JMenu jmenuDetalleDatosDetalleAsientoContableCajaChica;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleAsientoContableCajaChica;	
	protected GridBagConstraints gridBagConstraintsDetalleAsientoContableCajaChica;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleAsientoContableCajaChicaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleAsientoContableCajaChica;		
	
	
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

	protected AsientoContableCajaChicaBeanSwingJInternalFrame asientocontablecajachicaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontablecajachica="";

	protected TipoGastoEmpresaBeanSwingJInternalFrame tipogastoempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogastoempresa="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";
	
	public DetalleAsientoContableCajaChicaSessionBean detalleasientocontablecajachicaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public AsientoContableCajaChicaSessionBean asientocontablecajachicaSessionBean;
	public TipoGastoEmpresaSessionBean tipogastoempresaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;	
	
	public DetalleAsientoContableCajaChicaLogic detalleasientocontablecajachicaLogic;
	
	public JScrollPane jScrollPanelDatosDetalleAsientoContableCajaChica;
	public JScrollPane jScrollPanelDatosEdicionDetalleAsientoContableCajaChica;
	public JScrollPane jScrollPanelDatosGeneralDetalleAsientoContableCajaChica;
	
	protected JPanel jPanelCamposDetalleAsientoContableCajaChica;    
	protected JPanel jPanelCamposOcultosDetalleAsientoContableCajaChica;    	
	protected JPanel jPanelAccionesDetalleAsientoContableCajaChica;
	protected JPanel jPanelAccionesFormularioDetalleAsientoContableCajaChica;
    
	
	
	protected Integer iXPanelCamposDetalleAsientoContableCajaChica=0;
	protected Integer iYPanelCamposDetalleAsientoContableCajaChica=0;
	
	protected Integer iXPanelCamposOcultosDetalleAsientoContableCajaChica=0;
	protected Integer iYPanelCamposOcultosDetalleAsientoContableCajaChica=0;
	
	

	protected JPanel jPanelCamposIniciogeneralDetalleAsientoContableCajaChica;
	protected Integer iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;
	protected Integer iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;

	protected JPanel jPanelCamposIniciovaloresDetalleAsientoContableCajaChica;
	protected Integer iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
	protected Integer iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleAsientoContableCajaChica;
	public JButton jButtonModificarDetalleAsientoContableCajaChica;
	public JButton jButtonActualizarDetalleAsientoContableCajaChica;
    public JButton jButtonEliminarDetalleAsientoContableCajaChica;
	public JButton jButtonCancelarDetalleAsientoContableCajaChica;
    public JButton jButtonGuardarCambiosDetalleAsientoContableCajaChica;
	public JButton jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica;
	protected JButton jButtonCerrarDetalleAsientoContableCajaChica;
	
	
	protected JButton jButtonProcesarInformacionDetalleAsientoContableCajaChica;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleAsientoContableCajaChica;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleAsientoContableCajaChica;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleAsientoContableCajaChica;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonModificarToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonActualizarToolBarDetalleAsientoContableCajaChica;
    protected JButton jButtonEliminarToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonCancelarToolBarDetalleAsientoContableCajaChica;
    protected JButton jButtonGuardarCambiosToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleAsientoContableCajaChica;
	protected JButton jButtonCerrarToolBarDetalleAsientoContableCajaChica;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleAsientoContableCajaChica;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemModificarDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemActualizarDetalleAsientoContableCajaChica;
    protected JMenuItem jMenuItemEliminarDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemCancelarDetalleAsientoContableCajaChica;
    protected JMenuItem jMenuItemGuardarCambiosDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemCerrarDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleCerrarDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleAsientoContableCajaChica;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleAsientoContableCajaChica;
	protected JMenuItem jMenuItemMostrarOcultarDetalleAsientoContableCajaChica;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleAsientoContableCajaChica;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleAsientoContableCajaChica;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleAsientoContableCajaChica;
	public JLabel jLabelIdDetalleAsientoContableCajaChica;
	public JLabel jLabelidDetalleAsientoContableCajaChica;
	public JButton jButtonidDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionDetalleAsientoContableCajaChica;
	public JLabel jLabelfecha_emisionDetalleAsientoContableCajaChica;
	//public JFormattedTextField jDateChooserfecha_emisionDetalleAsientoContableCajaChica;

	public JDateChooser jDateChooserfecha_emisionDetalleAsientoContableCajaChica;
	public JButton jButtonfecha_emisionDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPaneles_proveedorDetalleAsientoContableCajaChica;
	public JLabel jLabeles_proveedorDetalleAsientoContableCajaChica;
	public JCheckBox jCheckBoxes_proveedorDetalleAsientoContableCajaChica;
	public JButton jButtones_proveedorDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPaneldetalleDetalleAsientoContableCajaChica;
	public JLabel jLabeldetalleDetalleAsientoContableCajaChica;
	public JTextArea jTextAreadetalleDetalleAsientoContableCajaChica;
	public JScrollPane jscrollPanedetalleDetalleAsientoContableCajaChica;
	public JButton jButtondetalleDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_bien_tarifa12DetalleAsientoContableCajaChica;
	public JLabel jLabelvalor_bien_tarifa12DetalleAsientoContableCajaChica;
	public JTextField jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica;
	public JButton jButtonvalor_bien_tarifa12DetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_servicio_tarifa12DetalleAsientoContableCajaChica;
	public JLabel jLabelvalor_servicio_tarifa12DetalleAsientoContableCajaChica;
	public JTextField jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica;
	public JButton jButtonvalor_servicio_tarifa12DetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_ivaDetalleAsientoContableCajaChica;
	public JLabel jLabelporcentaje_ivaDetalleAsientoContableCajaChica;
	public JTextField jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica;
	public JButton jButtonporcentaje_ivaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_bien_tarifa0DetalleAsientoContableCajaChica;
	public JLabel jLabelvalor_bien_tarifa0DetalleAsientoContableCajaChica;
	public JTextField jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica;
	public JButton jButtonvalor_bien_tarifa0DetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_servicio_tarifa0DetalleAsientoContableCajaChica;
	public JLabel jLabelvalor_servicio_tarifa0DetalleAsientoContableCajaChica;
	public JTextField jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica;
	public JButton jButtonvalor_servicio_tarifa0DetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_ivaDetalleAsientoContableCajaChica;
	public JLabel jLabelvalor_ivaDetalleAsientoContableCajaChica;
	public JTextField jTextFieldvalor_ivaDetalleAsientoContableCajaChica;
	public JButton jButtonvalor_ivaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_bien_iceDetalleAsientoContableCajaChica;
	public JLabel jLabelvalor_bien_iceDetalleAsientoContableCajaChica;
	public JTextField jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica;
	public JButton jButtonvalor_bien_iceDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_servicio_iceDetalleAsientoContableCajaChica;
	public JLabel jLabelvalor_servicio_iceDetalleAsientoContableCajaChica;
	public JTextField jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica;
	public JButton jButtonvalor_servicio_iceDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelfechaDetalleAsientoContableCajaChica;
	public JLabel jLabelfechaDetalleAsientoContableCajaChica;
	//public JFormattedTextField jDateChooserfechaDetalleAsientoContableCajaChica;

	public JDateChooser jDateChooserfechaDetalleAsientoContableCajaChica;
	public JButton jButtonfechaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleAsientoContableCajaChica;
	public JLabel jLabelid_empresaDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleAsientoContableCajaChica;
	public JButton jButtonid_empresaDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_empresaDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleAsientoContableCajaChica;
	public JLabel jLabelid_sucursalDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleAsientoContableCajaChica;
	public JButton jButtonid_sucursalDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_sucursalDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloDetalleAsientoContableCajaChica;
	public JLabel jLabelid_moduloDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloDetalleAsientoContableCajaChica;
	public JButton jButtonid_moduloDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_moduloDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_moduloDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleAsientoContableCajaChica;
	public JLabel jLabelid_ejercicioDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleAsientoContableCajaChica;
	public JButton jButtonid_ejercicioDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleAsientoContableCajaChica;
	public JLabel jLabelid_periodoDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleAsientoContableCajaChica;
	public JButton jButtonid_periodoDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_periodoDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleAsientoContableCajaChica;
	public JLabel jLabelid_anioDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleAsientoContableCajaChica;
	public JButton jButtonid_anioDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_anioDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleAsientoContableCajaChica;
	public JLabel jLabelid_mesDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleAsientoContableCajaChica;
	public JButton jButtonid_mesDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_mesDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica;
	public JLabel jLabelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica;
	public JButton jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_gasto_empresaDetalleAsientoContableCajaChica;
	public JLabel jLabelid_tipo_gasto_empresaDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica;
	public JButton jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionDetalleAsientoContableCajaChica;
	public JLabel jLabelid_transaccionDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionDetalleAsientoContableCajaChica;
	public JButton jButtonid_transaccionDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_transaccionDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_transaccionDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaDetalleAsientoContableCajaChica;
	public JLabel jLabelid_facturaDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaDetalleAsientoContableCajaChica;
	public JButton jButtonid_facturaDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_facturaDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_facturaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableDetalleAsientoContableCajaChica;
	public JLabel jLabelid_asiento_contableDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableDetalleAsientoContableCajaChica;
	public JButton jButtonid_asiento_contableDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_asiento_contableDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetalleAsientoContableCajaChica;
	public JLabel jLabelid_centro_costoDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetalleAsientoContableCajaChica;
	public JButton jButtonid_centro_costoDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleAsientoContableCajaChicaArbol= new JButtonMe();

	public JPanel jPanelid_tipo_cambioDetalleAsientoContableCajaChica;
	public JLabel jLabelid_tipo_cambioDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica;
	public JButton jButtonid_tipo_cambioDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_cambioDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica;
	public JLabel jLabelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica;
	public JButton jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleAsientoContableCajaChica;
	
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
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=528;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleAsientoContableCajaChicaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleAsientoContableCajaChica=new JPanel();
				this.jPanelAccionesFormularioDetalleAsientoContableCajaChica=new JPanel();
				this.jmenuBarDetalleDetalleAsientoContableCajaChica=new JMenuBar();
				this.jTtoolBarDetalleDetalleAsientoContableCajaChica=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableCajaChicaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleAsientoContableCajaChicaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableCajaChicaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableCajaChicaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleAsientoContableCajaChicaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleAsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleAsientoContableCajaChica() {
		return this.jButtonActualizarToolBarDetalleAsientoContableCajaChica;
	}
	
	public JButton getjButtonEliminarToolBarDetalleAsientoContableCajaChica() {
		return this.jButtonEliminarToolBarDetalleAsientoContableCajaChica;
	}
	
	public JButton getjButtonCancelarToolBarDetalleAsientoContableCajaChica() {
		return this.jButtonCancelarToolBarDetalleAsientoContableCajaChica;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleAsientoContableCajaChica() {
		return this.jButtonProcesarInformacionDetalleAsientoContableCajaChica;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleAsientoContableCajaChica)	{
		this.jButtonProcesarInformacionDetalleAsientoContableCajaChica = jButtonProcesarInformacionDetalleAsientoContableCajaChica;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleAsientoContableCajaChica() {
		return this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleAsientoContableCajaChica(
			JComboBox jComboBoxTiposRelacionesDetalleAsientoContableCajaChica) {
		this.jComboBoxTiposRelacionesDetalleAsientoContableCajaChica = jComboBoxTiposRelacionesDetalleAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleAsientoContableCajaChica(
			JComboBox jComboBoxTiposAccionesDetalleAsientoContableCajaChica) {
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica = jComboBoxTiposAccionesDetalleAsientoContableCajaChica;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica() {
		return this.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica(
			JComboBox jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica) {
		this.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica = jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleasientocontablecajachicaSessionBean=new DetalleAsientoContableCajaChicaSessionBean();
		
		this.detalleasientocontablecajachicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleasientocontablecajachicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleAsientoContableCajaChicaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Asiento Contable Caja Chica MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleAsientoContableCajaChicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleAsientoContableCajaChica= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleAsientoContableCajaChica=new JButtonMe();
				this.jButtonModificarToolBarDetalleAsientoContableCajaChica=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleDetalleAsientoContableCajaChica,
							"actualizar","actualizar","Actualizar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleDetalleAsientoContableCajaChica,
							"eliminar","eliminar","Eliminar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleDetalleAsientoContableCajaChica,
							"cancelar","cancelar","Cancelar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleAsientoContableCajaChica,this.jTtoolBarDetalleDetalleAsientoContableCajaChica,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleAsientoContableCajaChica=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleAsientoContableCajaChica=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleAsientoContableCajaChica=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleAsientoContableCajaChica=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleAsientoContableCajaChica=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleAsientoContableCajaChica= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleAsientoContableCajaChica.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleAsientoContableCajaChica,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleAsientoContableCajaChica= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleAsientoContableCajaChica.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleAsientoContableCajaChica,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleAsientoContableCajaChica= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleAsientoContableCajaChica.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleAsientoContableCajaChica,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleAsientoContableCajaChica= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleAsientoContableCajaChica.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleAsientoContableCajaChica,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleAsientoContableCajaChica= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleAsientoContableCajaChica.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleAsientoContableCajaChica,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleAsientoContableCajaChica= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleAsientoContableCajaChica.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleAsientoContableCajaChica,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleAsientoContableCajaChica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleAsientoContableCajaChica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleAsientoContableCajaChica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleAsientoContableCajaChica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleAsientoContableCajaChica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleAsientoContableCajaChica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleAsientoContableCajaChica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleAsientoContableCajaChica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleAsientoContableCajaChica,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleAsientoContableCajaChica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleAsientoContableCajaChica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleAsientoContableCajaChica,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleAsientoContableCajaChica.add(this.jMenuItemDetalleCerrarDetalleAsientoContableCajaChica);
		
		this.jmenuDetalleAccionesDetalleAsientoContableCajaChica.add(this.jMenuItemActualizarDetalleAsientoContableCajaChica);
		this.jmenuDetalleAccionesDetalleAsientoContableCajaChica.add(this.jMenuItemEliminarDetalleAsientoContableCajaChica);
		this.jmenuDetalleAccionesDetalleAsientoContableCajaChica.add(this.jMenuItemCancelarDetalleAsientoContableCajaChica);		
		
		//this.jmenuDetalleDatosDetalleAsientoContableCajaChica.add(this.jMenuItemDetalleAbrirOrderByDetalleAsientoContableCajaChica);				
		this.jmenuDetalleDatosDetalleAsientoContableCajaChica.add(this.jMenuItemDetalleMostarOcultarDetalleAsientoContableCajaChica);				
				
		//this.jmenuDetalleAccionesDetalleAsientoContableCajaChica.add(this.jMenuItemGuardarCambiosDetalleAsientoContableCajaChica);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleAsientoContableCajaChica.add(this.jmenuDetalleArchivoDetalleAsientoContableCajaChica);		
		this.jmenuBarDetalleDetalleAsientoContableCajaChica.add(this.jmenuDetalleAccionesDetalleAsientoContableCajaChica);		
		this.jmenuBarDetalleDetalleAsientoContableCajaChica.add(this.jmenuDetalleDatosDetalleAsientoContableCajaChica);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleAsientoContableCajaChica);				
	}
	
	
	public void inicializarElementosCamposDetalleAsientoContableCajaChica() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleAsientoContableCajaChica = new JLabelMe();
		jLabelIdDetalleAsientoContableCajaChica.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleAsientoContableCajaChica = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleAsientoContableCajaChica= new GridBagLayout();

		this.jPanelidDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);

		jLabelidDetalleAsientoContableCajaChica = new JLabel();
		jLabelidDetalleAsientoContableCajaChica.setText("Id");

		jLabelidDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emisionDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelfecha_emisionDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionDetalleAsientoContableCajaChica.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelfecha_emisionDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		//jFormattedTextFieldfecha_emisionDetalleAsientoContableCajaChica= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionDetalleAsientoContableCajaChica= new JDateChooser();
		jDateChooserfecha_emisionDetalleAsientoContableCajaChica.setEnabled(false);
		jDateChooserfecha_emisionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionDetalleAsientoContableCajaChica.setDate(new Date());
		jDateChooserfecha_emisionDetalleAsientoContableCajaChica.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionDetalleAsientoContableCajaChica.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonfecha_emisionDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonfecha_emisionDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabeles_proveedorDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabeles_proveedorDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_ESPROVEEDOR+" : *");
		this.jLabeles_proveedorDetalleAsientoContableCajaChica.setToolTipText("Es Proveedor");
		this.jLabeles_proveedorDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_proveedorDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_proveedorDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_proveedorDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_proveedorDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_proveedorDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_ESPROVEEDOR);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPaneles_proveedorDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jCheckBoxes_proveedorDetalleAsientoContableCajaChica= new JCheckBoxMe();
		jCheckBoxes_proveedorDetalleAsientoContableCajaChica.setEnabled(false);

		jCheckBoxes_proveedorDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_proveedorDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_proveedorDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_proveedorDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_proveedorDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtones_proveedorDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_proveedorDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_proveedorDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_proveedorDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtones_proveedorDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_proveedorDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_proveedorDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_proveedorDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_proveedorDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_proveedorDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_proveedorDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabeldetalleDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabeldetalleDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_DETALLE+" :");
		this.jLabeldetalleDetalleAsientoContableCajaChica.setToolTipText("Detalle");
		this.jLabeldetalleDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPaneldetalleDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jTextAreadetalleDetalleAsientoContableCajaChica= new JTextAreaMe();
		jTextAreadetalleDetalleAsientoContableCajaChica.setEnabled(false);
		jTextAreadetalleDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleDetalleAsientoContableCajaChica.setLineWrap(true);
		jTextAreadetalleDetalleAsientoContableCajaChica.setWrapStyleWord(true);
		jTextAreadetalleDetalleAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleDetalleAsientoContableCajaChica.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleDetalleAsientoContableCajaChica = new JScrollPane(jTextAreadetalleDetalleAsientoContableCajaChica);
		jscrollPanedetalleDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedetalleDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondetalleDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtondetalleDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtondetalleDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_bien_tarifa12DetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelvalor_bien_tarifa12DetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORBIENTARIFA12+" : *");
		this.jLabelvalor_bien_tarifa12DetalleAsientoContableCajaChica.setToolTipText("Tarifa Bien 12");
		this.jLabelvalor_bien_tarifa12DetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_bien_tarifa12DetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_bien_tarifa12DetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_bien_tarifa12DetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_bien_tarifa12DetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_bien_tarifa12DetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORBIENTARIFA12);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelvalor_bien_tarifa12DetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica= new JTextFieldMe();
		jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica.setEnabled(false);
		jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica.setText("0.0");

		this.jButtonvalor_bien_tarifa12DetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonvalor_bien_tarifa12DetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_bien_tarifa12DetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_bien_tarifa12DetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_bien_tarifa12DetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonvalor_bien_tarifa12DetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_bien_tarifa12DetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_bien_tarifa12DetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_bien_tarifa12DetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_bien_tarifa12DetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_servicio_tarifa12DetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelvalor_servicio_tarifa12DetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORSERVICIOTARIFA12+" : *");
		this.jLabelvalor_servicio_tarifa12DetalleAsientoContableCajaChica.setToolTipText("Tarifa Servicio 12 ");
		this.jLabelvalor_servicio_tarifa12DetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_servicio_tarifa12DetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_servicio_tarifa12DetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_servicio_tarifa12DetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_servicio_tarifa12DetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_servicio_tarifa12DetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORSERVICIOTARIFA12);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelvalor_servicio_tarifa12DetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica= new JTextFieldMe();
		jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica.setEnabled(false);
		jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica.setText("0.0");

		this.jButtonvalor_servicio_tarifa12DetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonvalor_servicio_tarifa12DetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_servicio_tarifa12DetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_servicio_tarifa12DetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_servicio_tarifa12DetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonvalor_servicio_tarifa12DetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_servicio_tarifa12DetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_servicio_tarifa12DetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_servicio_tarifa12DetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_servicio_tarifa12DetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_ivaDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelporcentaje_ivaDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_PORCENTAJEIVA+" : *");
		this.jLabelporcentaje_ivaDetalleAsientoContableCajaChica.setToolTipText("% Iva");
		this.jLabelporcentaje_ivaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_ivaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_ivaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_ivaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_ivaDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_ivaDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_PORCENTAJEIVA);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelporcentaje_ivaDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica= new JTextFieldMe();
		jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica.setEnabled(false);
		jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica.setText("0.0");

		this.jButtonporcentaje_ivaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonporcentaje_ivaDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_ivaDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_ivaDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_ivaDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonporcentaje_ivaDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_ivaDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_ivaDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_ivaDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_ivaDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_bien_tarifa0DetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelvalor_bien_tarifa0DetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORBIENTARIFA0+" : *");
		this.jLabelvalor_bien_tarifa0DetalleAsientoContableCajaChica.setToolTipText("Tarifa Bien 0");
		this.jLabelvalor_bien_tarifa0DetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_bien_tarifa0DetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_bien_tarifa0DetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_bien_tarifa0DetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_bien_tarifa0DetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_bien_tarifa0DetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORBIENTARIFA0);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelvalor_bien_tarifa0DetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica= new JTextFieldMe();
		jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica.setEnabled(false);
		jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica.setText("0.0");

		this.jButtonvalor_bien_tarifa0DetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonvalor_bien_tarifa0DetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_bien_tarifa0DetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_bien_tarifa0DetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_bien_tarifa0DetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonvalor_bien_tarifa0DetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_bien_tarifa0DetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_bien_tarifa0DetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_bien_tarifa0DetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_bien_tarifa0DetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_servicio_tarifa0DetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelvalor_servicio_tarifa0DetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORSERVICIOTARIFA0+" : *");
		this.jLabelvalor_servicio_tarifa0DetalleAsientoContableCajaChica.setToolTipText("Tarifa Servicio 0 ");
		this.jLabelvalor_servicio_tarifa0DetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_servicio_tarifa0DetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_servicio_tarifa0DetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_servicio_tarifa0DetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_servicio_tarifa0DetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_servicio_tarifa0DetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORSERVICIOTARIFA0);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelvalor_servicio_tarifa0DetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica= new JTextFieldMe();
		jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica.setEnabled(false);
		jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica.setText("0.0");

		this.jButtonvalor_servicio_tarifa0DetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonvalor_servicio_tarifa0DetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_servicio_tarifa0DetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_servicio_tarifa0DetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_servicio_tarifa0DetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonvalor_servicio_tarifa0DetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_servicio_tarifa0DetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_servicio_tarifa0DetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_servicio_tarifa0DetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_servicio_tarifa0DetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_ivaDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelvalor_ivaDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORIVA+" : *");
		this.jLabelvalor_ivaDetalleAsientoContableCajaChica.setToolTipText("Valor Iva");
		this.jLabelvalor_ivaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_ivaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_ivaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_ivaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_ivaDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_ivaDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORIVA);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelvalor_ivaDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jTextFieldvalor_ivaDetalleAsientoContableCajaChica= new JTextFieldMe();
		jTextFieldvalor_ivaDetalleAsientoContableCajaChica.setEnabled(false);
		jTextFieldvalor_ivaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_ivaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_ivaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_ivaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_ivaDetalleAsientoContableCajaChica.setText("0.0");

		this.jButtonvalor_ivaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonvalor_ivaDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_ivaDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_ivaDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_ivaDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonvalor_ivaDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_ivaDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_ivaDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_ivaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_ivaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_ivaDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_ivaDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_bien_iceDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelvalor_bien_iceDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORBIENICE+" : *");
		this.jLabelvalor_bien_iceDetalleAsientoContableCajaChica.setToolTipText("Valor Bien Ice");
		this.jLabelvalor_bien_iceDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_bien_iceDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_bien_iceDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_bien_iceDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_bien_iceDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_bien_iceDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORBIENICE);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelvalor_bien_iceDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica= new JTextFieldMe();
		jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica.setEnabled(false);
		jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica.setText("0.0");

		this.jButtonvalor_bien_iceDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonvalor_bien_iceDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_bien_iceDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_bien_iceDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_bien_iceDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonvalor_bien_iceDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_bien_iceDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_bien_iceDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_bien_iceDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_bien_iceDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_servicio_iceDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelvalor_servicio_iceDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORSERVICIOICE+" : *");
		this.jLabelvalor_servicio_iceDetalleAsientoContableCajaChica.setToolTipText("Valor Servicio Ice ");
		this.jLabelvalor_servicio_iceDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_servicio_iceDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_servicio_iceDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_servicio_iceDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_servicio_iceDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_servicio_iceDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_VALORSERVICIOICE);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelvalor_servicio_iceDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica= new JTextFieldMe();
		jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica.setEnabled(false);
		jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica.setText("0.0");

		this.jButtonvalor_servicio_iceDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonvalor_servicio_iceDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_servicio_iceDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_servicio_iceDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_servicio_iceDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonvalor_servicio_iceDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_servicio_iceDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_servicio_iceDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_servicio_iceDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_servicio_iceDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabelfechaDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelfechaDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaDetalleAsientoContableCajaChica.setToolTipText("Fecha");
		this.jLabelfechaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelfechaDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		//jFormattedTextFieldfechaDetalleAsientoContableCajaChica= new JFormattedTextFieldMe();

		jDateChooserfechaDetalleAsientoContableCajaChica= new JDateChooser();
		jDateChooserfechaDetalleAsientoContableCajaChica.setEnabled(false);
		jDateChooserfechaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaDetalleAsientoContableCajaChica.setDate(new Date());
		jDateChooserfechaDetalleAsientoContableCajaChica.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaDetalleAsientoContableCajaChica.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonfechaDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonfechaDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleAsientoContableCajaChica() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_empresaDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleAsientoContableCajaChica.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_empresaDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_empresaDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_empresaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_empresaDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_empresaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_empresaDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleAsientoContableCajaChica"));

		this.jButtonid_empresaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_empresaDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_empresaDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_sucursalDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_sucursalDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleAsientoContableCajaChica.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_sucursalDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_sucursalDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_sucursalDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_sucursalDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_sucursalDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_sucursalDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleAsientoContableCajaChica"));

		this.jButtonid_sucursalDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_sucursalDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_sucursalDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_moduloDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_moduloDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloDetalleAsientoContableCajaChica.setToolTipText("Modulo");
		this.jLabelid_moduloDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_moduloDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_moduloDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_moduloDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloDetalleAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_moduloDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_moduloDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_moduloDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleAsientoContableCajaChica"));

		this.jButtonid_moduloDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_moduloDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_moduloDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_moduloDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_moduloDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_moduloDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_ejercicioDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_ejercicioDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleAsientoContableCajaChica.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_ejercicioDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_ejercicioDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_ejercicioDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_ejercicioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_ejercicioDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleAsientoContableCajaChica"));

		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_periodoDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_periodoDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleAsientoContableCajaChica.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_periodoDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_periodoDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_periodoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_periodoDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_periodoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_periodoDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleAsientoContableCajaChica"));

		this.jButtonid_periodoDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_periodoDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_periodoDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_anioDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_anioDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleAsientoContableCajaChica.setToolTipText("Anio");
		this.jLabelid_anioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_anioDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_anioDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_anioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_anioDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_anioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_anioDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleAsientoContableCajaChica"));

		this.jButtonid_anioDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_anioDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_anioDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_anioDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_mesDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_mesDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleAsientoContableCajaChica.setToolTipText("Mes");
		this.jLabelid_mesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_mesDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_mesDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_mesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_mesDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_mesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_mesDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleAsientoContableCajaChica"));

		this.jButtonid_mesDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_mesDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_mesDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_mesDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDASIENTOCONTABLECAJACHICA+" : *");
		this.jLabelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setToolTipText("Asiento Caja Chica");
		this.jLabelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDASIENTOCONTABLECAJACHICA);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contable_caja_chicaDetalleAsientoContableCajaChica"));

		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_tipo_gasto_empresaDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOGASTOEMPRESA+" : *");
		this.jLabelid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setToolTipText("Tipo Gasto");
		this.jLabelid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_gasto_empresaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_gasto_empresaDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOGASTOEMPRESA);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_gasto_empresaDetalleAsientoContableCajaChica"));

		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_gasto_empresaDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_gasto_empresaDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_transaccionDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_transaccionDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionDetalleAsientoContableCajaChica.setToolTipText("Tipo");
		this.jLabelid_transaccionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_transaccionDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_transaccionDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_transaccionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_transaccionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_transaccionDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDetalleAsientoContableCajaChica"));

		this.jButtonid_transaccionDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_transaccionDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_transaccionDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_transaccionDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_transaccionDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_transaccionDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_facturaDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_facturaDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDFACTURA+" :");
		this.jLabelid_facturaDetalleAsientoContableCajaChica.setToolTipText("Factura");
		this.jLabelid_facturaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_facturaDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_facturaDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_facturaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_facturaDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_facturaDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleAsientoContableCajaChica"));

		this.jButtonid_facturaDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_facturaDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_facturaDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_facturaDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_facturaDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_facturaDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_asiento_contableDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_asiento_contableDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDASIENTOCONTABLE+" :");
		this.jLabelid_asiento_contableDetalleAsientoContableCajaChica.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_asiento_contableDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_asiento_contableDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_asiento_contableDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleAsientoContableCajaChica"));

		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_centro_costoDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_centro_costoDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoDetalleAsientoContableCajaChica.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_centro_costoDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_centro_costoDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_centro_costoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_centro_costoDetalleAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_centro_costoDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_centro_costoDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_centro_costoDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleAsientoContableCajaChica"));

		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleAsientoContableCajaChicaUpdate"));


		jButtonid_centro_costoDetalleAsientoContableCajaChicaArbol= new JButtonMe();
		jButtonid_centro_costoDetalleAsientoContableCajaChicaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleAsientoContableCajaChicaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleAsientoContableCajaChicaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleAsientoContableCajaChicaArbol.setText("Arbol");
		jButtonid_centro_costoDetalleAsientoContableCajaChicaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetalleAsientoContableCajaChicaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleAsientoContableCajaChicaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleAsientoContableCajaChicaArbol"));



					
		this.jLabelid_tipo_cambioDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_tipo_cambioDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOCAMBIO+" :");
		this.jLabelid_tipo_cambioDetalleAsientoContableCajaChica.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_tipo_cambioDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioDetalleAsientoContableCajaChica"));

		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioDetalleAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setText(""+DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" :");
		this.jLabelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-20),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setToolTipText(DetalleAsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutDetalleAsientoContableCajaChica);


		jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleAsientoContableCajaChica"));

		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleAsientoContableCajaChicaBusqueda"));

		if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleAsientoContableCajaChicaUpdate"));



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
		//this.jInternalFrameDetalleDetalleAsientoContableCajaChica = new DetalleAsientoContableCajaChicaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Asiento Contable Caja Chica DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleAsientoContableCajaChica= new GridBagLayout();
		

		
		String sToolTipDetalleAsientoContableCajaChica="";
		sToolTipDetalleAsientoContableCajaChica=DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleAsientoContableCajaChica+="(Contabilidad.DetalleAsientoContableCajaChica)";
		}
		
		if(!this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleAsientoContableCajaChica+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonModificarDetalleAsientoContableCajaChica = new JButtonMe();
        this.jButtonActualizarDetalleAsientoContableCajaChica = new JButtonMe();
        this.jButtonEliminarDetalleAsientoContableCajaChica = new JButtonMe();
        this.jButtonCancelarDetalleAsientoContableCajaChica = new JButtonMe();
        this.jButtonGuardarCambiosDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarDetalleAsientoContableCajaChica = new JButtonMe();
		
		this.jScrollPanelDatosDetalleAsientoContableCajaChica = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleAsientoContableCajaChica = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica = new JScrollPane();
		//this.jScrollPanelDatosDetalleAsientoContableCajaChicaTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Asiento Contable Caja Chica";
		
		if(!this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Asiento Contable Caja Chicas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleAsientoContableCajaChicaTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleAsientoContableCajaChica.setName("jPanelCamposDetalleAsientoContableCajaChica"); 

		this.jPanelCamposOcultosDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleAsientoContableCajaChica.setName("jPanelCamposOcultosDetalleAsientoContableCajaChica"); 

        this.jPanelAccionesDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleAsientoContableCajaChica.setToolTipText("Acciones");
        this.jPanelAccionesDetalleAsientoContableCajaChica.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleAsientoContableCajaChica.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleAsientoContableCajaChica.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.setName("jPanelCamposFingeneralDetalleAsientoContableCajaChica");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.setName("jPanelCamposFinvaloresDetalleAsientoContableCajaChica");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleAsientoContableCajaChica.setText("Nuevo");
		this.jButtonModificarDetalleAsientoContableCajaChica.setText("Editar");
        this.jButtonActualizarDetalleAsientoContableCajaChica.setText("Actualizar");
        this.jButtonEliminarDetalleAsientoContableCajaChica.setText("Eliminar");
        this.jButtonCancelarDetalleAsientoContableCajaChica.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleAsientoContableCajaChica.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica.setText("Guardar");
		this.jButtonCerrarDetalleAsientoContableCajaChica.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleAsientoContableCajaChica,"nuevo_button","Nuevo",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleAsientoContableCajaChica,"modificar_button","Editar",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleAsientoContableCajaChica,"actualizar_button","Actualizar",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleAsientoContableCajaChica,"eliminar_button","Eliminar",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleAsientoContableCajaChica,"cancelar_button","Cancelar",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleAsientoContableCajaChica,"guardarcambios_button","Guardar",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica,"guardarcambiostabla_button","Guardar",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleAsientoContableCajaChica,"cerrar_button","Salir",this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleAsientoContableCajaChica.setToolTipText("Nuevo"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleAsientoContableCajaChica.setToolTipText("Editar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleAsientoContableCajaChica.setToolTipText("Actualizar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleAsientoContableCajaChica.setToolTipText("Eliminar)"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleAsientoContableCajaChica.setToolTipText("Cancelar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleAsientoContableCajaChica.setToolTipText("Guardar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica.setToolTipText("Guardar"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleAsientoContableCajaChica.setToolTipText("Salir"+" "+DetalleAsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleAsientoContableCajaChica";
		inputMap = this.jButtonNuevoDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleAsientoContableCajaChica"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleAsientoContableCajaChica";
		inputMap = this.jButtonActualizarDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleAsientoContableCajaChica"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleAsientoContableCajaChica";
		inputMap = this.jButtonEliminarDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleAsientoContableCajaChica"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleAsientoContableCajaChica";
		inputMap = this.jButtonCancelarDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleAsientoContableCajaChica"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleAsientoContableCajaChica";
		inputMap = this.jButtonCerrarDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleAsientoContableCajaChica"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleAsientoContableCajaChica";
		inputMap = this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleAsientoContableCajaChica"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleAsientoContableCajaChica.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleAsientoContableCajaChica.setToolTipText("Nuevo DetalleAsientoContableCajaChica");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleAsientoContableCajaChica.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleAsientoContableCajaChica.setToolTipText("Sin Cerrar Ventana DetalleAsientoContableCajaChica");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleAsientoContableCajaChica.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleAsientoContableCajaChica.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica.setText("Accion");
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleAsientoContableCajaChica = new JLabelMe();
		
		this.jLabelAccionesDetalleAsientoContableCajaChica.setText("Acciones");		
		this.jLabelAccionesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleAsientoContableCajaChica();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleAsientoContableCajaChica();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleAsientoContableCajaChica=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleAsientoContableCajaChica = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleAsientoContableCajaChica = new GridBagLayout();
		
		this.jPanelCamposDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutCamposDetalleAsientoContableCajaChica);
		this.jPanelCamposOcultosDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutCamposOcultosDetalleAsientoContableCajaChica);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetalleAsientoContableCajaChica= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutCamposIniciogeneralDetalleAsientoContableCajaChica);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetalleAsientoContableCajaChica= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutCamposIniciovaloresDetalleAsientoContableCajaChica);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleAsientoContableCajaChica.add(jLabelIdDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleAsientoContableCajaChica.add(jLabelidDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleAsientoContableCajaChica.add(jLabelid_empresaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleAsientoContableCajaChica.add(jButtonid_empresaDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleAsientoContableCajaChica.add(jButtonid_empresaDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleAsientoContableCajaChica.add(jComboBoxid_empresaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleAsientoContableCajaChica.add(jLabelid_sucursalDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleAsientoContableCajaChica.add(jButtonid_sucursalDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleAsientoContableCajaChica.add(jButtonid_sucursalDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleAsientoContableCajaChica.add(jComboBoxid_sucursalDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloDetalleAsientoContableCajaChica.add(jLabelid_moduloDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDetalleAsientoContableCajaChica.add(jButtonid_moduloDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDetalleAsientoContableCajaChica.add(jButtonid_moduloDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloDetalleAsientoContableCajaChica.add(jComboBoxid_moduloDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleAsientoContableCajaChica.add(jLabelid_ejercicioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleAsientoContableCajaChica.add(jButtonid_ejercicioDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleAsientoContableCajaChica.add(jButtonid_ejercicioDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleAsientoContableCajaChica.add(jComboBoxid_ejercicioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleAsientoContableCajaChica.add(jLabelid_periodoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleAsientoContableCajaChica.add(jButtonid_periodoDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleAsientoContableCajaChica.add(jButtonid_periodoDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleAsientoContableCajaChica.add(jComboBoxid_periodoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleAsientoContableCajaChica.add(jLabelid_anioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleAsientoContableCajaChica.add(jButtonid_anioDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleAsientoContableCajaChica.add(jButtonid_anioDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleAsientoContableCajaChica.add(jComboBoxid_anioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleAsientoContableCajaChica.add(jLabelid_mesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleAsientoContableCajaChica.add(jButtonid_mesDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleAsientoContableCajaChica.add(jButtonid_mesDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleAsientoContableCajaChica.add(jComboBoxid_mesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.add(jLabelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.add(jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.add(jButtonid_asiento_contable_caja_chicaDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica.add(jComboBoxid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_gasto_empresaDetalleAsientoContableCajaChica.add(jLabelid_tipo_gasto_empresaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_gasto_empresaDetalleAsientoContableCajaChica.add(jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_gasto_empresaDetalleAsientoContableCajaChica.add(jButtonid_tipo_gasto_empresaDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_gasto_empresaDetalleAsientoContableCajaChica.add(jComboBoxid_tipo_gasto_empresaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionDetalleAsientoContableCajaChica.add(jLabelfecha_emisionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionDetalleAsientoContableCajaChica.add(jButtonfecha_emisionDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionDetalleAsientoContableCajaChica.add(jDateChooserfecha_emisionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionDetalleAsientoContableCajaChica.add(jLabelid_transaccionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionDetalleAsientoContableCajaChica.add(jButtonid_transaccionDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionDetalleAsientoContableCajaChica.add(jButtonid_transaccionDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionDetalleAsientoContableCajaChica.add(jComboBoxid_transaccionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaDetalleAsientoContableCajaChica.add(jLabelid_facturaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaDetalleAsientoContableCajaChica.add(jButtonid_facturaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaDetalleAsientoContableCajaChica.add(jButtonid_facturaDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 4;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaDetalleAsientoContableCajaChica.add(jButtonid_facturaDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaDetalleAsientoContableCajaChica.add(jComboBoxid_facturaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_proveedorDetalleAsientoContableCajaChica.add(jLabeles_proveedorDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_proveedorDetalleAsientoContableCajaChica.add(jButtones_proveedorDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_proveedorDetalleAsientoContableCajaChica.add(jCheckBoxes_proveedorDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableDetalleAsientoContableCajaChica.add(jLabelid_asiento_contableDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableDetalleAsientoContableCajaChica.add(jButtonid_asiento_contableDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetalleAsientoContableCajaChica.add(jButtonid_asiento_contableDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 4;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetalleAsientoContableCajaChica.add(jButtonid_asiento_contableDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableDetalleAsientoContableCajaChica.add(jComboBoxid_asiento_contableDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleDetalleAsientoContableCajaChica.add(jLabeldetalleDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleDetalleAsientoContableCajaChica.add(jButtondetalleDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleDetalleAsientoContableCajaChica.add(jscrollPanedetalleDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_bien_tarifa12DetalleAsientoContableCajaChica.add(jLabelvalor_bien_tarifa12DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_bien_tarifa12DetalleAsientoContableCajaChica.add(jButtonvalor_bien_tarifa12DetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_bien_tarifa12DetalleAsientoContableCajaChica.add(jTextFieldvalor_bien_tarifa12DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_servicio_tarifa12DetalleAsientoContableCajaChica.add(jLabelvalor_servicio_tarifa12DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_servicio_tarifa12DetalleAsientoContableCajaChica.add(jButtonvalor_servicio_tarifa12DetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_servicio_tarifa12DetalleAsientoContableCajaChica.add(jTextFieldvalor_servicio_tarifa12DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_ivaDetalleAsientoContableCajaChica.add(jLabelporcentaje_ivaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_ivaDetalleAsientoContableCajaChica.add(jButtonporcentaje_ivaDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_ivaDetalleAsientoContableCajaChica.add(jTextFieldporcentaje_ivaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_bien_tarifa0DetalleAsientoContableCajaChica.add(jLabelvalor_bien_tarifa0DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_bien_tarifa0DetalleAsientoContableCajaChica.add(jButtonvalor_bien_tarifa0DetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_bien_tarifa0DetalleAsientoContableCajaChica.add(jTextFieldvalor_bien_tarifa0DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_servicio_tarifa0DetalleAsientoContableCajaChica.add(jLabelvalor_servicio_tarifa0DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_servicio_tarifa0DetalleAsientoContableCajaChica.add(jButtonvalor_servicio_tarifa0DetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_servicio_tarifa0DetalleAsientoContableCajaChica.add(jTextFieldvalor_servicio_tarifa0DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_ivaDetalleAsientoContableCajaChica.add(jLabelvalor_ivaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_ivaDetalleAsientoContableCajaChica.add(jButtonvalor_ivaDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_ivaDetalleAsientoContableCajaChica.add(jTextFieldvalor_ivaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_bien_iceDetalleAsientoContableCajaChica.add(jLabelvalor_bien_iceDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_bien_iceDetalleAsientoContableCajaChica.add(jButtonvalor_bien_iceDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_bien_iceDetalleAsientoContableCajaChica.add(jTextFieldvalor_bien_iceDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_servicio_iceDetalleAsientoContableCajaChica.add(jLabelvalor_servicio_iceDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_servicio_iceDetalleAsientoContableCajaChica.add(jButtonvalor_servicio_iceDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_servicio_iceDetalleAsientoContableCajaChica.add(jTextFieldvalor_servicio_iceDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetalleAsientoContableCajaChica.add(jLabelid_centro_costoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetalleAsientoContableCajaChica.add(jButtonid_centro_costoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetalleAsientoContableCajaChica.add(jButtonid_centro_costoDetalleAsientoContableCajaChicaArbol, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 4;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleAsientoContableCajaChica.add(jButtonid_centro_costoDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 5;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleAsientoContableCajaChica.add(jButtonid_centro_costoDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetalleAsientoContableCajaChica.add(jComboBoxid_centro_costoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cambioDetalleAsientoContableCajaChica.add(jLabelid_tipo_cambioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioDetalleAsientoContableCajaChica.add(jButtonid_tipo_cambioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioDetalleAsientoContableCajaChica.add(jButtonid_tipo_cambioDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 4;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioDetalleAsientoContableCajaChica.add(jButtonid_tipo_cambioDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cambioDetalleAsientoContableCajaChica.add(jComboBoxid_tipo_cambioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.add(jLabelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.add(jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.add(jButtonid_tipo_transaccion_moduloDetalleAsientoContableCajaChicaUpdate, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica.add(jComboBoxid_tipo_transaccion_moduloDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaDetalleAsientoContableCajaChica.add(jLabelfechaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaDetalleAsientoContableCajaChica.add(jButtonfechaDetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsDetalleAsientoContableCajaChica);
	}

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaDetalleAsientoContableCajaChica.add(jDateChooserfechaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposOcultosDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposOcultosDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAsientoContableCajaChica.add(this.jPanelid_empresaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposOcultosDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContableCajaChica=0;
		iYPanelCamposOcultosDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposOcultosDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposOcultosDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAsientoContableCajaChica.add(this.jPanelid_sucursalDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposOcultosDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContableCajaChica=0;
		iYPanelCamposOcultosDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposOcultosDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposOcultosDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAsientoContableCajaChica.add(this.jPanelid_moduloDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposOcultosDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContableCajaChica=0;
		iYPanelCamposOcultosDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposOcultosDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposOcultosDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAsientoContableCajaChica.add(this.jPanelid_ejercicioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposOcultosDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContableCajaChica=0;
		iYPanelCamposOcultosDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposOcultosDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposOcultosDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAsientoContableCajaChica.add(this.jPanelid_periodoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposOcultosDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContableCajaChica=0;
		iYPanelCamposOcultosDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposOcultosDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposOcultosDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAsientoContableCajaChica.add(this.jPanelid_anioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposOcultosDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContableCajaChica=0;
		iYPanelCamposOcultosDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposOcultosDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposOcultosDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAsientoContableCajaChica.add(this.jPanelid_mesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposOcultosDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContableCajaChica=0;
		iYPanelCamposOcultosDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposOcultosDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposOcultosDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAsientoContableCajaChica.add(this.jPanelid_centro_costoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposOcultosDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContableCajaChica=0;
		iYPanelCamposOcultosDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposOcultosDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposOcultosDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAsientoContableCajaChica.add(this.jPanelid_tipo_cambioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposOcultosDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContableCajaChica=0;
		iYPanelCamposOcultosDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposOcultosDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposOcultosDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAsientoContableCajaChica.add(this.jPanelid_tipo_transaccion_moduloDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposOcultosDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContableCajaChica=0;
		iYPanelCamposOcultosDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposOcultosDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposOcultosDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleAsientoContableCajaChica.add(this.jPanelfechaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposOcultosDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposOcultosDetalleAsientoContableCajaChica=0;
		iYPanelCamposOcultosDetalleAsientoContableCajaChica++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.add(this.jPanelidDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.add(this.jPanelid_asiento_contable_caja_chicaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.add(this.jPanelid_tipo_gasto_empresaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.add(this.jPanelfecha_emisionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.add(this.jPanelid_transaccionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.add(this.jPanelid_facturaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.add(this.jPaneles_proveedorDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.add(this.jPanelid_asiento_contableDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	}

	iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;
	iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridwidth = 2;

	this.jPanelCamposIniciogeneralDetalleAsientoContableCajaChica.add(this.jPaneldetalleDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica % 2==0) {
		iXPanelCamposIniciogeneralDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciogeneralDetalleAsientoContableCajaChica++;
	}

	iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
	iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;


	if(!iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica.equals(0)) {
		iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	}

	JLabelMe jLabelTitulovalor_bien_tarifa12DetalleAsientoContableCajaChica = new JLabelMe();
	jLabelTitulovalor_bien_tarifa12DetalleAsientoContableCajaChica.setText(" [Bienes]  -  [Servicios]   - [Iva]");
	jLabelTitulovalor_bien_tarifa12DetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulovalor_bien_tarifa12DetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulovalor_bien_tarifa12DetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTitulovalor_bien_tarifa12DetalleAsientoContableCajaChica);

	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridwidth = 3;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.add(jLabelTitulovalor_bien_tarifa12DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica % 3==0) {
		iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	}

	if(!iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica.equals(0)) {
		iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	}


	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.add(this.jPanelvalor_bien_tarifa12DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica % 3==0) {
		iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.add(this.jPanelvalor_servicio_tarifa12DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica % 3==0) {
		iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.add(this.jPanelporcentaje_ivaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica % 3==0) {
		iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.add(this.jPanelvalor_bien_tarifa0DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica % 3==0) {
		iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.add(this.jPanelvalor_servicio_tarifa0DetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica % 3==0) {
		iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.add(this.jPanelvalor_ivaDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica % 3==0) {
		iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.add(this.jPanelvalor_bien_iceDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica % 3==0) {
		iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	}
	this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
	this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleAsientoContableCajaChica.add(this.jPanelvalor_servicio_iceDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);



	if(iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica % 3==0) {
		iXPanelCamposIniciovaloresDetalleAsientoContableCajaChica=0;
		iYPanelCamposIniciovaloresDetalleAsientoContableCajaChica++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleAsientoContableCajaChica= new GridBagLayout();
		this.jPanelAccionesDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutAccionesDetalleAsientoContableCajaChica);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleAsientoContableCajaChica= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutAccionesFormularioDetalleAsientoContableCajaChica);
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleAsientoContableCajaChica.add(this.jComboBoxTiposAccionesFormularioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleAsientoContableCajaChica.add(this.jCheckBoxPostAccionNuevoDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleAsientoContableCajaChica.add(this.jCheckBoxPostAccionSinCerrarDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleasientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleAsientoContableCajaChica.add(this.jCheckBoxPostAccionSinMensajeDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleAsientoContableCajaChica.add(this.jButtonModificarDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);							

		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleAsientoContableCajaChica.add(this.jButtonEliminarDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
			
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleAsientoContableCajaChica.add(this.jButtonActualizarDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);


		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleAsientoContableCajaChica.add(this.jButtonGuardarCambiosDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);	
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = 0;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleAsientoContableCajaChica.add(this.jButtonCancelarDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleAsientoContableCajaChica);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();						
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;		
			//this.gridBagConstraintsDetalleAsientoContableCajaChica.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleAsientoContableCajaChica.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =0;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleAsientoContableCajaChica.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleAsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleAsientoContableCajaChica = new DetalleAsientoContableCajaChicaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Asiento Contable Caja Chica DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Asiento Contable Caja Chica DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Asiento Contable Caja Chica Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleAsientoContableCajaChicaModel detalleasientocontablecajachicaModel=new DetalleAsientoContableCajaChicaModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleAsientoContableCajaChicaModel.DetalleAsientoContableCajaChicaFocusTraversalPolicy detalleasientocontablecajachicaFocusTraversalPolicy = detalleasientocontablecajachicaModel.new DetalleAsientoContableCajaChicaFocusTraversalPolicy(this);
			
			//detalleasientocontablecajachicaFocusTraversalPolicy.setdetalleasientocontablecajachicaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleasientocontablecajachicaModel);
			
			
			this.jContentPaneDetalleDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleAsientoContableCajaChica = new GridBagLayout();	
			this.jContentPaneDetalleDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutDetalleDetalleAsientoContableCajaChica);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleAsientoContableCajaChica = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
				this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleAsientoContableCajaChica.add(jTtoolBarDetalleDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleAsientoContableCajaChica=   new JScrollPane(jContentPaneDetalleDetalleAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyRelaciones++;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;

		this.jContentPaneDetalleDetalleAsientoContableCajaChica.add(jPanelCamposIniciogeneralDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);


		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyRelaciones++;
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;

		this.jContentPaneDetalleDetalleAsientoContableCajaChica.add(jPanelCamposIniciovaloresDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);
			
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
						&& detalleasientocontablecajachicaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleasientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleAsientoContableCajaChica= new GridBagConstraints();
						this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
						this.jContentPaneDetalleDetalleAsientoContableCajaChica.add(this.jTabbedPaneRelacionesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleAsientoContableCajaChica.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleAsientoContableCajaChica.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
					this.gridBagConstraintsDetalleAsientoContableCajaChica.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleAsientoContableCajaChica.add(jPanelCamposOcultosDetalleAsientoContableCajaChica, gridBagConstraintsDetalleAsientoContableCajaChica);
				
					this.jPanelCamposOcultosDetalleAsientoContableCajaChica.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	        this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleAsientoContableCajaChica.add(this.jPanelAccionesFormularioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);							
			
			
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
	        this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleAsientoContableCajaChica.add(this.jPanelAccionesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleAsientoContableCajaChica);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleAsientoContableCajaChica=   new JScrollPane(this.jPanelCamposDetalleAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);			
			
			this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
			
			
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		
			
		this.gridBagConstraintsDetalleAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleAsientoContableCajaChica.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleAsientoContableCajaChica, this.gridBagConstraintsDetalleAsientoContableCajaChica);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleAsientoContableCajaChica;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleAsientoContableCajaChica;
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
