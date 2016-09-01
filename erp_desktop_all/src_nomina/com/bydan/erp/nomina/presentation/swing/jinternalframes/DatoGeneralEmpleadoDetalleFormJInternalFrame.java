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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.DatoGeneralEmpleadoConstantesFunciones;

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
public class DatoGeneralEmpleadoDetalleFormJInternalFrame extends DatoGeneralEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDatoGeneralEmpleado;
	
	protected JMenuBar jmenuBarDetalleDatoGeneralEmpleado;
	
	protected JMenu jmenuDetalleDatoGeneralEmpleado;
	protected JMenu jmenuDetalleArchivoDatoGeneralEmpleado;
	protected JMenu jmenuDetalleAccionesDatoGeneralEmpleado;
	protected JMenu jmenuDetalleDatosDatoGeneralEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDatoGeneralEmpleado;	
	protected GridBagConstraints gridBagConstraintsDatoGeneralEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DatoGeneralEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDatoGeneralEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_numeropatronal="";

	protected TipoAfiliacionBeanSwingJInternalFrame tipoafiliacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoafiliacion="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_canton="";

	protected ParroquiaBeanSwingJInternalFrame parroquiaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parroquia="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoContratoBeanSwingJInternalFrame tipocontratoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocontrato="";

	protected TipoLibretaMiliBeanSwingJInternalFrame tipolibretamiliBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipolibretamili="";

	protected TipoGrupoFormaPagoBeanSwingJInternalFrame tipogrupoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipogrupoformapago="";

	protected BancoBeanSwingJInternalFrame bancoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_banco="";

	protected TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabancoglobal="";

	protected TipoSangreBeanSwingJInternalFrame tiposangreBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiposangre="";
	
	public DatoGeneralEmpleadoSessionBean datogeneralempleadoSessionBean;
	
	
	
	
	public EmpleadoSessionBean empleadoSessionBean;
	public NumeroPatronalSessionBean numeropatronalSessionBean;
	public TipoAfiliacionSessionBean tipoafiliacionSessionBean;
	public PaisSessionBean paisSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;
	public CantonSessionBean cantonSessionBean;
	public ParroquiaSessionBean parroquiaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoContratoSessionBean tipocontratoSessionBean;
	public TipoLibretaMiliSessionBean tipolibretamiliSessionBean;
	public TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean;
	public BancoSessionBean bancoSessionBean;
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;
	public TipoSangreSessionBean tiposangreSessionBean;	
	
	public DatoGeneralEmpleadoLogic datogeneralempleadoLogic;
	
	public JScrollPane jScrollPanelDatosDatoGeneralEmpleado;
	public JScrollPane jScrollPanelDatosEdicionDatoGeneralEmpleado;
	public JScrollPane jScrollPanelDatosGeneralDatoGeneralEmpleado;
	
	protected JPanel jPanelCamposDatoGeneralEmpleado;    
	protected JPanel jPanelCamposOcultosDatoGeneralEmpleado;    	
	protected JPanel jPanelAccionesDatoGeneralEmpleado;
	protected JPanel jPanelAccionesFormularioDatoGeneralEmpleado;
    
	
	
	protected Integer iXPanelCamposDatoGeneralEmpleado=0;
	protected Integer iYPanelCamposDatoGeneralEmpleado=0;
	
	protected Integer iXPanelCamposOcultosDatoGeneralEmpleado=0;
	protected Integer iYPanelCamposOcultosDatoGeneralEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDatoGeneralEmpleado;
	public JButton jButtonModificarDatoGeneralEmpleado;
	public JButton jButtonActualizarDatoGeneralEmpleado;
    public JButton jButtonEliminarDatoGeneralEmpleado;
	public JButton jButtonCancelarDatoGeneralEmpleado;
    public JButton jButtonGuardarCambiosDatoGeneralEmpleado;
	public JButton jButtonGuardarCambiosTablaDatoGeneralEmpleado;
	protected JButton jButtonCerrarDatoGeneralEmpleado;
	
	
	protected JButton jButtonProcesarInformacionDatoGeneralEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDatoGeneralEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDatoGeneralEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDatoGeneralEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDatoGeneralEmpleado;
	protected JButton jButtonModificarToolBarDatoGeneralEmpleado;
	protected JButton jButtonActualizarToolBarDatoGeneralEmpleado;
    protected JButton jButtonEliminarToolBarDatoGeneralEmpleado;
	protected JButton jButtonCancelarToolBarDatoGeneralEmpleado;
    protected JButton jButtonGuardarCambiosToolBarDatoGeneralEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarDatoGeneralEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarDatoGeneralEmpleado;
	protected JButton jButtonCerrarToolBarDatoGeneralEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarDatoGeneralEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDatoGeneralEmpleado;
	protected JMenuItem jMenuItemModificarDatoGeneralEmpleado;
	protected JMenuItem jMenuItemActualizarDatoGeneralEmpleado;
    protected JMenuItem jMenuItemEliminarDatoGeneralEmpleado;
	protected JMenuItem jMenuItemCancelarDatoGeneralEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosDatoGeneralEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaDatoGeneralEmpleado;
	protected JMenuItem jMenuItemCerrarDatoGeneralEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarDatoGeneralEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarDatoGeneralEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionDatoGeneralEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDatoGeneralEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarDatoGeneralEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDatoGeneralEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDatoGeneralEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDatoGeneralEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelcarnet_iessDatoGeneralEmpleado;
	public JLabel jLabelcarnet_iessDatoGeneralEmpleado;
	public JTextField jTextFieldcarnet_iessDatoGeneralEmpleado;
	public JButton jButtoncarnet_iessDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelsectorial_iessDatoGeneralEmpleado;
	public JLabel jLabelsectorial_iessDatoGeneralEmpleado;
	public JTextField jTextFieldsectorial_iessDatoGeneralEmpleado;
	public JButton jButtonsectorial_iessDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_nacimientoDatoGeneralEmpleado;
	public JLabel jLabelfecha_nacimientoDatoGeneralEmpleado;
	//public JFormattedTextField jDateChooserfecha_nacimientoDatoGeneralEmpleado;

	public JDateChooser jDateChooserfecha_nacimientoDatoGeneralEmpleado;
	public JButton jButtonfecha_nacimientoDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_falleceDatoGeneralEmpleado;
	public JLabel jLabelfecha_falleceDatoGeneralEmpleado;
	//public JFormattedTextField jDateChooserfecha_falleceDatoGeneralEmpleado;

	public JDateChooser jDateChooserfecha_falleceDatoGeneralEmpleado;
	public JButton jButtonfecha_falleceDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_evaluacionDatoGeneralEmpleado;
	public JLabel jLabelvalor_evaluacionDatoGeneralEmpleado;
	public JTextField jTextFieldvalor_evaluacionDatoGeneralEmpleado;
	public JButton jButtonvalor_evaluacionDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_horasDatoGeneralEmpleado;
	public JLabel jLabelnumero_horasDatoGeneralEmpleado;
	public JTextField jTextFieldnumero_horasDatoGeneralEmpleado;
	public JButton jButtonnumero_horasDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_horaDatoGeneralEmpleado;
	public JLabel jLabelvalor_horaDatoGeneralEmpleado;
	public JTextField jTextFieldvalor_horaDatoGeneralEmpleado;
	public JButton jButtonvalor_horaDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelsalarioDatoGeneralEmpleado;
	public JLabel jLabelsalarioDatoGeneralEmpleado;
	public JTextField jTextFieldsalarioDatoGeneralEmpleado;
	public JButton jButtonsalarioDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_contratoDatoGeneralEmpleado;
	public JLabel jLabelnumero_contratoDatoGeneralEmpleado;
	public JTextField jTextFieldnumero_contratoDatoGeneralEmpleado;
	public JButton jButtonnumero_contratoDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor1DatoGeneralEmpleado;
	public JLabel jLabelvalor1DatoGeneralEmpleado;
	public JTextField jTextFieldvalor1DatoGeneralEmpleado;
	public JButton jButtonvalor1DatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor2DatoGeneralEmpleado;
	public JLabel jLabelvalor2DatoGeneralEmpleado;
	public JTextField jTextFieldvalor2DatoGeneralEmpleado;
	public JButton jButtonvalor2DatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor3DatoGeneralEmpleado;
	public JLabel jLabelvalor3DatoGeneralEmpleado;
	public JTextField jTextFieldvalor3DatoGeneralEmpleado;
	public JButton jButtonvalor3DatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor4DatoGeneralEmpleado;
	public JLabel jLabelvalor4DatoGeneralEmpleado;
	public JTextField jTextFieldvalor4DatoGeneralEmpleado;
	public JButton jButtonvalor4DatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor5DatoGeneralEmpleado;
	public JLabel jLabelvalor5DatoGeneralEmpleado;
	public JTextField jTextFieldvalor5DatoGeneralEmpleado;
	public JButton jButtonvalor5DatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelvalor6DatoGeneralEmpleado;
	public JLabel jLabelvalor6DatoGeneralEmpleado;
	public JTextField jTextFieldvalor6DatoGeneralEmpleado;
	public JButton jButtonvalor6DatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelcon_aporta_seguro_socialDatoGeneralEmpleado;
	public JLabel jLabelcon_aporta_seguro_socialDatoGeneralEmpleado;
	public JCheckBox jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado;
	public JButton jButtoncon_aporta_seguro_socialDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelcon_recibe_horas_extrasDatoGeneralEmpleado;
	public JLabel jLabelcon_recibe_horas_extrasDatoGeneralEmpleado;
	public JCheckBox jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado;
	public JButton jButtoncon_recibe_horas_extrasDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelcon_descuento_impuestosDatoGeneralEmpleado;
	public JLabel jLabelcon_descuento_impuestosDatoGeneralEmpleado;
	public JCheckBox jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado;
	public JButton jButtoncon_descuento_impuestosDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelpension_alimenticiaDatoGeneralEmpleado;
	public JLabel jLabelpension_alimenticiaDatoGeneralEmpleado;
	public JTextField jTextFieldpension_alimenticiaDatoGeneralEmpleado;
	public JButton jButtonpension_alimenticiaDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelcon_pago_por_horasDatoGeneralEmpleado;
	public JLabel jLabelcon_pago_por_horasDatoGeneralEmpleado;
	public JCheckBox jCheckBoxcon_pago_por_horasDatoGeneralEmpleado;
	public JButton jButtoncon_pago_por_horasDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelcon_anticipoDatoGeneralEmpleado;
	public JLabel jLabelcon_anticipoDatoGeneralEmpleado;
	public JCheckBox jCheckBoxcon_anticipoDatoGeneralEmpleado;
	public JButton jButtoncon_anticipoDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanellibreta_militarDatoGeneralEmpleado;
	public JLabel jLabellibreta_militarDatoGeneralEmpleado;
	public JTextField jTextFieldlibreta_militarDatoGeneralEmpleado;
	public JButton jButtonlibreta_militarDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaDatoGeneralEmpleado;
	public JLabel jLabelnumero_cuentaDatoGeneralEmpleado;
	public JTextField jTextFieldnumero_cuentaDatoGeneralEmpleado;
	public JButton jButtonnumero_cuentaDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoDatoGeneralEmpleado;
	public JLabel jLabelid_empleadoDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoDatoGeneralEmpleado;
	public JButton jButtonid_empleadoDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_empleadoDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_numero_patronalDatoGeneralEmpleado;
	public JLabel jLabelid_numero_patronalDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_numero_patronalDatoGeneralEmpleado;
	public JButton jButtonid_numero_patronalDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_numero_patronalDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_numero_patronalDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_afiliacionDatoGeneralEmpleado;
	public JLabel jLabelid_tipo_afiliacionDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_afiliacionDatoGeneralEmpleado;
	public JButton jButtonid_tipo_afiliacionDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_afiliacionDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_afiliacionDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_paisDatoGeneralEmpleado;
	public JLabel jLabelid_paisDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisDatoGeneralEmpleado;
	public JButton jButtonid_paisDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_paisDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_paisDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_provinciaDatoGeneralEmpleado;
	public JLabel jLabelid_provinciaDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaDatoGeneralEmpleado;
	public JButton jButtonid_provinciaDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_provinciaDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_provinciaDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_cantonDatoGeneralEmpleado;
	public JLabel jLabelid_cantonDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cantonDatoGeneralEmpleado;
	public JButton jButtonid_cantonDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_cantonDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_cantonDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_parroquiaDatoGeneralEmpleado;
	public JLabel jLabelid_parroquiaDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parroquiaDatoGeneralEmpleado;
	public JButton jButtonid_parroquiaDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_parroquiaDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_parroquiaDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaDatoGeneralEmpleado;
	public JLabel jLabelid_monedaDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaDatoGeneralEmpleado;
	public JButton jButtonid_monedaDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_monedaDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_monedaDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_contratoDatoGeneralEmpleado;
	public JLabel jLabelid_tipo_contratoDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_contratoDatoGeneralEmpleado;
	public JButton jButtonid_tipo_contratoDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_contratoDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_contratoDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_libreta_miliDatoGeneralEmpleado;
	public JLabel jLabelid_tipo_libreta_miliDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado;
	public JButton jButtonid_tipo_libreta_miliDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_libreta_miliDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_libreta_miliDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_grupo_forma_pagoDatoGeneralEmpleado;
	public JLabel jLabelid_tipo_grupo_forma_pagoDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado;
	public JButton jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_bancoDatoGeneralEmpleado;
	public JLabel jLabelid_bancoDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bancoDatoGeneralEmpleado;
	public JButton jButtonid_bancoDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_bancoDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_bancoDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cuenta_banco_globalDatoGeneralEmpleado;
	public JLabel jLabelid_tipo_cuenta_banco_globalDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado;
	public JButton jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_sangreDatoGeneralEmpleado;
	public JLabel jLabelid_tipo_sangreDatoGeneralEmpleado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_sangreDatoGeneralEmpleado;
	public JButton jButtonid_tipo_sangreDatoGeneralEmpleado= new JButtonMe();
	public JButton jButtonid_tipo_sangreDatoGeneralEmpleadoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_sangreDatoGeneralEmpleadoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDatoGeneralEmpleado;
	
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
	public int iHeightFormulario=1144;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DatoGeneralEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDatoGeneralEmpleado=new JPanel();
				this.jPanelAccionesFormularioDatoGeneralEmpleado=new JPanel();
				this.jmenuBarDetalleDatoGeneralEmpleado=new JMenuBar();
				this.jTtoolBarDetalleDatoGeneralEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DatoGeneralEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DatoGeneralEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DatoGeneralEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoGeneralEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DatoGeneralEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DatoGeneralEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DatoGeneralEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDatoGeneralEmpleado() {
		return this.jButtonActualizarToolBarDatoGeneralEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarDatoGeneralEmpleado() {
		return this.jButtonEliminarToolBarDatoGeneralEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarDatoGeneralEmpleado() {
		return this.jButtonCancelarToolBarDatoGeneralEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionDatoGeneralEmpleado() {
		return this.jButtonProcesarInformacionDatoGeneralEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDatoGeneralEmpleado)	{
		this.jButtonProcesarInformacionDatoGeneralEmpleado = jButtonProcesarInformacionDatoGeneralEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDatoGeneralEmpleado() {
		return this.jComboBoxTiposAccionesDatoGeneralEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDatoGeneralEmpleado(
			JComboBox jComboBoxTiposRelacionesDatoGeneralEmpleado) {
		this.jComboBoxTiposRelacionesDatoGeneralEmpleado = jComboBoxTiposRelacionesDatoGeneralEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDatoGeneralEmpleado(
			JComboBox jComboBoxTiposAccionesDatoGeneralEmpleado) {
		this.jComboBoxTiposAccionesDatoGeneralEmpleado = jComboBoxTiposAccionesDatoGeneralEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDatoGeneralEmpleado() {
		return this.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDatoGeneralEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioDatoGeneralEmpleado) {
		this.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado = jComboBoxTiposAccionesFormularioDatoGeneralEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		
		this.datogeneralempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.datogeneralempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DatoGeneralEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dato General Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 3850) {
			iWidth=3850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDatoGeneralEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDatoGeneralEmpleado=new JButtonMe();
				this.jButtonModificarToolBarDatoGeneralEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDatoGeneralEmpleado,this.jTtoolBarDetalleDatoGeneralEmpleado,
							"actualizar","actualizar","Actualizar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDatoGeneralEmpleado,this.jTtoolBarDetalleDatoGeneralEmpleado,
							"eliminar","eliminar","Eliminar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDatoGeneralEmpleado,this.jTtoolBarDetalleDatoGeneralEmpleado,
							"cancelar","cancelar","Cancelar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDatoGeneralEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDatoGeneralEmpleado,this.jTtoolBarDetalleDatoGeneralEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDatoGeneralEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDatoGeneralEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDatoGeneralEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDatoGeneralEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDatoGeneralEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDatoGeneralEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDatoGeneralEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDatoGeneralEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDatoGeneralEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDatoGeneralEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDatoGeneralEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDatoGeneralEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDatoGeneralEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDatoGeneralEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDatoGeneralEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDatoGeneralEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDatoGeneralEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDatoGeneralEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDatoGeneralEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDatoGeneralEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDatoGeneralEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDatoGeneralEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDatoGeneralEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDatoGeneralEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDatoGeneralEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDatoGeneralEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDatoGeneralEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDatoGeneralEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDatoGeneralEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDatoGeneralEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDatoGeneralEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDatoGeneralEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDatoGeneralEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDatoGeneralEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDatoGeneralEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDatoGeneralEmpleado.add(this.jMenuItemDetalleCerrarDatoGeneralEmpleado);
		
		this.jmenuDetalleAccionesDatoGeneralEmpleado.add(this.jMenuItemActualizarDatoGeneralEmpleado);
		this.jmenuDetalleAccionesDatoGeneralEmpleado.add(this.jMenuItemEliminarDatoGeneralEmpleado);
		this.jmenuDetalleAccionesDatoGeneralEmpleado.add(this.jMenuItemCancelarDatoGeneralEmpleado);		
		
		//this.jmenuDetalleDatosDatoGeneralEmpleado.add(this.jMenuItemDetalleAbrirOrderByDatoGeneralEmpleado);				
		this.jmenuDetalleDatosDatoGeneralEmpleado.add(this.jMenuItemDetalleMostarOcultarDatoGeneralEmpleado);				
				
		//this.jmenuDetalleAccionesDatoGeneralEmpleado.add(this.jMenuItemGuardarCambiosDatoGeneralEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDatoGeneralEmpleado.add(this.jmenuDetalleArchivoDatoGeneralEmpleado);		
		this.jmenuBarDetalleDatoGeneralEmpleado.add(this.jmenuDetalleAccionesDatoGeneralEmpleado);		
		this.jmenuBarDetalleDatoGeneralEmpleado.add(this.jmenuDetalleDatosDatoGeneralEmpleado);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDatoGeneralEmpleado);				
	}
	
	
	public void inicializarElementosCamposDatoGeneralEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelcarnet_iessDatoGeneralEmpleado = new JLabelMe();
		this.jLabelcarnet_iessDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_CARNETIESS+" : *");
		this.jLabelcarnet_iessDatoGeneralEmpleado.setToolTipText("Carnet Iess");
		this.jLabelcarnet_iessDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcarnet_iessDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcarnet_iessDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcarnet_iessDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcarnet_iessDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcarnet_iessDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_CARNETIESS);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelcarnet_iessDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldcarnet_iessDatoGeneralEmpleado= new JTextFieldMe();

		jTextFieldcarnet_iessDatoGeneralEmpleado.setEnabled(false);
		jTextFieldcarnet_iessDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcarnet_iessDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcarnet_iessDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcarnet_iessDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncarnet_iessDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtoncarnet_iessDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncarnet_iessDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncarnet_iessDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncarnet_iessDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtoncarnet_iessDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncarnet_iessDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncarnet_iessDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcarnet_iessDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcarnet_iessDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"carnet_iessDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncarnet_iessDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelsectorial_iessDatoGeneralEmpleado = new JLabelMe();
		this.jLabelsectorial_iessDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_SECTORIALIESS+" : *");
		this.jLabelsectorial_iessDatoGeneralEmpleado.setToolTipText("Sectorial Iess");
		this.jLabelsectorial_iessDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsectorial_iessDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsectorial_iessDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsectorial_iessDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsectorial_iessDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsectorial_iessDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_SECTORIALIESS);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelsectorial_iessDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldsectorial_iessDatoGeneralEmpleado= new JTextFieldMe();

		jTextFieldsectorial_iessDatoGeneralEmpleado.setEnabled(false);
		jTextFieldsectorial_iessDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsectorial_iessDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsectorial_iessDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsectorial_iessDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsectorial_iessDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonsectorial_iessDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsectorial_iessDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsectorial_iessDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsectorial_iessDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonsectorial_iessDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsectorial_iessDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsectorial_iessDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsectorial_iessDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsectorial_iessDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sectorial_iessDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsectorial_iessDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_nacimientoDatoGeneralEmpleado = new JLabelMe();
		this.jLabelfecha_nacimientoDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_FECHANACIMIENTO+" : *");
		this.jLabelfecha_nacimientoDatoGeneralEmpleado.setToolTipText("Fecha Nacimiento");
		this.jLabelfecha_nacimientoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_nacimientoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_nacimientoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_nacimientoDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_nacimientoDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_FECHANACIMIENTO);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelfecha_nacimientoDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		//jFormattedTextFieldfecha_nacimientoDatoGeneralEmpleado= new JFormattedTextFieldMe();

		jDateChooserfecha_nacimientoDatoGeneralEmpleado= new JDateChooser();
		jDateChooserfecha_nacimientoDatoGeneralEmpleado.setEnabled(false);
		jDateChooserfecha_nacimientoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_nacimientoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_nacimientoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_nacimientoDatoGeneralEmpleado.setDate(new Date());
		jDateChooserfecha_nacimientoDatoGeneralEmpleado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_nacimientoDatoGeneralEmpleado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_nacimientoDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonfecha_nacimientoDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_nacimientoDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_nacimientoDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonfecha_nacimientoDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_nacimientoDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_nacimientoDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_nacimientoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_nacimientoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_nacimientoDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_nacimientoDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_falleceDatoGeneralEmpleado = new JLabelMe();
		this.jLabelfecha_falleceDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_FECHAFALLECE+" : *");
		this.jLabelfecha_falleceDatoGeneralEmpleado.setToolTipText("Fecha Fallece");
		this.jLabelfecha_falleceDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_falleceDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_falleceDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_falleceDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_falleceDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_falleceDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_FECHAFALLECE);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelfecha_falleceDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		//jFormattedTextFieldfecha_falleceDatoGeneralEmpleado= new JFormattedTextFieldMe();

		jDateChooserfecha_falleceDatoGeneralEmpleado= new JDateChooser();
		jDateChooserfecha_falleceDatoGeneralEmpleado.setEnabled(false);
		jDateChooserfecha_falleceDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_falleceDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_falleceDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_falleceDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_falleceDatoGeneralEmpleado.setDate(new Date());
		jDateChooserfecha_falleceDatoGeneralEmpleado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_falleceDatoGeneralEmpleado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_falleceDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonfecha_falleceDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_falleceDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_falleceDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_falleceDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonfecha_falleceDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_falleceDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_falleceDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_falleceDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_falleceDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_falleceDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_falleceDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_evaluacionDatoGeneralEmpleado = new JLabelMe();
		this.jLabelvalor_evaluacionDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOREVALUACION+" : *");
		this.jLabelvalor_evaluacionDatoGeneralEmpleado.setToolTipText("Valor Evaluacion");
		this.jLabelvalor_evaluacionDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_evaluacionDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_evaluacionDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_evaluacionDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_evaluacionDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_evaluacionDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOREVALUACION);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelvalor_evaluacionDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldvalor_evaluacionDatoGeneralEmpleado= new JTextFieldMe();
		jTextFieldvalor_evaluacionDatoGeneralEmpleado.setEnabled(false);
		jTextFieldvalor_evaluacionDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_evaluacionDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_evaluacionDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_evaluacionDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_evaluacionDatoGeneralEmpleado.setText("0.0");

		this.jButtonvalor_evaluacionDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_evaluacionDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_evaluacionDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_evaluacionDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_evaluacionDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonvalor_evaluacionDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_evaluacionDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_evaluacionDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_evaluacionDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_evaluacionDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_evaluacionDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_evaluacionDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_horasDatoGeneralEmpleado = new JLabelMe();
		this.jLabelnumero_horasDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_NUMEROHORAS+" : *");
		this.jLabelnumero_horasDatoGeneralEmpleado.setToolTipText("Numero Horas");
		this.jLabelnumero_horasDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_horasDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_horasDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_horasDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_horasDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_horasDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_NUMEROHORAS);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelnumero_horasDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldnumero_horasDatoGeneralEmpleado= new JTextFieldMe();
		jTextFieldnumero_horasDatoGeneralEmpleado.setEnabled(false);
		jTextFieldnumero_horasDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_horasDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_horasDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_horasDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_horasDatoGeneralEmpleado.setText("0.0");

		this.jButtonnumero_horasDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonnumero_horasDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_horasDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_horasDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_horasDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonnumero_horasDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_horasDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_horasDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_horasDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_horasDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_horasDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_horasDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_horaDatoGeneralEmpleado = new JLabelMe();
		this.jLabelvalor_horaDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_VALORHORA+" : *");
		this.jLabelvalor_horaDatoGeneralEmpleado.setToolTipText("Valor Hora");
		this.jLabelvalor_horaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_horaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_horaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_horaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_horaDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_horaDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_VALORHORA);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelvalor_horaDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldvalor_horaDatoGeneralEmpleado= new JTextFieldMe();
		jTextFieldvalor_horaDatoGeneralEmpleado.setEnabled(false);
		jTextFieldvalor_horaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_horaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_horaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_horaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_horaDatoGeneralEmpleado.setText("0.0");

		this.jButtonvalor_horaDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor_horaDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_horaDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_horaDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_horaDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonvalor_horaDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_horaDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_horaDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_horaDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_horaDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_horaDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_horaDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelsalarioDatoGeneralEmpleado = new JLabelMe();
		this.jLabelsalarioDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_SALARIO+" : *");
		this.jLabelsalarioDatoGeneralEmpleado.setToolTipText("Salario");
		this.jLabelsalarioDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsalarioDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsalarioDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsalarioDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsalarioDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsalarioDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_SALARIO);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelsalarioDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldsalarioDatoGeneralEmpleado= new JTextFieldMe();
		jTextFieldsalarioDatoGeneralEmpleado.setEnabled(false);
		jTextFieldsalarioDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsalarioDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsalarioDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsalarioDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsalarioDatoGeneralEmpleado.setText("0.0");

		this.jButtonsalarioDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonsalarioDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsalarioDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsalarioDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsalarioDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonsalarioDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsalarioDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsalarioDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsalarioDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsalarioDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"salarioDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsalarioDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_contratoDatoGeneralEmpleado = new JLabelMe();
		this.jLabelnumero_contratoDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_NUMEROCONTRATO+" : *");
		this.jLabelnumero_contratoDatoGeneralEmpleado.setToolTipText("Numero Contrato");
		this.jLabelnumero_contratoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_contratoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_contratoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_contratoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_contratoDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_contratoDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_NUMEROCONTRATO);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelnumero_contratoDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldnumero_contratoDatoGeneralEmpleado= new JTextFieldMe();

		jTextFieldnumero_contratoDatoGeneralEmpleado.setEnabled(false);
		jTextFieldnumero_contratoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_contratoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_contratoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_contratoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_contratoDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonnumero_contratoDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_contratoDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_contratoDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_contratoDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonnumero_contratoDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_contratoDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_contratoDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_contratoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_contratoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_contratoDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_contratoDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor1DatoGeneralEmpleado = new JLabelMe();
		this.jLabelvalor1DatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR1+" : *");
		this.jLabelvalor1DatoGeneralEmpleado.setToolTipText("Valor1");
		this.jLabelvalor1DatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor1DatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor1DatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor1DatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor1DatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor1DatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR1);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelvalor1DatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldvalor1DatoGeneralEmpleado= new JTextFieldMe();
		jTextFieldvalor1DatoGeneralEmpleado.setEnabled(false);
		jTextFieldvalor1DatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor1DatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor1DatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor1DatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor1DatoGeneralEmpleado.setText("0.0");

		this.jButtonvalor1DatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor1DatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor1DatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor1DatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor1DatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonvalor1DatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor1DatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor1DatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor1DatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor1DatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor1DatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor1DatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor2DatoGeneralEmpleado = new JLabelMe();
		this.jLabelvalor2DatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR2+" : *");
		this.jLabelvalor2DatoGeneralEmpleado.setToolTipText("Valor2");
		this.jLabelvalor2DatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor2DatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor2DatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor2DatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor2DatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor2DatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR2);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelvalor2DatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldvalor2DatoGeneralEmpleado= new JTextFieldMe();
		jTextFieldvalor2DatoGeneralEmpleado.setEnabled(false);
		jTextFieldvalor2DatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor2DatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor2DatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor2DatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor2DatoGeneralEmpleado.setText("0.0");

		this.jButtonvalor2DatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor2DatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor2DatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor2DatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor2DatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonvalor2DatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor2DatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor2DatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor2DatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor2DatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor2DatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor2DatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor3DatoGeneralEmpleado = new JLabelMe();
		this.jLabelvalor3DatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR3+" : *");
		this.jLabelvalor3DatoGeneralEmpleado.setToolTipText("Valor3");
		this.jLabelvalor3DatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor3DatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor3DatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor3DatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor3DatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor3DatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR3);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelvalor3DatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldvalor3DatoGeneralEmpleado= new JTextFieldMe();
		jTextFieldvalor3DatoGeneralEmpleado.setEnabled(false);
		jTextFieldvalor3DatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor3DatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor3DatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor3DatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor3DatoGeneralEmpleado.setText("0.0");

		this.jButtonvalor3DatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor3DatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor3DatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor3DatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor3DatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonvalor3DatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor3DatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor3DatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor3DatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor3DatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor3DatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor3DatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor4DatoGeneralEmpleado = new JLabelMe();
		this.jLabelvalor4DatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR4+" : *");
		this.jLabelvalor4DatoGeneralEmpleado.setToolTipText("Valor4");
		this.jLabelvalor4DatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor4DatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor4DatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor4DatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor4DatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor4DatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR4);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelvalor4DatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldvalor4DatoGeneralEmpleado= new JTextFieldMe();
		jTextFieldvalor4DatoGeneralEmpleado.setEnabled(false);
		jTextFieldvalor4DatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor4DatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor4DatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor4DatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor4DatoGeneralEmpleado.setText("0.0");

		this.jButtonvalor4DatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor4DatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor4DatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor4DatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor4DatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonvalor4DatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor4DatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor4DatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor4DatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor4DatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor4DatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor4DatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor5DatoGeneralEmpleado = new JLabelMe();
		this.jLabelvalor5DatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR5+" : *");
		this.jLabelvalor5DatoGeneralEmpleado.setToolTipText("Valor5");
		this.jLabelvalor5DatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor5DatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor5DatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor5DatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor5DatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor5DatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR5);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelvalor5DatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldvalor5DatoGeneralEmpleado= new JTextFieldMe();
		jTextFieldvalor5DatoGeneralEmpleado.setEnabled(false);
		jTextFieldvalor5DatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor5DatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor5DatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor5DatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor5DatoGeneralEmpleado.setText("0.0");

		this.jButtonvalor5DatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor5DatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor5DatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor5DatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor5DatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonvalor5DatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor5DatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor5DatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor5DatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor5DatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor5DatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor5DatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelvalor6DatoGeneralEmpleado = new JLabelMe();
		this.jLabelvalor6DatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR6+" : *");
		this.jLabelvalor6DatoGeneralEmpleado.setToolTipText("Valor6");
		this.jLabelvalor6DatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor6DatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor6DatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor6DatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor6DatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor6DatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_VALOR6);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelvalor6DatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldvalor6DatoGeneralEmpleado= new JTextFieldMe();
		jTextFieldvalor6DatoGeneralEmpleado.setEnabled(false);
		jTextFieldvalor6DatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor6DatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor6DatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor6DatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor6DatoGeneralEmpleado.setText("0.0");

		this.jButtonvalor6DatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonvalor6DatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor6DatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor6DatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor6DatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonvalor6DatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor6DatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor6DatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor6DatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor6DatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor6DatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor6DatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelcon_aporta_seguro_socialDatoGeneralEmpleado = new JLabelMe();
		this.jLabelcon_aporta_seguro_socialDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_CONAPORTASEGUROSOCIAL+" : *");
		this.jLabelcon_aporta_seguro_socialDatoGeneralEmpleado.setToolTipText("Con Aporta Seguro Social");
		this.jLabelcon_aporta_seguro_socialDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_aporta_seguro_socialDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_aporta_seguro_socialDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_aporta_seguro_socialDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_aporta_seguro_socialDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_aporta_seguro_socialDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_CONAPORTASEGUROSOCIAL);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelcon_aporta_seguro_socialDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado= new JCheckBoxMe();
		jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado.setEnabled(false);

		jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_aporta_seguro_socialDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtoncon_aporta_seguro_socialDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_aporta_seguro_socialDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_aporta_seguro_socialDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_aporta_seguro_socialDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtoncon_aporta_seguro_socialDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_aporta_seguro_socialDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_aporta_seguro_socialDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_aporta_seguro_socialDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_aporta_seguro_socialDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelcon_recibe_horas_extrasDatoGeneralEmpleado = new JLabelMe();
		this.jLabelcon_recibe_horas_extrasDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_CONRECIBEHORASEXTRAS+" : *");
		this.jLabelcon_recibe_horas_extrasDatoGeneralEmpleado.setToolTipText("Con Recibe Horas Extras");
		this.jLabelcon_recibe_horas_extrasDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_recibe_horas_extrasDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_recibe_horas_extrasDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_recibe_horas_extrasDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_recibe_horas_extrasDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_recibe_horas_extrasDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_CONRECIBEHORASEXTRAS);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelcon_recibe_horas_extrasDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado= new JCheckBoxMe();
		jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado.setEnabled(false);

		jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_recibe_horas_extrasDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtoncon_recibe_horas_extrasDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_recibe_horas_extrasDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_recibe_horas_extrasDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_recibe_horas_extrasDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtoncon_recibe_horas_extrasDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_recibe_horas_extrasDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_recibe_horas_extrasDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_recibe_horas_extrasDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_recibe_horas_extrasDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelcon_descuento_impuestosDatoGeneralEmpleado = new JLabelMe();
		this.jLabelcon_descuento_impuestosDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_CONDESCUENTOIMPUESTOS+" : *");
		this.jLabelcon_descuento_impuestosDatoGeneralEmpleado.setToolTipText("Con Descuento Impuestos");
		this.jLabelcon_descuento_impuestosDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_descuento_impuestosDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_descuento_impuestosDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_descuento_impuestosDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_descuento_impuestosDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_descuento_impuestosDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_CONDESCUENTOIMPUESTOS);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelcon_descuento_impuestosDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado= new JCheckBoxMe();
		jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado.setEnabled(false);

		jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_descuento_impuestosDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtoncon_descuento_impuestosDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_descuento_impuestosDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_descuento_impuestosDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_descuento_impuestosDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtoncon_descuento_impuestosDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_descuento_impuestosDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_descuento_impuestosDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_descuento_impuestosDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_descuento_impuestosDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelpension_alimenticiaDatoGeneralEmpleado = new JLabelMe();
		this.jLabelpension_alimenticiaDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_PENSIONALIMENTICIA+" : *");
		this.jLabelpension_alimenticiaDatoGeneralEmpleado.setToolTipText("Pension Alimenticia");
		this.jLabelpension_alimenticiaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpension_alimenticiaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelpension_alimenticiaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelpension_alimenticiaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpension_alimenticiaDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpension_alimenticiaDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_PENSIONALIMENTICIA);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelpension_alimenticiaDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldpension_alimenticiaDatoGeneralEmpleado= new JTextFieldMe();
		jTextFieldpension_alimenticiaDatoGeneralEmpleado.setEnabled(false);
		jTextFieldpension_alimenticiaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpension_alimenticiaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpension_alimenticiaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpension_alimenticiaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpension_alimenticiaDatoGeneralEmpleado.setText("0.0");

		this.jButtonpension_alimenticiaDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonpension_alimenticiaDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpension_alimenticiaDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpension_alimenticiaDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpension_alimenticiaDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonpension_alimenticiaDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpension_alimenticiaDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpension_alimenticiaDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpension_alimenticiaDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpension_alimenticiaDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"pension_alimenticiaDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpension_alimenticiaDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelcon_pago_por_horasDatoGeneralEmpleado = new JLabelMe();
		this.jLabelcon_pago_por_horasDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_CONPAGOPORHORAS+" : *");
		this.jLabelcon_pago_por_horasDatoGeneralEmpleado.setToolTipText("Con Pago Por Horas");
		this.jLabelcon_pago_por_horasDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_pago_por_horasDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_pago_por_horasDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_pago_por_horasDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_pago_por_horasDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_pago_por_horasDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_CONPAGOPORHORAS);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelcon_pago_por_horasDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jCheckBoxcon_pago_por_horasDatoGeneralEmpleado= new JCheckBoxMe();
		jCheckBoxcon_pago_por_horasDatoGeneralEmpleado.setEnabled(false);

		jCheckBoxcon_pago_por_horasDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_pago_por_horasDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_pago_por_horasDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_pago_por_horasDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_pago_por_horasDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtoncon_pago_por_horasDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_pago_por_horasDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_pago_por_horasDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_pago_por_horasDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtoncon_pago_por_horasDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_pago_por_horasDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_pago_por_horasDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_pago_por_horasDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_pago_por_horasDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_pago_por_horasDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_pago_por_horasDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelcon_anticipoDatoGeneralEmpleado = new JLabelMe();
		this.jLabelcon_anticipoDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_CONANTICIPO+" : *");
		this.jLabelcon_anticipoDatoGeneralEmpleado.setToolTipText("Con Anticipo");
		this.jLabelcon_anticipoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_anticipoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_anticipoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_anticipoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_anticipoDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_anticipoDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_CONANTICIPO);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelcon_anticipoDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jCheckBoxcon_anticipoDatoGeneralEmpleado= new JCheckBoxMe();
		jCheckBoxcon_anticipoDatoGeneralEmpleado.setEnabled(false);

		jCheckBoxcon_anticipoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_anticipoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_anticipoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_anticipoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_anticipoDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtoncon_anticipoDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_anticipoDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_anticipoDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_anticipoDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtoncon_anticipoDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_anticipoDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_anticipoDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_anticipoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_anticipoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_anticipoDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_anticipoDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabellibreta_militarDatoGeneralEmpleado = new JLabelMe();
		this.jLabellibreta_militarDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_LIBRETAMILITAR+" : *");
		this.jLabellibreta_militarDatoGeneralEmpleado.setToolTipText("Libreta Militar");
		this.jLabellibreta_militarDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabellibreta_militarDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabellibreta_militarDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabellibreta_militarDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellibreta_militarDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellibreta_militarDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_LIBRETAMILITAR);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanellibreta_militarDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldlibreta_militarDatoGeneralEmpleado= new JTextFieldMe();

		jTextFieldlibreta_militarDatoGeneralEmpleado.setEnabled(false);
		jTextFieldlibreta_militarDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlibreta_militarDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlibreta_militarDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlibreta_militarDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlibreta_militarDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonlibreta_militarDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlibreta_militarDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlibreta_militarDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlibreta_militarDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonlibreta_militarDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlibreta_militarDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlibreta_militarDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlibreta_militarDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlibreta_militarDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"libreta_militarDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlibreta_militarDatoGeneralEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaDatoGeneralEmpleado = new JLabelMe();
		this.jLabelnumero_cuentaDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaDatoGeneralEmpleado.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelnumero_cuentaDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jTextFieldnumero_cuentaDatoGeneralEmpleado= new JTextFieldMe();

		jTextFieldnumero_cuentaDatoGeneralEmpleado.setEnabled(false);
		jTextFieldnumero_cuentaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonnumero_cuentaDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaDatoGeneralEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDatoGeneralEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empleadoDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_empleadoDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_ID+" : *");
		this.jLabelid_empleadoDatoGeneralEmpleado.setToolTipText("");
		this.jLabelid_empleadoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_empleadoDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_empleadoDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_empleadoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_empleadoDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_empleadoDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoDatoGeneralEmpleado"));

		this.jButtonid_empleadoDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_empleadoDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_empleadoDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_empleadoDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_empleadoDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_numero_patronalDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_numero_patronalDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDNUMEROPATRONAL+" : *");
		this.jLabelid_numero_patronalDatoGeneralEmpleado.setToolTipText("Numero Patronal");
		this.jLabelid_numero_patronalDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_numero_patronalDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_numero_patronalDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_numero_patronalDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_numero_patronalDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_numero_patronalDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDNUMEROPATRONAL);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_numero_patronalDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_numero_patronalDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_numero_patronalDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_numero_patronalDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_numero_patronalDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_numero_patronalDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_numero_patronalDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_numero_patronalDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_numero_patronalDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_numero_patronalDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_numero_patronalDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalDatoGeneralEmpleado"));

		this.jButtonid_numero_patronalDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_numero_patronalDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_numero_patronalDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_numero_patronalDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_numero_patronalDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_numero_patronalDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_numero_patronalDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_numero_patronalDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_numero_patronalDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_numero_patronalDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_numero_patronalDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_numero_patronalDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_numero_patronalDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_numero_patronalDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_numero_patronalDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_numero_patronalDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_numero_patronalDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_tipo_afiliacionDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_tipo_afiliacionDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOAFILIACION+" : *");
		this.jLabelid_tipo_afiliacionDatoGeneralEmpleado.setToolTipText("Tipo Afiliacion");
		this.jLabelid_tipo_afiliacionDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_afiliacionDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_afiliacionDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_afiliacionDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_afiliacionDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_afiliacionDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOAFILIACION);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_tipo_afiliacionDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_tipo_afiliacionDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_afiliacionDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_afiliacionDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_afiliacionDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_afiliacionDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_afiliacionDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_afiliacionDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_afiliacionDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_afiliacionDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_afiliacionDatoGeneralEmpleado"));

		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_afiliacionDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_afiliacionDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_afiliacionDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_afiliacionDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_afiliacionDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_afiliacionDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_afiliacionDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_paisDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_paisDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisDatoGeneralEmpleado.setToolTipText("Pais");
		this.jLabelid_paisDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_paisDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_paisDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_paisDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_paisDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_paisDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisDatoGeneralEmpleado"));

		this.jButtonid_paisDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_paisDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_paisDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_paisDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_paisDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_paisDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_provinciaDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_provinciaDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDPROVINCIA+" : *");
		this.jLabelid_provinciaDatoGeneralEmpleado.setToolTipText("Provincia");
		this.jLabelid_provinciaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_provinciaDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_provinciaDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDPROVINCIA);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_provinciaDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_provinciaDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_provinciaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_provinciaDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_provinciaDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_provinciaDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_provinciaDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_provinciaDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaDatoGeneralEmpleado"));

		this.jButtonid_provinciaDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_provinciaDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_provinciaDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_provinciaDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_provinciaDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_provinciaDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_provinciaDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_provinciaDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_provinciaDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_provinciaDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_provinciaDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_cantonDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_cantonDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDCANTON+" : *");
		this.jLabelid_cantonDatoGeneralEmpleado.setToolTipText("Canton");
		this.jLabelid_cantonDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cantonDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cantonDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cantonDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cantonDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cantonDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDCANTON);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_cantonDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_cantonDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_cantonDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cantonDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cantonDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_cantonDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cantonDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cantonDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cantonDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_cantonDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cantonDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cantonDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cantonDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cantonDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cantonDatoGeneralEmpleado"));

		this.jButtonid_cantonDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_cantonDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cantonDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_cantonDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cantonDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cantonDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cantonDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cantonDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cantonDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cantonDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_cantonDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_cantonDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cantonDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_cantonDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cantonDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cantonDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cantonDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cantonDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cantonDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_parroquiaDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_parroquiaDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDPARROQUIA+" : *");
		this.jLabelid_parroquiaDatoGeneralEmpleado.setToolTipText("Parroquia");
		this.jLabelid_parroquiaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_parroquiaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_parroquiaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_parroquiaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_parroquiaDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_parroquiaDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDPARROQUIA);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_parroquiaDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_parroquiaDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_parroquiaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parroquiaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parroquiaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parroquiaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_parroquiaDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_parroquiaDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parroquiaDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parroquiaDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parroquiaDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_parroquiaDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_parroquiaDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parroquiaDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_parroquiaDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parroquiaDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parroquiaDatoGeneralEmpleado"));

		this.jButtonid_parroquiaDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_parroquiaDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parroquiaDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parroquiaDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parroquiaDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_parroquiaDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_parroquiaDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parroquiaDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_parroquiaDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parroquiaDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parroquiaDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_parroquiaDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_parroquiaDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_parroquiaDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parroquiaDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parroquiaDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parroquiaDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_parroquiaDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_parroquiaDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parroquiaDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_parroquiaDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parroquiaDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parroquiaDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_monedaDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_monedaDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaDatoGeneralEmpleado.setToolTipText("Moneda");
		this.jLabelid_monedaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_monedaDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_monedaDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_monedaDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_monedaDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_monedaDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaDatoGeneralEmpleado"));

		this.jButtonid_monedaDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_monedaDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_monedaDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_monedaDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_monedaDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_monedaDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_tipo_contratoDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_tipo_contratoDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOCONTRATO+" : *");
		this.jLabelid_tipo_contratoDatoGeneralEmpleado.setToolTipText("Tipo Contrato");
		this.jLabelid_tipo_contratoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_contratoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_contratoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_contratoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_contratoDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_contratoDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOCONTRATO);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_tipo_contratoDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_tipo_contratoDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_contratoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_contratoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_contratoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_contratoDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_tipo_contratoDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_contratoDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_tipo_contratoDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_contratoDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_contratoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoDatoGeneralEmpleado"));

		this.jButtonid_tipo_contratoDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_contratoDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_contratoDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_contratoDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_contratoDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_contratoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_contratoDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_contratoDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_contratoDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_contratoDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_contratoDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_contratoDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_contratoDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_contratoDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_contratoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_contratoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_contratoDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_tipo_libreta_miliDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_tipo_libreta_miliDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOLIBRETAMILI+" : *");
		this.jLabelid_tipo_libreta_miliDatoGeneralEmpleado.setToolTipText("Tipo Libreta Mili");
		this.jLabelid_tipo_libreta_miliDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_libreta_miliDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_libreta_miliDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_libreta_miliDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_libreta_miliDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_libreta_miliDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOLIBRETAMILI);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_tipo_libreta_miliDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_libreta_miliDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_libreta_miliDatoGeneralEmpleado"));

		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_libreta_miliDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_libreta_miliDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_libreta_miliDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_tipo_grupo_forma_pagoDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO+" : *");
		this.jLabelid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setToolTipText("Tipo Grupo Forma Pago");
		this.jLabelid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_grupo_forma_pagoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_grupo_forma_pagoDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOGRUPOFORMAPAGO);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_forma_pagoDatoGeneralEmpleado"));

		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_forma_pagoDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_grupo_forma_pagoDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_bancoDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_bancoDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDBANCO+" : *");
		this.jLabelid_bancoDatoGeneralEmpleado.setToolTipText("Banco");
		this.jLabelid_bancoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bancoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bancoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bancoDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bancoDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDBANCO);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_bancoDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_bancoDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_bancoDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bancoDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bancoDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bancoDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_bancoDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bancoDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_bancoDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bancoDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bancoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoDatoGeneralEmpleado"));

		this.jButtonid_bancoDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_bancoDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_bancoDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bancoDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bancoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bancoDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_bancoDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_bancoDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bancoDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bancoDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_bancoDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bancoDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bancoDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bancoDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bancoDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bancoDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_tipo_cuenta_banco_globalDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL+" : *");
		this.jLabelid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setToolTipText("Tipo Cuenta Banco Global");
		this.jLabelid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_banco_globalDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cuenta_banco_globalDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalDatoGeneralEmpleado"));

		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalDatoGeneralEmpleadoUpdate"));



					
		this.jLabelid_tipo_sangreDatoGeneralEmpleado = new JLabelMe();
		this.jLabelid_tipo_sangreDatoGeneralEmpleado.setText(""+DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOSANGRE+" : *");
		this.jLabelid_tipo_sangreDatoGeneralEmpleado.setToolTipText("Tipo Sangre");
		this.jLabelid_tipo_sangreDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_sangreDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_sangreDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_sangreDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_sangreDatoGeneralEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_sangreDatoGeneralEmpleado.setToolTipText(DatoGeneralEmpleadoConstantesFunciones.LABEL_IDTIPOSANGRE);
		this.gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		this.jPanelid_tipo_sangreDatoGeneralEmpleado.setLayout(this.gridaBagLayoutDatoGeneralEmpleado);


		jComboBoxid_tipo_sangreDatoGeneralEmpleado= new JComboBoxMe();
		jComboBoxid_tipo_sangreDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_sangreDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_sangreDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_sangreDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_sangreDatoGeneralEmpleado= new JButtonMe();
		this.jButtonid_tipo_sangreDatoGeneralEmpleado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_sangreDatoGeneralEmpleado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_sangreDatoGeneralEmpleado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_sangreDatoGeneralEmpleado.setText("Buscar");
		this.jButtonid_tipo_sangreDatoGeneralEmpleado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_sangreDatoGeneralEmpleado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_sangreDatoGeneralEmpleado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_sangreDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_sangreDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_sangreDatoGeneralEmpleado"));

		this.jButtonid_tipo_sangreDatoGeneralEmpleadoBusqueda= new JButtonMe();
		this.jButtonid_tipo_sangreDatoGeneralEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_sangreDatoGeneralEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_sangreDatoGeneralEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_sangreDatoGeneralEmpleadoBusqueda.setText("U");
		this.jButtonid_tipo_sangreDatoGeneralEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_sangreDatoGeneralEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_sangreDatoGeneralEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_sangreDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_sangreDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_sangreDatoGeneralEmpleadoBusqueda"));

		if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_sangreDatoGeneralEmpleadoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_sangreDatoGeneralEmpleadoUpdate= new JButtonMe();
		this.jButtonid_tipo_sangreDatoGeneralEmpleadoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_sangreDatoGeneralEmpleadoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_sangreDatoGeneralEmpleadoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_sangreDatoGeneralEmpleadoUpdate.setText("U");
		this.jButtonid_tipo_sangreDatoGeneralEmpleadoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_sangreDatoGeneralEmpleadoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_sangreDatoGeneralEmpleadoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_sangreDatoGeneralEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_sangreDatoGeneralEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_sangreDatoGeneralEmpleadoUpdate"));



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
		//this.jInternalFrameDetalleDatoGeneralEmpleado = new DatoGeneralEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Dato General Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDatoGeneralEmpleado= new GridBagLayout();
		

		
		String sToolTipDatoGeneralEmpleado="";
		sToolTipDatoGeneralEmpleado=DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDatoGeneralEmpleado+="(Nomina.DatoGeneralEmpleado)";
		}
		
		if(!this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDatoGeneralEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDatoGeneralEmpleado = new JButtonMe();
		this.jButtonModificarDatoGeneralEmpleado = new JButtonMe();
        this.jButtonActualizarDatoGeneralEmpleado = new JButtonMe();
        this.jButtonEliminarDatoGeneralEmpleado = new JButtonMe();
        this.jButtonCancelarDatoGeneralEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosDatoGeneralEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaDatoGeneralEmpleado = new JButtonMe();
		this.jButtonCerrarDatoGeneralEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosDatoGeneralEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionDatoGeneralEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralDatoGeneralEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Dato General Empleado";
		
		if(!this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dato General Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosDatoGeneralEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDatoGeneralEmpleado.setName("jPanelCamposDatoGeneralEmpleado"); 

		this.jPanelCamposOcultosDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDatoGeneralEmpleado.setName("jPanelCamposOcultosDatoGeneralEmpleado"); 

        this.jPanelAccionesDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDatoGeneralEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesDatoGeneralEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDatoGeneralEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDatoGeneralEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDatoGeneralEmpleado.setText("Nuevo");
		this.jButtonModificarDatoGeneralEmpleado.setText("Editar");
        this.jButtonActualizarDatoGeneralEmpleado.setText("Actualizar");
        this.jButtonEliminarDatoGeneralEmpleado.setText("Eliminar");
        this.jButtonCancelarDatoGeneralEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosDatoGeneralEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaDatoGeneralEmpleado.setText("Guardar");
		this.jButtonCerrarDatoGeneralEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDatoGeneralEmpleado,"nuevo_button","Nuevo",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDatoGeneralEmpleado,"modificar_button","Editar",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDatoGeneralEmpleado,"actualizar_button","Actualizar",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDatoGeneralEmpleado,"eliminar_button","Eliminar",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDatoGeneralEmpleado,"cancelar_button","Cancelar",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDatoGeneralEmpleado,"guardarcambios_button","Guardar",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDatoGeneralEmpleado,"guardarcambiostabla_button","Guardar",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDatoGeneralEmpleado,"cerrar_button","Salir",this.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDatoGeneralEmpleado.setToolTipText("Nuevo"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDatoGeneralEmpleado.setToolTipText("Editar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDatoGeneralEmpleado.setToolTipText("Actualizar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDatoGeneralEmpleado.setToolTipText("Eliminar)"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDatoGeneralEmpleado.setToolTipText("Cancelar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDatoGeneralEmpleado.setToolTipText("Guardar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDatoGeneralEmpleado.setToolTipText("Guardar"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDatoGeneralEmpleado.setToolTipText("Salir"+" "+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDatoGeneralEmpleado";
		inputMap = this.jButtonNuevoDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDatoGeneralEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDatoGeneralEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDatoGeneralEmpleado";
		inputMap = this.jButtonActualizarDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDatoGeneralEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarDatoGeneralEmpleado";
		inputMap = this.jButtonEliminarDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDatoGeneralEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarDatoGeneralEmpleado";
		inputMap = this.jButtonCancelarDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDatoGeneralEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarDatoGeneralEmpleado";
		inputMap = this.jButtonCerrarDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDatoGeneralEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDatoGeneralEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaDatoGeneralEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDatoGeneralEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDatoGeneralEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDatoGeneralEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDatoGeneralEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDatoGeneralEmpleado.setToolTipText("Nuevo DatoGeneralEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDatoGeneralEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDatoGeneralEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDatoGeneralEmpleado.setToolTipText("Sin Cerrar Ventana DatoGeneralEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDatoGeneralEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDatoGeneralEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDatoGeneralEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDatoGeneralEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDatoGeneralEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesDatoGeneralEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDatoGeneralEmpleado = new JLabelMe();
		
		this.jLabelAccionesDatoGeneralEmpleado.setText("Acciones");		
		this.jLabelAccionesDatoGeneralEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoGeneralEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDatoGeneralEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDatoGeneralEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDatoGeneralEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDatoGeneralEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesDatoGeneralEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDatoGeneralEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDatoGeneralEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoGeneralEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDatoGeneralEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDatoGeneralEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDatoGeneralEmpleado = new GridBagLayout();
		
		this.jPanelCamposDatoGeneralEmpleado.setLayout(gridaBagLayoutCamposDatoGeneralEmpleado);
		this.jPanelCamposOcultosDatoGeneralEmpleado.setLayout(gridaBagLayoutCamposOcultosDatoGeneralEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoDatoGeneralEmpleado.add(jLabelid_empleadoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoDatoGeneralEmpleado.add(jButtonid_empleadoDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoDatoGeneralEmpleado.add(jButtonid_empleadoDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoDatoGeneralEmpleado.add(jComboBoxid_empleadoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_numero_patronalDatoGeneralEmpleado.add(jLabelid_numero_patronalDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_numero_patronalDatoGeneralEmpleado.add(jButtonid_numero_patronalDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_numero_patronalDatoGeneralEmpleado.add(jButtonid_numero_patronalDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_numero_patronalDatoGeneralEmpleado.add(jComboBoxid_numero_patronalDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_afiliacionDatoGeneralEmpleado.add(jLabelid_tipo_afiliacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_afiliacionDatoGeneralEmpleado.add(jButtonid_tipo_afiliacionDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_afiliacionDatoGeneralEmpleado.add(jButtonid_tipo_afiliacionDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_afiliacionDatoGeneralEmpleado.add(jComboBoxid_tipo_afiliacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcarnet_iessDatoGeneralEmpleado.add(jLabelcarnet_iessDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcarnet_iessDatoGeneralEmpleado.add(jButtoncarnet_iessDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcarnet_iessDatoGeneralEmpleado.add(jTextFieldcarnet_iessDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsectorial_iessDatoGeneralEmpleado.add(jLabelsectorial_iessDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelsectorial_iessDatoGeneralEmpleado.add(jButtonsectorial_iessDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsectorial_iessDatoGeneralEmpleado.add(jTextFieldsectorial_iessDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisDatoGeneralEmpleado.add(jLabelid_paisDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisDatoGeneralEmpleado.add(jButtonid_paisDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisDatoGeneralEmpleado.add(jButtonid_paisDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisDatoGeneralEmpleado.add(jComboBoxid_paisDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_provinciaDatoGeneralEmpleado.add(jLabelid_provinciaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaDatoGeneralEmpleado.add(jButtonid_provinciaDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaDatoGeneralEmpleado.add(jButtonid_provinciaDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_provinciaDatoGeneralEmpleado.add(jComboBoxid_provinciaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cantonDatoGeneralEmpleado.add(jLabelid_cantonDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cantonDatoGeneralEmpleado.add(jButtonid_cantonDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cantonDatoGeneralEmpleado.add(jButtonid_cantonDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cantonDatoGeneralEmpleado.add(jComboBoxid_cantonDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_parroquiaDatoGeneralEmpleado.add(jLabelid_parroquiaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parroquiaDatoGeneralEmpleado.add(jButtonid_parroquiaDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parroquiaDatoGeneralEmpleado.add(jButtonid_parroquiaDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_parroquiaDatoGeneralEmpleado.add(jComboBoxid_parroquiaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_nacimientoDatoGeneralEmpleado.add(jLabelfecha_nacimientoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_nacimientoDatoGeneralEmpleado.add(jButtonfecha_nacimientoDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_nacimientoDatoGeneralEmpleado.add(jDateChooserfecha_nacimientoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_falleceDatoGeneralEmpleado.add(jLabelfecha_falleceDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_falleceDatoGeneralEmpleado.add(jButtonfecha_falleceDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_falleceDatoGeneralEmpleado.add(jDateChooserfecha_falleceDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_evaluacionDatoGeneralEmpleado.add(jLabelvalor_evaluacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_evaluacionDatoGeneralEmpleado.add(jButtonvalor_evaluacionDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_evaluacionDatoGeneralEmpleado.add(jTextFieldvalor_evaluacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_horasDatoGeneralEmpleado.add(jLabelnumero_horasDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_horasDatoGeneralEmpleado.add(jButtonnumero_horasDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_horasDatoGeneralEmpleado.add(jTextFieldnumero_horasDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_horaDatoGeneralEmpleado.add(jLabelvalor_horaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_horaDatoGeneralEmpleado.add(jButtonvalor_horaDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_horaDatoGeneralEmpleado.add(jTextFieldvalor_horaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsalarioDatoGeneralEmpleado.add(jLabelsalarioDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelsalarioDatoGeneralEmpleado.add(jButtonsalarioDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsalarioDatoGeneralEmpleado.add(jTextFieldsalarioDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaDatoGeneralEmpleado.add(jLabelid_monedaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaDatoGeneralEmpleado.add(jButtonid_monedaDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaDatoGeneralEmpleado.add(jButtonid_monedaDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaDatoGeneralEmpleado.add(jComboBoxid_monedaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_contratoDatoGeneralEmpleado.add(jLabelnumero_contratoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_contratoDatoGeneralEmpleado.add(jButtonnumero_contratoDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_contratoDatoGeneralEmpleado.add(jTextFieldnumero_contratoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_contratoDatoGeneralEmpleado.add(jLabelid_tipo_contratoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_contratoDatoGeneralEmpleado.add(jButtonid_tipo_contratoDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_contratoDatoGeneralEmpleado.add(jButtonid_tipo_contratoDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_contratoDatoGeneralEmpleado.add(jComboBoxid_tipo_contratoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor1DatoGeneralEmpleado.add(jLabelvalor1DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor1DatoGeneralEmpleado.add(jButtonvalor1DatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor1DatoGeneralEmpleado.add(jTextFieldvalor1DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor2DatoGeneralEmpleado.add(jLabelvalor2DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor2DatoGeneralEmpleado.add(jButtonvalor2DatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor2DatoGeneralEmpleado.add(jTextFieldvalor2DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor3DatoGeneralEmpleado.add(jLabelvalor3DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor3DatoGeneralEmpleado.add(jButtonvalor3DatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor3DatoGeneralEmpleado.add(jTextFieldvalor3DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor4DatoGeneralEmpleado.add(jLabelvalor4DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor4DatoGeneralEmpleado.add(jButtonvalor4DatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor4DatoGeneralEmpleado.add(jTextFieldvalor4DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor5DatoGeneralEmpleado.add(jLabelvalor5DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor5DatoGeneralEmpleado.add(jButtonvalor5DatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor5DatoGeneralEmpleado.add(jTextFieldvalor5DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor6DatoGeneralEmpleado.add(jLabelvalor6DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor6DatoGeneralEmpleado.add(jButtonvalor6DatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor6DatoGeneralEmpleado.add(jTextFieldvalor6DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_aporta_seguro_socialDatoGeneralEmpleado.add(jLabelcon_aporta_seguro_socialDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_aporta_seguro_socialDatoGeneralEmpleado.add(jButtoncon_aporta_seguro_socialDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_aporta_seguro_socialDatoGeneralEmpleado.add(jCheckBoxcon_aporta_seguro_socialDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_recibe_horas_extrasDatoGeneralEmpleado.add(jLabelcon_recibe_horas_extrasDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_recibe_horas_extrasDatoGeneralEmpleado.add(jButtoncon_recibe_horas_extrasDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_recibe_horas_extrasDatoGeneralEmpleado.add(jCheckBoxcon_recibe_horas_extrasDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_descuento_impuestosDatoGeneralEmpleado.add(jLabelcon_descuento_impuestosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_descuento_impuestosDatoGeneralEmpleado.add(jButtoncon_descuento_impuestosDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_descuento_impuestosDatoGeneralEmpleado.add(jCheckBoxcon_descuento_impuestosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpension_alimenticiaDatoGeneralEmpleado.add(jLabelpension_alimenticiaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelpension_alimenticiaDatoGeneralEmpleado.add(jButtonpension_alimenticiaDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpension_alimenticiaDatoGeneralEmpleado.add(jTextFieldpension_alimenticiaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_pago_por_horasDatoGeneralEmpleado.add(jLabelcon_pago_por_horasDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_pago_por_horasDatoGeneralEmpleado.add(jButtoncon_pago_por_horasDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_pago_por_horasDatoGeneralEmpleado.add(jCheckBoxcon_pago_por_horasDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_anticipoDatoGeneralEmpleado.add(jLabelcon_anticipoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_anticipoDatoGeneralEmpleado.add(jButtoncon_anticipoDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_anticipoDatoGeneralEmpleado.add(jCheckBoxcon_anticipoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_libreta_miliDatoGeneralEmpleado.add(jLabelid_tipo_libreta_miliDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_libreta_miliDatoGeneralEmpleado.add(jButtonid_tipo_libreta_miliDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_libreta_miliDatoGeneralEmpleado.add(jButtonid_tipo_libreta_miliDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_libreta_miliDatoGeneralEmpleado.add(jComboBoxid_tipo_libreta_miliDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellibreta_militarDatoGeneralEmpleado.add(jLabellibreta_militarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanellibreta_militarDatoGeneralEmpleado.add(jButtonlibreta_militarDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellibreta_militarDatoGeneralEmpleado.add(jTextFieldlibreta_militarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_grupo_forma_pagoDatoGeneralEmpleado.add(jLabelid_tipo_grupo_forma_pagoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_forma_pagoDatoGeneralEmpleado.add(jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_grupo_forma_pagoDatoGeneralEmpleado.add(jButtonid_tipo_grupo_forma_pagoDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_grupo_forma_pagoDatoGeneralEmpleado.add(jComboBoxid_tipo_grupo_forma_pagoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bancoDatoGeneralEmpleado.add(jLabelid_bancoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoDatoGeneralEmpleado.add(jButtonid_bancoDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bancoDatoGeneralEmpleado.add(jButtonid_bancoDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bancoDatoGeneralEmpleado.add(jComboBoxid_bancoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cuenta_banco_globalDatoGeneralEmpleado.add(jLabelid_tipo_cuenta_banco_globalDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_banco_globalDatoGeneralEmpleado.add(jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_banco_globalDatoGeneralEmpleado.add(jButtonid_tipo_cuenta_banco_globalDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cuenta_banco_globalDatoGeneralEmpleado.add(jComboBoxid_tipo_cuenta_banco_globalDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaDatoGeneralEmpleado.add(jLabelnumero_cuentaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaDatoGeneralEmpleado.add(jButtonnumero_cuentaDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaDatoGeneralEmpleado.add(jTextFieldnumero_cuentaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_sangreDatoGeneralEmpleado.add(jLabelid_tipo_sangreDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 2;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_sangreDatoGeneralEmpleado.add(jButtonid_tipo_sangreDatoGeneralEmpleadoBusqueda, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 3;
		this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_sangreDatoGeneralEmpleado.add(jButtonid_tipo_sangreDatoGeneralEmpleadoUpdate, this.gridBagConstraintsDatoGeneralEmpleado);
	}

	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = 1;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_sangreDatoGeneralEmpleado.add(jComboBoxid_tipo_sangreDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_empleadoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_numero_patronalDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_tipo_afiliacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelcarnet_iessDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelsectorial_iessDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_paisDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_provinciaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_cantonDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_parroquiaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelfecha_nacimientoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelfecha_falleceDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelvalor_evaluacionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelnumero_horasDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelvalor_horaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelsalarioDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_monedaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelnumero_contratoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_tipo_contratoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelvalor1DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelvalor2DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelvalor3DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelvalor4DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelvalor5DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelvalor6DatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelcon_aporta_seguro_socialDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelcon_recibe_horas_extrasDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelcon_descuento_impuestosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelpension_alimenticiaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelcon_pago_por_horasDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelcon_anticipoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_tipo_libreta_miliDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanellibreta_militarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_tipo_grupo_forma_pagoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_bancoDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_tipo_cuenta_banco_globalDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelnumero_cuentaDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
	this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDatoGeneralEmpleado.gridy = iYPanelCamposDatoGeneralEmpleado;
	this.gridBagConstraintsDatoGeneralEmpleado.gridx = iXPanelCamposDatoGeneralEmpleado++;
	this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDatoGeneralEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDatoGeneralEmpleado.add(this.jPanelid_tipo_sangreDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);



	if(iXPanelCamposDatoGeneralEmpleado % 2==0) {
		iXPanelCamposDatoGeneralEmpleado=0;
		iYPanelCamposDatoGeneralEmpleado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesDatoGeneralEmpleado= new GridBagLayout();
		this.jPanelAccionesDatoGeneralEmpleado.setLayout(gridaBagLayoutAccionesDatoGeneralEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDatoGeneralEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioDatoGeneralEmpleado.setLayout(gridaBagLayoutAccionesFormularioDatoGeneralEmpleado);
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDatoGeneralEmpleado.add(this.jComboBoxTiposAccionesFormularioDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);

			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.datogeneralempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDatoGeneralEmpleado.add(this.jCheckBoxPostAccionSinCerrarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.datogeneralempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDatoGeneralEmpleado.add(this.jCheckBoxPostAccionSinMensajeDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesDatoGeneralEmpleado.add(this.jButtonModificarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);							

		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesDatoGeneralEmpleado.add(this.jButtonEliminarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
			
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesDatoGeneralEmpleado.add(this.jButtonActualizarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);


		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesDatoGeneralEmpleado.add(this.jButtonGuardarCambiosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);	
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = 0;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesDatoGeneralEmpleado.add(this.jButtonCancelarDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDatoGeneralEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDatoGeneralEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;		
			//this.gridBagConstraintsDatoGeneralEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDatoGeneralEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDatoGeneralEmpleado.gridx =0;
		this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDatoGeneralEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DatoGeneralEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDatoGeneralEmpleado = new DatoGeneralEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Dato General Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Dato General Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dato General Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DatoGeneralEmpleadoModel datogeneralempleadoModel=new DatoGeneralEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//DatoGeneralEmpleadoModel.DatoGeneralEmpleadoFocusTraversalPolicy datogeneralempleadoFocusTraversalPolicy = datogeneralempleadoModel.new DatoGeneralEmpleadoFocusTraversalPolicy(this);
			
			//datogeneralempleadoFocusTraversalPolicy.setdatogeneralempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(datogeneralempleadoModel);
			
			
			this.jContentPaneDetalleDatoGeneralEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDatoGeneralEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleDatoGeneralEmpleado.setLayout(gridaBagLayoutDetalleDatoGeneralEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDatoGeneralEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
				this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleDatoGeneralEmpleado.add(jTtoolBarDetalleDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionDatoGeneralEmpleado=   new JScrollPane(jContentPaneDetalleDatoGeneralEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDatoGeneralEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleDatoGeneralEmpleado.add(jPanelCamposDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);
			
			
			
			
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
						&& datogeneralempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.datogeneralempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDatoGeneralEmpleado= new GridBagConstraints();
						this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
						this.jContentPaneDetalleDatoGeneralEmpleado.add(this.jTabbedPaneRelacionesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDatoGeneralEmpleado.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDatoGeneralEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
					this.gridBagConstraintsDatoGeneralEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleDatoGeneralEmpleado.add(jPanelCamposOcultosDatoGeneralEmpleado, gridBagConstraintsDatoGeneralEmpleado);
				
					this.jPanelCamposOcultosDatoGeneralEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	        this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDatoGeneralEmpleado.add(this.jPanelAccionesFormularioDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);							
			
			
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleDatoGeneralEmpleado.add(this.jPanelAccionesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDatoGeneralEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDatoGeneralEmpleado=   new JScrollPane(this.jPanelCamposDatoGeneralEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDatoGeneralEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoGeneralEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDatoGeneralEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
			this.gridBagConstraintsDatoGeneralEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDatoGeneralEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDatoGeneralEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);			
			
			this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
			this.gridBagConstraintsDatoGeneralEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
			
			
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		
			
		this.gridBagConstraintsDatoGeneralEmpleado = new GridBagConstraints();
		this.gridBagConstraintsDatoGeneralEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDatoGeneralEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDatoGeneralEmpleado, this.gridBagConstraintsDatoGeneralEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDatoGeneralEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionDatoGeneralEmpleado;
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
