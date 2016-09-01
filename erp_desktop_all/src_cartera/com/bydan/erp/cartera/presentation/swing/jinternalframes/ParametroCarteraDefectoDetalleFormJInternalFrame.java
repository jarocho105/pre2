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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.ParametroCarteraDefectoConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class ParametroCarteraDefectoDetalleFormJInternalFrame extends ParametroCarteraDefectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroCarteraDefecto;
	
	protected JMenuBar jmenuBarDetalleParametroCarteraDefecto;
	
	protected JMenu jmenuDetalleParametroCarteraDefecto;
	protected JMenu jmenuDetalleArchivoParametroCarteraDefecto;
	protected JMenu jmenuDetalleAccionesParametroCarteraDefecto;
	protected JMenu jmenuDetalleDatosParametroCarteraDefecto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroCarteraDefecto;	
	protected GridBagConstraints gridBagConstraintsParametroCarteraDefecto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroCarteraDefectoBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroCarteraDefecto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_region="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ciudad="";

	protected ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_zona="";

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";

	protected TipoNivelEduBeanSwingJInternalFrame tiponiveleduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiponiveledu="";

	protected PaisBeanSwingJInternalFrame paisnacionalidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_paisnacionalidad="";

	protected TipoGeneroBeanSwingJInternalFrame tipogeneroBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogenero="";

	protected EstadoCivilBeanSwingJInternalFrame estadocivilBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadocivil="";

	protected EstadoLegalBeanSwingJInternalFrame estadolegalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadolegal="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected RutaBeanSwingJInternalFrame rutaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ruta="";

	protected DiaBeanSwingJInternalFrame diaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_dia="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected TipoListaPrecioBeanSwingJInternalFrame tipolistaprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipolistaprecio="";
	
	public ParametroCarteraDefectoSessionBean parametrocarteradefectoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PaisSessionBean paisSessionBean;
	public RegionSessionBean regionSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CiudadSessionBean ciudadSessionBean;
	public ZonaSessionBean zonaSessionBean;
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;
	public TipoNivelEduSessionBean tiponiveleduSessionBean;
	public PaisSessionBean paisnacionalidadSessionBean;
	public TipoGeneroSessionBean tipogeneroSessionBean;
	public EstadoCivilSessionBean estadocivilSessionBean;
	public EstadoLegalSessionBean estadolegalSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public RutaSessionBean rutaSessionBean;
	public DiaSessionBean diaSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public TipoListaPrecioSessionBean tipolistaprecioSessionBean;	
	
	public ParametroCarteraDefectoLogic parametrocarteradefectoLogic;
	
	public JScrollPane jScrollPanelDatosParametroCarteraDefecto;
	public JScrollPane jScrollPanelDatosEdicionParametroCarteraDefecto;
	public JScrollPane jScrollPanelDatosGeneralParametroCarteraDefecto;
	
	protected JPanel jPanelCamposParametroCarteraDefecto;    
	protected JPanel jPanelCamposOcultosParametroCarteraDefecto;    	
	protected JPanel jPanelAccionesParametroCarteraDefecto;
	protected JPanel jPanelAccionesFormularioParametroCarteraDefecto;
    
	
	
	protected Integer iXPanelCamposParametroCarteraDefecto=0;
	protected Integer iYPanelCamposParametroCarteraDefecto=0;
	
	protected Integer iXPanelCamposOcultosParametroCarteraDefecto=0;
	protected Integer iYPanelCamposOcultosParametroCarteraDefecto=0;
	
	

	protected JPanel jPanelCamposInicioubicacionParametroCarteraDefecto;
	protected Integer iXPanelCamposInicioubicacionParametroCarteraDefecto=0;
	protected Integer iYPanelCamposInicioubicacionParametroCarteraDefecto=0;

	protected JPanel jPanelCamposInicioproveedorParametroCarteraDefecto;
	protected Integer iXPanelCamposInicioproveedorParametroCarteraDefecto=0;
	protected Integer iYPanelCamposInicioproveedorParametroCarteraDefecto=0;

	protected JPanel jPanelCamposIniciocontableParametroCarteraDefecto;
	protected Integer iXPanelCamposIniciocontableParametroCarteraDefecto=0;
	protected Integer iYPanelCamposIniciocontableParametroCarteraDefecto=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroCarteraDefecto;
	public JButton jButtonModificarParametroCarteraDefecto;
	public JButton jButtonActualizarParametroCarteraDefecto;
    public JButton jButtonEliminarParametroCarteraDefecto;
	public JButton jButtonCancelarParametroCarteraDefecto;
    public JButton jButtonGuardarCambiosParametroCarteraDefecto;
	public JButton jButtonGuardarCambiosTablaParametroCarteraDefecto;
	protected JButton jButtonCerrarParametroCarteraDefecto;
	
	
	protected JButton jButtonProcesarInformacionParametroCarteraDefecto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroCarteraDefecto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroCarteraDefecto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroCarteraDefecto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroCarteraDefecto;
	protected JButton jButtonModificarToolBarParametroCarteraDefecto;
	protected JButton jButtonActualizarToolBarParametroCarteraDefecto;
    protected JButton jButtonEliminarToolBarParametroCarteraDefecto;
	protected JButton jButtonCancelarToolBarParametroCarteraDefecto;
    protected JButton jButtonGuardarCambiosToolBarParametroCarteraDefecto;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroCarteraDefecto;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroCarteraDefecto;
	protected JButton jButtonCerrarToolBarParametroCarteraDefecto;
	
	protected JButton jButtonProcesarInformacionToolBarParametroCarteraDefecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroCarteraDefecto;
	protected JMenuItem jMenuItemModificarParametroCarteraDefecto;
	protected JMenuItem jMenuItemActualizarParametroCarteraDefecto;
    protected JMenuItem jMenuItemEliminarParametroCarteraDefecto;
	protected JMenuItem jMenuItemCancelarParametroCarteraDefecto;
    protected JMenuItem jMenuItemGuardarCambiosParametroCarteraDefecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroCarteraDefecto;
	protected JMenuItem jMenuItemCerrarParametroCarteraDefecto;
	protected JMenuItem jMenuItemDetalleCerrarParametroCarteraDefecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroCarteraDefecto;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroCarteraDefecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroCarteraDefecto;
	protected JMenuItem jMenuItemMostrarOcultarParametroCarteraDefecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroCarteraDefecto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroCarteraDefecto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroCarteraDefecto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroCarteraDefecto;
	public JLabel jLabelIdParametroCarteraDefecto;
	public JLabel jLabelidParametroCarteraDefecto;
	public JButton jButtonidParametroCarteraDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroCarteraDefecto;
	public JLabel jLabelid_empresaParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroCarteraDefecto;
	public JButton jButtonid_empresaParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_empresaParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroCarteraDefecto;
	public JLabel jLabelid_sucursalParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroCarteraDefecto;
	public JButton jButtonid_sucursalParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_sucursalParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_paisParametroCarteraDefecto;
	public JLabel jLabelid_paisParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisParametroCarteraDefecto;
	public JButton jButtonid_paisParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_paisParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_paisParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_regionParametroCarteraDefecto;
	public JLabel jLabelid_regionParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_regionParametroCarteraDefecto;
	public JButton jButtonid_regionParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_regionParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_regionParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_provinciaParametroCarteraDefecto;
	public JLabel jLabelid_provinciaParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaParametroCarteraDefecto;
	public JButton jButtonid_provinciaParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_provinciaParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_provinciaParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_ciudadParametroCarteraDefecto;
	public JLabel jLabelid_ciudadParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ciudadParametroCarteraDefecto;
	public JButton jButtonid_ciudadParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_ciudadParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_ciudadParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_zonaParametroCarteraDefecto;
	public JLabel jLabelid_zonaParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_zonaParametroCarteraDefecto;
	public JButton jButtonid_zonaParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_zonaParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_zonaParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_identificacionParametroCarteraDefecto;
	public JLabel jLabelid_tipo_identificacionParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_identificacionParametroCarteraDefecto;
	public JButton jButtonid_tipo_identificacionParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_tipo_identificacionParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_identificacionParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_nivel_eduParametroCarteraDefecto;
	public JLabel jLabelid_tipo_nivel_eduParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_nivel_eduParametroCarteraDefecto;
	public JButton jButtonid_tipo_nivel_eduParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_tipo_nivel_eduParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_nivel_eduParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_pais_nacionalidadParametroCarteraDefecto;
	public JLabel jLabelid_pais_nacionalidadParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pais_nacionalidadParametroCarteraDefecto;
	public JButton jButtonid_pais_nacionalidadParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_pais_nacionalidadParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_pais_nacionalidadParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_generoParametroCarteraDefecto;
	public JLabel jLabelid_tipo_generoParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_generoParametroCarteraDefecto;
	public JButton jButtonid_tipo_generoParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_tipo_generoParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_generoParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_civilParametroCarteraDefecto;
	public JLabel jLabelid_estado_civilParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_civilParametroCarteraDefecto;
	public JButton jButtonid_estado_civilParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_estado_civilParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_estado_civilParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_legalParametroCarteraDefecto;
	public JLabel jLabelid_estado_legalParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_legalParametroCarteraDefecto;
	public JButton jButtonid_estado_legalParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_estado_legalParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_estado_legalParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableParametroCarteraDefecto;
	public JLabel jLabelid_cuenta_contableParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableParametroCarteraDefecto;
	public JButton jButtonid_cuenta_contableParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_cuenta_contableParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableParametroCarteraDefectoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableParametroCarteraDefectoArbol= new JButtonMe();

	public JPanel jPanelid_vendedorParametroCarteraDefecto;
	public JLabel jLabelid_vendedorParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorParametroCarteraDefecto;
	public JButton jButtonid_vendedorParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_vendedorParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_vendedorParametroCarteraDefectoBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorParametroCarteraDefectoArbol= new JButtonMe();

	public JPanel jPanelid_rutaParametroCarteraDefecto;
	public JLabel jLabelid_rutaParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rutaParametroCarteraDefecto;
	public JButton jButtonid_rutaParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_rutaParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_rutaParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_diaParametroCarteraDefecto;
	public JLabel jLabelid_diaParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_diaParametroCarteraDefecto;
	public JButton jButtonid_diaParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_diaParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_diaParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioParametroCarteraDefecto;
	public JLabel jLabelid_tipo_precioParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioParametroCarteraDefecto;
	public JButton jButtonid_tipo_precioParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_tipo_precioParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioParametroCarteraDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_lista_precioParametroCarteraDefecto;
	public JLabel jLabelid_tipo_lista_precioParametroCarteraDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_lista_precioParametroCarteraDefecto;
	public JButton jButtonid_tipo_lista_precioParametroCarteraDefecto= new JButtonMe();
	public JButton jButtonid_tipo_lista_precioParametroCarteraDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_lista_precioParametroCarteraDefectoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroCarteraDefecto;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroCarteraDefectoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroCarteraDefecto=new JPanel();
				this.jPanelAccionesFormularioParametroCarteraDefecto=new JPanel();
				this.jmenuBarDetalleParametroCarteraDefecto=new JMenuBar();
				this.jTtoolBarDetalleParametroCarteraDefecto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraDefectoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroCarteraDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroCarteraDefectoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroCarteraDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraDefectoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroCarteraDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraDefectoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroCarteraDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroCarteraDefectoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroCarteraDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroCarteraDefecto() {
		return this.jButtonActualizarToolBarParametroCarteraDefecto;
	}
	
	public JButton getjButtonEliminarToolBarParametroCarteraDefecto() {
		return this.jButtonEliminarToolBarParametroCarteraDefecto;
	}
	
	public JButton getjButtonCancelarToolBarParametroCarteraDefecto() {
		return this.jButtonCancelarToolBarParametroCarteraDefecto;
	}		
	
	public JButton getjButtonProcesarInformacionParametroCarteraDefecto() {
		return this.jButtonProcesarInformacionParametroCarteraDefecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroCarteraDefecto)	{
		this.jButtonProcesarInformacionParametroCarteraDefecto = jButtonProcesarInformacionParametroCarteraDefecto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroCarteraDefecto() {
		return this.jComboBoxTiposAccionesParametroCarteraDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroCarteraDefecto(
			JComboBox jComboBoxTiposRelacionesParametroCarteraDefecto) {
		this.jComboBoxTiposRelacionesParametroCarteraDefecto = jComboBoxTiposRelacionesParametroCarteraDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroCarteraDefecto(
			JComboBox jComboBoxTiposAccionesParametroCarteraDefecto) {
		this.jComboBoxTiposAccionesParametroCarteraDefecto = jComboBoxTiposAccionesParametroCarteraDefecto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroCarteraDefecto() {
		return this.jComboBoxTiposAccionesFormularioParametroCarteraDefecto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroCarteraDefecto(
			JComboBox jComboBoxTiposAccionesFormularioParametroCarteraDefecto) {
		this.jComboBoxTiposAccionesFormularioParametroCarteraDefecto = jComboBoxTiposAccionesFormularioParametroCarteraDefecto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		
		this.parametrocarteradefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroCarteraDefectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Cartera Defecto MANTENIMIENTO"));
		
		
		if(iWidth > 1950) {
			iWidth=1950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroCarteraDefecto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroCarteraDefecto=new JButtonMe();
				this.jButtonModificarToolBarParametroCarteraDefecto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroCarteraDefecto,this.jTtoolBarDetalleParametroCarteraDefecto,
							"actualizar","actualizar","Actualizar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroCarteraDefecto,this.jTtoolBarDetalleParametroCarteraDefecto,
							"eliminar","eliminar","Eliminar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroCarteraDefecto,this.jTtoolBarDetalleParametroCarteraDefecto,
							"cancelar","cancelar","Cancelar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroCarteraDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroCarteraDefecto,this.jTtoolBarDetalleParametroCarteraDefecto,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroCarteraDefecto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroCarteraDefecto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroCarteraDefecto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroCarteraDefecto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroCarteraDefecto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroCarteraDefecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroCarteraDefecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroCarteraDefecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroCarteraDefecto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroCarteraDefecto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroCarteraDefecto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroCarteraDefecto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroCarteraDefecto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroCarteraDefecto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroCarteraDefecto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroCarteraDefecto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroCarteraDefecto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroCarteraDefecto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroCarteraDefecto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroCarteraDefecto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroCarteraDefecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroCarteraDefecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroCarteraDefecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroCarteraDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroCarteraDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroCarteraDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroCarteraDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroCarteraDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroCarteraDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroCarteraDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroCarteraDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroCarteraDefecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroCarteraDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroCarteraDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroCarteraDefecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroCarteraDefecto.add(this.jMenuItemDetalleCerrarParametroCarteraDefecto);
		
		this.jmenuDetalleAccionesParametroCarteraDefecto.add(this.jMenuItemActualizarParametroCarteraDefecto);
		this.jmenuDetalleAccionesParametroCarteraDefecto.add(this.jMenuItemEliminarParametroCarteraDefecto);
		this.jmenuDetalleAccionesParametroCarteraDefecto.add(this.jMenuItemCancelarParametroCarteraDefecto);		
		
		//this.jmenuDetalleDatosParametroCarteraDefecto.add(this.jMenuItemDetalleAbrirOrderByParametroCarteraDefecto);				
		this.jmenuDetalleDatosParametroCarteraDefecto.add(this.jMenuItemDetalleMostarOcultarParametroCarteraDefecto);				
				
		//this.jmenuDetalleAccionesParametroCarteraDefecto.add(this.jMenuItemGuardarCambiosParametroCarteraDefecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroCarteraDefecto.add(this.jmenuDetalleArchivoParametroCarteraDefecto);		
		this.jmenuBarDetalleParametroCarteraDefecto.add(this.jmenuDetalleAccionesParametroCarteraDefecto);		
		this.jmenuBarDetalleParametroCarteraDefecto.add(this.jmenuDetalleDatosParametroCarteraDefecto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroCarteraDefecto);				
	}
	
	
	public void inicializarElementosCamposParametroCarteraDefecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroCarteraDefecto = new JLabelMe();
		jLabelIdParametroCarteraDefecto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroCarteraDefecto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroCarteraDefecto= new GridBagLayout();

		this.jPanelidParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);

		jLabelidParametroCarteraDefecto = new JLabel();
		jLabelidParametroCarteraDefecto.setText("Id");

		jLabelidParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysParametroCarteraDefecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_empresaParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroCarteraDefecto.setToolTipText("Empresa");
		this.jLabelid_empresaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_empresaParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_empresaParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_empresaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroCarteraDefecto.setEnabled(false);

		this.jButtonid_empresaParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_empresaParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_empresaParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroCarteraDefecto"));

		this.jButtonid_empresaParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_empresaParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_empresaParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_empresaParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroCarteraDefectoUpdate"));



					
		this.jLabelid_sucursalParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_sucursalParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroCarteraDefecto.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_sucursalParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_sucursalParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_sucursalParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroCarteraDefecto.setEnabled(false);

		this.jButtonid_sucursalParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_sucursalParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_sucursalParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroCarteraDefecto"));

		this.jButtonid_sucursalParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_sucursalParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_sucursalParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroCarteraDefectoUpdate"));



					
		this.jLabelid_paisParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_paisParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisParametroCarteraDefecto.setToolTipText("Pais");
		this.jLabelid_paisParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_paisParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_paisParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_paisParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_paisParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_paisParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisParametroCarteraDefecto"));

		this.jButtonid_paisParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_paisParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_paisParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_paisParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_paisParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_paisParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisParametroCarteraDefectoUpdate"));



					
		this.jLabelid_regionParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_regionParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDREGION+" : *");
		this.jLabelid_regionParametroCarteraDefecto.setToolTipText("Region");
		this.jLabelid_regionParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_regionParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_regionParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_regionParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_regionParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_regionParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDREGION);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_regionParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_regionParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_regionParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_regionParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_regionParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_regionParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_regionParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_regionParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_regionParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_regionParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_regionParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionParametroCarteraDefecto"));

		this.jButtonid_regionParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_regionParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_regionParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_regionParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_regionParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_regionParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_regionParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_regionParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_regionParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_regionParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_regionParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_regionParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_regionParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_regionParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_regionParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_regionParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_regionParametroCarteraDefectoUpdate"));



					
		this.jLabelid_provinciaParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_provinciaParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDPROVINCIA+" : *");
		this.jLabelid_provinciaParametroCarteraDefecto.setToolTipText("Provincia");
		this.jLabelid_provinciaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_provinciaParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_provinciaParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDPROVINCIA);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_provinciaParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_provinciaParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_provinciaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_provinciaParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_provinciaParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_provinciaParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_provinciaParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_provinciaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaParametroCarteraDefecto"));

		this.jButtonid_provinciaParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_provinciaParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_provinciaParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_provinciaParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_provinciaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_provinciaParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_provinciaParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_provinciaParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_provinciaParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_provinciaParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_provinciaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaParametroCarteraDefectoUpdate"));



					
		this.jLabelid_ciudadParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_ciudadParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDCIUDAD+" : *");
		this.jLabelid_ciudadParametroCarteraDefecto.setToolTipText("Ciudad");
		this.jLabelid_ciudadParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ciudadParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ciudadParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ciudadParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ciudadParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDCIUDAD);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_ciudadParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_ciudadParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_ciudadParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ciudadParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ciudadParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ciudadParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_ciudadParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ciudadParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_ciudadParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ciudadParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ciudadParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadParametroCarteraDefecto"));

		this.jButtonid_ciudadParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_ciudadParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_ciudadParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ciudadParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ciudadParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ciudadParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_ciudadParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_ciudadParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ciudadParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ciudadParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_ciudadParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ciudadParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ciudadParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ciudadParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ciudadParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ciudadParametroCarteraDefectoUpdate"));



					
		this.jLabelid_zonaParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_zonaParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDZONA+" : *");
		this.jLabelid_zonaParametroCarteraDefecto.setToolTipText("Zona");
		this.jLabelid_zonaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_zonaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_zonaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_zonaParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_zonaParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDZONA);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_zonaParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_zonaParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_zonaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_zonaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_zonaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_zonaParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_zonaParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_zonaParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_zonaParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_zonaParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_zonaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaParametroCarteraDefecto"));

		this.jButtonid_zonaParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_zonaParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_zonaParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_zonaParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_zonaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_zonaParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_zonaParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_zonaParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_zonaParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_zonaParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_zonaParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_zonaParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_zonaParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_zonaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_zonaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_zonaParametroCarteraDefectoUpdate"));



					
		this.jLabelid_tipo_identificacionParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_tipo_identificacionParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPOIDENTIFICACION+" : *");
		this.jLabelid_tipo_identificacionParametroCarteraDefecto.setToolTipText("Tipo Identificacion");
		this.jLabelid_tipo_identificacionParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_identificacionParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_identificacionParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_identificacionParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_identificacionParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_identificacionParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_tipo_identificacionParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_tipo_identificacionParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_tipo_identificacionParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_identificacionParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_identificacionParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_tipo_identificacionParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_identificacionParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_identificacionParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_identificacionParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_tipo_identificacionParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_identificacionParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_identificacionParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_identificacionParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_identificacionParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_identificacionParametroCarteraDefecto"));

		this.jButtonid_tipo_identificacionParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_identificacionParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_identificacionParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_tipo_identificacionParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_identificacionParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_identificacionParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_identificacionParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_identificacionParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_identificacionParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_identificacionParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_identificacionParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_identificacionParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_identificacionParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_tipo_identificacionParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_identificacionParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_identificacionParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_identificacionParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_identificacionParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_identificacionParametroCarteraDefectoUpdate"));



					
		this.jLabelid_tipo_nivel_eduParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_tipo_nivel_eduParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPONIVELEDU+" : *");
		this.jLabelid_tipo_nivel_eduParametroCarteraDefecto.setToolTipText("Tipo Nivel Edu");
		this.jLabelid_tipo_nivel_eduParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_nivel_eduParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_nivel_eduParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_nivel_eduParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_nivel_eduParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_nivel_eduParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPONIVELEDU);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_tipo_nivel_eduParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_tipo_nivel_eduParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_tipo_nivel_eduParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_nivel_eduParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_nivel_eduParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_nivel_eduParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_nivel_eduParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_tipo_nivel_eduParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_nivel_eduParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_nivel_eduParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_nivel_eduParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_tipo_nivel_eduParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_nivel_eduParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_nivel_eduParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_nivel_eduParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_nivel_eduParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_nivel_eduParametroCarteraDefecto"));

		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_nivel_eduParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_nivel_eduParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_nivel_eduParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_nivel_eduParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_nivel_eduParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_nivel_eduParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_nivel_eduParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_nivel_eduParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_nivel_eduParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_nivel_eduParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_nivel_eduParametroCarteraDefectoUpdate"));



					
		this.jLabelid_pais_nacionalidadParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_pais_nacionalidadParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDPAISNACIONALIDAD+" : *");
		this.jLabelid_pais_nacionalidadParametroCarteraDefecto.setToolTipText("Pais Nacionalad");
		this.jLabelid_pais_nacionalidadParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pais_nacionalidadParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pais_nacionalidadParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pais_nacionalidadParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pais_nacionalidadParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pais_nacionalidadParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDPAISNACIONALIDAD);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_pais_nacionalidadParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_pais_nacionalidadParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_pais_nacionalidadParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pais_nacionalidadParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pais_nacionalidadParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pais_nacionalidadParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pais_nacionalidadParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_pais_nacionalidadParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pais_nacionalidadParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pais_nacionalidadParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pais_nacionalidadParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_pais_nacionalidadParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pais_nacionalidadParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pais_nacionalidadParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pais_nacionalidadParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pais_nacionalidadParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pais_nacionalidadParametroCarteraDefecto"));

		this.jButtonid_pais_nacionalidadParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_pais_nacionalidadParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pais_nacionalidadParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pais_nacionalidadParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pais_nacionalidadParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_pais_nacionalidadParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pais_nacionalidadParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pais_nacionalidadParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pais_nacionalidadParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pais_nacionalidadParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pais_nacionalidadParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pais_nacionalidadParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_pais_nacionalidadParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_pais_nacionalidadParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pais_nacionalidadParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pais_nacionalidadParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pais_nacionalidadParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_pais_nacionalidadParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pais_nacionalidadParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pais_nacionalidadParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pais_nacionalidadParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pais_nacionalidadParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pais_nacionalidadParametroCarteraDefectoUpdate"));



					
		this.jLabelid_tipo_generoParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_tipo_generoParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPOGENERO+" : *");
		this.jLabelid_tipo_generoParametroCarteraDefecto.setToolTipText("Tipo Genero");
		this.jLabelid_tipo_generoParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_generoParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_generoParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_generoParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_generoParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_generoParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPOGENERO);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_tipo_generoParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_tipo_generoParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_tipo_generoParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_generoParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_generoParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_generoParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_tipo_generoParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_generoParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_tipo_generoParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_generoParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_generoParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoParametroCarteraDefecto"));

		this.jButtonid_tipo_generoParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_generoParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_generoParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_tipo_generoParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_generoParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_generoParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_generoParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_generoParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_generoParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_generoParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_generoParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_tipo_generoParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_generoParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_generoParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_generoParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_generoParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_generoParametroCarteraDefectoUpdate"));



					
		this.jLabelid_estado_civilParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_estado_civilParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDESTADOCIVIL+" : *");
		this.jLabelid_estado_civilParametroCarteraDefecto.setToolTipText("Estado Civil");
		this.jLabelid_estado_civilParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_civilParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_civilParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_civilParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_civilParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_civilParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDESTADOCIVIL);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_estado_civilParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_estado_civilParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_estado_civilParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_civilParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_civilParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_civilParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_estado_civilParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_civilParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_estado_civilParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_civilParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_civilParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilParametroCarteraDefecto"));

		this.jButtonid_estado_civilParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_estado_civilParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_civilParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_estado_civilParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_civilParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_civilParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_civilParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_estado_civilParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_estado_civilParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_civilParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_civilParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_estado_civilParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_civilParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_civilParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_civilParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_civilParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_civilParametroCarteraDefectoUpdate"));



					
		this.jLabelid_estado_legalParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_estado_legalParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDESTADOLEGAL+" : *");
		this.jLabelid_estado_legalParametroCarteraDefecto.setToolTipText("Estado Legal");
		this.jLabelid_estado_legalParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_legalParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_legalParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_legalParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_legalParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_legalParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDESTADOLEGAL);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_estado_legalParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_estado_legalParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_estado_legalParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_legalParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_legalParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_legalParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_legalParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_estado_legalParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_legalParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_legalParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_legalParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_estado_legalParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_legalParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_legalParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_legalParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_legalParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_legalParametroCarteraDefecto"));

		this.jButtonid_estado_legalParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_estado_legalParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_legalParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_legalParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_legalParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_estado_legalParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_legalParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_legalParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_legalParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_legalParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_legalParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_legalParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_estado_legalParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_estado_legalParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_legalParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_legalParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_legalParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_estado_legalParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_legalParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_legalParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_legalParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_legalParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_legalParametroCarteraDefectoUpdate"));



					
		this.jLabelid_cuenta_contableParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_cuenta_contableParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableParametroCarteraDefecto.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_cuenta_contableParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_cuenta_contableParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_cuenta_contableParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_cuenta_contableParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_cuenta_contableParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableParametroCarteraDefecto"));

		this.jButtonid_cuenta_contableParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_cuenta_contableParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_cuenta_contableParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableParametroCarteraDefectoUpdate"));


		jButtonid_cuenta_contableParametroCarteraDefectoArbol= new JButtonMe();
		jButtonid_cuenta_contableParametroCarteraDefectoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableParametroCarteraDefectoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableParametroCarteraDefectoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableParametroCarteraDefectoArbol.setText("Arbol");
		jButtonid_cuenta_contableParametroCarteraDefectoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableParametroCarteraDefectoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableParametroCarteraDefectoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableParametroCarteraDefectoArbol"));



					
		this.jLabelid_vendedorParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_vendedorParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorParametroCarteraDefecto.setToolTipText("Vendedor");
		this.jLabelid_vendedorParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_vendedorParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_vendedorParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_vendedorParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_vendedorParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_vendedorParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorParametroCarteraDefecto"));

		this.jButtonid_vendedorParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_vendedorParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_vendedorParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_vendedorParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_vendedorParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_vendedorParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorParametroCarteraDefectoUpdate"));


		jButtonid_vendedorParametroCarteraDefectoArbol= new JButtonMe();
		jButtonid_vendedorParametroCarteraDefectoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorParametroCarteraDefectoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorParametroCarteraDefectoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorParametroCarteraDefectoArbol.setText("Arbol");
		jButtonid_vendedorParametroCarteraDefectoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorParametroCarteraDefectoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorParametroCarteraDefectoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorParametroCarteraDefectoArbol"));



					
		this.jLabelid_rutaParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_rutaParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDRUTA+" : *");
		this.jLabelid_rutaParametroCarteraDefecto.setToolTipText("Ruta");
		this.jLabelid_rutaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rutaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rutaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rutaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rutaParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rutaParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDRUTA);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_rutaParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_rutaParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_rutaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rutaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rutaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rutaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rutaParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_rutaParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rutaParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rutaParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rutaParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_rutaParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rutaParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rutaParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rutaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rutaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rutaParametroCarteraDefecto"));

		this.jButtonid_rutaParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_rutaParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rutaParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rutaParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rutaParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_rutaParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rutaParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rutaParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rutaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rutaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rutaParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rutaParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_rutaParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_rutaParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rutaParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rutaParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rutaParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_rutaParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rutaParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rutaParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rutaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rutaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rutaParametroCarteraDefectoUpdate"));



					
		this.jLabelid_diaParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_diaParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDDIA+" : *");
		this.jLabelid_diaParametroCarteraDefecto.setToolTipText("Dia");
		this.jLabelid_diaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_diaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_diaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_diaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_diaParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_diaParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDDIA);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_diaParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_diaParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_diaParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_diaParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_diaParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_diaParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_diaParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_diaParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_diaParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_diaParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_diaParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_diaParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_diaParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_diaParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_diaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_diaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_diaParametroCarteraDefecto"));

		this.jButtonid_diaParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_diaParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_diaParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_diaParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_diaParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_diaParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_diaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_diaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_diaParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_diaParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_diaParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_diaParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_diaParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_diaParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_diaParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_diaParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_diaParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_diaParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_diaParametroCarteraDefectoUpdate"));



					
		this.jLabelid_tipo_precioParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_tipo_precioParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioParametroCarteraDefecto.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_tipo_precioParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_tipo_precioParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_tipo_precioParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_tipo_precioParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_tipo_precioParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioParametroCarteraDefecto"));

		this.jButtonid_tipo_precioParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_tipo_precioParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_precioParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_tipo_precioParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioParametroCarteraDefectoUpdate"));



					
		this.jLabelid_tipo_lista_precioParametroCarteraDefecto = new JLabelMe();
		this.jLabelid_tipo_lista_precioParametroCarteraDefecto.setText(""+ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPOLISTAPRECIO+" : *");
		this.jLabelid_tipo_lista_precioParametroCarteraDefecto.setToolTipText("Tipo Lista Precio");
		this.jLabelid_tipo_lista_precioParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_lista_precioParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_lista_precioParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_lista_precioParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_lista_precioParametroCarteraDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_lista_precioParametroCarteraDefecto.setToolTipText(ParametroCarteraDefectoConstantesFunciones.LABEL_IDTIPOLISTAPRECIO);
		this.gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		this.jPanelid_tipo_lista_precioParametroCarteraDefecto.setLayout(this.gridaBagLayoutParametroCarteraDefecto);


		jComboBoxid_tipo_lista_precioParametroCarteraDefecto= new JComboBoxMe();
		jComboBoxid_tipo_lista_precioParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_lista_precioParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_lista_precioParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_lista_precioParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_lista_precioParametroCarteraDefecto= new JButtonMe();
		this.jButtonid_tipo_lista_precioParametroCarteraDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_lista_precioParametroCarteraDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_lista_precioParametroCarteraDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_lista_precioParametroCarteraDefecto.setText("Buscar");
		this.jButtonid_tipo_lista_precioParametroCarteraDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_lista_precioParametroCarteraDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_lista_precioParametroCarteraDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_lista_precioParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_lista_precioParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_lista_precioParametroCarteraDefecto"));

		this.jButtonid_tipo_lista_precioParametroCarteraDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_lista_precioParametroCarteraDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_lista_precioParametroCarteraDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_lista_precioParametroCarteraDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_lista_precioParametroCarteraDefectoBusqueda.setText("U");
		this.jButtonid_tipo_lista_precioParametroCarteraDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_lista_precioParametroCarteraDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_lista_precioParametroCarteraDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_lista_precioParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_lista_precioParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_lista_precioParametroCarteraDefectoBusqueda"));

		if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_lista_precioParametroCarteraDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_lista_precioParametroCarteraDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_lista_precioParametroCarteraDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_lista_precioParametroCarteraDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_lista_precioParametroCarteraDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_lista_precioParametroCarteraDefectoUpdate.setText("U");
		this.jButtonid_tipo_lista_precioParametroCarteraDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_lista_precioParametroCarteraDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_lista_precioParametroCarteraDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_lista_precioParametroCarteraDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_lista_precioParametroCarteraDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_lista_precioParametroCarteraDefectoUpdate"));



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
		//this.jInternalFrameDetalleParametroCarteraDefecto = new ParametroCarteraDefectoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Cartera Defecto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroCarteraDefecto= new GridBagLayout();
		

		
		String sToolTipParametroCarteraDefecto="";
		sToolTipParametroCarteraDefecto=ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroCarteraDefecto+="(Cartera.ParametroCarteraDefecto)";
		}
		
		if(!this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroCarteraDefecto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroCarteraDefecto = new JButtonMe();
		this.jButtonModificarParametroCarteraDefecto = new JButtonMe();
        this.jButtonActualizarParametroCarteraDefecto = new JButtonMe();
        this.jButtonEliminarParametroCarteraDefecto = new JButtonMe();
        this.jButtonCancelarParametroCarteraDefecto = new JButtonMe();
        this.jButtonGuardarCambiosParametroCarteraDefecto = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroCarteraDefecto = new JButtonMe();
		this.jButtonCerrarParametroCarteraDefecto = new JButtonMe();
		
		this.jScrollPanelDatosParametroCarteraDefecto = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroCarteraDefecto = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroCarteraDefecto = new JScrollPane();
				
		
		
		this.jPanelCamposParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposInicioubicacionParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioproveedorParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocontableParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Cartera Defecto";
		
		if(!this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Cartera Defectos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroCarteraDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroCarteraDefecto.setName("jPanelCamposParametroCarteraDefecto"); 

		this.jPanelCamposOcultosParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroCarteraDefecto.setName("jPanelCamposOcultosParametroCarteraDefecto"); 

        this.jPanelAccionesParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroCarteraDefecto.setToolTipText("Acciones");
        this.jPanelAccionesParametroCarteraDefecto.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroCarteraDefecto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroCarteraDefecto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposInicioubicacionParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Ubicacion"));
		this.jPanelCamposInicioubicacionParametroCarteraDefecto.setName("jPanelCamposFinubicacionParametroCarteraDefecto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioubicacionParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioproveedorParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedor"));
		this.jPanelCamposInicioproveedorParametroCarteraDefecto.setName("jPanelCamposFinproveedorParametroCarteraDefecto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioproveedorParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocontableParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Contable"));
		this.jPanelCamposIniciocontableParametroCarteraDefecto.setName("jPanelCamposFincontableParametroCarteraDefecto");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocontableParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroCarteraDefecto.setText("Nuevo");
		this.jButtonModificarParametroCarteraDefecto.setText("Editar");
        this.jButtonActualizarParametroCarteraDefecto.setText("Actualizar");
        this.jButtonEliminarParametroCarteraDefecto.setText("Eliminar");
        this.jButtonCancelarParametroCarteraDefecto.setText("Cancelar");
        this.jButtonGuardarCambiosParametroCarteraDefecto.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroCarteraDefecto.setText("Guardar");
		this.jButtonCerrarParametroCarteraDefecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroCarteraDefecto,"nuevo_button","Nuevo",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroCarteraDefecto,"modificar_button","Editar",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroCarteraDefecto,"actualizar_button","Actualizar",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroCarteraDefecto,"eliminar_button","Eliminar",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroCarteraDefecto,"cancelar_button","Cancelar",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroCarteraDefecto,"guardarcambios_button","Guardar",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroCarteraDefecto,"guardarcambiostabla_button","Guardar",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroCarteraDefecto,"cerrar_button","Salir",this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroCarteraDefecto.setToolTipText("Nuevo"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroCarteraDefecto.setToolTipText("Editar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroCarteraDefecto.setToolTipText("Actualizar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroCarteraDefecto.setToolTipText("Eliminar)"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroCarteraDefecto.setToolTipText("Cancelar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroCarteraDefecto.setToolTipText("Guardar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroCarteraDefecto.setToolTipText("Guardar"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroCarteraDefecto.setToolTipText("Salir"+" "+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroCarteraDefecto";
		inputMap = this.jButtonNuevoParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroCarteraDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroCarteraDefecto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroCarteraDefecto";
		inputMap = this.jButtonActualizarParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroCarteraDefecto"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroCarteraDefecto";
		inputMap = this.jButtonEliminarParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroCarteraDefecto"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroCarteraDefecto";
		inputMap = this.jButtonCancelarParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroCarteraDefecto"));
		
		//CERRAR		
		sMapKey = "CerrarParametroCarteraDefecto";
		inputMap = this.jButtonCerrarParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroCarteraDefecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroCarteraDefecto";
		inputMap = this.jButtonGuardarCambiosTablaParametroCarteraDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroCarteraDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroCarteraDefecto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroCarteraDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroCarteraDefecto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroCarteraDefecto.setToolTipText("Nuevo ParametroCarteraDefecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroCarteraDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroCarteraDefecto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroCarteraDefecto.setToolTipText("Sin Cerrar Ventana ParametroCarteraDefecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroCarteraDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroCarteraDefecto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroCarteraDefecto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroCarteraDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroCarteraDefecto.setText("Accion");
		this.jComboBoxTiposAccionesParametroCarteraDefecto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroCarteraDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroCarteraDefecto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroCarteraDefecto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroCarteraDefecto = new JLabelMe();
		
		this.jLabelAccionesParametroCarteraDefecto.setText("Acciones");		
		this.jLabelAccionesParametroCarteraDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroCarteraDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroCarteraDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroCarteraDefecto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroCarteraDefecto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroCarteraDefecto=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroCarteraDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroCarteraDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroCarteraDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroCarteraDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroCarteraDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroCarteraDefecto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroCarteraDefecto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroCarteraDefecto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroCarteraDefecto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroCarteraDefecto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroCarteraDefecto = new GridBagLayout();
		
		this.jPanelCamposParametroCarteraDefecto.setLayout(gridaBagLayoutCamposParametroCarteraDefecto);
		this.jPanelCamposOcultosParametroCarteraDefecto.setLayout(gridaBagLayoutCamposOcultosParametroCarteraDefecto);
		
		

		GridBagLayout gridaBagLayoutCamposInicioubicacionParametroCarteraDefecto= new GridBagLayout();
		this.jPanelCamposInicioubicacionParametroCarteraDefecto.setLayout(gridaBagLayoutCamposInicioubicacionParametroCarteraDefecto);

		GridBagLayout gridaBagLayoutCamposInicioproveedorParametroCarteraDefecto= new GridBagLayout();
		this.jPanelCamposInicioproveedorParametroCarteraDefecto.setLayout(gridaBagLayoutCamposInicioproveedorParametroCarteraDefecto);

		GridBagLayout gridaBagLayoutCamposIniciocontableParametroCarteraDefecto= new GridBagLayout();
		this.jPanelCamposIniciocontableParametroCarteraDefecto.setLayout(gridaBagLayoutCamposIniciocontableParametroCarteraDefecto);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroCarteraDefecto.add(jLabelIdParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroCarteraDefecto.add(jLabelidParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroCarteraDefecto.add(jLabelid_empresaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroCarteraDefecto.add(jButtonid_empresaParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroCarteraDefecto.add(jButtonid_empresaParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroCarteraDefecto.add(jComboBoxid_empresaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroCarteraDefecto.add(jLabelid_sucursalParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroCarteraDefecto.add(jButtonid_sucursalParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroCarteraDefecto.add(jButtonid_sucursalParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroCarteraDefecto.add(jComboBoxid_sucursalParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisParametroCarteraDefecto.add(jLabelid_paisParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisParametroCarteraDefecto.add(jButtonid_paisParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisParametroCarteraDefecto.add(jButtonid_paisParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisParametroCarteraDefecto.add(jComboBoxid_paisParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_regionParametroCarteraDefecto.add(jLabelid_regionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_regionParametroCarteraDefecto.add(jButtonid_regionParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_regionParametroCarteraDefecto.add(jButtonid_regionParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_regionParametroCarteraDefecto.add(jComboBoxid_regionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_provinciaParametroCarteraDefecto.add(jLabelid_provinciaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaParametroCarteraDefecto.add(jButtonid_provinciaParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaParametroCarteraDefecto.add(jButtonid_provinciaParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_provinciaParametroCarteraDefecto.add(jComboBoxid_provinciaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ciudadParametroCarteraDefecto.add(jLabelid_ciudadParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadParametroCarteraDefecto.add(jButtonid_ciudadParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ciudadParametroCarteraDefecto.add(jButtonid_ciudadParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ciudadParametroCarteraDefecto.add(jComboBoxid_ciudadParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_zonaParametroCarteraDefecto.add(jLabelid_zonaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaParametroCarteraDefecto.add(jButtonid_zonaParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_zonaParametroCarteraDefecto.add(jButtonid_zonaParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_zonaParametroCarteraDefecto.add(jComboBoxid_zonaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_identificacionParametroCarteraDefecto.add(jLabelid_tipo_identificacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_identificacionParametroCarteraDefecto.add(jButtonid_tipo_identificacionParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_identificacionParametroCarteraDefecto.add(jButtonid_tipo_identificacionParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_identificacionParametroCarteraDefecto.add(jComboBoxid_tipo_identificacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_nivel_eduParametroCarteraDefecto.add(jLabelid_tipo_nivel_eduParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_nivel_eduParametroCarteraDefecto.add(jButtonid_tipo_nivel_eduParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_nivel_eduParametroCarteraDefecto.add(jButtonid_tipo_nivel_eduParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_nivel_eduParametroCarteraDefecto.add(jComboBoxid_tipo_nivel_eduParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pais_nacionalidadParametroCarteraDefecto.add(jLabelid_pais_nacionalidadParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pais_nacionalidadParametroCarteraDefecto.add(jButtonid_pais_nacionalidadParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pais_nacionalidadParametroCarteraDefecto.add(jButtonid_pais_nacionalidadParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pais_nacionalidadParametroCarteraDefecto.add(jComboBoxid_pais_nacionalidadParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_generoParametroCarteraDefecto.add(jLabelid_tipo_generoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_generoParametroCarteraDefecto.add(jButtonid_tipo_generoParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_generoParametroCarteraDefecto.add(jButtonid_tipo_generoParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_generoParametroCarteraDefecto.add(jComboBoxid_tipo_generoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_civilParametroCarteraDefecto.add(jLabelid_estado_civilParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_civilParametroCarteraDefecto.add(jButtonid_estado_civilParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_civilParametroCarteraDefecto.add(jButtonid_estado_civilParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_civilParametroCarteraDefecto.add(jComboBoxid_estado_civilParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_legalParametroCarteraDefecto.add(jLabelid_estado_legalParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_legalParametroCarteraDefecto.add(jButtonid_estado_legalParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_legalParametroCarteraDefecto.add(jButtonid_estado_legalParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_legalParametroCarteraDefecto.add(jComboBoxid_estado_legalParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableParametroCarteraDefecto.add(jLabelid_cuenta_contableParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableParametroCarteraDefecto.add(jButtonid_cuenta_contableParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableParametroCarteraDefecto.add(jButtonid_cuenta_contableParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableParametroCarteraDefecto.add(jComboBoxid_cuenta_contableParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorParametroCarteraDefecto.add(jLabelid_vendedorParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorParametroCarteraDefecto.add(jButtonid_vendedorParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorParametroCarteraDefecto.add(jButtonid_vendedorParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorParametroCarteraDefecto.add(jComboBoxid_vendedorParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rutaParametroCarteraDefecto.add(jLabelid_rutaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rutaParametroCarteraDefecto.add(jButtonid_rutaParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rutaParametroCarteraDefecto.add(jButtonid_rutaParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rutaParametroCarteraDefecto.add(jComboBoxid_rutaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_diaParametroCarteraDefecto.add(jLabelid_diaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_diaParametroCarteraDefecto.add(jButtonid_diaParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_diaParametroCarteraDefecto.add(jButtonid_diaParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_diaParametroCarteraDefecto.add(jComboBoxid_diaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioParametroCarteraDefecto.add(jLabelid_tipo_precioParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioParametroCarteraDefecto.add(jButtonid_tipo_precioParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioParametroCarteraDefecto.add(jButtonid_tipo_precioParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioParametroCarteraDefecto.add(jComboBoxid_tipo_precioParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_lista_precioParametroCarteraDefecto.add(jLabelid_tipo_lista_precioParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 2;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_lista_precioParametroCarteraDefecto.add(jButtonid_tipo_lista_precioParametroCarteraDefectoBusqueda, this.gridBagConstraintsParametroCarteraDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 3;
		this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
		this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_lista_precioParametroCarteraDefecto.add(jButtonid_tipo_lista_precioParametroCarteraDefectoUpdate, this.gridBagConstraintsParametroCarteraDefecto);
	}

	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = 1;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_lista_precioParametroCarteraDefecto.add(jComboBoxid_tipo_lista_precioParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposOcultosParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposOcultosParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroCarteraDefecto.add(this.jPanelid_empresaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposOcultosParametroCarteraDefecto % 2==0) {
		iXPanelCamposOcultosParametroCarteraDefecto=0;
		iYPanelCamposOcultosParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposOcultosParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposOcultosParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroCarteraDefecto.add(this.jPanelid_sucursalParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposOcultosParametroCarteraDefecto % 2==0) {
		iXPanelCamposOcultosParametroCarteraDefecto=0;
		iYPanelCamposOcultosParametroCarteraDefecto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposInicioubicacionParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposInicioubicacionParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionParametroCarteraDefecto.add(this.jPanelidParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposInicioubicacionParametroCarteraDefecto % 2==0) {
		iXPanelCamposInicioubicacionParametroCarteraDefecto=0;
		iYPanelCamposInicioubicacionParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposInicioubicacionParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposInicioubicacionParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionParametroCarteraDefecto.add(this.jPanelid_paisParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposInicioubicacionParametroCarteraDefecto % 2==0) {
		iXPanelCamposInicioubicacionParametroCarteraDefecto=0;
		iYPanelCamposInicioubicacionParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposInicioubicacionParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposInicioubicacionParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionParametroCarteraDefecto.add(this.jPanelid_regionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposInicioubicacionParametroCarteraDefecto % 2==0) {
		iXPanelCamposInicioubicacionParametroCarteraDefecto=0;
		iYPanelCamposInicioubicacionParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposInicioubicacionParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposInicioubicacionParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionParametroCarteraDefecto.add(this.jPanelid_provinciaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposInicioubicacionParametroCarteraDefecto % 2==0) {
		iXPanelCamposInicioubicacionParametroCarteraDefecto=0;
		iYPanelCamposInicioubicacionParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposInicioubicacionParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposInicioubicacionParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionParametroCarteraDefecto.add(this.jPanelid_ciudadParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposInicioubicacionParametroCarteraDefecto % 2==0) {
		iXPanelCamposInicioubicacionParametroCarteraDefecto=0;
		iYPanelCamposInicioubicacionParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposInicioubicacionParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposInicioubicacionParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioubicacionParametroCarteraDefecto.add(this.jPanelid_zonaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposInicioubicacionParametroCarteraDefecto % 2==0) {
		iXPanelCamposInicioubicacionParametroCarteraDefecto=0;
		iYPanelCamposInicioubicacionParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposInicioproveedorParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposInicioproveedorParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioproveedorParametroCarteraDefecto.add(this.jPanelid_tipo_identificacionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposInicioproveedorParametroCarteraDefecto % 2==0) {
		iXPanelCamposInicioproveedorParametroCarteraDefecto=0;
		iYPanelCamposInicioproveedorParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposInicioproveedorParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposInicioproveedorParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioproveedorParametroCarteraDefecto.add(this.jPanelid_tipo_nivel_eduParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposInicioproveedorParametroCarteraDefecto % 2==0) {
		iXPanelCamposInicioproveedorParametroCarteraDefecto=0;
		iYPanelCamposInicioproveedorParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposInicioproveedorParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposInicioproveedorParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioproveedorParametroCarteraDefecto.add(this.jPanelid_pais_nacionalidadParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposInicioproveedorParametroCarteraDefecto % 2==0) {
		iXPanelCamposInicioproveedorParametroCarteraDefecto=0;
		iYPanelCamposInicioproveedorParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposInicioproveedorParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposInicioproveedorParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioproveedorParametroCarteraDefecto.add(this.jPanelid_tipo_generoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposInicioproveedorParametroCarteraDefecto % 2==0) {
		iXPanelCamposInicioproveedorParametroCarteraDefecto=0;
		iYPanelCamposInicioproveedorParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposInicioproveedorParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposInicioproveedorParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioproveedorParametroCarteraDefecto.add(this.jPanelid_estado_civilParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposInicioproveedorParametroCarteraDefecto % 2==0) {
		iXPanelCamposInicioproveedorParametroCarteraDefecto=0;
		iYPanelCamposInicioproveedorParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposInicioproveedorParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposInicioproveedorParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioproveedorParametroCarteraDefecto.add(this.jPanelid_estado_legalParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposInicioproveedorParametroCarteraDefecto % 2==0) {
		iXPanelCamposInicioproveedorParametroCarteraDefecto=0;
		iYPanelCamposInicioproveedorParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposIniciocontableParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposIniciocontableParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableParametroCarteraDefecto.add(this.jPanelid_cuenta_contableParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposIniciocontableParametroCarteraDefecto % 2==0) {
		iXPanelCamposIniciocontableParametroCarteraDefecto=0;
		iYPanelCamposIniciocontableParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposIniciocontableParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposIniciocontableParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableParametroCarteraDefecto.add(this.jPanelid_vendedorParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposIniciocontableParametroCarteraDefecto % 2==0) {
		iXPanelCamposIniciocontableParametroCarteraDefecto=0;
		iYPanelCamposIniciocontableParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposIniciocontableParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposIniciocontableParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableParametroCarteraDefecto.add(this.jPanelid_rutaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposIniciocontableParametroCarteraDefecto % 2==0) {
		iXPanelCamposIniciocontableParametroCarteraDefecto=0;
		iYPanelCamposIniciocontableParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposIniciocontableParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposIniciocontableParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableParametroCarteraDefecto.add(this.jPanelid_diaParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposIniciocontableParametroCarteraDefecto % 2==0) {
		iXPanelCamposIniciocontableParametroCarteraDefecto=0;
		iYPanelCamposIniciocontableParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposIniciocontableParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposIniciocontableParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableParametroCarteraDefecto.add(this.jPanelid_tipo_precioParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposIniciocontableParametroCarteraDefecto % 2==0) {
		iXPanelCamposIniciocontableParametroCarteraDefecto=0;
		iYPanelCamposIniciocontableParametroCarteraDefecto++;
	}
	this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroCarteraDefecto.gridy = iYPanelCamposIniciocontableParametroCarteraDefecto;
	this.gridBagConstraintsParametroCarteraDefecto.gridx = iXPanelCamposIniciocontableParametroCarteraDefecto++;
	this.gridBagConstraintsParametroCarteraDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroCarteraDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciocontableParametroCarteraDefecto.add(this.jPanelid_tipo_lista_precioParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);



	if(iXPanelCamposIniciocontableParametroCarteraDefecto % 2==0) {
		iXPanelCamposIniciocontableParametroCarteraDefecto=0;
		iYPanelCamposIniciocontableParametroCarteraDefecto++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroCarteraDefecto= new GridBagLayout();
		this.jPanelAccionesParametroCarteraDefecto.setLayout(gridaBagLayoutAccionesParametroCarteraDefecto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroCarteraDefecto= new GridBagLayout();
		this.jPanelAccionesFormularioParametroCarteraDefecto.setLayout(gridaBagLayoutAccionesFormularioParametroCarteraDefecto);
		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroCarteraDefecto.add(this.jComboBoxTiposAccionesFormularioParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroCarteraDefecto.add(this.jCheckBoxPostAccionNuevoParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrocarteradefectoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroCarteraDefecto.add(this.jCheckBoxPostAccionSinCerrarParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrocarteradefectoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroCarteraDefecto.add(this.jCheckBoxPostAccionSinMensajeParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroCarteraDefecto.add(this.jButtonModificarParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);							

		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;
		this.gridBagConstraintsParametroCarteraDefecto.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroCarteraDefecto.add(this.jButtonEliminarParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		
			
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroCarteraDefecto.add(this.jButtonActualizarParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);


		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroCarteraDefecto.add(this.jButtonGuardarCambiosParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);	
		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = 0;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroCarteraDefecto.add(this.jButtonCancelarParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroCarteraDefecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroCarteraDefecto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();						
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;		
			//this.gridBagConstraintsParametroCarteraDefecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroCarteraDefecto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroCarteraDefecto.gridx =0;
		this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroCarteraDefecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroCarteraDefectoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroCarteraDefecto = new ParametroCarteraDefectoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Cartera Defecto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Cartera Defecto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Cartera Defecto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroCarteraDefectoModel parametrocarteradefectoModel=new ParametroCarteraDefectoModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroCarteraDefectoModel.ParametroCarteraDefectoFocusTraversalPolicy parametrocarteradefectoFocusTraversalPolicy = parametrocarteradefectoModel.new ParametroCarteraDefectoFocusTraversalPolicy(this);
			
			//parametrocarteradefectoFocusTraversalPolicy.setparametrocarteradefectoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrocarteradefectoModel);
			
			
			this.jContentPaneDetalleParametroCarteraDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroCarteraDefecto = new GridBagLayout();	
			this.jContentPaneDetalleParametroCarteraDefecto.setLayout(gridaBagLayoutDetalleParametroCarteraDefecto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroCarteraDefecto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
					
				
				this.jContentPaneDetalleParametroCarteraDefecto.add(jTtoolBarDetalleParametroCarteraDefecto, gridBagConstraintsParametroCarteraDefecto);								
				
}
			
			this.jScrollPanelDatosEdicionParametroCarteraDefecto=   new JScrollPane(jContentPaneDetalleParametroCarteraDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroCarteraDefecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyRelaciones++;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;

		this.jContentPaneDetalleParametroCarteraDefecto.add(jPanelCamposInicioubicacionParametroCarteraDefecto, gridBagConstraintsParametroCarteraDefecto);


		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyRelaciones++;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;

		this.jContentPaneDetalleParametroCarteraDefecto.add(jPanelCamposInicioproveedorParametroCarteraDefecto, gridBagConstraintsParametroCarteraDefecto);


		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyRelaciones++;
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;

		this.jContentPaneDetalleParametroCarteraDefecto.add(jPanelCamposIniciocontableParametroCarteraDefecto, gridBagConstraintsParametroCarteraDefecto);
			
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
						&& parametrocarteradefectoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrocarteradefectoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroCarteraDefecto= new GridBagConstraints();
						this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
						this.jContentPaneDetalleParametroCarteraDefecto.add(this.jTabbedPaneRelacionesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroCarteraDefecto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroCarteraDefecto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
					this.gridBagConstraintsParametroCarteraDefecto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
					
				
					this.jContentPaneDetalleParametroCarteraDefecto.add(jPanelCamposOcultosParametroCarteraDefecto, gridBagConstraintsParametroCarteraDefecto);
				
					this.jPanelCamposOcultosParametroCarteraDefecto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	        this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroCarteraDefecto.add(this.jPanelAccionesFormularioParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);							
			
			
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
	        this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroCarteraDefecto.add(this.jPanelAccionesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroCarteraDefecto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroCarteraDefecto=   new JScrollPane(this.jPanelCamposParametroCarteraDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroCarteraDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroCarteraDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroCarteraDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
			this.gridBagConstraintsParametroCarteraDefecto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroCarteraDefecto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroCarteraDefecto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);			
			
			this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroCarteraDefecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
			
			
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		
			
		this.gridBagConstraintsParametroCarteraDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroCarteraDefecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroCarteraDefecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroCarteraDefecto, this.gridBagConstraintsParametroCarteraDefecto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroCarteraDefecto;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroCarteraDefecto;
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
