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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.ParametroGeneralUsuarioConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class ParametroGeneralUsuarioDetalleFormJInternalFrame extends ParametroGeneralUsuarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroGeneralUsuario;
	
	protected JMenuBar jmenuBarDetalleParametroGeneralUsuario;
	
	protected JMenu jmenuDetalleParametroGeneralUsuario;
	protected JMenu jmenuDetalleArchivoParametroGeneralUsuario;
	protected JMenu jmenuDetalleAccionesParametroGeneralUsuario;
	protected JMenu jmenuDetalleDatosParametroGeneralUsuario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroGeneralUsuario;	
	protected GridBagConstraints gridBagConstraintsParametroGeneralUsuario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroGeneralUsuarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroGeneralUsuario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected TipoVisualBeanSwingJInternalFrame tipovisualBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovisual="";

	protected TipoFondoBeanSwingJInternalFrame tipofondoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofondo="";

	protected TipoFondoBeanSwingJInternalFrame tipofondobordeBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofondoborde="";

	protected TipoFondoControlBeanSwingJInternalFrame tipofondocontrolBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofondocontrol="";

	protected TipoFuenteBeanSwingJInternalFrame tipofuenteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofuente="";

	protected TipoTamanioControlBeanSwingJInternalFrame tipotamaniocontrolnormalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotamaniocontrolnormal="";

	protected TipoTamanioControlBeanSwingJInternalFrame tipotamaniocontrolrelacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotamaniocontrolrelacion="";

	protected TipoExportarBeanSwingJInternalFrame tipoexportarBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoexportar="";

	protected TipoDelimiterBeanSwingJInternalFrame tipodelimiterBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodelimiter="";
	
	public ParametroGeneralUsuarioSessionBean parametrogeneralusuarioSessionBean;
	
	
	
	
	public UsuarioSessionBean usuarioSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public TipoVisualSessionBean tipovisualSessionBean;
	public TipoFondoSessionBean tipofondoSessionBean;
	public TipoFondoSessionBean tipofondobordeSessionBean;
	public TipoFondoControlSessionBean tipofondocontrolSessionBean;
	public TipoFuenteSessionBean tipofuenteSessionBean;
	public TipoTamanioControlSessionBean tipotamaniocontrolnormalSessionBean;
	public TipoTamanioControlSessionBean tipotamaniocontrolrelacionSessionBean;
	public TipoExportarSessionBean tipoexportarSessionBean;
	public TipoDelimiterSessionBean tipodelimiterSessionBean;	
	
	public ParametroGeneralUsuarioLogic parametrogeneralusuarioLogic;
	
	public JScrollPane jScrollPanelDatosParametroGeneralUsuario;
	public JScrollPane jScrollPanelDatosEdicionParametroGeneralUsuario;
	public JScrollPane jScrollPanelDatosGeneralParametroGeneralUsuario;
	
	protected JPanel jPanelCamposParametroGeneralUsuario;    
	protected JPanel jPanelCamposOcultosParametroGeneralUsuario;    	
	protected JPanel jPanelAccionesParametroGeneralUsuario;
	protected JPanel jPanelAccionesFormularioParametroGeneralUsuario;
    
	
	
	protected Integer iXPanelCamposParametroGeneralUsuario=0;
	protected Integer iYPanelCamposParametroGeneralUsuario=0;
	
	protected Integer iXPanelCamposOcultosParametroGeneralUsuario=0;
	protected Integer iYPanelCamposOcultosParametroGeneralUsuario=0;
	
	

	protected JPanel jPanelCamposInicioprincipalParametroGeneralUsuario;
	protected Integer iXPanelCamposInicioprincipalParametroGeneralUsuario=0;
	protected Integer iYPanelCamposInicioprincipalParametroGeneralUsuario=0;

	protected JPanel jPanelCamposIniciovisualParametroGeneralUsuario;
	protected Integer iXPanelCamposIniciovisualParametroGeneralUsuario=0;
	protected Integer iYPanelCamposIniciovisualParametroGeneralUsuario=0;

	protected JPanel jPanelCamposIniciofuncionalParametroGeneralUsuario;
	protected Integer iXPanelCamposIniciofuncionalParametroGeneralUsuario=0;
	protected Integer iYPanelCamposIniciofuncionalParametroGeneralUsuario=0;

	protected JPanel jPanelCamposInicioexportarParametroGeneralUsuario;
	protected Integer iXPanelCamposInicioexportarParametroGeneralUsuario=0;
	protected Integer iYPanelCamposInicioexportarParametroGeneralUsuario=0;

	protected JPanel jPanelCamposIniciorecargarParametroGeneralUsuario;
	protected Integer iXPanelCamposIniciorecargarParametroGeneralUsuario=0;
	protected Integer iYPanelCamposIniciorecargarParametroGeneralUsuario=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroGeneralUsuario;
	public JButton jButtonModificarParametroGeneralUsuario;
	public JButton jButtonActualizarParametroGeneralUsuario;
    public JButton jButtonEliminarParametroGeneralUsuario;
	public JButton jButtonCancelarParametroGeneralUsuario;
    public JButton jButtonGuardarCambiosParametroGeneralUsuario;
	public JButton jButtonGuardarCambiosTablaParametroGeneralUsuario;
	protected JButton jButtonCerrarParametroGeneralUsuario;
	
	
	protected JButton jButtonProcesarInformacionParametroGeneralUsuario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroGeneralUsuario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroGeneralUsuario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroGeneralUsuario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroGeneralUsuario;
	protected JButton jButtonModificarToolBarParametroGeneralUsuario;
	protected JButton jButtonActualizarToolBarParametroGeneralUsuario;
    protected JButton jButtonEliminarToolBarParametroGeneralUsuario;
	protected JButton jButtonCancelarToolBarParametroGeneralUsuario;
    protected JButton jButtonGuardarCambiosToolBarParametroGeneralUsuario;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroGeneralUsuario;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroGeneralUsuario;
	protected JButton jButtonCerrarToolBarParametroGeneralUsuario;
	
	protected JButton jButtonProcesarInformacionToolBarParametroGeneralUsuario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroGeneralUsuario;
	protected JMenuItem jMenuItemModificarParametroGeneralUsuario;
	protected JMenuItem jMenuItemActualizarParametroGeneralUsuario;
    protected JMenuItem jMenuItemEliminarParametroGeneralUsuario;
	protected JMenuItem jMenuItemCancelarParametroGeneralUsuario;
    protected JMenuItem jMenuItemGuardarCambiosParametroGeneralUsuario;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroGeneralUsuario;
	protected JMenuItem jMenuItemCerrarParametroGeneralUsuario;
	protected JMenuItem jMenuItemDetalleCerrarParametroGeneralUsuario;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroGeneralUsuario;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroGeneralUsuario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroGeneralUsuario;
	protected JMenuItem jMenuItemMostrarOcultarParametroGeneralUsuario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroGeneralUsuario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroGeneralUsuario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroGeneralUsuario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelfecha_sistemaParametroGeneralUsuario;
	public JLabel jLabelfecha_sistemaParametroGeneralUsuario;
	//public JFormattedTextField jDateChooserfecha_sistemaParametroGeneralUsuario;

	public JDateChooser jDateChooserfecha_sistemaParametroGeneralUsuario;
	public JButton jButtonfecha_sistemaParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPaneldiaParametroGeneralUsuario;
	public JLabel jLabeldiaParametroGeneralUsuario;
	public JTextField jTextFielddiaParametroGeneralUsuario;
	public JButton jButtondiaParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcon_tamanio_control_manualParametroGeneralUsuario;
	public JLabel jLabelcon_tamanio_control_manualParametroGeneralUsuario;
	public JCheckBox jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario;
	public JButton jButtoncon_tamanio_control_manualParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcon_tamanio_control_todo_relacionParametroGeneralUsuario;
	public JLabel jLabelcon_tamanio_control_todo_relacionParametroGeneralUsuario;
	public JCheckBox jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario;
	public JButton jButtoncon_tamanio_control_todo_relacionParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcon_guardar_relacionesParametroGeneralUsuario;
	public JLabel jLabelcon_guardar_relacionesParametroGeneralUsuario;
	public JCheckBox jCheckBoxcon_guardar_relacionesParametroGeneralUsuario;
	public JButton jButtoncon_guardar_relacionesParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcon_mensaje_confirmacionParametroGeneralUsuario;
	public JLabel jLabelcon_mensaje_confirmacionParametroGeneralUsuario;
	public JCheckBox jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario;
	public JButton jButtoncon_mensaje_confirmacionParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcon_botones_tool_barParametroGeneralUsuario;
	public JLabel jLabelcon_botones_tool_barParametroGeneralUsuario;
	public JCheckBox jCheckBoxcon_botones_tool_barParametroGeneralUsuario;
	public JButton jButtoncon_botones_tool_barParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcon_mostrar_acciones_campo_generalParametroGeneralUsuario;
	public JLabel jLabelcon_mostrar_acciones_campo_generalParametroGeneralUsuario;
	public JCheckBox jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario;
	public JButton jButtoncon_mostrar_acciones_campo_generalParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario;
	public JLabel jLabelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario;
	public JCheckBox jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario;
	public JButton jButtoncon_mostrar_acciones_campo_relacionesParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcon_exportar_cabeceraParametroGeneralUsuario;
	public JLabel jLabelcon_exportar_cabeceraParametroGeneralUsuario;
	public JCheckBox jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario;
	public JButton jButtoncon_exportar_cabeceraParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcon_exportar_campo_versionParametroGeneralUsuario;
	public JLabel jLabelcon_exportar_campo_versionParametroGeneralUsuario;
	public JCheckBox jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario;
	public JButton jButtoncon_exportar_campo_versionParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelpath_exportarParametroGeneralUsuario;
	public JLabel jLabelpath_exportarParametroGeneralUsuario;
	public JTextArea jTextAreapath_exportarParametroGeneralUsuario;
	public JScrollPane jscrollPanepath_exportarParametroGeneralUsuario;
	public JButton jButtonpath_exportarParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcon_precargar_ventanasParametroGeneralUsuario;
	public JLabel jLabelcon_precargar_ventanasParametroGeneralUsuario;
	public JCheckBox jCheckBoxcon_precargar_ventanasParametroGeneralUsuario;
	public JButton jButtoncon_precargar_ventanasParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcon_precargar_por_usuarioParametroGeneralUsuario;
	public JLabel jLabelcon_precargar_por_usuarioParametroGeneralUsuario;
	public JCheckBox jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario;
	public JButton jButtoncon_precargar_por_usuarioParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelcon_cargar_por_parteParametroGeneralUsuario;
	public JLabel jLabelcon_cargar_por_parteParametroGeneralUsuario;
	public JCheckBox jCheckBoxcon_cargar_por_parteParametroGeneralUsuario;
	public JButton jButtoncon_cargar_por_parteParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_usuarioParametroGeneralUsuario;
	public JLabel jLabelid_usuarioParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioParametroGeneralUsuario;
	public JButton jButtonid_usuarioParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_usuarioParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaParametroGeneralUsuario;
	public JLabel jLabelid_empresaParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroGeneralUsuario;
	public JButton jButtonid_empresaParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_empresaParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroGeneralUsuario;
	public JLabel jLabelid_sucursalParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroGeneralUsuario;
	public JButton jButtonid_sucursalParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_sucursalParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioParametroGeneralUsuario;
	public JLabel jLabelid_ejercicioParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioParametroGeneralUsuario;
	public JButton jButtonid_ejercicioParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_ejercicioParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoParametroGeneralUsuario;
	public JLabel jLabelid_periodoParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoParametroGeneralUsuario;
	public JButton jButtonid_periodoParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_periodoParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_periodoParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaParametroGeneralUsuario;
	public JLabel jLabelid_monedaParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaParametroGeneralUsuario;
	public JButton jButtonid_monedaParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_monedaParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_monedaParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_anioParametroGeneralUsuario;
	public JLabel jLabelid_anioParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioParametroGeneralUsuario;
	public JButton jButtonid_anioParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_anioParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_anioParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_mesParametroGeneralUsuario;
	public JLabel jLabelid_mesParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesParametroGeneralUsuario;
	public JButton jButtonid_mesParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_mesParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_mesParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_visualParametroGeneralUsuario;
	public JLabel jLabelid_tipo_visualParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_visualParametroGeneralUsuario;
	public JButton jButtonid_tipo_visualParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_visualParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_visualParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_fondoParametroGeneralUsuario;
	public JLabel jLabelid_tipo_fondoParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fondoParametroGeneralUsuario;
	public JButton jButtonid_tipo_fondoParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_fondoParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fondoParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_fondo_bordeParametroGeneralUsuario;
	public JLabel jLabelid_tipo_fondo_bordeParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario;
	public JButton jButtonid_tipo_fondo_bordeParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_fondo_bordeParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fondo_bordeParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_fondo_controlParametroGeneralUsuario;
	public JLabel jLabelid_tipo_fondo_controlParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fondo_controlParametroGeneralUsuario;
	public JButton jButtonid_tipo_fondo_controlParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_fondo_controlParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fondo_controlParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_fuenteParametroGeneralUsuario;
	public JLabel jLabelid_tipo_fuenteParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_fuenteParametroGeneralUsuario;
	public JButton jButtonid_tipo_fuenteParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_fuenteParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_fuenteParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_tamanio_control_normalParametroGeneralUsuario;
	public JLabel jLabelid_tipo_tamanio_control_normalParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario;
	public JButton jButtonid_tipo_tamanio_control_normalParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_tamanio_control_relacionParametroGeneralUsuario;
	public JLabel jLabelid_tipo_tamanio_control_relacionParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario;
	public JButton jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_exportarParametroGeneralUsuario;
	public JLabel jLabelid_tipo_exportarParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_exportarParametroGeneralUsuario;
	public JButton jButtonid_tipo_exportarParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_exportarParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_exportarParametroGeneralUsuarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_delimiterParametroGeneralUsuario;
	public JLabel jLabelid_tipo_delimiterParametroGeneralUsuario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_delimiterParametroGeneralUsuario;
	public JButton jButtonid_tipo_delimiterParametroGeneralUsuario= new JButtonMe();
	public JButton jButtonid_tipo_delimiterParametroGeneralUsuarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_delimiterParametroGeneralUsuarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroGeneralUsuario;
	
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
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroGeneralUsuarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroGeneralUsuario=new JPanel();
				this.jPanelAccionesFormularioParametroGeneralUsuario=new JPanel();
				this.jmenuBarDetalleParametroGeneralUsuario=new JMenuBar();
				this.jTtoolBarDetalleParametroGeneralUsuario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralUsuarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroGeneralUsuarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralUsuarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralUsuarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralUsuarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroGeneralUsuario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroGeneralUsuario() {
		return this.jButtonActualizarToolBarParametroGeneralUsuario;
	}
	
	public JButton getjButtonEliminarToolBarParametroGeneralUsuario() {
		return this.jButtonEliminarToolBarParametroGeneralUsuario;
	}
	
	public JButton getjButtonCancelarToolBarParametroGeneralUsuario() {
		return this.jButtonCancelarToolBarParametroGeneralUsuario;
	}		
	
	public JButton getjButtonProcesarInformacionParametroGeneralUsuario() {
		return this.jButtonProcesarInformacionParametroGeneralUsuario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroGeneralUsuario)	{
		this.jButtonProcesarInformacionParametroGeneralUsuario = jButtonProcesarInformacionParametroGeneralUsuario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroGeneralUsuario() {
		return this.jComboBoxTiposAccionesParametroGeneralUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroGeneralUsuario(
			JComboBox jComboBoxTiposRelacionesParametroGeneralUsuario) {
		this.jComboBoxTiposRelacionesParametroGeneralUsuario = jComboBoxTiposRelacionesParametroGeneralUsuario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroGeneralUsuario(
			JComboBox jComboBoxTiposAccionesParametroGeneralUsuario) {
		this.jComboBoxTiposAccionesParametroGeneralUsuario = jComboBoxTiposAccionesParametroGeneralUsuario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroGeneralUsuario() {
		return this.jComboBoxTiposAccionesFormularioParametroGeneralUsuario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroGeneralUsuario(
			JComboBox jComboBoxTiposAccionesFormularioParametroGeneralUsuario) {
		this.jComboBoxTiposAccionesFormularioParametroGeneralUsuario = jComboBoxTiposAccionesFormularioParametroGeneralUsuario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrogeneralusuarioSessionBean=new ParametroGeneralUsuarioSessionBean();
		
		this.parametrogeneralusuarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrogeneralusuarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroGeneralUsuarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroGeneralUsuarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro General MANTENIMIENTO"));
		
		
		if(iWidth > 3150) {
			iWidth=3150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroGeneralUsuarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroGeneralUsuario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroGeneralUsuario=new JButtonMe();
				this.jButtonModificarToolBarParametroGeneralUsuario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroGeneralUsuario,this.jTtoolBarDetalleParametroGeneralUsuario,
							"actualizar","actualizar","Actualizar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroGeneralUsuario,this.jTtoolBarDetalleParametroGeneralUsuario,
							"eliminar","eliminar","Eliminar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroGeneralUsuario,this.jTtoolBarDetalleParametroGeneralUsuario,
							"cancelar","cancelar","Cancelar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroGeneralUsuario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroGeneralUsuario,this.jTtoolBarDetalleParametroGeneralUsuario,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroGeneralUsuario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroGeneralUsuario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroGeneralUsuario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroGeneralUsuario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroGeneralUsuario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroGeneralUsuario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroGeneralUsuario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroGeneralUsuario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroGeneralUsuario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroGeneralUsuario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroGeneralUsuario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroGeneralUsuario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroGeneralUsuario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroGeneralUsuario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroGeneralUsuario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroGeneralUsuario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroGeneralUsuario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroGeneralUsuario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroGeneralUsuario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroGeneralUsuario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroGeneralUsuario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroGeneralUsuario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroGeneralUsuario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroGeneralUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroGeneralUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroGeneralUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroGeneralUsuario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroGeneralUsuario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroGeneralUsuario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroGeneralUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroGeneralUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroGeneralUsuario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroGeneralUsuario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroGeneralUsuario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroGeneralUsuario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroGeneralUsuario.add(this.jMenuItemDetalleCerrarParametroGeneralUsuario);
		
		this.jmenuDetalleAccionesParametroGeneralUsuario.add(this.jMenuItemActualizarParametroGeneralUsuario);
		this.jmenuDetalleAccionesParametroGeneralUsuario.add(this.jMenuItemEliminarParametroGeneralUsuario);
		this.jmenuDetalleAccionesParametroGeneralUsuario.add(this.jMenuItemCancelarParametroGeneralUsuario);		
		
		//this.jmenuDetalleDatosParametroGeneralUsuario.add(this.jMenuItemDetalleAbrirOrderByParametroGeneralUsuario);				
		this.jmenuDetalleDatosParametroGeneralUsuario.add(this.jMenuItemDetalleMostarOcultarParametroGeneralUsuario);				
				
		//this.jmenuDetalleAccionesParametroGeneralUsuario.add(this.jMenuItemGuardarCambiosParametroGeneralUsuario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroGeneralUsuario.add(this.jmenuDetalleArchivoParametroGeneralUsuario);		
		this.jmenuBarDetalleParametroGeneralUsuario.add(this.jmenuDetalleAccionesParametroGeneralUsuario);		
		this.jmenuBarDetalleParametroGeneralUsuario.add(this.jmenuDetalleDatosParametroGeneralUsuario);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroGeneralUsuario);				
	}
	
	
	public void inicializarElementosCamposParametroGeneralUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelfecha_sistemaParametroGeneralUsuario = new JLabelMe();
		this.jLabelfecha_sistemaParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_FECHASISTEMA+" : *");
		this.jLabelfecha_sistemaParametroGeneralUsuario.setToolTipText("F Sistema");
		this.jLabelfecha_sistemaParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_sistemaParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_sistemaParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_sistemaParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_sistemaParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_sistemaParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_FECHASISTEMA);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelfecha_sistemaParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		//jFormattedTextFieldfecha_sistemaParametroGeneralUsuario= new JFormattedTextFieldMe();

		jDateChooserfecha_sistemaParametroGeneralUsuario= new JDateChooser();
		jDateChooserfecha_sistemaParametroGeneralUsuario.setEnabled(false);
		jDateChooserfecha_sistemaParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_sistemaParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_sistemaParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_sistemaParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_sistemaParametroGeneralUsuario.setDate(new Date());
		jDateChooserfecha_sistemaParametroGeneralUsuario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_sistemaParametroGeneralUsuario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_sistemaParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonfecha_sistemaParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_sistemaParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_sistemaParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_sistemaParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonfecha_sistemaParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_sistemaParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_sistemaParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_sistemaParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_sistemaParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_sistemaParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_sistemaParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabeldiaParametroGeneralUsuario = new JLabelMe();
		this.jLabeldiaParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_DIA+" : *");
		this.jLabeldiaParametroGeneralUsuario.setToolTipText("Dia");
		this.jLabeldiaParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiaParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldiaParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldiaParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldiaParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldiaParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_DIA);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPaneldiaParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jTextFielddiaParametroGeneralUsuario= new JTextFieldMe();
		jTextFielddiaParametroGeneralUsuario.setEnabled(false);
		jTextFielddiaParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiaParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddiaParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddiaParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddiaParametroGeneralUsuario.setText("0");

		this.jButtondiaParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtondiaParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiaParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondiaParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondiaParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtondiaParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondiaParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondiaParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddiaParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddiaParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"diaParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondiaParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcon_tamanio_control_manualParametroGeneralUsuario = new JLabelMe();
		this.jLabelcon_tamanio_control_manualParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_CONTAMANIOCONTROLMANUAL+" : *");
		this.jLabelcon_tamanio_control_manualParametroGeneralUsuario.setToolTipText("Tam. Control Manual");
		this.jLabelcon_tamanio_control_manualParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_tamanio_control_manualParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_tamanio_control_manualParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_tamanio_control_manualParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_tamanio_control_manualParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_tamanio_control_manualParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_CONTAMANIOCONTROLMANUAL);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelcon_tamanio_control_manualParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario= new JCheckBoxMe();
		jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario.setEnabled(false);

		jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_tamanio_control_manualParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncon_tamanio_control_manualParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_tamanio_control_manualParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_tamanio_control_manualParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_tamanio_control_manualParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtoncon_tamanio_control_manualParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_tamanio_control_manualParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_tamanio_control_manualParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_tamanio_control_manualParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_tamanio_control_manualParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcon_tamanio_control_todo_relacionParametroGeneralUsuario = new JLabelMe();
		this.jLabelcon_tamanio_control_todo_relacionParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_CONTAMANIOCONTROLTODORELACION+" : *");
		this.jLabelcon_tamanio_control_todo_relacionParametroGeneralUsuario.setToolTipText("Tam.Todo Relacion");
		this.jLabelcon_tamanio_control_todo_relacionParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_tamanio_control_todo_relacionParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_tamanio_control_todo_relacionParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_tamanio_control_todo_relacionParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_tamanio_control_todo_relacionParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_tamanio_control_todo_relacionParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_CONTAMANIOCONTROLTODORELACION);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelcon_tamanio_control_todo_relacionParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario= new JCheckBoxMe();
		jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario.setEnabled(false);

		jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_tamanio_control_todo_relacionParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncon_tamanio_control_todo_relacionParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_tamanio_control_todo_relacionParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_tamanio_control_todo_relacionParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_tamanio_control_todo_relacionParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtoncon_tamanio_control_todo_relacionParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_tamanio_control_todo_relacionParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_tamanio_control_todo_relacionParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_tamanio_control_todo_relacionParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_tamanio_control_todo_relacionParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcon_guardar_relacionesParametroGeneralUsuario = new JLabelMe();
		this.jLabelcon_guardar_relacionesParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_CONGUARDARRELACIONES+" : *");
		this.jLabelcon_guardar_relacionesParametroGeneralUsuario.setToolTipText("Guardar Relaciones");
		this.jLabelcon_guardar_relacionesParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_guardar_relacionesParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_guardar_relacionesParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_guardar_relacionesParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_guardar_relacionesParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_guardar_relacionesParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_CONGUARDARRELACIONES);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelcon_guardar_relacionesParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jCheckBoxcon_guardar_relacionesParametroGeneralUsuario= new JCheckBoxMe();
		jCheckBoxcon_guardar_relacionesParametroGeneralUsuario.setEnabled(false);

		jCheckBoxcon_guardar_relacionesParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_guardar_relacionesParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_guardar_relacionesParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_guardar_relacionesParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_guardar_relacionesParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncon_guardar_relacionesParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_guardar_relacionesParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_guardar_relacionesParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_guardar_relacionesParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtoncon_guardar_relacionesParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_guardar_relacionesParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_guardar_relacionesParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_guardar_relacionesParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_guardar_relacionesParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_guardar_relacionesParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_guardar_relacionesParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcon_mensaje_confirmacionParametroGeneralUsuario = new JLabelMe();
		this.jLabelcon_mensaje_confirmacionParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_CONMENSAJECONFIRMACION+" : *");
		this.jLabelcon_mensaje_confirmacionParametroGeneralUsuario.setToolTipText("Mensaje Confirmacion");
		this.jLabelcon_mensaje_confirmacionParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_mensaje_confirmacionParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_mensaje_confirmacionParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_mensaje_confirmacionParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_mensaje_confirmacionParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_mensaje_confirmacionParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_CONMENSAJECONFIRMACION);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelcon_mensaje_confirmacionParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario= new JCheckBoxMe();
		jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario.setEnabled(false);

		jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_mensaje_confirmacionParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncon_mensaje_confirmacionParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mensaje_confirmacionParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mensaje_confirmacionParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_mensaje_confirmacionParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtoncon_mensaje_confirmacionParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_mensaje_confirmacionParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_mensaje_confirmacionParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_mensaje_confirmacionParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_mensaje_confirmacionParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcon_botones_tool_barParametroGeneralUsuario = new JLabelMe();
		this.jLabelcon_botones_tool_barParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_CONBOTONESTOOLBAR+" : *");
		this.jLabelcon_botones_tool_barParametroGeneralUsuario.setToolTipText("Botones Tool Bar");
		this.jLabelcon_botones_tool_barParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_botones_tool_barParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_botones_tool_barParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_botones_tool_barParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_botones_tool_barParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_botones_tool_barParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_CONBOTONESTOOLBAR);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelcon_botones_tool_barParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jCheckBoxcon_botones_tool_barParametroGeneralUsuario= new JCheckBoxMe();
		jCheckBoxcon_botones_tool_barParametroGeneralUsuario.setEnabled(false);

		jCheckBoxcon_botones_tool_barParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_botones_tool_barParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_botones_tool_barParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_botones_tool_barParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_botones_tool_barParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncon_botones_tool_barParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_botones_tool_barParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_botones_tool_barParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_botones_tool_barParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtoncon_botones_tool_barParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_botones_tool_barParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_botones_tool_barParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_botones_tool_barParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_botones_tool_barParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_botones_tool_barParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_botones_tool_barParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcon_mostrar_acciones_campo_generalParametroGeneralUsuario = new JLabelMe();
		this.jLabelcon_mostrar_acciones_campo_generalParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPOGENERAL+" : *");
		this.jLabelcon_mostrar_acciones_campo_generalParametroGeneralUsuario.setToolTipText("Mostrar Acciones Campo General");
		this.jLabelcon_mostrar_acciones_campo_generalParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_mostrar_acciones_campo_generalParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_mostrar_acciones_campo_generalParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_mostrar_acciones_campo_generalParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_mostrar_acciones_campo_generalParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_mostrar_acciones_campo_generalParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPOGENERAL);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelcon_mostrar_acciones_campo_generalParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario= new JCheckBoxMe();
		jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario.setEnabled(false);

		jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_mostrar_acciones_campo_generalParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncon_mostrar_acciones_campo_generalParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mostrar_acciones_campo_generalParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mostrar_acciones_campo_generalParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_mostrar_acciones_campo_generalParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtoncon_mostrar_acciones_campo_generalParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_mostrar_acciones_campo_generalParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_mostrar_acciones_campo_generalParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_mostrar_acciones_campo_generalParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_mostrar_acciones_campo_generalParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario = new JLabelMe();
		this.jLabelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPORELACIONES+" : *");
		this.jLabelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.setToolTipText("Mostrar Acciones Campo Relaciones");
		this.jLabelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_CONMOSTRARACCIONESCAMPORELACIONES);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario= new JCheckBoxMe();
		jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.setEnabled(false);

		jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_mostrar_acciones_campo_relacionesParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncon_mostrar_acciones_campo_relacionesParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mostrar_acciones_campo_relacionesParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_mostrar_acciones_campo_relacionesParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_mostrar_acciones_campo_relacionesParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtoncon_mostrar_acciones_campo_relacionesParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_mostrar_acciones_campo_relacionesParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_mostrar_acciones_campo_relacionesParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_mostrar_acciones_campo_relacionesParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_mostrar_acciones_campo_relacionesParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcon_exportar_cabeceraParametroGeneralUsuario = new JLabelMe();
		this.jLabelcon_exportar_cabeceraParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_CONEXPORTARCABECERA+" : *");
		this.jLabelcon_exportar_cabeceraParametroGeneralUsuario.setToolTipText("Exportar Cabecera");
		this.jLabelcon_exportar_cabeceraParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_exportar_cabeceraParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_exportar_cabeceraParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_exportar_cabeceraParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_exportar_cabeceraParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_exportar_cabeceraParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_CONEXPORTARCABECERA);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelcon_exportar_cabeceraParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario= new JCheckBoxMe();
		jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario.setEnabled(false);

		jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_exportar_cabeceraParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncon_exportar_cabeceraParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_exportar_cabeceraParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_exportar_cabeceraParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_exportar_cabeceraParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtoncon_exportar_cabeceraParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_exportar_cabeceraParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_exportar_cabeceraParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_exportar_cabeceraParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_exportar_cabeceraParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcon_exportar_campo_versionParametroGeneralUsuario = new JLabelMe();
		this.jLabelcon_exportar_campo_versionParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_CONEXPORTARCAMPOVERSION+" : *");
		this.jLabelcon_exportar_campo_versionParametroGeneralUsuario.setToolTipText("Exportar Campo Version");
		this.jLabelcon_exportar_campo_versionParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_exportar_campo_versionParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_exportar_campo_versionParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_exportar_campo_versionParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_exportar_campo_versionParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_exportar_campo_versionParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_CONEXPORTARCAMPOVERSION);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelcon_exportar_campo_versionParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario= new JCheckBoxMe();
		jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario.setEnabled(false);

		jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_exportar_campo_versionParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncon_exportar_campo_versionParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_exportar_campo_versionParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_exportar_campo_versionParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_exportar_campo_versionParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtoncon_exportar_campo_versionParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_exportar_campo_versionParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_exportar_campo_versionParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_exportar_campo_versionParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_exportar_campo_versionParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelpath_exportarParametroGeneralUsuario = new JLabelMe();
		this.jLabelpath_exportarParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_PATHEXPORTAR+" : *");
		this.jLabelpath_exportarParametroGeneralUsuario.setToolTipText("Path Exportar");
		this.jLabelpath_exportarParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpath_exportarParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpath_exportarParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpath_exportarParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpath_exportarParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpath_exportarParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_PATHEXPORTAR);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelpath_exportarParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jTextAreapath_exportarParametroGeneralUsuario= new JTextAreaMe();
		jTextAreapath_exportarParametroGeneralUsuario.setEnabled(false);
		jTextAreapath_exportarParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_exportarParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_exportarParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapath_exportarParametroGeneralUsuario.setLineWrap(true);
		jTextAreapath_exportarParametroGeneralUsuario.setWrapStyleWord(true);
		jTextAreapath_exportarParametroGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapath_exportarParametroGeneralUsuario.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreapath_exportarParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepath_exportarParametroGeneralUsuario = new JScrollPane(jTextAreapath_exportarParametroGeneralUsuario);
		jscrollPanepath_exportarParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_exportarParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanepath_exportarParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonpath_exportarParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonpath_exportarParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_exportarParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpath_exportarParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpath_exportarParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonpath_exportarParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpath_exportarParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpath_exportarParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapath_exportarParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapath_exportarParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"path_exportarParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpath_exportarParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcon_precargar_ventanasParametroGeneralUsuario = new JLabelMe();
		this.jLabelcon_precargar_ventanasParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_CONPRECARGARVENTANAS+" : *");
		this.jLabelcon_precargar_ventanasParametroGeneralUsuario.setToolTipText("Precargar Ventanas");
		this.jLabelcon_precargar_ventanasParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_precargar_ventanasParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_precargar_ventanasParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_precargar_ventanasParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_precargar_ventanasParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_precargar_ventanasParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_CONPRECARGARVENTANAS);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelcon_precargar_ventanasParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jCheckBoxcon_precargar_ventanasParametroGeneralUsuario= new JCheckBoxMe();
		jCheckBoxcon_precargar_ventanasParametroGeneralUsuario.setEnabled(false);

		jCheckBoxcon_precargar_ventanasParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precargar_ventanasParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precargar_ventanasParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_precargar_ventanasParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_precargar_ventanasParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncon_precargar_ventanasParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precargar_ventanasParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precargar_ventanasParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_precargar_ventanasParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtoncon_precargar_ventanasParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_precargar_ventanasParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_precargar_ventanasParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_precargar_ventanasParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_precargar_ventanasParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_precargar_ventanasParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_precargar_ventanasParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcon_precargar_por_usuarioParametroGeneralUsuario = new JLabelMe();
		this.jLabelcon_precargar_por_usuarioParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_CONPRECARGARPORUSUARIO+" : *");
		this.jLabelcon_precargar_por_usuarioParametroGeneralUsuario.setToolTipText("Precargar Por Usuario");
		this.jLabelcon_precargar_por_usuarioParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_precargar_por_usuarioParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_precargar_por_usuarioParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_precargar_por_usuarioParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_precargar_por_usuarioParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_precargar_por_usuarioParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_CONPRECARGARPORUSUARIO);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelcon_precargar_por_usuarioParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario= new JCheckBoxMe();
		jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario.setEnabled(false);

		jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_precargar_por_usuarioParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncon_precargar_por_usuarioParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precargar_por_usuarioParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_precargar_por_usuarioParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_precargar_por_usuarioParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtoncon_precargar_por_usuarioParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_precargar_por_usuarioParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_precargar_por_usuarioParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_precargar_por_usuarioParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_precargar_por_usuarioParametroGeneralUsuarioBusqueda.setVisible(false);		}


					
		this.jLabelcon_cargar_por_parteParametroGeneralUsuario = new JLabelMe();
		this.jLabelcon_cargar_por_parteParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_CONCARGARPORPARTE+" : *");
		this.jLabelcon_cargar_por_parteParametroGeneralUsuario.setToolTipText("Con Cargar Por Parte");
		this.jLabelcon_cargar_por_parteParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_cargar_por_parteParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_cargar_por_parteParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cargar_por_parteParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cargar_por_parteParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cargar_por_parteParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_CONCARGARPORPARTE);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelcon_cargar_por_parteParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jCheckBoxcon_cargar_por_parteParametroGeneralUsuario= new JCheckBoxMe();
		jCheckBoxcon_cargar_por_parteParametroGeneralUsuario.setEnabled(false);

		jCheckBoxcon_cargar_por_parteParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cargar_por_parteParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cargar_por_parteParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cargar_por_parteParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cargar_por_parteParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtoncon_cargar_por_parteParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cargar_por_parteParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cargar_por_parteParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cargar_por_parteParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtoncon_cargar_por_parteParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cargar_por_parteParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cargar_por_parteParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cargar_por_parteParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cargar_por_parteParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cargar_por_parteParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cargar_por_parteParametroGeneralUsuarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroGeneralUsuario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_usuarioParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_usuarioParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_ID+" : *");
		this.jLabelid_usuarioParametroGeneralUsuario.setToolTipText("Id");
		this.jLabelid_usuarioParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_usuarioParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_usuarioParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_usuarioParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_usuarioParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_usuarioParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_usuarioParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioParametroGeneralUsuario"));

		this.jButtonid_usuarioParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_usuarioParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_usuarioParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_usuarioParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_usuarioParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_usuarioParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_empresaParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_empresaParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroGeneralUsuario.setToolTipText("Empresa");
		this.jLabelid_empresaParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_empresaParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_empresaParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_empresaParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empresaParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_empresaParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_empresaParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroGeneralUsuario"));

		this.jButtonid_empresaParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_empresaParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_empresaParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_empresaParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_sucursalParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_sucursalParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroGeneralUsuario.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_sucursalParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_sucursalParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_sucursalParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sucursalParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_sucursalParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_sucursalParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroGeneralUsuario"));

		this.jButtonid_sucursalParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_sucursalParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_sucursalParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_ejercicioParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_ejercicioParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioParametroGeneralUsuario.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_ejercicioParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_ejercicioParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_ejercicioParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_ejercicioParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_ejercicioParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_ejercicioParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioParametroGeneralUsuario"));

		this.jButtonid_ejercicioParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_ejercicioParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_ejercicioParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_ejercicioParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_ejercicioParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_periodoParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_periodoParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoParametroGeneralUsuario.setToolTipText("Periodo");
		this.jLabelid_periodoParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_periodoParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_periodoParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_periodoParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodoParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_periodoParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_periodoParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoParametroGeneralUsuario"));

		this.jButtonid_periodoParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_periodoParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_periodoParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_periodoParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_periodoParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_periodoParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_monedaParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_monedaParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaParametroGeneralUsuario.setToolTipText("Moneda");
		this.jLabelid_monedaParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_monedaParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_monedaParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_monedaParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_monedaParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_monedaParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaParametroGeneralUsuario"));

		this.jButtonid_monedaParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_monedaParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_monedaParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_monedaParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_monedaParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_monedaParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_anioParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_anioParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioParametroGeneralUsuario.setToolTipText("Anio");
		this.jLabelid_anioParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_anioParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_anioParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_anioParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioParametroGeneralUsuario.setEnabled(false);

		this.jButtonid_anioParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_anioParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_anioParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioParametroGeneralUsuario"));

		this.jButtonid_anioParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_anioParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_anioParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_anioParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_anioParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_anioParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_mesParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_mesParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesParametroGeneralUsuario.setToolTipText("Mes");
		this.jLabelid_mesParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_mesParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_mesParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_mesParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesParametroGeneralUsuario.setEnabled(false);

		this.jButtonid_mesParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_mesParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_mesParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesParametroGeneralUsuario"));

		this.jButtonid_mesParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_mesParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_mesParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_mesParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_mesParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_mesParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_tipo_visualParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_tipo_visualParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOVISUAL+" : *");
		this.jLabelid_tipo_visualParametroGeneralUsuario.setToolTipText("Tipo Visual");
		this.jLabelid_tipo_visualParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_visualParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_visualParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_visualParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_visualParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_visualParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOVISUAL);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_tipo_visualParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_tipo_visualParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_visualParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_visualParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_visualParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_visualParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_visualParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_tipo_visualParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_visualParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_visualParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_visualParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_tipo_visualParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_visualParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_visualParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_visualParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_visualParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_visualParametroGeneralUsuario"));

		this.jButtonid_tipo_visualParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_visualParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_visualParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_visualParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_visualParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_tipo_visualParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_visualParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_visualParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_visualParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_visualParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_visualParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_visualParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_visualParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_tipo_visualParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_visualParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_visualParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_visualParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_tipo_visualParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_visualParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_visualParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_visualParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_visualParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_visualParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_tipo_fondoParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_tipo_fondoParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOFONDO+" : *");
		this.jLabelid_tipo_fondoParametroGeneralUsuario.setToolTipText("Tipo Fondo");
		this.jLabelid_tipo_fondoParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_fondoParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_fondoParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fondoParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_fondoParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_fondoParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOFONDO);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_tipo_fondoParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_tipo_fondoParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_fondoParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondoParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondoParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fondoParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_fondoParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_tipo_fondoParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondoParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondoParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondoParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_tipo_fondoParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_fondoParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondoParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_fondoParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondoParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondoParametroGeneralUsuario"));

		this.jButtonid_tipo_fondoParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_fondoParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondoParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondoParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fondoParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_tipo_fondoParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_fondoParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondoParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_fondoParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondoParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondoParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_fondoParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_fondoParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_tipo_fondoParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondoParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondoParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fondoParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_tipo_fondoParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_fondoParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondoParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_fondoParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondoParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondoParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_tipo_fondo_bordeParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_tipo_fondo_bordeParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOFONDOBORDE+" : *");
		this.jLabelid_tipo_fondo_bordeParametroGeneralUsuario.setToolTipText("Tipo Fondo Borde");
		this.jLabelid_tipo_fondo_bordeParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_fondo_bordeParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_fondo_bordeParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fondo_bordeParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_fondo_bordeParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_fondo_bordeParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOFONDOBORDE);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_tipo_fondo_bordeParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondo_bordeParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_bordeParametroGeneralUsuario"));

		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_bordeParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondo_bordeParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_bordeParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_tipo_fondo_controlParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_tipo_fondo_controlParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOFONDOCONTROL+" : *");
		this.jLabelid_tipo_fondo_controlParametroGeneralUsuario.setToolTipText("Tipo Fondo Control");
		this.jLabelid_tipo_fondo_controlParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_fondo_controlParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_fondo_controlParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fondo_controlParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_fondo_controlParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_fondo_controlParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOFONDOCONTROL);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_tipo_fondo_controlParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_tipo_fondo_controlParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_fondo_controlParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_controlParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fondo_controlParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fondo_controlParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_fondo_controlParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondo_controlParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_fondo_controlParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondo_controlParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_controlParametroGeneralUsuario"));

		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_fondo_controlParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondo_controlParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_controlParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fondo_controlParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_fondo_controlParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fondo_controlParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fondo_controlParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_tipo_fuenteParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_tipo_fuenteParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOFUENTE+" : *");
		this.jLabelid_tipo_fuenteParametroGeneralUsuario.setToolTipText("Tipo Fuente");
		this.jLabelid_tipo_fuenteParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_fuenteParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_fuenteParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_fuenteParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_fuenteParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_fuenteParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOFUENTE);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_tipo_fuenteParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_tipo_fuenteParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_fuenteParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fuenteParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_fuenteParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_fuenteParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_fuenteParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_tipo_fuenteParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fuenteParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fuenteParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_fuenteParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_tipo_fuenteParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_fuenteParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fuenteParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_fuenteParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fuenteParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fuenteParametroGeneralUsuario"));

		this.jButtonid_tipo_fuenteParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_fuenteParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fuenteParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fuenteParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fuenteParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_tipo_fuenteParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_fuenteParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fuenteParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_fuenteParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fuenteParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fuenteParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_fuenteParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_fuenteParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_tipo_fuenteParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fuenteParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_fuenteParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_fuenteParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_tipo_fuenteParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_fuenteParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_fuenteParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_fuenteParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_fuenteParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_fuenteParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_tipo_tamanio_control_normalParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_tipo_tamanio_control_normalParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROLNORMAL+" : *");
		this.jLabelid_tipo_tamanio_control_normalParametroGeneralUsuario.setToolTipText("Tam. Control Normal");
		this.jLabelid_tipo_tamanio_control_normalParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_tamanio_control_normalParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_tamanio_control_normalParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tamanio_control_normalParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_tamanio_control_normalParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_tamanio_control_normalParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROLNORMAL);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_tipo_tamanio_control_normalParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tamanio_control_normalParametroGeneralUsuario"));

		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tamanio_control_normalParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tamanio_control_normalParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_tipo_tamanio_control_relacionParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_tipo_tamanio_control_relacionParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROLRELACION+" : *");
		this.jLabelid_tipo_tamanio_control_relacionParametroGeneralUsuario.setToolTipText("Tam. Control Relacion");
		this.jLabelid_tipo_tamanio_control_relacionParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_tamanio_control_relacionParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_tamanio_control_relacionParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tamanio_control_relacionParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_tamanio_control_relacionParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_tamanio_control_relacionParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOTAMANIOCONTROLRELACION);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_tipo_tamanio_control_relacionParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tamanio_control_relacionParametroGeneralUsuario"));

		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tamanio_control_relacionParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tamanio_control_relacionParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_tipo_exportarParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_tipo_exportarParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOEXPORTAR+" : *");
		this.jLabelid_tipo_exportarParametroGeneralUsuario.setToolTipText("T. Exportar");
		this.jLabelid_tipo_exportarParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_exportarParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_exportarParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_exportarParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_exportarParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_exportarParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPOEXPORTAR);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_tipo_exportarParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_tipo_exportarParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_exportarParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_exportarParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_exportarParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_exportarParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_exportarParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_tipo_exportarParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_exportarParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_exportarParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_exportarParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_tipo_exportarParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_exportarParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_exportarParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_exportarParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_exportarParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_exportarParametroGeneralUsuario"));

		this.jButtonid_tipo_exportarParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_exportarParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_exportarParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_exportarParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_exportarParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_tipo_exportarParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_exportarParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_exportarParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_exportarParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_exportarParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_exportarParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_exportarParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_exportarParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_tipo_exportarParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_exportarParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_exportarParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_exportarParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_tipo_exportarParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_exportarParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_exportarParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_exportarParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_exportarParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_exportarParametroGeneralUsuarioUpdate"));



					
		this.jLabelid_tipo_delimiterParametroGeneralUsuario = new JLabelMe();
		this.jLabelid_tipo_delimiterParametroGeneralUsuario.setText(""+ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPODELIMITER+" : *");
		this.jLabelid_tipo_delimiterParametroGeneralUsuario.setToolTipText("T. Delimiter");
		this.jLabelid_tipo_delimiterParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_delimiterParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_delimiterParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_delimiterParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_delimiterParametroGeneralUsuario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_delimiterParametroGeneralUsuario.setToolTipText(ParametroGeneralUsuarioConstantesFunciones.LABEL_IDTIPODELIMITER);
		this.gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		this.jPanelid_tipo_delimiterParametroGeneralUsuario.setLayout(this.gridaBagLayoutParametroGeneralUsuario);


		jComboBoxid_tipo_delimiterParametroGeneralUsuario= new JComboBoxMe();
		jComboBoxid_tipo_delimiterParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_delimiterParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_delimiterParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_delimiterParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_delimiterParametroGeneralUsuario= new JButtonMe();
		this.jButtonid_tipo_delimiterParametroGeneralUsuario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_delimiterParametroGeneralUsuario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_delimiterParametroGeneralUsuario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_delimiterParametroGeneralUsuario.setText("Buscar");
		this.jButtonid_tipo_delimiterParametroGeneralUsuario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_delimiterParametroGeneralUsuario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_delimiterParametroGeneralUsuario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_delimiterParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_delimiterParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_delimiterParametroGeneralUsuario"));

		this.jButtonid_tipo_delimiterParametroGeneralUsuarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_delimiterParametroGeneralUsuarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_delimiterParametroGeneralUsuarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_delimiterParametroGeneralUsuarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_delimiterParametroGeneralUsuarioBusqueda.setText("U");
		this.jButtonid_tipo_delimiterParametroGeneralUsuarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_delimiterParametroGeneralUsuarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_delimiterParametroGeneralUsuarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_delimiterParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_delimiterParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_delimiterParametroGeneralUsuarioBusqueda"));

		if(this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_delimiterParametroGeneralUsuarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_delimiterParametroGeneralUsuarioUpdate= new JButtonMe();
		this.jButtonid_tipo_delimiterParametroGeneralUsuarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_delimiterParametroGeneralUsuarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_delimiterParametroGeneralUsuarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_delimiterParametroGeneralUsuarioUpdate.setText("U");
		this.jButtonid_tipo_delimiterParametroGeneralUsuarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_delimiterParametroGeneralUsuarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_delimiterParametroGeneralUsuarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_delimiterParametroGeneralUsuario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_delimiterParametroGeneralUsuario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_delimiterParametroGeneralUsuarioUpdate"));



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
		//this.jInternalFrameDetalleParametroGeneralUsuario = new ParametroGeneralUsuarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro General DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroGeneralUsuario= new GridBagLayout();
		

		
		String sToolTipParametroGeneralUsuario="";
		sToolTipParametroGeneralUsuario=ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroGeneralUsuario+="(Seguridad.ParametroGeneralUsuario)";
		}
		
		if(!this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroGeneralUsuario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroGeneralUsuario = new JButtonMe();
		this.jButtonModificarParametroGeneralUsuario = new JButtonMe();
        this.jButtonActualizarParametroGeneralUsuario = new JButtonMe();
        this.jButtonEliminarParametroGeneralUsuario = new JButtonMe();
        this.jButtonCancelarParametroGeneralUsuario = new JButtonMe();
        this.jButtonGuardarCambiosParametroGeneralUsuario = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroGeneralUsuario = new JButtonMe();
		this.jButtonCerrarParametroGeneralUsuario = new JButtonMe();
		
		this.jScrollPanelDatosParametroGeneralUsuario = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroGeneralUsuario = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroGeneralUsuario = new JScrollPane();
				
		
		
		this.jPanelCamposParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposInicioprincipalParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovisualParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciofuncionalParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioexportarParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciorecargarParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro General";
		
		if(!this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroGeneralUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroGeneralUsuario.setName("jPanelCamposParametroGeneralUsuario"); 

		this.jPanelCamposOcultosParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroGeneralUsuario.setName("jPanelCamposOcultosParametroGeneralUsuario"); 

        this.jPanelAccionesParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroGeneralUsuario.setToolTipText("Acciones");
        this.jPanelAccionesParametroGeneralUsuario.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroGeneralUsuario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroGeneralUsuario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposInicioprincipalParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));
		this.jPanelCamposInicioprincipalParametroGeneralUsuario.setName("jPanelCamposFinprincipalParametroGeneralUsuario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioprincipalParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovisualParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Visual"));
		this.jPanelCamposIniciovisualParametroGeneralUsuario.setName("jPanelCamposFinvisualParametroGeneralUsuario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovisualParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciofuncionalParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcional"));
		this.jPanelCamposIniciofuncionalParametroGeneralUsuario.setName("jPanelCamposFinfuncionalParametroGeneralUsuario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciofuncionalParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioexportarParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Exportar"));
		this.jPanelCamposInicioexportarParametroGeneralUsuario.setName("jPanelCamposFinexportarParametroGeneralUsuario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioexportarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciorecargarParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Recargar"));
		this.jPanelCamposIniciorecargarParametroGeneralUsuario.setName("jPanelCamposFinrecargarParametroGeneralUsuario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciorecargarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroGeneralUsuario.setText("Nuevo");
		this.jButtonModificarParametroGeneralUsuario.setText("Editar");
        this.jButtonActualizarParametroGeneralUsuario.setText("Actualizar");
        this.jButtonEliminarParametroGeneralUsuario.setText("Eliminar");
        this.jButtonCancelarParametroGeneralUsuario.setText("Cancelar");
        this.jButtonGuardarCambiosParametroGeneralUsuario.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroGeneralUsuario.setText("Guardar");
		this.jButtonCerrarParametroGeneralUsuario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroGeneralUsuario,"nuevo_button","Nuevo",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroGeneralUsuario,"modificar_button","Editar",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroGeneralUsuario,"actualizar_button","Actualizar",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroGeneralUsuario,"eliminar_button","Eliminar",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroGeneralUsuario,"cancelar_button","Cancelar",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroGeneralUsuario,"guardarcambios_button","Guardar",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroGeneralUsuario,"guardarcambiostabla_button","Guardar",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroGeneralUsuario,"cerrar_button","Salir",this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroGeneralUsuario.setToolTipText("Nuevo"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroGeneralUsuario.setToolTipText("Editar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroGeneralUsuario.setToolTipText("Actualizar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroGeneralUsuario.setToolTipText("Eliminar)"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroGeneralUsuario.setToolTipText("Cancelar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroGeneralUsuario.setToolTipText("Guardar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroGeneralUsuario.setToolTipText("Guardar"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroGeneralUsuario.setToolTipText("Salir"+" "+ParametroGeneralUsuarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroGeneralUsuario";
		inputMap = this.jButtonNuevoParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroGeneralUsuario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroGeneralUsuario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroGeneralUsuario";
		inputMap = this.jButtonActualizarParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroGeneralUsuario"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroGeneralUsuario";
		inputMap = this.jButtonEliminarParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroGeneralUsuario"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroGeneralUsuario";
		inputMap = this.jButtonCancelarParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroGeneralUsuario"));
		
		//CERRAR		
		sMapKey = "CerrarParametroGeneralUsuario";
		inputMap = this.jButtonCerrarParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroGeneralUsuario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroGeneralUsuario";
		inputMap = this.jButtonGuardarCambiosTablaParametroGeneralUsuario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroGeneralUsuario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroGeneralUsuario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroGeneralUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroGeneralUsuario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroGeneralUsuario.setToolTipText("Nuevo ParametroGeneralUsuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroGeneralUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroGeneralUsuario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroGeneralUsuario.setToolTipText("Sin Cerrar Ventana ParametroGeneralUsuario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroGeneralUsuario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroGeneralUsuario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroGeneralUsuario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroGeneralUsuario.setText("Accion");
		this.jComboBoxTiposAccionesParametroGeneralUsuario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroGeneralUsuario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroGeneralUsuario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroGeneralUsuario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroGeneralUsuario = new JLabelMe();
		
		this.jLabelAccionesParametroGeneralUsuario.setText("Acciones");		
		this.jLabelAccionesParametroGeneralUsuario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGeneralUsuario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGeneralUsuario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroGeneralUsuario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroGeneralUsuario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroGeneralUsuario=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroGeneralUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroGeneralUsuario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroGeneralUsuario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGeneralUsuario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGeneralUsuario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroGeneralUsuario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroGeneralUsuario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroGeneralUsuario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroGeneralUsuario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroGeneralUsuario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroGeneralUsuario = new GridBagLayout();
		
		this.jPanelCamposParametroGeneralUsuario.setLayout(gridaBagLayoutCamposParametroGeneralUsuario);
		this.jPanelCamposOcultosParametroGeneralUsuario.setLayout(gridaBagLayoutCamposOcultosParametroGeneralUsuario);
		
		

		GridBagLayout gridaBagLayoutCamposInicioprincipalParametroGeneralUsuario= new GridBagLayout();
		this.jPanelCamposInicioprincipalParametroGeneralUsuario.setLayout(gridaBagLayoutCamposInicioprincipalParametroGeneralUsuario);

		GridBagLayout gridaBagLayoutCamposIniciovisualParametroGeneralUsuario= new GridBagLayout();
		this.jPanelCamposIniciovisualParametroGeneralUsuario.setLayout(gridaBagLayoutCamposIniciovisualParametroGeneralUsuario);

		GridBagLayout gridaBagLayoutCamposIniciofuncionalParametroGeneralUsuario= new GridBagLayout();
		this.jPanelCamposIniciofuncionalParametroGeneralUsuario.setLayout(gridaBagLayoutCamposIniciofuncionalParametroGeneralUsuario);

		GridBagLayout gridaBagLayoutCamposInicioexportarParametroGeneralUsuario= new GridBagLayout();
		this.jPanelCamposInicioexportarParametroGeneralUsuario.setLayout(gridaBagLayoutCamposInicioexportarParametroGeneralUsuario);

		GridBagLayout gridaBagLayoutCamposIniciorecargarParametroGeneralUsuario= new GridBagLayout();
		this.jPanelCamposIniciorecargarParametroGeneralUsuario.setLayout(gridaBagLayoutCamposIniciorecargarParametroGeneralUsuario);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_usuarioParametroGeneralUsuario.add(jLabelid_usuarioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioParametroGeneralUsuario.add(jButtonid_usuarioParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioParametroGeneralUsuario.add(jButtonid_usuarioParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_usuarioParametroGeneralUsuario.add(jComboBoxid_usuarioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaParametroGeneralUsuario.add(jLabelid_empresaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroGeneralUsuario.add(jButtonid_empresaParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroGeneralUsuario.add(jButtonid_empresaParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaParametroGeneralUsuario.add(jComboBoxid_empresaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalParametroGeneralUsuario.add(jLabelid_sucursalParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroGeneralUsuario.add(jButtonid_sucursalParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroGeneralUsuario.add(jButtonid_sucursalParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalParametroGeneralUsuario.add(jComboBoxid_sucursalParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioParametroGeneralUsuario.add(jLabelid_ejercicioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioParametroGeneralUsuario.add(jButtonid_ejercicioParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioParametroGeneralUsuario.add(jButtonid_ejercicioParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioParametroGeneralUsuario.add(jComboBoxid_ejercicioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoParametroGeneralUsuario.add(jLabelid_periodoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoParametroGeneralUsuario.add(jButtonid_periodoParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoParametroGeneralUsuario.add(jButtonid_periodoParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoParametroGeneralUsuario.add(jComboBoxid_periodoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaParametroGeneralUsuario.add(jLabelid_monedaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaParametroGeneralUsuario.add(jButtonid_monedaParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaParametroGeneralUsuario.add(jButtonid_monedaParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaParametroGeneralUsuario.add(jComboBoxid_monedaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_sistemaParametroGeneralUsuario.add(jLabelfecha_sistemaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_sistemaParametroGeneralUsuario.add(jButtonfecha_sistemaParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_sistemaParametroGeneralUsuario.add(jDateChooserfecha_sistemaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioParametroGeneralUsuario.add(jLabelid_anioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioParametroGeneralUsuario.add(jButtonid_anioParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioParametroGeneralUsuario.add(jButtonid_anioParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioParametroGeneralUsuario.add(jComboBoxid_anioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesParametroGeneralUsuario.add(jLabelid_mesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesParametroGeneralUsuario.add(jButtonid_mesParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesParametroGeneralUsuario.add(jButtonid_mesParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesParametroGeneralUsuario.add(jComboBoxid_mesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldiaParametroGeneralUsuario.add(jLabeldiaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPaneldiaParametroGeneralUsuario.add(jButtondiaParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldiaParametroGeneralUsuario.add(jTextFielddiaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_visualParametroGeneralUsuario.add(jLabelid_tipo_visualParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_visualParametroGeneralUsuario.add(jButtonid_tipo_visualParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_visualParametroGeneralUsuario.add(jButtonid_tipo_visualParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_visualParametroGeneralUsuario.add(jComboBoxid_tipo_visualParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_fondoParametroGeneralUsuario.add(jLabelid_tipo_fondoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fondoParametroGeneralUsuario.add(jButtonid_tipo_fondoParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fondoParametroGeneralUsuario.add(jButtonid_tipo_fondoParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_fondoParametroGeneralUsuario.add(jComboBoxid_tipo_fondoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_fondo_bordeParametroGeneralUsuario.add(jLabelid_tipo_fondo_bordeParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fondo_bordeParametroGeneralUsuario.add(jButtonid_tipo_fondo_bordeParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fondo_bordeParametroGeneralUsuario.add(jButtonid_tipo_fondo_bordeParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_fondo_bordeParametroGeneralUsuario.add(jComboBoxid_tipo_fondo_bordeParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_fondo_controlParametroGeneralUsuario.add(jLabelid_tipo_fondo_controlParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fondo_controlParametroGeneralUsuario.add(jButtonid_tipo_fondo_controlParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fondo_controlParametroGeneralUsuario.add(jButtonid_tipo_fondo_controlParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_fondo_controlParametroGeneralUsuario.add(jComboBoxid_tipo_fondo_controlParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_fuenteParametroGeneralUsuario.add(jLabelid_tipo_fuenteParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fuenteParametroGeneralUsuario.add(jButtonid_tipo_fuenteParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_fuenteParametroGeneralUsuario.add(jButtonid_tipo_fuenteParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_fuenteParametroGeneralUsuario.add(jComboBoxid_tipo_fuenteParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_tamanio_control_normalParametroGeneralUsuario.add(jLabelid_tipo_tamanio_control_normalParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tamanio_control_normalParametroGeneralUsuario.add(jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tamanio_control_normalParametroGeneralUsuario.add(jButtonid_tipo_tamanio_control_normalParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_tamanio_control_normalParametroGeneralUsuario.add(jComboBoxid_tipo_tamanio_control_normalParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_tamanio_control_relacionParametroGeneralUsuario.add(jLabelid_tipo_tamanio_control_relacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tamanio_control_relacionParametroGeneralUsuario.add(jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tamanio_control_relacionParametroGeneralUsuario.add(jButtonid_tipo_tamanio_control_relacionParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_tamanio_control_relacionParametroGeneralUsuario.add(jComboBoxid_tipo_tamanio_control_relacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_tamanio_control_manualParametroGeneralUsuario.add(jLabelcon_tamanio_control_manualParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_tamanio_control_manualParametroGeneralUsuario.add(jButtoncon_tamanio_control_manualParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_tamanio_control_manualParametroGeneralUsuario.add(jCheckBoxcon_tamanio_control_manualParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_tamanio_control_todo_relacionParametroGeneralUsuario.add(jLabelcon_tamanio_control_todo_relacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_tamanio_control_todo_relacionParametroGeneralUsuario.add(jButtoncon_tamanio_control_todo_relacionParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_tamanio_control_todo_relacionParametroGeneralUsuario.add(jCheckBoxcon_tamanio_control_todo_relacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_guardar_relacionesParametroGeneralUsuario.add(jLabelcon_guardar_relacionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_guardar_relacionesParametroGeneralUsuario.add(jButtoncon_guardar_relacionesParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_guardar_relacionesParametroGeneralUsuario.add(jCheckBoxcon_guardar_relacionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_mensaje_confirmacionParametroGeneralUsuario.add(jLabelcon_mensaje_confirmacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_mensaje_confirmacionParametroGeneralUsuario.add(jButtoncon_mensaje_confirmacionParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_mensaje_confirmacionParametroGeneralUsuario.add(jCheckBoxcon_mensaje_confirmacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_botones_tool_barParametroGeneralUsuario.add(jLabelcon_botones_tool_barParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_botones_tool_barParametroGeneralUsuario.add(jButtoncon_botones_tool_barParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_botones_tool_barParametroGeneralUsuario.add(jCheckBoxcon_botones_tool_barParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_mostrar_acciones_campo_generalParametroGeneralUsuario.add(jLabelcon_mostrar_acciones_campo_generalParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_mostrar_acciones_campo_generalParametroGeneralUsuario.add(jButtoncon_mostrar_acciones_campo_generalParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_mostrar_acciones_campo_generalParametroGeneralUsuario.add(jCheckBoxcon_mostrar_acciones_campo_generalParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.add(jLabelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.add(jButtoncon_mostrar_acciones_campo_relacionesParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario.add(jCheckBoxcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_exportarParametroGeneralUsuario.add(jLabelid_tipo_exportarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_exportarParametroGeneralUsuario.add(jButtonid_tipo_exportarParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_exportarParametroGeneralUsuario.add(jButtonid_tipo_exportarParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_exportarParametroGeneralUsuario.add(jComboBoxid_tipo_exportarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_delimiterParametroGeneralUsuario.add(jLabelid_tipo_delimiterParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_delimiterParametroGeneralUsuario.add(jButtonid_tipo_delimiterParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 3;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_delimiterParametroGeneralUsuario.add(jButtonid_tipo_delimiterParametroGeneralUsuarioUpdate, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_delimiterParametroGeneralUsuario.add(jComboBoxid_tipo_delimiterParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_exportar_cabeceraParametroGeneralUsuario.add(jLabelcon_exportar_cabeceraParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_exportar_cabeceraParametroGeneralUsuario.add(jButtoncon_exportar_cabeceraParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_exportar_cabeceraParametroGeneralUsuario.add(jCheckBoxcon_exportar_cabeceraParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_exportar_campo_versionParametroGeneralUsuario.add(jLabelcon_exportar_campo_versionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_exportar_campo_versionParametroGeneralUsuario.add(jButtoncon_exportar_campo_versionParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_exportar_campo_versionParametroGeneralUsuario.add(jCheckBoxcon_exportar_campo_versionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelpath_exportarParametroGeneralUsuario.add(jLabelpath_exportarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelpath_exportarParametroGeneralUsuario.add(jButtonpath_exportarParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelpath_exportarParametroGeneralUsuario.add(jscrollPanepath_exportarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_precargar_ventanasParametroGeneralUsuario.add(jLabelcon_precargar_ventanasParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_precargar_ventanasParametroGeneralUsuario.add(jButtoncon_precargar_ventanasParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_precargar_ventanasParametroGeneralUsuario.add(jCheckBoxcon_precargar_ventanasParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_precargar_por_usuarioParametroGeneralUsuario.add(jLabelcon_precargar_por_usuarioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_precargar_por_usuarioParametroGeneralUsuario.add(jButtoncon_precargar_por_usuarioParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_precargar_por_usuarioParametroGeneralUsuario.add(jCheckBoxcon_precargar_por_usuarioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_cargar_por_parteParametroGeneralUsuario.add(jLabelcon_cargar_por_parteParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 2;
		this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
		this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cargar_por_parteParametroGeneralUsuario.add(jButtoncon_cargar_por_parteParametroGeneralUsuarioBusqueda, this.gridBagConstraintsParametroGeneralUsuario);
	}

	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = 1;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_cargar_por_parteParametroGeneralUsuario.add(jCheckBoxcon_cargar_por_parteParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposParametroGeneralUsuario.add(this.jPanelcon_cargar_por_parteParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposParametroGeneralUsuario % 2==0) {
		iXPanelCamposParametroGeneralUsuario=0;
		iYPanelCamposParametroGeneralUsuario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposOcultosParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposOcultosParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosParametroGeneralUsuario.add(this.jPanelid_anioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposOcultosParametroGeneralUsuario % 2==0) {
		iXPanelCamposOcultosParametroGeneralUsuario=0;
		iYPanelCamposOcultosParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposOcultosParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposOcultosParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosParametroGeneralUsuario.add(this.jPanelid_mesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposOcultosParametroGeneralUsuario % 2==0) {
		iXPanelCamposOcultosParametroGeneralUsuario=0;
		iYPanelCamposOcultosParametroGeneralUsuario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioprincipalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioprincipalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioprincipalParametroGeneralUsuario.add(this.jPanelid_usuarioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioprincipalParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioprincipalParametroGeneralUsuario=0;
		iYPanelCamposInicioprincipalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioprincipalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioprincipalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioprincipalParametroGeneralUsuario.add(this.jPanelid_empresaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioprincipalParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioprincipalParametroGeneralUsuario=0;
		iYPanelCamposInicioprincipalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioprincipalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioprincipalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioprincipalParametroGeneralUsuario.add(this.jPanelid_sucursalParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioprincipalParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioprincipalParametroGeneralUsuario=0;
		iYPanelCamposInicioprincipalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioprincipalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioprincipalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioprincipalParametroGeneralUsuario.add(this.jPanelid_ejercicioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioprincipalParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioprincipalParametroGeneralUsuario=0;
		iYPanelCamposInicioprincipalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioprincipalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioprincipalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioprincipalParametroGeneralUsuario.add(this.jPanelid_periodoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioprincipalParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioprincipalParametroGeneralUsuario=0;
		iYPanelCamposInicioprincipalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioprincipalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioprincipalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioprincipalParametroGeneralUsuario.add(this.jPanelid_monedaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioprincipalParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioprincipalParametroGeneralUsuario=0;
		iYPanelCamposInicioprincipalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioprincipalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioprincipalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioprincipalParametroGeneralUsuario.add(this.jPanelfecha_sistemaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioprincipalParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioprincipalParametroGeneralUsuario=0;
		iYPanelCamposInicioprincipalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioprincipalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioprincipalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioprincipalParametroGeneralUsuario.add(this.jPaneldiaParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioprincipalParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioprincipalParametroGeneralUsuario=0;
		iYPanelCamposInicioprincipalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciovisualParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciovisualParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovisualParametroGeneralUsuario.add(this.jPanelid_tipo_visualParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciovisualParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciovisualParametroGeneralUsuario=0;
		iYPanelCamposIniciovisualParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciovisualParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciovisualParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovisualParametroGeneralUsuario.add(this.jPanelid_tipo_fondoParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciovisualParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciovisualParametroGeneralUsuario=0;
		iYPanelCamposIniciovisualParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciovisualParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciovisualParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovisualParametroGeneralUsuario.add(this.jPanelid_tipo_fondo_bordeParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciovisualParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciovisualParametroGeneralUsuario=0;
		iYPanelCamposIniciovisualParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciovisualParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciovisualParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovisualParametroGeneralUsuario.add(this.jPanelid_tipo_fondo_controlParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciovisualParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciovisualParametroGeneralUsuario=0;
		iYPanelCamposIniciovisualParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciovisualParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciovisualParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovisualParametroGeneralUsuario.add(this.jPanelid_tipo_fuenteParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciovisualParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciovisualParametroGeneralUsuario=0;
		iYPanelCamposIniciovisualParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciovisualParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciovisualParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovisualParametroGeneralUsuario.add(this.jPanelid_tipo_tamanio_control_normalParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciovisualParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciovisualParametroGeneralUsuario=0;
		iYPanelCamposIniciovisualParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciovisualParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciovisualParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovisualParametroGeneralUsuario.add(this.jPanelid_tipo_tamanio_control_relacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciovisualParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciovisualParametroGeneralUsuario=0;
		iYPanelCamposIniciovisualParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciovisualParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciovisualParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovisualParametroGeneralUsuario.add(this.jPanelcon_tamanio_control_manualParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciovisualParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciovisualParametroGeneralUsuario=0;
		iYPanelCamposIniciovisualParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciovisualParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciovisualParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciovisualParametroGeneralUsuario.add(this.jPanelcon_tamanio_control_todo_relacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciovisualParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciovisualParametroGeneralUsuario=0;
		iYPanelCamposIniciovisualParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciofuncionalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciofuncionalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciofuncionalParametroGeneralUsuario.add(this.jPanelcon_guardar_relacionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciofuncionalParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciofuncionalParametroGeneralUsuario=0;
		iYPanelCamposIniciofuncionalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciofuncionalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciofuncionalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciofuncionalParametroGeneralUsuario.add(this.jPanelcon_mensaje_confirmacionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciofuncionalParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciofuncionalParametroGeneralUsuario=0;
		iYPanelCamposIniciofuncionalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciofuncionalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciofuncionalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciofuncionalParametroGeneralUsuario.add(this.jPanelcon_botones_tool_barParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciofuncionalParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciofuncionalParametroGeneralUsuario=0;
		iYPanelCamposIniciofuncionalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciofuncionalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciofuncionalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciofuncionalParametroGeneralUsuario.add(this.jPanelcon_mostrar_acciones_campo_generalParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciofuncionalParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciofuncionalParametroGeneralUsuario=0;
		iYPanelCamposIniciofuncionalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciofuncionalParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciofuncionalParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciofuncionalParametroGeneralUsuario.add(this.jPanelcon_mostrar_acciones_campo_relacionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciofuncionalParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciofuncionalParametroGeneralUsuario=0;
		iYPanelCamposIniciofuncionalParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioexportarParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioexportarParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioexportarParametroGeneralUsuario.add(this.jPanelid_tipo_exportarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioexportarParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioexportarParametroGeneralUsuario=0;
		iYPanelCamposInicioexportarParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioexportarParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioexportarParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioexportarParametroGeneralUsuario.add(this.jPanelid_tipo_delimiterParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioexportarParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioexportarParametroGeneralUsuario=0;
		iYPanelCamposInicioexportarParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioexportarParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioexportarParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioexportarParametroGeneralUsuario.add(this.jPanelcon_exportar_cabeceraParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioexportarParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioexportarParametroGeneralUsuario=0;
		iYPanelCamposInicioexportarParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioexportarParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioexportarParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioexportarParametroGeneralUsuario.add(this.jPanelcon_exportar_campo_versionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioexportarParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioexportarParametroGeneralUsuario=0;
		iYPanelCamposInicioexportarParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposInicioexportarParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposInicioexportarParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioexportarParametroGeneralUsuario.add(this.jPanelpath_exportarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposInicioexportarParametroGeneralUsuario % 2==0) {
		iXPanelCamposInicioexportarParametroGeneralUsuario=0;
		iYPanelCamposInicioexportarParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciorecargarParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciorecargarParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciorecargarParametroGeneralUsuario.add(this.jPanelcon_precargar_ventanasParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciorecargarParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciorecargarParametroGeneralUsuario=0;
		iYPanelCamposIniciorecargarParametroGeneralUsuario++;
	}
	this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralUsuario.gridy = iYPanelCamposIniciorecargarParametroGeneralUsuario;
	this.gridBagConstraintsParametroGeneralUsuario.gridx = iXPanelCamposIniciorecargarParametroGeneralUsuario++;
	this.gridBagConstraintsParametroGeneralUsuario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralUsuario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciorecargarParametroGeneralUsuario.add(this.jPanelcon_precargar_por_usuarioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);



	if(iXPanelCamposIniciorecargarParametroGeneralUsuario % 2==0) {
		iXPanelCamposIniciorecargarParametroGeneralUsuario=0;
		iYPanelCamposIniciorecargarParametroGeneralUsuario++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroGeneralUsuario= new GridBagLayout();
		this.jPanelAccionesParametroGeneralUsuario.setLayout(gridaBagLayoutAccionesParametroGeneralUsuario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroGeneralUsuario= new GridBagLayout();
		this.jPanelAccionesFormularioParametroGeneralUsuario.setLayout(gridaBagLayoutAccionesFormularioParametroGeneralUsuario);
		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroGeneralUsuario.add(this.jComboBoxTiposAccionesFormularioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);

			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrogeneralusuarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroGeneralUsuario.add(this.jCheckBoxPostAccionSinCerrarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrogeneralusuarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroGeneralUsuario.add(this.jCheckBoxPostAccionSinMensajeParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroGeneralUsuario.add(this.jButtonModificarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);							

		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;
		this.gridBagConstraintsParametroGeneralUsuario.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroGeneralUsuario.add(this.jButtonEliminarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		
			
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroGeneralUsuario.add(this.jButtonActualizarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);


		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroGeneralUsuario.add(this.jButtonGuardarCambiosParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);	
		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy = 0;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroGeneralUsuario.add(this.jButtonCancelarParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroGeneralUsuario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroGeneralUsuario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrogeneralusuarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();						
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;		
			//this.gridBagConstraintsParametroGeneralUsuario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroGeneralUsuario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroGeneralUsuario.gridx =0;
		this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroGeneralUsuario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroGeneralUsuarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroGeneralUsuario = new ParametroGeneralUsuarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro General DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro General DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro General Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroGeneralUsuarioModel parametrogeneralusuarioModel=new ParametroGeneralUsuarioModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroGeneralUsuarioModel.ParametroGeneralUsuarioFocusTraversalPolicy parametrogeneralusuarioFocusTraversalPolicy = parametrogeneralusuarioModel.new ParametroGeneralUsuarioFocusTraversalPolicy(this);
			
			//parametrogeneralusuarioFocusTraversalPolicy.setparametrogeneralusuarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrogeneralusuarioModel);
			
			
			this.jContentPaneDetalleParametroGeneralUsuario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroGeneralUsuario = new GridBagLayout();	
			this.jContentPaneDetalleParametroGeneralUsuario.setLayout(gridaBagLayoutDetalleParametroGeneralUsuario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroGeneralUsuario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
				this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
					
				
				this.jContentPaneDetalleParametroGeneralUsuario.add(jTtoolBarDetalleParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);								
				
}
			
			this.jScrollPanelDatosEdicionParametroGeneralUsuario=   new JScrollPane(jContentPaneDetalleParametroGeneralUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroGeneralUsuario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyRelaciones++;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;

		this.jContentPaneDetalleParametroGeneralUsuario.add(jPanelCamposInicioprincipalParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);


		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyRelaciones++;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;

		this.jContentPaneDetalleParametroGeneralUsuario.add(jPanelCamposIniciovisualParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);


		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyRelaciones++;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;

		this.jContentPaneDetalleParametroGeneralUsuario.add(jPanelCamposIniciofuncionalParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);


		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyRelaciones++;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;

		this.jContentPaneDetalleParametroGeneralUsuario.add(jPanelCamposInicioexportarParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);


		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyRelaciones++;
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;

		this.jContentPaneDetalleParametroGeneralUsuario.add(jPanelCamposIniciorecargarParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);
			
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
						&& parametrogeneralusuarioSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.parametrogeneralusuarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroGeneralUsuario= new GridBagConstraints();
						this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
						this.jContentPaneDetalleParametroGeneralUsuario.add(this.jTabbedPaneRelacionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroGeneralUsuario.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroGeneralUsuario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
					this.gridBagConstraintsParametroGeneralUsuario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
					
				
					this.jContentPaneDetalleParametroGeneralUsuario.add(jPanelCamposOcultosParametroGeneralUsuario, gridBagConstraintsParametroGeneralUsuario);
				
					this.jPanelCamposOcultosParametroGeneralUsuario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	        this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroGeneralUsuario.add(this.jPanelAccionesFormularioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);							
			
			
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
	        this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroGeneralUsuario.add(this.jPanelAccionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroGeneralUsuario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroGeneralUsuario=   new JScrollPane(this.jPanelCamposParametroGeneralUsuario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroGeneralUsuario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGeneralUsuario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGeneralUsuario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
			this.gridBagConstraintsParametroGeneralUsuario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroGeneralUsuario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroGeneralUsuario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);			
			
			this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralUsuario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
			
			
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		
			
		this.gridBagConstraintsParametroGeneralUsuario = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralUsuario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralUsuario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroGeneralUsuario, this.gridBagConstraintsParametroGeneralUsuario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroGeneralUsuario;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroGeneralUsuario;
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
