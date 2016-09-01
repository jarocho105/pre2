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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.EstructuraConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class EstructuraDetalleFormJInternalFrame extends EstructuraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstructura;
	
	protected JMenuBar jmenuBarDetalleEstructura;
	
	protected JMenu jmenuDetalleEstructura;
	protected JMenu jmenuDetalleArchivoEstructura;
	protected JMenu jmenuDetalleAccionesEstructura;
	protected JMenu jmenuDetalleDatosEstructura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstructura;	
	protected GridBagConstraints gridBagConstraintsEstructura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstructuraBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstructura;		
	
	public EstructuraBeanSwingJInternalFrameTree jInternalFrameTreeEstructura;	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected TipoPago_NMBeanSwingJInternalFrame tipopago_nmBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipopago_nm="";

	protected NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_numeropatronal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected TipoEstructuraBeanSwingJInternalFrame tipoestructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoestructura="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";
	
	public EstructuraSessionBean estructuraSessionBean;
	
	

	public CentroCostoEstructuraBeanSwingJInternalFrame centrocostoestructuraBeanSwingJInternalFrame=null;
	public CentroCostoEstructuraBeanSwingJInternalFrame centrocostoestructuraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCentroCostoEstructura=false;
	public CentroCostoEstructuraSessionBean centrocostoestructuraSessionBean;

	public PlaniVacacionBeanSwingJInternalFrame planivacacionBeanSwingJInternalFrame=null;
	public PlaniVacacionBeanSwingJInternalFrame planivacacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePlaniVacacion=false;
	public PlaniVacacionSessionBean planivacacionSessionBean;

	public AsistenciaMensualBeanSwingJInternalFrame asistenciamensualBeanSwingJInternalFrame=null;
	public AsistenciaMensualBeanSwingJInternalFrame asistenciamensualBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAsistenciaMensual=false;
	public AsistenciaMensualSessionBean asistenciamensualSessionBean;

	public EmpleadoProcesoRubroBeanSwingJInternalFrame empleadoprocesorubroBeanSwingJInternalFrame=null;
	public EmpleadoProcesoRubroBeanSwingJInternalFrame empleadoprocesorubroBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoProcesoRubro=false;
	public EmpleadoProcesoRubroSessionBean empleadoprocesorubroSessionBean;

	public EmpleadoPagoRubroBeanSwingJInternalFrame empleadopagorubroBeanSwingJInternalFrame=null;
	public EmpleadoPagoRubroBeanSwingJInternalFrame empleadopagorubroBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoPagoRubro=false;
	public EmpleadoPagoRubroSessionBean empleadopagorubroSessionBean;

	public ProvisionEmpleadoBeanSwingJInternalFrame provisionempleadoBeanSwingJInternalFrame=null;
	public ProvisionEmpleadoBeanSwingJInternalFrame provisionempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProvisionEmpleado=false;
	public ProvisionEmpleadoSessionBean provisionempleadoSessionBean;

	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;
	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleado=false;
	public EmpleadoSessionBean empleadoSessionBean;

	//public EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=null;
	public EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEstructura=false;

	public EvaluacionEmpleadoBeanSwingJInternalFrame evaluacionempleadoBeanSwingJInternalFrame=null;
	public EvaluacionEmpleadoBeanSwingJInternalFrame evaluacionempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEvaluacionEmpleado=false;
	public EvaluacionEmpleadoSessionBean evaluacionempleadoSessionBean;

	public EmpleadoImpuestoRentaBeanSwingJInternalFrame empleadoimpuestorentaBeanSwingJInternalFrame=null;
	public EmpleadoImpuestoRentaBeanSwingJInternalFrame empleadoimpuestorentaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoImpuestoRenta=false;
	public EmpleadoImpuestoRentaSessionBean empleadoimpuestorentaSessionBean;

	public RubroEstructuraBeanSwingJInternalFrame rubroestructuraBeanSwingJInternalFrame=null;
	public RubroEstructuraBeanSwingJInternalFrame rubroestructuraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRubroEstructura=false;
	public RubroEstructuraSessionBean rubroestructuraSessionBean;

	public CierreRolMensualBeanSwingJInternalFrame cierrerolmensualBeanSwingJInternalFrame=null;
	public CierreRolMensualBeanSwingJInternalFrame cierrerolmensualBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCierreRolMensual=false;
	public CierreRolMensualSessionBean cierrerolmensualSessionBean;

	public FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame=null;
	public FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormatoNomi=false;
	public FormatoNomiSessionBean formatonomiSessionBean;

	public EmpleadoEstructuraBeanSwingJInternalFrame empleadoestructuraBeanSwingJInternalFrame=null;
	public EmpleadoEstructuraBeanSwingJInternalFrame empleadoestructuraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoEstructura=false;
	public EmpleadoEstructuraSessionBean empleadoestructuraSessionBean;

	public HistorialPagoNomiBeanSwingJInternalFrame historialpagonomiBeanSwingJInternalFrame=null;
	public HistorialPagoNomiBeanSwingJInternalFrame historialpagonomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteHistorialPagoNomi=false;
	public HistorialPagoNomiSessionBean historialpagonomiSessionBean;

	public AsistenciaDiariaBeanSwingJInternalFrame asistenciadiariaBeanSwingJInternalFrame=null;
	public AsistenciaDiariaBeanSwingJInternalFrame asistenciadiariaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAsistenciaDiaria=false;
	public AsistenciaDiariaSessionBean asistenciadiariaSessionBean;

	public FuncionEstrucBeanSwingJInternalFrame funcionestrucBeanSwingJInternalFrame=null;
	public FuncionEstrucBeanSwingJInternalFrame funcionestrucBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFuncionEstruc=false;
	public FuncionEstrucSessionBean funcionestrucSessionBean;

	public SolicitudReemplazoBeanSwingJInternalFrame solicitudreemplazoBeanSwingJInternalFrame=null;
	public SolicitudReemplazoBeanSwingJInternalFrame solicitudreemplazoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSolicitudReemplazo=false;
	public SolicitudReemplazoSessionBean solicitudreemplazoSessionBean;

	public SolicitudHoraExtraBeanSwingJInternalFrame solicitudhoraextraBeanSwingJInternalFrame=null;
	public SolicitudHoraExtraBeanSwingJInternalFrame solicitudhoraextraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSolicitudHoraExtra=false;
	public SolicitudHoraExtraSessionBean solicitudhoraextraSessionBean;

	public EvaluacionNomiBeanSwingJInternalFrame evaluacionnomiBeanSwingJInternalFrame=null;
	public EvaluacionNomiBeanSwingJInternalFrame evaluacionnomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEvaluacionNomi=false;
	public EvaluacionNomiSessionBean evaluacionnomiSessionBean;

	public SolicitudVacacionBeanSwingJInternalFrame solicitudvacacionBeanSwingJInternalFrame=null;
	public SolicitudVacacionBeanSwingJInternalFrame solicitudvacacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSolicitudVacacion=false;
	public SolicitudVacacionSessionBean solicitudvacacionSessionBean;

	public ResponsableActivoFijoBeanSwingJInternalFrame responsableactivofijoBeanSwingJInternalFrame=null;
	public ResponsableActivoFijoBeanSwingJInternalFrame responsableactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteResponsableActivoFijo=false;
	public ResponsableActivoFijoSessionBean responsableactivofijoSessionBean;

	public RubroEmpleaCuentaContableBeanSwingJInternalFrame rubroempleacuentacontableBeanSwingJInternalFrame=null;
	public RubroEmpleaCuentaContableBeanSwingJInternalFrame rubroempleacuentacontableBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRubroEmpleaCuentaContable=false;
	public RubroEmpleaCuentaContableSessionBean rubroempleacuentacontableSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoPago_NMSessionBean tipopago_nmSessionBean;
	public NumeroPatronalSessionBean numeropatronalSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public TipoEstructuraSessionBean tipoestructuraSessionBean;
	public PaisSessionBean paisSessionBean;
	public CiudadSessionBean ciudadSessionBean;	
	
	public EstructuraLogic estructuraLogic;
	
	public JScrollPane jScrollPanelDatosEstructura;
	public JScrollPane jScrollPanelDatosEdicionEstructura;
	public JScrollPane jScrollPanelDatosGeneralEstructura;
	
	protected JPanel jPanelCamposEstructura;    
	protected JPanel jPanelCamposOcultosEstructura;    	
	protected JPanel jPanelAccionesEstructura;
	protected JPanel jPanelAccionesFormularioEstructura;
    
	
	
	protected Integer iXPanelCamposEstructura=0;
	protected Integer iYPanelCamposEstructura=0;
	
	protected Integer iXPanelCamposOcultosEstructura=0;
	protected Integer iYPanelCamposOcultosEstructura=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstructura;
	public JButton jButtonModificarEstructura;
	public JButton jButtonActualizarEstructura;
    public JButton jButtonEliminarEstructura;
	public JButton jButtonCancelarEstructura;
    public JButton jButtonGuardarCambiosEstructura;
	public JButton jButtonGuardarCambiosTablaEstructura;
	protected JButton jButtonCerrarEstructura;
	
	
	protected JButton jButtonProcesarInformacionEstructura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstructura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstructura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstructura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstructura;
	protected JButton jButtonModificarToolBarEstructura;
	protected JButton jButtonActualizarToolBarEstructura;
    protected JButton jButtonEliminarToolBarEstructura;
	protected JButton jButtonCancelarToolBarEstructura;
    protected JButton jButtonGuardarCambiosToolBarEstructura;
	protected JButton jButtonGuardarCambiosTablaToolBarEstructura;
	protected JButton jButtonMostrarOcultarTablaToolBarEstructura;
	protected JButton jButtonCerrarToolBarEstructura;
	
	protected JButton jButtonProcesarInformacionToolBarEstructura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstructura;
	protected JMenuItem jMenuItemModificarEstructura;
	protected JMenuItem jMenuItemActualizarEstructura;
    protected JMenuItem jMenuItemEliminarEstructura;
	protected JMenuItem jMenuItemCancelarEstructura;
    protected JMenuItem jMenuItemGuardarCambiosEstructura;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstructura;
	protected JMenuItem jMenuItemCerrarEstructura;
	protected JMenuItem jMenuItemDetalleCerrarEstructura;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstructura;
	
	protected JMenuItem jMenuItemProcesarInformacionEstructura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstructura;
	protected JMenuItem jMenuItemMostrarOcultarEstructura;
	
	
	//MENU
	
	protected JButton jButtonArbolEstructura;	
	
	protected JLabel jLabelAccionesEstructura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstructura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstructura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstructura;
	public JLabel jLabelIdEstructura;
	public JLabel jLabelidEstructura;
	public JButton jButtonidEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstructura;
	public JLabel jLabelcodigoEstructura;
	public JTextField jTextFieldcodigoEstructura;
	public JButton jButtoncodigoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelnumeroEstructura;
	public JLabel jLabelnumeroEstructura;
	public JTextField jTextFieldnumeroEstructura;
	public JButton jButtonnumeroEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelvalor_anticipoEstructura;
	public JLabel jLabelvalor_anticipoEstructura;
	public JTextField jTextFieldvalor_anticipoEstructura;
	public JButton jButtonvalor_anticipoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_anticipoEstructura;
	public JLabel jLabelporcentaje_anticipoEstructura;
	public JTextField jTextFieldporcentaje_anticipoEstructura;
	public JButton jButtonporcentaje_anticipoEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstructura;
	public JLabel jLabelnombreEstructura;
	public JTextArea jTextAreanombreEstructura;
	public JScrollPane jscrollPanenombreEstructura;
	public JButton jButtonnombreEstructuraBusqueda= new JButtonMe();

	public JPanel jPaneles_jefeEstructura;
	public JLabel jLabeles_jefeEstructura;
	public JCheckBox jCheckBoxes_jefeEstructura;
	public JButton jButtones_jefeEstructuraBusqueda= new JButtonMe();

	public JPanel jPaneles_anualEstructura;
	public JLabel jLabeles_anualEstructura;
	public JCheckBox jCheckBoxes_anualEstructura;
	public JButton jButtones_anualEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeEstructura;
	public JLabel jLabelporcentajeEstructura;
	public JTextField jTextFieldporcentajeEstructura;
	public JButton jButtonporcentajeEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelvalorEstructura;
	public JLabel jLabelvalorEstructura;
	public JTextField jTextFieldvalorEstructura;
	public JButton jButtonvalorEstructuraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEstructura;
	public JLabel jLabelid_empresaEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEstructura;
	public JButton jButtonid_empresaEstructura= new JButtonMe();
	public JButton jButtonid_empresaEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_empresaEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalEstructura;
	public JLabel jLabelid_sucursalEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalEstructura;
	public JButton jButtonid_sucursalEstructura= new JButtonMe();
	public JButton jButtonid_sucursalEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraEstructura;
	public JLabel jLabelid_estructuraEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraEstructura;
	public JButton jButtonid_estructuraEstructura= new JButtonMe();
	public JButton jButtonid_estructuraEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_estructuraEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraEstructuraArbol= new JButtonMe();

	public JPanel jPanelid_tipo_pago__n_mEstructura;
	public JLabel jLabelid_tipo_pago__n_mEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_pago__n_mEstructura;
	public JButton jButtonid_tipo_pago__n_mEstructura= new JButtonMe();
	public JButton jButtonid_tipo_pago__n_mEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_pago__n_mEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_numero_patronalEstructura;
	public JLabel jLabelid_numero_patronalEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_numero_patronalEstructura;
	public JButton jButtonid_numero_patronalEstructura= new JButtonMe();
	public JButton jButtonid_numero_patronalEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_numero_patronalEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableEstructura;
	public JLabel jLabelid_cuenta_contableEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableEstructura;
	public JButton jButtonid_cuenta_contableEstructura= new JButtonMe();
	public JButton jButtonid_cuenta_contableEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableEstructuraArbol= new JButtonMe();

	public JPanel jPanelid_tipo_estructuraEstructura;
	public JLabel jLabelid_tipo_estructuraEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_estructuraEstructura;
	public JButton jButtonid_tipo_estructuraEstructura= new JButtonMe();
	public JButton jButtonid_tipo_estructuraEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_estructuraEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_paisEstructura;
	public JLabel jLabelid_paisEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisEstructura;
	public JButton jButtonid_paisEstructura= new JButtonMe();
	public JButton jButtonid_paisEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_paisEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadEstructura;
	public JLabel jLabelid_ciudadEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadEstructura;
	public JButton jButtonid_ciudadEstructura= new JButtonMe();
	public JButton jButtonid_ciudadEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_ciudadEstructuraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstructura;
	
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
		
	public int iWidthFormulario=945;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EstructuraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstructura=new JPanel();
				this.jPanelAccionesFormularioEstructura=new JPanel();
				this.jmenuBarDetalleEstructura=new JMenuBar();
				this.jTtoolBarDetalleEstructura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstructuraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Estructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstructuraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Estructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstructuraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Estructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstructuraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Estructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstructuraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Estructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstructura() {
		return this.jButtonActualizarToolBarEstructura;
	}
	
	public JButton getjButtonEliminarToolBarEstructura() {
		return this.jButtonEliminarToolBarEstructura;
	}
	
	public JButton getjButtonCancelarToolBarEstructura() {
		return this.jButtonCancelarToolBarEstructura;
	}		
	
	public JButton getjButtonProcesarInformacionEstructura() {
		return this.jButtonProcesarInformacionEstructura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstructura)	{
		this.jButtonProcesarInformacionEstructura = jButtonProcesarInformacionEstructura;
	}
	
	
	public JButton getjButtonArbolEstructura() {
		return this.jButtonArbolEstructura;
	}
	
	public void setjButtonArbol(JButton jButtonArbolEstructura)	{
		this.jButtonArbolEstructura = jButtonArbolEstructura;
	}
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstructura() {
		return this.jComboBoxTiposAccionesEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstructura(
			JComboBox jComboBoxTiposRelacionesEstructura) {
		this.jComboBoxTiposRelacionesEstructura = jComboBoxTiposRelacionesEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstructura(
			JComboBox jComboBoxTiposAccionesEstructura) {
		this.jComboBoxTiposAccionesEstructura = jComboBoxTiposAccionesEstructura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstructura() {
		return this.jComboBoxTiposAccionesFormularioEstructura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstructura(
			JComboBox jComboBoxTiposAccionesFormularioEstructura) {
		this.jComboBoxTiposAccionesFormularioEstructura = jComboBoxTiposAccionesFormularioEstructura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estructuraSessionBean=new EstructuraSessionBean();
		
		this.estructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estructuraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
		//this.planivacacionSessionBean=new PlaniVacacionSessionBean();
		//this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
		//this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
		//this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
		//this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
		//this.empleadoSessionBean=new EmpleadoSessionBean();
		//this.estructuraSessionBean=new EstructuraSessionBean();
		//this.evaluacionempleadoSessionBean=new EvaluacionEmpleadoSessionBean();
		//this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
		//this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
		//this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
		//this.formatonomiSessionBean=new FormatoNomiSessionBean();
		//this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
		//this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
		//this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
		//this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
		//this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
		//this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
		//this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
		//this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
		//this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
		//this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstructuraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estructura MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estructuraSessionBean.getEsGuardarRelacionado()) {
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
	
		EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstructura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstructura=new JButtonMe();
				this.jButtonModificarToolBarEstructura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstructura,this.jTtoolBarDetalleEstructura,
							"actualizar","actualizar","Actualizar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstructura,this.jTtoolBarDetalleEstructura,
							"eliminar","eliminar","Eliminar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstructura,this.jTtoolBarDetalleEstructura,
							"cancelar","cancelar","Cancelar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstructura,this.jTtoolBarDetalleEstructura,
							"guardarcambios","guardarcambios","Guardar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstructura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstructura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstructura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstructura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstructura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstructura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstructura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstructura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstructura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstructura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstructura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstructura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstructura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstructura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstructura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstructura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstructura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstructura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstructura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstructura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstructura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstructura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstructura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstructura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstructura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstructura.add(this.jMenuItemDetalleCerrarEstructura);
		
		this.jmenuDetalleAccionesEstructura.add(this.jMenuItemActualizarEstructura);
		this.jmenuDetalleAccionesEstructura.add(this.jMenuItemEliminarEstructura);
		this.jmenuDetalleAccionesEstructura.add(this.jMenuItemCancelarEstructura);		
		
		//this.jmenuDetalleDatosEstructura.add(this.jMenuItemDetalleAbrirOrderByEstructura);				
		this.jmenuDetalleDatosEstructura.add(this.jMenuItemDetalleMostarOcultarEstructura);				
				
		//this.jmenuDetalleAccionesEstructura.add(this.jMenuItemGuardarCambiosEstructura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstructura.add(this.jmenuDetalleArchivoEstructura);		
		this.jmenuBarDetalleEstructura.add(this.jmenuDetalleAccionesEstructura);		
		this.jmenuBarDetalleEstructura.add(this.jmenuDetalleDatosEstructura);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstructura.add(this.jmenuDetalleEstructura);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstructura);				
	}
	
	
	public void inicializarElementosCamposEstructura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstructura = new JLabelMe();
		jLabelIdEstructura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstructura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstructura= new GridBagLayout();

		this.jPanelidEstructura.setLayout(this.gridaBagLayoutEstructura);

		jLabelidEstructura = new JLabel();
		jLabelidEstructura.setText("Id");

		jLabelidEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstructura = new JLabelMe();
		this.jLabelcodigoEstructura.setText(""+EstructuraConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstructura.setToolTipText("Codigo");
		this.jLabelcodigoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelcodigoEstructura.setLayout(this.gridaBagLayoutEstructura);


		jTextFieldcodigoEstructura= new JTextFieldMe();

		jTextFieldcodigoEstructura.setEnabled(false);
		jTextFieldcodigoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstructuraBusqueda= new JButtonMe();
		this.jButtoncodigoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstructuraBusqueda.setText("U");
		this.jButtoncodigoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstructuraBusqueda.setVisible(false);		}


					
		this.jLabelnumeroEstructura = new JLabelMe();
		this.jLabelnumeroEstructura.setText(""+EstructuraConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroEstructura.setToolTipText("Numero");
		this.jLabelnumeroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelnumeroEstructura.setLayout(this.gridaBagLayoutEstructura);


		jTextFieldnumeroEstructura= new JTextFieldMe();

		jTextFieldnumeroEstructura.setEnabled(false);
		jTextFieldnumeroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroEstructuraBusqueda= new JButtonMe();
		this.jButtonnumeroEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroEstructuraBusqueda.setText("U");
		this.jButtonnumeroEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroEstructuraBusqueda.setVisible(false);		}


					
		this.jLabelvalor_anticipoEstructura = new JLabelMe();
		this.jLabelvalor_anticipoEstructura.setText(""+EstructuraConstantesFunciones.LABEL_VALORANTICIPO+" : *");
		this.jLabelvalor_anticipoEstructura.setToolTipText("Valor Anticipo");
		this.jLabelvalor_anticipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_anticipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_anticipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_anticipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_anticipoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_anticipoEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_VALORANTICIPO);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelvalor_anticipoEstructura.setLayout(this.gridaBagLayoutEstructura);


		jTextFieldvalor_anticipoEstructura= new JTextFieldMe();
		jTextFieldvalor_anticipoEstructura.setEnabled(false);
		jTextFieldvalor_anticipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_anticipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_anticipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_anticipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_anticipoEstructura.setText("0.0");

		this.jButtonvalor_anticipoEstructuraBusqueda= new JButtonMe();
		this.jButtonvalor_anticipoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_anticipoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_anticipoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_anticipoEstructuraBusqueda.setText("U");
		this.jButtonvalor_anticipoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_anticipoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_anticipoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_anticipoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_anticipoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_anticipoEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_anticipoEstructuraBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_anticipoEstructura = new JLabelMe();
		this.jLabelporcentaje_anticipoEstructura.setText(""+EstructuraConstantesFunciones.LABEL_PORCENTAJEANTICIPO+" : *");
		this.jLabelporcentaje_anticipoEstructura.setToolTipText("Porcentaje Anticipo");
		this.jLabelporcentaje_anticipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_anticipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_anticipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_anticipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_anticipoEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_anticipoEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_PORCENTAJEANTICIPO);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelporcentaje_anticipoEstructura.setLayout(this.gridaBagLayoutEstructura);


		jTextFieldporcentaje_anticipoEstructura= new JTextFieldMe();
		jTextFieldporcentaje_anticipoEstructura.setEnabled(false);
		jTextFieldporcentaje_anticipoEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_anticipoEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_anticipoEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_anticipoEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_anticipoEstructura.setText("0.0");

		this.jButtonporcentaje_anticipoEstructuraBusqueda= new JButtonMe();
		this.jButtonporcentaje_anticipoEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_anticipoEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_anticipoEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_anticipoEstructuraBusqueda.setText("U");
		this.jButtonporcentaje_anticipoEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_anticipoEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_anticipoEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_anticipoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_anticipoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_anticipoEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_anticipoEstructuraBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstructura = new JLabelMe();
		this.jLabelnombreEstructura.setText(""+EstructuraConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstructura.setToolTipText("Nombre");
		this.jLabelnombreEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelnombreEstructura.setLayout(this.gridaBagLayoutEstructura);


		jTextAreanombreEstructura= new JTextAreaMe();
		jTextAreanombreEstructura.setEnabled(false);
		jTextAreanombreEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstructura.setLineWrap(true);
		jTextAreanombreEstructura.setWrapStyleWord(true);
		jTextAreanombreEstructura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstructura.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstructura = new JScrollPane(jTextAreanombreEstructura);
		jscrollPanenombreEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstructuraBusqueda= new JButtonMe();
		this.jButtonnombreEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstructuraBusqueda.setText("U");
		this.jButtonnombreEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstructuraBusqueda.setVisible(false);		}


					
		this.jLabeles_jefeEstructura = new JLabelMe();
		this.jLabeles_jefeEstructura.setText(""+EstructuraConstantesFunciones.LABEL_ESJEFE+" : *");
		this.jLabeles_jefeEstructura.setToolTipText("Es Jefe");
		this.jLabeles_jefeEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_jefeEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_jefeEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_jefeEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_jefeEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_jefeEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_ESJEFE);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPaneles_jefeEstructura.setLayout(this.gridaBagLayoutEstructura);


		jCheckBoxes_jefeEstructura= new JCheckBoxMe();
		jCheckBoxes_jefeEstructura.setEnabled(false);

		jCheckBoxes_jefeEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_jefeEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_jefeEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_jefeEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_jefeEstructuraBusqueda= new JButtonMe();
		this.jButtones_jefeEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_jefeEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_jefeEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_jefeEstructuraBusqueda.setText("U");
		this.jButtones_jefeEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_jefeEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_jefeEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_jefeEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_jefeEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_jefeEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_jefeEstructuraBusqueda.setVisible(false);		}


					
		this.jLabeles_anualEstructura = new JLabelMe();
		this.jLabeles_anualEstructura.setText(""+EstructuraConstantesFunciones.LABEL_ESANUAL+" : *");
		this.jLabeles_anualEstructura.setToolTipText("Es Anual Exacto");
		this.jLabeles_anualEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_anualEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_anualEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_anualEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_anualEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_anualEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_ESANUAL);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPaneles_anualEstructura.setLayout(this.gridaBagLayoutEstructura);


		jCheckBoxes_anualEstructura= new JCheckBoxMe();
		jCheckBoxes_anualEstructura.setEnabled(false);

		jCheckBoxes_anualEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_anualEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_anualEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_anualEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_anualEstructuraBusqueda= new JButtonMe();
		this.jButtones_anualEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_anualEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_anualEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_anualEstructuraBusqueda.setText("U");
		this.jButtones_anualEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_anualEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_anualEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_anualEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_anualEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_anualEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_anualEstructuraBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeEstructura = new JLabelMe();
		this.jLabelporcentajeEstructura.setText(""+EstructuraConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeEstructura.setToolTipText("Porcentaje");
		this.jLabelporcentajeEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelporcentajeEstructura.setLayout(this.gridaBagLayoutEstructura);


		jTextFieldporcentajeEstructura= new JTextFieldMe();
		jTextFieldporcentajeEstructura.setEnabled(false);
		jTextFieldporcentajeEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeEstructura.setText("0.0");

		this.jButtonporcentajeEstructuraBusqueda= new JButtonMe();
		this.jButtonporcentajeEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeEstructuraBusqueda.setText("U");
		this.jButtonporcentajeEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeEstructuraBusqueda.setVisible(false);		}


					
		this.jLabelvalorEstructura = new JLabelMe();
		this.jLabelvalorEstructura.setText(""+EstructuraConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorEstructura.setToolTipText("Valor");
		this.jLabelvalorEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelvalorEstructura.setLayout(this.gridaBagLayoutEstructura);


		jTextFieldvalorEstructura= new JTextFieldMe();
		jTextFieldvalorEstructura.setEnabled(false);
		jTextFieldvalorEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorEstructura.setText("0.0");

		this.jButtonvalorEstructuraBusqueda= new JButtonMe();
		this.jButtonvalorEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorEstructuraBusqueda.setText("U");
		this.jButtonvalorEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorEstructuraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstructura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEstructura = new JLabelMe();
		this.jLabelid_empresaEstructura.setText(""+EstructuraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEstructura.setToolTipText("Empresa");
		this.jLabelid_empresaEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelid_empresaEstructura.setLayout(this.gridaBagLayoutEstructura);


		jComboBoxid_empresaEstructura= new JComboBoxMe();
		jComboBoxid_empresaEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEstructura.setEnabled(false);

		this.jButtonid_empresaEstructura= new JButtonMe();
		this.jButtonid_empresaEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstructura.setText("Buscar");
		this.jButtonid_empresaEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstructura"));

		this.jButtonid_empresaEstructuraBusqueda= new JButtonMe();
		this.jButtonid_empresaEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstructuraBusqueda.setText("U");
		this.jButtonid_empresaEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_empresaEstructuraUpdate= new JButtonMe();
		this.jButtonid_empresaEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstructuraUpdate.setText("U");
		this.jButtonid_empresaEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstructuraUpdate"));



					
		this.jLabelid_sucursalEstructura = new JLabelMe();
		this.jLabelid_sucursalEstructura.setText(""+EstructuraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalEstructura.setToolTipText("Sucursal");
		this.jLabelid_sucursalEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelid_sucursalEstructura.setLayout(this.gridaBagLayoutEstructura);


		jComboBoxid_sucursalEstructura= new JComboBoxMe();
		jComboBoxid_sucursalEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalEstructura.setEnabled(false);

		this.jButtonid_sucursalEstructura= new JButtonMe();
		this.jButtonid_sucursalEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalEstructura.setText("Buscar");
		this.jButtonid_sucursalEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEstructura"));

		this.jButtonid_sucursalEstructuraBusqueda= new JButtonMe();
		this.jButtonid_sucursalEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEstructuraBusqueda.setText("U");
		this.jButtonid_sucursalEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalEstructuraUpdate= new JButtonMe();
		this.jButtonid_sucursalEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalEstructuraUpdate.setText("U");
		this.jButtonid_sucursalEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalEstructuraUpdate"));



					
		this.jLabelid_estructuraEstructura = new JLabelMe();
		this.jLabelid_estructuraEstructura.setText(""+EstructuraConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraEstructura.setToolTipText("Estructura Padre");
		this.jLabelid_estructuraEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estructuraEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estructuraEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelid_estructuraEstructura.setLayout(this.gridaBagLayoutEstructura);


		jComboBoxid_estructuraEstructura= new JComboBoxMe();
		jComboBoxid_estructuraEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraEstructura= new JButtonMe();
		this.jButtonid_estructuraEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraEstructura.setText("Buscar");
		this.jButtonid_estructuraEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEstructura"));

		this.jButtonid_estructuraEstructuraBusqueda= new JButtonMe();
		this.jButtonid_estructuraEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEstructuraBusqueda.setText("U");
		this.jButtonid_estructuraEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_estructuraEstructuraUpdate= new JButtonMe();
		this.jButtonid_estructuraEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraEstructuraUpdate.setText("U");
		this.jButtonid_estructuraEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEstructuraUpdate"));


		jButtonid_estructuraEstructuraArbol= new JButtonMe();
		jButtonid_estructuraEstructuraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEstructuraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEstructuraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraEstructuraArbol.setText("Arbol");
		jButtonid_estructuraEstructuraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraEstructuraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraEstructuraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraEstructuraArbol"));



					
		this.jLabelid_tipo_pago__n_mEstructura = new JLabelMe();
		this.jLabelid_tipo_pago__n_mEstructura.setText(""+EstructuraConstantesFunciones.LABEL_IDTIPOPAGO_NM+" : *");
		this.jLabelid_tipo_pago__n_mEstructura.setToolTipText("Tipo Pago_ N M");
		this.jLabelid_tipo_pago__n_mEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_pago__n_mEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_pago__n_mEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_pago__n_mEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_pago__n_mEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_pago__n_mEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_IDTIPOPAGO_NM);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelid_tipo_pago__n_mEstructura.setLayout(this.gridaBagLayoutEstructura);


		jComboBoxid_tipo_pago__n_mEstructura= new JComboBoxMe();
		jComboBoxid_tipo_pago__n_mEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_pago__n_mEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_pago__n_mEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_pago__n_mEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_pago__n_mEstructura= new JButtonMe();
		this.jButtonid_tipo_pago__n_mEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_pago__n_mEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_pago__n_mEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_pago__n_mEstructura.setText("Buscar");
		this.jButtonid_tipo_pago__n_mEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_pago__n_mEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_pago__n_mEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_pago__n_mEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_pago__n_mEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_pago__n_mEstructura"));

		this.jButtonid_tipo_pago__n_mEstructuraBusqueda= new JButtonMe();
		this.jButtonid_tipo_pago__n_mEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_pago__n_mEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_pago__n_mEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_pago__n_mEstructuraBusqueda.setText("U");
		this.jButtonid_tipo_pago__n_mEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_pago__n_mEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_pago__n_mEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_pago__n_mEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_pago__n_mEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_pago__n_mEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_pago__n_mEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_pago__n_mEstructuraUpdate= new JButtonMe();
		this.jButtonid_tipo_pago__n_mEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_pago__n_mEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_pago__n_mEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_pago__n_mEstructuraUpdate.setText("U");
		this.jButtonid_tipo_pago__n_mEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_pago__n_mEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_pago__n_mEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_pago__n_mEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_pago__n_mEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_pago__n_mEstructuraUpdate"));



					
		this.jLabelid_numero_patronalEstructura = new JLabelMe();
		this.jLabelid_numero_patronalEstructura.setText(""+EstructuraConstantesFunciones.LABEL_IDNUMEROPATRONAL+" : *");
		this.jLabelid_numero_patronalEstructura.setToolTipText("Numero Patronal");
		this.jLabelid_numero_patronalEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_numero_patronalEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_numero_patronalEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_numero_patronalEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_numero_patronalEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_numero_patronalEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_IDNUMEROPATRONAL);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelid_numero_patronalEstructura.setLayout(this.gridaBagLayoutEstructura);


		jComboBoxid_numero_patronalEstructura= new JComboBoxMe();
		jComboBoxid_numero_patronalEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_numero_patronalEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_numero_patronalEstructura= new JButtonMe();
		this.jButtonid_numero_patronalEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalEstructura.setText("Buscar");
		this.jButtonid_numero_patronalEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_numero_patronalEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_numero_patronalEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalEstructura"));

		this.jButtonid_numero_patronalEstructuraBusqueda= new JButtonMe();
		this.jButtonid_numero_patronalEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_numero_patronalEstructuraBusqueda.setText("U");
		this.jButtonid_numero_patronalEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_numero_patronalEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_numero_patronalEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_numero_patronalEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_numero_patronalEstructuraUpdate= new JButtonMe();
		this.jButtonid_numero_patronalEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_numero_patronalEstructuraUpdate.setText("U");
		this.jButtonid_numero_patronalEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_numero_patronalEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_numero_patronalEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalEstructuraUpdate"));



					
		this.jLabelid_cuenta_contableEstructura = new JLabelMe();
		this.jLabelid_cuenta_contableEstructura.setText(""+EstructuraConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableEstructura.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelid_cuenta_contableEstructura.setLayout(this.gridaBagLayoutEstructura);


		jComboBoxid_cuenta_contableEstructura= new JComboBoxMe();
		jComboBoxid_cuenta_contableEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableEstructura= new JButtonMe();
		this.jButtonid_cuenta_contableEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableEstructura.setText("Buscar");
		this.jButtonid_cuenta_contableEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableEstructura"));

		this.jButtonid_cuenta_contableEstructuraBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableEstructuraBusqueda.setText("U");
		this.jButtonid_cuenta_contableEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableEstructuraUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableEstructuraUpdate.setText("U");
		this.jButtonid_cuenta_contableEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableEstructuraUpdate"));


		jButtonid_cuenta_contableEstructuraArbol= new JButtonMe();
		jButtonid_cuenta_contableEstructuraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableEstructuraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableEstructuraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableEstructuraArbol.setText("Arbol");
		jButtonid_cuenta_contableEstructuraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableEstructuraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableEstructuraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableEstructuraArbol"));



					
		this.jLabelid_tipo_estructuraEstructura = new JLabelMe();
		this.jLabelid_tipo_estructuraEstructura.setText(""+EstructuraConstantesFunciones.LABEL_IDTIPOESTRUCTURA+" : *");
		this.jLabelid_tipo_estructuraEstructura.setToolTipText("Tipo Estructura");
		this.jLabelid_tipo_estructuraEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_estructuraEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_estructuraEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_estructuraEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_estructuraEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_estructuraEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_IDTIPOESTRUCTURA);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelid_tipo_estructuraEstructura.setLayout(this.gridaBagLayoutEstructura);


		jComboBoxid_tipo_estructuraEstructura= new JComboBoxMe();
		jComboBoxid_tipo_estructuraEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_estructuraEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_estructuraEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_estructuraEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_estructuraEstructura= new JButtonMe();
		this.jButtonid_tipo_estructuraEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_estructuraEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_estructuraEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_estructuraEstructura.setText("Buscar");
		this.jButtonid_tipo_estructuraEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_estructuraEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_estructuraEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_estructuraEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_estructuraEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_estructuraEstructura"));

		this.jButtonid_tipo_estructuraEstructuraBusqueda= new JButtonMe();
		this.jButtonid_tipo_estructuraEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_estructuraEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_estructuraEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_estructuraEstructuraBusqueda.setText("U");
		this.jButtonid_tipo_estructuraEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_estructuraEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_estructuraEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_estructuraEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_estructuraEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_estructuraEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_estructuraEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_estructuraEstructuraUpdate= new JButtonMe();
		this.jButtonid_tipo_estructuraEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_estructuraEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_estructuraEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_estructuraEstructuraUpdate.setText("U");
		this.jButtonid_tipo_estructuraEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_estructuraEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_estructuraEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_estructuraEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_estructuraEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_estructuraEstructuraUpdate"));



					
		this.jLabelid_paisEstructura = new JLabelMe();
		this.jLabelid_paisEstructura.setText(""+EstructuraConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisEstructura.setToolTipText("Pais");
		this.jLabelid_paisEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelid_paisEstructura.setLayout(this.gridaBagLayoutEstructura);


		jComboBoxid_paisEstructura= new JComboBoxMe();
		jComboBoxid_paisEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisEstructura= new JButtonMe();
		this.jButtonid_paisEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisEstructura.setText("Buscar");
		this.jButtonid_paisEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEstructura"));

		this.jButtonid_paisEstructuraBusqueda= new JButtonMe();
		this.jButtonid_paisEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisEstructuraBusqueda.setText("U");
		this.jButtonid_paisEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_paisEstructuraUpdate= new JButtonMe();
		this.jButtonid_paisEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisEstructuraUpdate.setText("U");
		this.jButtonid_paisEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisEstructuraUpdate"));



					
		this.jLabelid_ciudadEstructura = new JLabelMe();
		this.jLabelid_ciudadEstructura.setText(""+EstructuraConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadEstructura.setToolTipText("Ciudad");
		this.jLabelid_ciudadEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadEstructura.setToolTipText(EstructuraConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutEstructura = new GridBagLayout();
		this.jPanelid_ciudadEstructura.setLayout(this.gridaBagLayoutEstructura);


		jComboBoxid_ciudadEstructura= new JComboBoxMe();
		jComboBoxid_ciudadEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadEstructura= new JButtonMe();
		this.jButtonid_ciudadEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadEstructura.setText("Buscar");
		this.jButtonid_ciudadEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadEstructura"));

		this.jButtonid_ciudadEstructuraBusqueda= new JButtonMe();
		this.jButtonid_ciudadEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadEstructuraBusqueda.setText("U");
		this.jButtonid_ciudadEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadEstructuraBusqueda"));

		if(this.estructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_ciudadEstructuraUpdate= new JButtonMe();
		this.jButtonid_ciudadEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadEstructuraUpdate.setText("U");
		this.jButtonid_ciudadEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadEstructuraUpdate"));



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
		//this.jInternalFrameDetalleEstructura = new EstructuraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estructura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstructura= new GridBagLayout();
		

		
		String sToolTipEstructura="";
		sToolTipEstructura=EstructuraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstructura+="(Nomina.Estructura)";
		}
		
		if(!this.estructuraSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstructura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstructura = new JButtonMe();
		this.jButtonModificarEstructura = new JButtonMe();
        this.jButtonActualizarEstructura = new JButtonMe();
        this.jButtonEliminarEstructura = new JButtonMe();
        this.jButtonCancelarEstructura = new JButtonMe();
        this.jButtonGuardarCambiosEstructura = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstructura = new JButtonMe();
		this.jButtonCerrarEstructura = new JButtonMe();
		
		this.jScrollPanelDatosEstructura = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstructura = new JScrollPane();
		this.jScrollPanelDatosGeneralEstructura = new JScrollPane();
				
		
		
		this.jPanelCamposEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estructura";
		
		if(!this.estructuraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estructuras" + this.sPath));
		} else {
			this.jScrollPanelDatosEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstructura.setName("jPanelCamposEstructura"); 

		this.jPanelCamposOcultosEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstructura.setName("jPanelCamposOcultosEstructura"); 

        this.jPanelAccionesEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstructura.setToolTipText("Acciones");
        this.jPanelAccionesEstructura.setName("Acciones"); 

		this.jPanelAccionesFormularioEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstructura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstructura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstructura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstructura.setText("Nuevo");
		this.jButtonModificarEstructura.setText("Editar");
        this.jButtonActualizarEstructura.setText("Actualizar");
        this.jButtonEliminarEstructura.setText("Eliminar");
        this.jButtonCancelarEstructura.setText("Cancelar");
        this.jButtonGuardarCambiosEstructura.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstructura.setText("Guardar");
		this.jButtonCerrarEstructura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstructura,"nuevo_button","Nuevo",this.estructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstructura,"modificar_button","Editar",this.estructuraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstructura,"actualizar_button","Actualizar",this.estructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstructura,"eliminar_button","Eliminar",this.estructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstructura,"cancelar_button","Cancelar",this.estructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstructura,"guardarcambios_button","Guardar",this.estructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstructura,"guardarcambiostabla_button","Guardar",this.estructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstructura,"cerrar_button","Salir",this.estructuraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstructura.setToolTipText("Nuevo"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstructura.setToolTipText("Editar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstructura.setToolTipText("Actualizar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstructura.setToolTipText("Eliminar)"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstructura.setToolTipText("Cancelar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstructura.setToolTipText("Guardar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstructura.setToolTipText("Guardar"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstructura.setToolTipText("Salir"+" "+EstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstructura";
		inputMap = this.jButtonNuevoEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstructura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstructura";
		inputMap = this.jButtonActualizarEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstructura"));
		
		//ELIMINAR
		sMapKey = "EliminarEstructura";
		inputMap = this.jButtonEliminarEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstructura"));
		
		//CANCELAR	
		sMapKey = "CancelarEstructura";
		inputMap = this.jButtonCancelarEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstructura"));
		
		//CERRAR		
		sMapKey = "CerrarEstructura";
		inputMap = this.jButtonCerrarEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstructura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstructura";
		inputMap = this.jButtonGuardarCambiosTablaEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstructura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstructura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstructura.setToolTipText("Nuevo Estructura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstructura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstructura.setToolTipText("Sin Cerrar Ventana Estructura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstructura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstructura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstructura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
		this.jButtonArbolEstructura = new JButtonMe();
		this.jButtonArbolEstructura.setText("Arbol");		
		this.jButtonArbolEstructura.setToolTipText("Buscar Por Arbol");
				
		
			
			
		this.jComboBoxTiposAccionesEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstructura.setText("Accion");
		this.jComboBoxTiposAccionesEstructura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstructura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstructura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstructura = new JLabelMe();
		
		this.jLabelAccionesEstructura.setText("Acciones");		
		this.jLabelAccionesEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstructura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstructura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstructura=new JTabbedPane();
		this.jTabbedPaneRelacionesEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		this.jButtonArbolEstructura.setMinimumSize(new Dimension(80,25));
        this.jButtonArbolEstructura.setMaximumSize(new Dimension(80,25));
        this.jButtonArbolEstructura.setPreferredSize(new Dimension(80,25));
		
		FuncionesSwing.setBoldButton(this.jButtonArbolEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
				
		
		this.jComboBoxTiposAccionesEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstructura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstructura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstructura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstructura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstructura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstructura = new GridBagLayout();
		
		this.jPanelCamposEstructura.setLayout(gridaBagLayoutCamposEstructura);
		this.jPanelCamposOcultosEstructura.setLayout(gridaBagLayoutCamposOcultosEstructura);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstructura.add(jLabelIdEstructura, this.gridBagConstraintsEstructura);



	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstructura.add(jLabelidEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEstructura.add(jLabelid_empresaEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstructura.add(jButtonid_empresaEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 3;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstructura.add(jButtonid_empresaEstructuraUpdate, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEstructura.add(jComboBoxid_empresaEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalEstructura.add(jLabelid_sucursalEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEstructura.add(jButtonid_sucursalEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 3;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalEstructura.add(jButtonid_sucursalEstructuraUpdate, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalEstructura.add(jComboBoxid_sucursalEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraEstructura.add(jLabelid_estructuraEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEstructura.add(jButtonid_estructuraEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 3;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraEstructura.add(jButtonid_estructuraEstructuraUpdate, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraEstructura.add(jComboBoxid_estructuraEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_pago__n_mEstructura.add(jLabelid_tipo_pago__n_mEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_pago__n_mEstructura.add(jButtonid_tipo_pago__n_mEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 3;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_pago__n_mEstructura.add(jButtonid_tipo_pago__n_mEstructuraUpdate, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_pago__n_mEstructura.add(jComboBoxid_tipo_pago__n_mEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_numero_patronalEstructura.add(jLabelid_numero_patronalEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_numero_patronalEstructura.add(jButtonid_numero_patronalEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 3;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_numero_patronalEstructura.add(jButtonid_numero_patronalEstructuraUpdate, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_numero_patronalEstructura.add(jComboBoxid_numero_patronalEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableEstructura.add(jLabelid_cuenta_contableEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 2;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableEstructura.add(jButtonid_cuenta_contableEstructura, this.gridBagConstraintsEstructura);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 3;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableEstructura.add(jButtonid_cuenta_contableEstructuraArbol, this.gridBagConstraintsEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 4;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableEstructura.add(jButtonid_cuenta_contableEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 5;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableEstructura.add(jButtonid_cuenta_contableEstructuraUpdate, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableEstructura.add(jComboBoxid_cuenta_contableEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_estructuraEstructura.add(jLabelid_tipo_estructuraEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_estructuraEstructura.add(jButtonid_tipo_estructuraEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 3;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_estructuraEstructura.add(jButtonid_tipo_estructuraEstructuraUpdate, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_estructuraEstructura.add(jComboBoxid_tipo_estructuraEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisEstructura.add(jLabelid_paisEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisEstructura.add(jButtonid_paisEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 3;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisEstructura.add(jButtonid_paisEstructuraUpdate, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisEstructura.add(jComboBoxid_paisEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadEstructura.add(jLabelid_ciudadEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadEstructura.add(jButtonid_ciudadEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 3;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadEstructura.add(jButtonid_ciudadEstructuraUpdate, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadEstructura.add(jComboBoxid_ciudadEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstructura.add(jLabelcodigoEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstructura.add(jButtoncodigoEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstructura.add(jTextFieldcodigoEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroEstructura.add(jLabelnumeroEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroEstructura.add(jButtonnumeroEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroEstructura.add(jTextFieldnumeroEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_anticipoEstructura.add(jLabelvalor_anticipoEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_anticipoEstructura.add(jButtonvalor_anticipoEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_anticipoEstructura.add(jTextFieldvalor_anticipoEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_anticipoEstructura.add(jLabelporcentaje_anticipoEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_anticipoEstructura.add(jButtonporcentaje_anticipoEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_anticipoEstructura.add(jTextFieldporcentaje_anticipoEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstructura.add(jLabelnombreEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstructura.add(jButtonnombreEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstructura.add(jscrollPanenombreEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_jefeEstructura.add(jLabeles_jefeEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_jefeEstructura.add(jButtones_jefeEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_jefeEstructura.add(jCheckBoxes_jefeEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_anualEstructura.add(jLabeles_anualEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_anualEstructura.add(jButtones_anualEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_anualEstructura.add(jCheckBoxes_anualEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeEstructura.add(jLabelporcentajeEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeEstructura.add(jButtonporcentajeEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeEstructura.add(jTextFieldporcentajeEstructura, this.gridBagConstraintsEstructura);


	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 0;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorEstructura.add(jLabelvalorEstructura, this.gridBagConstraintsEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		//this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = 2;
		this.gridBagConstraintsEstructura.ipadx = 0;
		this.gridBagConstraintsEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorEstructura.add(jButtonvalorEstructuraBusqueda, this.gridBagConstraintsEstructura);
	}

	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstructura.gridy = 0;
	this.gridBagConstraintsEstructura.gridx = 1;
	this.gridBagConstraintsEstructura.ipadx = 0;
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorEstructura.add(jTextFieldvalorEstructura, this.gridBagConstraintsEstructura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelidEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelid_estructuraEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelid_tipo_pago__n_mEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelid_numero_patronalEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelid_cuenta_contableEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelid_tipo_estructuraEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelid_paisEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelid_ciudadEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelcodigoEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelnumeroEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelvalor_anticipoEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelporcentaje_anticipoEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelnombreEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPaneles_jefeEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPaneles_anualEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelporcentajeEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstructura.add(this.jPanelvalorEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposEstructura % 2==0) {
		iXPanelCamposEstructura=0;
		iYPanelCamposEstructura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposOcultosEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposOcultosEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstructura.add(this.jPanelid_empresaEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposOcultosEstructura % 2==0) {
		iXPanelCamposOcultosEstructura=0;
		iYPanelCamposOcultosEstructura++;
	}
	this.gridBagConstraintsEstructura = new GridBagConstraints();
	this.gridBagConstraintsEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstructura.gridy = iYPanelCamposOcultosEstructura;
	this.gridBagConstraintsEstructura.gridx = iXPanelCamposOcultosEstructura++;
	this.gridBagConstraintsEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstructura.add(this.jPanelid_sucursalEstructura, this.gridBagConstraintsEstructura);



	if(iXPanelCamposOcultosEstructura % 2==0) {
		iXPanelCamposOcultosEstructura=0;
		iYPanelCamposOcultosEstructura++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstructura= new GridBagLayout();
		this.jPanelAccionesEstructura.setLayout(gridaBagLayoutAccionesEstructura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstructura= new GridBagLayout();
		this.jPanelAccionesFormularioEstructura.setLayout(gridaBagLayoutAccionesFormularioEstructura);
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstructura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstructura.add(this.jComboBoxTiposAccionesFormularioEstructura, this.gridBagConstraintsEstructura);

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstructura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstructura.add(this.jCheckBoxPostAccionNuevoEstructura, this.gridBagConstraintsEstructura);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estructuraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstructura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstructura.add(this.jCheckBoxPostAccionSinCerrarEstructura, this.gridBagConstraintsEstructura);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estructuraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estructuraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstructura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstructura.add(this.jCheckBoxPostAccionSinMensajeEstructura, this.gridBagConstraintsEstructura);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstructura.add(this.jButtonModificarEstructura, this.gridBagConstraintsEstructura);							

		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstructura.gridy = 0;
		this.gridBagConstraintsEstructura.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstructura.add(this.jButtonEliminarEstructura, this.gridBagConstraintsEstructura);
		
			
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = 0;		
		this.gridBagConstraintsEstructura.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstructura.add(this.jButtonActualizarEstructura, this.gridBagConstraintsEstructura);


		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = 0;		
		this.gridBagConstraintsEstructura.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstructura.add(this.jButtonGuardarCambiosEstructura, this.gridBagConstraintsEstructura);	
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = 0;		
		this.gridBagConstraintsEstructura.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstructura.add(this.jButtonCancelarEstructura, this.gridBagConstraintsEstructura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstructura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstructura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estructuraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstructura = new GridBagConstraints();						
			this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstructura.gridx = 0;		
			//this.gridBagConstraintsEstructura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstructura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstructura.gridx =0;
		this.gridBagConstraintsEstructura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstructura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstructura, this.gridBagConstraintsEstructura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
		int iWidthTree=(screenSize.width-screenSize.width/3);
		int iHeightTree=(screenSize.height-screenSize.height/2);
		
		this.jInternalFrameTreeEstructura = new EstructuraBeanSwingJInternalFrameTree(PaginaTipo.BUSQUEDA);
		
		this.jInternalFrameTreeEstructura.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);//WindowConstants.DO_NOTHING_ON_CLOSE);
	    this.jInternalFrameTreeEstructura.setjInternalFrameParent(this);
	        
	    //this.jInternalFrameTreeEstructura.setTitle("Estructura ARBOL");
		this.jInternalFrameTreeEstructura.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estructura Formulario",PaginaTipo.BUSQUEDA,paginaTipo));
	    this.jInternalFrameTreeEstructura.setSize(iWidthTree,iHeightTree);        
		   				
		this.jInternalFrameTreeEstructura.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameTreeEstructura.setResizable(true);
	    this.jInternalFrameTreeEstructura.setClosable(true);
	    this.jInternalFrameTreeEstructura.setMaximizable(true);
			
			
		//if(EstructuraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstructura = new EstructuraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estructura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estructura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estructura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstructuraModel estructuraModel=new EstructuraModel(this);
			
			//SI USARA CLASE INTERNA
			//EstructuraModel.EstructuraFocusTraversalPolicy estructuraFocusTraversalPolicy = estructuraModel.new EstructuraFocusTraversalPolicy(this);
			
			//estructuraFocusTraversalPolicy.setestructuraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estructuraModel);
			
			
			this.jContentPaneDetalleEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstructura = new GridBagLayout();	
			this.jContentPaneDetalleEstructura.setLayout(gridaBagLayoutDetalleEstructura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstructura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstructura = new GridBagConstraints();
				this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstructura.gridx = 0;
					
				
				this.jContentPaneDetalleEstructura.add(jTtoolBarDetalleEstructura, gridBagConstraintsEstructura);								
				
}
			
			this.jScrollPanelDatosEdicionEstructura=   new JScrollPane(jContentPaneDetalleEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstructura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstructura.gridx = 0;
	        
			this.jContentPaneDetalleEstructura.add(jPanelCamposEstructura, gridBagConstraintsEstructura);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& estructuraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAsistenciaDiaria(this.puedeCargarPorParteAsistenciaDiaria,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameAsistenciaMensual(this.puedeCargarPorParteAsistenciaMensual,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCentroCostoEstructura(this.puedeCargarPorParteCentroCostoEstructura,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCierreRolMensual(this.puedeCargarPorParteCierreRolMensual,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(this.puedeCargarPorParteEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoEstructura(this.puedeCargarPorParteEmpleadoEstructura,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoImpuestoRenta(this.puedeCargarPorParteEmpleadoImpuestoRenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoPagoRubro(this.puedeCargarPorParteEmpleadoPagoRubro,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoProcesoRubro(this.puedeCargarPorParteEmpleadoProcesoRubro,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEstructura(this.puedeCargarPorParteEstructura,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEvaluacionEmpleado(this.puedeCargarPorParteEvaluacionEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEvaluacionNomi(this.puedeCargarPorParteEvaluacionNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomi(this.puedeCargarPorParteFormatoNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFuncionEstruc(this.puedeCargarPorParteFuncionEstruc,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHistorialPagoNomi(this.puedeCargarPorParteHistorialPagoNomi,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePlaniVacacion(this.puedeCargarPorPartePlaniVacacion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProvisionEmpleado(this.puedeCargarPorParteProvisionEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameResponsableActivoFijo(this.puedeCargarPorParteResponsableActivoFijo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRubroEmpleaCuentaContable(this.puedeCargarPorParteRubroEmpleaCuentaContable,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRubroEstructura(this.puedeCargarPorParteRubroEstructura,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSolicitudHoraExtra(this.puedeCargarPorParteSolicitudHoraExtra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSolicitudReemplazo(this.puedeCargarPorParteSolicitudReemplazo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSolicitudVacacion(this.puedeCargarPorParteSolicitudVacacion,false,-1);
					
					if(this.estructuraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstructura= new GridBagConstraints();
						this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstructura.gridx = 0;
						this.jContentPaneDetalleEstructura.add(this.jTabbedPaneRelacionesEstructura, this.gridBagConstraintsEstructura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstructura.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAsistenciaDiaria(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameAsistenciaMensual(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCentroCostoEstructura(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameCierreRolMensual(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoEstructura(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoImpuestoRenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoPagoRubro(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoProcesoRubro(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEstructura(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEvaluacionEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEvaluacionNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormatoNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFuncionEstruc(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHistorialPagoNomi(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePlaniVacacion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProvisionEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameResponsableActivoFijo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRubroEmpleaCuentaContable(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRubroEstructura(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSolicitudHoraExtra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSolicitudReemplazo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSolicitudVacacion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstructura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstructura = new GridBagConstraints();
					this.gridBagConstraintsEstructura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstructura.gridx = 0;
					
				
					this.jContentPaneDetalleEstructura.add(jPanelCamposOcultosEstructura, gridBagConstraintsEstructura);
				
					this.jPanelCamposOcultosEstructura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;//70;		
	        this.gridBagConstraintsEstructura.gridx = 0;
	        this.gridBagConstraintsEstructura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstructura.add(this.jPanelAccionesFormularioEstructura, this.gridBagConstraintsEstructura);							
			
			
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
	        this.gridBagConstraintsEstructura.gridy = iGridyRelaciones;//70;		
	        this.gridBagConstraintsEstructura.gridx = 0;
	        
			
			this.jContentPaneDetalleEstructura.add(this.jPanelAccionesEstructura, this.gridBagConstraintsEstructura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstructura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstructura=   new JScrollPane(this.jPanelCamposEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstructura.gridx = 0;
			this.gridBagConstraintsEstructura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstructura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstructura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstructura, this.gridBagConstraintsEstructura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstructura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstructura, this.gridBagConstraintsEstructura);			
			
			this.gridBagConstraintsEstructura = new GridBagConstraints();
			this.gridBagConstraintsEstructura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstructura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstructura, this.gridBagConstraintsEstructura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstructura, this.gridBagConstraintsEstructura);
			
			
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstructura, this.gridBagConstraintsEstructura);
		
			
		this.gridBagConstraintsEstructura = new GridBagConstraints();
		this.gridBagConstraintsEstructura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstructura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstructura, this.gridBagConstraintsEstructura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstructura;//jContentPane;
		
		return jScrollPanelDatosEdicionEstructura;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAsistenciaDiaria(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.asistenciadiariaSessionBean=new AsistenciaDiariaSessionBean();
		this.asistenciadiariaSessionBean.setConGuardarRelaciones(false);
		this.asistenciadiariaSessionBean.setEsGuardarRelacionado(true);

		this.asistenciadiariaBeanSwingJInternalFrame=null;//new AsistenciaDiariaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.asistenciadiariaBeanSwingJInternalFramePopup=new AsistenciaDiariaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.asistenciadiariaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {

				AsistenciaDiariaJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				AsistenciaDiariaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.asistenciadiariaSessionBean.setEsGuardarRelacionado(true);

				this.asistenciadiariaBeanSwingJInternalFrame=new AsistenciaDiariaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.asistenciadiariaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.asistenciadiariaBeanSwingJInternalFrame.setasistenciadiariaSessionBean(this.asistenciadiariaSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.asistenciadiariaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Asistencia Diarias",this.asistenciadiariaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.asistenciadiariaBeanSwingJInternalFrame.getContentPane());
				}

				//AsistenciaDiariaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.asistenciadiariaSessionBean.setEsGuardarRelacionado(false);
				this.asistenciadiariaBeanSwingJInternalFrame=null;//new AsistenciaDiariaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.asistenciadiariaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAsistenciaDiaria) {
					this.jTabbedPaneRelacionesEstructura.add("Asistencia Diarias",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameAsistenciaMensual(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
		this.asistenciamensualSessionBean.setConGuardarRelaciones(false);
		this.asistenciamensualSessionBean.setEsGuardarRelacionado(true);

		this.asistenciamensualBeanSwingJInternalFrame=null;//new AsistenciaMensualBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.asistenciamensualBeanSwingJInternalFramePopup=new AsistenciaMensualBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.asistenciamensualBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {

				AsistenciaMensualJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				AsistenciaMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.asistenciamensualSessionBean.setEsGuardarRelacionado(true);

				this.asistenciamensualBeanSwingJInternalFrame=new AsistenciaMensualBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.asistenciamensualBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.asistenciamensualBeanSwingJInternalFrame.setasistenciamensualSessionBean(this.asistenciamensualSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.asistenciamensualBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Asistencia Mensuales",this.asistenciamensualBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.asistenciamensualBeanSwingJInternalFrame.getContentPane());
				}

				//AsistenciaMensualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.asistenciamensualSessionBean.setEsGuardarRelacionado(false);
				this.asistenciamensualBeanSwingJInternalFrame=null;//new AsistenciaMensualBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.asistenciamensualSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAsistenciaMensual) {
					this.jTabbedPaneRelacionesEstructura.add("Asistencia Mensuales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCentroCostoEstructura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
		this.centrocostoestructuraSessionBean.setConGuardarRelaciones(false);
		this.centrocostoestructuraSessionBean.setEsGuardarRelacionado(true);

		this.centrocostoestructuraBeanSwingJInternalFrame=null;//new CentroCostoEstructuraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.centrocostoestructuraBeanSwingJInternalFramePopup=new CentroCostoEstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.centrocostoestructuraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {

				CentroCostoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				CentroCostoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.centrocostoestructuraSessionBean.setEsGuardarRelacionado(true);

				this.centrocostoestructuraBeanSwingJInternalFrame=new CentroCostoEstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.centrocostoestructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.centrocostoestructuraBeanSwingJInternalFrame.setcentrocostoestructuraSessionBean(this.centrocostoestructuraSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.centrocostoestructuraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Centro Costo Estructuras",this.centrocostoestructuraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.centrocostoestructuraBeanSwingJInternalFrame.getContentPane());
				}

				//CentroCostoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.centrocostoestructuraSessionBean.setEsGuardarRelacionado(false);
				this.centrocostoestructuraBeanSwingJInternalFrame=null;//new CentroCostoEstructuraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCentroCostoEstructura) {
					this.jTabbedPaneRelacionesEstructura.add("Centro Costo Estructuras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameCierreRolMensual(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cierrerolmensualSessionBean=new CierreRolMensualSessionBean();
		this.cierrerolmensualSessionBean.setConGuardarRelaciones(false);
		this.cierrerolmensualSessionBean.setEsGuardarRelacionado(true);

		this.cierrerolmensualBeanSwingJInternalFrame=null;//new CierreRolMensualBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cierrerolmensualBeanSwingJInternalFramePopup=new CierreRolMensualBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cierrerolmensualBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {

				CierreRolMensualJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				CierreRolMensualJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cierrerolmensualSessionBean.setEsGuardarRelacionado(true);

				this.cierrerolmensualBeanSwingJInternalFrame=new CierreRolMensualBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cierrerolmensualBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cierrerolmensualBeanSwingJInternalFrame.setcierrerolmensualSessionBean(this.cierrerolmensualSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.cierrerolmensualBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Cierre Rol Mensuales",this.cierrerolmensualBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.cierrerolmensualBeanSwingJInternalFrame.getContentPane());
				}

				//CierreRolMensualJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cierrerolmensualSessionBean.setEsGuardarRelacionado(false);
				this.cierrerolmensualBeanSwingJInternalFrame=null;//new CierreRolMensualBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cierrerolmensualSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCierreRolMensual) {
					this.jTabbedPaneRelacionesEstructura.add("Cierre Rol Mensuales",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoSessionBean=new EmpleadoSessionBean();
		this.empleadoSessionBean.setConGuardarRelaciones(false);
		this.empleadoSessionBean.setEsGuardarRelacionado(true);

		this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {

				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoSessionBean.setEsGuardarRelacionado(true);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoBeanSwingJInternalFrame.setempleadoSessionBean(this.empleadoSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.empleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Empleados",this.empleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.empleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoSessionBean.setEsGuardarRelacionado(false);
				this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleado) {
					this.jTabbedPaneRelacionesEstructura.add("Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoEstructura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
		this.empleadoestructuraSessionBean.setConGuardarRelaciones(false);
		this.empleadoestructuraSessionBean.setEsGuardarRelacionado(true);

		this.empleadoestructuraBeanSwingJInternalFrame=null;//new EmpleadoEstructuraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoestructuraBeanSwingJInternalFramePopup=new EmpleadoEstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoestructuraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {

				EmpleadoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoestructuraSessionBean.setEsGuardarRelacionado(true);

				this.empleadoestructuraBeanSwingJInternalFrame=new EmpleadoEstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoestructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoestructuraBeanSwingJInternalFrame.setempleadoestructuraSessionBean(this.empleadoestructuraSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.empleadoestructuraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Empleado Estructuras",this.empleadoestructuraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.empleadoestructuraBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoestructuraSessionBean.setEsGuardarRelacionado(false);
				this.empleadoestructuraBeanSwingJInternalFrame=null;//new EmpleadoEstructuraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoestructuraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoEstructura) {
					this.jTabbedPaneRelacionesEstructura.add("Empleado Estructuras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoImpuestoRenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
		this.empleadoimpuestorentaSessionBean.setConGuardarRelaciones(false);
		this.empleadoimpuestorentaSessionBean.setEsGuardarRelacionado(true);

		this.empleadoimpuestorentaBeanSwingJInternalFrame=null;//new EmpleadoImpuestoRentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoimpuestorentaBeanSwingJInternalFramePopup=new EmpleadoImpuestoRentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoimpuestorentaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {

				EmpleadoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoImpuestoRentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoimpuestorentaSessionBean.setEsGuardarRelacionado(true);

				this.empleadoimpuestorentaBeanSwingJInternalFrame=new EmpleadoImpuestoRentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoimpuestorentaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoimpuestorentaBeanSwingJInternalFrame.setempleadoimpuestorentaSessionBean(this.empleadoimpuestorentaSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.empleadoimpuestorentaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Empleado Impuesto Rentas",this.empleadoimpuestorentaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.empleadoimpuestorentaBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoImpuestoRentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoimpuestorentaSessionBean.setEsGuardarRelacionado(false);
				this.empleadoimpuestorentaBeanSwingJInternalFrame=null;//new EmpleadoImpuestoRentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoImpuestoRenta) {
					this.jTabbedPaneRelacionesEstructura.add("Empleado Impuesto Rentas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoPagoRubro(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
		this.empleadopagorubroSessionBean.setConGuardarRelaciones(false);
		this.empleadopagorubroSessionBean.setEsGuardarRelacionado(true);

		this.empleadopagorubroBeanSwingJInternalFrame=null;//new EmpleadoPagoRubroBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadopagorubroBeanSwingJInternalFramePopup=new EmpleadoPagoRubroBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadopagorubroBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {

				EmpleadoPagoRubroJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoPagoRubroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadopagorubroSessionBean.setEsGuardarRelacionado(true);

				this.empleadopagorubroBeanSwingJInternalFrame=new EmpleadoPagoRubroBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadopagorubroBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadopagorubroBeanSwingJInternalFrame.setempleadopagorubroSessionBean(this.empleadopagorubroSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.empleadopagorubroBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Empleado Pago Rubros",this.empleadopagorubroBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.empleadopagorubroBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoPagoRubroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadopagorubroSessionBean.setEsGuardarRelacionado(false);
				this.empleadopagorubroBeanSwingJInternalFrame=null;//new EmpleadoPagoRubroBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoPagoRubro) {
					this.jTabbedPaneRelacionesEstructura.add("Empleado Pago Rubros",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoProcesoRubro(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoprocesorubroSessionBean=new EmpleadoProcesoRubroSessionBean();
		this.empleadoprocesorubroSessionBean.setConGuardarRelaciones(false);
		this.empleadoprocesorubroSessionBean.setEsGuardarRelacionado(true);

		this.empleadoprocesorubroBeanSwingJInternalFrame=null;//new EmpleadoProcesoRubroBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoprocesorubroBeanSwingJInternalFramePopup=new EmpleadoProcesoRubroBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoprocesorubroBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {

				EmpleadoProcesoRubroJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoProcesoRubroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoprocesorubroSessionBean.setEsGuardarRelacionado(true);

				this.empleadoprocesorubroBeanSwingJInternalFrame=new EmpleadoProcesoRubroBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoprocesorubroBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoprocesorubroBeanSwingJInternalFrame.setempleadoprocesorubroSessionBean(this.empleadoprocesorubroSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.empleadoprocesorubroBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Empleado Proceso Rubros",this.empleadoprocesorubroBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.empleadoprocesorubroBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoProcesoRubroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoprocesorubroSessionBean.setEsGuardarRelacionado(false);
				this.empleadoprocesorubroBeanSwingJInternalFrame=null;//new EmpleadoProcesoRubroBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoprocesorubroSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoProcesoRubro) {
					this.jTabbedPaneRelacionesEstructura.add("Empleado Proceso Rubros",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEstructura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.estructuraSessionBean=new EstructuraSessionBean();
		this.estructuraSessionBean.setConGuardarRelaciones(false);
		//this.estructuraSessionBean.setEsGuardarRelacionado(true);

		this.estructuraBeanSwingJInternalFrame=null;//new EstructuraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.estructuraBeanSwingJInternalFramePopup=new EstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.estructuraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.estructuraSessionBean.getEsGuardarRelacionado()) {
				EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.estructuraSessionBean.setEsGuardarRelacionado(true);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.estructuraBeanSwingJInternalFrame.setestructuraSessionBean(this.estructuraSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.estructuraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Estructuras",this.estructuraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.estructuraBeanSwingJInternalFrame.getContentPane());
				}

				//EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.estructuraSessionBean.setEsGuardarRelacionado(false);
				this.estructuraBeanSwingJInternalFrame=null;//new EstructuraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.estructuraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEstructura) {
					this.jTabbedPaneRelacionesEstructura.add("Estructuras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEvaluacionEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.evaluacionempleadoSessionBean=new EvaluacionEmpleadoSessionBean();
		this.evaluacionempleadoSessionBean.setConGuardarRelaciones(false);
		this.evaluacionempleadoSessionBean.setEsGuardarRelacionado(true);

		this.evaluacionempleadoBeanSwingJInternalFrame=null;//new EvaluacionEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.evaluacionempleadoBeanSwingJInternalFramePopup=new EvaluacionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.evaluacionempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {

				EvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				EvaluacionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.evaluacionempleadoSessionBean.setEsGuardarRelacionado(true);

				this.evaluacionempleadoBeanSwingJInternalFrame=new EvaluacionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.evaluacionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.evaluacionempleadoBeanSwingJInternalFrame.setevaluacionempleadoSessionBean(this.evaluacionempleadoSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.evaluacionempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Evaluacion Empleados",this.evaluacionempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.evaluacionempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EvaluacionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.evaluacionempleadoSessionBean.setEsGuardarRelacionado(false);
				this.evaluacionempleadoBeanSwingJInternalFrame=null;//new EvaluacionEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.evaluacionempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEvaluacionEmpleado) {
					this.jTabbedPaneRelacionesEstructura.add("Evaluacion Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEvaluacionNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.evaluacionnomiSessionBean=new EvaluacionNomiSessionBean();
		this.evaluacionnomiSessionBean.setConGuardarRelaciones(false);
		this.evaluacionnomiSessionBean.setEsGuardarRelacionado(true);

		this.evaluacionnomiBeanSwingJInternalFrame=null;//new EvaluacionNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.evaluacionnomiBeanSwingJInternalFramePopup=new EvaluacionNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.evaluacionnomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {

				EvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				EvaluacionNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.evaluacionnomiSessionBean.setEsGuardarRelacionado(true);

				this.evaluacionnomiBeanSwingJInternalFrame=new EvaluacionNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.evaluacionnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.evaluacionnomiBeanSwingJInternalFrame.setevaluacionnomiSessionBean(this.evaluacionnomiSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.evaluacionnomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Evaluacion Nomis",this.evaluacionnomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.evaluacionnomiBeanSwingJInternalFrame.getContentPane());
				}

				//EvaluacionNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.evaluacionnomiSessionBean.setEsGuardarRelacionado(false);
				this.evaluacionnomiBeanSwingJInternalFrame=null;//new EvaluacionNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.evaluacionnomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEvaluacionNomi) {
					this.jTabbedPaneRelacionesEstructura.add("Evaluacion Nomis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFormatoNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formatonomiSessionBean=new FormatoNomiSessionBean();
		this.formatonomiSessionBean.setConGuardarRelaciones(false);
		this.formatonomiSessionBean.setEsGuardarRelacionado(true);

		this.formatonomiBeanSwingJInternalFrame=null;//new FormatoNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formatonomiBeanSwingJInternalFramePopup=new FormatoNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formatonomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formatonomiSessionBean.getEsGuardarRelacionado()) {

				FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormatoNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formatonomiSessionBean.setEsGuardarRelacionado(true);

				this.formatonomiBeanSwingJInternalFrame=new FormatoNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formatonomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formatonomiBeanSwingJInternalFrame.setformatonomiSessionBean(this.formatonomiSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.formatonomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Formato Nomis",this.formatonomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.formatonomiBeanSwingJInternalFrame.getContentPane());
				}

				//FormatoNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formatonomiSessionBean.setEsGuardarRelacionado(false);
				this.formatonomiBeanSwingJInternalFrame=null;//new FormatoNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formatonomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormatoNomi) {
					this.jTabbedPaneRelacionesEstructura.add("Formato Nomis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFuncionEstruc(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
		this.funcionestrucSessionBean.setConGuardarRelaciones(false);
		this.funcionestrucSessionBean.setEsGuardarRelacionado(true);

		this.funcionestrucBeanSwingJInternalFrame=null;//new FuncionEstrucBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.funcionestrucBeanSwingJInternalFramePopup=new FuncionEstrucBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.funcionestrucBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.funcionestrucSessionBean.getEsGuardarRelacionado()) {

				FuncionEstrucJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				FuncionEstrucJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.funcionestrucSessionBean.setEsGuardarRelacionado(true);

				this.funcionestrucBeanSwingJInternalFrame=new FuncionEstrucBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.funcionestrucBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.funcionestrucBeanSwingJInternalFrame.setfuncionestrucSessionBean(this.funcionestrucSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.funcionestrucBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Funcion Estruces",this.funcionestrucBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.funcionestrucBeanSwingJInternalFrame.getContentPane());
				}

				//FuncionEstrucJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.funcionestrucSessionBean.setEsGuardarRelacionado(false);
				this.funcionestrucBeanSwingJInternalFrame=null;//new FuncionEstrucBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFuncionEstruc) {
					this.jTabbedPaneRelacionesEstructura.add("Funcion Estruces",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameHistorialPagoNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
		this.historialpagonomiSessionBean.setConGuardarRelaciones(false);
		this.historialpagonomiSessionBean.setEsGuardarRelacionado(true);

		this.historialpagonomiBeanSwingJInternalFrame=null;//new HistorialPagoNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.historialpagonomiBeanSwingJInternalFramePopup=new HistorialPagoNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.historialpagonomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {

				HistorialPagoNomiJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				HistorialPagoNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.historialpagonomiSessionBean.setEsGuardarRelacionado(true);

				this.historialpagonomiBeanSwingJInternalFrame=new HistorialPagoNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.historialpagonomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.historialpagonomiBeanSwingJInternalFrame.sethistorialpagonomiSessionBean(this.historialpagonomiSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.historialpagonomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Historial Pago Nomis",this.historialpagonomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.historialpagonomiBeanSwingJInternalFrame.getContentPane());
				}

				//HistorialPagoNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.historialpagonomiSessionBean.setEsGuardarRelacionado(false);
				this.historialpagonomiBeanSwingJInternalFrame=null;//new HistorialPagoNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteHistorialPagoNomi) {
					this.jTabbedPaneRelacionesEstructura.add("Historial Pago Nomis",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePlaniVacacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.planivacacionSessionBean=new PlaniVacacionSessionBean();
		this.planivacacionSessionBean.setConGuardarRelaciones(false);
		this.planivacacionSessionBean.setEsGuardarRelacionado(true);

		this.planivacacionBeanSwingJInternalFrame=null;//new PlaniVacacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.planivacacionBeanSwingJInternalFramePopup=new PlaniVacacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.planivacacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.planivacacionSessionBean.getEsGuardarRelacionado()) {

				PlaniVacacionJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				PlaniVacacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.planivacacionSessionBean.setEsGuardarRelacionado(true);

				this.planivacacionBeanSwingJInternalFrame=new PlaniVacacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.planivacacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.planivacacionBeanSwingJInternalFrame.setplanivacacionSessionBean(this.planivacacionSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.planivacacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Plani Vacaciones",this.planivacacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.planivacacionBeanSwingJInternalFrame.getContentPane());
				}

				//PlaniVacacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.planivacacionSessionBean.setEsGuardarRelacionado(false);
				this.planivacacionBeanSwingJInternalFrame=null;//new PlaniVacacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.planivacacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePlaniVacacion) {
					this.jTabbedPaneRelacionesEstructura.add("Plani Vacaciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProvisionEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
		this.provisionempleadoSessionBean.setConGuardarRelaciones(false);
		this.provisionempleadoSessionBean.setEsGuardarRelacionado(true);

		this.provisionempleadoBeanSwingJInternalFrame=null;//new ProvisionEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.provisionempleadoBeanSwingJInternalFramePopup=new ProvisionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.provisionempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {

				ProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.provisionempleadoSessionBean.setEsGuardarRelacionado(true);

				this.provisionempleadoBeanSwingJInternalFrame=new ProvisionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.provisionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.provisionempleadoBeanSwingJInternalFrame.setprovisionempleadoSessionBean(this.provisionempleadoSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.provisionempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Provision Empleados",this.provisionempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.provisionempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.provisionempleadoSessionBean.setEsGuardarRelacionado(false);
				this.provisionempleadoBeanSwingJInternalFrame=null;//new ProvisionEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProvisionEmpleado) {
					this.jTabbedPaneRelacionesEstructura.add("Provision Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameResponsableActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
		this.responsableactivofijoSessionBean.setConGuardarRelaciones(false);
		this.responsableactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.responsableactivofijoBeanSwingJInternalFrame=null;//new ResponsableActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.responsableactivofijoBeanSwingJInternalFramePopup=new ResponsableActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.responsableactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {

				ResponsableActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				ResponsableActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.responsableactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.responsableactivofijoBeanSwingJInternalFrame=new ResponsableActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.responsableactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.responsableactivofijoBeanSwingJInternalFrame.setresponsableactivofijoSessionBean(this.responsableactivofijoSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.responsableactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Responsable Activo Fijos",this.responsableactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.responsableactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//ResponsableActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.responsableactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.responsableactivofijoBeanSwingJInternalFrame=null;//new ResponsableActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteResponsableActivoFijo) {
					this.jTabbedPaneRelacionesEstructura.add("Responsable Activo Fijos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRubroEmpleaCuentaContable(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.rubroempleacuentacontableSessionBean=new RubroEmpleaCuentaContableSessionBean();
		this.rubroempleacuentacontableSessionBean.setConGuardarRelaciones(false);
		this.rubroempleacuentacontableSessionBean.setEsGuardarRelacionado(true);

		this.rubroempleacuentacontableBeanSwingJInternalFrame=null;//new RubroEmpleaCuentaContableBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.rubroempleacuentacontableBeanSwingJInternalFramePopup=new RubroEmpleaCuentaContableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.rubroempleacuentacontableBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {

				RubroEmpleaCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				RubroEmpleaCuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.rubroempleacuentacontableSessionBean.setEsGuardarRelacionado(true);

				this.rubroempleacuentacontableBeanSwingJInternalFrame=new RubroEmpleaCuentaContableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.rubroempleacuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.rubroempleacuentacontableBeanSwingJInternalFrame.setrubroempleacuentacontableSessionBean(this.rubroempleacuentacontableSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.rubroempleacuentacontableBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Rubro Emplea Cuenta Contables",this.rubroempleacuentacontableBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.rubroempleacuentacontableBeanSwingJInternalFrame.getContentPane());
				}

				//RubroEmpleaCuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.rubroempleacuentacontableSessionBean.setEsGuardarRelacionado(false);
				this.rubroempleacuentacontableBeanSwingJInternalFrame=null;//new RubroEmpleaCuentaContableBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.rubroempleacuentacontableSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRubroEmpleaCuentaContable) {
					this.jTabbedPaneRelacionesEstructura.add("Rubro Emplea Cuenta Contables",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRubroEstructura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
		this.rubroestructuraSessionBean.setConGuardarRelaciones(false);
		this.rubroestructuraSessionBean.setEsGuardarRelacionado(true);

		this.rubroestructuraBeanSwingJInternalFrame=null;//new RubroEstructuraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.rubroestructuraBeanSwingJInternalFramePopup=new RubroEstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.rubroestructuraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {

				RubroEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				RubroEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.rubroestructuraSessionBean.setEsGuardarRelacionado(true);

				this.rubroestructuraBeanSwingJInternalFrame=new RubroEstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.rubroestructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.rubroestructuraBeanSwingJInternalFrame.setrubroestructuraSessionBean(this.rubroestructuraSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.rubroestructuraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Rubro Estructuras",this.rubroestructuraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.rubroestructuraBeanSwingJInternalFrame.getContentPane());
				}

				//RubroEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.rubroestructuraSessionBean.setEsGuardarRelacionado(false);
				this.rubroestructuraBeanSwingJInternalFrame=null;//new RubroEstructuraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRubroEstructura) {
					this.jTabbedPaneRelacionesEstructura.add("Rubro Estructuras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSolicitudHoraExtra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.solicitudhoraextraSessionBean=new SolicitudHoraExtraSessionBean();
		this.solicitudhoraextraSessionBean.setConGuardarRelaciones(false);
		this.solicitudhoraextraSessionBean.setEsGuardarRelacionado(true);

		this.solicitudhoraextraBeanSwingJInternalFrame=null;//new SolicitudHoraExtraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.solicitudhoraextraBeanSwingJInternalFramePopup=new SolicitudHoraExtraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.solicitudhoraextraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {

				SolicitudHoraExtraJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				SolicitudHoraExtraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.solicitudhoraextraSessionBean.setEsGuardarRelacionado(true);

				this.solicitudhoraextraBeanSwingJInternalFrame=new SolicitudHoraExtraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.solicitudhoraextraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.solicitudhoraextraBeanSwingJInternalFrame.setsolicitudhoraextraSessionBean(this.solicitudhoraextraSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.solicitudhoraextraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Solicitud Hora Extras",this.solicitudhoraextraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.solicitudhoraextraBeanSwingJInternalFrame.getContentPane());
				}

				//SolicitudHoraExtraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.solicitudhoraextraSessionBean.setEsGuardarRelacionado(false);
				this.solicitudhoraextraBeanSwingJInternalFrame=null;//new SolicitudHoraExtraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.solicitudhoraextraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSolicitudHoraExtra) {
					this.jTabbedPaneRelacionesEstructura.add("Solicitud Hora Extras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSolicitudReemplazo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.solicitudreemplazoSessionBean=new SolicitudReemplazoSessionBean();
		this.solicitudreemplazoSessionBean.setConGuardarRelaciones(false);
		this.solicitudreemplazoSessionBean.setEsGuardarRelacionado(true);

		this.solicitudreemplazoBeanSwingJInternalFrame=null;//new SolicitudReemplazoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.solicitudreemplazoBeanSwingJInternalFramePopup=new SolicitudReemplazoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.solicitudreemplazoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {

				SolicitudReemplazoJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				SolicitudReemplazoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.solicitudreemplazoSessionBean.setEsGuardarRelacionado(true);

				this.solicitudreemplazoBeanSwingJInternalFrame=new SolicitudReemplazoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.solicitudreemplazoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.solicitudreemplazoBeanSwingJInternalFrame.setsolicitudreemplazoSessionBean(this.solicitudreemplazoSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.solicitudreemplazoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Solicitud Reemplazos",this.solicitudreemplazoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.solicitudreemplazoBeanSwingJInternalFrame.getContentPane());
				}

				//SolicitudReemplazoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.solicitudreemplazoSessionBean.setEsGuardarRelacionado(false);
				this.solicitudreemplazoBeanSwingJInternalFrame=null;//new SolicitudReemplazoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.solicitudreemplazoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSolicitudReemplazo) {
					this.jTabbedPaneRelacionesEstructura.add("Solicitud Reemplazos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSolicitudVacacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.solicitudvacacionSessionBean=new SolicitudVacacionSessionBean();
		this.solicitudvacacionSessionBean.setConGuardarRelaciones(false);
		this.solicitudvacacionSessionBean.setEsGuardarRelacionado(true);

		this.solicitudvacacionBeanSwingJInternalFrame=null;//new SolicitudVacacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.solicitudvacacionBeanSwingJInternalFramePopup=new SolicitudVacacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.solicitudvacacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {

				SolicitudVacacionJInternalFrame.STIPO_TAMANIO_GENERAL=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;
				SolicitudVacacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.solicitudvacacionSessionBean.setEsGuardarRelacionado(true);

				this.solicitudvacacionBeanSwingJInternalFrame=new SolicitudVacacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.solicitudvacacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.solicitudvacacionBeanSwingJInternalFrame.setsolicitudvacacionSessionBean(this.solicitudvacacionSessionBean);

				//this.gridBagConstraintsEstructura = new GridBagConstraints();
				//this.gridBagConstraintsEstructura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstructura.gridx = 0;
				//this.jContentPaneDetalleEstructura.add(this.solicitudvacacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstructura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstructura.add("Solicitud Vacaciones",this.solicitudvacacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstructura.setComponentAt(iIndexTab,this.solicitudvacacionBeanSwingJInternalFrame.getContentPane());
				}

				//SolicitudVacacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.solicitudvacacionSessionBean.setEsGuardarRelacionado(false);
				this.solicitudvacacionBeanSwingJInternalFrame=null;//new SolicitudVacacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.solicitudvacacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSolicitudVacacion) {
					this.jTabbedPaneRelacionesEstructura.add("Solicitud Vacaciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCentroCostoEstructuraBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,CentroCostoEstructuraBeanSwingJInternalFrame centrocostoestructuraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//centrocostoestructuraBeanSwingJInternalFrame=new CentroCostoEstructuraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					centrocostoestructuraBeanSwingJInternalFrame.getCentroCostoEstructuraLogic().setConnexion(this.estructuraLogic.getConnexion());

					centrocostoestructuraBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					centrocostoestructuraBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					centrocostoestructuraBeanSwingJInternalFrame.centrocostoestructuraSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					centrocostoestructuraBeanSwingJInternalFrame.centrocostoestructuraSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					centrocostoestructuraBeanSwingJInternalFrame.cargarCombosForeignKeyCentroCostoEstructura(centrocostoestructuraBeanSwingJInternalFrame.isCargarCombosDependencia);
					centrocostoestructuraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					centrocostoestructuraBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						centrocostoestructuraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					centrocostoestructuraBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					centrocostoestructuraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					centrocostoestructuraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					centrocostoestructuraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					centrocostoestructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCostoEstructura(true);
					centrocostoestructuraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCentroCostoEstructura("n",centrocostoestructuraBeanSwingJInternalFrame.isGuardarCambiosEnLote, centrocostoestructuraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					centrocostoestructuraBeanSwingJInternalFrame.setAutoscrolls(true);
					centrocostoestructuraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						centrocostoestructuraBeanSwingJInternalFrame.actualizarEstadoPanelsCentroCostoEstructura("relacionado");
					} else {
						centrocostoestructuraBeanSwingJInternalFrame.actualizarEstadoPanelsCentroCostoEstructura("no_relacionado");
					}

					centrocostoestructuraBeanSwingJInternalFrame.getjButtonRecargarInformacionCentroCostoEstructura().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPlaniVacacionBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,PlaniVacacionBeanSwingJInternalFrame planivacacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//planivacacionBeanSwingJInternalFrame=new PlaniVacacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					planivacacionBeanSwingJInternalFrame.getPlaniVacacionLogic().setConnexion(this.estructuraLogic.getConnexion());

					planivacacionBeanSwingJInternalFrame.setestructuracargosForeignKey(estructuras);
					planivacacionBeanSwingJInternalFrame.setestructuracargoForeignKey(estructura);
					planivacacionBeanSwingJInternalFrame.planivacacionSessionBean.setisBusquedaDesdeForeignKeySesionEstructuraCargo(true);
					planivacacionBeanSwingJInternalFrame.planivacacionSessionBean.setlidEstructuraCargoActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					planivacacionBeanSwingJInternalFrame.cargarCombosForeignKeyPlaniVacacion(planivacacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					planivacacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructuraCargo(true);
					planivacacionBeanSwingJInternalFrame.setid_estructura_cargoFK_IdEstructuraCargo(estructura.getId());

					if(!this.conCargarFormDetalle) {
						planivacacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					planivacacionBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraCargoForeignKey(estructura,1,false,true,true);
					planivacacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					planivacacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					planivacacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					planivacacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaPlaniVacacion(true);
					planivacacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPlaniVacacion("n",planivacacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, planivacacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					planivacacionBeanSwingJInternalFrame.setAutoscrolls(true);
					planivacacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						planivacacionBeanSwingJInternalFrame.actualizarEstadoPanelsPlaniVacacion("relacionado");
					} else {
						planivacacionBeanSwingJInternalFrame.actualizarEstadoPanelsPlaniVacacion("no_relacionado");
					}

					planivacacionBeanSwingJInternalFrame.getjButtonRecargarInformacionPlaniVacacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAsistenciaMensualBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,AsistenciaMensualBeanSwingJInternalFrame asistenciamensualBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//asistenciamensualBeanSwingJInternalFrame=new AsistenciaMensualBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					asistenciamensualBeanSwingJInternalFrame.getAsistenciaMensualLogic().setConnexion(this.estructuraLogic.getConnexion());

					asistenciamensualBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					asistenciamensualBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					asistenciamensualBeanSwingJInternalFrame.cargarCombosForeignKeyAsistenciaMensual(asistenciamensualBeanSwingJInternalFrame.isCargarCombosDependencia);
					asistenciamensualBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					asistenciamensualBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						asistenciamensualBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					asistenciamensualBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					asistenciamensualBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					asistenciamensualBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					asistenciamensualBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					asistenciamensualBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsistenciaMensual(true);
					asistenciamensualBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAsistenciaMensual("n",asistenciamensualBeanSwingJInternalFrame.isGuardarCambiosEnLote, asistenciamensualBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					asistenciamensualBeanSwingJInternalFrame.setAutoscrolls(true);
					asistenciamensualBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						asistenciamensualBeanSwingJInternalFrame.actualizarEstadoPanelsAsistenciaMensual("relacionado");
					} else {
						asistenciamensualBeanSwingJInternalFrame.actualizarEstadoPanelsAsistenciaMensual("no_relacionado");
					}

					asistenciamensualBeanSwingJInternalFrame.getjButtonRecargarInformacionAsistenciaMensual().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoProcesoRubroBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,EmpleadoProcesoRubroBeanSwingJInternalFrame empleadoprocesorubroBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoprocesorubroBeanSwingJInternalFrame=new EmpleadoProcesoRubroBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoprocesorubroBeanSwingJInternalFrame.getEmpleadoProcesoRubroLogic().setConnexion(this.estructuraLogic.getConnexion());

					empleadoprocesorubroBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					empleadoprocesorubroBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					empleadoprocesorubroBeanSwingJInternalFrame.empleadoprocesorubroSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					empleadoprocesorubroBeanSwingJInternalFrame.empleadoprocesorubroSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoprocesorubroBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoProcesoRubro(empleadoprocesorubroBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoprocesorubroBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					empleadoprocesorubroBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						empleadoprocesorubroBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoprocesorubroBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					empleadoprocesorubroBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoprocesorubroBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					empleadoprocesorubroBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					empleadoprocesorubroBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoProcesoRubro(true);
					empleadoprocesorubroBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoProcesoRubro("n",empleadoprocesorubroBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoprocesorubroBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoprocesorubroBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoprocesorubroBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoprocesorubroBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoProcesoRubro("relacionado");
					} else {
						empleadoprocesorubroBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoProcesoRubro("no_relacionado");
					}

					empleadoprocesorubroBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoProcesoRubro().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoPagoRubroBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,EmpleadoPagoRubroBeanSwingJInternalFrame empleadopagorubroBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadopagorubroBeanSwingJInternalFrame=new EmpleadoPagoRubroBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadopagorubroBeanSwingJInternalFrame.getEmpleadoPagoRubroLogic().setConnexion(this.estructuraLogic.getConnexion());

					empleadopagorubroBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					empleadopagorubroBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					empleadopagorubroBeanSwingJInternalFrame.empleadopagorubroSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					empleadopagorubroBeanSwingJInternalFrame.empleadopagorubroSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadopagorubroBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoPagoRubro(empleadopagorubroBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadopagorubroBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					empleadopagorubroBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						empleadopagorubroBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadopagorubroBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					empleadopagorubroBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadopagorubroBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					empleadopagorubroBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					empleadopagorubroBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoPagoRubro(true);
					empleadopagorubroBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("n",empleadopagorubroBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadopagorubroBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadopagorubroBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadopagorubroBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadopagorubroBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoPagoRubro("relacionado");
					} else {
						empleadopagorubroBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoPagoRubro("no_relacionado");
					}

					empleadopagorubroBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoPagoRubro().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProvisionEmpleadoBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,ProvisionEmpleadoBeanSwingJInternalFrame provisionempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//provisionempleadoBeanSwingJInternalFrame=new ProvisionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					provisionempleadoBeanSwingJInternalFrame.getProvisionEmpleadoLogic().setConnexion(this.estructuraLogic.getConnexion());

					provisionempleadoBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					provisionempleadoBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					provisionempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyProvisionEmpleado(provisionempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					provisionempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					provisionempleadoBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						provisionempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					provisionempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					provisionempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					provisionempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					provisionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					provisionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvisionEmpleado(true);
					provisionempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProvisionEmpleado("n",provisionempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, provisionempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					provisionempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					provisionempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						provisionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsProvisionEmpleado("relacionado");
					} else {
						provisionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsProvisionEmpleado("no_relacionado");
					}

					provisionempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionProvisionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.estructuraLogic.getConnexion());

					empleadoBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					empleadoBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleado(empleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					empleadoBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						empleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					empleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					empleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(true);
					empleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleado("n",empleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("relacionado");
					} else {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");
					}

					empleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEstructuraBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.estructuraLogic.getConnexion());

					estructuraBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					estructuraBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					estructuraBeanSwingJInternalFrame.estructuraSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					estructuraBeanSwingJInternalFrame.estructuraSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					estructuraBeanSwingJInternalFrame.cargarCombosForeignKeyEstructura(estructuraBeanSwingJInternalFrame.isCargarCombosDependencia);
					estructuraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					estructuraBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						estructuraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					estructuraBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					estructuraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					estructuraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					estructuraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura(true);
					estructuraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEstructura("n",estructuraBeanSwingJInternalFrame.isGuardarCambiosEnLote, estructuraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					estructuraBeanSwingJInternalFrame.setAutoscrolls(true);
					estructuraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						estructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEstructura("relacionado");
					} else {
						estructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEstructura("no_relacionado");
					}

					estructuraBeanSwingJInternalFrame.getjButtonRecargarInformacionEstructura().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEvaluacionEmpleadoBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,EvaluacionEmpleadoBeanSwingJInternalFrame evaluacionempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//evaluacionempleadoBeanSwingJInternalFrame=new EvaluacionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					evaluacionempleadoBeanSwingJInternalFrame.getEvaluacionEmpleadoLogic().setConnexion(this.estructuraLogic.getConnexion());

					evaluacionempleadoBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					evaluacionempleadoBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					evaluacionempleadoBeanSwingJInternalFrame.evaluacionempleadoSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					evaluacionempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEvaluacionEmpleado(evaluacionempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					evaluacionempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					evaluacionempleadoBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						evaluacionempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					evaluacionempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					evaluacionempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					evaluacionempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					evaluacionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					evaluacionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEvaluacionEmpleado(true);
					evaluacionempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEvaluacionEmpleado("n",evaluacionempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, evaluacionempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					evaluacionempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					evaluacionempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						evaluacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEvaluacionEmpleado("relacionado");
					} else {
						evaluacionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEvaluacionEmpleado("no_relacionado");
					}

					evaluacionempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionEvaluacionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoImpuestoRentaBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,EmpleadoImpuestoRentaBeanSwingJInternalFrame empleadoimpuestorentaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoimpuestorentaBeanSwingJInternalFrame=new EmpleadoImpuestoRentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoimpuestorentaBeanSwingJInternalFrame.getEmpleadoImpuestoRentaLogic().setConnexion(this.estructuraLogic.getConnexion());

					empleadoimpuestorentaBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					empleadoimpuestorentaBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					empleadoimpuestorentaBeanSwingJInternalFrame.empleadoimpuestorentaSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					empleadoimpuestorentaBeanSwingJInternalFrame.empleadoimpuestorentaSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoimpuestorentaBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoImpuestoRenta(empleadoimpuestorentaBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoimpuestorentaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					empleadoimpuestorentaBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						empleadoimpuestorentaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoimpuestorentaBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					empleadoimpuestorentaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoimpuestorentaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					empleadoimpuestorentaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					empleadoimpuestorentaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(true);
					empleadoimpuestorentaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("n",empleadoimpuestorentaBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoimpuestorentaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoimpuestorentaBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoimpuestorentaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoimpuestorentaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoImpuestoRenta("relacionado");
					} else {
						empleadoimpuestorentaBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoImpuestoRenta("no_relacionado");
					}

					empleadoimpuestorentaBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoImpuestoRenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRubroEstructuraBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,RubroEstructuraBeanSwingJInternalFrame rubroestructuraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//rubroestructuraBeanSwingJInternalFrame=new RubroEstructuraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					rubroestructuraBeanSwingJInternalFrame.getRubroEstructuraLogic().setConnexion(this.estructuraLogic.getConnexion());

					rubroestructuraBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					rubroestructuraBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					rubroestructuraBeanSwingJInternalFrame.rubroestructuraSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					rubroestructuraBeanSwingJInternalFrame.rubroestructuraSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					rubroestructuraBeanSwingJInternalFrame.cargarCombosForeignKeyRubroEstructura(rubroestructuraBeanSwingJInternalFrame.isCargarCombosDependencia);
					rubroestructuraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					rubroestructuraBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						rubroestructuraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					rubroestructuraBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					rubroestructuraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					rubroestructuraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					rubroestructuraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					rubroestructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEstructura(true);
					rubroestructuraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRubroEstructura("n",rubroestructuraBeanSwingJInternalFrame.isGuardarCambiosEnLote, rubroestructuraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					rubroestructuraBeanSwingJInternalFrame.setAutoscrolls(true);
					rubroestructuraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						rubroestructuraBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEstructura("relacionado");
					} else {
						rubroestructuraBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEstructura("no_relacionado");
					}

					rubroestructuraBeanSwingJInternalFrame.getjButtonRecargarInformacionRubroEstructura().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCierreRolMensualBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,CierreRolMensualBeanSwingJInternalFrame cierrerolmensualBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cierrerolmensualBeanSwingJInternalFrame=new CierreRolMensualBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cierrerolmensualBeanSwingJInternalFrame.getCierreRolMensualLogic().setConnexion(this.estructuraLogic.getConnexion());

					cierrerolmensualBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					cierrerolmensualBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					cierrerolmensualBeanSwingJInternalFrame.cierrerolmensualSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cierrerolmensualBeanSwingJInternalFrame.cargarCombosForeignKeyCierreRolMensual(cierrerolmensualBeanSwingJInternalFrame.isCargarCombosDependencia);
					cierrerolmensualBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					cierrerolmensualBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cierrerolmensualBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					cierrerolmensualBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					cierrerolmensualBeanSwingJInternalFrame.inicializarActualizarBindingTablaCierreRolMensual(true);
					cierrerolmensualBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCierreRolMensual("n",cierrerolmensualBeanSwingJInternalFrame.isGuardarCambiosEnLote, cierrerolmensualBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cierrerolmensualBeanSwingJInternalFrame.setAutoscrolls(true);
					cierrerolmensualBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cierrerolmensualBeanSwingJInternalFrame.actualizarEstadoPanelsCierreRolMensual("relacionado");
					} else {
						cierrerolmensualBeanSwingJInternalFrame.actualizarEstadoPanelsCierreRolMensual("no_relacionado");
					}

					cierrerolmensualBeanSwingJInternalFrame.getjButtonRecargarInformacionCierreRolMensual().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormatoNomiBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,FormatoNomiBeanSwingJInternalFrame formatonomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formatonomiBeanSwingJInternalFrame=new FormatoNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formatonomiBeanSwingJInternalFrame.getFormatoNomiLogic().setConnexion(this.estructuraLogic.getConnexion());

					formatonomiBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					formatonomiBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					formatonomiBeanSwingJInternalFrame.formatonomiSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					formatonomiBeanSwingJInternalFrame.formatonomiSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formatonomiBeanSwingJInternalFrame.cargarCombosForeignKeyFormatoNomi(formatonomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					formatonomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					formatonomiBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						formatonomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formatonomiBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					formatonomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formatonomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					formatonomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					formatonomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormatoNomi(true);
					formatonomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormatoNomi("n",formatonomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, formatonomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formatonomiBeanSwingJInternalFrame.setAutoscrolls(true);
					formatonomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formatonomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomi("relacionado");
					} else {
						formatonomiBeanSwingJInternalFrame.actualizarEstadoPanelsFormatoNomi("no_relacionado");
					}

					formatonomiBeanSwingJInternalFrame.getjButtonRecargarInformacionFormatoNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoEstructuraBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,EmpleadoEstructuraBeanSwingJInternalFrame empleadoestructuraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoestructuraBeanSwingJInternalFrame=new EmpleadoEstructuraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoestructuraBeanSwingJInternalFrame.getEmpleadoEstructuraLogic().setConnexion(this.estructuraLogic.getConnexion());

					empleadoestructuraBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					empleadoestructuraBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoestructuraBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoEstructura(empleadoestructuraBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoestructuraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					empleadoestructuraBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						empleadoestructuraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoestructuraBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					empleadoestructuraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoestructuraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					empleadoestructuraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					empleadoestructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoEstructura(true);
					empleadoestructuraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoEstructura("n",empleadoestructuraBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoestructuraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoestructuraBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoestructuraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoestructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoEstructura("relacionado");
					} else {
						empleadoestructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoEstructura("no_relacionado");
					}

					empleadoestructuraBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoEstructura().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarHistorialPagoNomiBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,HistorialPagoNomiBeanSwingJInternalFrame historialpagonomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//historialpagonomiBeanSwingJInternalFrame=new HistorialPagoNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					historialpagonomiBeanSwingJInternalFrame.getHistorialPagoNomiLogic().setConnexion(this.estructuraLogic.getConnexion());

					historialpagonomiBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					historialpagonomiBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					historialpagonomiBeanSwingJInternalFrame.historialpagonomiSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					historialpagonomiBeanSwingJInternalFrame.historialpagonomiSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					historialpagonomiBeanSwingJInternalFrame.cargarCombosForeignKeyHistorialPagoNomi(historialpagonomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					historialpagonomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					historialpagonomiBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						historialpagonomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					historialpagonomiBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					historialpagonomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					historialpagonomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					historialpagonomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					historialpagonomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaHistorialPagoNomi(true);
					historialpagonomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesHistorialPagoNomi("n",historialpagonomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, historialpagonomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					historialpagonomiBeanSwingJInternalFrame.setAutoscrolls(true);
					historialpagonomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						historialpagonomiBeanSwingJInternalFrame.actualizarEstadoPanelsHistorialPagoNomi("relacionado");
					} else {
						historialpagonomiBeanSwingJInternalFrame.actualizarEstadoPanelsHistorialPagoNomi("no_relacionado");
					}

					historialpagonomiBeanSwingJInternalFrame.getjButtonRecargarInformacionHistorialPagoNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarAsistenciaDiariaBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,AsistenciaDiariaBeanSwingJInternalFrame asistenciadiariaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//asistenciadiariaBeanSwingJInternalFrame=new AsistenciaDiariaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					asistenciadiariaBeanSwingJInternalFrame.getAsistenciaDiariaLogic().setConnexion(this.estructuraLogic.getConnexion());

					asistenciadiariaBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					asistenciadiariaBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					asistenciadiariaBeanSwingJInternalFrame.asistenciadiariaSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					asistenciadiariaBeanSwingJInternalFrame.asistenciadiariaSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					asistenciadiariaBeanSwingJInternalFrame.cargarCombosForeignKeyAsistenciaDiaria(asistenciadiariaBeanSwingJInternalFrame.isCargarCombosDependencia);
					asistenciadiariaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					asistenciadiariaBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						asistenciadiariaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					asistenciadiariaBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					asistenciadiariaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					asistenciadiariaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					asistenciadiariaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					asistenciadiariaBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsistenciaDiaria(true);
					asistenciadiariaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAsistenciaDiaria("n",asistenciadiariaBeanSwingJInternalFrame.isGuardarCambiosEnLote, asistenciadiariaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					asistenciadiariaBeanSwingJInternalFrame.setAutoscrolls(true);
					asistenciadiariaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						asistenciadiariaBeanSwingJInternalFrame.actualizarEstadoPanelsAsistenciaDiaria("relacionado");
					} else {
						asistenciadiariaBeanSwingJInternalFrame.actualizarEstadoPanelsAsistenciaDiaria("no_relacionado");
					}

					asistenciadiariaBeanSwingJInternalFrame.getjButtonRecargarInformacionAsistenciaDiaria().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFuncionEstrucBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,FuncionEstrucBeanSwingJInternalFrame funcionestrucBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//funcionestrucBeanSwingJInternalFrame=new FuncionEstrucBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					funcionestrucBeanSwingJInternalFrame.getFuncionEstrucLogic().setConnexion(this.estructuraLogic.getConnexion());

					funcionestrucBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					funcionestrucBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					funcionestrucBeanSwingJInternalFrame.funcionestrucSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					funcionestrucBeanSwingJInternalFrame.funcionestrucSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					funcionestrucBeanSwingJInternalFrame.cargarCombosForeignKeyFuncionEstruc(funcionestrucBeanSwingJInternalFrame.isCargarCombosDependencia);
					funcionestrucBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					funcionestrucBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						funcionestrucBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					funcionestrucBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					funcionestrucBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					funcionestrucBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					funcionestrucBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					funcionestrucBeanSwingJInternalFrame.inicializarActualizarBindingTablaFuncionEstruc(true);
					funcionestrucBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFuncionEstruc("n",funcionestrucBeanSwingJInternalFrame.isGuardarCambiosEnLote, funcionestrucBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					funcionestrucBeanSwingJInternalFrame.setAutoscrolls(true);
					funcionestrucBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						funcionestrucBeanSwingJInternalFrame.actualizarEstadoPanelsFuncionEstruc("relacionado");
					} else {
						funcionestrucBeanSwingJInternalFrame.actualizarEstadoPanelsFuncionEstruc("no_relacionado");
					}

					funcionestrucBeanSwingJInternalFrame.getjButtonRecargarInformacionFuncionEstruc().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSolicitudReemplazoBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,SolicitudReemplazoBeanSwingJInternalFrame solicitudreemplazoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//solicitudreemplazoBeanSwingJInternalFrame=new SolicitudReemplazoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					solicitudreemplazoBeanSwingJInternalFrame.getSolicitudReemplazoLogic().setConnexion(this.estructuraLogic.getConnexion());

					solicitudreemplazoBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					solicitudreemplazoBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					solicitudreemplazoBeanSwingJInternalFrame.solicitudreemplazoSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					solicitudreemplazoBeanSwingJInternalFrame.cargarCombosForeignKeySolicitudReemplazo(solicitudreemplazoBeanSwingJInternalFrame.isCargarCombosDependencia);
					solicitudreemplazoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					solicitudreemplazoBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						solicitudreemplazoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					solicitudreemplazoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					solicitudreemplazoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					solicitudreemplazoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					solicitudreemplazoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					solicitudreemplazoBeanSwingJInternalFrame.inicializarActualizarBindingTablaSolicitudReemplazo(true);
					solicitudreemplazoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSolicitudReemplazo("n",solicitudreemplazoBeanSwingJInternalFrame.isGuardarCambiosEnLote, solicitudreemplazoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					solicitudreemplazoBeanSwingJInternalFrame.setAutoscrolls(true);
					solicitudreemplazoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						solicitudreemplazoBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudReemplazo("relacionado");
					} else {
						solicitudreemplazoBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudReemplazo("no_relacionado");
					}

					solicitudreemplazoBeanSwingJInternalFrame.getjButtonRecargarInformacionSolicitudReemplazo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSolicitudHoraExtraBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,SolicitudHoraExtraBeanSwingJInternalFrame solicitudhoraextraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//solicitudhoraextraBeanSwingJInternalFrame=new SolicitudHoraExtraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					solicitudhoraextraBeanSwingJInternalFrame.getSolicitudHoraExtraLogic().setConnexion(this.estructuraLogic.getConnexion());

					solicitudhoraextraBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					solicitudhoraextraBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					solicitudhoraextraBeanSwingJInternalFrame.solicitudhoraextraSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					solicitudhoraextraBeanSwingJInternalFrame.cargarCombosForeignKeySolicitudHoraExtra(solicitudhoraextraBeanSwingJInternalFrame.isCargarCombosDependencia);
					solicitudhoraextraBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					solicitudhoraextraBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						solicitudhoraextraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					solicitudhoraextraBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					solicitudhoraextraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					solicitudhoraextraBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					solicitudhoraextraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					solicitudhoraextraBeanSwingJInternalFrame.inicializarActualizarBindingTablaSolicitudHoraExtra(true);
					solicitudhoraextraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSolicitudHoraExtra("n",solicitudhoraextraBeanSwingJInternalFrame.isGuardarCambiosEnLote, solicitudhoraextraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					solicitudhoraextraBeanSwingJInternalFrame.setAutoscrolls(true);
					solicitudhoraextraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						solicitudhoraextraBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudHoraExtra("relacionado");
					} else {
						solicitudhoraextraBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudHoraExtra("no_relacionado");
					}

					solicitudhoraextraBeanSwingJInternalFrame.getjButtonRecargarInformacionSolicitudHoraExtra().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEvaluacionNomiBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,EvaluacionNomiBeanSwingJInternalFrame evaluacionnomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//evaluacionnomiBeanSwingJInternalFrame=new EvaluacionNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					evaluacionnomiBeanSwingJInternalFrame.getEvaluacionNomiLogic().setConnexion(this.estructuraLogic.getConnexion());

					evaluacionnomiBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					evaluacionnomiBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					evaluacionnomiBeanSwingJInternalFrame.evaluacionnomiSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					evaluacionnomiBeanSwingJInternalFrame.cargarCombosForeignKeyEvaluacionNomi(evaluacionnomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					evaluacionnomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					evaluacionnomiBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						evaluacionnomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					evaluacionnomiBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					evaluacionnomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					evaluacionnomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					evaluacionnomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					evaluacionnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaEvaluacionNomi(true);
					evaluacionnomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEvaluacionNomi("n",evaluacionnomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, evaluacionnomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					evaluacionnomiBeanSwingJInternalFrame.setAutoscrolls(true);
					evaluacionnomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						evaluacionnomiBeanSwingJInternalFrame.actualizarEstadoPanelsEvaluacionNomi("relacionado");
					} else {
						evaluacionnomiBeanSwingJInternalFrame.actualizarEstadoPanelsEvaluacionNomi("no_relacionado");
					}

					evaluacionnomiBeanSwingJInternalFrame.getjButtonRecargarInformacionEvaluacionNomi().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarSolicitudVacacionBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,SolicitudVacacionBeanSwingJInternalFrame solicitudvacacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//solicitudvacacionBeanSwingJInternalFrame=new SolicitudVacacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					solicitudvacacionBeanSwingJInternalFrame.getSolicitudVacacionLogic().setConnexion(this.estructuraLogic.getConnexion());

					solicitudvacacionBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					solicitudvacacionBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					solicitudvacacionBeanSwingJInternalFrame.solicitudvacacionSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					solicitudvacacionBeanSwingJInternalFrame.cargarCombosForeignKeySolicitudVacacion(solicitudvacacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					solicitudvacacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					solicitudvacacionBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						solicitudvacacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					solicitudvacacionBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					solicitudvacacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					solicitudvacacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					solicitudvacacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					solicitudvacacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaSolicitudVacacion(true);
					solicitudvacacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSolicitudVacacion("n",solicitudvacacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, solicitudvacacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					solicitudvacacionBeanSwingJInternalFrame.setAutoscrolls(true);
					solicitudvacacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						solicitudvacacionBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudVacacion("relacionado");
					} else {
						solicitudvacacionBeanSwingJInternalFrame.actualizarEstadoPanelsSolicitudVacacion("no_relacionado");
					}

					solicitudvacacionBeanSwingJInternalFrame.getjButtonRecargarInformacionSolicitudVacacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarResponsableActivoFijoBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,ResponsableActivoFijoBeanSwingJInternalFrame responsableactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//responsableactivofijoBeanSwingJInternalFrame=new ResponsableActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					responsableactivofijoBeanSwingJInternalFrame.getResponsableActivoFijoLogic().setConnexion(this.estructuraLogic.getConnexion());

					responsableactivofijoBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					responsableactivofijoBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					responsableactivofijoBeanSwingJInternalFrame.responsableactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					responsableactivofijoBeanSwingJInternalFrame.responsableactivofijoSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					responsableactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyResponsableActivoFijo(responsableactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					responsableactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					responsableactivofijoBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						responsableactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					responsableactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					responsableactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					responsableactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					responsableactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					responsableactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaResponsableActivoFijo(true);
					responsableactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesResponsableActivoFijo("n",responsableactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, responsableactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					responsableactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					responsableactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						responsableactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsResponsableActivoFijo("relacionado");
					} else {
						responsableactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsResponsableActivoFijo("no_relacionado");
					}

					responsableactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionResponsableActivoFijo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRubroEmpleaCuentaContableBeanSwingJInternalFrame(List<Estructura> estructuras,Estructura estructura,RubroEmpleaCuentaContableBeanSwingJInternalFrame rubroempleacuentacontableBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//rubroempleacuentacontableBeanSwingJInternalFrame=new RubroEmpleaCuentaContableBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					rubroempleacuentacontableBeanSwingJInternalFrame.getRubroEmpleaCuentaContableLogic().setConnexion(this.estructuraLogic.getConnexion());

					rubroempleacuentacontableBeanSwingJInternalFrame.setestructurasForeignKey(estructuras);
					rubroempleacuentacontableBeanSwingJInternalFrame.setestructuraForeignKey(estructura);
					rubroempleacuentacontableBeanSwingJInternalFrame.rubroempleacuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionEstructura(true);
					rubroempleacuentacontableBeanSwingJInternalFrame.rubroempleacuentacontableSessionBean.setlidEstructuraActual(estructura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					rubroempleacuentacontableBeanSwingJInternalFrame.cargarCombosForeignKeyRubroEmpleaCuentaContable(rubroempleacuentacontableBeanSwingJInternalFrame.isCargarCombosDependencia);
					rubroempleacuentacontableBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstructura(true);
					rubroempleacuentacontableBeanSwingJInternalFrame.setid_estructuraFK_IdEstructura(estructura.getId());

					if(!this.conCargarFormDetalle) {
						rubroempleacuentacontableBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					rubroempleacuentacontableBeanSwingJInternalFrame.setSelectedItemCombosFrameEstructuraForeignKey(estructura,1,false,true,true);
					rubroempleacuentacontableBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					rubroempleacuentacontableBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstructura");
					rubroempleacuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstructura");
					rubroempleacuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmpleaCuentaContable(true);
					rubroempleacuentacontableBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRubroEmpleaCuentaContable("n",rubroempleacuentacontableBeanSwingJInternalFrame.isGuardarCambiosEnLote, rubroempleacuentacontableBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					rubroempleacuentacontableBeanSwingJInternalFrame.setAutoscrolls(true);
					rubroempleacuentacontableBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						rubroempleacuentacontableBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmpleaCuentaContable("relacionado");
					} else {
						rubroempleacuentacontableBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmpleaCuentaContable("no_relacionado");
					}

					rubroempleacuentacontableBeanSwingJInternalFrame.getjButtonRecargarInformacionRubroEmpleaCuentaContable().setVisible(false);

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
