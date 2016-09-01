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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.AsientoContableCajaChicaConstantesFunciones;

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
public class AsientoContableCajaChicaDetalleFormJInternalFrame extends AsientoContableCajaChicaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAsientoContableCajaChica;
	
	protected JMenuBar jmenuBarDetalleAsientoContableCajaChica;
	
	protected JMenu jmenuDetalleAsientoContableCajaChica;
	protected JMenu jmenuDetalleArchivoAsientoContableCajaChica;
	protected JMenu jmenuDetalleAccionesAsientoContableCajaChica;
	protected JMenu jmenuDetalleDatosAsientoContableCajaChica;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAsientoContableCajaChica;	
	protected GridBagConstraints gridBagConstraintsAsientoContableCajaChica;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AsientoContableCajaChicaBeanSwingJInternalFrameAdditional jInternalFrameDetalleAsientoContableCajaChica;		
	
	
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

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstadoAsientoContableCajaChicaBeanSwingJInternalFrame estadoasientocontablecajachicaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoasientocontablecajachica="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";
	
	public AsientoContableCajaChicaSessionBean asientocontablecajachicaSessionBean;
	
	

	public DetalleAsientoContableCajaChicaBeanSwingJInternalFrame detalleasientocontablecajachicaBeanSwingJInternalFrame=null;
	public DetalleAsientoContableCajaChicaBeanSwingJInternalFrame detalleasientocontablecajachicaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleAsientoContableCajaChica=false;
	public DetalleAsientoContableCajaChicaSessionBean detalleasientocontablecajachicaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstadoAsientoContableCajaChicaSessionBean estadoasientocontablecajachicaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;	
	
	public AsientoContableCajaChicaLogic asientocontablecajachicaLogic;
	
	public JScrollPane jScrollPanelDatosAsientoContableCajaChica;
	public JScrollPane jScrollPanelDatosEdicionAsientoContableCajaChica;
	public JScrollPane jScrollPanelDatosGeneralAsientoContableCajaChica;
	
	protected JPanel jPanelCamposAsientoContableCajaChica;    
	protected JPanel jPanelCamposOcultosAsientoContableCajaChica;    	
	protected JPanel jPanelAccionesAsientoContableCajaChica;
	protected JPanel jPanelAccionesFormularioAsientoContableCajaChica;
    
	
	
	protected Integer iXPanelCamposAsientoContableCajaChica=0;
	protected Integer iYPanelCamposAsientoContableCajaChica=0;
	
	protected Integer iXPanelCamposOcultosAsientoContableCajaChica=0;
	protected Integer iYPanelCamposOcultosAsientoContableCajaChica=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAsientoContableCajaChica;
	public JButton jButtonModificarAsientoContableCajaChica;
	public JButton jButtonActualizarAsientoContableCajaChica;
    public JButton jButtonEliminarAsientoContableCajaChica;
	public JButton jButtonCancelarAsientoContableCajaChica;
    public JButton jButtonGuardarCambiosAsientoContableCajaChica;
	public JButton jButtonGuardarCambiosTablaAsientoContableCajaChica;
	protected JButton jButtonCerrarAsientoContableCajaChica;
	
	
	protected JButton jButtonProcesarInformacionAsientoContableCajaChica;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAsientoContableCajaChica;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAsientoContableCajaChica;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAsientoContableCajaChica;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAsientoContableCajaChica;
	protected JButton jButtonModificarToolBarAsientoContableCajaChica;
	protected JButton jButtonActualizarToolBarAsientoContableCajaChica;
    protected JButton jButtonEliminarToolBarAsientoContableCajaChica;
	protected JButton jButtonCancelarToolBarAsientoContableCajaChica;
    protected JButton jButtonGuardarCambiosToolBarAsientoContableCajaChica;
	protected JButton jButtonGuardarCambiosTablaToolBarAsientoContableCajaChica;
	protected JButton jButtonMostrarOcultarTablaToolBarAsientoContableCajaChica;
	protected JButton jButtonCerrarToolBarAsientoContableCajaChica;
	
	protected JButton jButtonProcesarInformacionToolBarAsientoContableCajaChica;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAsientoContableCajaChica;
	protected JMenuItem jMenuItemModificarAsientoContableCajaChica;
	protected JMenuItem jMenuItemActualizarAsientoContableCajaChica;
    protected JMenuItem jMenuItemEliminarAsientoContableCajaChica;
	protected JMenuItem jMenuItemCancelarAsientoContableCajaChica;
    protected JMenuItem jMenuItemGuardarCambiosAsientoContableCajaChica;
	protected JMenuItem jMenuItemGuardarCambiosTablaAsientoContableCajaChica;
	protected JMenuItem jMenuItemCerrarAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleCerrarAsientoContableCajaChica;
	protected JMenuItem jMenuItemDetalleMostarOcultarAsientoContableCajaChica;
	
	protected JMenuItem jMenuItemProcesarInformacionAsientoContableCajaChica;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAsientoContableCajaChica;
	protected JMenuItem jMenuItemMostrarOcultarAsientoContableCajaChica;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAsientoContableCajaChica;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAsientoContableCajaChica;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAsientoContableCajaChica;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAsientoContableCajaChica;
	public JLabel jLabelIdAsientoContableCajaChica;
	public JLabel jLabelidAsientoContableCajaChica;
	public JButton jButtonidAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialAsientoContableCajaChica;
	public JLabel jLabelsecuencialAsientoContableCajaChica;
	public JTextField jTextFieldsecuencialAsientoContableCajaChica;
	public JButton jButtonsecuencialAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelfechaAsientoContableCajaChica;
	public JLabel jLabelfechaAsientoContableCajaChica;
	//public JFormattedTextField jDateChooserfechaAsientoContableCajaChica;

	public JDateChooser jDateChooserfechaAsientoContableCajaChica;
	public JButton jButtonfechaAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPaneles_proveedorAsientoContableCajaChica;
	public JLabel jLabeles_proveedorAsientoContableCajaChica;
	public JCheckBox jCheckBoxes_proveedorAsientoContableCajaChica;
	public JButton jButtones_proveedorAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPaneldetalleAsientoContableCajaChica;
	public JLabel jLabeldetalleAsientoContableCajaChica;
	public JTextArea jTextAreadetalleAsientoContableCajaChica;
	public JScrollPane jscrollPanedetalleAsientoContableCajaChica;
	public JButton jButtondetalleAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAsientoContableCajaChica;
	public JLabel jLabelid_empresaAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAsientoContableCajaChica;
	public JButton jButtonid_empresaAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_empresaAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_empresaAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalAsientoContableCajaChica;
	public JLabel jLabelid_sucursalAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalAsientoContableCajaChica;
	public JButton jButtonid_sucursalAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_sucursalAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioAsientoContableCajaChica;
	public JLabel jLabelid_ejercicioAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioAsientoContableCajaChica;
	public JButton jButtonid_ejercicioAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_ejercicioAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoAsientoContableCajaChica;
	public JLabel jLabelid_periodoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoAsientoContableCajaChica;
	public JButton jButtonid_periodoAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_periodoAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_periodoAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioAsientoContableCajaChica;
	public JLabel jLabelid_usuarioAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioAsientoContableCajaChica;
	public JButton jButtonid_usuarioAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_usuarioAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_anioAsientoContableCajaChica;
	public JLabel jLabelid_anioAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioAsientoContableCajaChica;
	public JButton jButtonid_anioAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_anioAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_anioAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesAsientoContableCajaChica;
	public JLabel jLabelid_mesAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesAsientoContableCajaChica;
	public JButton jButtonid_mesAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_mesAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_mesAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaAsientoContableCajaChica;
	public JLabel jLabelid_monedaAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaAsientoContableCajaChica;
	public JButton jButtonid_monedaAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_monedaAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_monedaAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoAsientoContableCajaChica;
	public JLabel jLabelid_empleadoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoAsientoContableCajaChica;
	public JButton jButtonid_empleadoAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_empleadoAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_asiento_contableAsientoContableCajaChica;
	public JLabel jLabelid_estado_asiento_contableAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_asiento_contableAsientoContableCajaChica;
	public JButton jButtonid_estado_asiento_contableAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_estado_asiento_contableAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_estado_asiento_contableAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteAsientoContableCajaChica;
	public JLabel jLabelid_clienteAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteAsientoContableCajaChica;
	public JButton jButtonid_clienteAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_clienteAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_clienteAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionAsientoContableCajaChica;
	public JLabel jLabelid_transaccionAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionAsientoContableCajaChica;
	public JButton jButtonid_transaccionAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_transaccionAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_transaccionAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documentoAsientoContableCajaChica;
	public JLabel jLabelid_tipo_documentoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoAsientoContableCajaChica;
	public JButton jButtonid_tipo_documentoAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_documentoAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableAsientoContableCajaChica;
	public JLabel jLabelid_cuenta_contableAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableAsientoContableCajaChica;
	public JButton jButtonid_cuenta_contableAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_cuenta_contableAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableAsientoContableCajaChicaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableAsientoContableCajaChicaArbol= new JButtonMe();

	public JPanel jPanelid_moduloAsientoContableCajaChica;
	public JLabel jLabelid_moduloAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloAsientoContableCajaChica;
	public JButton jButtonid_moduloAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_moduloAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_moduloAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoAsientoContableCajaChica;
	public JLabel jLabelid_tipo_movimientoAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoAsientoContableCajaChica;
	public JButton jButtonid_tipo_movimientoAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_movimientoAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloAsientoContableCajaChica;
	public JLabel jLabelid_tipo_transaccion_moduloAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica;
	public JButton jButtonid_tipo_transaccion_moduloAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimiento_moduloAsientoContableCajaChica;
	public JLabel jLabelid_tipo_movimiento_moduloAsientoContableCajaChica;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica;
	public JButton jButtonid_tipo_movimiento_moduloAsientoContableCajaChica= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAsientoContableCajaChica;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1115;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=315;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AsientoContableCajaChicaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAsientoContableCajaChica=new JPanel();
				this.jPanelAccionesFormularioAsientoContableCajaChica=new JPanel();
				this.jmenuBarDetalleAsientoContableCajaChica=new JMenuBar();
				this.jTtoolBarDetalleAsientoContableCajaChica=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableCajaChicaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AsientoContableCajaChicaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableCajaChicaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableCajaChicaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AsientoContableCajaChicaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AsientoContableCajaChica No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAsientoContableCajaChica() {
		return this.jButtonActualizarToolBarAsientoContableCajaChica;
	}
	
	public JButton getjButtonEliminarToolBarAsientoContableCajaChica() {
		return this.jButtonEliminarToolBarAsientoContableCajaChica;
	}
	
	public JButton getjButtonCancelarToolBarAsientoContableCajaChica() {
		return this.jButtonCancelarToolBarAsientoContableCajaChica;
	}		
	
	public JButton getjButtonProcesarInformacionAsientoContableCajaChica() {
		return this.jButtonProcesarInformacionAsientoContableCajaChica;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAsientoContableCajaChica)	{
		this.jButtonProcesarInformacionAsientoContableCajaChica = jButtonProcesarInformacionAsientoContableCajaChica;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAsientoContableCajaChica() {
		return this.jComboBoxTiposAccionesAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAsientoContableCajaChica(
			JComboBox jComboBoxTiposRelacionesAsientoContableCajaChica) {
		this.jComboBoxTiposRelacionesAsientoContableCajaChica = jComboBoxTiposRelacionesAsientoContableCajaChica;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAsientoContableCajaChica(
			JComboBox jComboBoxTiposAccionesAsientoContableCajaChica) {
		this.jComboBoxTiposAccionesAsientoContableCajaChica = jComboBoxTiposAccionesAsientoContableCajaChica;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAsientoContableCajaChica() {
		return this.jComboBoxTiposAccionesFormularioAsientoContableCajaChica;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAsientoContableCajaChica(
			JComboBox jComboBoxTiposAccionesFormularioAsientoContableCajaChica) {
		this.jComboBoxTiposAccionesFormularioAsientoContableCajaChica = jComboBoxTiposAccionesFormularioAsientoContableCajaChica;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.asientocontablecajachicaSessionBean=new AsientoContableCajaChicaSessionBean();
		
		this.asientocontablecajachicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.asientocontablecajachicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detalleasientocontablecajachicaSessionBean=new DetalleAsientoContableCajaChicaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AsientoContableCajaChicaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Asiento Contable Caja Chica MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
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
	
		AsientoContableCajaChicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAsientoContableCajaChica= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAsientoContableCajaChica=new JButtonMe();
				this.jButtonModificarToolBarAsientoContableCajaChica=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"actualizar","actualizar","Actualizar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"eliminar","eliminar","Eliminar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"cancelar","cancelar","Cancelar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAsientoContableCajaChica=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAsientoContableCajaChica,this.jTtoolBarDetalleAsientoContableCajaChica,
							"guardarcambios","guardarcambios","Guardar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAsientoContableCajaChica=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAsientoContableCajaChica=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAsientoContableCajaChica=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAsientoContableCajaChica=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAsientoContableCajaChica=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAsientoContableCajaChica= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAsientoContableCajaChica.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAsientoContableCajaChica,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAsientoContableCajaChica= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAsientoContableCajaChica.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAsientoContableCajaChica,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAsientoContableCajaChica= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAsientoContableCajaChica.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAsientoContableCajaChica,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAsientoContableCajaChica= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAsientoContableCajaChica.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAsientoContableCajaChica,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAsientoContableCajaChica= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAsientoContableCajaChica.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAsientoContableCajaChica,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAsientoContableCajaChica= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAsientoContableCajaChica.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAsientoContableCajaChica,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAsientoContableCajaChica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAsientoContableCajaChica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAsientoContableCajaChica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAsientoContableCajaChica= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAsientoContableCajaChica.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAsientoContableCajaChica,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAsientoContableCajaChica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAsientoContableCajaChica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAsientoContableCajaChica,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAsientoContableCajaChica= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAsientoContableCajaChica.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAsientoContableCajaChica,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAsientoContableCajaChica.add(this.jMenuItemDetalleCerrarAsientoContableCajaChica);
		
		this.jmenuDetalleAccionesAsientoContableCajaChica.add(this.jMenuItemActualizarAsientoContableCajaChica);
		this.jmenuDetalleAccionesAsientoContableCajaChica.add(this.jMenuItemEliminarAsientoContableCajaChica);
		this.jmenuDetalleAccionesAsientoContableCajaChica.add(this.jMenuItemCancelarAsientoContableCajaChica);		
		
		//this.jmenuDetalleDatosAsientoContableCajaChica.add(this.jMenuItemDetalleAbrirOrderByAsientoContableCajaChica);				
		this.jmenuDetalleDatosAsientoContableCajaChica.add(this.jMenuItemDetalleMostarOcultarAsientoContableCajaChica);				
				
		//this.jmenuDetalleAccionesAsientoContableCajaChica.add(this.jMenuItemGuardarCambiosAsientoContableCajaChica);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAsientoContableCajaChica.add(this.jmenuDetalleArchivoAsientoContableCajaChica);		
		this.jmenuBarDetalleAsientoContableCajaChica.add(this.jmenuDetalleAccionesAsientoContableCajaChica);		
		this.jmenuBarDetalleAsientoContableCajaChica.add(this.jmenuDetalleDatosAsientoContableCajaChica);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleAsientoContableCajaChica.add(this.jmenuDetalleAsientoContableCajaChica);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAsientoContableCajaChica);				
	}
	
	
	public void inicializarElementosCamposAsientoContableCajaChica() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAsientoContableCajaChica = new JLabelMe();
		jLabelIdAsientoContableCajaChica.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAsientoContableCajaChica = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAsientoContableCajaChica= new GridBagLayout();

		this.jPanelidAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);

		jLabelidAsientoContableCajaChica = new JLabel();
		jLabelidAsientoContableCajaChica.setText("Id");

		jLabelidAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialAsientoContableCajaChica = new JLabelMe();
		this.jLabelsecuencialAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialAsientoContableCajaChica.setToolTipText("Secuencial");
		this.jLabelsecuencialAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelsecuencialAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jTextFieldsecuencialAsientoContableCajaChica= new JTextFieldMe();
		jTextFieldsecuencialAsientoContableCajaChica.setEnabled(false);
		jTextFieldsecuencialAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsecuencialAsientoContableCajaChica.setText("0");

		this.jButtonsecuencialAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonsecuencialAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonsecuencialAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabelfechaAsientoContableCajaChica = new JLabelMe();
		this.jLabelfechaAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaAsientoContableCajaChica.setToolTipText("Fecha");
		this.jLabelfechaAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelfechaAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		//jFormattedTextFieldfechaAsientoContableCajaChica= new JFormattedTextFieldMe();

		jDateChooserfechaAsientoContableCajaChica= new JDateChooser();
		jDateChooserfechaAsientoContableCajaChica.setEnabled(false);
		jDateChooserfechaAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaAsientoContableCajaChica.setDate(new Date());
		jDateChooserfechaAsientoContableCajaChica.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaAsientoContableCajaChica.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonfechaAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonfechaAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabeles_proveedorAsientoContableCajaChica = new JLabelMe();
		this.jLabeles_proveedorAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_ESPROVEEDOR+" : *");
		this.jLabeles_proveedorAsientoContableCajaChica.setToolTipText("Es Proveedor");
		this.jLabeles_proveedorAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_proveedorAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_proveedorAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_proveedorAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_proveedorAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_proveedorAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_ESPROVEEDOR);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPaneles_proveedorAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jCheckBoxes_proveedorAsientoContableCajaChica= new JCheckBoxMe();
		jCheckBoxes_proveedorAsientoContableCajaChica.setEnabled(false);

		jCheckBoxes_proveedorAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_proveedorAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_proveedorAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_proveedorAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_proveedorAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtones_proveedorAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_proveedorAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_proveedorAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_proveedorAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtones_proveedorAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_proveedorAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_proveedorAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_proveedorAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_proveedorAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_proveedorAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_proveedorAsientoContableCajaChicaBusqueda.setVisible(false);		}


					
		this.jLabeldetalleAsientoContableCajaChica = new JLabelMe();
		this.jLabeldetalleAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_DETALLE+" :");
		this.jLabeldetalleAsientoContableCajaChica.setToolTipText("Detalle");
		this.jLabeldetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPaneldetalleAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jTextAreadetalleAsientoContableCajaChica= new JTextAreaMe();
		jTextAreadetalleAsientoContableCajaChica.setEnabled(false);
		jTextAreadetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,50)));
		jTextAreadetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,50)));
		jTextAreadetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,50)));
		jTextAreadetalleAsientoContableCajaChica.setLineWrap(true);
		jTextAreadetalleAsientoContableCajaChica.setWrapStyleWord(true);
		jTextAreadetalleAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleAsientoContableCajaChica.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleAsientoContableCajaChica = new JScrollPane(jTextAreadetalleAsientoContableCajaChica);
		jscrollPanedetalleAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),35 + FuncionesSwing.getValorProporcion(35,50)));
		jscrollPanedetalleAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),35 + FuncionesSwing.getValorProporcion(35,50)));
		jscrollPanedetalleAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),35 + FuncionesSwing.getValorProporcion(35,50)));

		this.jButtondetalleAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtondetalleAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtondetalleAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleAsientoContableCajaChicaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAsientoContableCajaChica() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_empresaAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAsientoContableCajaChica.setToolTipText("Empresa");
		this.jLabelid_empresaAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_empresaAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_empresaAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_empresaAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_empresaAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_empresaAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_empresaAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsientoContableCajaChica"));

		this.jButtonid_empresaAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_empresaAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_empresaAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_empresaAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_empresaAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_empresaAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_sucursalAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_sucursalAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalAsientoContableCajaChica.setToolTipText("Sucursal");
		this.jLabelid_sucursalAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_sucursalAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_sucursalAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_sucursalAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_sucursalAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_sucursalAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_sucursalAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAsientoContableCajaChica"));

		this.jButtonid_sucursalAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_sucursalAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_sucursalAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_sucursalAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_sucursalAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_ejercicioAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_ejercicioAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioAsientoContableCajaChica.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_ejercicioAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_ejercicioAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_ejercicioAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_ejercicioAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_ejercicioAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_ejercicioAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioAsientoContableCajaChica"));

		this.jButtonid_ejercicioAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_ejercicioAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_ejercicioAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_ejercicioAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_periodoAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_periodoAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoAsientoContableCajaChica.setToolTipText("Periodo");
		this.jLabelid_periodoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_periodoAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_periodoAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_periodoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_periodoAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_periodoAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_periodoAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoAsientoContableCajaChica"));

		this.jButtonid_periodoAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_periodoAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_periodoAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_periodoAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_periodoAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_periodoAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_usuarioAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_usuarioAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioAsientoContableCajaChica.setToolTipText("Usuario");
		this.jLabelid_usuarioAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_usuarioAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_usuarioAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_usuarioAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_usuarioAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_usuarioAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_usuarioAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAsientoContableCajaChica"));

		this.jButtonid_usuarioAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_usuarioAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_usuarioAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_usuarioAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_usuarioAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_usuarioAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_anioAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_anioAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioAsientoContableCajaChica.setToolTipText("Anio");
		this.jLabelid_anioAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_anioAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_anioAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_anioAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_anioAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_anioAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_anioAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioAsientoContableCajaChica"));

		this.jButtonid_anioAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_anioAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_anioAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_anioAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_anioAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_anioAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_mesAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_mesAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesAsientoContableCajaChica.setToolTipText("Mes");
		this.jLabelid_mesAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_mesAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_mesAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_mesAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_mesAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_mesAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_mesAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesAsientoContableCajaChica"));

		this.jButtonid_mesAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_mesAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_mesAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_mesAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_mesAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_mesAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_monedaAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_monedaAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaAsientoContableCajaChica.setToolTipText("Moneda");
		this.jLabelid_monedaAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_monedaAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_monedaAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_monedaAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_monedaAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_monedaAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaAsientoContableCajaChica"));

		this.jButtonid_monedaAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_monedaAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_monedaAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_monedaAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_monedaAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_monedaAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_empleadoAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_empleadoAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoAsientoContableCajaChica.setToolTipText("Empleado");
		this.jLabelid_empleadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_empleadoAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_empleadoAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_empleadoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_empleadoAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_empleadoAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAsientoContableCajaChica"));

		this.jButtonid_empleadoAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_empleadoAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_empleadoAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_empleadoAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_empleadoAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_estado_asiento_contableAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_estado_asiento_contableAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLECAJACHICA+" : *");
		this.jLabelid_estado_asiento_contableAsientoContableCajaChica.setToolTipText("Estado");
		this.jLabelid_estado_asiento_contableAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_asiento_contableAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_asiento_contableAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_asiento_contableAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_asiento_contableAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_asiento_contableAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDESTADOASIENTOCONTABLECAJACHICA);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_estado_asiento_contableAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_estado_asiento_contableAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_estado_asiento_contableAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_asiento_contableAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_asiento_contableAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_asiento_contableAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_asiento_contableAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_estado_asiento_contableAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_asiento_contableAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_asiento_contableAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_asiento_contableAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_estado_asiento_contableAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_asiento_contableAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_asiento_contableAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_asiento_contableAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_asiento_contableAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_asiento_contableAsientoContableCajaChica"));

		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_asiento_contableAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_asiento_contableAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_asiento_contableAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_asiento_contableAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_asiento_contableAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_asiento_contableAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_asiento_contableAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_asiento_contableAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_asiento_contableAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_asiento_contableAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_asiento_contableAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_clienteAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_clienteAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteAsientoContableCajaChica.setToolTipText("Cliente/Prove");
		this.jLabelid_clienteAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_clienteAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_clienteAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_clienteAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_clienteAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_clienteAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAsientoContableCajaChica"));

		this.jButtonid_clienteAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_clienteAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_clienteAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_clienteAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_clienteAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_clienteAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_transaccionAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_transaccionAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionAsientoContableCajaChica.setToolTipText("Tipo");
		this.jLabelid_transaccionAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_transaccionAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_transaccionAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_transaccionAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_transaccionAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_transaccionAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionAsientoContableCajaChica"));

		this.jButtonid_transaccionAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_transaccionAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_transaccionAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_transaccionAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_transaccionAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_transaccionAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_tipo_documentoAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_tipo_documentoAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPODOCUMENTO+" : *");
		this.jLabelid_tipo_documentoAsientoContableCajaChica.setToolTipText("T Documento");
		this.jLabelid_tipo_documentoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documentoAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documentoAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_tipo_documentoAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_tipo_documentoAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_documentoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documentoAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_tipo_documentoAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_tipo_documentoAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documentoAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documentoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoAsientoContableCajaChica"));

		this.jButtonid_tipo_documentoAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_tipo_documentoAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_tipo_documentoAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documentoAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documentoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documentoAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documentoAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_tipo_documentoAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_tipo_documentoAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documentoAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documentoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_cuenta_contableAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_cuenta_contableAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableAsientoContableCajaChica.setToolTipText("Cta Contable");
		this.jLabelid_cuenta_contableAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contableAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contableAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_cuenta_contableAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_cuenta_contableAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_cuenta_contableAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_cuenta_contableAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_cuenta_contableAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableAsientoContableCajaChica"));

		this.jButtonid_cuenta_contableAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_cuenta_contableAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_cuenta_contableAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableAsientoContableCajaChicaUpdate"));


		jButtonid_cuenta_contableAsientoContableCajaChicaArbol= new JButtonMe();
		jButtonid_cuenta_contableAsientoContableCajaChicaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableAsientoContableCajaChicaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableAsientoContableCajaChicaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableAsientoContableCajaChicaArbol.setText("Arbol");
		jButtonid_cuenta_contableAsientoContableCajaChicaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableAsientoContableCajaChicaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableAsientoContableCajaChicaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableAsientoContableCajaChicaArbol"));



					
		this.jLabelid_moduloAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_moduloAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloAsientoContableCajaChica.setToolTipText("Modulo");
		this.jLabelid_moduloAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_moduloAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_moduloAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_moduloAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_moduloAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_moduloAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_moduloAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloAsientoContableCajaChica"));

		this.jButtonid_moduloAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_moduloAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_moduloAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_moduloAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_moduloAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_moduloAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_tipo_movimientoAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_tipo_movimientoAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoAsientoContableCajaChica.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_tipo_movimientoAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_tipo_movimientoAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_movimientoAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_movimientoAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_tipo_movimientoAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_tipo_movimientoAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_tipo_movimientoAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoAsientoContableCajaChica"));

		this.jButtonid_tipo_movimientoAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_tipo_movimientoAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_tipo_movimientoAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloAsientoContableCajaChica.setToolTipText("Tipo Transaccion");
		this.jLabelid_tipo_transaccion_moduloAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_transaccion_moduloAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_transaccion_moduloAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloAsientoContableCajaChica"));

		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloAsientoContableCajaChicaUpdate"));



					
		this.jLabelid_tipo_movimiento_moduloAsientoContableCajaChica = new JLabelMe();
		this.jLabelid_tipo_movimiento_moduloAsientoContableCajaChica.setText(""+AsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO+" : *");
		this.jLabelid_tipo_movimiento_moduloAsientoContableCajaChica.setToolTipText("Movimiento Modulo");
		this.jLabelid_tipo_movimiento_moduloAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimiento_moduloAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimiento_moduloAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimiento_moduloAsientoContableCajaChica=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimiento_moduloAsientoContableCajaChica.setToolTipText(AsientoContableCajaChicaConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
		this.gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		this.jPanelid_tipo_movimiento_moduloAsientoContableCajaChica.setLayout(this.gridaBagLayoutAsientoContableCajaChica);


		jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica.setEnabled(false);

		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChica= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChica.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChica.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChica.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChica.setText("Buscar");
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChica.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChica.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChica,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloAsientoContableCajaChica"));

		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaBusqueda.setText("U");
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloAsientoContableCajaChicaBusqueda"));

		if(this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaUpdate= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaUpdate.setText("U");
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloAsientoContableCajaChicaUpdate"));



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
		//this.jInternalFrameDetalleAsientoContableCajaChica = new AsientoContableCajaChicaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Asiento Contable Caja Chica DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAsientoContableCajaChica= new GridBagLayout();
		

		
		String sToolTipAsientoContableCajaChica="";
		sToolTipAsientoContableCajaChica=AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAsientoContableCajaChica+="(Contabilidad.AsientoContableCajaChica)";
		}
		
		if(!this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			sToolTipAsientoContableCajaChica+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAsientoContableCajaChica = new JButtonMe();
		this.jButtonModificarAsientoContableCajaChica = new JButtonMe();
        this.jButtonActualizarAsientoContableCajaChica = new JButtonMe();
        this.jButtonEliminarAsientoContableCajaChica = new JButtonMe();
        this.jButtonCancelarAsientoContableCajaChica = new JButtonMe();
        this.jButtonGuardarCambiosAsientoContableCajaChica = new JButtonMe();
		this.jButtonGuardarCambiosTablaAsientoContableCajaChica = new JButtonMe();
		this.jButtonCerrarAsientoContableCajaChica = new JButtonMe();
		
		this.jScrollPanelDatosAsientoContableCajaChica = new JScrollPane();   
        this.jScrollPanelDatosEdicionAsientoContableCajaChica = new JScrollPane();
		this.jScrollPanelDatosGeneralAsientoContableCajaChica = new JScrollPane();
				
		
		
		this.jPanelCamposAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Asiento Contable Caja Chica";
		
		if(!this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asiento Contable Caja Chicas" + this.sPath));
		} else {
			this.jScrollPanelDatosAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposAsientoContableCajaChica.setName("jPanelCamposAsientoContableCajaChica"); 

		this.jPanelCamposOcultosAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAsientoContableCajaChica.setName("jPanelCamposOcultosAsientoContableCajaChica"); 

        this.jPanelAccionesAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAsientoContableCajaChica.setToolTipText("Acciones");
        this.jPanelAccionesAsientoContableCajaChica.setName("Acciones"); 

		this.jPanelAccionesFormularioAsientoContableCajaChica.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAsientoContableCajaChica.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAsientoContableCajaChica.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAsientoContableCajaChica.setText("Nuevo");
		this.jButtonModificarAsientoContableCajaChica.setText("Editar");
        this.jButtonActualizarAsientoContableCajaChica.setText("Actualizar");
        this.jButtonEliminarAsientoContableCajaChica.setText("Eliminar");
        this.jButtonCancelarAsientoContableCajaChica.setText("Cancelar");
        this.jButtonGuardarCambiosAsientoContableCajaChica.setText("Guardar");
		this.jButtonGuardarCambiosTablaAsientoContableCajaChica.setText("Guardar");
		this.jButtonCerrarAsientoContableCajaChica.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAsientoContableCajaChica,"nuevo_button","Nuevo",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAsientoContableCajaChica,"modificar_button","Editar",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAsientoContableCajaChica,"actualizar_button","Actualizar",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAsientoContableCajaChica,"eliminar_button","Eliminar",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAsientoContableCajaChica,"cancelar_button","Cancelar",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAsientoContableCajaChica,"guardarcambios_button","Guardar",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAsientoContableCajaChica,"guardarcambiostabla_button","Guardar",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAsientoContableCajaChica,"cerrar_button","Salir",this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAsientoContableCajaChica.setToolTipText("Nuevo"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAsientoContableCajaChica.setToolTipText("Editar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAsientoContableCajaChica.setToolTipText("Actualizar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAsientoContableCajaChica.setToolTipText("Eliminar)"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAsientoContableCajaChica.setToolTipText("Cancelar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAsientoContableCajaChica.setToolTipText("Guardar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAsientoContableCajaChica.setToolTipText("Guardar"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAsientoContableCajaChica.setToolTipText("Salir"+" "+AsientoContableCajaChicaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAsientoContableCajaChica";
		inputMap = this.jButtonNuevoAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAsientoContableCajaChica.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAsientoContableCajaChica"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAsientoContableCajaChica";
		inputMap = this.jButtonActualizarAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAsientoContableCajaChica"));
		
		//ELIMINAR
		sMapKey = "EliminarAsientoContableCajaChica";
		inputMap = this.jButtonEliminarAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAsientoContableCajaChica"));
		
		//CANCELAR	
		sMapKey = "CancelarAsientoContableCajaChica";
		inputMap = this.jButtonCancelarAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAsientoContableCajaChica"));
		
		//CERRAR		
		sMapKey = "CerrarAsientoContableCajaChica";
		inputMap = this.jButtonCerrarAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAsientoContableCajaChica"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAsientoContableCajaChica";
		inputMap = this.jButtonGuardarCambiosTablaAsientoContableCajaChica.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAsientoContableCajaChica.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAsientoContableCajaChica"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAsientoContableCajaChica.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAsientoContableCajaChica.setToolTipText("Nuevo AsientoContableCajaChica");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAsientoContableCajaChica.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAsientoContableCajaChica.setToolTipText("Sin Cerrar Ventana AsientoContableCajaChica");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAsientoContableCajaChica = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAsientoContableCajaChica.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAsientoContableCajaChica.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAsientoContableCajaChica.setText("Accion");
		this.jComboBoxTiposAccionesAsientoContableCajaChica.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAsientoContableCajaChica = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAsientoContableCajaChica.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAsientoContableCajaChica.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAsientoContableCajaChica = new JLabelMe();
		
		this.jLabelAccionesAsientoContableCajaChica.setText("Acciones");		
		this.jLabelAccionesAsientoContableCajaChica.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsientoContableCajaChica.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAsientoContableCajaChica.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAsientoContableCajaChica();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAsientoContableCajaChica();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAsientoContableCajaChica=new JTabbedPane();
		this.jTabbedPaneRelacionesAsientoContableCajaChica.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAsientoContableCajaChica,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAsientoContableCajaChica.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAsientoContableCajaChica.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAsientoContableCajaChica.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAsientoContableCajaChica, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAsientoContableCajaChica = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAsientoContableCajaChica = new GridBagLayout();
		
		this.jPanelCamposAsientoContableCajaChica.setLayout(gridaBagLayoutCamposAsientoContableCajaChica);
		this.jPanelCamposOcultosAsientoContableCajaChica.setLayout(gridaBagLayoutCamposOcultosAsientoContableCajaChica);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAsientoContableCajaChica.add(jLabelIdAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAsientoContableCajaChica.add(jLabelidAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAsientoContableCajaChica.add(jLabelid_empresaAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAsientoContableCajaChica.add(jButtonid_empresaAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAsientoContableCajaChica.add(jButtonid_empresaAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAsientoContableCajaChica.add(jComboBoxid_empresaAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalAsientoContableCajaChica.add(jLabelid_sucursalAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAsientoContableCajaChica.add(jButtonid_sucursalAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAsientoContableCajaChica.add(jButtonid_sucursalAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalAsientoContableCajaChica.add(jComboBoxid_sucursalAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioAsientoContableCajaChica.add(jLabelid_ejercicioAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioAsientoContableCajaChica.add(jButtonid_ejercicioAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioAsientoContableCajaChica.add(jButtonid_ejercicioAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioAsientoContableCajaChica.add(jComboBoxid_ejercicioAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoAsientoContableCajaChica.add(jLabelid_periodoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoAsientoContableCajaChica.add(jButtonid_periodoAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoAsientoContableCajaChica.add(jButtonid_periodoAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoAsientoContableCajaChica.add(jComboBoxid_periodoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioAsientoContableCajaChica.add(jLabelid_usuarioAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioAsientoContableCajaChica.add(jButtonid_usuarioAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioAsientoContableCajaChica.add(jButtonid_usuarioAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioAsientoContableCajaChica.add(jComboBoxid_usuarioAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioAsientoContableCajaChica.add(jLabelid_anioAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioAsientoContableCajaChica.add(jButtonid_anioAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioAsientoContableCajaChica.add(jButtonid_anioAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioAsientoContableCajaChica.add(jComboBoxid_anioAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesAsientoContableCajaChica.add(jLabelid_mesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesAsientoContableCajaChica.add(jButtonid_mesAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesAsientoContableCajaChica.add(jButtonid_mesAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesAsientoContableCajaChica.add(jComboBoxid_mesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialAsientoContableCajaChica.add(jLabelsecuencialAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialAsientoContableCajaChica.add(jButtonsecuencialAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialAsientoContableCajaChica.add(jTextFieldsecuencialAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaAsientoContableCajaChica.add(jLabelid_monedaAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaAsientoContableCajaChica.add(jButtonid_monedaAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaAsientoContableCajaChica.add(jButtonid_monedaAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaAsientoContableCajaChica.add(jComboBoxid_monedaAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaAsientoContableCajaChica.add(jLabelfechaAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaAsientoContableCajaChica.add(jButtonfechaAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaAsientoContableCajaChica.add(jDateChooserfechaAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoAsientoContableCajaChica.add(jLabelid_empleadoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoAsientoContableCajaChica.add(jButtonid_empleadoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoAsientoContableCajaChica.add(jButtonid_empleadoAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 4;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoAsientoContableCajaChica.add(jButtonid_empleadoAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoAsientoContableCajaChica.add(jComboBoxid_empleadoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_asiento_contableAsientoContableCajaChica.add(jLabelid_estado_asiento_contableAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_asiento_contableAsientoContableCajaChica.add(jButtonid_estado_asiento_contableAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_asiento_contableAsientoContableCajaChica.add(jButtonid_estado_asiento_contableAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_asiento_contableAsientoContableCajaChica.add(jComboBoxid_estado_asiento_contableAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_proveedorAsientoContableCajaChica.add(jLabeles_proveedorAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_proveedorAsientoContableCajaChica.add(jButtones_proveedorAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_proveedorAsientoContableCajaChica.add(jCheckBoxes_proveedorAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteAsientoContableCajaChica.add(jLabelid_clienteAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteAsientoContableCajaChica.add(jButtonid_clienteAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteAsientoContableCajaChica.add(jButtonid_clienteAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 4;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteAsientoContableCajaChica.add(jButtonid_clienteAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteAsientoContableCajaChica.add(jComboBoxid_clienteAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transaccionAsientoContableCajaChica.add(jLabelid_transaccionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionAsientoContableCajaChica.add(jButtonid_transaccionAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionAsientoContableCajaChica.add(jButtonid_transaccionAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transaccionAsientoContableCajaChica.add(jComboBoxid_transaccionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documentoAsientoContableCajaChica.add(jLabelid_tipo_documentoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoAsientoContableCajaChica.add(jButtonid_tipo_documentoAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoAsientoContableCajaChica.add(jButtonid_tipo_documentoAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documentoAsientoContableCajaChica.add(jComboBoxid_tipo_documentoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableAsientoContableCajaChica.add(jLabelid_cuenta_contableAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableAsientoContableCajaChica.add(jButtonid_cuenta_contableAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableAsientoContableCajaChica.add(jButtonid_cuenta_contableAsientoContableCajaChicaArbol, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 4;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableAsientoContableCajaChica.add(jButtonid_cuenta_contableAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 5;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableAsientoContableCajaChica.add(jButtonid_cuenta_contableAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableAsientoContableCajaChica.add(jComboBoxid_cuenta_contableAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldetalleAsientoContableCajaChica.add(jLabeldetalleAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleAsientoContableCajaChica.add(jButtondetalleAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldetalleAsientoContableCajaChica.add(jscrollPanedetalleAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloAsientoContableCajaChica.add(jLabelid_moduloAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloAsientoContableCajaChica.add(jButtonid_moduloAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloAsientoContableCajaChica.add(jButtonid_moduloAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloAsientoContableCajaChica.add(jComboBoxid_moduloAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimientoAsientoContableCajaChica.add(jLabelid_tipo_movimientoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoAsientoContableCajaChica.add(jButtonid_tipo_movimientoAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoAsientoContableCajaChica.add(jButtonid_tipo_movimientoAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimientoAsientoContableCajaChica.add(jComboBoxid_tipo_movimientoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_transaccion_moduloAsientoContableCajaChica.add(jLabelid_tipo_transaccion_moduloAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloAsientoContableCajaChica.add(jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloAsientoContableCajaChica.add(jButtonid_tipo_transaccion_moduloAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_transaccion_moduloAsientoContableCajaChica.add(jComboBoxid_tipo_transaccion_moduloAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_movimiento_moduloAsientoContableCajaChica.add(jLabelid_tipo_movimiento_moduloAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 2;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloAsientoContableCajaChica.add(jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaBusqueda, this.gridBagConstraintsAsientoContableCajaChica);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		//this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 3;
		this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
		this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloAsientoContableCajaChica.add(jButtonid_tipo_movimiento_moduloAsientoContableCajaChicaUpdate, this.gridBagConstraintsAsientoContableCajaChica);
	}

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = 1;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_movimiento_moduloAsientoContableCajaChica.add(jComboBoxid_tipo_movimiento_moduloAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsientoContableCajaChica.add(this.jPanelidAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposAsientoContableCajaChica % 3==0) {
		iXPanelCamposAsientoContableCajaChica=0;
		iYPanelCamposAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsientoContableCajaChica.add(this.jPanelsecuencialAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposAsientoContableCajaChica % 3==0) {
		iXPanelCamposAsientoContableCajaChica=0;
		iYPanelCamposAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsientoContableCajaChica.add(this.jPanelid_monedaAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposAsientoContableCajaChica % 3==0) {
		iXPanelCamposAsientoContableCajaChica=0;
		iYPanelCamposAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsientoContableCajaChica.add(this.jPanelfechaAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposAsientoContableCajaChica % 3==0) {
		iXPanelCamposAsientoContableCajaChica=0;
		iYPanelCamposAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsientoContableCajaChica.add(this.jPanelid_empleadoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposAsientoContableCajaChica % 3==0) {
		iXPanelCamposAsientoContableCajaChica=0;
		iYPanelCamposAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsientoContableCajaChica.add(this.jPanelid_estado_asiento_contableAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposAsientoContableCajaChica % 3==0) {
		iXPanelCamposAsientoContableCajaChica=0;
		iYPanelCamposAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsientoContableCajaChica.add(this.jPaneles_proveedorAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposAsientoContableCajaChica % 3==0) {
		iXPanelCamposAsientoContableCajaChica=0;
		iYPanelCamposAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsientoContableCajaChica.add(this.jPanelid_clienteAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposAsientoContableCajaChica % 3==0) {
		iXPanelCamposAsientoContableCajaChica=0;
		iYPanelCamposAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsientoContableCajaChica.add(this.jPanelid_transaccionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposAsientoContableCajaChica % 3==0) {
		iXPanelCamposAsientoContableCajaChica=0;
		iYPanelCamposAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsientoContableCajaChica.add(this.jPanelid_tipo_documentoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposAsientoContableCajaChica % 3==0) {
		iXPanelCamposAsientoContableCajaChica=0;
		iYPanelCamposAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAsientoContableCajaChica.add(this.jPanelid_cuenta_contableAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposAsientoContableCajaChica % 3==0) {
		iXPanelCamposAsientoContableCajaChica=0;
		iYPanelCamposAsientoContableCajaChica++;
	}

	iXPanelCamposAsientoContableCajaChica=0;
	iYPanelCamposAsientoContableCajaChica++;

	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.gridBagConstraintsAsientoContableCajaChica.gridwidth = 3;

	this.jPanelCamposAsientoContableCajaChica.add(this.jPaneldetalleAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposAsientoContableCajaChica % 3==0) {
		iXPanelCamposAsientoContableCajaChica=0;
		iYPanelCamposAsientoContableCajaChica++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposOcultosAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposOcultosAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsientoContableCajaChica.add(this.jPanelid_empresaAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposOcultosAsientoContableCajaChica % 3==0) {
		iXPanelCamposOcultosAsientoContableCajaChica=0;
		iYPanelCamposOcultosAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposOcultosAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposOcultosAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsientoContableCajaChica.add(this.jPanelid_sucursalAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposOcultosAsientoContableCajaChica % 3==0) {
		iXPanelCamposOcultosAsientoContableCajaChica=0;
		iYPanelCamposOcultosAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposOcultosAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposOcultosAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsientoContableCajaChica.add(this.jPanelid_ejercicioAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposOcultosAsientoContableCajaChica % 3==0) {
		iXPanelCamposOcultosAsientoContableCajaChica=0;
		iYPanelCamposOcultosAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposOcultosAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposOcultosAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsientoContableCajaChica.add(this.jPanelid_periodoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposOcultosAsientoContableCajaChica % 3==0) {
		iXPanelCamposOcultosAsientoContableCajaChica=0;
		iYPanelCamposOcultosAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposOcultosAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposOcultosAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsientoContableCajaChica.add(this.jPanelid_usuarioAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposOcultosAsientoContableCajaChica % 3==0) {
		iXPanelCamposOcultosAsientoContableCajaChica=0;
		iYPanelCamposOcultosAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposOcultosAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposOcultosAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsientoContableCajaChica.add(this.jPanelid_anioAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposOcultosAsientoContableCajaChica % 3==0) {
		iXPanelCamposOcultosAsientoContableCajaChica=0;
		iYPanelCamposOcultosAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposOcultosAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposOcultosAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsientoContableCajaChica.add(this.jPanelid_mesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposOcultosAsientoContableCajaChica % 3==0) {
		iXPanelCamposOcultosAsientoContableCajaChica=0;
		iYPanelCamposOcultosAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposOcultosAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposOcultosAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsientoContableCajaChica.add(this.jPanelid_moduloAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposOcultosAsientoContableCajaChica % 3==0) {
		iXPanelCamposOcultosAsientoContableCajaChica=0;
		iYPanelCamposOcultosAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposOcultosAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposOcultosAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsientoContableCajaChica.add(this.jPanelid_tipo_movimientoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposOcultosAsientoContableCajaChica % 3==0) {
		iXPanelCamposOcultosAsientoContableCajaChica=0;
		iYPanelCamposOcultosAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposOcultosAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposOcultosAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsientoContableCajaChica.add(this.jPanelid_tipo_transaccion_moduloAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposOcultosAsientoContableCajaChica % 3==0) {
		iXPanelCamposOcultosAsientoContableCajaChica=0;
		iYPanelCamposOcultosAsientoContableCajaChica++;
	}
	this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
	this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAsientoContableCajaChica.gridy = iYPanelCamposOcultosAsientoContableCajaChica;
	this.gridBagConstraintsAsientoContableCajaChica.gridx = iXPanelCamposOcultosAsientoContableCajaChica++;
	this.gridBagConstraintsAsientoContableCajaChica.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAsientoContableCajaChica.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAsientoContableCajaChica.add(this.jPanelid_tipo_movimiento_moduloAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);



	if(iXPanelCamposOcultosAsientoContableCajaChica % 3==0) {
		iXPanelCamposOcultosAsientoContableCajaChica=0;
		iYPanelCamposOcultosAsientoContableCajaChica++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesAsientoContableCajaChica= new GridBagLayout();
		this.jPanelAccionesAsientoContableCajaChica.setLayout(gridaBagLayoutAccionesAsientoContableCajaChica);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAsientoContableCajaChica= new GridBagLayout();
		this.jPanelAccionesFormularioAsientoContableCajaChica.setLayout(gridaBagLayoutAccionesFormularioAsientoContableCajaChica);
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAsientoContableCajaChica.add(this.jComboBoxTiposAccionesFormularioAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAsientoContableCajaChica.add(this.jCheckBoxPostAccionNuevoAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.asientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAsientoContableCajaChica.add(this.jCheckBoxPostAccionSinCerrarAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.asientocontablecajachicaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAsientoContableCajaChica.add(this.jCheckBoxPostAccionSinMensajeAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccion++;
			
		this.jPanelAccionesAsientoContableCajaChica.add(this.jButtonModificarAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);							

		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;
		this.gridBagConstraintsAsientoContableCajaChica.gridx =iPosXAccion++;
			
		this.jPanelAccionesAsientoContableCajaChica.add(this.jButtonEliminarAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		
			
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccion++;
		
		this.jPanelAccionesAsientoContableCajaChica.add(this.jButtonActualizarAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);


		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = iPosXAccion++;
		
		this.jPanelAccionesAsientoContableCajaChica.add(this.jButtonGuardarCambiosAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);	
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = 0;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx =iPosXAccion++;
		
		this.jPanelAccionesAsientoContableCajaChica.add(this.jButtonCancelarAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAsientoContableCajaChica = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAsientoContableCajaChica);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.asientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();						
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;		
			//this.gridBagConstraintsAsientoContableCajaChica.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAsientoContableCajaChica.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAsientoContableCajaChica.gridx =0;
		this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAsientoContableCajaChica.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AsientoContableCajaChicaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAsientoContableCajaChica = new AsientoContableCajaChicaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Asiento Contable Caja Chica DATOS");
			
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
			
	        //this.setTitle("[FOR] - Asiento Contable Caja Chica DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Asiento Contable Caja Chica Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AsientoContableCajaChicaModel asientocontablecajachicaModel=new AsientoContableCajaChicaModel(this);
			
			//SI USARA CLASE INTERNA
			//AsientoContableCajaChicaModel.AsientoContableCajaChicaFocusTraversalPolicy asientocontablecajachicaFocusTraversalPolicy = asientocontablecajachicaModel.new AsientoContableCajaChicaFocusTraversalPolicy(this);
			
			//asientocontablecajachicaFocusTraversalPolicy.setasientocontablecajachicaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(asientocontablecajachicaModel);
			
			
			this.jContentPaneDetalleAsientoContableCajaChica = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAsientoContableCajaChica = new GridBagLayout();	
			this.jContentPaneDetalleAsientoContableCajaChica.setLayout(gridaBagLayoutDetalleAsientoContableCajaChica);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAsientoContableCajaChica = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
				this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
					
				
				this.jContentPaneDetalleAsientoContableCajaChica.add(jTtoolBarDetalleAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);								
				
}
			
			this.jScrollPanelDatosEdicionAsientoContableCajaChica=   new JScrollPane(jContentPaneDetalleAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAsientoContableCajaChica=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	        
			this.jContentPaneDetalleAsientoContableCajaChica.add(jPanelCamposAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);
			
			
			
			
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
						&& asientocontablecajachicaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleAsientoContableCajaChica(this.puedeCargarPorParteDetalleAsientoContableCajaChica,false,-1);
					
					if(this.asientocontablecajachicaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAsientoContableCajaChica= new GridBagConstraints();
						this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
						this.jContentPaneDetalleAsientoContableCajaChica.add(this.jTabbedPaneRelacionesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAsientoContableCajaChica.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleAsientoContableCajaChica(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAsientoContableCajaChica.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
					this.gridBagConstraintsAsientoContableCajaChica.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
					
				
					this.jContentPaneDetalleAsientoContableCajaChica.add(jPanelCamposOcultosAsientoContableCajaChica, gridBagConstraintsAsientoContableCajaChica);
				
					this.jPanelCamposOcultosAsientoContableCajaChica.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	        this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAsientoContableCajaChica.add(this.jPanelAccionesFormularioAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);							
			
			
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
	        
			
			this.jContentPaneDetalleAsientoContableCajaChica.add(this.jPanelAccionesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAsientoContableCajaChica);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAsientoContableCajaChica=   new JScrollPane(this.jPanelCamposAsientoContableCajaChica,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAsientoContableCajaChica.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsientoContableCajaChica.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAsientoContableCajaChica.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
			this.gridBagConstraintsAsientoContableCajaChica.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAsientoContableCajaChica.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAsientoContableCajaChica.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);			
			
			this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
			this.gridBagConstraintsAsientoContableCajaChica.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
			
			
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		
			
		this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
		this.gridBagConstraintsAsientoContableCajaChica.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAsientoContableCajaChica.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAsientoContableCajaChica, this.gridBagConstraintsAsientoContableCajaChica);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAsientoContableCajaChica;//jContentPane;
		
		return jScrollPanelDatosEdicionAsientoContableCajaChica;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleAsientoContableCajaChica(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleasientocontablecajachicaSessionBean=new DetalleAsientoContableCajaChicaSessionBean();
		this.detalleasientocontablecajachicaSessionBean.setConGuardarRelaciones(false);
		this.detalleasientocontablecajachicaSessionBean.setEsGuardarRelacionado(true);

		this.detalleasientocontablecajachicaBeanSwingJInternalFrame=null;//new DetalleAsientoContableCajaChicaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleasientocontablecajachicaBeanSwingJInternalFramePopup=new DetalleAsientoContableCajaChicaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleasientocontablecajachicaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {

				DetalleAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL=AsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleAsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=AsientoContableCajaChicaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleasientocontablecajachicaSessionBean.setEsGuardarRelacionado(true);

				this.detalleasientocontablecajachicaBeanSwingJInternalFrame=new DetalleAsientoContableCajaChicaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleasientocontablecajachicaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleasientocontablecajachicaBeanSwingJInternalFrame.setdetalleasientocontablecajachicaSessionBean(this.detalleasientocontablecajachicaSessionBean);

				//this.gridBagConstraintsAsientoContableCajaChica = new GridBagConstraints();
				//this.gridBagConstraintsAsientoContableCajaChica.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsAsientoContableCajaChica.gridx = 0;
				//this.jContentPaneDetalleAsientoContableCajaChica.add(this.detalleasientocontablecajachicaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsAsientoContableCajaChica);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesAsientoContableCajaChica.add("Detalle Asiento Contable Caja Chicas",this.detalleasientocontablecajachicaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesAsientoContableCajaChica.setComponentAt(iIndexTab,this.detalleasientocontablecajachicaBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleAsientoContableCajaChicaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleasientocontablecajachicaSessionBean.setEsGuardarRelacionado(false);
				this.detalleasientocontablecajachicaBeanSwingJInternalFrame=null;//new DetalleAsientoContableCajaChicaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleasientocontablecajachicaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleAsientoContableCajaChica) {
					this.jTabbedPaneRelacionesAsientoContableCajaChica.add("Detalle Asiento Contable Caja Chicas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleAsientoContableCajaChicaBeanSwingJInternalFrame(List<AsientoContableCajaChica> asientocontablecajachicas,AsientoContableCajaChica asientocontablecajachica,DetalleAsientoContableCajaChicaBeanSwingJInternalFrame detalleasientocontablecajachicaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleasientocontablecajachicaBeanSwingJInternalFrame=new DetalleAsientoContableCajaChicaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleasientocontablecajachicaBeanSwingJInternalFrame.getDetalleAsientoContableCajaChicaLogic().setConnexion(this.asientocontablecajachicaLogic.getConnexion());

					detalleasientocontablecajachicaBeanSwingJInternalFrame.setasientocontablecajachicasForeignKey(asientocontablecajachicas);
					detalleasientocontablecajachicaBeanSwingJInternalFrame.setasientocontablecajachicaForeignKey(asientocontablecajachica);
					detalleasientocontablecajachicaBeanSwingJInternalFrame.detalleasientocontablecajachicaSessionBean.setisBusquedaDesdeForeignKeySesionAsientoContableCajaChica(true);
					detalleasientocontablecajachicaBeanSwingJInternalFrame.detalleasientocontablecajachicaSessionBean.setlidAsientoContableCajaChicaActual(asientocontablecajachica.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleasientocontablecajachicaBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleAsientoContableCajaChica(detalleasientocontablecajachicaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleasientocontablecajachicaBeanSwingJInternalFrame.setVisibilidadBusquedasParaAsientoContableCajaChica(true);
					detalleasientocontablecajachicaBeanSwingJInternalFrame.setid_asiento_contable_caja_chicaFK_IdAsientoContableCajaChica(asientocontablecajachica.getId());

					if(!this.conCargarFormDetalle) {
						detalleasientocontablecajachicaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleasientocontablecajachicaBeanSwingJInternalFrame.setSelectedItemCombosFrameAsientoContableCajaChicaForeignKey(asientocontablecajachica,1,false,true,true);
					detalleasientocontablecajachicaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleasientocontablecajachicaBeanSwingJInternalFrame.procesarBusqueda("FK_IdAsientoContableCajaChica");
					detalleasientocontablecajachicaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdAsientoContableCajaChica");
					detalleasientocontablecajachicaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleAsientoContableCajaChica(true);
					detalleasientocontablecajachicaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleAsientoContableCajaChica("n",detalleasientocontablecajachicaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleasientocontablecajachicaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleasientocontablecajachicaBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleasientocontablecajachicaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleasientocontablecajachicaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleAsientoContableCajaChica("relacionado");
					} else {
						detalleasientocontablecajachicaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleAsientoContableCajaChica("no_relacionado");
					}

					detalleasientocontablecajachicaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleAsientoContableCajaChica().setVisible(false);

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
